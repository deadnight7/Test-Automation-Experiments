package com.loginext.TestNGController;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

import javax.xml.stream.XMLInputFactory;

import org.codehaus.groovy.control.CompilerConfiguration;
import org.testng.ITestContext;
import org.testng.TestNG;
import org.testng.annotations.DataProvider;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlInclude;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;
import org.testng.xml.XmlSuite.ParallelMode;

import com.loginext.ExcelController.ReadExcel2;
import com.loginext.Executor.Configuration;

public class TestNGRunner 
{

	boolean parallelMode = true;
	int iNumberOfParallelBrowsers = 3;
	String strMailerList = "chirag.p@loginextsolutions.com";

	//Add parameters to filter tests in Jenkins
	String strJenkinsParam_TestCaseList = "TESTS:wikipediaTest";//orderUpdateBulk";//driverReportDownload";//driverReportDownload";//addDriverTest";//updateVehicle";//loginextPulicSignUp";//addVehicle";//"TESTS:ALL";

	//Add parameters to filter tests in Jenkins
	String strJenkinsParam_ExecutionBrowser = "Chrome";//Params - Chrome / Firefox
	
	public static void main (String args[]) 
	{

		System.out.println("Triggering tests from TestNGRunner...");
		TestNGRunner runner = new TestNGRunner();

		//ParallelMode Flag in args
		System.out.println("Runner Args Length : "+args.length);
		System.out.println("args : "+args);
		if (args.length >= 3)
		{

			//Check whether parallel mode is true
			if (args[0] != null && args[0].equalsIgnoreCase("Y")){
				runner.parallelMode = true;
			}

			//Check how many parallel bowser instances to trigger
			if (args[1] != null){
				try 
				{
					int p_NumberOfParallelBrowsers = Integer.parseInt(args[1]);
					runner.iNumberOfParallelBrowsers = p_NumberOfParallelBrowsers;	
				}
				catch (Exception e) 
				{
					System.err.println("Parallel Browser - Unknown number - Setting parallel browsers to 1");
					//e.printStackTrace();
				}
			}
			else {
				System.err.println("Parallel Browser Parameter not defined, Setting it to 1");
			}

			//Mailer List argument
			if (args[2] != null){
				try 
				{
					String p_MailerEmail = args[2];//Integer.parseInt(args[1]);
					runner.strMailerList = p_MailerEmail;	
				} 
				catch (Exception e) 
				{
					System.err.println("Parallel Browser - Unknown number - Setting parallel browsers to 1");
					//e.printStackTrace();
				}
			}
			else {
				System.err.println("Parallel Browser Parameter not defined, Setting it to 1");
			}

			//Check for Test Filter List param
			if (args[3] != null){
				try 
				{
					String p_TestFilterParam = args[3];//Integer.parseInt(args[1]);
					runner.strJenkinsParam_TestCaseList = p_TestFilterParam;	
					
				}
				catch (Exception e) 
				{
					System.err.println("Test Parameter List filter is not set, Executing All tests marked under 'Y' flag");
					runner.strJenkinsParam_TestCaseList = "TESTS:ALL";
					//e.printStackTrace();
				}
			}
			else {
				System.err.println("Test Parameter List filter is not set, Executing All tests marked under 'Y' flag");
				runner.strJenkinsParam_TestCaseList = "TESTS:ALL";
			}
			

			//Check for Test Filter List param
			if (args[4] != null){
				try 
				{
					String p_BrowserParam = args[4];//Integer.parseInt(args[1]);
					runner.strJenkinsParam_ExecutionBrowser = p_BrowserParam;	
				}
				catch (Exception e) 
				{
					System.err.println("Execution Browser is not set - Defaulting to Chrome");
					//e.printStackTrace();
				}
			}
			else {
				System.err.println("Execution Browser is not set - Defaulting to Chrome");
			}
			
		}
		
		System.out.println("parallelMode = "+runner.parallelMode);
		System.out.println("p_NumberOfParallelBrowsers: "+runner.iNumberOfParallelBrowsers);
		System.out.println("Sending mailer email " +runner.strMailerList);
		System.out.println("Jenkins Param Test Case List - " +runner.strJenkinsParam_TestCaseList);
		System.out.println("Execution Browser : " +runner.strJenkinsParam_ExecutionBrowser);

		//RestAssured Issue - SSL Shut down incorrectly - https://stackoverflow.com/questions/28908835/ssl-peer-shut-down-incorrectly-in-java
		System.setProperty("https.protocols", "TLSv1,TLSv1.1,TLSv1.2");
		
		//This Map can hold your testng Parameters sheet.
		LinkedHashMap <String, LinkedHashMap <String, String>> restDataMap = runner.readTestData();
		runner.executeTests(restDataMap);
		System.out.println();
	}

