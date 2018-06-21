package com.loginext.TestNGController;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.loginext.Executor.ApplicationUtility;

public class TestReporter {

	/**********For Each detailed Test report *********/

	public int iTestStepNumber = 0;
	public int iTotalTestStepsPassed = 0;
	public int iTotalTestStepsFailed = 0;
	public String strCurrentTestReportLink = "";// TestReport1333323/Scenario.methodName_TestCaseName.html
	public long iCurrentReportStartTime = 0;
	public long iCurrentReportEndTime = 0;

	public String createTestReport (String strTestName){

		try {

			//Reset Timings for next test case
			iCurrentReportEndTime = 0; 
			iCurrentReportStartTime = 0;

			//Reset Step Numbers for new report
			iTestStepNumber = 0;
			iTotalTestStepsPassed = 0;
			iTotalTestStepsFailed = 0;

			iCurrentReportStartTime = System.currentTimeMillis();

			if (strTestName != null && strTestName.contains("/")){
				strTestName = strTestName.replaceAll("/", " ");
			}
			
			//Get the Caller class name. Eg : com.loginext.Scenarios.Vehicle
			String callerClassName = new Exception().getStackTrace()[1].getClassName();
			//String strDisplayCallerClassName = callerClassName.replaceAll("com.loginext.Scenarios.", "");

			//Get Caller Class Method
			String callerClassMethod = new Exception().getStackTrace()[1].getMethodName();
			System.out.println("Executing Test - "+callerClassName+"."+callerClassMethod);
			
			//showPopup(strTestName);
			/*
			JOptionPane msg = new JOptionPane("Executing Test - "+strTestName, JOptionPane.INFORMATION_MESSAGE);
			final JDialog dlg = msg.createDialog("Executing Test");
			dlg.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			new Thread(new Runnable() {
				@Override
				public void run() {
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					dlg.setVisible(false);
					dlg.dispose();
				}
			}).start();
			dlg.setVisible(true);*/

			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");
			LocalDateTime now = LocalDateTime.now();
			//System.out.println(dtf.format(now)); //2016/11/16 12:08:43
			
			//Create a new file inside temp dir
			String strTmpDir = Reporter.strR_CurrentReportsDir;
			strCurrentTestReportLink = callerClassName + callerClassMethod + "_"+ strTestName +"_"+System.currentTimeMillis()+ ".html";
			String strTestReportHTML = strTmpDir + File.separator + strCurrentTestReportLink;
			File fTestReport = new File(strTestReportHTML);
			if (fTestReport.exists() == false){
				fTestReport.createNewFile();
			}

			String testReportTemplate = "<!doctype html> "
					+ " <html lang='en'> "
					+ " <head> "
					+ " <meta charset='utf-8'> "
					+ " <meta name='viewport'"
					+ "	content='width=device-width, initial-scale=1, shrink-to-fit=no'> "
					+ " <link rel='stylesheet' "
					+ " href='https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css' "
					+ "	integrity='sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm' "
					+ "crossorigin='anonymous' /> "
					+ " <script type='text/javascript'"
					+ " 	src='https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.7.1/Chart.bundle.min.js'>"
					+ "	"
					+ "</script> "
					+ " <link rel='icon' "
					+ "	href='https://products.loginextsolutions.com/product/images/favicon.ico'> "
					+ " <style> "
					+ ".header {"
					+ "	padding: 17px; "
					+ "} "
					+ ".wrap { "
					+ "   white-space: pre-wrap;      /* CSS3 */   "
					+ "   white-space: -moz-pre-wrap; /* Firefox */    "
					+ "   white-space: -pre-wrap;     /* Opera <7 */   "
					+ "   white-space: -o-pre-wrap;   /* Opera 7 */    "
					+ "   word-wrap: break-word;      /* IE */"
					+ "}"
					+ ""
					+ ".footer {"
					+ "	position: absolute;"
					+ "	bottom: 0;"
					+ "	width: 100%;"
					+ "	background-color: #f5f5f5;"
					+ "}"
					+ ".executionDetails {"
					+ "	bottom: 0; "
					+ " }"
					+ " .executionDetailsTable {"
					+ "	margin-top: 48px;"
					+ " }"
					+ " .testHeader {"
					+ " 	background: linear-gradient(45deg, #083100 0%, #336d61 100%); "
					+ " box-shadow: 0px 8px 31px 0px #0e0b0b96 inset; "
					+ "padding-top: 62px;"
					+ "	padding-bottom: 40px;"
					+ "	color: #ececec;"
					+ "	text-shadow: 1px 1px 1px #000; "
					+ " } "
					+ " </style> "
					+ " <title>Test Execution Report</title> "
					+ " </head"
					+ " <body>"
					+ "	<div "
					+ "		style='-webkit-box-shadow: 0 2px 4px rgba(0, 0, 0, .13); -moz-box-shadow: 0 2px 4px rgba(0, 0, 0, .13); -o-box-shadow: 0 2px 4px rgba(0, 0, 0, .13); -ms-box-shadow: 0 2px 4px rgba(0, 0, 0, .13); box-shadow: 0 2px 4px rgba(0, 0, 0, .13); padding-top: 19px; padding-bottom: 15px;'>"
					+ "		<div class='container'>"
					+ "	<div class='row'> "
					+ " <div class='col-3'> "
					+ " <img src='https://www.loginextsolutions.com/images/logo.png'"
					+ "						alt='loginext'>"
					+ "			</div>"
					+ "				<div class='col-9 text-center' style='margin-top: 10px'>					<h3>Test Automation Execution Report</h3>"
					+ "				</div>"
					+ "			</div>"
					+ "		</div>"
					+ "	</div><div class='testHeader'>"
					+ "		<div class='container'>"
					+ "			<div class='row'>"
					+ "				<div class='col-12'>"
					+ "					<h3><strong>Test Name - </strong>"+strTestName+"</h3>"
					+ "					<br/>"
					+ "				</div>"
					+ "			</div>"
					+ "		</div>"
					+ "	</div>"
					+ "	<div class='container'>"
					+ "		<div class='row'>"
					+ "			<div class='col-12'>"
					+ "					<br/><h5>Test Started on : "+dtf.format(now)+"</h5>"
					+ "			</div>"
					+ "</div>"
					+ "		<div class='row'>"
					+ "			<div class='table'>"
					+ "				<table class='table table-bordered'>"
					+ "					<thead class='thead-dark'>"
					+ "						<tr>"
					+ "							<th class='text-center'>Step#</th>"
					+ "							<th class='' >Test step name</th>"
					+ "							<th class='text-center' >Expected</th>"
					+ "							<th class='text-center' >Actual</th>"
					+ "							<th class='text-center'  width='10%'>Status</th>"
					+ "						</tr>"
					+ "					</thead>"
					+ "					<tbody>";

			//Put initial text 			
			FileWriter writer = new FileWriter(fTestReport, true);
			writer.write(testReportTemplate);
			writer.close();
			return strCurrentTestReportLink;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	static  void modifyFile(String filePath, String oldString, String newString)
    {
        File fileToBeModified = new File(filePath);
         
        String oldContent = "";
         
        BufferedReader reader = null;
         
        FileWriter writer = null;
         
        try
        {
            reader = new BufferedReader(new FileReader(fileToBeModified));
             
            //Reading all the lines of input text file into oldContent
             
            String line = reader.readLine();
             
            while (line != null) 
            {
                oldContent = oldContent + line + System.lineSeparator();
                 
                line = reader.readLine();
            }
             
            //Replacing oldString with newString in the oldContent
             
            String newContent = oldContent.replaceAll(oldString, newString);
             
            //Rewriting the input text file with newContent
             
            writer = new FileWriter(fileToBeModified);
             
            writer.write(newContent);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                //Closing the resources
                 
                reader.close();
                 
                writer.close();
            } 
            catch (IOException e) 
            {
                e.printStackTrace();
            }
        }
    }
	

	public void logMessage (
			String strStepToExecute, 
			String strExpected,
			String strActual,
			String strResult, 
			WebDriver driver
			)
	{
		//Will be calling a reporter logging function to create a test run report
		iTestStepNumber++;		

		String strTestStepTemplate = " ";
		if (strResult != null && strResult.equalsIgnoreCase("FAILED")){
			
			String strCurrentImageName = captureScreenshot(driver);
			strTestStepTemplate +=
					" <tr> "
							+ "  <th class='text-center' scope='row'>"+iTestStepNumber+"</th>"
							+ "  <td  class='wrap text-center'>"+strStepToExecute+"</td>"
							+ "  <td  class='wrap' >" +strExpected+"</td>"
							+ "  <td class='wrap text-left'>"+strActual+"</td>"
							+ "  <td class='wrap text-center alert alert-danger'><a target='_blank' href="+strCurrentImageName+">"+strResult+"</a></td>"
							+ "</tr>";
			iTotalTestStepsFailed ++;


		}
		else if (strResult != null && strResult.equalsIgnoreCase("PASSED")) {
			strTestStepTemplate +=
					" <tr> "
							+ "  <th class='text-center' scope='row'>"+iTestStepNumber+"</th>"
							+ "  <td class='wrap text-center'>"+strStepToExecute+"</td>"
							+ "  <td class='wrap'>"+strExpected+"</td>"
							+ "  <td class='wrap text-left'>"+strActual+"</td>"
							+ "  <td class='wrap text-center alert alert-success'>"+strResult+"</td>"
							+ "</tr>";
			iTotalTestStepsPassed ++;
		}
		else
		{
			strTestStepTemplate +=
					" <tr> "
							+ "  <th class='text-center' scope='row'>"+iTestStepNumber+"</th>"
							+ "  <td class='wrap text-center'>"+strStepToExecute+"</td>"
							+ "  <td class='wrap'>"+strExpected+"</td>"
							+ "  <td class='wrap text-left'>"+strActual+"</td>"
							+ "  <td class='wrap text-center alert alert-info'>INFO</td>"
							+ "</tr>";
		}
		//Append log to report
		String strTmpDir = Reporter.strR_CurrentReportsDir;
		String strTestReportHTML = strTmpDir + File.separator + strCurrentTestReportLink;
		File fTestReport = new File(strTestReportHTML);

		FileWriter writer;
		try {
			writer = new FileWriter(fTestReport, true);
			writer.write(strTestStepTemplate);
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}


	public static String getUniqueIntegerValue(int length)
	{
		// get current date time with Date() to create unique file name
		try
		{
			Thread.sleep(1000);
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
	
	public String captureScreenshot (WebDriver driver){
		File scrFile = null;
		String strCurrentImagePath = null;
		String strCurrentImageName = "image_"+System.currentTimeMillis()+"_"+getUniqueIntegerValue(7)+".png";
		try 
		{
			//Take Screenshot - get the hyperlink
			strCurrentImagePath = // "Reports/TestReport20180222110822"+// 
					Reporter.strR_CurrentReportsDir +
					"/" + strCurrentImageName;
			scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			System.out.println(scrFile.getAbsolutePath());
			FileUtils.copyFile(scrFile, new File(strCurrentImagePath));
			System.out.println("Taken Screenshot : "+strCurrentImagePath);
		} catch (Exception e) {
			System.err.println("Error in capturing screenshot..");
			e.printStackTrace();
			return null;
		}
		return strCurrentImageName;
	}
	static String strCurrentExecutionStatus = "";
	
	public void closeCurrentTestReport ()
	{

		iCurrentReportEndTime = System.currentTimeMillis();
		long iCurrentReportDiff = iCurrentReportEndTime - iCurrentReportStartTime;

		SimpleDateFormat sdf = new SimpleDateFormat("MMM dd,yyyy HH:mm:ss");    
		Date startDate = new Date(iCurrentReportStartTime);
		Date endDate = new Date(iCurrentReportEndTime);
		//System.out.println(sdf.format(startDate));

		//Get the Caller class name. Eg : com.loginext.Scenarios.Vehicle
		String callerClassName = new Exception().getStackTrace()[1].getClassName();
		String strDisplayCallerClassName = callerClassName.replaceAll("com.loginext.Scenarios.", "");

		//Get Caller Class Method
		String callerClassMethod = new Exception().getStackTrace()[1].getMethodName();
		//String calleeClassName = new Exception().getStackTrace()[0].getClassName();

		String strOverallExecutionStatus = "TBD";
		if (iTotalTestStepsFailed > 0){
			strOverallExecutionStatus = "Failed";
		}
		else if (iTotalTestStepsPassed == 0) {
			strOverallExecutionStatus = "TBD";
		}
		else {
			strOverallExecutionStatus = "Passed";
		}
		strCurrentExecutionStatus = strOverallExecutionStatus;
		
		String strTestReportTemplate = " "
				+ " </tbody> "
				+ " </table> "
				+ " </div> "
				+ " </div> "
				+ " </div> "
				+ " <div class='container executionDetails'> "
				+ " <div class='row'> "
				+ " <div class='col'> "				
				+" </div> "
				+ " </div>"
				+ " "
				+ " <div class='row'> "
				+ " <div class='col-12 text-center'> "
				//+ "<!--  data-toggle='tooltip' data-placement='right' title='Vehicle.addVehicle' style='cursor:pointer;' --> "
				+ " <h2>Overall Test Status : <span>"+strOverallExecutionStatus+"</span></h2> "
				+ " <br /> "
				+ " </div> "
				+ " </div> "
				+ " <div class='row'> "
				+ " <div class='col-6'> "
				+ " <table class=' table table-striped table-bordered'> "
				+ " <thead class='thead-dark'> "
				+ " <tr>"
				+ "  <th colspan='2' class='thead-dark text-center'>Overall"
				+ "    Execution Summary</th>"
				+ "</tr>"
				+ "</thead>"
				+ "<tbody>"
				+ "<tr>"
				+ " <td width='50%'>Total Tests Steps</td>"
				+ "  <td width='50%'>"+iTestStepNumber+"</td>"
				+ "</tr>"
				+ "<tr>"
				+ "  <td>Passed</td>"
				+ "  <td>"+iTotalTestStepsPassed+"</td>"
				+ " </tr>"
				+ " <tr>"
				+ "  <td>Failed</td>"
				+ "  <td>"+iTotalTestStepsFailed+"</td>"
				+ "</tr>"
				+ "<tr>"
				+ "  <td>Executed By</td>"
				+ "  <td>"+System.getProperty("user.name")+"</td>"
				+ "</tr>"
				+ "<tr>"
				+ "<td  width='50%'>Scenario</td>"
				+ "  <td  width='50%' class='wrap'>"+strDisplayCallerClassName+"."+callerClassMethod+"</td>"
				+ "</tr>"
				+ "</tbody>"
				+ "</table>"
				+ "</div>"
				+ "<div class='col-6'>"
				+ "<table class=' table table-striped table-bordered'>"
				+ "<thead class='thead-dark text-center'>"
				+ "<tr>"
				+ "  <th colspan='2' class='thead-dark'>Overall Execution Timing</th>"
				+ "</tr>"
				+ "</thead>"
				+ "<tbody>"
				+ "<tr>"
				+ "  <td width='50%'>Time Taken</td>"
				+ "  <td width='50%'>"+Reporter.getTimeDiffInPlainText(iCurrentReportDiff)+"</td>"
				+ "</tr>"
				+ "<tr>"
				+ "  <td>Started At</td>  <td>"+sdf.format(startDate)+"</td>"
				+ "</tr>"
				+ "<tr>"
				+ "  <td>Ended At</td>"
				+ "  <td>"+sdf.format(endDate)+"</td>"
				+ "</tr>"
				/*+ "<tr>"
				+ "  <td>Notes</td>"
				+ "  <td>1) Failed Tests under investigation for false positives<br />"
				+ "    <!-- 2) Ipsum Dicor sample Lorem dior again text multiline<br/> -->"
				+ "  </td>"
				+ "</tr>"*/
				+ "</tbody>"
				+ "</table>"
				+ "</div>"
				+ "</div>"
				+ "</div>"
				+ "<footer"
				+ " style='padding-top: 14px; padding-bottom: 5px; margin-top: 20px'> "
				+ "<div class='container'>"
				+ "<div class='text-center'>"
				+ "<h6 class='text-muted ' style='font-size: 14px;'>"
				+ " QA Test Automation Report - Designed and Developed at LogiNext <br>"
				+ " LogiNext Confidential."
				+ " </h6>"
				+ " </div> "
				+ " </div>"
				+ " </footer>"
				+ " <!-- Optional JavaScript -->"
				+ " <!-- jQuery first, then Popper.js, then Bootstrap JS -->"
				+ " <script src='https://code.jquery.com/jquery-3.2.1.slim.min.js' "
				+ " integrity='sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN'"
				+ " crossorigin='anonymous'></script>"
				+ " <script"
				+ " src='https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js' "
				+ " integrity='sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q'"
				+ " crossorigin='anonymous'></script> "
				+ "<script "
				+ "src='https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js' "
				+ " integrity='sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl'"
				+ " crossorigin='anonymous'></script> "
				+ " <script> "
				+ " $(document).ready(function(){ "
				+ " $('[data-toggle=\"tooltip\"]').tooltip(); "
				+ "	});"
				+ "	</script>"
				+ " </body> "
				+ "</html>";

		//Append log to report
		String strTmpDir = Reporter.strR_CurrentReportsDir;
		String strTestReportHTML = strTmpDir + File.separator + strCurrentTestReportLink;
		File fTestReport = new File(strTestReportHTML);

		FileWriter writer;
		try {
			writer = new FileWriter(fTestReport, true);
			writer.write(strTestReportTemplate);
			writer.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**********For Mail Body *********/

	public static String strMailBody = "";
	public static String strMailReportHeader = " "
			+ " <html>"
			+ "   <head></head>"
			+ "   <body>"
			+ "      <table border='0' cellpadding='0' cellspacing='0' height='100%' width='100%' id='m_2955097082153582627backgroundTable' style='margin:0px;padding:0px;height:887px;width:1263px;color:rgb(0,0,0);font-family:'Times New Roman';font-size:medium;background-color:rgb(250,250,250)'>"
			+ "         <tbody>"
			+ "            <tr>"
			+ "               <td align='center' valign='top' style='border-collapse:collapse;padding-top:20px'>"
			+ "                  <table border='0' cellpadding='0' cellspacing='0' width='600' id='m_2955097082153582627templateContainer' style='border:1px solid rgb(221,221,221);background-color:rgb(255,255,255)'>"
			+ "                     <tbody>"
			+ "                        <tr>"
			+ "                           <td align='center' valign='top' style='border-collapse:collapse'>"
			+ "                              <table border='0' cellpadding='0' cellspacing='0' width='600' id='m_2955097082153582627templateBody'>"
			+ "                                 <tbody>"
			+ "                                    <tr>"
			+ "                                       <td valign='top' style='border-collapse:collapse'>"
			+ "                                          <table border='0' cellpadding='20' cellspacing='0' width='100%'>"
			+ "                                             <tbody>"
			+ "                                                  <tr>"
			+ "                                                   <td valign='top' style='border-collapse:collapse'>"
			+ "                                                      <div style='color:rgb(80,80,80);font-family:Arial;font-size:14px;line-height:21px'>"
			+ "                                                      </div>"
			+ "                                                   </td>"
			+ "                                                </tr>  "
			+ "                                                <tr>"
			+ "                                                   <td valign='top' style='border-collapse:collapse;padding-top:0px;padding-bottom:0px'>"
			+ "                                                      <h4 class='m_2955097082153582627h4' style='color:rgb(32,32,32);font-family:Arial;font-size:22px;line-height:22px;margin:0px 0px 25px'>Test Automation Results</h4>"
			+ "                                                   </td>"
			+ "                                                </tr>"
			+ "												"
			+ "                                                <tr>"
			+ "                                                   <td valign='top' style='border-collapse:collapse;padding-top:0px;'>"
			+ "                                                      <table align='Left' border='0' cellpadding='10' cellspacing='0' width='100%' style='border:1px solid rgb(221,221,221)'>"
			+ "                                                         <tbody>"
			+ "                                                            <tr>"
			+ "                                                               <th scope='col' valign='top' width='10%' style='color:rgb(234,234,234);font-family:Helvetica;font-size:14px;line-height:21px;background-color:rgb(45,45,46)'>Test#</th>"
			+ "                                                               <th scope='col' valign='top' width='60%' style='color:rgb(234,234,234);font-family:Helvetica;font-size:14px;line-height:21px;background-color:rgb(45,45,46)'>Test Name</th>"
			+ "                                                               <th scope='col' valign='top' width='10%' style='color:rgb(234,234,234);font-family:Helvetica;font-size:14px;line-height:21px;background-color:rgb(45,45,46)'>Status</th>"
			+ "                                                               <th scope='col' valign='top' width='20%' style='color:rgb(234,234,234);font-family:Helvetica;font-size:14px;line-height:21px;background-color:rgb(45,45,46)'>Time</th>"
			+ "                                                            </tr>"
			+ "";




	public static void main(String[] args) throws Exception {
		
		TestReporter r = new TestReporter();
		r.createTestReport("Hello World");
		r.logMessage("Test", "Test", "Test", "Passed", null);
		r.logMessage("Test", "Test", "Test", "Passed", null);
		r.logMessage("Test", "Test", "Test", "Passed", null);
		r.logMessage("Test", "Test", "Test", "Passed", null);
		r.closeCurrentTestReport();
		/*
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		TimeUnit.SECONDS.sleep(2);
		*/
		//Create a Master Report
		//createMasterReport();
		//String strMasterExecReport = getMasterExecutionReport();

		//Add Test to Master Report
		/*addTestDetailsToMasterReport(
				"Add Vehicle", 
				"addVehicle.html report", 
				"Passed", 20);
		 */
	}


}
