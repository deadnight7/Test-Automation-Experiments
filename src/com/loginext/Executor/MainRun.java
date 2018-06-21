package com.loginext.Executor;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

import org.omg.CORBA.NVList;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlInclude;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

import com.loginext.ExcelController.ReadExcel2;

public class MainRun {

	@DataProvider(name = "excelreader", parallel = true)
	public Object[][] createData () {
		System.out.println("Creating testData...");
		ReadExcel2 excel2 = new ReadExcel2();
		LinkedHashMap <String, LinkedHashMap <String, String>>  testDataRecords = excel2.readTestData("TestData");
		Object o [][] = new Object[][] { new Object[] { new HashMap <String, HashMap <String, String>> (testDataRecords) } };
		return o;
	}

	@Test(dataProvider = "excelreader")
	public void driverScript (HashMap <String, HashMap <String, String>> testDataRecords) {
		
		System.out.println("Inside driverScript...");
		WebDriver driver = null;
		
		try {
			System.out.println(testDataRecords);

			//Will Iterate over all recordset present in testdata sheet
			for(String testtRecordId : testDataRecords.keySet()){
				HashMap <String, String> row = testDataRecords.get(testtRecordId);
				String strTestClass = null;
				String strTestMethod = null;
				
				if (row.containsKey("ExecutionFlag") == false)
				{
					//If Execution Flag is not present in TestRow - move to next test
					continue;
				}
				
				
				if (row.containsKey("TestClassName") && row.containsKey("TestMethodName")){
					strTestClass = row.get("TestClassName");
					strTestMethod = row.get("TestMethodName");
					if (strTestClass.equals("") || strTestMethod.equals("")){
						System.err.println("Test Class and Test Method not specified for TestID : "+row.get("TestID")+"...");
						continue;
					}
				}
				else {
					System.out.println("Test Class and Test Method not specified...");
					continue;
				}

				
				/*
				System.out.println("TestClass "+strTestClass);
				System.out.println("TestMethodName "+strTestMethod);
				*/
				try {
					Class<?> c = Class.forName(strTestClass);
					Object o = c.newInstance();
					Method testMethod = null;
					Method [] allMethods = o.getClass().getMethods();
					for (int i = 0; i < allMethods.length; i++) {
						String strCurrentMethodName = allMethods[i].getName();
						if (strTestMethod.equals(strCurrentMethodName));
						{
							testMethod = allMethods[i];
							break;
						}
					}
					if (row.get("ExecutionFlag").equalsIgnoreCase("Y"))
					{
						System.out.println("Invoking Test : "+strTestClass+"."+strTestMethod);
						testMethod.invoke(o, row);
					}
					else
					{
						System.out.println("Skip Test...");
						continue;
					}
				} catch (Exception e) {
					//e.printStackTrace();
					System.err.println("Error invoking Test "+strTestClass+"."+strTestMethod + " "+e.getLocalizedMessage());
				}
				Assert.assertTrue(true);
			}


			
//
//			for (int i = 0; i < testData.size(); i++) {
//				HashMap<String, String> testDataRow = testData.get(i);
//				System.out.println("testDataRow :"+testDataRow);
//				driver = Configuration.getWebDriverInstance();
//				ApplicationUtility applicationUtility = new ApplicationUtility(driver);
//				applicationUtility.launchApplication(testDataRow, driver);
//				Assert.assertTrue(true);
//			}/*
			/*XmlTest test = new XmlTest(suite);
			test.setName("Tests");

			XmlSuite suite = new XmlSuite();
			suite.setName("TestSuite");
			
			suite.setParallel(XmlSuite.ParallelMode.TESTS);
			suite.setThreadCount(4);
			
			XmlClass testClass = new XmlClass("test.failures.Child");
			classes.add(testClass);
			test.setXmlClasses(classes) ;
			HashMap<String, String> allValues = new HashMap<>();
			List <XmlClass> classes = new ArrayList<XmlClass>();

			XmlTest test = new XmlTest(suite);
			test.setName("Tests");
			*/
			

		} catch (Exception e) {
			e.printStackTrace();
			//CaptureScreenShot screenShot = new CaptureScreenShot(driver);				
			//screenShot.captureScreenshot("MISReport");
			Assert.fail("Please refer the screenshot for reference",e);
		} finally {
			if (driver != null) {
				driver.quit();

			}

		}

	}

	public static void main(String str[]) throws Exception{

		Class<?> c = Class.forName("com.loginext.Scenarios.LogiNextMileObjects");
		String strTestMethod = "addDeliveryBoy";
		Object o = c.newInstance();
		Method testMethod = null;
		Method [] allMethods = o.getClass().getMethods();
		for (int i = 0; i < allMethods.length; i++) {
			String strCurrentMethodName = allMethods[i].getName();
			
			if (strTestMethod.equals(strCurrentMethodName));
			{
				testMethod = allMethods[i];
				break;
			}
		}
		System.out.println(testMethod.getName());
		
	}


}