	/**
	 * Used for reading DataMap Sheet
	 * Will Return LinkedHashMap in Key Value Pairs from DataMap Sheet to all Testcases
	 * @return
	 */
	@DataProvider(name = "readTestMap", parallel = true)
	public static Object[][] readTestMapDataProvider  (ITestContext context, Method m) {

		String strSheetName = context.getCurrentXmlTest().getParameter("Datasheet");
		System.out.println("Setting Datasheet to :" +strSheetName);
		
		if (strSheetName == null){
			return null;
		}
		
		System.out.println("Reading testParams : "+"  "+strSheetName);//m.getName());//+context.getCurrentXmlTest().getParameters());//getName()+"; suiteParams : ");
		ReadExcel2 excel2 = new ReadExcel2();
		LinkedHashMap <String, String> testDataRecords = excel2.readTestDataMap(strSheetName);//"DataMap");
		//System.out.println(testDataRecords);
		Object o [][] = new Object[][] { new Object[] { new LinkedHashMap <String, String> (testDataRecords) } };
		return o;
	}



	/**
	 * Used for reading DataMap Sheet
	 * Will Return LinkedHashMap in Key Value Pairs from DataMap Sheet to all Testcases
	 * @return
	 */
	@DataProvider(name = "readTestMap_static", parallel = true)
	public static Object[][] readTestMapDataProvider_static () {
		System.out.println("Reading readTestMap...");
		ReadExcel2 excel2 = new ReadExcel2();
		LinkedHashMap <String, String> testDataRecords = excel2.readTestDataMap("DataMap");
		//System.out.println(testDataRecords);
		Object o [][] = new Object[][] { new Object[] { new LinkedHashMap <String, String> (testDataRecords) } };
		return o;
	}


	/**
	 * Used for reading DataMap Sheet
	 * Will Return LinkedHashMap in Key Value Pairs from DataMap Sheet to all Testcases
	 * @return
	 */
	@DataProvider(name = "readTestMap_FMLM", parallel = true)
	public static Object[][] readTestMapDataProvider_FMLM () {
		System.out.println("Reading readTestMap_FMLM...");
		ReadExcel2 excel2 = new ReadExcel2();
		LinkedHashMap <String, String> testDataRecords = excel2.readTestDataMap("DataMap_FMLM");
		//System.out.println(testDataRecords);
		Object o [][] = new Object[][] { new Object[] { new LinkedHashMap <String, String> (testDataRecords) } };
		return o;
	}


	/**
	 * Used for reading DataMap Sheet
	 * Will Return LinkedHashMap in Key Value Pairs from DataMap Sheet to all Testcases
	 * @return
	 */
	@DataProvider(name = "readTestMap_Wallet", parallel = true)
	public static Object[][] readTestMapDataProvider_Wallet () {
		System.out.println("Reading DataMap_Wallet...");
		ReadExcel2 excel2 = new ReadExcel2();
		LinkedHashMap <String, String> testDataRecords = excel2.readTestDataMap("DataMap_Wallet");
		//System.out.println(testDataRecords);
		Object o [][] = new Object[][] { new Object[] { new LinkedHashMap <String, String> (testDataRecords) } };
		return o;
	}


	/**
	 * Used for reading DataMap Sheet
	 * Will Return LinkedHashMap in Key Value Pairs from DataMap Sheet to all Testcases
	 * @return
	 */
	@DataProvider(name = "readTestMap_Wallet_Client", parallel = true)
	public static Object[][] readTestMapDataProvider_Wallet_Client () {
		System.out.println("Reading DataMap_Wallet_Client...");
		ReadExcel2 excel2 = new ReadExcel2();
		LinkedHashMap <String, String> testDataRecords = excel2.readTestDataMap("DataMap_Wallet_Client");
		//System.out.println(testDataRecords);
		Object o [][] = new Object[][] { new Object[] { new LinkedHashMap <String, String> (testDataRecords) } };
		return o;
	}

