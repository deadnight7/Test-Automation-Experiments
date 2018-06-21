package com.loginext.TestNGController;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
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

public class Reporter {

	public static String strR_CurrentReportsDir = "Reports/123";// null;
	static String strR_CurrentMasterReport = null;
	static public String strR_CurrentReportsUniqueDir = null;
	static public long lTimeStartedForAllMasterReport = 0;

	public static String getMasterExecutionReport (){
		return strR_CurrentMasterReport;
	}

	public static String createMasterReport ()
	{
		try {

			//Start time for master report
			lTimeStartedForAllMasterReport = System.currentTimeMillis() ;

			//Get unique folder w.r.t timestamp
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
			LocalDateTime now = LocalDateTime.now();
			System.out.println(dtf.format(now)); //2016/11/16 12:08:43
			String strUniqueTimeStamp = dtf.format(now); 

			String strReportsDirectory = "Reports";
			strR_CurrentReportsUniqueDir = "TestReport"+strUniqueTimeStamp;
			String strCurrentReportsDirectory = strReportsDirectory+ File.separator + strR_CurrentReportsUniqueDir;//"TestReport"+strUniqueTimeStamp;
			strR_CurrentReportsDir = strCurrentReportsDirectory;
			strR_CurrentMasterReport = strCurrentReportsDirectory + File.separator + "MasterExecutionReport.html";

			File fCurrentReportingDir = new File(strCurrentReportsDirectory);
			File fCurrentMasterRunReport = new File(strR_CurrentMasterReport);

			//Create folders if not exists
			fCurrentReportingDir.mkdirs();
			if (fCurrentMasterRunReport.exists() == false){
				fCurrentMasterRunReport.createNewFile();
			}

			FileWriter writer = new FileWriter(fCurrentMasterRunReport, true);
			writer.write(strInitialMasterReportTemplate);

			//Add String to mail report
			strMailBody += strMailReportHeader;

			writer.close();

			System.out.println("Reporting Folder : "+fCurrentReportingDir.getAbsolutePath());

			return strCurrentReportsDirectory;
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("Unable to create new Reporting Folder");
			return null;
		}
	}


