package com.loginext.Scenarios;

import java.util.Iterator;
import java.util.LinkedHashMap;

import javax.xml.ws.LogicalMessage;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.loginext.Executor.ApplicationUtility;
import com.loginext.TestNGController.Reporter;
import com.loginext.TestNGController.TestReporter;

public class MobileTest {

	@Test (dataProvider = "readTestMap" , dataProviderClass = com.loginext.TestNGController.TestNGRunner.class)
	public void wikipediaTest (LinkedHashMap <String, String> row)
	{

		//Reporting
		String strTestName = "Verify Wikipedia Test";

		TestReporter testReport = new TestReporter();
		testReport.createTestReport(strTestName);
		ApplicationUtility applicationUtility = null;
		boolean rc = false;
		try 
		{
			applicationUtility = new ApplicationUtility(testReport, false);
			rc = applicationUtility.wikipediaTest(row);//addDeliveryBoy(row);
			Assert.assertNotNull(rc);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			applicationUtility.logMessage("Verify "+strTestName, strTestName+" should be verified", "Unable to verify test "+strTestName, "Failed");
		}
		finally
		{
			//Reporting Close
			testReport.closeCurrentTestReport();//Will close current test report
			Reporter.addTestDetailsToMasterReport(strTestName, testReport);//Will log current test to master report and mail
			//applicationUtility.close(); //will close the session for WebDriver
		}
	}

	public static void main (String str [])
	{
		System.out.println(System.getenv("HOME") + "/Downloads");
	}
}