	/**
	 * Used for reading DataMap Sheet with multiple dataset
	 * Will Return LinkedHashMap in Key Value Pairs from DataMap Sheet to all Testcases
	 * @return
	 */
	@DataProvider(name = "readMultipleTestMap", parallel = true)
	public static Object[][] readMultipleTestMapDataProvider () {
		System.out.println("Reading multiple TestMap...");
		ReadExcel2 excel2 = new ReadExcel2();
		LinkedList <LinkedHashMap <String, String>> testDataRecords = excel2.readMultipleTestDataMap("DataMap");
		//System.out.println(testDataRecords);
		Object o [][] = new Object[][] { new Object[] { new LinkedList <LinkedHashMap <String, String>> (testDataRecords) } };
		return o;
	}


	/**
	 * Will Read TestData
	 * 
	 * @return
	 */
	//Reads TestData Sheet
	public LinkedHashMap<String, LinkedHashMap<String, String>> readTestData () {
		//System.out.println("Creating TestData...");
		ReadExcel2 excel2 = new ReadExcel2();
		LinkedHashMap <String, LinkedHashMap <String, String>> testDataRecords = 
				excel2.readTestData("TestData");

		//Object o [][] = new Object[][] { new Object[] { new LinkedHashMap <String, LinkedHashMap <String, String>> (testDataRecords) } };
		return testDataRecords;
	}


	public void executeTests_bup (
			LinkedHashMap <String, LinkedHashMap <String, String>> readDataMap){

		//Create an instance on TestNG
		TestNG myTestNG = new TestNG();

		//Create an instance of XML Suite and assign a name for it.
		XmlSuite mySuite = new XmlSuite();
		mySuite.setName("Loginext Test Suite");
		mySuite.setPreserveOrder("true");

		//Create an instance of XmlTest and assign a name for it.
		XmlTest myTest = new XmlTest(mySuite);
		myTest.setName("Loginext Tests");
		myTest.setPreserveOrder("true");

		ArrayList <String> totalIncludedMethods = new ArrayList<>();

		//Create a list which can contain the classes that you want to run.
		List<XmlClass> allTestClasses = new ArrayList<XmlClass> ();

		//LinkedHashMap <String, LinkedList <String>> testClasseAndsMethods = new LinkedHashMap <String, LinkedList <String>> ();//LinkedHashMap is completely unsorted and does not preserves the order in which they were added
		LinkedHashMap <String, LinkedList <String>> testClasseAndsMethods = new LinkedHashMap<>();// <String, LinkedList <String>> ();

		//Get the map of TestClasses and Associated Test Methods
		System.out.println("DataMap:"+readDataMap);

		Map<String, LinkedHashMap <String, String> > sortedDataMap = new TreeMap<>(readDataMap);
		for(String strTestID : sortedDataMap.keySet())
		{
			//Iterate over each testID...
			LinkedHashMap <String, String> testRow = readDataMap.get(strTestID);
			//System.out.println(testRow);
			String strTestClassName = testRow.get("TestClassName");
			String strTestMethodName = testRow.get("TestMethodName");

			//If Test Class Exists in LinkedHashMap - > Add the corresponding Method
			if (testClasseAndsMethods.containsKey(strTestClassName) == false)
			{
				System.out.println("Adding Test Class : "+strTestClassName+" with Method : "+strTestMethodName);
				LinkedList <String> testMethods = new LinkedList <String> ();
				testMethods.add(strTestMethodName);
				testClasseAndsMethods.put(strTestClassName, testMethods);
			}
			else
			{
				System.out.println("Adding Test Method : "+strTestMethodName+" to "+strTestClassName);
				LinkedList <String> testMethods = testClasseAndsMethods.get(strTestClassName);
				testMethods.add(strTestMethodName);
				testClasseAndsMethods.put(strTestClassName, testMethods);
			}
		}

		//System.out.println(testClasseAndsMethods);

		//Add TestClasses and Methods to TestNG XML Suite
		System.out.println("Total Classes and Methods "+testClasseAndsMethods);
		int i = 0;
		for(String strClass : testClasseAndsMethods.keySet()){
			XmlClass testClass = new XmlClass();
			testClass.setName(strClass);

			System.out.println("Class - "+strClass);
			LinkedList <String> allMethods = testClasseAndsMethods.get(strClass);
			System.out.println("Methods - " +allMethods);
			List<XmlInclude> includedMethods = new ArrayList<XmlInclude> ();
			for(String strMethodName : allMethods){

				XmlInclude includeMethod = new XmlInclude(strMethodName);

				includeMethod.addParameter("datamap", "123");

				includedMethods.add(includeMethod);
				totalIncludedMethods.add(strClass +"."+strMethodName);
			}
			testClass.setIncludedMethods(includedMethods);
			allTestClasses.add(testClass);
		}

		//Create a list of XmlTests and add the Xmltest you created earlier to it.
		List<XmlTest> myTests = new ArrayList<XmlTest>();
		myTest.setXmlClasses(allTestClasses);
		myTests.add(myTest);

		//***** For Parallel feature *****/
		if (parallelMode){
			mySuite.setParallel(ParallelMode.METHODS);
			mySuite.setThreadCount(iNumberOfParallelBrowsers);//3);//totalIncludedMethods.size());
		}

		//add the list of tests to your Suite.
		mySuite.setTests(myTests);

		//Add the suite to the list of suites.
		List<XmlSuite> mySuites = new ArrayList<XmlSuite>();
		mySuites.add(mySuite);

		//Set the list of Suites to the testNG object you created earlier.
		myTestNG.setXmlSuites(mySuites);
		myTestNG.setAnnotationTransformer(new SetTestListener());
		System.out.println(mySuite.toXml());

		//Creates a master report
		Reporter.createMasterReport();

		//Executes all methods
		myTestNG.run();

		//Zip and mail
		System.out.println("*** zip and mail.. ***");
		Reporter.closeMasterReport();
		Mailer.mail(strMailerList);//
	}


