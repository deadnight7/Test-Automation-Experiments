package com.loginext.Scenarios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import java.io.File;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.ws.LogicalMessage;

import org.apache.commons.io.IOUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;
import com.loginext.Executor.ApplicationUtility;
import com.loginext.TestNGController.Reporter;
import com.loginext.TestNGController.TestReporter;


import javax.xml.parsers.DocumentBuilderFactory;
import javax.print.Doc;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;

public class API {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		API api = new API();
		api.verifyAPI_Tests(null);
	}

	//Will Return command line output as string
	private String getInputAsString(InputStream is)
	{
		try(java.util.Scanner s = new java.util.Scanner(is)) 
		{
			return s.useDelimiter("\\A").hasNext() ? s.next() : ""; 
		}
	}

	boolean rc = false;
	@Test (dataProvider = "readTestMap" , dataProviderClass = com.loginext.TestNGController.TestNGRunner.class)
	public void verifyAPI_Tests (LinkedHashMap <String, String> row){

		try 
		{

			API api = new API();//
			String apiOutput = api.triggerNewmanTests();
			//"Reports/api_testExecutionRunJUnitXML_20180323180408.xml";/*
			System.out.println("output: "+apiOutput);
			if (apiOutput != null && apiOutput.contains("Report") == false){
				rc = false;
				Assert.assertTrue(false);
			}

			//Read File as String 
			System.out.println("Reading API Result Response");

			try {
				File inputFile = new File (apiOutput);//new File("Reports/api_testExecutionRunJUnitXML_20180323180408.xml"); //new File("Reports/api_testExecutionRunJUnitXML_20180323180408.xml"); //new File("Reports/input.xml");
				SAXParserFactory factory = SAXParserFactory.newInstance();
				SAXParser saxParser = factory.newSAXParser();
				//UserHandler userhandler = new UserHandler();
				JUnitXML_TestReader junitXML_TestReader = new JUnitXML_TestReader();
				saxParser.parse(inputFile, junitXML_TestReader);     
				LinkedHashMap<Integer, HashMap<String, String>> allAPITests = junitXML_TestReader.getAllTests();
				System.out.println("Total API Tests executed - allAPITests : "+allAPITests.size());
				
				if (allAPITests.size() == 0){
					System.out.println("No API Tests triggered...");
					Reporter.addTestDetailsToMasterReport("No API Tests triggered", 0, "Failed");
				}
				System.out.println(allAPITests.toString());
				for(int currentTestNumber : allAPITests.keySet()){
					HashMap <String, String> currentTest = allAPITests.get(currentTestNumber);
					System.out.println(currentTestNumber+") "+currentTest.get("TestName")+" || "+currentTest.get("Time")+"||"+currentTest.get("TestResult"));
					String strTestName = currentTest.get("TestName");
					String strTestResult = currentTest.get("TestResult");
					long timeDiffInMillis = 0;
					try 
					{
						String strCurrentTime = currentTest.get("Time");
						double d = Double.parseDouble(strCurrentTime);
						d = d * 1000;
						timeDiffInMillis = (long) d;
						//timeDiffInMillis = timeDiffInMillis;
					}
					catch (Exception e) 
					{
						e.printStackTrace();
						continue;
					}
					Reporter.addTestDetailsToMasterReport("API : "+strTestName, timeDiffInMillis, strTestResult);
				}
			
			} catch (Exception e) {
				e.printStackTrace();
			}
			/*
			File fXmlFile = new File(apiOutput);
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(fXmlFile);

			//optional, but recommended
			//read this - http://stackoverflow.com/questions/13786607/normalization-in-dom-parsing-with-java-how-does-it-work
			doc.getDocumentElement().normalize();
			System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
			NodeList nList = doc.getElementsByTagName("testsuite");
			System.out.println("----------------------------");
			for (int temp = 0; temp < nList.getLength(); temp++) {
				Node nNode = nList.item(temp);
				//System.out.println("\nCurrent Element :" + nNode.getNodeName());
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) nNode;

					System.out.println(eElement.getAttribute("name"));

					Node test =  eElement.getElementsByTagName("testcase").item(0);
					System.out.println(test);
				}
			}*/

		}
		catch (Exception e) 
		{
			//Log Message in Master Report
			e.printStackTrace();
		}



		//Reporter.addTestDetailsToMasterReport(strTestName, testReport);//Will log current test to master report and mail

		/**

		//Reporting
		String strTestName = "Verify Vehicle Searching";

		TestReporter testReport = new TestReporter();
		testReport.createTestReport(strTestName);
		ApplicationUtility applicationUtility = null;
		boolean rc = false;
		try 
		{
			applicationUtility = new ApplicationUtility(testReport);
			rc = applicationUtility.verifyVehicleSearching(row);
			Assert.assertTrue(rc);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			applicationUtility.logMessage("Verify Vehicle Searching Test", "Vehicle Searching test should be performed", "Unable to perform update Vehicle Searching test", "Failed");
		}
		finally
		{
			//Reporting Close
			testReport.closeCurrentTestReport();//Will close current test report
			Reporter.addTestDetailsToMasterReport(strTestName, testReport);//Will log current test to master report and mail
			applicationUtility.close(); //will close the session for WebDriver
		}**/
	}



	public String triggerNewmanTests () {

		try {


			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
			LocalDateTime now = LocalDateTime.now();
			//System.out.println(dtf.format(now)); //2016/11/16 12:08:43
			String strUniqueTimeStamp = dtf.format(now); 
			String strAPI_ReportOutputFile = "Reports/"+"api_testExecutionRunJUnitXML_"+strUniqueTimeStamp+".xml";
			System.out.println("strAPI_ReportOutputFile : "+strAPI_ReportOutputFile);

			//Process Commands
			List<String> commands = new ArrayList<String>();
			String strNewManExecutionCommand = "newman run Mile_Automation.postman_collection -e Demo.postman_environment.json --reporters junit  --reporter-junit-export "+strAPI_ReportOutputFile+";";
			System.out.println("Executing command :$"+strNewManExecutionCommand);

			commands.add("/bin/sh");
			commands.add("-c");
			commands.add("export PATH=" +
					//"" + "$PATH:/usr/local/bin:/usr/bin:/bin:/usr/sbin:/sbin:"  + " && exec;"
					""+ "$PATH:/usr/lib:/usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin:"+" && exec;"+
					//Start Newman Run
					//+" npm install -g newman;"
					" "+ strNewManExecutionCommand+
					" echo 'COMPLETED';"
					+ " echo $PATH;");

			// Ubuntu : /usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin:
			// MACOS : /usr/local/bin:/usr/bin:/bin:/usr/sbin:/sbin

			System.out.println("Started API Tests, Please wait while API execution completes..");
			ProcessBuilder pb = new ProcessBuilder(commands);
			Process p = pb.start();
			String stdOut = getInputAsString(p.getInputStream());
			String stdErr = getInputAsString(p.getErrorStream());
			System.out.println("API Process stdOut : "+stdOut);
			System.out.println("API Process stdErr : "+stdErr);
			return strAPI_ReportOutputFile;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}


}