	/**
	 * Will add Data to Master Run Report after execution is completed
	 * 
	 * @param strMasterReportFileName
	 * @param strTestName
	 * @param strTestReportLink
	 * @param strTestExecutionStatus
	 */
	public static void addTestDetailsToMasterReport (String strTestName, TestReporter testReport)
	{
		try {

			//lTimeTakenForAllTests += timeTakenForThisTest;
			long iCurrentReportEndTime = testReport.iCurrentReportEndTime;
			long iCurrentReportStartTime = testReport.iCurrentReportStartTime;
			String strCurrentTestReportLink = testReport.strCurrentTestReportLink;
			
			long timeTakenForThisTest = iCurrentReportEndTime - iCurrentReportStartTime; 

			FileWriter writer = new FileWriter(strR_CurrentMasterReport, true);

			//Get the Caller class name. Eg : com.loginext.Scenarios.Vehicle
			String callerClassName = new Exception().getStackTrace()[1].getClassName();
			String strDisplayCallerClassName = callerClassName.replaceAll("com.loginext.Scenarios.", "");

			//Get Caller Class Method
			String callerClassMethod = new Exception().getStackTrace()[1].getMethodName();
			//String calleeClassName = new Exception().getStackTrace()[0].getClassName();

			String	strTestExecutionStatus = "Passed";
			if (testReport.iTotalTestStepsFailed > 0){
				strTestExecutionStatus = "Failed";
			}
			
			iTotalTestsMaster++;
			if (strTestExecutionStatus != null && strTestExecutionStatus.equalsIgnoreCase("PASSED")){
				iTotalTestsPassedMaster ++;
				strMasterTestDetails = "<tr>"
						+ "							<th class='text-center' scope='row'>"+iTotalTestsMaster+"</th>"
						+ "							<td><a target='_blank' href='"+strCurrentTestReportLink+"'>"+strTestName+"</a></td>"
						+ "							<td class='text-center'>"+getTimeDiffInPlainText(timeTakenForThisTest)+"</td>"
						+ "							<td class='text-center alert alert-success' data-toggle='tooltip' data-placement='left' title='"+strDisplayCallerClassName+"."+callerClassMethod+"' style='cursor:pointer;' >"+strTestExecutionStatus+"</td>"
						+ "						</tr>";

				strMailBody += "<tr>"
						+ "<td valign='top' style='border-collapse:collapse;border-top-width:1px;border-top-style:solid;border-top-color:rgb(221,221,221);border-bottom-width:0px;color:rgb(32,32,32);font-family:Helvetica;font-size:12px;font-weight:bold'>"+iTotalTestsMaster+"</td>"
						+ "<td valign='top' style='border-collapse:collapse;border-top-width:1px;border-top-style:solid;border-top-color:rgb(221,221,221);border-bottom-width:0px;color:rgb(32,32,32);font-family:Helvetica;font-size:12px;font-weight:bold; text-align:center'>"+strTestName+"</td>"
						+ "<td valign='top' style='border-collapse:collapse;border-top-width:1px;border-top-style:solid;border-top-color:rgb(221,221,221);border-bottom-width:0px;color:rgb(0,102,0);font-family:Helvetica;font-size:12px;font-weight:bold; text-align:center'>"+strTestExecutionStatus+"</td>"
						+ "<td valign='top' style='border-collapse:collapse;border-top-width:1px;border-top-style:solid;border-top-color:rgb(221,221,221);border-bottom-width:0px;color:rgb(32,32,32);font-family:Helvetica;font-size:12px;font-weight:bold; text-align:center'>"+getTimeDiffInPlainText(timeTakenForThisTest)+"</td>"
						+ "</tr>";

			}
			else if (strTestExecutionStatus != null && strTestExecutionStatus.equalsIgnoreCase("FAILED")){
				iTotalTestsFailedMaster ++;
				strMasterTestDetails = "<tr>"
						+ "							<th class='text-center' scope='row'>"+iTotalTestsMaster+"</th>"
						+ "							<td><a target='_blank' href='"+strCurrentTestReportLink+"'>"+strTestName+"</a></td>"
						+ "							<td class='text-center'>"+getTimeDiffInPlainText(timeTakenForThisTest)+"</td>"
						+ "							<td class='text-center alert alert-danger' data-toggle='tooltip' data-placement='left' title='"+strDisplayCallerClassName+"."+callerClassMethod+"' style='cursor:pointer;' >"+strTestExecutionStatus+"</td>"
						+ "						</tr>";

				strMailBody += "<tr>"
						+ "<td valign='top' style='border-collapse:collapse;border-top-width:1px;border-top-style:solid;border-top-color:rgb(221,221,221);border-bottom-width:0px;color:rgb(32,32,32);font-family:Helvetica;font-size:12px;font-weight:bold'>"+iTotalTestsMaster+"</td>"
						+ "<td valign='top' style='border-collapse:collapse;border-top-width:1px;border-top-style:solid;border-top-color:rgb(221,221,221);border-bottom-width:0px;color:rgb(32,32,32);font-family:Helvetica;font-size:12px;font-weight:bold; text-align:center'>"+strTestName+"</td>"
						+ "<td valign='top' style='border-collapse:collapse;border-top-width:1px;border-top-style:solid;border-top-color:rgb(221,221,221);border-bottom-width:0px;color:rgb(175,13,13);font-family:Helvetica;font-size:12px;font-weight:bold; text-align:center'>"+strTestExecutionStatus+"</td>"
						+ "<td valign='top' style='border-collapse:collapse;border-top-width:1px;border-top-style:solid;border-top-color:rgb(221,221,221);border-bottom-width:0px;color:rgb(32,32,32);font-family:Helvetica;font-size:12px;font-weight:bold; text-align:center'>"+getTimeDiffInPlainText(timeTakenForThisTest)+"</td>"
						+ "</tr>";
			}

			String log = strMasterTestDetails ; //" "+strTestName+" - "+strTestReportLink+" - "+strTestExecutionStatus+" - "+timeTakenForThisTest+" Called from :  "+callerClassName+"."+callerClassMethod+"\n";
			//System.out.println("log :Adding Test to Master Report :- "+log);
			writer.write(log);
			writer.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	/**
	 * Will add Data to Master Run Report after execution is completed
	 * 
	 * @param strMasterReportFileName
	 * @param strTestName
	 * @param strTestReportLink
	 * @param strTestExecutionStatus
	 */
	public static void addTestDetailsToMasterReport (String strTestName, long timeTakenForCurrentTest, String strCurrentTestStatus)
	{
		try {

			long timeTakenForThisTest = timeTakenForCurrentTest;// iCurrentReportEndTime - iCurrentReportStartTime; 

			FileWriter writer = new FileWriter(strR_CurrentMasterReport, true);

			//Get the Caller class name. Eg : com.loginext.Scenarios.Vehicle
			String callerClassName = new Exception().getStackTrace()[1].getClassName();
			String strDisplayCallerClassName = callerClassName.replaceAll("com.loginext.Scenarios.", "");

			//Get Caller Class Method
			String callerClassMethod = new Exception().getStackTrace()[1].getMethodName();
			//String calleeClassName = new Exception().getStackTrace()[0].getClassName();

			String	strTestExecutionStatus = strCurrentTestStatus;// "Passed";
			
			iTotalTestsMaster++;
			if (strTestExecutionStatus != null && strTestExecutionStatus.equalsIgnoreCase("PASSED")){
				iTotalTestsPassedMaster ++;
				strMasterTestDetails = "<tr>"
						+ "							<th class='text-center' scope='row'>"+iTotalTestsMaster+"</th>"
						+ "							<td><a target='_blank' href='#'>"+strTestName+"</a></td>"
						+ "							<td class='text-center'>"+getTimeDiffInPlainText(timeTakenForThisTest)+"</td>"
						+ "							<td class='text-center alert alert-success' data-toggle='tooltip' data-placement='left' title='"+strDisplayCallerClassName+"."+callerClassMethod+"' style='cursor:pointer;' >"+strTestExecutionStatus+"</td>"
						+ "						</tr>";

				strMailBody += "<tr>"
						+ "<td valign='top' style='border-collapse:collapse;border-top-width:1px;border-top-style:solid;border-top-color:rgb(221,221,221);border-bottom-width:0px;color:rgb(32,32,32);font-family:Helvetica;font-size:12px;font-weight:bold'>"+iTotalTestsMaster+"</td>"
						+ "<td valign='top' style='border-collapse:collapse;border-top-width:1px;border-top-style:solid;border-top-color:rgb(221,221,221);border-bottom-width:0px;color:rgb(32,32,32);font-family:Helvetica;font-size:12px;font-weight:bold; text-align:center'>"+strTestName+"</td>"
						+ "<td valign='top' style='border-collapse:collapse;border-top-width:1px;border-top-style:solid;border-top-color:rgb(221,221,221);border-bottom-width:0px;color:rgb(0,102,0);font-family:Helvetica;font-size:12px;font-weight:bold; text-align:center'>"+strTestExecutionStatus+"</td>"
						+ "<td valign='top' style='border-collapse:collapse;border-top-width:1px;border-top-style:solid;border-top-color:rgb(221,221,221);border-bottom-width:0px;color:rgb(32,32,32);font-family:Helvetica;font-size:12px;font-weight:bold; text-align:center'>"+getTimeDiffInPlainText(timeTakenForThisTest)+"</td>"
						+ "</tr>";

			}
			else if (strTestExecutionStatus != null && strTestExecutionStatus.equalsIgnoreCase("FAILED")){
				iTotalTestsFailedMaster ++;
				strMasterTestDetails = "<tr>"
						+ "							<th class='text-center' scope='row'>"+iTotalTestsMaster+"</th>"
						+ "							<td><a target='_blank' href='#'>"+strTestName+"</a></td>"
						+ "							<td class='text-center'>"+getTimeDiffInPlainText(timeTakenForThisTest)+"</td>"
						+ "							<td class='text-center alert alert-danger' data-toggle='tooltip' data-placement='left' title='"+strDisplayCallerClassName+"."+callerClassMethod+"' style='cursor:pointer;' >"+strTestExecutionStatus+"</td>"
						+ "						</tr>";

				strMailBody += "<tr>"
						+ "<td valign='top' style='border-collapse:collapse;border-top-width:1px;border-top-style:solid;border-top-color:rgb(221,221,221);border-bottom-width:0px;color:rgb(32,32,32);font-family:Helvetica;font-size:12px;font-weight:bold'>"+iTotalTestsMaster+"</td>"
						+ "<td valign='top' style='border-collapse:collapse;border-top-width:1px;border-top-style:solid;border-top-color:rgb(221,221,221);border-bottom-width:0px;color:rgb(32,32,32);font-family:Helvetica;font-size:12px;font-weight:bold; text-align:center'>"+strTestName+"</td>"
						+ "<td valign='top' style='border-collapse:collapse;border-top-width:1px;border-top-style:solid;border-top-color:rgb(221,221,221);border-bottom-width:0px;color:rgb(175,13,13);font-family:Helvetica;font-size:12px;font-weight:bold; text-align:center'>"+strTestExecutionStatus+"</td>"
						+ "<td valign='top' style='border-collapse:collapse;border-top-width:1px;border-top-style:solid;border-top-color:rgb(221,221,221);border-bottom-width:0px;color:rgb(32,32,32);font-family:Helvetica;font-size:12px;font-weight:bold; text-align:center'>"+getTimeDiffInPlainText(timeTakenForThisTest)+"</td>"
						+ "</tr>";
			}

			String log = strMasterTestDetails ; //" "+strTestName+" - "+strTestReportLink+" - "+strTestExecutionStatus+" - "+timeTakenForThisTest+" Called from :  "+callerClassName+"."+callerClassMethod+"\n";
			//System.out.println("log :Adding Test to Master Report :- "+log);
			writer.write(log);
			writer.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void closeMasterReport ()
	{
		long lTimeEndedForAllTestsMaster = System.currentTimeMillis();
		long lTimeTakenForAllTests = lTimeEndedForAllTestsMaster - lTimeStartedForAllMasterReport; 

		strMasterReportCloseTemplate = "</tbody> "
				+ " </table> "
				+ " </div> "
				+ " </div> "
				+ " </div> "
				+ " "
				+ "<div class='container executionDetails'> "
				+ " <div class='row'>"
				+ " <div class='col'> "
				+ " <!-- <div class='text-center'> "
				+ " <h3>Overall Execution Details</h3> "
				+ " </div> --> "
				+ " </div> "
				+ " </div> "
				+ " <div class='row'> "
				+ " <div class='col-6'> "
				+ "<table class=' table table-striped table-bordered'>"
				+ " "
				+ "<thead class='thead-dark'> "
				+ " <tr>"
				+ "    <th colspan='2' class='thead-dark'>Overall Execution Summary</th>"
				+ "  </tr> "
				+ "</thead>"
				+ " <tbody> "
				+ "  <tr>"
				+ "     <td width='50%'>Total Tests</td>"
				+ "    <td width='50%'>"+iTotalTestsMaster+"</td>"
				+ "  </tr>"
				+ "  <tr>"
				+ "    <td>Passed</td>"
				+ "    <td>"+iTotalTestsPassedMaster+"</td>"
				+ "  </tr>"
				+ "  <tr>"
				+ "    <td>Failed</td>"
				+ "    <td>"+iTotalTestsFailedMaster+"</td>"
				+ "  </tr>"
				+ "  <tr>"
				+ "    <td>Time Taken</td>"
				+ "    <td>"+ getTimeDiffInPlainText(lTimeTakenForAllTests) +"</td>"
				+ "  </tr>"
				+ "  <tr>"
				+ "    <td>Executed By</td>"
				+ "    <td>"+System.getProperty("user.name")+"</td>"
				+ "  </tr>"
				+ "  <tr>"
				+ "    <td>OS</td>"
				+ "    <td>"+System.getProperty("os.name")+"</td>"
				+ "  </tr>"
				//+ "  <tr>"
				//+ "    <td>Free Space</td>"
				//+ "    <td>877 MB</td>"
				//+ "  </tr>"
				+ "  <tr>"
				+ "    <td>Notes</td>"
				+ "    <td>";
		String strNotes = "";
		if (iTotalTestsFailedMaster > 0){
			strNotes += " 1) Failed Tests under investigation for false positives<br/>";
		}
		else {
			strNotes += " None ";
		}

		strMasterReportCloseTemplate += strNotes
				//+ "   <!-- 2) Ipsum Dicor sample Lorem dior again text multiline<br/> -->"
				//+ " <!-- <a href='#' data-toggle='tooltip' data-placement='top' title='Hooray!'>Hover over me</a> -->"
				+ "    </td>"
				+ "  </tr>"
				+ "</tbody>"
				+ "</table>"
				+ "</div>"
				+ "<div class='col-6'>"
				+ "<canvas id='myChart' height='200'></canvas>"
				+ "</div>"
				+ "</div>"
				+ "</div>";

		//Add Charting Script
		strMasterReportCloseTemplate += ""
				+ "	<script>"
				+ "		var ctx = document.getElementById(\"myChart\").getContext('2d');"
				+ "		var myChart = new Chart(ctx, {"
				+ "			type : 'pie',"
				+ "			data : {"
				+ "				labels : [ 'Passed', 'Failed' ],"
				+ "				datasets : [ {"
				+ "					label : 'Test Execution Summary',"
				+ "					data : [ "+iTotalTestsPassedMaster+", "+iTotalTestsFailedMaster+" ],"
				+ "					backgroundColor : [ '#d4edda', "// Passed Color
				+ "					'#f8d7da' "// Failed Color
				+ "					],"
				+ "					borderColor : [ ' #155724',"//Passed Border
				+ "					'#721c24' "// Failed Border  -//'rgba(255,99,132,1)'
				+ "					],"
				+ "					borderWidth : 1"
				+ "				} ]"
				+ "			}"
				+ "		});"
				+ "	</script>"
				+ "	";

		strMasterReportCloseTemplate += ""
				+ "	<footer style='padding-top: 14px; padding-bottom: 5px; margin-top: 20px'>"
				+ "		<div class='container'>"
				+ "			<div class='text-center'>"
				+ "				<h6 class='text-muted ' style='font-size: 14px;'>"
				+ "					Designed and Developed at LogiNext <br>QA Test Automation Report -  LogiNext Confidential."
				+ "				</h6>"
				+ "			</div>"
				+ "		</div>"
				+ "	</footer>"
				+ ""
				+ "	<!-- Optional JavaScript -->"
				+ "	<!-- jQuery first, then Popper.js, then Bootstrap JS -->"
				+ "	<script src='https://code.jquery.com/jquery-3.2.1.slim.min.js'"
				+ "		integrity='sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN'"
				+ "		crossorigin='anonymous'></script>"
				+ "	<script"
				+ "		src='https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js'"
				+ "		integrity='sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q'"
				+ "		crossorigin='anonymous'></script>"
				+ "	<script"
				+ "		src='https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js'"
				+ "		integrity='sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl'"
				+ "		crossorigin='anonymous'></script>"
				+ "	<script>"
				+ "	$(document).ready(function(){"
				+ "	    $('[data-toggle=\"tooltip\"]').tooltip(); "
				+ "	});"
				+ "	</script>"
				+ "</body>"
				+ "</html>";


		SimpleDateFormat sdf = new SimpleDateFormat("MMM dd,yyyy HH:mm:ss");    
		Date startDate = new Date(lTimeStartedForAllMasterReport);
		Date endDate = new Date(lTimeEndedForAllTestsMaster);

		strMailBody += "                                                        </tbody>"
				+ "                                                      </table>"
				+ "                                                      <table align='Left' border='0' cellpadding='10' cellspacing='0' width='100%' style='border:0px solid rgb(221,221,221)'>"
				+ "                                                         <tbody>"
				+ "                                                            <tr>"
				+ "                                                               <td valign='top' width='25%' style='border-collapse:collapse;border-top-width:1px;border-top-style:solid;border-top-color:rgb(221,221,221);border-bottom-width:0px;color:rgb(32,32,32);font-family:Helvetica;font-size:12px;font-weight:bold'>Notes</td>"
				+ "                                                               <td style='border-collapse:collapse;border-top-width:1px;border-top-style:solid;border-top-color:rgb(221,221,221);border-bottom-width:0px;color:rgb(32,32,32);font-family:Helvetica;font-size:12px;font-weight:bold; text-align:left' width='75%' valign='top'>"
				+ "                                                                  "+strNotes
				+ "                                                                "
				+ "                                                               </td>"
				+ "                                                            </tr>"
				+ "                                                         </tbody>"
				+ "                                                      </table>"
				+ "                                                   </td>"
				+ "                                                </tr>"
				+ "                                                <tr>"
				+ "                                                   <td valign='top' style='border-collapse:collapse;padding-bottom:0px'>"
				+ "                                                      <table align='Left' border='0' cellpadding='10' cellspacing='0' width='320' style='border:1px solid rgb(221,221,221)'>"
				+ "                                                         <tbody>"
				+ "                                                            <tr>"
				+ "                                                               <th scope='col' valign='top' width='40%' style='color:rgb(234,234,234);font-family:Helvetica;font-size:14px;line-height:21px;background-color:rgb(45,45,46)'>Execution Time </th>"
				+ "                                                               <th scope='col' valign='top' width='60%' style='color:rgb(234,234,234);font-family:Helvetica;font-size:14px;line-height:21px;background-color:rgb(45,45,46)'>"+getTimeDiffInPlainText(lTimeTakenForAllTests)+"</th>"
				+ "                                                            </tr>"
				+ "                                                            <tr>"
				+ "                                                               <td valign='top' style='border-collapse:collapse;border-top-width:1px;border-top-style:solid;border-top-color:rgb(221,221,221);border-bottom-width:0px;color:rgb(32,32,32);font-family:Helvetica;font-size:12px;font-weight:bold'>Test Ended on</td>"
				+ "                                                               <td valign='top' style='border-collapse:collapse;border-top-width:1px;border-top-style:solid;border-top-color:rgb(221,221,221);border-bottom-width:0px;color:rgb(32,32,32);font-family:Helvetica;font-size:12px;font-weight:bold'>"+sdf.format(endDate)+"</td>"
				+ "                                                            </tr>"
				+ "                                                            <tr>"
				+ "                                                               <td valign='top' style='border-collapse:collapse;border-top-width:1px;border-top-style:solid;border-top-color:rgb(221,221,221);border-bottom-width:0px;color:rgb(32,32,32);font-family:Helvetica;font-size:12px;font-weight:bold'>Test started on</td>"
				+ "                                                               <td valign='top' style='border-collapse:collapse;border-top-width:1px;border-top-style:solid;border-top-color:rgb(221,221,221);border-bottom-width:0px;color:rgb(32,32,32);font-family:Helvetica;font-size:12px;font-weight:bold'>"+sdf.format(startDate)+"</td>"
				+ "                                                            </tr>"
				+ "                                                         </tbody>"
				+ "                                                      </table>"
				+ "                                                      <table align='Right' border='0' cellpadding='10' cellspacing='0' width='190' style='border:1px solid rgb(221,221,221)'>"
				+ "                                                         <tbody>"
				+ "                                                            <tr>"
				+ "                                                               <th scope='col' valign='top' width='50%' style='color:rgb(234,234,234);font-family:Helvetica;font-size:14px;line-height:21px;background-color:rgb(45,45,46)'>Total Tests</th>"
				+ "                                                               <th scope='col' valign='top' width='25%' style='color:rgb(234,234,234);font-family:Helvetica;font-size:14px;line-height:21px;background-color:rgb(45,45,46)'>"+iTotalTestsMaster+"</th>"
				+ "                                                            </tr>"
				+ "                                                            <tr>"
				+ "                                                               <td valign='top' style='border-collapse:collapse;border-top-width:1px;border-top-style:solid;border-top-color:rgb(221,221,221);border-bottom-width:0px;color:rgb(32,32,32);font-family:Helvetica;font-size:12px;font-weight:bold; text-align:center'>Passed</td>"
				+ "                                                               <td valign='top' style='border-collapse:collapse;border-top-width:1px;border-top-style:solid;border-top-color:rgb(221,221,221);border-bottom-width:0px;color:rgb(32,32,32);font-family:Helvetica;font-size:12px;font-weight:bold; text-align:center'>"+iTotalTestsPassedMaster+"</td>"
				+ "                                                            </tr>"
				+ "                                                            <tr>"
				+ "                                                               <td valign='top' style='border-collapse:collapse;border-top-width:1px;border-top-style:solid;border-top-color:rgb(221,221,221);border-bottom-width:0px;color:rgb(32,32,32);font-family:Helvetica;font-size:12px;font-weight:bold; text-align:center'>Failed</td>"
				+ "                                                               <td valign='top' style='border-collapse:collapse;border-top-width:1px;border-top-style:solid;border-top-color:rgb(221,221,221);border-bottom-width:0px;color:rgb(32,32,32);font-family:Helvetica;font-size:12px;font-weight:bold; text-align:center'>"+iTotalTestsFailedMaster+"</td>"
				+ "                                                            </tr>"
				+ "                                                         </tbody>"
				+ "                                                      </table>"
				+ "                                                   </td>"
				+ "                                                </tr>"
				+ "                                                "
				+ "                                                <tr>"
				+ "                                                   <td valign='top' style='text-align:center;border-collapse:collapse'>"
				+ "                                                      <div style='color:rgb(80,80,80);font-family:Arial;font-size:14px;line-height:21px'>Please do not reply to this email, This was an auto-generated email triggered post execution run. Please refer the attached test reports for further analysis and verification.<br><br></div>"
				+ "                                                   </td>"
				+ "                                                </tr>"
				+ "                                                <tr>"
				+ "                                                </tr>"
				+ "                                             </tbody>"
				+ "                                          </table>"
				+ "                                       </td>"
				+ "                                    </tr>"
				+ "                                 </tbody>"
				+ "                              </table>"
				+ "                           </td>"
				+ "                        </tr>"
				+ "                        <tr>"
				+ "                           <td align='center' valign='top' style='border-collapse:collapse'>"
				+ "                              <table border='0' cellpadding='10' cellspacing='0' width='600' id='m_2955097082153582627templateFooter' style='border-top-width:0px'>"
				+ "                                 <tbody>"
				+ "                                    <tr>"
				+ "                                       <td valign='top' style='border-collapse:collapse'>"
				+ "                                          <table border='0' cellpadding='10' cellspacing='0' width='100%'>"
				+ "                                             <tbody>"
				+ "                                                <tr>"
				+ "                                                   <td valign='top' style='border-collapse:collapse'>"
				+ "                                                      <div style='color:rgb(112,112,112);font-family:Arial;font-size:12px;line-height:15px;text-align:center'>Designed and Developed at Loginext<br>Loginext Confidential.</div>"
				+ "                                                   </td>"
				+ "                                                </tr>"
				+ "                                             </tbody>"
				+ "                                          </table>"
				+ "                                       </td>"
				+ "                                    </tr>"
				+ "                                 </tbody>"
				+ "                              </table>"
				+ "                           </td>"
				+ "                        </tr>"
				+ "                     </tbody>"
				+ "                  </table>"
				+ "                  <br>"
				+ "               </td>"
				+ "            </tr>"
				+ "         </tbody>"
				+ "      </table>"
				+ "   </body>"
				+ "</html>";

		try {
			FileWriter writer = new FileWriter(strR_CurrentMasterReport, true);
			writer.write(strMasterReportCloseTemplate);
			writer.close();	

		} catch (Exception e) {
			e.printStackTrace();
		}


	}

	static String strInitialMasterReportTemplate = "<!doctype html>"
			+ "<html lang='en'>"
			+ "<head> "
			+ "<!-- Required meta tags -->"
			+ "<meta charset='utf-8'>"
			+ "<meta name='viewport'"
			+ "content='width=device-width, initial-scale=1, shrink-to-fit=no'>"
			+ "<link rel='stylesheet' "
			+ " href='https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css'"
			+ " integrity='sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm'"
			+ " crossorigin='anonymous' />"
			+ " <script type='text/javascript'"
			+ " src='https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.7.1/Chart.bundle.min.js'>"
			+ " </script> "
			+ " <!-- 'https://www.gstatic.com/charts/loader.js' -->"
			+ " <link rel='icon' "
			+ " href='https://products.loginextsolutions.com/product/images/favicon.ico'> "
			+ " <style> "
			+ ".header { "
			+ " padding: 17px; "
			+ " }"
			+ " a {"
			+ " color:#000; "
			+ "} "
			+ " "
			+ ".footer {"
			+ " 	position: absolute;"
			+ " 	bottom: 0;"
			+ "	width: 100%;"
			+ " 	background-color: #f5f5f5;"
			+ " }"
			+ " "
			+ ".executionDetails {"
			+ "	bottom: 0;"
			+ "}"
			+ " "
			+ ".executionDetailsTable {"
			+ "	margin-top: 48px;"
			+ " }"
			+ " </style>"
			+ " "
			+ "<title>Test Execution Batch Report</title>"
			+ " </head> "
			+ " <body>"
			+ " <div"
			+ " style='-webkit-box-shadow: 0 2px 4px rgba(0, 0, 0, .13); -moz-box-shadow: 0 2px 4px rgba(0, 0, 0, .13); -o-box-shadow: 0 2px 4px rgba(0, 0, 0, .13); -ms-box-shadow: 0 2px 4px rgba(0, 0, 0, .13); box-shadow: 0 2px 4px rgba(0, 0, 0, .13); padding-top: 19px; padding-bottom: 15px; margin-bottom: 30px;'>"
			+ " "
			+ "<div class='container'> "
			+ " <div class='row'> "
			+ "<!-- <a class='navbar-brand' href='#'>Navbar</a> --> "
			+ " <div class='col-3'> "
			+ " <img src='https://www.loginextsolutions.com/images/logo.png'"
			+ " alt='loginext'> "
			+ "</div>"
			+ " <div class='col-9 text-center' style='margin-top: 10px'> "
			+ "	<h3>Test Execution Batch Report</h3>"
			+ " </div> "
			+ " </div> "
			+ " </div>"
			+ " "
			+ "</div> "
			+ " <div class='container'> "
			+ "<div class='row'> "
			+ "			<div class='table'>"
			+ "				<table class='table table-bordered'>"
			+ "					<thead class='thead-dark'>"
			+ "						<tr>"
			+ "							<th class='text-center' width='10%'>Test#</th>"
			+ "							<th width='70%'>Test case Name</th>"
			+ "							<th class='text-center' width='15%'>Time</th>"
			+ "							<th class='text-center' width='20%'>Status</th>"
			+ "						</tr>"
			+ "					</thead>"
			+ "					<tbody>";

	static int iTotalTestsMaster = 0;
	static int iTotalTestsPassedMaster = 0;
	static int iTotalTestsFailedMaster = 0;

	static String strMasterTestDetails = "<tr>"
			+ "							<th class='text-center' scope='row'>1</th>"
			+ "							<td>To verify whether creation of new vehicle in system</td>"
			+ "							<td class='text-center'>2 Min : 45 Sec</td>"
			+ "							<td class='text-center alert alert-success'>Passed</td>"
			+ "						</tr>";

	static String strMasterReportCloseTemplate = "";


	/**
	 * getTimeDiffInPlainText  
	 * 
	 * 	long d1 = System.currentTimeMillis();
		long d2 = System.currentTimeMillis();
		long iDiffInMillis = d2 - d1;
	 * @param iDiffInMillis
	 * @return
	 */
	public static String getTimeDiffInPlainText (long iDiffInMillis)
	{
		double diffSeconds = (double) iDiffInMillis / 1000 % 60;
		DecimalFormat secondsFormat = new DecimalFormat(".##");
		long diffMinutes = iDiffInMillis / (60 * 1000) % 60;
		long diffHours = iDiffInMillis / (60 * 60 * 1000); //% 24;
		String strTimeToPrint = "";
		if (diffHours > 0){
			strTimeToPrint += diffHours+ " hrs ";
		}
		strTimeToPrint += diffMinutes + " min "+secondsFormat.format(diffSeconds) +" sec ";
		//System.out.println(strTimeToPrint);
		return strTimeToPrint;
	}

	/**********For Each detailed Test report *********/



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
	
	public static void showPopup (String strTestName, TestReporter report)
	{
		try {
			ApplicationUtility utility = new ApplicationUtility(report);
			WebDriver d = utility.driver;
			String strFilePath = "TestNG/currentTest.html";
			File f = new File (strFilePath);
			f.getAbsoluteFile();
			
			//Replace Text in file with test name
			modifyFile(strFilePath, "#####TESTNAME#####", strTestName);
			TimeUnit.SECONDS.sleep(1);
			d.get("file:///"+f.getAbsoluteFile());
			TimeUnit.SECONDS.sleep(3);
			modifyFile(strFilePath, strTestName, "#####TESTNAME#####");
			utility.close();
		}
		catch (Exception e) {
			
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

		long iDiffInMillis = 1271;
		System.out.println("iDiffInMillis : "+iDiffInMillis);
		double div = iDiffInMillis / 1000;
		double diffSeconds = (double) 1271 / 1000 % 60;
		//DecimalFormat secondsFormat = new DecimalFormat(".##");
		System.out.println("secondsFormat: "+diffSeconds);
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