	public void executeTests (
			LinkedHashMap <String, LinkedHashMap <String, String>> readDataMap){

		//Create an instance on TestNG
		TestNG myTestNG = new TestNG();

		//Create an instance of XML Suite and assign a name for it.
		XmlSuite mySuite = new XmlSuite();
		mySuite.setName("Loginext Test Suite");
		mySuite.setPreserveOrder("true");

		//Get the map of TestClasses and Associated Test Methods
		System.out.println("DataMap:"+readDataMap);
		System.out.println("Filtering Tests strJenkinsParam_TestCaseList : "+strJenkinsParam_TestCaseList);
		
		boolean filterTests = true;
		
		//Do not filter tests if strJenkinsParam_TestCaseList is not set or has a value of ALL
		if (strJenkinsParam_TestCaseList == null 
				|| strJenkinsParam_TestCaseList.equals("TESTS:") //Test case List does not contains anything
				|| strJenkinsParam_TestCaseList.toUpperCase().startsWith("TESTS:ALL"))
		{
			System.out.println("Will not filter tests, Executing all testcases...");
			filterTests = false;
		}
		
		//Set Execution Browser to whatever was Passed in Browser Parameter
		if (strJenkinsParam_ExecutionBrowser != null 
				&& strJenkinsParam_ExecutionBrowser.toLowerCase().contains("chrome")){
			Configuration.getConfigurationInstance().setBrowser("Chrome");	
		}
		else if (strJenkinsParam_ExecutionBrowser != null 
				&& strJenkinsParam_ExecutionBrowser.toLowerCase().contains("firefox")){
			Configuration.getConfigurationInstance().setBrowser("Firefox");
		}
		else {
			//Defaulted to Chrome
			Configuration.getConfigurationInstance().setBrowser("Chrome");
		}

		
		Map<String, LinkedHashMap <String, String> > sortedDataMap = new TreeMap<>(readDataMap);
		for(String strTestID : sortedDataMap.keySet())
		{
			//Iterate over each testID...
			LinkedHashMap <String, String> testRow = readDataMap.get(strTestID);
			//System.out.println(testRow);
			String strTestClassName = testRow.get("TestClassName");
			String strTestMethodName = testRow.get("TestMethodName");
			String strDataSheetName = testRow.get("Datasheet");
			
			System.out.println("Current Test Method : "+strTestMethodName);
			if (filterTests == true)
			{
				//verify whether the current test method name is in the list of CSV Parameter list -
				boolean currentTestInFilterList = false;
				if (strTestMethodName != null && strJenkinsParam_TestCaseList.contains(strTestMethodName)){
					currentTestInFilterList = true;
				}
				
				//if No (Test does is not in filter list param) then continue on with next method else add the method to the test cases
				if (currentTestInFilterList == false)
				{
					System.out.println("Skip adding test in filter list...");
					continue;
				}//Else normal flow
				
			}
			System.out.println("Adding Test : "+strTestClassName+"."+strTestMethodName);
			
			//Create an instance of XmlTest and assign a name for it.
			XmlTest myTest = new XmlTest(mySuite);
			myTest.setName("Loginext Test - "+strTestClassName+"."+strTestMethodName+"."+getUniqueIntegerValue(5));
			myTest.setPreserveOrder("true");

			//Add Test to test suite
			//mySuite.addTest(myTest);

			//Add Classes Block
			XmlClass testClass = new XmlClass();
			testClass.setName(strTestClassName);

			//Add Method Block
			XmlInclude includeMethod = new XmlInclude(strTestMethodName);

			//Add IncludeMethods Block
			List<XmlInclude> includedMethods = new ArrayList<XmlInclude> ();

			//Add Parameter Block
			//includeMethod.addParameter("Datasheet", strDataSheetName);
			myTest.addParameter("Datasheet", strDataSheetName);
			
			//Add to methods Include Methods 
			includedMethods.add(includeMethod);

			//Add Included methods to XML Class
			testClass.setIncludedMethods(includedMethods);

			//Add XML Classes List
			List<XmlClass> allTestClasses = new ArrayList<XmlClass> ();

			//Add XML Class to XML Classes
			allTestClasses.add(testClass);

			//Add Classes to test
			myTest.setClasses(allTestClasses);

			//System.out.println("Row : "+mySuite.toXml());
		}

		//***** For Parallel feature *****/
		if (parallelMode){
			mySuite.setParallel(ParallelMode.TESTS);
			mySuite.setThreadCount(iNumberOfParallelBrowsers);//3);//totalIncludedMethods.size());
		}

		//Add the suite to the list of suites.
		List<XmlSuite> mySuites = new ArrayList<XmlSuite>();
		mySuites.add(mySuite);

		//Set the list of Suites to the testNG object you created earlier.
		myTestNG.setXmlSuites(mySuites);
		myTestNG.setAnnotationTransformer(new SetTestListener());
		System.out.println(mySuite.toXml());

		//Creates a master report
		Reporter.createMasterReport();

		//Executes all methods
		myTestNG.run();

		//Zip and mail
		System.out.println("*** zip and mail.. ***");
		Reporter.closeMasterReport();
		Mailer.mail(strMailerList);//
	}