class JUnitXML_TestReader extends DefaultHandler 
{

	
	int iTestNumber = 0;
	boolean hasFailureTag = false;
	
	public LinkedHashMap <Integer, HashMap <String, String>> allTests = new LinkedHashMap<>();
	public HashMap <String, String> currentTest = new LinkedHashMap<>();
	
	//API_Test currentTest;
	String strCurrentTestName = "";
	String strCurrentTestTime = "";
	String strCurrentTestResults = "";
	
	@Override
	public void startElement(
			String uri, String localName, String qName, Attributes attributes)
					throws SAXException {

		if (qName.equalsIgnoreCase("testsuite")) {
			String strTestName = attributes.getValue("name");
			String strTestTime = attributes.getValue("time");
			currentTest = new HashMap <String, String> ();
			currentTest.put("TestName", strTestName);
			currentTest.put("Time", strTestTime);//currentTest.strCurrentTestTime = strTestTime;
			System.out.println((++iTestNumber)+") Test : " + strTestName + " : Time Taken : "+strTestTime);
			allTests.put(iTestNumber, currentTest);
		} else if (qName.equalsIgnoreCase("testcase")) {
			String strTestResult = attributes.getValue("name");
			System.out.println("Status : " + strTestResult + "");
			
			//Add status to test
			if (strTestResult != null && strTestResult.equals("Pass")){
				currentTest.put("TestResult", "Passed");//currentTest.strCurrentTestResult = "Passed";	
			}
			else {
				currentTest.put("TestResult", "Failed");//currentTest.strCurrentTestResult = "Failed";	
			}
			allTests.put(iTestNumber, currentTest);
		} else if (qName.equalsIgnoreCase("failure")) {
			hasFailureTag = true;
			String strTestFailiureType = attributes.getValue("type");
			System.out.println("strTestFailiureType: "+strTestFailiureType);
			currentTest.put("TestResult", "Failed");//currentTest.strCurrentTestResult = "Failed";	
			allTests.put(iTestNumber, currentTest);
		} 
			
	}

	@Override
	public void endElement(String uri, 
			String localName, String qName) throws SAXException {
		/*
		if (qName.equalsIgnoreCase("testsuite")) {
			System.out.println("End Element :" + qName);
		}*/
	}

	@Override
	public void characters(char ch[], int start, int length) throws SAXException {

		if (hasFailureTag) {
			System.out.println("Test Failed ");//+ new String(ch, start, length));
			hasFailureTag = false;
		}
	}
	
	public LinkedHashMap<Integer, HashMap<String, String>> getAllTests ()
	{
		return allTests;
	}
	
}
/*
class API_Test {

	public String strCurrentTestName = "";
	public String strCurrentTestTime = "";
	public String strCurrentTestResult = "";
	
}
*/

/*
class UserHandler extends DefaultHandler {

	boolean bFirstName = false;
	boolean bLastName = false;
	boolean bNickName = false;
	boolean bMarks = false;

	@Override
	public void startElement(
			String uri, String localName, String qName, Attributes attributes)
					throws SAXException {

		if (qName.equalsIgnoreCase("student")) {
			String rollNo = attributes.getValue("rollno");
			System.out.println("Roll No : " + rollNo);
		} else if (qName.equalsIgnoreCase("firstname")) {
			bFirstName = true;
		} else if (qName.equalsIgnoreCase("lastname")) {
			bLastName = true;
		} else if (qName.equalsIgnoreCase("nickname")) {
			bNickName = true;
		}
		else if (qName.equalsIgnoreCase("marks")) {
			bMarks = true;
		}
	}

	@Override
	public void endElement(String uri, 
			String localName, String qName) throws SAXException {

		if (qName.equalsIgnoreCase("student")) {
			System.out.println("End Element :" + qName);
		}
	}

	@Override
	public void characters(char ch[], int start, int length) throws SAXException {

		if (bFirstName) {
			System.out.println("First Name: " + new String(ch, start, length));
			bFirstName = false;
		} else if (bLastName) {
			System.out.println("Last Name: " + new String(ch, start, length));
			bLastName = false;
		} else if (bNickName) {
			System.out.println("Nick Name: " + new String(ch, start, length));
			bNickName = false;
		} else if (bMarks) {
			System.out.println("Marks: " + new String(ch, start, length));
			bMarks = false;
		}
	}
}*/