	/**
	 * Used for reading DataMap Sheet
	 * Will Return LinkedHashMap in Key Value Pairs from DataMap Sheet to all Testcases
	 * @return
	 */
	@DataProvider(name = "param_data_provider", parallel = true)
	public static Object[][] param_data_provider (ITestContext context, Method m) {

		//.getLocalParameters();
		//Map<String, String> suiteParams=context.getName()//.getSuite().getParameters();
		String strSheetName = null;
		for (XmlClass test : context.getCurrentXmlTest().getXmlClasses()) {
			for (XmlInclude method : test.getIncludedMethods()) {
				if (method.getName().equals(m.getName())) {
					strSheetName = method.getAllParameters().get("Datasheet");
					System.out.println("param_data_provider : strSheetName:" +strSheetName);
					break;
					//return new Object[][] { { temp } };
				}
			}
			if (strSheetName != null){
				System.out.println("Found Sheet Name");
				break;
			}
		}

		if (strSheetName == null){
			return null;
		}

		System.out.println("Reading testParams : "+"  "+strSheetName);//m.getName());//+context.getCurrentXmlTest().getParameters());//getName()+"; suiteParams : ");
		ReadExcel2 excel2 = new ReadExcel2();
		LinkedHashMap <String, String> testDataRecords = excel2.readTestDataMap(strSheetName);//"DataMap");
		//System.out.println(testDataRecords);
		Object o [][] = new Object[][] { new Object[] { new LinkedHashMap <String, String> (testDataRecords) } };
		return o;
	}


	public static String getUniqueIntegerValue(int length)
	{
		// get current date time with Date() to create unique file name
		try
		{
			Thread.sleep(1);
		}
		catch (InterruptedException e)
		{
		}
		char[] chars = "1234567890".toCharArray();
		Random r = new Random(System.currentTimeMillis());
		char[] id = new char[length];
		for (int i = 0; i < length; i++)
		{
			id[i] = chars[r.nextInt(chars.length)];
		}
		return new String(id);
	}


	/**
	 * A Registry to hold all available data providers
	 */
	public static ArrayList <String> availableDataProviders = new ArrayList<>();

	/**
	 * Register your data provider before adding it in Excel
	 */
	public static void setAvailableDataProviders (){
		availableDataProviders.add("DataMap");
		availableDataProviders.add("DataMap_LM_DMart");
		availableDataProviders.add("DataMap_FMLM");
		availableDataProviders.add("DataMap_Wallet");
		availableDataProviders.add("DataMap_Wallet_Client");
	}

}
