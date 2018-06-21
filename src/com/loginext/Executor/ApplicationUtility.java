package com.loginext.Executor;

import java.util.List;
import java.net.MalformedURLException;
import io.appium.java_client.android.AndroidDriver;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.remote.DesiredCapabilities;
 
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.application.Platform;
import java.lang.reflect.Type;
import com.google.gson.reflect.TypeToken;

import java.util.LinkedHashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import javax.jws.WebService;
import javax.management.timer.TimerNotification;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.plaf.basic.BasicSliderUI.ScrollListener;
import javax.swing.text.Position;
import javax.xml.ws.LogicalMessage;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.SystemUtils;
import org.apache.poi.ddf.EscherColorRef.SysIndexSource;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.util.SystemOutLogger;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.internal.LinkedTreeMap;
import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.internal.filter.ValueNode.JsonNode;

import io.appium.java_client.android.AndroidDriver;
import io.restassured.http.ContentType;
import io.restassured.http.Headers;
import io.restassured.internal.path.json.JsonPrettifier;
import io.restassured.response.Response;
import com.jayway.jsonpath.JsonPath;
import com.loginext.ExcelController.ReadExcel2;
import com.loginext.TestNGController.Reporter;
import com.loginext.TestNGController.TestNGRunner;
import com.loginext.TestNGController.TestReporter;
import com.opencsv.CSVReader;

import bsh.util.Util;
import java.util.LinkedList;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.print.Printable;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Struct;
import java.text.Collator;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.RuleBasedCollator;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.server.handler.GetElementAttribute;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ApplicationUtility 
{


	private int MAX_WAIT_TIME = 120;//120;//120;
	private int MAX_WAIT_TIME_FILE_DOWNLOADS = 240;//120;

	//Will Assign Page labels from app once test is started from initApp_PageLabels method
	JsonObject app_PageLabels = null;
	JsonArray app_MenuLabels = null;

	//Global LinkedHashMap Accross Application Library which stores parameterized data
	LinkedHashMap<String, String> dataMap;
	LinkedList <LinkedHashMap <String, String>> allOrdersData = new LinkedList ();

	public WebDriver driver = null;
	boolean rc = false;
	boolean isApplicationLaunched = false;
	String strLocalWebDownloadsDir = null;

	TestReporter report = null;

	public ApplicationUtility(TestReporter report){
		try {

			this.report = report;

			this.driver = Configuration.getWebDriverInstance();
			if (System.getProperty("user.name").toLowerCase().contains("jenkins")){
				System.out.println("Setting Execution Mode to CI...");
				this.MAX_WAIT_TIME = 120;
			}
			//this.driver.manage().window().maximize();


			//Set Downloads Directory
			String webDownloadsSystemDir = "";
			System.out.println("System User : "+System.getProperty("user.name"));
			if (System.getProperty("user.name").toLowerCase().contains("jenkins") || System.getProperty("user.name").toLowerCase().contains("ubuntu"))
			{
				//Get the shared direcotry where file is downloaded - when triggered in CI Mode
				webDownloadsSystemDir = "/dev/shm";//"/home/ubuntu" + "/Downloads";
			}
			else //if (Configuration.getConfigurationInstance().getExecutionMode().equalsIgnoreCase("Local"))
			{
				webDownloadsSystemDir = System.getenv("HOME") + "/Downloads";
			}
			strLocalWebDownloadsDir = webDownloadsSystemDir;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public ApplicationUtility(TestReporter report, boolean initializeDriver){
		try {

			this.report = report;

			if (initializeDriver)
			{
				this.driver = Configuration.getWebDriverInstance();	
			}
			
			if (System.getProperty("user.name").toLowerCase().contains("jenkins")){
				System.out.println("Setting Execution Mode to CI...");
				this.MAX_WAIT_TIME = 120;
			}
			//this.driver.manage().window().maximize();


			//Set Downloads Directory
			String webDownloadsSystemDir = "";
			System.out.println("System User : "+System.getProperty("user.name"));
			if (System.getProperty("user.name").toLowerCase().contains("jenkins") || System.getProperty("user.name").toLowerCase().contains("ubuntu"))
			{
				//Get the shared direcotry where file is downloaded - when triggered in CI Mode
				webDownloadsSystemDir = "/dev/shm";//"/home/ubuntu" + "/Downloads";
			}
			else //if (Configuration.getConfigurationInstance().getExecutionMode().equalsIgnoreCase("Local"))
			{
				webDownloadsSystemDir = System.getenv("HOME") + "/Downloads";
			}
			strLocalWebDownloadsDir = webDownloadsSystemDir;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	/**
	 * Creating separate application utility constructor to relaunch driver instance and recovering a dead webpage 
	 * @param report
	 */
	public void relaunchDriverInstance (){
		try {

			this.driver = Configuration.getWebDriverInstance();
			if (System.getProperty("user.name").toLowerCase().contains("jenkins")){
				System.out.println("Setting Execution Mode to CI...");
				this.MAX_WAIT_TIME = 120;
			}
			//this.driver.manage().window().maximize();


			//Set Downloads Directory
			String webDownloadsSystemDir = "";
			System.out.println("System User : "+System.getProperty("user.name"));
			if (System.getProperty("user.name").toLowerCase().contains("jenkins") || System.getProperty("user.name").toLowerCase().contains("ubuntu"))
			{
				//Get the shared direcotry where file is downloaded - when triggered in CI Mode
				webDownloadsSystemDir = "/dev/shm";//"/home/ubuntu" + "/Downloads";
			}
			else //if (Configuration.getConfigurationInstance().getExecutionMode().equalsIgnoreCase("Local"))
			{
				webDownloadsSystemDir = System.getenv("HOME") + "/Downloads";
			}
			strLocalWebDownloadsDir = webDownloadsSystemDir;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	/***Native Functions for performing operations on elements***/

	public boolean sendKeys (String strWebElementXPath ,String strText, String strElementName, boolean displayValueInReport)
	{
		try 
		{
			WebDriverWait wait = new WebDriverWait(driver, MAX_WAIT_TIME);
			WebElement element = driver.findElement(By.xpath(strWebElementXPath));
			//bringElementInView(element);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(strWebElementXPath)));
			//WebElement element = driver.findElement(By.xpath(strWebElementXPath));
			//element.click();
			element.sendKeys(strText);

			if (element.getAttribute("value").equalsIgnoreCase(strText) == false && displayValueInReport == true){
				TimeUnit.SECONDS.sleep(1);
			}

			//If Value is still blank Send Keys on object - Update - Vsometimes value in textbox gets cleared when tabbing out - 
			if (element.getAttribute("value").equalsIgnoreCase(strText) == false && displayValueInReport == true){
				element.clear();
				element.sendKeys(strText);
			}

			if (displayValueInReport == false){
				strText = "***";//Dont diplay the sensitive values for reporting...
			}


			logMessage("Enter in "+strElementName, 
					"Should be able to enter text in "+strElementName, 
					"Successfully entered text '"+strText+"' in "+strElementName,
					"Passed");

			return true;
		}
		catch (Exception e)
		{

			//Recovery
			if (iTimesRecoveryPerformed <= iMaxRecoveriesAllowed)
			{
				rc = recover();
				if (rc == true)//If recovery is successful - repeat same process again
				{
					//Call the same function using same args
					rc = sendKeys(strWebElementXPath, strText, strElementName, displayValueInReport);
					return rc;//Return positive cove back and continue execution
				}
				else
				{
					System.err.println("Failed in recovering test...");
				}
				/*
				//If the error is at first shot - try doing the same action again
				if (iTimesRecoveryPerformed == 1){
					rc = sendKeys(strWebElementXPath, strText, strElementName, displayValueInReport);
					return rc;//Return positive cove back and continue execution
				}*/
			}
			else
			{
				System.err.println("Reached Max Recovery Limit. Exit 0");
			}
			//Recovery End

			logMessage("Enter in "+strElementName, 
					"Should be able to enter text in "+strElementName, 
					"Unable to enter text '"+strText+"' in "+strElementName+" : XPath : "+strWebElementXPath+", Error "+e.getLocalizedMessage(),
					"Failed");
			e.printStackTrace();
			System.err.println("Unable to enter text : "+strText+" on WebElement with XPath : "+strWebElementXPath+"");
			return false;
		}
	}


	public boolean sendKeys_NoRecovery (String strWebElementXPath ,String strText, String strElementName, boolean displayValueInReport)
	{
		try 
		{
			WebDriverWait wait = new WebDriverWait(driver, MAX_WAIT_TIME);
			WebElement element = driver.findElement(By.xpath(strWebElementXPath));
			//bringElementInView(element);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(strWebElementXPath)));
			//WebElement element = driver.findElement(By.xpath(strWebElementXPath));
			//element.click();
			element.sendKeys(strText);

			if (element.getAttribute("value").equalsIgnoreCase(strText) == false && displayValueInReport == true){
				TimeUnit.SECONDS.sleep(1);
			}

			//If Value is still blank Send Keys on object - Update - Vsometimes value in textbox gets cleared when tabbing out - 
			if (element.getAttribute("value").equalsIgnoreCase(strText) == false && displayValueInReport == true){
				element.clear();
				element.sendKeys(strText);
			}

			if (displayValueInReport == false){
				strText = "***";//Dont diplay the sensitive values for reporting...
			}


			logMessage("Enter in "+strElementName, 
					"Should be able to enter text in "+strElementName, 
					"Successfully entered text '"+strText+"' in "+strElementName,
					"Passed");

			return true;
		}
		catch (Exception e)
		{

			logMessage("Enter in "+strElementName, 
					"Should be able to enter text in "+strElementName, 
					"Unable to enter text '"+strText+"' in "+strElementName+" : XPath : "+strWebElementXPath+", Error "+e.getLocalizedMessage(),
					"Failed");
			e.printStackTrace();
			System.err.println("Unable to enter text : "+strText+" on WebElement with XPath : "+strWebElementXPath+"");
			return false;
		}
	}
	
	public void focusElement (String strWebElementXPath){
		try 
		{

			//Store the current window handle
			String currentWindowHandle = driver.getWindowHandle();

			//run your javascript and alert code
			((JavascriptExecutor)driver).executeScript("alert('Test')"); 
			driver.switchTo().alert().accept();

			//Switch back to to the window using the handle saved earlier
			driver.switchTo().window(currentWindowHandle);

			//Adding wait after showing popup
			TimeUnit.SECONDS.sleep(3);
			
			//WebDriverWait wait = new WebDriverWait(driver, MAX_WAIT_TIME);
			WebElement element = driver.findElement(By.xpath(strWebElementXPath));

			Actions ob = new Actions(driver);
			ob.moveToElement(element);
			//ob.click(element);
			Action action  = ob.build();
			action.perform();
		}
		catch (Exception e) 
		{
			logMessage("Focus Element", "Should be able to focus element by XPath", "Unable to Focus Element by XPath - "+e.getMessage(), "Failed");
			e.printStackTrace();
		}
	}

	public boolean sendCharKeys (String strWebElementXPath , Keys key, String strElementName, boolean displayValueInReport)
	{
		try 
		{
			//Store the current window handle
			String currentWindowHandle = driver.getWindowHandle();

			//run your javascript and alert code
			((JavascriptExecutor)driver).executeScript("alert('Test')"); 
			driver.switchTo().alert().accept();

			//Switch back to to the window using the handle saved earlier
			driver.switchTo().window(currentWindowHandle);

			WebDriverWait wait = new WebDriverWait(driver, MAX_WAIT_TIME);
			WebElement element = driver.findElement(By.xpath(strWebElementXPath));

			Actions ob = new Actions(driver);
			ob.moveToElement(element);
			ob.click(element);
			Action action  = ob.build();
			action.perform();

			//bringElementInView(element);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(strWebElementXPath)));
			//WebElement element = driver.findElement(By.xpath(strWebElementXPath));
			element.click();
			//element.sendKeys(key);

			logMessage("Enter in "+strElementName, 
					"Should be able to enter text in "+strElementName, 
					"Successfully entered text '"+key+"' in "+strElementName,
					"Passed");

			return true;
		}
		catch (Exception e)
		{

			//Recovery
			if (iTimesRecoveryPerformed <= iMaxRecoveriesAllowed)
			{
				rc = recover();
				if (rc == true)//If recovery is successful - repeat same process again
				{
					//Call the same function using same args
					rc = sendCharKeys(strWebElementXPath, key, strElementName, displayValueInReport);
					return rc;//Return positive cove back and continue execution
				}
				else
				{
					System.err.println("Failed in recovering test...");
				}
				/*
				//If the error is at first shot - try doing the same action again
				if (iTimesRecoveryPerformed == 1){
					rc = sendCharKeys(strWebElementXPath, key, strElementName, displayValueInReport);
					return rc;//Return positive cove back and continue execution
				}*/
			}
			else
			{
				System.err.println("Reached Max Recovery Limit. Exit 0");
			}
			//Recovery End

			logMessage("Enter in "+strElementName, 
					"Should be able to enter text in "+strElementName, 
					"Unable to enter text '"+key+"' in "+strElementName+" : XPath : "+strWebElementXPath+", Error "+e.getLocalizedMessage(),
					"Failed");
			e.printStackTrace();
			System.err.println("Unable to enter text : "+key+" on WebElement with XPath : "+strWebElementXPath+"");
			return false;
		}
	}


	public boolean sendKeysFile (String strWebElementXPath ,String strText, String strElementName, boolean displayValueInReport)
	{
		try 
		{
			WebElement element = driver.findElement(By.xpath(strWebElementXPath));
			//Do not perform click operation when it is a file object
			//element.click();
			element.sendKeys(strText);

			logMessage("Enter in "+strElementName, 
					"Should be able to enter text in "+strElementName, 
					"Successfully entered text '"+strText+"' in "+strElementName,
					"Passed");

			return true;
		}
		catch (Exception e)
		{

			//Recovery
			if (iTimesRecoveryPerformed <= iMaxRecoveriesAllowed)
			{
				rc = recover();
				if (rc == true)//If recovery is successful - repeat same process again
				{
					//Call the same function using same args
					rc = sendKeysFile(strWebElementXPath, strText, strElementName, displayValueInReport);
					return rc;//Return positive cove back and continue execution
				}
				else
				{
					System.err.println("Failed in recovering test...");
				}
				/*
				//If the error is at first shot - try doing the same action again
				if (iTimesRecoveryPerformed == 1){
					rc = sendKeysFile(strWebElementXPath, strText, strElementName, displayValueInReport);
					return rc;//Return positive cove back and continue execution
				}*/
			}
			else
			{
				System.err.println("Reached Max Recovery Limit. Exit 0");
			}
			//Recovery End

			logMessage("Enter in "+strElementName, 
					"Should be able to enter text in "+strElementName, 
					"Unable to enter text '"+strText+"' in "+strElementName+" : XPath : "+strWebElementXPath+", Error "+e.getLocalizedMessage(),
					"Failed");
			e.printStackTrace();
			System.err.println("Unable to enter text : "+strText+" on WebElement with XPath : "+strWebElementXPath+"");
			return false;
		}
	}

	boolean mutedReporting = false;
	public void logMessage (
			String strStepToExecute, 
			String strExpected,
			String strActual,
			String strResult
			)
	{
		//Will be calling a reporter logging function to create a test run report
		System.out.println(strResult.toUpperCase() +" : "+strActual+" ");
		if (mutedReporting == false && report != null){
			report.logMessage(strStepToExecute, strExpected, strActual, strResult, driver);	
		}
	}

	public boolean clickElementByXPath (String strElementXPath, String strElementName){
		try {
			String strXPath = strElementXPath;//"//*[text()='Resource']";
			WebDriverWait wait = new WebDriverWait(driver, MAX_WAIT_TIME);
			//wait.until(ExpectedConditions.elementToBeClickable(By.xpath(strXPath)));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(strXPath)));
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(strXPath)));
			driver.findElement(By.xpath(strXPath)).click();
			logMessage("Click "+strElementName, "Should be able to click "+strElementName, "Successfully able to click "+strElementName, "Passed");
			System.out.println("XPath : "+strElementXPath);
			return true;
		} catch (Exception e) {

			//Recovery
			if (iTimesRecoveryPerformed <= iMaxRecoveriesAllowed)
			{
				rc = recover();
				if (rc == true)//If recovery is successful - repeat same process again
				{
					try {
						TimeUnit.SECONDS.sleep(2);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						System.err.println("Error in waiting...");
					}

					//Call the same function using same args
					rc = clickElementByXPath(strElementXPath, strElementName);
					return rc;//Return positive cove back and continue execution
				}
				else
				{
					System.err.println("Failed in recovering test...");
					//Try doing 
				}
				/*
				//If the error is at first shot - try doing the same action again
				if (iTimesRecoveryPerformed == 1){
					rc = clickElementByXPath(strElementXPath, strElementName);
					return rc;//Return positive cove back and continue execution
				}*/
			}
			else
			{
				System.err.println("Reached Max Recovery Limit. Exit 0");
			}
			//Recovery End

			logMessage("Click "+ strElementName, "Should be able to click "+strElementName, "Unable to click "+strElementName+" with XPath : "+strElementXPath, "Failed");
			e.printStackTrace();
			return false;
		}

	}
	

	public boolean clickElementByXPath_NoRecovery (String strElementXPath, String strElementName){
		try {
			String strXPath = strElementXPath;//"//*[text()='Resource']";
			WebDriverWait wait = new WebDriverWait(driver, MAX_WAIT_TIME);
			//wait.until(ExpectedConditions.elementToBeClickable(By.xpath(strXPath)));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(strXPath)));
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(strXPath)));

			driver.findElement(By.xpath(strXPath)).click();
			logMessage("Click "+strElementName, "Should be able to click "+strElementName, "Successfully able to click "+strElementName, "Passed");
			System.out.println("XPath : "+strElementXPath);
			return true;
		} catch (Exception e) {
			logMessage("Click "+ strElementName, "Should be able to click "+strElementName, "Unable to click "+strElementName, "Failed");
			e.printStackTrace();
			return false;
		}

	}
	

	public boolean scrollIntoElementByXPath_NoRecovery (String strElementXPath, String strElementName){
		try {

			String strXPath = strElementXPath;//"//*[text()='Resource']";
			WebDriverWait wait = new WebDriverWait(driver, MAX_WAIT_TIME);
			//wait.until(ExpectedConditions.elementToBeClickable(By.xpath(strXPath)));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(strXPath)));
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(strXPath)));

			WebElement element = driver.findElement(By.xpath(strXPath));
			((JavascriptExecutor) driver).executeScript(
					"arguments[0].scrollIntoView();", element);
			
			logMessage("Click "+strElementName, "Should be able to click "+strElementName, "Successfully able to click "+strElementName, "Passed");
			System.out.println("XPath : "+strElementXPath);
			return true;
		} catch (Exception e) {
			logMessage("Click "+ strElementName, "Should be able to click "+strElementName, "Unable to click "+strElementName, "Failed");
			e.printStackTrace();
			return false;
		}

	}
	

	public boolean clickElementByXPath_UsingActions_NoRecovery (WebDriver driver, String strElementXPath, String strElementName){
		try {
			/*String strXPath = strElementXPath;//"//*[text()='Resource']";
			WebDriverWait wait = new WebDriverWait(driver, MAX_WAIT_TIME);
			//wait.until(ExpectedConditions.elementToBeClickable(By.xpath(strXPath)));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(strXPath)));
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(strXPath)));
			*///driver.findElement(By.xpath(strXPath)).click();
			Actions actions = new Actions(driver);
			WebElement element = driver.findElement(By.xpath(strElementXPath));
			actions.moveToElement(element).click().perform();
			
			logMessage("Click "+strElementName, "Should be able to click "+strElementName, "Successfully able to click "+strElementName, "Passed");
			System.out.println("XPath : "+strElementXPath);
			return true;
		} catch (Exception e) {
			logMessage("Click "+ strElementName, "Should be able to click "+strElementName, "Unable to click "+strElementName, "Failed");
			e.printStackTrace();
			return false;
		}

	}

	public String getElementTextByXPath (String strElementXPath, String strElementName){
		try {
			String strXPath = strElementXPath;//"//*[text()='Resource']";
			WebDriverWait wait = new WebDriverWait(driver, MAX_WAIT_TIME);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(strXPath)));
			String strElementText = driver.findElement(By.xpath(strXPath)).getText();
			logMessage("Get Text for "+strElementName, "Should be able to get text for "+strElementName, "Successfully able to get text '"+strElementText+"' for "+strElementName, "Passed");
			return strElementText;
		} catch (Exception e) {

			//Recovery
			if (iTimesRecoveryPerformed <= iMaxRecoveriesAllowed)
			{
				rc = recover();
				if (rc == true)//If recovery is successful - repeat same process again
				{
					//Call the same function using same args
					String strElementText = getElementTextByXPath(strElementXPath, strElementName);
					return strElementText;//Return positive cove back and continue execution
				}
				else
				{
					System.err.println("Failed in recovering test...");
				}
				/*
				//If the error is at first shot - try doing the same action again
				if (iTimesRecoveryPerformed == 1){
					String strElementText = getElementTextByXPath(strElementXPath, strElementName);
					return strElementText;//Return positive cove back and continue execution
				}*/
			}
			else
			{
				System.err.println("Reached Max Recovery Limit. Exit 0");
			}
			//Recovery End

			logMessage("Get Text for "+ strElementName, "Should be able to get text for element : "+strElementName+"", "Unable to get text for "+strElementName +  " XPath : "+strElementXPath, "Failed");
			e.printStackTrace();
			return null;
		}
	}


	public String getPromptElementTextByXPath (String strElementXPath, String strElementName){
		try {
			String strXPath = strElementXPath;//"//*[text()='Resource']";
			//WebDriverWait wait = new WebDriverWait(driver, MAX_WAIT_TIME);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(strXPath)));
			String strElementText = driver.findElement(By.xpath(strXPath)).getText();
			logMessage("Get Text for "+strElementName, "Should be able to get text for "+strElementName, "Successfully able to get text '"+strElementText+"' for "+strElementName, "Passed");
			return strElementText;
		} catch (Exception e) {

			//Recovery
			if (iTimesRecoveryPerformed <= iMaxRecoveriesAllowed)
			{
				rc = recover();
				if (rc == true)//If recovery is successful - repeat same process again
				{
					//Call the same function using same args
					String strElementText = getPromptElementTextByXPath(strElementXPath, strElementName);
					return strElementText;//Return positive cove back and continue execution
				}
				else
				{
					System.err.println("Failed in recovering test...");
				}
				/*
				//If the error is at first shot - try doing the same action again
				if (iTimesRecoveryPerformed == 1){
					String strElementText = getPromptElementTextByXPath(strElementXPath, strElementName);
					return strElementText;//Return positive cove back and continue execution
				}*/
			}
			else
			{
				System.err.println("Reached Max Recovery Limit. Exit 0");
			}
			//Recovery End

			logMessage("Get Text for "+ strElementName, "Should be able to get text for element : "+strElementName+"", "Unable to get text for "+strElementName +  " XPath : "+strElementXPath, "Failed");
			e.printStackTrace();
			return null;
		}
	}



	public String getAttributeByXPath (String strElementXPath, String strElementName, String strAttributeName){
		try {
			String strXPath = strElementXPath;//"//*[text()='Resource']";
			WebDriverWait wait = new WebDriverWait(driver, MAX_WAIT_TIME);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(strXPath)));
			String strElementText = driver.findElement(By.xpath(strXPath)).getAttribute(strAttributeName);
			logMessage("Get Text for "+strElementName, "Should be able to get text for "+strElementName, "Successfully able to get attribute "+strAttributeName+" for '"+strElementText+"' for "+strElementName, "Passed");
			return strElementText;
		} catch (Exception e) {

			//Recovery
			if (iTimesRecoveryPerformed <= iMaxRecoveriesAllowed)
			{
				rc = recover();
				if (rc == true)//If recovery is successful - repeat same process again
				{
					//Call the same function using same args
					String strElementText = getAttributeByXPath(strElementXPath, strElementName, strAttributeName);
					return strElementText;//Return positive cove back and continue execution
				}
				else
				{
					System.err.println("Failed in recovering test...");
				}
				/*
				//If the error is at first shot - try doing the same action again
				if (iTimesRecoveryPerformed == 1){
					String strElementText = getAttributeByXPath(strElementXPath, strElementName, strAttributeName);
					return strElementText;//Return positive cove back and continue execution
				}*/
			}
			else
			{
				System.err.println("Reached Max Recovery Limit. Exit 0");
			}
			//Recovery End

			logMessage("Click "+ strElementName, "Should be able to get text for element : "+strElementName+"", "Unable to get attribute "+strAttributeName+" for "+strElementName +  " XPath : "+strElementXPath, "Failed");
			e.printStackTrace();
			return null;
		}

	}

	public boolean waitForELement (String strXPath){

		try {
			WebDriverWait wait = new WebDriverWait(driver, MAX_WAIT_TIME);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(strXPath)));
			return true;
		} catch (Exception e) {

			//Recovery
			if (iTimesRecoveryPerformed <= iMaxRecoveriesAllowed)
			{
				rc = recover();
				if (rc == true)//If recovery is successful - repeat same process again
				{
					//Call the same function using same args
					boolean rc = waitForELement(strXPath);
					return rc;//Return positive cove back and continue execution
				}
				else
				{
					System.err.println("Failed in recovering test...");
				}
				/*
				//If the error is at first shot - try doing the same action again
				if (iTimesRecoveryPerformed == 1){
					boolean rc = waitForELement(strXPath);
					return rc;
				}*/
			}
			else
			{
				System.err.println("Reached Max Recovery Limit. Exit 0");
			}
			//Recovery End

			logMessage("Wait for element" , "Should be able to wait for element", "Error on element wait", "Failed");
			System.err.println("Element with XPath : "+strXPath+" Not found...");
			//e.printStackTrace();
			return false;
		}

	} 


	//Will perform Send Keys Operation on a textbow with Javascript
	public boolean setValueByJavascript(WebDriver driver,String elementXPath, String strWebElementName, String value)
	{
		try 
		{

			WebDriverWait wait = new WebDriverWait(driver, MAX_WAIT_TIME);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(elementXPath)));
			WebElement element = driver.findElement(By.xpath(elementXPath));

			//bringElementInView(element);
			((JavascriptExecutor) driver).executeScript("arguments[0].value=arguments[1]", element,value);
			logMessage("Enter Text in "+strWebElementName, "Should be able to enter "+value+" in "+strWebElementName, "Successfully entered : '"+value+"' in '"+strWebElementName+"'", "Passed");
			clickElementByXPath(elementXPath, strWebElementName);
			return true;
		} 
		catch (Exception e) {

			//Recovery
			if (iTimesRecoveryPerformed <= iMaxRecoveriesAllowed)
			{
				rc = recover();
				if (rc == true)//If recovery is successful - repeat same process again
				{
					//Call the same function using same args
					boolean rc = setValueByJavascript(driver, elementXPath, strWebElementName, value);
					return rc;//Return positive cove back and continue execution
				}
				else
				{
					System.err.println("Failed in recovering test...");
				}
				/*
				//If the error is at first shot - try doing the same action again
				if (iTimesRecoveryPerformed == 1){
					boolean rc = setValueByJavascript(driver, elementXPath, strWebElementName, value);
					return rc;
				}*/
			}
			else
			{
				System.err.println("Reached Max Recovery Limit. Exit 0");
			}
			//Recovery End

			logMessage("Enter Text in "+strWebElementName, "Should be able to enter "+value+" in "+strWebElementName, "Unable to enter '"+value+"' in '"+strWebElementName+"'", "Failed");
			e.printStackTrace();
			return false;
		}
	}


	/**
	 * Perform check operation on element by XPath
	 * @param strCheckboxXPath - 
	 * @param strElementName
	 * @param check - if true will check the checkbox - if false will deselect the checkbox
	 * @return - true if the operation is performed
	 */
	public boolean clickCheckboxByXPath (String strCheckboxXPath, String strLabelXPath, String strElementName, boolean check) {
		try
		{

			//Find Element by XPath
			String strXPath = strCheckboxXPath;//"//*[text()='Resource']";
			try {
				WebDriverWait wait = new WebDriverWait(driver, MAX_WAIT_TIME);
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath(strLabelXPath)));

			} catch (Exception e) {
				e.printStackTrace();
			}

			if (check == true)
			{
				//If the element is already checked 
				if (driver.findElement(By.xpath(strXPath)).isSelected() == false){
					driver.findElement(By.xpath(strLabelXPath)).click();	
					logMessage("Check "+strElementName, "Should be able to check "+strElementName, "Successfully able to check - "+strElementName, "Passed");
				}
				else {
					logMessage("Check "+strElementName, "Should be able to check "+strElementName, "Element already checked - "+strElementName, "Passed");
				}
			}
			else if (check == false)  
			{
				//We need to deselect existing checkbox if check is false
				if (driver.findElement(By.xpath(strXPath)).isSelected()){
					driver.findElement(By.xpath(strLabelXPath)).click();	
					logMessage("Uncheck "+strElementName, "Should be able to Uncheck "+strElementName, "Successfully able to uncheck - "+strElementName, "Passed");
				}
				else {
					logMessage("Uncheck "+strElementName, "Should be able to Uncheck "+strElementName, "Element already Unchecked - "+strElementName + "", "Passed");
				}
			}

			return true;
		} catch (Exception e) {

			//Recovery
			if (iTimesRecoveryPerformed <= iMaxRecoveriesAllowed)
			{
				rc = recover();
				if (rc == true)//If recovery is successful - repeat same process again
				{
					//Call the same function using same args
					boolean rc = clickCheckboxByXPath(strCheckboxXPath, strLabelXPath, strElementName, check);
					return rc;//Return positive cove back and continue execution
				}
				else
				{
					System.err.println("Failed in recovering test...");
				}
				/*
				//If the error is at first shot - try doing the same action again
				if (iTimesRecoveryPerformed == 1){
					boolean rc = clickCheckboxByXPath(strCheckboxXPath, strLabelXPath, strElementName, check);
					return rc;
				}*/
			}
			else
			{
				System.err.println("Reached Max Recovery Limit. Exit 0");
			}
			//Recovery End

			e.printStackTrace();
			logMessage("Click "+strElementName, "Should be able to click "+strElementName, "Unable to perform action on checkbox - "+strElementName+ ": XPath "+strCheckboxXPath +" Error : "+e.getLocalizedMessage(), "Failed");
			return false;
		}
	}

	

	/**
	 * Perform check operation on element by XPath
	 * @param strCheckboxXPath - 
	 * @param strElementName
	 * @param check - if true will check the checkbox - if false will deselect the checkbox
	 * @return - true if the operation is performed
	 */
	public boolean clickCheckboxByXPath_NoRecovery (WebDriver driver, String strCheckboxXPath, String strElementName, boolean check) {
		try
		{

			//Find Element by XPath
			String strXPath = strCheckboxXPath;//"//*[text()='Resource']";
			try {
				WebDriverWait wait = new WebDriverWait(driver, MAX_WAIT_TIME);
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath(strCheckboxXPath)));

			} catch (Exception e) {
				e.printStackTrace();
			}

			if (check == true)
			{
				//If the element is already checked 
				if (driver.findElement(By.xpath(strXPath)).isSelected() == false){
					driver.findElement(By.xpath(strCheckboxXPath)).click();	
					logMessage("Check "+strElementName, "Should be able to check "+strElementName, "Successfully able to check - "+strElementName, "Passed");
				}
				else {
					logMessage("Check "+strElementName, "Should be able to check "+strElementName, "Element already checked - "+strElementName, "Passed");
				}
			}
			else if (check == false)  
			{
				//We need to deselect existing checkbox if check is false
				if (driver.findElement(By.xpath(strXPath)).isSelected()){
					driver.findElement(By.xpath(strCheckboxXPath)).click();	
					logMessage("Uncheck "+strElementName, "Should be able to Uncheck "+strElementName, "Successfully able to uncheck - "+strElementName, "Passed");
				}
				else {
					logMessage("Uncheck "+strElementName, "Should be able to Uncheck "+strElementName, "Element already Unchecked - "+strElementName + "", "Passed");
				}
			}

			return true;
		} catch (Exception e) {
			e.printStackTrace();
			logMessage("Click "+strElementName, "Should be able to click "+strElementName, "Unable to perform action on checkbox - "+strElementName+ ": XPath "+strCheckboxXPath +" Error : "+e.getLocalizedMessage(), "Failed");
			return false;
		}
	}


	public boolean clickElementByJavascript(WebDriver driver, String strElementXPath, String strElementName) {
		try {
			String strXPath = strElementXPath;
			WebDriverWait wait = new WebDriverWait(driver, MAX_WAIT_TIME);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(strXPath)));
			WebElement element = driver.findElement(By.xpath(strXPath));
			((JavascriptExecutor) driver).executeScript("arguments[0].click()", element);
			logMessage("Click Element "+strElementName, "Should be able to click element", "Successfully clicked Element - "+strElementName, "Passed");
			return true;
		} catch (Exception e) {

			//Recovery
			if (iTimesRecoveryPerformed <= iMaxRecoveriesAllowed)
			{
				rc = recover();
				if (rc == true)//If recovery is successful - repeat same process again
				{
					//Call the same function using same args
					boolean rc = clickElementByJavascript(driver, strElementXPath, strElementName);
					return rc;//Return positive cove back and continue execution
				}
				else
				{
					System.err.println("Failed in recovering test...");
				}
				/*
				//If the error is at first shot - try doing the same action again
				if (iTimesRecoveryPerformed == 1){
					boolean rc = clickElementByJavascript(driver, strElementXPath, strElementName);
					return rc;
				}*/
			}
			else
			{
				System.err.println("Reached Max Recovery Limit. Exit 0");
			}
			//Recovery End

			e.printStackTrace();
			logMessage("Click Element "+strElementName, "Should be able to click element", "Unable to click element - "+strElementName+", Identified with XPath - "+strElementXPath , "Failed");
			return false;
		}
	}



	public boolean udsSelectLM_Dropdown (String strDropdownSelectObjectName, String strDropDownDisplayName,String strOptionToSelect){
		try 
		{
			String strDropDownSelect = strDropdownSelectObjectName;//"//div[@id='id-branch-name']";
			String strDropdownInputBox = strDropdownSelectObjectName+"//input";//"//div[@id='id-branch-name']/input";
			rc = clickElementByXPath(strDropDownSelect, strDropDownDisplayName//"Branch Name Textbox"
					);
			TimeUnit.SECONDS.sleep(1);
			rc = clickElementByXPath(strDropDownSelect, strDropDownDisplayName//"Branch Name Textbox"
					);
			rc = sendKeys(strDropdownInputBox, strOptionToSelect, strDropDownDisplayName, true);
			String strOptionText = strDropDownSelect + "//div[translate(., 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz') = '"+strOptionToSelect.toLowerCase()+"']";
			//"//div[translate(., 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz') = '"+strOptionToSelect+"']";
			//"//div[.='"+strOptionToSelect+"']";
			rc = clickElementByXPath(strOptionText, "Option - "+strOptionToSelect.toLowerCase());
			Assert.assertTrue(rc);

			return true;
		} catch (Exception e) {

			//Recovery
			if (iTimesRecoveryPerformed <= iMaxRecoveriesAllowed)
			{
				rc = recover();
				if (rc == true)//If recovery is successful - repeat same process again
				{
					//Call the same function using same args
					boolean rc = udsSelectLM_Dropdown(strDropdownSelectObjectName, strDropDownDisplayName, strOptionToSelect);//clickElementByJavascript(driver, strElementXPath, strElementName);
					return rc;//Return positive cove back and continue execution
				}
				else
				{
					System.err.println("Failed in recovering test...");
				}
				/*
				//If the error is at first shot - try doing the same action again
				if (iTimesRecoveryPerformed == 1){
					boolean rc = udsSelectLM_Dropdown(strDropdownSelectObjectName, strDropDownDisplayName, strOptionToSelect);//clickElementByJavascript(driver, strElementXPath, strElementName);
					return rc;
				}*/
			}
			else
			{
				System.err.println("Reached Max Recovery Limit. Exit 0");
			}
			//Recovery End

			e.printStackTrace();
			return false;
		}
	}



	/**
	 * Recovery Scenario to handle unexpected popup eg. "Route Optimized" at any moment in time of executing test
	 */

	int iTimesRecoveryPerformed = 0; // Verify Recovery Flag at time of performing action, In Case of failiures or exception and if inRecoveryMode flag is true than - call recovery method with the same arguments 
	int iMaxRecoveriesAllowed = 3;

	int iTimesAPI_RecoveryPerformed = 0; 
	int iMaxAPI_RecoveryAllowed = 3;

	//Check For Trip Popup - Routes Optimized - //*[text()='Routes Optimized'] - //Label - asyncPlanRouteOptimized 
	//Click Close - //*[text()='Routes Optimized']//preceding::button[contains(@class, 'close-button')][1] or //*[text()='Routes Optimized']//preceding::button[contains(@class, 'close')][1]
	//Add this error handling scenario at times of 
	//PerformingClicks - ClickElementByXPath
	//PerformingClicks JS -
	//SendKeys
	//SendKeys JS 
	//Checkbox 
	//Radio Buttons
	//GetElementText

	public boolean recover ()
	{
		iTimesRecoveryPerformed ++; // incrementing recovery flag - in order to state that - we have tried recovering application once

		try 
		{
			System.out.println("iTimesRecoveryPerformed : "+iTimesRecoveryPerformed);
			System.out.println("iMaxRecoveriesAllowed : "+iMaxRecoveriesAllowed);

			if (iTimesRecoveryPerformed <= iMaxRecoveriesAllowed){

				String strScreenshot = captureScreenshot(driver);
				logMessage("Recovery Mode "+iTimesRecoveryPerformed, "Should be able to perform popup recovery", "Verifying whether any popups covers the application object - <a target='_blank' href="+strScreenshot+">Screenshot</a> ", "Passed");
				LinkedHashMap<String, String> row = getTempData();
				String strRouteOptimizedLabel = getLabel_PageLabelAPI(row, "asyncPlanRouteOptimized");//'Routes Optimized' Header
				if (strRouteOptimizedLabel == null){
					System.err.println("Unable to fetch label details, Probably application is not logged in...");
					return false;
				}
				String strCloseRoutePopupXPath = "//*[text()='"+strRouteOptimizedLabel+"']//preceding::button[contains(@class, 'close')][1]";
				rc = clickElementByXPath(strCloseRoutePopupXPath, "Close Popup Button");
				//return rc;

			}
			else {
				logMessage("Recovery Mode "+iTimesRecoveryPerformed, "Should be able to perform application recovery", "Allowable limit exceeded in recovering application - Marked as failiure", "Failed");
				return false;
			}
			return rc;
		}
		catch (Exception e) 
		{
			System.err.println("Error in Recovering");
			logMessage("Recovery Mode "+iTimesRecoveryPerformed, "Should be able to perform popup recovery", "Failed in recovering application, Popup not displayed", "Failed");
			e.printStackTrace();
			return false;
		}
	}

	/** Recovery Scenario End ***/

	/*** Native Functions End ***/



	//Add order Location
	public LinkedHashMap<String, String> addOrderTest (LinkedHashMap <String, String> row)
	{
		try {

			rc = true;

			/*Test Steps ***/
			rc = launchApplication (row);
			Assert.assertTrue(rc);

			rc = login (row);
			Assert.assertTrue(rc);

			//Get login API auth key and client secret
			row = getAuthDetailsWeb (row);//
			if (row == null)
			{
				System.out.println("Auth data is null.. exiting test");
				return null;
			}
			System.out.println("Successfully fetched row data...");
			
			updateTempData(row);

			//Get all labels associated with application
			rc = initApp_PageLabels(row);
			Assert.assertTrue(rc);

			rc = initApp_MenuItems(row);
			Assert.assertTrue(rc);

			/*** Page Elements ***/
			String strOrderLabel = getMenuName("order");//Orders also reffered to as Tasks
			String strOrderMenu = "//*[text()="+strOrderLabel+"]";
			String strAllOrdersMenuItem = "//*[@logi-google-analytics='order']";
			String strAddButton = "//*[contains (@logi-google-analytics, 'Orders - Add')]";// "//*[contains (@class,'icon-add')]"; // "//*[@class='logi-icon icon-Product-Icons_Add']";// "//*[contains (@class,'icon-add')]";

			//Wait for Dashboard to load
			//***waitForELement(strDashBoard);

			isApplicationLaunched = true;

			//Click Order
			rc = clickElementByXPath(strOrderMenu, "Order");
			Assert.assertTrue(rc);

			//Adding wait for firefox 
			TimeUnit.SECONDS.sleep(2);

			//Click All Orders
			rc = clickElementByJavascript(driver, strAllOrdersMenuItem, "All Orders");//clickElementByXPath(strAllOrdersMenuItem, "All Orders");
			Assert.assertTrue(rc);

			//Adding wait for firefox 
			TimeUnit.SECONDS.sleep(3);

			//Click Add Button - //*[contains (@class,'icon-add')] - class='logi-icon icon-Product-Icons_Add'
			rc = clickElementByXPath(strAddButton, "Add Button");
			Assert.assertTrue(rc);

			isApplicationLaunched = true;

			//Get page structure
			String strPageStructureURL = "LoginApp/framework/structure?modelName=ORDERS&pageName=ORDERS&sectionName=ADD_ORDER_FORM";
			JsonElement pageStructure = getOrderPageStructure(row, row.get("URL")+strPageStructureURL);
			if (pageStructure == null || pageStructure.getAsJsonObject().size() == 0){
				return null;
			}
			String strOrdersPageStructure = pageStructure.toString();
			System.out.println("strOrdersPageStructure: "+strOrdersPageStructure);

			//Fetch Order Page Specific TestData
			//String strSheetName = "DataMap";
			String strPageName = "Orders_Page";
			LinkedHashMap<String, String> pageDataMap = getPageObjects(row, strPageName); // ReadExcel2.readSortedTestDataMap(strSheetName, strPageName);

			//Perform substitution of keywords or functions like AUTOGEN / DATE / BOOLEAN / INTEGER / DECIMAL etc from DataSheet with actual values,
			updateTempData(row);
			pageDataMap = substituteDataMapKeywords (pageDataMap);

			//Assign Values back to main dataset if these are initialized
			String addedOrder = pageDataMap.get("orderNo");
			System.out.println("addedOrder: "+addedOrder);
			String strOrderedDate = pageDataMap.get("shipmentOrderDt");
			System.out.println("strOrderedDate: "+strOrderedDate);
			String strStartTime = pageDataMap.get("StartTimeWindow");
			System.out.println("strStartTime: "+strStartTime);
			String strEndTime = pageDataMap.get("EndTimeWindow");
			System.out.println("strEndTime: "+strEndTime);
			String strOrderValue = pageDataMap.get("packageValue");
			System.out.println("strEndTime: "+strEndTime);

			row.put("OrderNumber", addedOrder);
			row.put("OrderDate", strOrderedDate);
			row.put("OrderStartDate", strStartTime);
			row.put("OrderEndDate",strEndTime);
			row.put("OrderValue",strOrderValue);

			//Enter Data on orders page
			rc = enterValues (pageDataMap, strOrdersPageStructure);
			Assert.assertTrue(rc);

			TimeUnit.SECONDS.sleep(3);

			//Enter Crate Information in Modal - 
			rc = enterCrateItems();
			Assert.assertTrue(rc);

			TimeUnit.SECONDS.sleep(12);

			//Click Save Button for Order
			String strSaveButton = "//*[@logi-google-analytics='Orders Add : save']";//"//button[@type='submit' and text()='Save']";
			rc = clickElementByXPath(strSaveButton, "Save Order Button");
			Assert.assertTrue(rc);

			TimeUnit.SECONDS.sleep(9);

			//Verify JS Prompt - Order Created Successfully
			//String strPromptXPath = "//*[@id='js-prompt']";
			String strExpectedPromptValue = app_PageLabels.get("orderCreatedSuccessfully").getAsString();//"";//orderCreatedSuccessfully//Order Created Successfully
			System.out.println("strExpectedPromptValue: "+strExpectedPromptValue);

			//Get Text from Prompt
			//String strPromptValue = getElementTextByXPath(strPromptXPath, "Prompt");

			//Wait for prompt message //
			String strPromptXPath = "//*[@id='js-prompt']";//"//*[@id='js-prompt']";
			rc = waitForJS_PromptMessageJS(strExpectedPromptValue, strPromptXPath);// waitForJS_PromptMessage(strExpectedPromptValue);

			if (rc)
			{
				logMessage("Verify Success Message", "Success Message - "+strExpectedPromptValue+" Successfully should display", "Message : "+strExpectedPromptValue+" is displayed", "Passed");
			}
			else
			{
				String strPromptValue = getPromptElementTextByXPath(strPromptXPath, "Prompt");//getElementTextByXPath(strPromptXPath, "Prompt");
				logMessage("Verify Success Message", "Success Message - "+strExpectedPromptValue+" should display", "Success Message is not displayed, Unable to create an order, Expecting Message : "+strExpectedPromptValue+" Actual : "+strPromptValue, "Failed");
				return null;
			}

			System.out.println("Successfully added order : "+addedOrder);
			updateTempData(row);

			return pageDataMap; //true;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}


	public boolean waitForJS_PromptMessage(String strExpectedMessage) {
		try 
		{
			boolean jsPromptHasText = false;
			String strXPath = "//*[@id='js-prompt']";
			int iCtr=0;
			do 
			{
				WebElement jsPrompt = driver.findElement(By.xpath(strXPath));
				String strJsPromptMessage = jsPrompt.getText();
				System.out.println(iCtr+" : strJsPromptMessage : "+strJsPromptMessage +" : Expected : "+strExpectedMessage);
				if (strExpectedMessage != null && strExpectedMessage.equalsIgnoreCase(strJsPromptMessage)){
					jsPromptHasText = true;
					break;
				}
				iCtr ++;
				TimeUnit.SECONDS.sleep(3);
			}while (jsPromptHasText == false && iCtr < MAX_WAIT_TIME);

			if (jsPromptHasText == false){
				System.err.println("Failed to get text from JS Prompt Message..");
			}
			return jsPromptHasText;
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			return false;
		}

	}


	public boolean waitForJS_PromptMessageJS(String strExpectedMessage , String strElementXPath) {
		try 
		{
			boolean jsPromptHasText = false;
			String strXPath = strElementXPath;// "//*[@id='js-prompt']";
			int iCtr=0;
			do 
			{
				//WebElement jsPrompt = driver.findElement(By.xpath(strXPath));
				String strJsPromptMessage = "";
				try {
					strJsPromptMessage = (String) ((JavascriptExecutor) driver).executeScript("return document.getElementById('js-prompt').innerText").toString().trim();
				} catch (Exception e) {
					e.printStackTrace();
				}
				// jsPrompt.getText();
				System.out.println(iCtr+" : strJsPromptMessage : "+strJsPromptMessage +" : Expected : "+strExpectedMessage);
				if (strExpectedMessage != null && strExpectedMessage.toLowerCase().contains(strJsPromptMessage.toLowerCase())){
					jsPromptHasText = true;
					break;
				}
				iCtr ++;
				TimeUnit.SECONDS.sleep(3);
			}while (jsPromptHasText == false && iCtr < MAX_WAIT_TIME);

			if (jsPromptHasText == false){
				System.err.println("Failed to get text from JS Prompt Message..");

				//Display Message
				((JavascriptExecutor) driver).executeScript("document.getElementById('js-prompt').style.display='block';");//document.getElementById('js-prompt').style.display='block';
			}
			return jsPromptHasText;
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			return false;
		}

	}


	public int waitForTripPlanningCount () {
		try 
		{
			int iTotalTripsCreated = 0;
			int iCtr=0;
			String strTripPlanningCount = "";
			do 
			{
				String strTriPlanningCountBadgeXPath = "//i[contains(@class, '-trip-formed')]//ancestor::div[@class='row'][1]//div[contains (@class, 'badgeCount')]";
				try {
					WebElement tripCountBadge = driver.findElement(By.xpath(strTriPlanningCountBadgeXPath));
					strTripPlanningCount = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText", tripCountBadge);
					iTotalTripsCreated = Integer.parseInt(strTripPlanningCount);
					if (iTotalTripsCreated > 0){
						System.out.println("Trips Created exiting .. strTripPlanningCount:  "+strTripPlanningCount);
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				if (strTripPlanningCount != null && strTripPlanningCount.length() > 0){
					//break;
				}
				// jsPrompt.getText();
				System.out.println(iCtr+" : strTripPlanningCount : "+strTripPlanningCount +" : Expected : Non zero");
				/*if (strExpectedMessage.equalsIgnoreCase(strJsPromptMessage)){
					jsPromptHasText = true;
					break;
				}*/
				iCtr ++;
				TimeUnit.SECONDS.sleep(3);
			}while (iTotalTripsCreated == 0 && iCtr < MAX_WAIT_TIME);

			if (iTotalTripsCreated == 0)
			{
				logMessage("Verify Trips are created", "Trips should be created", "Trips are not created", "Failed");
			}
			return iTotalTripsCreated;
		}
		catch (Exception e) 
		{
			logMessage("Fetch Trips created", "Should be able to fetch trips created", "Error in getting trips count : "+e.getLocalizedMessage(), "Failed");
			e.printStackTrace();
			return -1;
		}

	}



	public LinkedHashMap <String, String> getPageObjects (LinkedHashMap <String, String> row, String strPageName){

		boolean addValueToDataMap = false;
		LinkedHashMap <String, String> pageObjects = new LinkedHashMap <String, String> ();
		for(String strCurrentKey : row.keySet())
		{
			if (strCurrentKey.equalsIgnoreCase(strPageName + "_End")){
				addValueToDataMap = false;
			}

			if (addValueToDataMap == true){
				pageObjects.put(strCurrentKey, row.get(strCurrentKey));	
			}

			//add to testdata map only if the value is present in between the limits of page_structure eg - Orders_Page_Start and Orders_Page_End
			if (strCurrentKey.equalsIgnoreCase(strPageName + "_Start")){
				addValueToDataMap = true;
			}					
		}

		return pageObjects;
	}

	/**
	 * This function is responsible for performing actions on an object for a given page like Orders/Vehicle/DeliveryBoy
	 * 
	 * @param pageDataMap - will read through the data map present from datasheet and iterate over it to feed in data based on fieldType present in page structure, The order of element keys in this Map(LinkedLinkedHashMap) will determine the sequence of actions performed on the page
	 * @param strOrdersPageStructure - page structure string body retrieved from page structure API for that particular page eg. Orders/Vehicle/etc... - <br/><i><b><tab>Sample Dataset</b></i>- {"general details":{"distributionCenter":{"label":"Branch Name","fieldName":"Branch Name","fieldType":"select","permission":true,"id":"distributionCenter","required":true,"options":[],"childLength":0,"rowSpan":0,"colSpan":0,"lookupType":"getBranches","validation":{"required":{"message":"Branch Name is required."}},"labelKey":"Branch Name","infoTool":[{"key":"orders_distributionCenter_infotip","message":"Use this field to ensure that your Orders are assigned to the Delivery Boys of the right Branch"}],"allowed":false,"searchable":false,"editable":true,"sortable":false,"infoFlag":true},"hubName":{"label":"Return to Hub","fieldName":"Return to Hub","fieldType":"select","permission":true,"id":"hubName","required":true,"options":[],"childLength":0,"rowSpan":0,"colSpan":0,"lookupType":"getBranches","validation":{"required":{"message":"Return to Hub Name is mandatory."}},"labelKey":"Return to Hub","infoTool":[{"key":"orders_hubName_infotip","message":"Indicates the hub specified to which this Order will be returned to"}],"allowed":false,"searchable":false,"editable":true,"sortable":false,"infoFlag":true}},"order details":{"orderNo":{"label":"Order Number","fieldName":"Order Number","fieldType":"text","permission":true,"id":"orderNo","required":true,"childLength":0,"rowSpan":0,"colSpan":0,"validation":{"required":{"message":"Order No. is mandatory."},"alphanumeric":{"message":"Order No. must be alphanumeric."},"maxlength":{"args":"40","message":"Order Number must be maximum 40 characters long."}},"labelKey":"Order Number","allowed":false,"searchable":false,"editable":true,"sortable":false,"infoFlag":false},"awbNumber":{"label":"PO Number","fieldName":"Airway Bill Number","fieldType":"text","permission":true,"id":"awbNumber","required":false,"childLength":0,"rowSpan":0,"colSpan":0,"validation":{"maxlength":{"args":"128","message":"Airway Bill Number must be maximum 128 characters long."}},"labelKey":"Airway Bill Number","allowed":false,"searchable":false,"editable":true,"sortable":false,"infoFlag":false},"shipmentOrderDt":{"label":"Order Date","fieldName":"Order Date","fieldType":"moreValidity","permission":true,"id":"shipmentOrderDt","required":true,"childLength":0,"rowSpan":0,"colSpan":0,"validation":{"required":{"message":"Order Date is mandatory."}},"labelKey":"Order Date","allowed":false,"searchable":false,"editable":true,"sortable":false,"infoFlag":false},"deliveryType":{"label":"Delivery Type","fieldName":"Delivery Type","fieldType":"multiselect","permission":true,"id":"deliveryType","required":false,"options":[],"childLength":0,"rowSpan":0,"colSpan":0,"lookupType":"deliveryType","validation":{},"labelKey":"Delivery Type","infoTool":[{"key":"orders_deliveryType_infotip","message":"Indicates further classifications for an Order representing product type/ area serviced/ type of Delivery Boy used"}],"allowed":false,"searchable":false,"editable":true,"sortable":false,"infoFlag":true},"numberOfItems":{"label":"Number of Items","fieldName":"Number of Items","fieldType":"ordercratetextinput","permission":true,"id":"numberOfItems","required":false,"childLength":0,"rowSpan":0,"colSpan":0,"validation":{},"labelKey":"Number of Items","allowed":false,"searchable":false,"editable":true,"sortable":false,"infoFlag":false},"packageWeight":{"label":"Weight (Kg)","fieldName":"Weight (#@#weight#@#)","fieldType":"number","permission":true,"id":"packageWeight","required":false,"childLength":0,"rowSpan":0,"colSpan":0,"validation":{"maxlength":{"args":"15","message":"Weight (kg) must be maximum 15 characters long."}},"labelKey":"Weight (#@#weight#@#)","allowed":false,"searchable":false,"editable":true,"sortable":false,"infoFlag":false},"packageVolume":{"label":"Volume (Cc)","fieldName":"Volume (#@#volume#@#)","fieldType":"text","permission":true,"id":"packageVolume","required":false,"childLength":0,"rowSpan":0,"colSpan":0,"validation":{"maxlength":{"args":"15","message":"Volume (cc) must be maximum 15 characters long."}},"labelKey":"Volume (#@#volume#@#)","allowed":false,"searchable":false,"editable":true,"sortable":false,"infoFlag":false},"paymentType":{"label":"Payment Mode","fieldName":"Payment Mode","fieldType":"select","permission":true,"id":"paymentType","required":false,"options":[],"childLength":0,"rowSpan":0,"colSpan":0,"lookupType":"paymentMode","validation":{},"labelKey":"Payment Mode","allowed":false,"searchable":false,"editable":true,"sortable":false,"infoFlag":false},"packageValue":{"label":"Value","fieldName":"Value","fieldType":"text","permission":true,"id":"packageValue","required":false,"childLength":0,"rowSpan":0,"colSpan":0,"validation":{"maxlength":{"args":"15","message":"Value must be maximum 15 characters long."}},"labelKey":"Value","allowed":false,"searchable":false,"editable":true,"sortable":false,"infoFlag":false},"ServiceTime":{"label":"ServiceTime","fieldName":"ServiceTime","fieldType":"number","permission":true,"id":"ServiceTime","required":false,"childLength":0,"rowSpan":0,"colSpan":0,"validation":{"maxlength":{"args":"9.0","message":"Service Time must be maximum 9 characters long."},"numeric":{"message":"Service Time must be numeric."}},"labelKey":"Service Time","allowed":false,"searchable":false,"editable":true,"sortable":false,"infoFlag":false},"StartTimeWindow":{"label":"Start Time ","fieldName":"Start Time ","fieldType":"moreValidity","permission":true,"id":"StartTimeWindow","required":true,"childLength":0,"rowSpan":0,"colSpan":0,"validation":{"required":{"message":"Start Time Window is mandatory."}},"labelKey":"Start Time ","allowed":false,"searchable":false,"editable":true,"sortable":false,"infoFlag":false},"EndTimeWindow":{"label":"End Time","fieldName":"End Time","fieldType":"moreValidity","permission":true,"id":"EndTimeWindow","required":true,"childLength":0,"rowSpan":0,"colSpan":0,"validation":{"required":{"message":"End Time Window is mandatory."}},"labelKey":"End Time","allowed":false,"searchable":false,"editable":true,"sortable":false,"infoFlag":false},"isPartialDeliveryAllowedFl":{"label":"Partial Delivery Allowed","fieldName":"Partial Delivery Allowed","fieldType":"toggleBox","permission":true,"id":"isPartialDeliveryAllowedFl","required":false,"options":[],"childLength":0,"rowSpan":0,"colSpan":0,"lookupType":"delMedType","validation":{},"labelKey":"Partial Delivery Allowed","allowed":false,"searchable":false,"editable":true,"sortable":false,"infoFlag":false},"returnAllowedFl":{"label":"Sales Return Allowed","fieldName":"Sales Return Allowed","fieldType":"toggleBox","permission":true,"id":"returnAllowedFl","required":false,"options":[],"childLength":0,"rowSpan":0,"colSpan":0,"lookupType":"delMedType","validation":{},"labelKey":"Sales Return Allowed","infoTool":[{"key":"orders_returnAllowedFl_infotip","message":"Indicates whether or not an Order is eligible for returns"}],"allowed":false,"searchable":false,"editable":true,"sortable":false,"infoFlag":true},"cancellationAllowedFl":{"label":"Order Cancellation Allowed","fieldName":"Order Cancellation Allowed","fieldType":"toggleBox","permission":true,"id":"cancellationAllowedFl","required":false,"options":[],"childLength":0,"rowSpan":0,"colSpan":0,"lookupType":"delMedType","validation":{},"labelKey":"Order Cancellation Allowed","allowed":false,"searchable":false,"editable":true,"sortable":false,"infoFlag":false}},"pick up details":{"pickupAccountCode":{"label":"Customer ID","fieldName":"Customer ID","fieldType":"text","permission":true,"id":"pickupAccountCode","required":true,"options":[],"childLength":0,"rowSpan":0,"colSpan":0,"lookupType":"getcustomer","validation":{"required":{"message":"Pickup Customer id  is mandatory."},"maxlength":{"args":"255","message":"Pickup Customer ID must be maximum 255 characters long."}},"labelKey":"Customer ID","allowed":false,"searchable":false,"editable":true,"sortable":false,"infoFlag":false},"pickupAccountName":{"label":"Name","fieldName":"Name","fieldType":"text","permission":true,"id":"pickupAccountName","required":true,"childLength":0,"rowSpan":0,"colSpan":0,"validation":{"required":{"message":"Pickup Customer name is mandatory."},"maxlength":{"args":"255","message":"Pickup Name must be maximum 255 characters long."}},"labelKey":"Name","allowed":false,"searchable":false,"editable":true,"sortable":false,"infoFlag":false},"pickupEmail":{"label":"Email ID","fieldName":"Email ID","fieldType":"email","permission":true,"id":"pickupEmail","required":false,"childLength":0,"rowSpan":0,"colSpan":0,"validation":{"maxlength":{"args":"100","message":"Pickup Email ID must be maximum 100 characters long."}},"labelKey":"Email ID","allowed":false,"searchable":false,"editable":true,"sortable":false,"infoFlag":false},"pickupPhoneNumber":{"label":"Contact Number","fieldName":"Contact Number","fieldType":"tel","permission":true,"id":"pickupPhoneNumber","required":false,"childLength":0,"rowSpan":0,"colSpan":0,"validation":{"maxlength":{"args":"20","message":"Pickup Contact Number must be maximum 20 characters long."},"phonenumber":{"args":"","message":"INVALID Mobile Number"}},"labelKey":"Contact Number","allowed":false,"searchable":false,"editable":true,"sortable":false,"infoFlag":false},"addressFields":{"label":"addressFields","fieldName":"addressFields","fieldType":"address","permission":true,"id":"addressFields","required":false,"childLength":8,"rowSpan":0,"colSpan":0,"childNodes":{"pickupCountry":{"label":"Country","fieldName":"Country","fieldType":"select","permission":true,"id":"pickupCountry","required":true,"options":[],"childLength":0,"rowSpan":0,"colSpan":0,"lookupType":"getLocale","validation":{"required":{"message":"Pickup country is mandatory."}},"labelKey":"Country","allowed":false,"searchable":false,"editable":true,"sortable":false,"infoFlag":false},"pickupApartment":{"label":"Apartment","fieldName":"Apartment","fieldType":"text","permission":true,"id":"pickupApartment","required":true,"childLength":0,"rowSpan":0,"colSpan":0,"validation":{"maxlength":{"args":"512","message":"Pickup Apartment must be maximum 512 characters long."},"required":{"message":"Pickup apartment is mandatory."}},"labelKey":"Apartment","allowed":false,"searchable":false,"editable":true,"sortable":false,"infoFlag":false},"pickupStreetName":{"label":"Society / Street","fieldName":"Society / Street","fieldType":"text","permission":true,"id":"pickupStreetName","required":true,"childLength":0,"rowSpan":0,"colSpan":0,"validation":{"maxlength":{"args":"255","message":"Pickup Society / Street must be maximum 255 characters long."},"required":{"message":"Pickup street name is mandatory."}},"labelKey":"Society / Street","allowed":false,"searchable":false,"editable":true,"sortable":false,"infoFlag":false},"pickupLandmark":{"label":"Landmark","fieldName":"Landmark","fieldType":"text","permission":true,"id":"pickupLandmark","required":false,"childLength":0,"rowSpan":0,"colSpan":0,"validation":{"maxlength":{"args":"512","message":"Pickup Landmark must be maximum 512 characters long."}},"labelKey":"Landmark","allowed":false,"searchable":false,"editable":true,"sortable":false,"infoFlag":false},"pickupLocality":{"label":"Locality / Area","fieldName":"Locality / Area","fieldType":"text","permission":true,"id":"pickupLocality","required":true,"childLength":0,"rowSpan":0,"colSpan":0,"validation":{"maxlength":{"args":"512","message":"Pickup Locality / Area must be maximum 512 characters long."},"required":{"message":"Locality for pickup is required"}},"labelKey":"Locality / Area","allowed":false,"searchable":false,"editable":true,"sortable":false,"infoFlag":false},"pickupState":{"label":"State/Province","fieldName":"State","fieldType":"select","permission":true,"id":"pickupState","required":true,"options":[],"childLength":0,"rowSpan":0,"colSpan":0,"lookupType":"getStates","validation":{"required":{"message":"Pickup state is mandatory."}},"labelKey":"State","allowed":false,"searchable":false,"editable":true,"sortable":false,"infoFlag":false},"pickupCity":{"label":"City","fieldName":"City","fieldType":"text","permission":true,"id":"pickupCity","required":true,"options":[],"childLength":0,"rowSpan":0,"colSpan":0,"lookupType":"getLocale","validation":{"maxlength":{"args":"512","message":"Pickup City must be maximum 512 characters long."},"required":{"message":"Pickup city is mandatory."}},"labelKey":"City","allowed":false,"searchable":false,"editable":true,"sortable":false,"infoFlag":false},"pickupPinCode":{"label":"Postal Code","fieldName":"Pincode","fieldType":"select","permission":true,"id":"pickupPinCode","required":false,"options":[],"childLength":0,"rowSpan":0,"colSpan":0,"lookupType":"getPincode","validation":{"maxlength":{"args":"12","message":"Pickup Pincode must be maximum 12 characters long."}},"labelKey":"Pincode","allowed":false,"searchable":false,"editable":true,"sortable":false,"infoFlag":false}},"allowed":false,"searchable":false,"editable":false,"sortable":false,"infoFlag":false},"pickupStartTimeWindow":{"label":"Start Time","fieldName":"Start Time","fieldType":"moreValidity","permission":true,"id":"pickupStartTimeWindow","required":true,"childLength":0,"rowSpan":0,"colSpan":0,"validation":{"required":{"message":"Pickup Start time window is mandatory."}},"labelKey":"Start Time","allowed":false,"searchable":false,"editable":true,"sortable":false,"infoFlag":false},"pickupEndTimeWindow":{"label":"End Time","fieldName":"End Time","fieldType":"moreValidity","permission":true,"id":"pickupEndTimeWindow","required":true,"childLength":0,"rowSpan":0,"colSpan":0,"validation":{"required":{"message":"Pickup End time window is mandatory."}},"labelKey":"End Time","allowed":false,"searchable":false,"editable":true,"sortable":false,"infoFlag":false},"pickupServiceTime":{"label":"Service Time (mins)","fieldName":"Service Time (mins)","fieldType":"number","permission":true,"id":"pickupServiceTime","required":false,"childLength":0,"rowSpan":0,"colSpan":0,"validation":{"maxlength":{"args":"9","message":"Pickup Service Time (mins) must be maximum 9 characters long."}},"labelKey":"Service Time (mins)","allowed":false,"searchable":false,"editable":true,"sortable":false,"infoFlag":false},"pickupBranch":{"label":"Branch Name","fieldName":"Branch Name","fieldType":"select","permission":true,"id":"pickupBranch","required":true,"options":[],"childLength":0,"rowSpan":0,"colSpan":0,"lookupType":"getBranches","validation":{"required":{"message":"Pickup Branch is mandatory."}},"labelKey":"Branch Name","allowed":false,"searchable":false,"editable":true,"sortable":false,"infoFlag":false},"pickupNotes":{"label":"Notes","fieldName":"Notes","fieldType":"text","permission":true,"value":"","id":"pickupNotes","required":false,"childLength":0,"rowSpan":0,"colSpan":0,"validation":{"maxlength":{"args":"512","message":"Notes must be maximum 512 characters long."}},"labelKey":"Notes","allowed":false,"searchable":false,"editable":true,"sortable":false,"infoFlag":false}},"return address details":{"returnAccountCode":{"label":"Customer ID","fieldName":"Customer ID","fieldType":"text","permission":true,"id":"returnAccountCode","required":true,"options":[],"childLength":0,"rowSpan":0,"colSpan":0,"lookupType":"getcustomer","validation":{"required":{"message":"Return Customer id  is mandatory."},"maxlength":{"args":"255","message":"Return Customer ID must be maximum 255 characters long."}},"labelKey":"Customer ID","allowed":false,"searchable":false,"editable":true,"sortable":false,"infoFlag":false},"returnAccountName":{"label":"Name","fieldName":"Name","fieldType":"text","permission":true,"id":"returnAccountName","required":true,"childLength":0,"rowSpan":0,"colSpan":0,"validation":{"required":{"message":"Return Customer name is mandatory."},"maxlength":{"args":"255","message":"Return Name must be maximum 255 characters long."}},"labelKey":"Name","allowed":false,"searchable":false,"editable":true,"sortable":false,"infoFlag":false},"returnEmail":{"label":"Email ID","fieldName":"Email ID","fieldType":"email","permission":true,"id":"returnEmail","required":false,"childLength":0,"rowSpan":0,"colSpan":0,"validation":{"maxlength":{"args":"100","message":"Return Email ID must be maximum 100 characters long."}},"labelKey":"Email ID","allowed":false,"searchable":false,"editable":true,"sortable":false,"infoFlag":false},"returnPhoneNumber":{"label":"Contact Number","fieldName":"Contact Number","fieldType":"tel","permission":true,"id":"returnPhoneNumber","required":false,"childLength":0,"rowSpan":0,"colSpan":0,"validation":{"maxlength":{"args":"20","message":"Return Contact Number must be maximum 20 characters long."},"phonenumber":{"args":"","message":"INVALID Mobile Number"}},"labelKey":"Contact Number","allowed":false,"searchable":false,"editable":true,"sortable":false,"infoFlag":false},"addressFields":{"label":"addressFields","fieldName":"addressFields","fieldType":"address","permission":true,"id":"addressFields","required":false,"childLength":8,"rowSpan":0,"colSpan":0,"childNodes":{"returnCountry":{"label":"Country","fieldName":"Country","fieldType":"select","permission":true,"id":"returnCountry","required":true,"options":[],"childLength":0,"rowSpan":0,"colSpan":0,"lookupType":"getLocale","validation":{"required":{"message":"Return country is mandatory."},"maxlength":{"args":"100","message":"Country max length is 100."}},"labelKey":"Country","allowed":false,"searchable":false,"editable":true,"sortable":false,"infoFlag":false},"returnApartment":{"label":"Apartment","fieldName":"Apartment","fieldType":"text","permission":true,"id":"returnApartment","required":true,"childLength":0,"rowSpan":0,"colSpan":0,"validation":{"required":{"message":"Return apartment is mandatory."},"maxlength":{"args":"512","message":"Return Apartment must be maximum 512 characters long."}},"labelKey":"Apartment","allowed":false,"searchable":false,"editable":true,"sortable":false,"infoFlag":false},"returnStreetName":{"label":"Society / Street","fieldName":"Society / Street","fieldType":"text","permission":true,"id":"returnStreetName","required":true,"childLength":0,"rowSpan":0,"colSpan":0,"validation":{"required":{"message":"Return street name is mandatory."},"maxlength":{"args":"255","message":"Return Society / Street must be maximum 255 characters long."}},"labelKey":"Society / Street","allowed":false,"searchable":false,"editable":true,"sortable":false,"infoFlag":false},"returnLandmark":{"label":"Landmark","fieldName":"Landmark","fieldType":"text","permission":true,"id":"returnLandmark","required":false,"childLength":0,"rowSpan":0,"colSpan":0,"validation":{"maxlength":{"args":"512","message":"Return Landmark must be maximum 512 characters long."}},"labelKey":"Landmark","allowed":false,"searchable":false,"editable":true,"sortable":false,"infoFlag":false},"returnLocality":{"label":"Locality / Area","fieldName":"Locality / Area","fieldType":"text","permission":true,"id":"returnLocality","required":false,"childLength":0,"rowSpan":0,"colSpan":0,"validation":{"maxlength":{"args":"512","message":"Return Locality / Area must be maximum 512 characters long."}},"labelKey":"Locality / Area","allowed":false,"searchable":false,"editable":true,"sortable":false,"infoFlag":false},"returnState":{"label":"State/Province","fieldName":"State","fieldType":"select","permission":true,"id":"returnState","required":false,"options":[],"childLength":0,"rowSpan":0,"colSpan":0,"lookupType":"getStates","validation":{"maxlength":{"args":"50","message":"State max length is 50."}},"labelKey":"State","allowed":false,"searchable":false,"editable":true,"sortable":false,"infoFlag":false},"returnCity":{"label":"City","fieldName":"City","fieldType":"text","permission":true,"id":"returnCity","required":true,"options":[],"childLength":0,"rowSpan":0,"colSpan":0,"lookupType":"getLocale","validation":{"required":{"message":"Return city is mandatory."},"maxlength":{"args":"512","message":"Return City must be maximum 512 characters long."}},"labelKey":"City","allowed":false,"searchable":false,"editable":true,"sortable":false,"infoFlag":false},"returnPinCode":{"label":"Postal Code","fieldName":"Pincode","fieldType":"select","permission":true,"id":"returnPinCode","required":false,"options":[],"childLength":0,"rowSpan":0,"colSpan":0,"lookupType":"getPincode","validation":{"maxlength":{"args":"12","message":"Return Pincode must be maximum 12 characters long."}},"labelKey":"Pincode","allowed":false,"searchable":false,"editable":true,"sortable":false,"infoFlag":false}},"allowed":false,"searchable":false,"editable":false,"sortable":false,"infoFlag":false},"returnStartTimeWindow":{"label":"Start Time","fieldName":"Start Time","fieldType":"moreValidity","permission":true,"id":"returnStartTimeWindow","required":true,"childLength":0,"rowSpan":0,"colSpan":0,"validation":{"required":{"message":"Return Start time window is mandatory."}},"labelKey":"Start Time","allowed":false,"searchable":false,"editable":true,"sortable":false,"infoFlag":false},"returnEndTimeWindow":{"label":"End Time","fieldName":"End Time","fieldType":"moreValidity","permission":true,"id":"returnEndTimeWindow","required":true,"childLength":0,"rowSpan":0,"colSpan":0,"validation":{"required":{"message":"Return end-time window is mandatory."}},"labelKey":"End Time","allowed":false,"searchable":false,"editable":true,"sortable":false,"infoFlag":false},"returnServiceTime":{"label":"Service Time (mins)","fieldName":"Service Time (mins)","fieldType":"number","permission":true,"id":"returnServiceTime","required":false,"childLength":0,"rowSpan":0,"colSpan":0,"validation":{"maxlength":{"args":"9","message":"Return Service Time (mins) must be maximum 9 characters long."}},"labelKey":"Service Time (mins)","allowed":false,"searchable":false,"editable":true,"sortable":false,"infoFlag":false},"returnBranch":{"label":"Branch Name","fieldName":"Branch Name","fieldType":"select","permission":true,"id":"returnBranch","required":true,"options":[],"childLength":0,"rowSpan":0,"colSpan":0,"lookupType":"getBranches","validation":{"required":{"message":"Return Branch name is mandatory."}},"labelKey":"Branch Name","allowed":false,"searchable":false,"editable":true,"sortable":false,"infoFlag":false}},"delivery details":{"deliverAccountCode":{"label":"Customer ID","fieldName":"Customer ID","fieldType":"text","permission":true,"id":"deliverAccountCode","required":true,"options":[],"childLength":0,"rowSpan":0,"colSpan":0,"lookupType":"getcustomer","validation":{"required":{"message":"Deliver Customer id  is mandatory."},"maxlength":{"args":"255","message":"Delivery Customer ID must be maximum 255 characters long."}},"labelKey":"Customer ID","allowed":false,"searchable":false,"editable":true,"sortable":false,"infoFlag":false},"deliverAccountName":{"label":"Name","fieldName":"Name","fieldType":"text","permission":true,"id":"deliverAccountName","required":true,"childLength":0,"rowSpan":0,"colSpan":0,"validation":{"required":{"message":"Deliver Customer name is mandatory."},"maxlength":{"args":"255","message":"Delivery Name must be maximum 255 characters long."}},"labelKey":"Name","allowed":false,"searchable":false,"editable":true,"sortable":false,"infoFlag":false},"deliverEmail":{"label":"Email ID","fieldName":"Email ID","fieldType":"email","permission":true,"id":"deliverEmail","required":false,"childLength":0,"rowSpan":0,"colSpan":0,"validation":{"maxlength":{"args":"100","message":"Delivery Email ID must be maximum 100 characters long."}},"labelKey":"Email ID","allowed":false,"searchable":false,"editable":true,"sortable":false,"infoFlag":false},"deliverPhoneNumber":{"label":"Contact Number","fieldName":"Contact Number","fieldType":"tel","permission":true,"id":"deliverPhoneNumber","required":false,"childLength":0,"rowSpan":0,"colSpan":0,"validation":{"maxlength":{"args":"20","message":"Delivery Contact Number must be maximum 20 characters long."},"phonenumber":{"args":"","message":"INVALID Mobile Number"}},"labelKey":"Contact Number","allowed":false,"searchable":false,"editable":true,"sortable":false,"infoFlag":false},"addressFields":{"label":"addressFields","fieldName":"addressFields","fieldType":"address","permission":true,"id":"addressFields","required":false,"childLength":8,"rowSpan":0,"colSpan":0,"childNodes":{"deliverCountry":{"label":"Country","fieldName":"Country","fieldType":"select","permission":true,"id":"deliverCountry","required":true,"options":[],"childLength":0,"rowSpan":0,"colSpan":0,"lookupType":"getLocale","validation":{"required":{"message":"Deliver country is mandatory."}},"labelKey":"Country","allowed":false,"searchable":false,"editable":true,"sortable":false,"infoFlag":false},"deliverApartment":{"label":"Apartment","fieldName":"Apartment","fieldType":"text","permission":true,"id":"deliverApartment","required":true,"childLength":0,"rowSpan":0,"colSpan":0,"validation":{"maxlength":{"args":"512","message":"Delivery Apartment must be maximum 512 characters long."},"required":{"message":"Deliver apartment is mandatory."}},"labelKey":"Apartment","allowed":false,"searchable":false,"editable":true,"sortable":false,"infoFlag":false},"deliverStreetName":{"label":"Society / Street","fieldName":"Society / Street","fieldType":"text","permission":true,"id":"deliverStreetName","required":true,"childLength":0,"rowSpan":0,"colSpan":0,"validation":{"maxlength":{"args":"255","message":"Delivery Society / Street must be maximum 255 characters long."},"required":{"message":"Deliver street name is mandatory."}},"labelKey":"Society / Street","allowed":false,"searchable":false,"editable":true,"sortable":false,"infoFlag":false},"deliverLandmark":{"label":"Landmark","fieldName":"Landmark","fieldType":"text","permission":true,"id":"deliverLandmark","required":false,"childLength":0,"rowSpan":0,"colSpan":0,"validation":{"maxlength":{"args":"512","message":"Delivery Landmark must be maximum 512 characters long."}},"labelKey":"Landmark","allowed":false,"searchable":false,"editable":true,"sortable":false,"infoFlag":false},"deliverLocality":{"label":"Locality / Area","fieldName":"Locality / Area","fieldType":"text","permission":true,"id":"deliverLocality","required":true,"childLength":0,"rowSpan":0,"colSpan":0,"validation":{"maxlength":{"args":"512","message":"Delivery Locality must be maximum 512 characters long."},"required":{"message":"Locality for deliver is required"}},"labelKey":"Locality / Area","allowed":false,"searchable":false,"editable":true,"sortable":false,"infoFlag":false},"deliverState":{"label":"State/Province","fieldName":"State","fieldType":"select","permission":true,"id":"deliverState","required":false,"options":[],"childLength":0,"rowSpan":0,"colSpan":0,"lookupType":"getStates","validation":{},"labelKey":"State","allowed":false,"searchable":false,"editable":true,"sortable":false,"infoFlag":false},"deliverCity":{"label":"City","fieldName":"City","fieldType":"text","permission":true,"id":"deliverCity","required":true,"options":[],"childLength":0,"rowSpan":0,"colSpan":0,"lookupType":"getLocale","validation":{"maxlength":{"args":"512","message":"Delivery City must be maximum 512 characters long."},"required":{"message":"Deliver city is mandatory."}},"labelKey":"City","allowed":false,"searchable":false,"editable":true,"sortable":false,"infoFlag":false},"deliverPinCode":{"label":"Postal Code","fieldName":"Pincode","fieldType":"select","permission":true,"id":"deliverPinCode","required":false,"options":[],"childLength":0,"rowSpan":0,"colSpan":0,"lookupType":"getPincode","validation":{"maxlength":{"args":"12","message":"Deliver Pincode must be maximum 12 characters long."}},"labelKey":"Pincode","allowed":false,"searchable":false,"editable":true,"sortable":false,"infoFlag":false}},"allowed":false,"searchable":false,"editable":false,"sortable":false,"infoFlag":false},"deliverStartTimeWindow":{"label":"Start Time","fieldName":"Start Time","fieldType":"moreValidity","permission":true,"id":"deliverStartTimeWindow","required":true,"childLength":0,"rowSpan":0,"colSpan":0,"validation":{"required":{"message":"Deliver Start time window is mandatory."}},"labelKey":"Start Time","allowed":false,"searchable":false,"editable":true,"sortable":false,"infoFlag":false},"deliverEndTimeWindow":{"label":"End Time","fieldName":"End Time","fieldType":"moreValidity","permission":true,"id":"deliverEndTimeWindow","required":true,"childLength":0,"rowSpan":0,"colSpan":0,"validation":{"required":{"message":"Deliver end-time window is mandatory."}},"labelKey":"End Time","allowed":false,"searchable":false,"editable":true,"sortable":false,"infoFlag":false},"deliverServiceTime":{"label":"Service Time (mins)","fieldName":"Service Time (mins)","fieldType":"number","permission":true,"id":"deliverServiceTime","required":false,"childLength":0,"rowSpan":0,"colSpan":0,"validation":{"maxlength":{"args":"9","message":"Delivery Service Time must be maximum 9 characters long."}},"labelKey":"Service Time (mins)","allowed":false,"searchable":false,"editable":true,"sortable":false,"infoFlag":false},"deliverBranch":{"label":"Branch Name","fieldName":"Branch Name","fieldType":"select","permission":true,"id":"deliverBranch","required":true,"options":[],"childLength":0,"rowSpan":0,"colSpan":0,"lookupType":"getBranches","validation":{"required":{"message":"Deliver Branch is mandatory."}},"labelKey":"Branch Name","allowed":false,"searchable":false,"editable":true,"sortable":false,"infoFlag":false},"deliverNotes":{"label":"Notes","fieldName":"Notes","fieldType":"text","permission":true,"value":"","id":"deliverNotes","required":false,"childLength":0,"rowSpan":0,"colSpan":0,"validation":{"maxlength":{"args":"512","message":"Notes must be maximum 512 characters long."}},"labelKey":"Notes","allowed":false,"searchable":false,"editable":true,"sortable":false,"infoFlag":false}},"customer details":{"AccountCode":{"label":"Customer ID","fieldName":"Customer ID","fieldType":"text","permission":true,"id":"AccountCode","required":true,"options":[],"childLength":0,"rowSpan":0,"colSpan":0,"lookupType":"getcustomer","validation":{"required":{"message":"Account Code is mandatory."},"maxlength":{"args":"255","message":"Customer ID must be maximum 255 characters long."}},"labelKey":"Customer ID","infoTool":[{"key":"orders_AccountCode_infotip","message":"Unique id associated with each Customer. Set your client property to switch on Customer profiling."}],"allowed":false,"searchable":false,"editable":true,"sortable":false,"infoFlag":true},"AccountName":{"label":"Name","fieldName":"Name","fieldType":"text","permission":true,"id":"AccountName","required":true,"childLength":0,"rowSpan":0,"colSpan":0,"validation":{"required":{"message":"Account Name is mandatory."},"maxlength":{"args":"255","message":"Name must be maximum 255 characters long."}},"labelKey":"Name","allowed":false,"searchable":false,"editable":true,"sortable":false,"infoFlag":false},"Email":{"label":"Email ID","fieldName":"Email ID","fieldType":"email","permission":true,"id":"Email","required":false,"childLength":0,"rowSpan":0,"colSpan":0,"validation":{"maxlength":{"args":"100","message":"Email ID must be maximum 100 characters long."}},"labelKey":"Email ID","allowed":false,"searchable":false,"editable":true,"sortable":false,"infoFlag":false},"PhoneNumber":{"label":"Contact Number","fieldName":"Contact Number","fieldType":"tel","permission":true,"id":"PhoneNumber","required":false,"childLength":0,"rowSpan":0,"colSpan":0,"validation":{"maxlength":{"args":"20","message":"Contact Number must be maximum 20 characters long."},"phonenumber":{"args":"","message":"INVALID Mobile Number"}},"labelKey":"Contact Number","allowed":false,"searchable":false,"editable":true,"sortable":false,"infoFlag":false},"addressFields":{"label":"addressFields","fieldName":"addressFields","fieldType":"address","permission":true,"id":"addressFields","required":false,"childLength":8,"rowSpan":0,"colSpan":0,"childNodes":{"Country":{"label":"Country","fieldName":"Country","fieldType":"select","permission":true,"id":"Country","required":true,"options":[],"childLength":0,"rowSpan":0,"colSpan":0,"lookupType":"getLocale","validation":{"required":{"message":"Country is mandatory."}},"labelKey":"Country","allowed":false,"searchable":false,"editable":true,"sortable":false,"infoFlag":false},"Apartment":{"label":"Apartment","fieldName":"Apartment","fieldType":"text","permission":true,"id":"Apartment","required":true,"childLength":0,"rowSpan":0,"colSpan":0,"validation":{"maxlength":{"args":"512","message":"Apartment must be maximum 512 characters long."},"required":{"message":"Apartment is mandatory."}},"labelKey":"Apartment","allowed":false,"searchable":false,"editable":true,"sortable":false,"infoFlag":false},"StreetName":{"label":"Society / Street","fieldName":"Society / Street","fieldType":"text","permission":true,"id":"StreetName","required":true,"childLength":0,"rowSpan":0,"colSpan":0,"validation":{"maxlength":{"args":"255","message":"Society / Street must be maximum 255 characters long."},"required":{"message":"Street Name is mandatory."}},"labelKey":"Society / Street","allowed":false,"searchable":false,"editable":true,"sortable":false,"infoFlag":false},"Landmark":{"label":"Landmark","fieldName":"Landmark","fieldType":"text","permission":true,"id":"Landmark","required":false,"childLength":0,"rowSpan":0,"colSpan":0,"validation":{"maxlength":{"args":"512","message":"Landmark must be maximum 512 characters long."}},"labelKey":"Landmark","allowed":false,"searchable":false,"editable":true,"sortable":false,"infoFlag":false},"Locality":{"label":"Locality / Area","fieldName":"Locality / Area","fieldType":"text","permission":true,"id":"Locality","required":true,"childLength":0,"rowSpan":0,"colSpan":0,"validation":{"maxlength":{"args":"512","message":"Locality / Area must be maximum 512 characters long."},"required":{"message":"Locality is mandatory."}},"labelKey":"Locality / Area","allowed":false,"searchable":false,"editable":true,"sortable":false,"infoFlag":false},"State":{"label":"State/Province","fieldName":"State","fieldType":"select","permission":true,"id":"State","required":false,"options":[],"childLength":0,"rowSpan":0,"colSpan":0,"lookupType":"getStates","validation":{"maxlength":{"args":"50","message":"State max length is 50."}},"labelKey":"State","allowed":false,"searchable":false,"editable":true,"sortable":false,"infoFlag":false},"City":{"label":"City","fieldName":"City","fieldType":"text","permission":true,"id":"City","required":true,"options":[],"childLength":0,"rowSpan":0,"colSpan":0,"lookupType":"getLocale","validation":{"maxlength":{"args":"512","message":"City must be maximum 512 characters long."},"required":{"message":"City is mandatory."}},"labelKey":"City","allowed":false,"searchable":false,"editable":true,"sortable":false,"infoFlag":false},"PinCode":{"label":"Postal Code","fieldName":"Pincode","fieldType":"select","permission":true,"id":"PinCode","required":false,"options":[],"childLength":0,"rowSpan":0,"colSpan":0,"lookupType":"getPincode","validation":{"maxlength":{"args":"12","message":"Pincode must be maximum 12 characters long."}},"labelKey":"Pincode","allowed":false,"searchable":false,"editable":true,"sortable":false,"infoFlag":false}},"allowed":false,"searchable":false,"editable":false,"sortable":false,"infoFlag":false},"deliverNotes":{"label":"Notes","fieldName":"Notes","fieldType":"text","permission":true,"value":"","id":"deliverNotes","required":false,"childLength":0,"rowSpan":0,"colSpan":0,"validation":{"maxlength":{"args":"512","message":"Notes must be maximum 512 characters long."}},"labelKey":"Notes","allowed":false,"searchable":false,"editable":true,"sortable":false,"infoFlag":false}}}
	 * @return
	 */
	public boolean enterValues (
			LinkedHashMap<String, String> pageDataMap, 
			String strOrdersPageStructure) {
		try 
		{

			JsonParser parser = new JsonParser();

			//Remove all canonical references (Dot references)
			LinkedHashMap<String, String> pageDataMapNew = new LinkedHashMap<>();

			Iterator <String> iterator = pageDataMap.keySet().iterator();
			while (iterator.hasNext())
			{
				String strCurrentKey = iterator.next();
				String strValue = pageDataMap.get(strCurrentKey);
				if (strCurrentKey.contains("."))
				{
					strCurrentKey = strCurrentKey.substring(strCurrentKey.indexOf(".")+1, strCurrentKey.length());
				}
				pageDataMapNew.put(strCurrentKey, strValue);
			}

			//Reassign Page DataMap without canonical references (dot operator)
			pageDataMap.clear();
			pageDataMap = pageDataMapNew;

			//Loop through the testData (pageDataMap) for the current page and interact with page elements inside - strOrdersPageStructure
			for (String strDataMapKey : pageDataMap.keySet())
			{
				String strDataMapValue = pageDataMap.get(strDataMapKey);
				System.out.println("Data - "+strDataMapKey+ " : "+strDataMapValue);
				try {

					System.out.println("Current Data Key: "+strDataMapKey);
					String strElementName = strDataMapKey;//id = "packageWeight";

					String jsonPath = "$..[?(@.id=='"+strElementName+"')]";
					System.out.println("Finding Element - "+jsonPath);
					String strElementStructure = JsonPath.read(strOrdersPageStructure, jsonPath).toString();//new JsonPath(strOrdersPageStructure).get(jsonPath);//JsonPath.read(strOrdersPageStructure, "$..[?(@.id=\""+strElementIdentifier+"\")]");
					System.out.println("strElementStructure : "+strElementStructure);

					//Get current element attributes
					JsonElement currentElementAttributes = parser.parse(strElementStructure.toString()).getAsJsonArray().get(0);//allElements.getValue();
					//System.out.println("currentElementAttributes: "+currentElementAttributes);
					System.out.println("Interact with object - "+strElementName);
					System.out.println("Object Attributes : "+currentElementAttributes);

					String strElementLabel = currentElementAttributes.getAsJsonObject().get("label").getAsString(); //"label"

					//Will identify page object on page - //*[@name='strElementId']
					String strElementId = currentElementAttributes.getAsJsonObject().get("id").getAsString(); 

					//Will be like textbox / select / dropdown / checkbox / radio / date / etc
					String strFieldType = "text";
					try {
						strFieldType = currentElementAttributes.getAsJsonObject().get("fieldType").getAsString(); //fieldType
					} catch (Exception e) {
						System.out.println("Unable to get fiels type");//e.printStackTrace();
						//Need to get parent's field type using json path
					}

					//Fetch the permissions for this object - if true will get displayed on our webpage
					boolean bDisplayPermission = currentElementAttributes.getAsJsonObject().get("permission").getAsBoolean();

					if (bDisplayPermission == false){
						//The current element will not be displayed on web page
						//System.out.println("Element with label - "+strElementLabel+" from page section; is not visible on page, continuing with next element");
						
						//Sometimes element permissions are set false - still the element is visible on UI
						//***logMessage("Verify element permission on screen", "Element permission in Structure API should be true to get visible on page", "Element's permissions are "+bDisplayPermission+" for Element having ID : "+strElementId, "Failed");

						//Continue with next element from page section

						//In Cases we need to enter the text -try entering it and fail 
						//continue;
					}

					//Fetch the data which needs to be put in this field from TestData Row
					String strTestData = pageDataMap.get(strElementId);
					System.out.println("strElementId : "+strElementId+" has a fieldType of - "+strFieldType+", Data : "+strTestData);
					if (strFieldType == null){
						System.out.println("Unknown field type...");
						continue;
					}

					if (strFieldType != null && strFieldType.equalsIgnoreCase("select")){//

						if (strTestData.toUpperCase().contains("OPTION")){
							//Select option from dropdown
							String strElementXPath = "//div[@name='"+strElementId+"']";
							List <WebElement> allOptions = getAllElementsFromSelect(strElementXPath, strElementLabel);
							if (allOptions.size() < 1)
							{
								System.err.println("No option availalble to update "+strElementLabel+" from dropdown...");
							}
							else
							{
								//Get first Option WebElement
								System.out.println(allOptions.size() +""+allOptions.toArray().toString());
								WebElement option = allOptions.get(0);
								System.out.println("Clicking Option Name : "+option.getText());
								String strOptionToSelect = option.getText();
								strTestData = strOptionToSelect;

								//Click on the Option
								rc = udsSelectLM_Dropdown(strElementXPath, strElementLabel, strTestData);
								if (rc == false){
									//continue;
								}
							}
						}
						else // Select an option which is present in testData 
						{
							//Select option from dropdown
							String strElementXPath = "//div[@name='"+strElementId+"']";
							rc = udsSelectLM_Dropdown(strElementXPath, strElementLabel, strTestData);
							if (rc == false){
								//continue;
							}
						} //End If - Enter one single value given in TestData 

						//Drop down is an entity which injects new structure request inside a page - wait for wait to rearrange and then fill in rest of the data 
						TimeUnit.SECONDS.sleep(3);
					}
					else if (strFieldType != null && strFieldType.equalsIgnoreCase("multiselect")){

						//Loop through all delivery medium types...
						System.out.println("MultiSelect Values "+strTestData);
						String strMultiSelectValues [] = strTestData.split(",");
						for (int i = 0; i < strMultiSelectValues.length; i++) {
							String strElementXPath = "//*[@name='"+strElementId+"']";
							String strCurrentTestDataValue = strMultiSelectValues[i];
							if (strCurrentTestDataValue.toUpperCase().contains("OPTION")){
								//
								//Select option from dropdown
								List <WebElement> allOptions = getAllElementsFromSelect(strElementXPath, strElementLabel);
								if (allOptions.size() < 1)
								{
									System.err.println("No option availalble to update "+strElementLabel+" from dropdown...");
								}
								else
								{
									//Get first Option WebElement
									System.out.println(allOptions.size() +""+allOptions.toArray().toString());
									WebElement option = allOptions.get(0);
									System.out.println("Clicking Option Name : "+option.getText());
									String strOptionToSelect = option.getText();
									strCurrentTestDataValue = strOptionToSelect;

									//Click on the Option
									rc = udsSelectLM_Dropdown(strElementXPath, strElementLabel, strCurrentTestDataValue);
									if (rc == false){
										//continue;
									}
								}//End if - Select the first option present in list of options 
							}// else enter the value provided in testData sheet
							else {//
								rc = udsSelectLM_Dropdown(strElementXPath, strElementLabel, strCurrentTestDataValue);
								Assert.assertTrue(rc);
							}

							//Drop down is an entity which injects new structure request inside a page - wait for wait to rearrange and then fill in rest of the data 
							TimeUnit.SECONDS.sleep(3);
						}//For Loop End
					}
					else if (strFieldType != null && strFieldType.equalsIgnoreCase("text")){

						//Enter text in element
						String strElementXPath = "//input[@name='"+strElementId+"']";
						rc = sendKeys(strElementXPath, strTestData, strElementLabel, true);
						if (rc == false){
							//continue;
						}
					}
					else if (strFieldType != null && strFieldType.equalsIgnoreCase("password")){

						//Enter text in element
						String strElementXPath = "//input[@name='"+strElementId+"']";
						rc = sendKeys(strElementXPath, strTestData, strElementLabel, true);
						if (rc == false){
							//continue;
						}
					}
					else if (strFieldType != null && strFieldType.equalsIgnoreCase("number")){

						//Enter text in element
						String strElementXPath = "//input[@name='"+strElementId+"']";
						rc = sendKeys(strElementXPath, strTestData, strElementLabel, true);
						if (rc == false){
							//continue;
						}
					}
					else if (strFieldType != null && strFieldType.equalsIgnoreCase("tel")){

						//Enter text in element
						String strElementXPath = "//*[@name='"+strElementId+"']";
						rc = sendKeys(strElementXPath, strTestData, strElementLabel, true);
						if (rc == false){
							//continue;
						}
					}
					else if (strFieldType != null && strFieldType.equalsIgnoreCase("email")){

						//Enter text in element
						String strElementXPath = "//*[@name='"+strElementId+"']";
						rc = sendKeys(strElementXPath, strTestData, strElementLabel, true);
						if (rc == false){
							//continue;
						}
					}
					else if (strFieldType != null && strFieldType.equalsIgnoreCase("time")){

						//Enter text in element
						String strElementXPath = "//input[@name='"+strElementId+"']";
						rc = sendKeys(strElementXPath, strTestData, strElementLabel, true);
						if (rc == false){
							//continue;
						}
					}
					else if (strFieldType != null && strFieldType.equalsIgnoreCase("checkbox")) {

						//Get id for the element - //*[@id='label-"+strElementId+"']//input Eg . //*[@id="label-isPartialDeliveryAllowedFl"]//input
						String strElement = "//*[@id='label-"+strElementId+"']//input";
						String strCheckboxID =  driver.findElement(By.xpath(strElement)).getAttribute("id"); //getAttributeByXPath(strElement, strElementLabel+" Checkbox", "id");
						boolean check = Boolean.parseBoolean(strTestData);

						//Create a label - // String strDeliveryBoyLabelCheckbox = "//label[@for='"+strDeliveryBoyID+"']";
						String strCheckboxLabel = "//label[@for='"+strCheckboxID+"']";

						//Check the checkbox -
						rc = clickCheckboxByXPath(strElement, strCheckboxLabel, strElementLabel+" Checkbox", check);

					}
					else if (strFieldType != null && strFieldType.equalsIgnoreCase("multicheckbox")) {

						//Loop through all checkbox values...
						System.out.println("MultiSelect Values "+strTestData);
						String strMultiSelectValues [] = strTestData.split(",");//Shoud be in format of -  2 Wheeler=true,4 Wheeler=true
						for (int i = 0; i < strMultiSelectValues.length; i++) {

							String strCheckboxDetails [] = strTestData.split("=");
							String strLabelValueName = strCheckboxDetails[0];
							boolean check = Boolean.parseBoolean(strCheckboxDetails[1]);

							//Get id for the element - //*[@id='label-"+strElementId+"']//input Eg . //*[@id="label-isPartialDeliveryAllowedFl"]//input
							String strElement = "//*[@id='label-"+strLabelValueName+"']//input";
							String strCheckboxID =  driver.findElement(By.xpath(strElement)).getAttribute("id"); //getAttributeByXPath(strElement, strElementLabel+" Checkbox", "id");

							//Create a label - // String strDeliveryBoyLabelCheckbox = "//label[@for='"+strDeliveryBoyID+"']";
							String strCheckboxLabel = "//label[@for='"+strCheckboxID+"']";

							//Check the checkbox -
							rc = clickCheckboxByXPath(strElement, strCheckboxLabel, strElementLabel+" Checkbox", check);


						}

					}
					else if (strFieldType != null && strFieldType.equalsIgnoreCase("toggleBox")){

						//Get id for the element - //*[@id='"+strElementId+"']//input //*[@id="label-isPartialDeliveryAllowedFl"]//input
						String strElement = "//*[@id='label-"+strElementId+"']//input";
						String strCheckboxID =  driver.findElement(By.xpath(strElement)).getAttribute("id"); //getAttributeByXPath(strElement, strElementLabel+" Checkbox", "id");
						boolean check = Boolean.parseBoolean(strTestData);

						//Create a label - // String strDeliveryBoyLabelCheckbox = "//label[@for='"+strDeliveryBoyID+"']";
						String strCheckboxLabel = "//label[@for='"+strCheckboxID+"']";

						//Check the checkbox -
						rc = clickCheckboxByXPath(strElement, strCheckboxLabel, strElementLabel+" Checkbox", check);

					}
					else if (strFieldType != null && strFieldType.equalsIgnoreCase("radio")) {// radio

						//Click on radio button - Eg //*[@name='gender']//ancestor::logi-radio//label[@for='Male | Female'] //*[@name='maritalStatus']//ancestor::logi-radio//label[@for='Single']
						String strElement = "//*[@name='"+strElementId+"']//ancestor::logi-radio//label[@for='"+strTestData+"']";
						rc = clickElementByXPath(strElement, strElementLabel);
						Assert.assertTrue(rc);

					}
					//validity
					else if (strFieldType != null && strFieldType.equalsIgnoreCase("validity")) {// date

						//Enter Date in object
						String strTime = strTestData;//sdf.format(c.getTime()) + "";//"21/02/2018 12:30";
						String strElementXPath = "//*[@name='"+strElementId+"']";

						//sendCharKeys(strElementXPath, Keys.ENTER, strElementLabel, true);
						rc = setValueByJavascript(driver, strElementXPath, strElementLabel, strTime);
						Assert.assertTrue(rc);//
						TimeUnit.SECONDS.sleep(1);

					}
					else if (strFieldType != null && strFieldType.equalsIgnoreCase("moreValidity")) {// date

						//Enter Date in object
						String strTime = strTestData;//sdf.format(c.getTime()) + "";//"21/02/2018 12:30";
						String strElementXPath = "//*[@name='"+strElementId+"']";

						sendCharKeys(strElementXPath, Keys.ENTER, strElementLabel, true);
						rc = setValueByJavascript(driver, strElementXPath, strElementLabel, strTime);
						Assert.assertTrue(rc);//
						TimeUnit.SECONDS.sleep(1);

					}
					else if (strFieldType != null && strFieldType.equalsIgnoreCase("dob")) {// date

						//Enter Date in object
						String strTime = strTestData;//sdf.format(c.getTime()) + "";//"21/02/2018 12:30";
						String strElementXPath = "//*[@name='"+strElementId+"']";

						sendCharKeys(strElementXPath, Keys.ENTER, strElementLabel, true);
						rc = setValueByJavascript(driver, strElementXPath, strElementLabel, strTime);
						Assert.assertTrue(rc);//
						TimeUnit.SECONDS.sleep(1);
					}
					//File 
					else if (strFieldType != null && strFieldType.equalsIgnoreCase("file")) {
						//*[@name='licenseFileUpload']

						//Upload File - input type = file - id="id-registration-copy"
						String strFileName = "Reports/"+strTestData;
						String strFileText = strElementLabel;
						String strFilePath = createTempFile(strFileName, strFileText);
						String strFileUploadValue = strFilePath; //"";
						String strFileUploadXPath = "//*[@name='"+strElementId+"']"; // //*[@name='licenseFileUpload']
						rc = sendKeysFile(strFileUploadXPath, strFileUploadValue, strElementLabel + " - File Upload", true);
						Assert.assertTrue(rc);

					}
					else {
						logMessage("Verify field type", "Should be able to get field type for element, Eg : Textbox/ Checkbox / Date, etc", "Unsupported field type from structure : for "+strElementLabel+" having element ID : "+strElementId+", Field Type : "+strFieldType, "Failed");//("Unsupported field type...");
					}

				} catch (Exception e) {
					e.printStackTrace();

				}
			}

			return true;
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			return false;
		}
	}

	public boolean focusElementByJavaScript(WebDriver driver, String strElementXPath, String strElementName) {
		try {
			String strXPath = strElementXPath;
			WebDriverWait wait = new WebDriverWait(driver, MAX_WAIT_TIME);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(strXPath)));
			WebElement element = driver.findElement(By.xpath(strXPath));
			((JavascriptExecutor) driver).executeScript("arguments[0].focus();", element);
			logMessage("Click Element "+strElementName, "Should be able to click element", "Successfully clicked Element - "+strElementName, "Passed");
			return true;
		} catch (Exception e) {

			//Recovery
			if (iTimesRecoveryPerformed <= iMaxRecoveriesAllowed)
			{
				rc = recover();
				if (rc == true)//If recovery is successful - repeat same process again
				{
					//Call the same function using same args
					boolean rc = focusElementByJavaScript(driver, strElementXPath, strElementName);
					return rc;//Return positive cove back and continue execution
				}
				else
				{
					System.err.println("Failed in recovering test...");
				}
			}
			else
			{
				System.err.println("Reached Max Recovery Limit. Exit 0");
			}
			//Recovery End

			e.printStackTrace();
			logMessage("Click Element "+strElementName, "Should be able to click element", "Unable to click element - "+strElementName+", Identified with XPath - "+strElementXPath , "Failed");
			return false;
		}
	}




	boolean newUI = true;

	/**
	 * Will return a date string given the keywords as below
	 * @param strDate  eg.
		"DATE[NOW - (2DAYS) - (1 HOUR) - (1 DAYS)]";
		//"DATE[NOW - (2DAYS) - (1HOUR) + (10MINUTES)]";
		//"DATE[NOW - (3DAYS) - (2HOURS) + (4MINUTES)]"; 
	 * @return
	 */
	String applicationTimeFormat = "HH:mm";
	boolean addSpacesBetweenDateAndTime = true;

	public String dateFunctionSubstitution (String strDate){
		try {

			LinkedHashMap <String,String> row = getTempData();

			String strDateFormat = row.get("DATEFORMAT");
			String strTimeFormat = applicationTimeFormat;//"HH:mm"; //24 Hour format
			String strDateFormatString = strDateFormat +" "+strTimeFormat;// "dd/MM/yyyy HH:mm";
			if (addSpacesBetweenDateAndTime){
				strDateFormatString = strDateFormat +" "+strTimeFormat;// "dd/MM/yyyy HH:mm";
			}
			else {
				strDateFormatString = strDateFormat +""+strTimeFormat;// "dd/MM/yyyy HH:mm";
			}
			SimpleDateFormat sdf = new SimpleDateFormat(strDateFormatString);
			Calendar cal = Calendar.getInstance();

			int iElements = StringUtils.countMatches(strDate, "(");
			//System.out.println("Total Date Functions : "+iElements);

			//DYNAMIC ELEMENTS 
			String strOperation = "";
			String strAddOrSubtractDateElement = "";
			//System.out.print("Date Elements :NOW "+strOperation + " "+ strAddOrSubtractDateElement +" ");

			try {
				strAddOrSubtractDateElement =  strDate.substring(StringUtils.ordinalIndexOf(strDate, "(", 1)+1, StringUtils.ordinalIndexOf(strDate, ")", 1)).trim();//strDate.substring(strDate.indexOf("(", strDate.indexOf("(") )+1 , strDate.indexOf(")", strDate.indexOf(")") ) );
				strOperation =  strDate.substring(StringUtils.ordinalIndexOf(strDate, "NOW", 1)+3 , StringUtils.ordinalIndexOf(strDate, "(", 1)).trim();
				cal = addUnits(strAddOrSubtractDateElement, cal, strOperation);
				//System.out.print(" "+strOperation + " "+ strAddOrSubtractDateElement +" ");
			}catch (Exception e) {
				//e.printStackTrace();
			}

			for (int i = 2; i <= iElements; i++) {
				try {	
					strAddOrSubtractDateElement =  strDate.substring(StringUtils.ordinalIndexOf(strDate, "(", (i))+1, StringUtils.ordinalIndexOf(strDate, ")", i)).trim();//strDate.substring(strDate.indexOf("(", strDate.indexOf("(") + 1)+1 , strDate.indexOf(")", strDate.indexOf(")") + 1) );
					strOperation =  strDate.substring(StringUtils.ordinalIndexOf(strDate, ")", i-1)+1, StringUtils.ordinalIndexOf(strDate, "(", i)).trim();
					cal = addUnits(strAddOrSubtractDateElement, cal, strOperation);
					//System.out.print(" "+strOperation + " "+ strAddOrSubtractDateElement +" ");
				}catch (Exception e) {
					e.printStackTrace();
					continue;
				}

			}

			/****BASIC WITH ONLY 3 ELEMENTS
			String strOperation1 = "";
			String strAddOrSubtractDateElement1 = "";

			String strOperation2 = "";
			String strAddOrSubtractDateElement2 = "";

			String strOperation3 = "";
			String strAddOrSubtractDateElement3 = "";

			try {
				strAddOrSubtractDateElement1 =  strDate.substring(StringUtils.ordinalIndexOf(strDate, "(", 1)+1, StringUtils.ordinalIndexOf(strDate, ")", 1)).trim();//strDate.substring(strDate.indexOf("(", strDate.indexOf("(") )+1 , strDate.indexOf(")", strDate.indexOf(")") ) );
				strOperation1 =  strDate.substring(StringUtils.ordinalIndexOf(strDate, "NOW", 1)+3 , StringUtils.ordinalIndexOf(strDate, "(", 1)).trim();
				cal = addUnits(strAddOrSubtractDateElement1, cal, strOperation1);
			}catch (Exception e) {
				//e.printStackTrace();
			}

			try {	
				strAddOrSubtractDateElement2 =  strDate.substring(StringUtils.ordinalIndexOf(strDate, "(", 2)+1, StringUtils.ordinalIndexOf(strDate, ")", 2)).trim();//strDate.substring(strDate.indexOf("(", strDate.indexOf("(") + 1)+1 , strDate.indexOf(")", strDate.indexOf(")") + 1) );
				strOperation2 =  strDate.substring(StringUtils.ordinalIndexOf(strDate, ")", 1)+1, StringUtils.ordinalIndexOf(strDate, "(", 2)).trim();
				cal = addUnits(strAddOrSubtractDateElement2, cal, strOperation2);
			}catch (Exception e) {
				//e.printStackTrace();
			}

			try {
				strAddOrSubtractDateElement3 =  strDate.substring(StringUtils.ordinalIndexOf(strDate, "(", 3)+1, StringUtils.ordinalIndexOf(strDate, ")", 3)).trim();//strDate.substring(strDate.indexOf("(", strDate.indexOf("(") + 2)+1 , strDate.indexOf(")", strDate.indexOf(")") + 2) );
				strOperation3 =  strDate.substring(StringUtils.ordinalIndexOf(strDate, ")", 2)+1, StringUtils.ordinalIndexOf(strDate, "(", 3)).trim();
				cal = addUnits(strAddOrSubtractDateElement3, cal, strOperation3);
			} catch (Exception e) {
				//e.printStackTrace();
			}
			 BASIC WITHOUT DYNAMIC LOOP HAVING ONLY 3 ELEMENTS ****/	
			//System.out.println("Date Operation : "+ " "+ strAddOrSubtractDateElement1 +" "+" "+strAddOrSubtractDateElement2+" "+" "+strAddOrSubtractDateElement3);
			//System.out.println("Date Elements :NOW "+strOperation1 + " "+ strAddOrSubtractDateElement1 +" "+strOperation2+" "+strAddOrSubtractDateElement2+" "+strOperation3+" "+strAddOrSubtractDateElement3);
			//System.out.println("\n"+cal.getTime());
			/****/

			strDate =  sdf.format(cal.getTime());
			//System.out.println("\n"+strDate);
			return strDate;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * 
	 * @param strAddOrSubtractDateElement - 1DAY / 3 DAYS / 10 MINUTES
	 * @param cal - 
	 * @param operation "+" / "-"
	 * @return
	 */
	public Calendar addUnits (String strAddOrSubtractDateElement, Calendar cal, String strOperation)
	{
		try 
		{
			int units = 0; 
			if (strAddOrSubtractDateElement.contains("DAY"))
			{
				units = Integer.parseInt (strAddOrSubtractDateElement.substring(0, strAddOrSubtractDateElement.indexOf("DAY")).trim());
				if (strOperation.equals("-")){
					cal.add(Calendar.DAY_OF_YEAR, -units);
				}
				else {
					cal.add(Calendar.DAY_OF_YEAR, units);	
				}
			}
			else if (strAddOrSubtractDateElement.contains("YEAR"))
			{
				units = Integer.parseInt (strAddOrSubtractDateElement.substring(0, 
						strAddOrSubtractDateElement.indexOf("YEAR")).trim());
				if (strOperation.equals("-")){
					cal.add(Calendar.YEAR, -units);
				}
				else {
					cal.add(Calendar.YEAR, units);	
				}
			}
			else if (strAddOrSubtractDateElement.contains("MONTH"))
			{
				units = Integer.parseInt (strAddOrSubtractDateElement.substring(0, 
						strAddOrSubtractDateElement.indexOf("MONTH")).trim());
				if (strOperation.equals("-")){
					cal.add(Calendar.MONTH, -units);
				}
				else {
					cal.add(Calendar.MONTH, units);	
				}
			}
			else if (strAddOrSubtractDateElement.contains("HOUR"))
			{
				units = Integer.parseInt (strAddOrSubtractDateElement.substring(0, strAddOrSubtractDateElement.indexOf("HOUR")).trim());
				if (strOperation.equals("-")){
					cal.add(Calendar.HOUR, -units);
				}
				else {
					cal.add(Calendar.HOUR, units);	
				}
			}
			else if (strAddOrSubtractDateElement.contains("MIN"))	
			{
				units = Integer.parseInt (strAddOrSubtractDateElement.substring(0, strAddOrSubtractDateElement.indexOf("MIN")).trim());
				if (strOperation.equals("-")){
					cal.add(Calendar.MINUTE, -units);
				}
				else {
					cal.add(Calendar.MINUTE, units);	
				}
			}
			return cal;
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			return cal;
		}
	}

	public static void main (String[] args) {


		ApplicationUtility utility = new ApplicationUtility(null, false);
	
		try 
		{
			utility.wikipediaTest(null);
		}
		catch (Exception e) 
		{
			System.out.println("Inside Catch block...");
		}
		
	}


	/*
	 * Will substitute all the datatypes from the keywords present in excel 
	 * Valid allowable keywords so far 
	 * 			AUTOGEN - will generate a random unique integer of [X] characters  Eg : Awb_AUTOGEN[7] - > Awb_3424424
	 * 			INTEGER - Will generate an int data  - Eg : ABC_INTEGER[10]_XYZ - > ABC_10_XYZ
	 * 			DECIMAL - Will generate a double data - Eg - ABC_DECIMAL[10.1]_XYZ - > ABC_10.5_XYZ
	 * 			BOOLEAN - 		
	 * 	  		DATE - Will generate a date of format specified globally in sdf (SimpleDateFormatter) Global variable of Date Formatter
	 * 				NOW +/- XDAY(s)|HOUR(S)|MINUTE(S)| +/- X HOUR(S)|MINUTE(S)
	 * 				Eg : DATE[NOW - 2DAYS - 2HOURS + 5 MINUTES]   
	 * 			DONOTUSETHISPARAM - Will remove the key from your dataset - Use it when your client does not uses that textfield or has told to remove it from the page 
	 */
	public LinkedHashMap<String, String> substituteDataMapKeywords (LinkedHashMap<String, String> sortedDataMap) 
	{
		LinkedHashMap<String, String> row = getTempData();

		//Get client properties w.r.t Date Format / Currentcy Format, etc
		if (row.get("DATEFORMAT") == null)
		{
			rc = getApplicationProperties(row);
			Assert.assertTrue(rc);
			row = getTempData();	
		}

		//If Date format is not set - do not perform substitution
		if (row.get("DATEFORMAT") == null)
		{
			System.out.println("Substitution will not be performed, Unknown date format recieved from application");
			return sortedDataMap;
		}

		//Replace all keys and keep values after dot operator
		/*for (String strDataMapKey : sortedDataMap.keySet())
		{
			String strValue = sortedDataMap.get(strDataMapKey);
			String strNewKey = strDataMapKey.substring(strDataMapKey.indexOf(".")+1, strDataMapKey.length());
			System.out.println(""+strNewKey);
			sortedDataMap.put(strNewKey, strValue);
			//sortedDataMap.remove(strDataMapKey);
		}
		 */
		LinkedHashMap	<String, String> substituteDataMapKeywords = new LinkedHashMap<String, String> ();
		try 
		{
			for (String strDataMapKey : sortedDataMap.keySet())
			{
				String strDataMapValue = sortedDataMap.get(strDataMapKey);
				//System.out.println("Data - "+strDataMapKey+ " : "+strDataMapValue);

				//If Keyword consists of AUTOGEN
				if (strDataMapValue.toUpperCase().contains("AUTOGEN")){
					try {

						String strLength = strDataMapValue.substring(
								strDataMapValue.indexOf("[")+1, 
								strDataMapValue.indexOf("]"));
						//System.out.println("strLength : "+strLength);
						int iLength = Integer.parseInt(strLength);

						//Substitute Autogenerated of Length k numbers at place of the keyword
						String strNewDataMapValue = strDataMapValue.substring(0, strDataMapValue.indexOf("AUTOGEN["));//Start
						strNewDataMapValue += getUniqueIntegerValue(iLength);
						strNewDataMapValue += strDataMapValue.substring(strDataMapValue.indexOf("]") + 1, strDataMapValue.length());
						//System.out.println("strNewDataMapValue : "+strNewDataMapValue);
						substituteDataMapKeywords.put(strDataMapKey, strNewDataMapValue);

					} catch (Exception e) {
						e.printStackTrace();
						System.out.println("Cannot convert key "+strDataMapValue);
						substituteDataMapKeywords.put(strDataMapKey, strDataMapValue);
						continue;
					}

				}
				//If Keyword consists of AUTOGEN
				else if (strDataMapValue.toUpperCase().contains("ALPHGEN")){
						try {

							String strLength = strDataMapValue.substring(
									strDataMapValue.indexOf("[")+1, 
									strDataMapValue.indexOf("]"));
							//System.out.println("strLength : "+strLength);
							int iLength = Integer.parseInt(strLength);

							//Substitute Autogenerated of Length k numbers at place of the keyword
							String strNewDataMapValue = strDataMapValue.substring(0, strDataMapValue.indexOf("ALPHGEN["));//Start
							strNewDataMapValue += getUniqueValue_AlphabetsOnly(iLength);//getUniqueIntegerValue(iLength);
							strNewDataMapValue += strDataMapValue.substring(strDataMapValue.indexOf("]") + 1, strDataMapValue.length());
							//System.out.println("strNewDataMapValue : "+strNewDataMapValue);
							substituteDataMapKeywords.put(strDataMapKey, strNewDataMapValue);

						} catch (Exception e) {
							e.printStackTrace();
							System.out.println("Cannot convert key "+strDataMapValue);
							substituteDataMapKeywords.put(strDataMapKey, strDataMapValue);
							continue;
						}

					}
				else if (strDataMapValue.toUpperCase().contains("INTEGER")){
					try {

						String strNumber = strDataMapValue.substring(
								strDataMapValue.indexOf("[")+1, 
								strDataMapValue.indexOf("]"));
						//System.out.println("strLength : "+strNumber);
						long iNumber = Long.parseLong(strNumber);

						//Substitute Autogenerated of Length k numbers at place of the keyword
						String strNewDataMapValue = strDataMapValue.substring(0, strDataMapValue.indexOf("INTEGER["));//Start
						strNewDataMapValue += iNumber ; //getUniqueIntegerValue(iLength);
						strNewDataMapValue += strDataMapValue.substring(strDataMapValue.indexOf("]") + 1, strDataMapValue.length());
						//System.out.println("strNewDataMapValue : "+strNewDataMapValue);
						substituteDataMapKeywords.put(strDataMapKey, strNewDataMapValue);

					} catch (Exception e) {
						e.printStackTrace();
						System.out.println("Cannot convert key "+strDataMapValue);
						substituteDataMapKeywords.put(strDataMapKey, strDataMapValue);
						continue;
					}

				}
				else if (strDataMapValue.toUpperCase().contains("DECIMAL")){
					try {

						String strNumber = strDataMapValue.substring(
								strDataMapValue.indexOf("[")+1, 
								strDataMapValue.indexOf("]"));
						//System.out.println("strLength : "+strNumber);
						double iNumber = Double.parseDouble(strNumber);

						//Substitute Autogenerated of Length k numbers at place of the keyword
						String strNewDataMapValue = strDataMapValue.substring(0, strDataMapValue.indexOf("DECIMAL["));//Start
						strNewDataMapValue += iNumber ; //getUniqueIntegerValue(iLength);
						strNewDataMapValue += strDataMapValue.substring(strDataMapValue.indexOf("]") + 1, strDataMapValue.length());
						//System.out.println("strNewDataMapValue : "+strNewDataMapValue);
						substituteDataMapKeywords.put(strDataMapKey, strNewDataMapValue);

					} catch (Exception e) {
						e.printStackTrace();
						System.out.println("Cannot convert key "+strDataMapValue);
						substituteDataMapKeywords.put(strDataMapKey, strDataMapValue);
						continue;
					}

				}
				else if (strDataMapValue.toUpperCase().contains("BOOLEAN")){
					try {

						String strNewDataMapValue = strDataMapValue;
						strNewDataMapValue = strNewDataMapValue.replaceAll("BOOLEAN\\[Y\\]", "true");
						strNewDataMapValue = strNewDataMapValue.replaceAll("BOOLEAN\\[N\\]", "false");
						//System.out.println("strDataMapValue: "+strNewDataMapValue);
						/*String strFlag = strDataMapValue.substring(
								strDataMapValue.indexOf("[")+1, 
								strDataMapValue.indexOf("]"));
						//System.out.println("strLength : "+strNumber);
						String strNewDataMapValue = "false";
						if (strFlag != null && strFlag.toUpperCase().equals("Y"))
						{
							strNewDataMapValue = "true";
						}*/
						substituteDataMapKeywords.put(strDataMapKey, strNewDataMapValue);

					} catch (Exception e) {
						e.printStackTrace();
						System.out.println("Cannot convert key "+strDataMapValue);
						substituteDataMapKeywords.put(strDataMapKey, strDataMapValue);
						continue;
					}

				}
				// DATE Function Substitution
				else if (strDataMapValue.toUpperCase().contains("DATE")){
					try {
						String strDataMapValueNew = dateFunctionSubstitution(strDataMapValue);
						substituteDataMapKeywords.put(strDataMapKey, strDataMapValueNew);
					} catch (Exception e) {
						e.printStackTrace();
						System.out.println("Cannot convert key "+strDataMapValue);
						substituteDataMapKeywords.put(strDataMapKey, strDataMapValue);
						continue;
					}

				}
				else if (strDataMapValue.toUpperCase().contains("DONOTUSETHISPARAM")){
					//Will not add any value to return resultset - Not Even a blank
					//substituteDataMapKeywords.put(strDataMapKey, strDataMapValue);
				}
				else {
					substituteDataMapKeywords.put(strDataMapKey, strDataMapValue);
				}

				//For loop end for data map
			}

			return substituteDataMapKeywords;
		} catch (Exception e) {
			e.printStackTrace();
			logMessage("Substitute KEYWORDS with values", "Keywords from Datasheet should be replaced with actual values", "Unable to substitute Keywords with data in DataSheet, Please check the syntax for Keywords. <br/>Avoid Spaces. <br/>Allowable keywords INTEGER[n], <br/>DECINAL[n.k],<br/>DATE[NOW + (X DAYS|HOUR|MINUTES) +/- (Y DAY|HOURS|MINUTES) +/- (Z ...) +/- ...]", "Failed");
			return sortedDataMap;
		}

	}
	/*
	public boolean orderBulkUpdate(LinkedHashMap<String, String> row) {

		try {

			LinkedHashMap<String, String> pageDataMap = addOrderTest(row);
			//Assert.assertTrue(rc);
			if (pageDataMap == null){
				return false;
			}

			//Set Page size - After Order gets added in system and search for the order 
			rc = setOrderPageSize();
			Assert.assertTrue(rc);

			//Search for order
			rc = searchOrder(row);
			Assert.assertTrue(rc);

			//Check checkbox present for row 0- //*[contains(@id,'-0-uiGrid')]//*[@role='checkbox']
			String strOrderCheckbox = "//*[contains(@id,'-0-uiGrid')]//*[@role='checkbox']";
			rc = clickElementByXPath(strOrderCheckbox, "Order Checkbox");
			Assert.assertTrue(rc);

			//Click More Button 
			String strMoreButton = "//*[@id='bulkUpdate-record']";
			rc = clickElementByXPath(strMoreButton, "Bulk Update Button");
			Assert.assertTrue(rc);

			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}		
	}*/


	//Create an order and mark order to - Delivered
	public boolean markOrderDelivered (LinkedHashMap<String, String> row) {

		try {

			if (row.get("OrderNumber") == null || row.get("OrderNumber").equals("null") || row.get("OrderNumber").equals(""))
			{
				LinkedHashMap<String, String> pageDataMap = addOrderTest(row);
				//Assert.assertTrue(rc);
				if (pageDataMap == null){
					return false;
				}//

				//Set Page size - After Order gets added in system and search for the order 
				rc = setOrderPageSize();
				Assert.assertTrue(rc);
			}
			else
			{
				System.out.println("Order Already added, Test to mark it delivered...");
			}

			//Search for order
			rc = searchOrder(row);
			Assert.assertTrue(rc);

			//Check checkbox present for row 0- //*[contains(@id,'-0-uiGrid')]//*[@role='checkbox']
			String strOrderCheckbox = "//*[contains(@id,'-0-uiGrid')]//*[@role='checkbox']";
			rc = clickElementByXPath(strOrderCheckbox, "Order Checkbox");
			Assert.assertTrue(rc);

			//Click More Button 
			String strMoreButton = "//*[@id='more-action']";
			rc = clickElementByXPath(strMoreButton, "More Button");
			Assert.assertTrue(rc);

			//Click Mark Order Delivered - //a[@logi-google-analytics="order - delivered-record"]
			String strMarkDeliveredXPath = "//a[@logi-google-analytics='order - delivered-record' and @ng-click='dropdownAction(key)']";
			rc = clickElementByXPath(strMarkDeliveredXPath, "Mark Delivered");
			Assert.assertTrue(rc);

			//Click Confirm Button - //button [@data-bb-handler="confirm"]
			String strConfirmButton = "//button [@data-bb-handler='confirm']";
			rc = clickElementByXPath(strConfirmButton, "Confirm Button");
			//
			//Wait for Order Status to change to - //*[contains(@id, '-0-uiGrid-')]//*[contains (text(), 'Delivered')]
			String strOrderStatus = app_PageLabels.get("DELIVERED").getAsString();//initApp_getOrderStatusMappings("DELIVERED");//DELIVERED
			System.out.println("strStatus : "+strOrderStatus);
			String strChangedOrderStatus = strOrderStatus; //getMenuName("delivered");//"Delivered";
			String strChangedOrderStatusXPath = "//*[contains(@id, '-0-uiGrid-')]//*[contains (text(), '"+strChangedOrderStatus+"')]";
			String strActualElementText = getElementTextByXPath (strChangedOrderStatusXPath, "Order Status - "+strChangedOrderStatus);
			if (strActualElementText == null)
			{
				logMessage("Verify Order Status Change", "Order Status Should get changed to - "+strChangedOrderStatus, "Order Status is not changed to - "+strChangedOrderStatus, "Failed");
			}
			else {
				logMessage("Verify Order Status Change", "Order Status Should get changed to - "+strChangedOrderStatus, "Order Status is changed to - "+strChangedOrderStatus, "Passed");
			}

			//Click Mark Order Not Delivered - //a[@logi-google-analytics="order - notDelivered-record"]

			//Click Mark Order Cancelled - //a[@logi-google-analytics="order - cancelled-record"]

			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	//Create an order and mark order to - Delivered
	public boolean markOrderNotDelivered (LinkedHashMap<String, String> row) {

		try {

			//Create an order and add order number to tempdata
			LinkedHashMap<String, String> pageDataMap = addOrderTest(row);
			//Assert.assertTrue(rc);
			if (pageDataMap == null){
				return false;
			}

			if (!isApplicationLaunched){

				/*** Page Elements ***/
				String strOrderLabel = getMenuName("order");//Orders also reffered to as Tasks
				String strOrderMenu = "//*[text()="+strOrderLabel+"]";
				String strAllOrdersMenuItem = "//*[@logi-google-analytics='order']";
				String strDashBoard = "//*[@id='dashboard_cm']";

				/*Test Steps ***/
				rc = launchApplication (row);
				Assert.assertTrue(rc);

				rc = login (row);
				Assert.assertTrue(rc);

				//Wait for Dashboard to load
				waitForELement(strDashBoard);

				isApplicationLaunched = true;

				//Click Order
				rc = clickElementByXPath(strOrderMenu, "Order");
				Assert.assertTrue(rc);

				//Click All Orders
				rc = clickElementByJavascript(driver, strAllOrdersMenuItem, "All Orders");//clickElementByXPath(strAllOrdersMenuItem, "All Orders");
				Assert.assertTrue(rc);

			}

			//Adding waits due to performance issues on firefox
			TimeUnit.SECONDS.sleep(5);

			//row.put("OrderNumber","Ord182892435");

			//Set Page size - After Order gets added in system and search for the order 
			rc = setOrderPageSize();
			Assert.assertTrue(rc);

			//Search for order
			rc = searchOrder(row);
			Assert.assertTrue(rc);

			//Check checkbox present for row 0- //*[contains(@id,'-0-uiGrid')]//*[@role='checkbox']
			String strOrderCheckbox = "//*[contains(@id,'-0-uiGrid')]//*[@role='checkbox']";
			rc = clickElementByXPath(strOrderCheckbox, "Order Checkbox");
			Assert.assertTrue(rc);

			//Click More Button 
			String strMoreButton = "//*[@id='more-action']";
			rc = clickElementByXPath(strMoreButton, "More Button");
			Assert.assertTrue(rc);

			//Click Mark Order Not Delivered - //Click Mark Order Not Delivered - //a[@logi-google-analytics="order - notDelivered-record"]
			String strMarkNotDeliveredXPath = "//a[@logi-google-analytics='order - notDelivered-record' and @ng-click='dropdownAction(key)']";
			rc = clickElementByXPath(strMarkNotDeliveredXPath, "Mark Not Delivered");
			Assert.assertTrue(rc);

			//Click - Select Order Reason - Click Select Reason Button - //ul//a[@id="more-action" and contains (text(), 'Select Reason')]
			//String strSelectReasonXPath = "//ul//a[@id='more-action' and contains (text(), 'Select Reason')]";
			String strSelectReasonLabel = app_PageLabels.get("Select").getAsString()+" "+app_PageLabels.get("reason").getAsString();//Select Reason
			String strSelectReasonXPath = "//ul//a[@id='more-action' and contains (text(), '"+strSelectReasonLabel+"')]"; //Select reason
			rc = clickElementByXPath(strSelectReasonXPath, "Select Reason");
			Assert.assertTrue(rc);

			//Get all not delivered Statuses - https://demo.loginextsolutions.com/ClientApp/client/getByTypeAndId?type=NOTDELIVERED
			ArrayList<String> notDeliveredReasons = initApp_getByTypeAndId("NOTDELIVERED");
			if (notDeliveredReasons == null || 
					notDeliveredReasons.size() == 0){//
				return false;
			}

			//Click Select Reason - //a[contains (text(), 'No response from customer contact no')]
			String strNotDeliveredReason = notDeliveredReasons.get(0);//"No response from customer contact no";
			String strNotDeliveredReasonXPath = "//li[contains (., \""+strNotDeliveredReason+"\")]";//"//a[contains (text(), \""+strNotDeliveredReason+"\")]";
			rc = clickElementByXPath(strNotDeliveredReasonXPath, "Select Reason for not delivered- "+strNotDeliveredReason);
			Assert.assertTrue(rc);

			//Click Save Button - //a[text()='Save' and @ng-click="dropdownCancellationReason()"]
			String strSaveButtonXPath = "//cancellation-reason-modal//*[contains (@class , 'icon-Product-Icons_Save')]";//"//a[text()='"+app_PageLabels.get("save").getAsString()+"' and @ng-click='dropdownCancellationReason()']";
			rc = clickElementByXPath(strSaveButtonXPath, "Save Button");
			Assert.assertTrue(rc);

			//Click Confirm Button - //button [@data-bb-handler="confirm"]
			String strConfirmButton = "//button [@data-bb-handler='confirm']";
			rc = clickElementByXPath(strConfirmButton, "Confirm Button");

			//Wait for Order Status to change to - //*[contains(@id, '-0-uiGrid-')]//*[contains (text(), 'Delivered')]
			String strChangedOrderStatus = app_PageLabels.get("NOTDELIVERED").getAsString();//"Attempted";
			//String strChangedOrderStatus = getMenuName("delivered");//
			String strChangedOrderStatusXPath = "//*[contains(@id, '-0-uiGrid-')]//*[contains (text(), '"+strChangedOrderStatus+"')]";
			String strActualElementText = getElementTextByXPath (strChangedOrderStatusXPath, "Order Status - "+strChangedOrderStatus);
			if (strActualElementText == null)
			{
				logMessage("Verify Order Status Change", "Order Status Should get changed to - "+strChangedOrderStatus, "Order Status is not changed to - "+strChangedOrderStatus, "Failed");
			}
			else {
				logMessage("Verify Order Status Change", "Order Status Should get changed to - "+strChangedOrderStatus, "Order Status is changed to - "+strChangedOrderStatus, "Passed");
			}
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}




	//Create an order and mark order to - Cancelled
	public boolean markOrderCancelled (LinkedHashMap<String, String> row) {

		try {

			//Create an order and add order number to tempdata
			LinkedHashMap<String, String> pageDataMap = addOrderTest(row);
			//Assert.assertTrue(rc);
			if (pageDataMap == null){
				return false;
			}

			if (!isApplicationLaunched){

				rc = initApp_MenuItems(row);
				Assert.assertTrue(rc);

				String strOrderLabel = getMenuName("order");//Orders also reffered to as Tasks
				String strOrderMenu = "//*[text()="+strOrderLabel+"]";
				String strAllOrdersMenuItem = "//*[@logi-google-analytics='order']";
				String strDashBoard = "//*[@id='dashboard_cm']";

				rc = searchOrder(row);
				Assert.assertTrue(rc);

				/*Test Steps ***/
				rc = launchApplication (row);
				Assert.assertTrue(rc);

				rc = login (row);
				Assert.assertTrue(rc);

				//Wait for Dashboard to load
				waitForELement(strDashBoard);

				isApplicationLaunched = true;

				//Click Order
				rc = clickElementByXPath(strOrderMenu, "Order");
				Assert.assertTrue(rc);

				//Click All Orders
				rc = clickElementByJavascript(driver, strAllOrdersMenuItem, "All Orders");//clickElementByXPath(strAllOrdersMenuItem, "All Orders");
				Assert.assertTrue(rc);

			}

			//Adding wait for firefox 
			TimeUnit.SECONDS.sleep(5);

			//Set Page size - After Order gets added in system and search for the order 
			rc = setOrderPageSize();
			Assert.assertTrue(rc);

			TimeUnit.SECONDS.sleep(5);
			//Search for order
			rc = searchOrder(row);//
			Assert.assertTrue(rc);

			//Check checkbox present for row 0- //*[contains(@id,'-0-uiGrid')]//*[@role='checkbox']
			String strOrderCheckbox = "//*[contains(@id,'-0-uiGrid')]//*[@role='checkbox']";
			rc = clickElementByXPath(strOrderCheckbox, "Order Checkbox");
			Assert.assertTrue(rc);

			//Click More Button 
			String strMoreButton = "//*[@id='more-action']";
			rc = clickElementByXPath(strMoreButton, "More Button");
			Assert.assertTrue(rc);

			//Click Mark Order Cancelled - //Click Mark order Cancelled - //a[@logi-google-analytics="order - notDelivered-record"]
			String strMarkNotDeliveredXPath = "//a[@logi-google-analytics='order - cancelled-record' and @ng-click='dropdownAction(key)']";
			rc = clickElementByXPath(strMarkNotDeliveredXPath, "Mark Not Delivered");
			Assert.assertTrue(rc);//

			//Click - Select Order Reason - Click Select Reason Button - //ul//a[@id="more-action" and contains (text(), 'Select Reason')]
			String strSelectReasonLabel = app_PageLabels.get("Select").getAsString()+" "+app_PageLabels.get("reason").getAsString();//Select Reason
			String strSelectReasonXPath = "//ul//a[@id='more-action' and contains (text(), '"+strSelectReasonLabel+"')]";
			rc = clickElementByXPath(strSelectReasonXPath, "Select Reason");
			Assert.assertTrue(rc);

			//Get Cancellation Reason - https://demo.loginextsolutions.com/ClientApp/client/getByTypeAndId?type=CANCELREASONS
			ArrayList<String> cancellationReasons = initApp_getByTypeAndId("CANCELREASONS");
			if (cancellationReasons == null || 
					cancellationReasons.size() == 0){
				return false;
			}

			//Click Select Reason - //a[contains (text(), 'No response from customer contact no')]
			String strNotDeliveredReason = cancellationReasons.get(0);//"Customer Unavailable";
			String strNotDeliveredReasonXPath = "//li[contains (., \""+strNotDeliveredReason+"\")]";//"//a[contains (text(), \""+strNotDeliveredReason+"\")]";
			rc = clickElementByXPath(strNotDeliveredReasonXPath, "Select Reason for Cancellation - "+strNotDeliveredReason);
			Assert.assertTrue(rc);

			//Click Save Button - //a[text()='Save' and @ng-click="dropdownCancellationReason()"]
			String strSaveButtonXPath = "//cancellation-reason-modal//*[contains (@class , 'icon-Product-Icons_Save')]";//"//a[text()='"+app_PageLabels.get("save").getAsString()+"' and @ng-click='dropdownCancellationReason()']";
			//String strSaveButtonXPath = "//a[text()='Save' and @ng-click='dropdownCancellationReason()']";
			rc = clickElementByXPath(strSaveButtonXPath, "Save Button");
			Assert.assertTrue(rc);

			//Click Confirm Button - //button [@data-bb-handler="confirm"]
			String strConfirmButton = "//button [@data-bb-handler='confirm']";
			rc = clickElementByXPath(strConfirmButton, "Confirm Button");

			//Wait for Order Status to change to - //*[contains(@id, '-0-uiGrid-')]//*[contains (text(), 'Delivered')]
			String strChangedOrderStatus = app_PageLabels.get("CANCELLED").getAsString();//"Cancelled";
			String strChangedOrderStatusXPath = "//*[contains(@id, '-0-uiGrid-')]//*[contains (text(), '"+strChangedOrderStatus+"')]";
			String strActualElementText = getElementTextByXPath (strChangedOrderStatusXPath, "Order Status - "+strChangedOrderStatus);
			if (strActualElementText == null)
			{
				logMessage("Verify Order Status Change", "Order Status Should get changed to - "+strChangedOrderStatus, "Order Status is not changed to - "+strChangedOrderStatus, "Failed");
				rc = false;
			}
			else {
				logMessage("Verify Order Status Change", "Order Status Should get changed to - "+strChangedOrderStatus, "Order Status is changed to - "+strChangedOrderStatus, "Passed");
				rc = true;
			}


			return rc;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}


	public boolean orderListView(LinkedHashMap<String, String> row, boolean isMapViewValidation) {
		try 
		{

			//Navigate to orders page and get all application properties and tokens
			row = navigateToOrdersPage(row);
			Assert.assertNotNull(row);

			String strPageSize = "50";
			if (isMapViewValidation == true){
				//Click Map View button

				//Click Map View - logi-google-analytics="Orders - map view"
				String strMapView = "//*[@logi-google-analytics='Orders - map view']";
				rc = clickElementByXPath(strMapView, "Map View Button");
				Assert.assertTrue(rc);
			}

			//Set Page size
			rc = setOrderPageSize();//
			Assert.assertTrue(rc);
			strPageSize = "25";

			int iCurrentPageNumber = 0;
			int iTotalElements = 0;
			int iPageElementsFrom = 0;
			int iPageElementsTo = 0;
			String strDisabled = "false";

			rc = true;
			do {
				//Wait for page to resolve for first time 
				TimeUnit.SECONDS.sleep(5);
				
				iCurrentPageNumber++; 

				//Get the date range - Will be in GMT String
				String strElementXPath = "//*[@id='orderHeaderDateRange']";
				String strOrderHeaderDateRange = getAttributeByXPath(strElementXPath, "Date Header Range", "value");//getElementTextByXPath(strElementXPath, "Date Range Header");
				System.out.println("strOrderHeaderDateRange: "+strOrderHeaderDateRange);
				String strDateFrom = "";
				String strDateTo = "";
				if (strOrderHeaderDateRange != null 
						&& strOrderHeaderDateRange.contains(" - ")){
					String dateRange [] = strOrderHeaderDateRange.split(" - ");
					strDateFrom = dateRange [0].trim();
					strDateTo = dateRange [1].trim();
				}

				//Hit List View API for that date range - Will be in GMT String
				String strDateFormat = row.get("DATEFORMAT");
				SimpleDateFormat sdfSourceFormat = new SimpleDateFormat(strDateFormat);
				SimpleDateFormat sdfOutputFormat = new SimpleDateFormat("yyyy-MM-dd");

				Date startDate = sdfSourceFormat.parse(strDateFrom);
				Date endDate = sdfSourceFormat.parse(strDateTo);

				String strOrderStartDate = sdfOutputFormat.format(startDate) + " 00:00:00";
				String strOrderEndDate = sdfOutputFormat.format(endDate) + " 23:59:59";
				//
				JsonArray orderResults = getOrderListViewAPI(strOrderStartDate, strOrderEndDate, iCurrentPageNumber +"",  strPageSize, "ALL", null, null);
				System.out.println("orderResults: "+orderResults);

				//Validate resultset
				Assert.assertNotNull(orderResults);
				//mutedReporting = true;

				//Wait for results to rearrange
				TimeUnit.SECONDS.sleep(5);

				for (int i = 0; i < orderResults.size(); i++) 
				{
					if (i == 0)
					{
						//Skip checking first record - since parallely other tests might create different orders
						System.out.println("Skip checking for first record due to addition of object");
						continue;
					}
					JsonObject currentDataRecord = orderResults.get(i).getAsJsonObject();
					String strOrderNo = currentDataRecord.get("orderNo").getAsString();

					//verify whether object exists on page
					String strOrderNoXPath = "//a[text()='"+strOrderNo+"']";
					bringElementInView(strOrderNoXPath);//
					String strOrderNoActual = getElementTextByXPath(strOrderNoXPath, "Order No");
					if (strOrderNoActual == null || strOrderNoActual.equals(strOrderNo) == false){
						System.out.println("Order not fetched from UI...");
						rc = false;
						return false;
					}
				}
				/*
				if (iCurrentPageNumber % 2 == 0){

					for (int i = orderResults.size() -1; i >= 0; i--) 
					{
						JsonObject currentDataRecord = orderResults.get(i).getAsJsonObject();
						String strOrderNo = currentDataRecord.get("orderNo").getAsString();

						//verify whether object exists on page
						String strOrderNoXPath = "//a[text()='"+strOrderNo+"']";
						bringElementInView(strOrderNoXPath);//
						String strOrderNoActual = getElementTextByXPath(strOrderNoXPath, "Order No");
						if (strOrderNoActual == null || strOrderNoActual.equals(strOrderNo) == false){
							System.out.println("Order not fetched from UI...");
							rc = false;
							return false;
						}
					}
				}
				else {
					for (int i = 0; i < orderResults.size(); i++) 
					{
						JsonObject currentDataRecord = orderResults.get(i).getAsJsonObject();
						String strOrderNo = currentDataRecord.get("orderNo").getAsString();

						//verify whether object exists on page
						String strOrderNoXPath = "//a[text()='"+strOrderNo+"']";
						bringElementInView(strOrderNoXPath);//
						String strOrderNoActual = getElementTextByXPath(strOrderNoXPath, "Order No");
						if (strOrderNoActual == null || strOrderNoActual.equals(strOrderNo) == false){
							System.out.println("Order not fetched from UI...");
							rc = false;
							return false;
						}
					}
				}*/
				//mutedReporting = false;
				Assert.assertTrue(rc);

				//Loop through all dataset - or break it till the point it reaches 5 Pages Max
				ArrayList<Integer> pageDetails = getPaginationDetails ();
				iTotalElements = pageDetails.get(0);
				iPageElementsFrom = pageDetails.get(1);
				iPageElementsTo = pageDetails.get(2);

				//click next - //*[@value="Next"]
				String strNextPageButtonXPath = "//*[@value='Next']";
				clickElementByXPath(strNextPageButtonXPath, "Next Page Button");

				if (strDisabled != null && strDisabled.equals("true"))
				{
					System.out.println("Completed navigating for every page, Next button disabled...");
					break;
				}
				//Verify whether next button is not disabled..
				strDisabled = getAttributeByXPath(strNextPageButtonXPath, "Next Page Button", "disabled");
				System.out.println("strDisabled : "+strDisabled);

				if (iCurrentPageNumber > 0){//Stop Paginating and verify data on page
					logMessage("Verify pagination", "Pagination should be verified", "Verified pagination, Exiting out due to larger dataset", "Passed");
					break;
				}

			}
			while (iPageElementsFrom < iTotalElements);
			if (rc == false){
				logMessage("Verify pagination", "Should be able to verify pagination", "Pagination Failed", "Failed");
				rc = false;
			}
			else {
				logMessage("Verify pagination", "Should be able to verify pagination", "Successfully verified pagination", "Passed");
				rc = true;
			}
			return rc;
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			return false;
		}
	}


	/**
	 * Will take to user to Orders Page - Remember to reinitialize row since it will contain all tokens for APIs
	 * @param row
	 * @return
	 */
	public LinkedHashMap<String, String> navigateToOrdersPage (LinkedHashMap<String, String> row)
	{
		try 
		{

			//Launch App
			String strXPath = "";
			if (! isApplicationLaunched)
			{
				rc = launchApplication (row);
				Assert.assertTrue(rc);

				rc = login (row);
				Assert.assertTrue(rc);

				//Wait for Dashboard to load
				strXPath = "//*[@id='dashboard_cm']";///¬1/*[text()='Resource']";
				waitForELement(strXPath);
				//TimeUnit.SECONDS.sleep(10);

				isApplicationLaunched = true;
			}

			//Get login API auth key and client secret
			row = getAuthDetailsWeb (row);
			Assert.assertNotNull(row);

			//Assign Page Labels
			rc = initApp_PageLabels(row);
			Assert.assertTrue(rc);

			//Assign Menu Items
			rc = initApp_MenuItems(row);
			Assert.assertTrue(rc);

			rc = getApplicationProperties(row);
			Assert.assertTrue(rc);
			row = getTempData();

			//Navigate to Orders Page
			String strOrderLabel = getMenuName("order");//Orders also reffered to as Tasks

			//Click Order
			String strOrderMenu = "//*[text()="+strOrderLabel+"]";
			rc = clickElementByXPath(strOrderMenu, "Order");
			Assert.assertTrue(rc);

			//Click All Orders
			String strAllOrdersMenuItem = "//*[@logi-google-analytics='order']";
			rc = clickElementByJavascript(driver, strAllOrdersMenuItem, "All Orders");//clickElementByXPath(strAllOrdersMenuItem, "All Orders");
			Assert.assertTrue(rc);

			return row;
		}
		catch (Exception e) 
		{
			logMessage("Navigate to orders page", "Should be able to navigate to orders page", "Unable to navigate to orders page", "Failed");
			e.printStackTrace();
			return null;
		}
	}


	/**
	 * Will take to user to Wallets Page - Remember to reinitialize row since it will contain all tokens for APIs
	 * @param row
	 * @param strWalletScreenName - Wallet Transaction (wallettransaction) / Wallet Balances (walletbalance)
	 * @return
	 */
	public boolean navigateToWalletsPage (LinkedHashMap<String, String> row, String strWalletScreenName)
	{
		try 
		{

			//Launch App
			String strXPath = "";
			if (! isApplicationLaunched)
			{
				rc = launchApplication (row);
				Assert.assertTrue(rc);

				rc = login (row);
				Assert.assertTrue(rc);

				//Wait for Dashboard to load
				strXPath = "//*[@id='dashboard_cm']";///¬1/*[text()='Resource']";
				//waitForELement(strXPath);
				//TimeUnit.SECONDS.sleep(10);

				isApplicationLaunched = true;
			}

			//Get login API auth key and client secret
			row = getAuthDetailsWeb (row);
			Assert.assertNotNull(row);

			//Assign Page Labels
			rc = initApp_PageLabels(row);
			Assert.assertTrue(rc);

			//Assign Menu Items
			rc = initApp_MenuItems(row);
			Assert.assertTrue(rc);

			rc = getApplicationProperties(row);
			Assert.assertTrue(rc);
			row = getTempData();

			//Navigate to Wallet Page
			String strWalletLabel = getMenuName("wallet");

			//Click Wallet
			String strWalletMenu = "//*[text()="+strWalletLabel+"]";
			rc = clickElementByXPath(strWalletMenu, "Wallet");
			Assert.assertTrue(rc);

			//Navigate to Wallet Page
			System.out.println("strWalletScreenName : "+strWalletScreenName);
			String strWalletBalanceLabel = getMenuName(strWalletScreenName); // ("walletbalance");

			//Click Wallet
			String strWalletBalanceMenu = "//*[text()="+strWalletBalanceLabel+"]";
			rc = clickElementByJavascript(driver, strWalletBalanceMenu, strWalletBalanceLabel);//clickElementByXPath(strWalletBalanceMenu, strWalletBalanceLabel);
			Assert.assertTrue(rc);

			return rc;
		}
		catch (Exception e) 
		{
			logMessage("Navigate to wallets page", "Should be able to navigate to wallets page", "Unable to navigate to wallets page", "Failed");
			e.printStackTrace();
			return false;
		}
	}

	public boolean navigateToDeliveryBoyPage (LinkedHashMap<String, String> row){

		try 
		{
			String strXPath = "";
			if (! isApplicationLaunched)
			{
				rc = launchApplication (row);
				Assert.assertTrue(rc);

				rc = login (row);
				Assert.assertTrue(rc);

				//Get login API auth key and client secret
				row = getAuthDetailsWeb (row);
				Assert.assertNotNull(row);

				//Wait for Dashboard to load
				strXPath = "//*[@id='dashboard_cm']";///¬1/*[text()='Resource']";
				waitForELement(strXPath);
				//TimeUnit.SECONDS.sleep(10);

				isApplicationLaunched = true;
			}


			//Get login API auth key and client secret
			//row = getAuthDetailsWeb (row);
			//Assert.assertNotNull(row);

			//Get Application Label - key value pairs
			rc = initApp_PageLabels(row);
			Assert.assertTrue(rc);

			//Get page menu items
			rc = initApp_MenuItems(row);
			Assert.assertTrue(rc);

			//Click Resource
			String strResourcesLabel = getMenuName("Resource");//Orders also reffered to as Tasks
			strXPath = "//*[text()="+strResourcesLabel+"]";
			rc = clickElementByXPath (strXPath, "Resources Menu");
			Assert.assertTrue(rc);

			//Click Vehicle
			String strDeliveryBoy= getMenuName("deliveryMedium");
			strXPath = "//*[text()="+strDeliveryBoy+"]";
			rc = clickElementByJavascript(driver, strXPath, "Delivery Medium Menu");//clickElementByXPath(strXPath, "Delivery Medium Menu");
			Assert.assertTrue(rc);
			return true;
		}
		catch (Exception e) {
			logMessage("Navigate to Delivery Boy", "Should be able to navigate to delivery boy page", "Unable to navigate to delivery boy page", "Failed");
			e.printStackTrace();
			return false;
		}
	}
	

	public boolean navigateToRoutePlanningPage (LinkedHashMap<String, String> row){

		try 
		{
			String strXPath = "";
			if (! isApplicationLaunched)
			{
				rc = launchApplication (row);
				Assert.assertTrue(rc);

				rc = login (row);
				Assert.assertTrue(rc);

				//Get login API auth key and client secret
				row = getAuthDetailsWeb (row);
				Assert.assertNotNull(row);

				//Wait for Dashboard to load
				strXPath = "//*[@id='dashboard_cm']";///¬1/*[text()='Resource']";
				waitForELement(strXPath);
				//TimeUnit.SECONDS.sleep(10);

				isApplicationLaunched = true;
			}


			//Get login API auth key and client secret
			row = getAuthDetailsWeb (row);
			Assert.assertNotNull(row);

			//Get Application Label - key value pairs
			rc = initApp_PageLabels(row);
			Assert.assertTrue(rc);

			//Get page menu items
			rc = initApp_MenuItems(row);
			Assert.assertTrue(rc);

			//Click Resource
			String strResourcesLabel = getMenuName("Trip Planning");//Orders also reffered to as Tasks
			strXPath = "//*[text()="+strResourcesLabel+"]";
			rc = clickElementByXPath (strXPath, "Trip Planning");
			Assert.assertTrue(rc);

			//Click Route Planning
			String strRoutePlanningMenuItem = getMenuName("Route Planning");
			strXPath = "//*[text()="+strRoutePlanningMenuItem+"]";
			rc = clickElementByJavascript(driver, strXPath, "Route Planning Menu Item");//clickElementByXPath(strXPath, "Delivery Medium Menu");
			Assert.assertTrue(rc);
			return true;
		}
		catch (Exception e) {
			logMessage("Navigate to Delivery Boy", "Should be able to navigate to delivery boy page", "Unable to navigate to delivery boy page", "Failed");
			e.printStackTrace();
			return false;
		}
	}

	/**
	 * Will verify sorting on order page
	 * 
	 * @param row - Dataset from Excel
	 * @param strColumnName - Should be column label associated with Page Structure - Should be 'orderNo' for regular cases, - If needed to parameterize, Get it from Structure API - https://demo.loginextsolutions.com/LoginApp/framework/structure?modelName=ORDERS&pageName=ORDERS&sectionName=ALL_ORDER_LIST_VIEW
	 * @param strSortOrder - ASC / DESC 
	 * @return
	 */
	public boolean orderSorting (
			LinkedHashMap<String, String> row,
			String strColumnName,
			String strSortOrderInput) {
		try 
		{

			//Navigate to orders page and get back all API tokens and properties
			row = navigateToOrdersPage(row);
			Assert.assertNotNull(row);

			//Set Page size
			rc = setOrderPageSize();
			Assert.assertTrue(rc);

			//Wait for grid to load
			TimeUnit.SECONDS.sleep(5);

			////Sort by asc - on vehicle number - Click drop down next to Vehicle header column name - //*[@title='Vehicle No.']//following::i[@class='ui-grid-icon-angle-down'][1]
			String strOrderColumnLabel = getStructure_OrderListView ("orderNo");
			String strColumnDropdownXPath = "//*[@title='"+strOrderColumnLabel+"']//following::i[@class='ui-grid-icon-angle-down'][1]";
			rc = clickElementByXPath(strColumnDropdownXPath , strOrderColumnLabel+" - Dropdown");
			Assert.assertTrue(rc);

			TimeUnit.SECONDS.sleep(3);

			if (strSortOrderInput != null && strSortOrderInput.equals("ASC")){
				//Click sort by asc - //*[@class="ui-grid-icon-sort-alt-up"] - Sort by Asc is always menu item 0
				String strSortByAscXPath = "//*[@class='ui-grid-icon-sort-alt-up']";//"//*[@id='menuitem-0']";
				rc = clickElementByXPath(strSortByAscXPath , "Sort by Asc");
				Assert.assertTrue(rc);	
			}
			else// (strSortOrderInput.equalsIgnoreCase("DESC")) 
			{
				String strSortByDescXPath = "//*[@class='ui-grid-icon-sort-alt-down']";//"//*[@id='menuitem-0']";
				rc = clickElementByXPath(strSortByDescXPath , "Sort by Desc");
				Assert.assertTrue(rc);	
			}

			int iCurrentPageNumber = 0;
			int iTotalElements = 0;
			int iPageElementsFrom = 0;
			int iPageElementsTo = 0;
			String strDisabled = "false";

			rc = true;
			do {
				iCurrentPageNumber++; 

				/*//Get the date range - Will be in GMT String
				String strElementXPath = "//*[@id='orderHeaderDateRange']";
				String strOrderHeaderDateRange = getAttributeByXPath(strElementXPath, "Date Header Range", "value");//getElementTextByXPath(strElementXPath, "Date Range Header");
				System.out.println("strOrderHeaderDateRange: "+strOrderHeaderDateRange);
				String strDateFrom = "";
				String strDateTo = "";
				if (strOrderHeaderDateRange != null 
						&& strOrderHeaderDateRange.contains("-")){
					String dateRange [] = strOrderHeaderDateRange.split("-");
					strDateFrom = dateRange [0].trim();
					strDateTo = dateRange [1].trim();
				}

				//Hit List View API for that date range - Will be in GMT String
				String strDateFormat = row.get("DATEFORMAT");
				SimpleDateFormat sdfSourceFormat = new SimpleDateFormat(strDateFormat);
				SimpleDateFormat sdf_API_Input_Format = new SimpleDateFormat("yyyy-MM-dd");

				Date startDate = sdfSourceFormat.parse(strDateFrom);
				Date endDate = sdfSourceFormat.parse(strDateTo);

				String strOrderStartDate = sdf_API_Input_Format.format(startDate);
				String strOrderEndDate = sdf_API_Input_Format.format(endDate);
				 */

				//Wait for few seconds after you navigate to next page
				TimeUnit.SECONDS.sleep(5);

				//Click branch view
				String strWalletPageHeaderID = "//*[@id='orderHeaderDateRange']";
				String strOrderStartDate = getPageHeaderDates(strWalletPageHeaderID, "STARTDATE");
				String strOrderEndDate = getPageHeaderDates(strWalletPageHeaderID, "ENDDATE");

				//Return result set
				//String strSortOrder = strSortOrderInput; //"ASC";/DESC
				JsonArray orderResults = getOrderListViewAPI(
						strOrderStartDate, 
						strOrderEndDate, 
						iCurrentPageNumber +"", "25", "ALL", 
						strSortOrderInput,
						strColumnName);//
				System.out.println("orderResults: "+orderResults+"\n Size : "+orderResults.size());

				//Validate resultset
				Assert.assertNotNull(orderResults);


				for (int i = 0; i < orderResults.size(); i++) 
				{
					if (i == 0)
					{
						//Skip checking first record - since parallely other tests might create different orders
						System.out.println("Skip checking for first record due to addition of object");
						continue;
					}

					JsonObject currentDataRecord = orderResults.get(i).getAsJsonObject();
					String strOrderNo = currentDataRecord.get("orderNo").getAsString();

					//verify whether object exists on page - UPDATE it should reflect on the same row as provided in Json from BE Service
					String strOrderNoXPath =
							"//div[contains (@class,\"ui-grid-row\") and position() > "+(i-2)+" and not(position() > "+(i+2)+")]"//Should be on the same row as expected 
							+ "//a[text()='"+strOrderNo+"']";
							//"//a[text()='"+strOrderNo+"']";
					bringElementInView(strOrderNoXPath);
					String strOrderNoActual = getElementTextByXPath(strOrderNoXPath, "Order No");
					if (strOrderNoActual == null){
						return false;
					}
					if (strOrderNoActual != null && strOrderNoActual.equals(strOrderNo) == false){
						System.out.println("Order not fetched from UI...");
						rc = false;
					}
				}

				/*

				if (iCurrentPageNumber % 2 == 0)
				{


					for (int i = 0; i < orderResults.size(); i++) 
					{
						JsonObject currentDataRecord = orderResults.get(i).getAsJsonObject();
						String strOrderNo = currentDataRecord.get("orderNo").getAsString();

						//verify whether object exists on page
						String strOrderNoXPath = "//a[text()='"+strOrderNo+"']";
						bringElementInView(strOrderNoXPath);
						String strOrderNoActual = getElementTextByXPath(strOrderNoXPath, "Order No");
						if (strOrderNoActual != null && strOrderNoActual.equals(strOrderNo) == false){
							System.out.println("Order not fetched from UI...");
							rc = false;
						}
					}


				}
				else {

					for (int i = orderResults.size() -1 ; i>= 0; i--) 
					{
						JsonObject currentDataRecord = orderResults.get(i).getAsJsonObject();
						String strOrderNo = currentDataRecord.get("orderNo").getAsString();

						//verify whether object exists on page
						String strOrderNoXPath = "//a[text()='"+strOrderNo+"']";
						bringElementInView(strOrderNoXPath);
						String strOrderNoActual = getElementTextByXPath(strOrderNoXPath, "Order No");
						if (strOrderNoActual != null && strOrderNoActual.equals(strOrderNo) == false){
							System.out.println("Order not fetched from UI...");
							rc = false;
						}
					}
				}**/
				Assert.assertTrue(rc);

				//Loop through all dataset - or break it till the point it reaches 5 Pages Max
				ArrayList<Integer> pageDetails = getPaginationDetails ();
				iTotalElements = pageDetails.get(0);
				iPageElementsFrom = pageDetails.get(1);
				iPageElementsTo = pageDetails.get(2);

				//click next - //*[@value="Next"]
				String strNextPageButtonXPath = "//*[@value='Next']";
				clickElementByXPath(strNextPageButtonXPath, "Next Page Button");

				if (strDisabled != null && strDisabled.equals("true"))
				{
					System.out.println("Completed navigating for every page, Next button disabled...");
					break;
				}
				//Verify whether next button is not disabled..
				strDisabled = getAttributeByXPath(strNextPageButtonXPath, "Next Page Button", "disabled");
				System.out.println("strDisabled : "+strDisabled);

				if (iCurrentPageNumber > 0){
					logMessage("Verify Sorting", "Should be able to verify sorting", "Exiting out dur to a larger dataset", "Passed");
					break;
				}
			}
			while (iPageElementsFrom < iTotalElements);
			if (rc == false){
				logMessage("Verify pagination", "Should be able to verify pagination", "Pagination Failed", "Failed");
			}
			else {
				logMessage("Verify pagination", "Should be able to verify pagination", "Successfully verified pagination", "Passed");
			}
			return true;
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			return false;
		}
	}

	/**
	 * Will hit Web API - https://demo.loginextsolutions.com/ShipmentApp/shipment/fmlm?endDateFilter=2018-03-16&pageNumber=1&pageSize=25&startDateFilter=2018-03-09&status=ALL 
	 * @param strOrderStartDate - 2018-03-09
	 * @param strOrderEndDate - 2018-03-16
	 * @param strPageNumber - 1 / 2 / int...
	 * @param strPageSize - 25 
	 * @param strStatus - ALL
	 * @param strSortOrder - ASC / DESC / keep it null object for default page
	 * @param strColumnName - column name from Structure API
	 * @return
	 */
	public JsonArray getOrderListViewAPI (String strOrderStartDate, String strOrderEndDate, String strPageNumber, String strPageSize, String strStatus, String strSortOrder, String strColumnName){
		try 
		{

			LinkedHashMap <String,String> row = getTempData();

			//Get the auth token and Client Secret from from Auth API
			String strAPI = row.get("URL") + // demo.loginextsolutions.com/
					"ShipmentApp/shipment/fmlm?"
					+ "endDateFilter="+strOrderEndDate//2018-03-16"
					+ "&pageNumber="+strPageNumber//1"
					+ "&pageSize="+strPageSize//25"
					+ "&startDateFilter="+strOrderStartDate//2018-03-09"
					+ "&status="+strStatus;//ALL";

			if (strSortOrder != null && strSortOrder.equals("") == false){
				strAPI += "&sortOrder="+strSortOrder;
			}
			if (strColumnName != null && strColumnName.equals("") == false){
				strAPI += "&sortBy="+strColumnName;
			}

			System.out.println("Getting : "+strAPI+"");
			System.out.println("Headers \n"
					+ "client_secret_key:"+""+ row.get("clientSecretKey"));
			System.out.println("www-authenticate:"+""+ "BASIC "+row.get("token"));
			System.out.println("Content-Type:"+""+"application/json");

			Response structurePageModelResponse = given().when()
					.headers(
							"client_secret_key", row.get("clientSecretKey"),
							"www-authenticate", "BASIC "+row.get("token"),
							"Content-Type","application/json")
					.post(strAPI);

			/*.params("endDateFilter", strOrderEndDate, 
			"startDateFilter", strOrderStartDate, 
			"pageNumber", strPageNumber,
			"pageSize",strPageSize, 
			"status", strStatus)*/

			String strResults = structurePageModelResponse.getBody().asString();
			System.out.println("strResults: "+strResults);
			JsonParser parser = new JsonParser();
			JsonArray dataset = parser.parse(strResults).getAsJsonObject().get("data").getAsJsonObject().get("results").getAsJsonArray();
			return dataset;
		}
		catch (Exception e) 
		{

			if (iTimesAPI_RecoveryPerformed <= iMaxAPI_RecoveryAllowed)
			{
				iTimesAPI_RecoveryPerformed ++;
				logMessage("Performing API Recovery", "API should be responded", "Invoking API again for Error : "+e.getMessage(), "Passed");

				//Invoke the function again to get the page structure

				JsonArray orderResults = getOrderListViewAPI (strOrderStartDate, strOrderEndDate, strPageNumber, strPageSize, strStatus, strSortOrder, strColumnName);
				System.out.println("orderResults: "+orderResults);
				if (orderResults != null)
				{
					System.err.println("Fetched order results... ");
					return orderResults;
				}
			}
			logMessage("Get Table Details", "Table Details should be fetched", "Table Details API details not fetched : "+e.getLocalizedMessage(), "Failed");
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * 
	 * @param row - 
	 * @return
	 */
	public boolean orderColumnPreferences (LinkedHashMap<String, String> row) {
		try {

			//Navigate to orders page
			row = navigateToOrdersPage(row);
			Assert.assertNotNull(row);

			//Hit Order structure List view Columns from API - fetch back the columns associated with it - https://demo.loginextsolutions.com/LoginApp/framework/structure?modelName=ORDERS&pageName=ORDERS&sectionName=ALL_ORDER_LIST_VIEW
			JsonObject columns = getOrderListView_StructureAPI("columns");
			System.out.println("columns: "+columns);

			//Below LinkedHashMap will store the id and corrresponding title - when id gets deselected - the corresponding column should get disappeared and total count should be reduced...
			LinkedHashMap <String, String> colHeaders_ID_title = new LinkedHashMap<>();

			//Loop through the labels - Set Checkbox true
			for (String strKey : columns.keySet()){
				JsonObject strCurrentColumnObject = columns.get(strKey).getAsJsonObject(); 
				String strLabel = strCurrentColumnObject.get("label").getAsString();
				String strId = strCurrentColumnObject.get("id").getAsString();
				System.out.println("List view column : "+ strId+" : "+strLabel);
				colHeaders_ID_title.put(strId, strLabel);
			}

			//Click more icon - //*[@logi-google-analytics="vehicle - Show More Columns"]
			String strMoreIcon = "//*[contains (@logi-google-analytics, 'Show More Columns')]";
			rc = clickElementByXPath(strMoreIcon, "Show More Columns");
			Assert.assertTrue(rc);

			//Loop through the LinkedHashMap
			System.out.println("Total Columns : "+colHeaders_ID_title.size());
			for(Entry <String, String> currentHeader : colHeaders_ID_title.entrySet())
			{

				String strColumnID = currentHeader.getKey();
				String strColumnName = currentHeader.getValue();

				//Uncheck column name checkbox - false
				String strCheckboxXPath = "//input[@id='"+strColumnID+"' and @type='checkbox']";
				String strLabelXPath = "//label[@for='"+strColumnID+"']";// //label[@for='insuranceValidity']

				//Uncheck column name
				rc = clickCheckboxByXPath (strCheckboxXPath, strLabelXPath ,strColumnID, false);
				Assert.assertTrue(rc);

				//Verify column presence on screen - should be disappeared
				String strColumnHeaderXPath = "//div[@role='columnheader']//*[@title='"+strColumnName+"']";
				rc = isElementInvisible(strColumnHeaderXPath, "Column Header - "+strColumnName);
				Assert.assertTrue(rc);
				//
				//Check column name checkbox from preferences
				rc = clickCheckboxByXPath (strCheckboxXPath, strLabelXPath ,strColumnID, true);
				Assert.assertTrue(rc);

				//Verify column presence on screen - should return back  
				rc = verifyElementIsVisible (strColumnHeaderXPath, "Column Header - "+strColumnName);
				Assert.assertTrue(rc);
			}//Loop through the elements in LinkedHashMap till it gets exhausted and (optionally vice versa. - check if we select a checkbox the column appears on screen)

			if (rc == true)
			{
				logMessage("Verify column preferences", "Column Preferences should be fetched", "Successfully able to verify column preferences", "Passed");
			}
			else {
				logMessage("Verify column preferences", "Column Preferences should be fetched", "Unable to verify column preferences", "Failed");
				return false;
			}

			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}


	/**
	 * Will hit Order List view structure API - https://demo.loginextsolutions.com/LoginApp/framework/structure?modelName=ORDERS&pageName=ORDERS&sectionName=ALL_ORDER_LIST_VIEW
	 * @param strOrderStructureComponent - Can be buttons / columns / bodyTemplate from above API
	 * @return Objects of all order columns / buttons, etc from Structure API 
	 */
	public JsonObject getOrderListView_StructureAPI (String strOrderStructureComponent)
	{
		try 
		{

			LinkedHashMap <String,String> row = getTempData();

			//Get the auth token and Client Secret from from Auth API
			String strAPI = row.get("URL") + // demo.loginextsolutions.com/
					"LoginApp/framework/structure?modelName=ORDERS&pageName=ORDERS&sectionName=ALL_ORDER_LIST_VIEW";

			System.out.println("Getting : "+strAPI+"");
			System.out.println("Headers \n"
					+ "client_secret_key:"+""+ row.get("clientSecretKey"));
			System.out.println("www-authenticate:"+""+ "BASIC "+row.get("token"));
			System.out.println("Content-Type:"+""+"application/json");

			Response structurePageModelResponse = given().when()
					.headers(
							"client_secret_key", row.get("clientSecretKey"),
							"www-authenticate", "BASIC "+row.get("token"),
							"Content-Type","application/json")
					.get(strAPI);

			String strResults = structurePageModelResponse.getBody().asString();
			System.out.println("strResults: "+strResults);
			JsonParser parser = new JsonParser();
			System.out.println("Fetching from structure Order Component: "+strOrderStructureComponent);
			JsonObject dataset = parser.parse(strResults).getAsJsonObject().get(strOrderStructureComponent).getAsJsonObject();
			return dataset;
		}
		catch (Exception e) 
		{
			logMessage("Get Structure Details", "Structure Details should be fetched", "Structure Details API details not fetched results", "Failed");
			e.printStackTrace();
			return null;
		}
	}


	/*
	public boolean addOrder_LM_FM_Order(LinkedHashMap<String, String> row) {
		try 
		{
			if (isApplicationLaunched == false){

				//Launch
				rc = launchApplication(row);
				Assert.assertTrue(rc);

				//Switch default user and password to LMFM User
				row.put("UserName", row.get("UserName_LMFM"));
				row.put("Password", row.get("Password_LMFM"));
				updateTempData(row);

				//Login
				rc = login(row);
				Assert.assertTrue(rc);

			}

			//Navigate to Orders Page

			//

			return true;
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			logMessage("Verify Order Creation", "Create an order with LM FM Combination", "Unable to create order with LM and FM Combination", "Failed");
			return false;
		}
	}*/


	public boolean verifyVehicleDeletion (LinkedHashMap<String, String> row) {
		try 
		{

			//Launch and Navigate to Vehicle Page
			String strXPath = "";
			if (! isApplicationLaunched)
			{
				rc = launchApplication (row);
				Assert.assertTrue(rc);

				rc = login (row);
				Assert.assertTrue(rc);

				//Wait for Dashboard to load
				//strXPath = "//*[@id='dashboard_cm']";///¬1/*[text()='Resource']";
				//waitForELement(strXPath);
				//TimeUnit.SECONDS.sleep(10);

				isApplicationLaunched = true;
			}

			//Click Resource
			String strResourcesLabel = getMenuName("Resource");//Orders also reffered to as Tasks
			strXPath = "//*[text()="+strResourcesLabel+"]";
			rc = clickElementByXPath (strXPath, "Resources Menu");
			Assert.assertTrue(rc);

			//Click Vehicle
			String strVehicleLabel = getMenuName("Vehicle");
			strXPath = "//*[text()="+strVehicleLabel+"]";
			rc = clickElementByJavascript(driver, strXPath, "Vehicle Menu");//clickElementByXPath(strXPath, "Vehicle Menu");
			Assert.assertTrue(rc);

			TimeUnit.SECONDS.sleep(5);

			//rc = setVehiclePageSize();
			//Assert.assertTrue(rc);

			//Search for VehicleNumber
			String strVehicleNumber = row.get("VehicleNumber"); //"MH393722003";
			System.out.println("strVehicleNumber:" +strVehicleNumber);
			
			String strVehicleID = udsVehicleSearch(strVehicleNumber);
			if (strVehicleID == null || strVehicleID.equals("")){
				logMessage("Verify vehicle status", "Get vehicle ID after searching for vehicle number", "Unable to search for vehicle ID", "Failed");
				return false;
			}

			String strEditVehicleCheckBoxXPath = "//input[@id='"+strVehicleID+"' and @type='checkbox']";
			String strEditCheckboxLabelXPath = "//label[@for='"+strVehicleID+"']";
			String strDeleteVehicleButton = "//*[@id='delete-record']";
			String strConfirmButton = "//*[@data-bb-handler='confirm']";

			//Try to Update Vehicle to Inactive
			rc = clickCheckboxByXPath(strEditVehicleCheckBoxXPath, strEditCheckboxLabelXPath, "Edit Checkbox", true);
			Assert.assertTrue(rc);
			
			rc = clickElementByXPath(strDeleteVehicleButton, "'Delete Button");//Click Inactive - //a[@logi-google-analytics='vehicle - inActive-record']
			Assert.assertTrue(rc);
			
			rc = clickElementByXPath(strConfirmButton, "Confirm Ok Button");
			Assert.assertTrue(rc);
			
			//Verify for Message - Status changed successfully
			String strPromptXPath = "//*[@id='js-prompt']";
			String strPromptValue = "vehicle deleted successfully";

			String strVehicleSuccessMessage = strPromptValue;//app_PageLabels.get("vehicle.created.success").getAsString();
			System.out.println("strVehicleSuccessMessage: "+strVehicleSuccessMessage);
			rc = waitForJS_PromptMessageJS(strVehicleSuccessMessage, strPromptXPath);// waitForJS_PromptMessage(strExpectedPromptValue);

			if (rc)
			{
				logMessage("Verify Success Message", "Success Message - Vehicle created successfully should display", "Message : "+strVehicleSuccessMessage+" is displayed", "Passed");
			}
			else
			{
				strPromptValue = getPromptElementTextByXPath(strPromptXPath, "Prompt");//getElementTextByXPath(strPromptXPath, "Prompt");
				logMessage("Verify Success Message", "Message - Vehicle deleted successfully should display", "Message : '"+strVehicleSuccessMessage+"' is not displayed : Actual : "+strPromptValue, "Failed");
				return false;
			}

/*			
			//Try to Update Vehicle to Inactive
			rc = clickCheckboxByXPath(strEditVehicleCheckBoxXPath, strEditCheckboxLabelXPath, "Edit Checkbox", true);
			rc = clickElementByXPath(strDeleteVehicleButton, "'Delete Button");//Click Inactive - //a[@logi-google-analytics='vehicle - inActive-record']
			rc = clickElementByXPath(strConfirmButton, "Confirm Ok Button");
			Assert.assertTrue(rc);

			//Get Text from Prompt
			strPromptValue = getElementTextByXPath(strPromptXPath, "Prompt");
			if (strPromptValue != null && strPromptValue.toLowerCase().contains("vehicle deleted successfully"))
			{
				logMessage("Verify Success Message", "Success Message - vehicle deleted successfully should display", "Message : "+strPromptValue+" is displayed", "Passed");
			}
			else
			{
				logMessage("Verify Success Message", "Success Message - vehicle deleted successfully should display", "Message : "+strPromptValue+" is displayed, Unable to change status", "Failed");
				return false;
			}*/

			return true;
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			return false;	
		}

	}

	public boolean verifyVehicleListView(LinkedHashMap<String, String> row) {
		try {

			String strXPath = "";
			if (! isApplicationLaunched)
			{
				rc = launchApplication (row);
				Assert.assertTrue(rc);

				rc = login (row);
				Assert.assertTrue(rc);

				//Get login API auth key and client secret
				row = getAuthDetailsWeb (row);
				Assert.assertNotNull(row);

				//Wait for Dashboard to load
				strXPath = "//*[@id='dashboard_cm']";///¬1/*[text()='Resource']";
				waitForELement(strXPath);
				//TimeUnit.SECONDS.sleep(10);

				isApplicationLaunched = true;
			}

			//Get Application Label - key value pairs
			rc = initApp_PageLabels(row);
			Assert.assertTrue(rc);

			//Get page menu items
			rc = initApp_MenuItems(row);
			Assert.assertTrue(rc);

			updateTempData(row);

			//Click Resource
			String strResourcesLabel = getMenuName("Resource");//Orders also reffered to as Tasks
			strXPath = "//*[text()="+strResourcesLabel+"]";
			rc = clickElementByXPath (strXPath, "Resources Menu");
			Assert.assertTrue(rc);

			//Click Vehicle
			String strVehicleLabel = getMenuName("Vehicle");
			strXPath = "//*[text()="+strVehicleLabel+"]";
			rc = clickElementByJavascript(driver, strXPath, "Vehicle Menu");//clickElementByXPath(strXPath, "Vehicle Menu");
			Assert.assertTrue(rc);

			//Hit Trips Structure API and fetch column details   -structure?modelName=VEHICLE&pageName=VEHICLE&sectionName=VEHICLE_LIST_VIEW
			JsonObject vehicleListViewJsonResultData = getStructureAPI("VEHICLE", "VEHICLE", "VEHICLE_LIST_VIEW");
			System.out.println("vehicle cols : "+vehicleListViewJsonResultData);

			//Get Vehicle List View - //http://10.124.92.41/VehicleApp/vehicle/fmlm/list?pageNumber=1&pageSize=50
			JsonObject vehicleListView = getVehicleListView_API("1", "50");
			JsonArray vehicleResults = vehicleListView.get("data").getAsJsonObject().get("results").getAsJsonArray();
			for (int i = 0; i < vehicleResults.size(); i++) 
			{
				String strVehicleNumber = vehicleResults.get(i).getAsJsonObject().get("vehicleNumber").getAsString();//vehicleNumber
				System.out.println("strVehicleNumber: "+strVehicleNumber);
				String strVehicleNumberXPath = "//*[@title='"+strVehicleNumber+"']";//title="MH798446751"
				WebElement vehicleNumber = driver.findElement(By.xpath(strVehicleNumberXPath));
				bringElementInView(strVehicleNumberXPath);
				String strVehicleNumberActual = "";
				try {
					strVehicleNumberActual = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText" , vehicleNumber);
					if (strVehicleNumberActual == null || strVehicleNumberActual.equals(strVehicleNumber) == false){
						System.out.println("strVehicleNumberActual: "+strVehicleNumberActual+" Expected : "+strVehicleNumber);
						rc = false;
					}
				} catch (Exception e) {
					e.printStackTrace();
					rc = false;
				}

			}

			if (rc == false){
				System.out.println("Failed");
			}
			else {
				System.out.println("Passed");
			}
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}




	/**
	 * 
	 * @param row - will get the first vehicle number and 
	 * verify whether we are able to search for it 
	 * @return - true if the vehicle returned matches with the string we searched
	 */
	public boolean verifyVehicleSearching (LinkedHashMap<String, String> row) {
		try 
		{
			//Launch and Navigate to Vehicle Page
			String strXPath = "";
			if (! isApplicationLaunched)
			{
				rc = launchApplication (row);
				Assert.assertTrue(rc);

				rc = login (row);
				Assert.assertTrue(rc);

				//Wait for Dashboard to load
				strXPath = "//*[@id='dashboard_cm']";///¬1/*[text()='Resource']";
				waitForELement(strXPath);
				//TimeUnit.SECONDS.sleep(10);

				isApplicationLaunched = true;
			}

			//Navigate to vehicle page - if not navigated - Click Resource
			strXPath = "//*[text()='Resource']";
			rc = clickElementByXPath (strXPath, "Resources Menu");
			if (rc == false){
				return false;
			}

			//Click Vehicle
			strXPath = "//*[text()='Vehicle']";////*[text()='Resource']";
			rc = clickElementByXPath(strXPath, "Vehicle");
			if (rc == false){
				return false;
			}

			rc = setVehiclePageSize();
			Assert.assertTrue(rc);

			//Get random VehicleNumber
			List <WebElement> vehiclesElementsOnCurrentPage = udsGetVehicleList(driver);
			if (vehiclesElementsOnCurrentPage.size() <= 0)
			{
				logMessage("Get Vehicles on page", "Should be able to retrieve vehicles from current page to search for sample vehicle number", "No vehicles present on current page to search for", "Failed");
				return false;
			}

			String strVehicleNumber = vehiclesElementsOnCurrentPage.get(0).getText();
			System.out.println("Performing action on strVehicleNumber : "+strVehicleNumber);

			//Search for VehicleNumber 
			String strVehicleID = udsVehicleSearch(strVehicleNumber);
			if (strVehicleID == null || strVehicleID.equals("")){
				logMessage("Verify vehicle search", "Should be able to search for vehicle", "Unable to perform vehicle search", "Failed");
				return false;
			}
			logMessage("Verify vehicle search", "Should be able to search for vehicle", "Successfully performed vehicle search", "Passed");
			return true;	
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			return false;	
		}
	}



	public boolean verifyVehicleActiveInactive(LinkedHashMap<String, String> row) {
		try 
		{
			boolean testedForActive = false;
			boolean testedForInactive = false;

			//Launch and Navigate to Vehicle Page
			String strXPath = "";
			if (! isApplicationLaunched)
			{
				rc = launchApplication (row);
				Assert.assertTrue(rc);

				rc = login (row);
				Assert.assertTrue(rc);

				//Wait for Dashboard to load
				strXPath = "//*[@id='dashboard_cm']";///¬1/*[text()='Resource']";
				waitForELement(strXPath);
				//TimeUnit.SECONDS.sleep(10);

				isApplicationLaunched = true;
			}

			//Navigate to vehicle page - if not navigated - Click Resource
			strXPath = "//*[text()='Resource']";
			rc = clickElementByXPath (strXPath, "Resources Menu");
			if (rc == false){
				return false;
			}

			//Click Vehicle
			strXPath = "//*[text()='Vehicle']";////*[text()='Resource']";
			rc = clickElementByXPath(strXPath, "Vehicle");
			if (rc == false){
				return false;
			}

			rc = setVehiclePageSize();
			Assert.assertTrue(rc);

			//Get random VehicleNumber
			List <WebElement> vehiclesElementsOnCurrentPage = udsGetVehicleList(driver);
			if (vehiclesElementsOnCurrentPage.size() <= 0)
			{
				logMessage("Get Vehicles on page", "Should be able to retrieve vehicles from current page", "No vehicles present on current page", "Failed");
				return false;
			}

			String strVehicleNumber = vehiclesElementsOnCurrentPage.get(0).getText();
			System.out.println("Performing action on strVehicleNumber : "+strVehicleNumber);

			for (int i = 0; i <= 1; i++) 
			{
				//Search for VehicleNumber 
				String strVehicleID = udsVehicleSearch(strVehicleNumber);
				if (strVehicleID == null || strVehicleID.equals("")){
					logMessage("Verify vehicle status", "Get vehicle ID after searching for vehicle number", "Unable to search for vehicle ID", "Failed");
					return false;
				}

				//Verify its Status - //div[@id='vehicleId-status']
				String strVehicleStatusXPath = "//div[@id='vehicleId-status']";
				String strStatus = getElementTextByXPath(strVehicleStatusXPath, "Vehicle Status");

				//
				String strEditVehicleCheckBoxXPath = "//input[@id='"+strVehicleID+"' and @type='checkbox']";
				String strEditCheckboxLabelXPath = "//label[@for='"+strVehicleID+"']";
				String strMoreButton = "//a[@id='more-action']";
				String strMarkActiveBtn = "//a[@logi-google-analytics='vehicle - active-record']";
				String strMarkInActiveBtn = "//a[@logi-google-analytics='vehicle - inActive-record']";
				String strConfirmButton = "//*[@data-bb-handler='confirm']";

				//Verify for Message - Status changed successfully
				String strPromptXPath = "//*[@id='js-prompt']";
				String strPromptValue = "status changed successfully";

				//If Status = Available
				if (strStatus != null && strStatus.equalsIgnoreCase("Available")){

					//Try to Update Vehicle to Inactive
					rc = clickCheckboxByXPath(strEditVehicleCheckBoxXPath, strEditCheckboxLabelXPath, "Edit Checkbox", true);
					rc = clickElementByXPath(strMoreButton, "More Button");//Click More - //a[@id='more-action']
					rc = clickElementByXPath(strMarkInActiveBtn, "'Mark As Inactive' Button");//Click Inactive - //a[@logi-google-analytics='vehicle - inActive-record']
					rc = clickElementByXPath(strConfirmButton, "Confirm Ok Button");
					Assert.assertTrue(rc);

					//Get Text from Prompt
					strPromptValue = getElementTextByXPath(strPromptXPath, "Prompt");
					if (strPromptValue != null && strPromptValue.toLowerCase().contains("status changed successfully"))
					{
						logMessage("Verify Success Message", "Success Message - status changed successfully should display", "Message : "+strPromptValue+" is displayed", "Passed");
					}
					else
					{
						logMessage("Verify Success Message", "Success Message - status changed successfully should display", "Message : "+strPromptValue+" is displayed, Unable to change status", "Failed");
						return false;
					}

					//Verify Status gets changed to Inactive
					strStatus = getElementTextByXPath(strVehicleStatusXPath, "Vehicle Status");
					if (strStatus != null && strStatus.equalsIgnoreCase("Inactive")){
						logMessage("Set vehicle status to Inactive", "Vehicle status should get changed to Inactive", "Vehicle status changed to "+strStatus, "Passed");
					}
					else {
						logMessage("Set vehicle status to Inactive", "Vehicle status should get changed to Inactive", "Vehicle status is "+strStatus, "Failed");
						return false;
					}
					testedForInactive = true;
				}
				//If Status = Inactive
				else if (strStatus != null && strStatus.equalsIgnoreCase("Inactive")){ 

					//Try to update Vehicle Status to Available
					rc = clickCheckboxByXPath(strEditVehicleCheckBoxXPath, strEditCheckboxLabelXPath, "Edit Checkbox", true);
					rc = clickElementByXPath(strMoreButton, "More Button");//Click More - //a[@id='more-action']
					rc = clickElementByXPath(strMarkActiveBtn, "'Mark As Active' Button");//Click active - //a[@logi-google-analytics='vehicle - active-record']
					rc = clickElementByXPath(strConfirmButton, "Confirm Ok Button");
					Assert.assertTrue(rc);

					//Get Text from Prompt
					strPromptValue = getElementTextByXPath(strPromptXPath, "Prompt");
					if (strPromptValue != null && strPromptValue.toLowerCase().contains("status changed successfully"))
					{
						logMessage("Verify Success Message", "Success Message - status changed successfully should display", "Message : "+strPromptValue+" is displayed", "Passed");
					}
					else
					{
						logMessage("Verify Success Message", "Success Message - status changed successfully should display", "Message : "+strPromptValue+" is displayed, Unable to change status", "Failed");
						return false;
					}

					//Verify Status gets changed to Available
					strStatus = getElementTextByXPath(strVehicleStatusXPath, "Vehicle Status");
					if (strStatus != null && strStatus.equalsIgnoreCase("Available")){
						logMessage("Set vehicle status to available", "Vehicle status should get changed to Available", "Vehicle status changed to "+strStatus, "Passed");
					}
					else {
						logMessage("Set vehicle status to available", "Vehicle status should get changed to Available", "Vehicle status is "+strStatus, "Failed");
						return false;
					}
					testedForActive = true;
				}
				else {
					logMessage("Verify vehicle status", "Vehicle Status should be Available/Inactive", "Vehicle status is "+strStatus, "Failed");
					return false;
				}
			}//Reset to Original by iterating over the steps once more

			if (testedForActive == false){
				logMessage("Verify status change with active", "Should be able to change status to active", "Error in testing for status with Active", "Failed");
			}
			if (testedForInactive == false){
				logMessage("Verify status change with active", "Should be able to change status to active", "Error in testing for status with Inactive", "Failed");				
			}

			rc = testedForActive && testedForInactive;
			return rc;	
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			return false;	
		}
	}


	public boolean verifyVehicleColumnPreferences (LinkedHashMap<String, String> row) {
		try 
		{

			String strXPath = "";
			if (! isApplicationLaunched)
			{
				rc = launchApplication (row);
				Assert.assertTrue(rc);

				rc = login (row);
				Assert.assertTrue(rc);

				//Wait for Dashboard to load
				strXPath = "//*[@id='dashboard_cm']";///¬1/*[text()='Resource']";
				waitForELement(strXPath);
				//TimeUnit.SECONDS.sleep(10);

				isApplicationLaunched = true;
			}

			//Click Resource
			strXPath = "//*[text()='Resource']";
			rc = clickElementByXPath (strXPath, "Resources Menu");
			if (rc == false){
				return false;
			}

			//Click Vehicle
			strXPath = "//*[text()='Vehicle']";////*[text()='Resource']";
			rc = clickElementByXPath(strXPath, "Vehicle");
			if (rc == false){
				return false;
			}

			//Below LinkedHashMap will store the id and corrresponding title - when id gets deselected - the corresponding column should get disappeared and total count should be reduced...
			LinkedHashMap <String, String> colHeaders_ID_title = new LinkedHashMap<>();
			colHeaders_ID_title.put("vehicleNumber", "Vehicle No."); //div[@role="columnheader"]//*[@title='Vehicle No.']
			colHeaders_ID_title.put("vehicleType", "Type"); //div[@role="columnheader"]//*[@title='Vehicle No.']
			colHeaders_ID_title.put("capacityInUnits", "Capacity (in Units)"); //div[@role="columnheader"]//*[@title='Vehicle No.']
			colHeaders_ID_title.put("capacityInWeight", "Capacity (in Kg)"); //div[@role="columnheader"]//*[@title='Vehicle No.']
			colHeaders_ID_title.put("capacityInVolume", "Capacity (in Cc)");
			//colHeaders_ID_title.put("insuranceValidity", "TOOLTIP");//Insurance (Expiry Date)
			colHeaders_ID_title.put("driverName", "Driver");
			colHeaders_ID_title.put("tripNumber", "Trip No.");
			colHeaders_ID_title.put("orderCount", "No. Of Orders");
			colHeaders_ID_title.put("status", "Status");
			colHeaders_ID_title.put("tripStatus", "Trip Status");
			colHeaders_ID_title.put("isActiveFl", "Active/Inactive");

			//TimeUnit.SECONDS.sleep(3);

			//Click more icon - //*[@logi-google-analytics="vehicle - Show More Columns"]
			String strMoreIcon = "//*[@logi-google-analytics='vehicle - Show More Columns']";
			rc = clickElementByXPath(strMoreIcon, "Show More Columns");
			Assert.assertTrue(rc);

			//Loop through the LinkedHashMap
			int iTotalColumns = colHeaders_ID_title.size();
			for(Entry <String, String> currentHeader : colHeaders_ID_title.entrySet()){

				String strColumnID = currentHeader.getKey();
				String strColumnName = currentHeader.getValue();

				//Verify whether column is shown in UI.
				String strColumnHeaderXPath = "//div[@role='columnheader']//*[@title='"+strColumnName+"']";
				System.out.println("verify column header '"+strColumnName+"' is displayed...");
				boolean isDisplayed = verifyElementIsVisible (strColumnHeaderXPath, "Column Header - "+strColumnName);
				if (isDisplayed == false)
				{
					//Select the checkbox and validate the presence of column header
					System.out.println("Column is not displayed looping through next column...");
					continue;
				}

				//Count total columns 
				String strColHeadersCountXPath = "//div[@role='columnheader']";
				iTotalColumns = driver.findElements(By.xpath(strColHeadersCountXPath)).size();

				//Unselect one column from list - Identify Checkbox with its ID - LinkedHashMap's Key is the ID Attribute for checkbox
				String strCheckboxXPath = "//input[@id='"+strColumnID+"' and @type='checkbox']";
				String strLabelXPath = "//label[@for='"+strColumnID+"']";// //label[@for='insuranceValidity']
				rc = clickCheckboxByXPath (strCheckboxXPath, strLabelXPath ,strColumnID, false);
				Assert.assertTrue(rc);

				/***

				//Save - //*[@logi-google-analytics="vehicle - Save column preferences"]
				String strSaveColumnPreferences = "//*[@logi-google-analytics='vehicle - Save column preferences']";
				rc = clickElementByXPath (strSaveColumnPreferences, "Save Column Preferences");
				Assert.assertTrue(rc);

				//Verify for visibility for - Success Message 'Column preferences saved successfully'
				String strPromptXPath = "//*[@id='js-prompt']";
				String strPromptValue = "";

				//Get Text from Prompt
				strPromptValue = getElementTextByXPath(strPromptXPath, "Prompt");
				if (strPromptValue != null && strPromptValue.toLowerCase().contains("column preferences saved successfully"))
				{
					logMessage("Verify Info Message", "Info Message - Column preferences saved successfully should display", "Message : "+strPromptValue+" is displayed", "Passed");
				}
				else
				{
					logMessage("Verify Info Message", "Info Message - Column preferences saved successfully should display", "Message : '"+strPromptValue+"' is displayed, Unable to save column preferences", "Failed");
					return false;
				}
				 ***/

				iTotalColumns -- ;//Reduce total columns available on screen

				//Wait for Count of total column headers equal to current header size - Column Headers = //div[@role="columnheader"] - Should be equal to LinkedHashMap Size
				int iDisplayedColumns = driver.findElements(By.xpath(strColHeadersCountXPath)).size();
				int iCtr = 0;
				do {
					iDisplayedColumns = driver.findElements(By.xpath(strColHeadersCountXPath)).size();
					if (iCtr > 30){
						break;
					}
					iCtr++; TimeUnit.SECONDS.sleep(1);
					System.out.println("iDisplayedColumns : "+iDisplayedColumns+" Expecting column : "+iTotalColumns);
				} while (iDisplayedColumns != iTotalColumns);

				//Verify the column Header gets invisible - //div[@role="columnheader"]//*[@title='LinkedHashMapValue']
				rc = isElementInvisible(strColumnHeaderXPath, "Column Header - "+strColumnName); //verifyElementDisappeared(strColumnHeaderXPath, "Column Header - "+strColumnID);
				Assert.assertTrue(rc);

			}//Loop through the elements in LinkedHashMap till it gets exhausted and (optionally vice versa. - check if we select a checkbox the column appears on screen)

			//Loop Back through each checkbox and enable back all columns...
			for(Entry <String, String> currentHeader : colHeaders_ID_title.entrySet()){

				String strColumnID = currentHeader.getKey();
				String strColumnName = currentHeader.getValue();

				//Select one column from list - Identify Checkbox with its ID - LinkedHashMap's Key is the ID Attribute for checkbox
				String strCheckboxXPath = "//input[@id='"+strColumnID+"' and @type='checkbox']";
				String strLabelXPath = "//label[@for='"+strColumnID+"']";// //label[@for='insuranceValidity']
				rc = clickCheckboxByXPath (strCheckboxXPath, strLabelXPath ,strColumnID, true);
				Assert.assertTrue(rc);

				iTotalColumns ++ ;

				//Count total columns 
				String strColHeadersCountXPath = "//div[@role='columnheader']";

				//Wait for Count of total column headers equal to current header size - Column Headers = //div[@role="columnheader"] - Should be equal to LinkedHashMap Size
				int iDisplayedColumns = driver.findElements(By.xpath(strColHeadersCountXPath)).size();
				int iCtr = 0;
				do {
					iDisplayedColumns = driver.findElements(By.xpath(strColHeadersCountXPath)).size();
					if (iCtr > 30){
						break;
					}
					iCtr++; TimeUnit.SECONDS.sleep(1);
					System.out.println("iDisplayedColumns : "+iDisplayedColumns+" Expecting column : "+iTotalColumns);
				} while (iDisplayedColumns != iTotalColumns);

				//Verify whether column is shown in UI.
				String strColumnHeaderXPath = "//div[@role='columnheader']//*[@title='"+strColumnName+"']";
				System.out.println("verify column header '"+strColumnName+"' is displayed...");
				boolean isDisplayed = verifyElementIsVisible (strColumnHeaderXPath, "Column Header - "+strColumnName);
				if (isDisplayed == false)
				{
					//Select the checkbox and validate the presence of column header
					System.out.println("Column is not displayed looping through next column...");
					continue;
				}
			}

			return true;
		} catch (Exception e) {
			e.printStackTrace();
			logMessage("Verify Column Preferences", "Should be able to verify column preferences", "Unable to verify column preferences", "Failed");
			return false;
		}
	}



	public boolean isElementInvisible (String strXPath, String strElementName) {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		boolean returnVal = false;
		try{
			driver.findElement(By.xpath(strXPath));
		} catch (NoSuchElementException e){
			returnVal = true;
		}
		if (returnVal == true){
			logMessage("Verify Elemen -"+strElementName+" is disappeared", "Element should be disappeared", "Element "+strElementName+" is invisible", "Passed");
		}
		else {
			logMessage("Verify Elemen -"+strElementName+" is disappeared", "Element should be disappeared", "Element "+strElementName+" is still visible", "Failed");
			return false;
		}
		return returnVal;
	}



	public boolean verifyElementIsVisible (String strXPath, String strElementName) {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		boolean returnVal = true;
		try{
			driver.findElement(By.xpath(strXPath));
		} catch (NoSuchElementException e){
			returnVal = false;
		}
		return returnVal;
	}


	public boolean verifyElementIsVisible_DynamicWaits (String strXPath, String strElementName) {

		//Wait for the element to get visible
		//bringElementInView(strXPath);
		
		WebDriverWait wait = new WebDriverWait(driver, MAX_WAIT_TIME);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(strXPath)));
		
		boolean returnVal = true;
		try{
			driver.findElement(By.xpath(strXPath));//	driver.findElement(By.xpath(strXPath));
			logMessage("Verify element visibility", "Element should be visible", "Element : "+strElementName+" is visible", "Passed");
		} catch (NoSuchElementException e){
			logMessage("Verify element visibility", "Element should be visible", "Element : "+strElementName+" with XPath : "+strXPath+" is not visible", "Failed");
			returnVal = false;
		}
		return returnVal;
	}
	
	

	public boolean verifyElementVisible_DynamicWaits (String strXPath, String strElementName) {

		//Wait for the element to get visible
		//bringElementInView(strXPath);
		
		boolean returnVal = false;
		try{
			WebDriverWait wait = new WebDriverWait(driver, MAX_WAIT_TIME);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(strXPath)));
			driver.findElement(By.xpath(strXPath));//	driver.findElement(By.xpath(strXPath));
			logMessage("Verify element visibility", "Element should be visible", "Element : "+strElementName+" is visible", "Passed");
			returnVal = true;
		} catch (NoSuchElementException e){
			logMessage("Verify element visibility", "Element should be visible", "Element : "+strElementName+" with XPath : "+strXPath+" is not visible", "Failed");
			returnVal = false;
		}
		return returnVal;
	}
	
	
	

	public boolean verifyElementDisappeared (String strXPath, String strElementName){
		try {
			//WebElement element = driver.findElement(By.xpath(strXPath));
			int iCtr = 0;
			rc = true;
			boolean isPresent = true;
			do {
				isPresent = driver.findElements(By.xpath(strXPath)).size() > 0;
				iCtr ++;
				if (iCtr > MAX_WAIT_TIME){
					rc = false;
					break;
				}
				System.out.println(strElementName+" Element "+isPresent);
			}while (isPresent == true);

			if (rc == true){
				logMessage("Verify Elemen -"+strElementName+" is disappeared", "Element should be disappeared", "Element "+strElementName+" is invisible", "Passed");
			}
			else {
				logMessage("Verify Elemen -"+strElementName+" is disappeared", "Element should be disappeared", "Element "+strElementName+"is still visible", "Failed");
				return false;
			}
			return rc;	
		} catch (Exception e) {
			e.printStackTrace();
			logMessage("Verify Elemen -"+strElementName+" is disappeared", "Element should be disappeared", "Error in getting Element "+strElementName+"", "Failed");
			return false;
		}
	}

	/*
	public boolean verifyVehiclePaginationMoreDataset (LinkedHashMap <String, String> row)
	{

		//Launch -- if not launched
		String strXPath = "";
		if (! isApplicationLaunched)
		{
			rc = launchApplication (row);
			if (rc == false){
				return false;
			}

			rc = login (row);
			if (rc == false){
				return false;
			}

			//Wait for Dashboard to load
			strXPath = "//*[@id='dashboard_cm']";///¬1/*[text()='Resource']";
			waitForELement(strXPath);
			//TimeUnit.SECONDS.sleep(10);

			isApplicationLaunched = true;
		}

		//Navigate to vehicle page - if not navigated - Click Resource
		strXPath = "//*[text()='Resource']";
		rc = clickElementByXPath (strXPath, "Resources Menu");
		if (rc == false){
			return false;
		}

		//Click Vehicle
		strXPath = "//*[text()='Vehicle']";////*[text()='Resource']";
		rc = clickElementByXPath(strXPath, "Vehicle");
		if (rc == false){
			return false;
		}

		//rc = setVehiclePageSize(25);

		//Change Page size to 25
		//Set Page size = 25 - //select[@name="pageSize"]//option[@value='25']
		int iDataset = 100;

		String strPagesizeDropdownXPath = "//select[@name='pageSize']";  //option[@value='25']";
		Select selectPageDropDown =new Select (driver.findElement(By.xpath(strPagesizeDropdownXPath)));
		selectPageDropDown.selectByValue(""+iDataset);//"25");

		//Wait for vehicle column to appear exactly 25 - //*[@id="vehicleId-vehicleNumber"]
		//rc = udsWaitForVehiclesInListView(50);
		udsGetVehicleList(iDataset);		

		Assert.assertTrue(rc);

		return true;
	}*/

	public boolean verifyVehiclePagination (LinkedHashMap<String, String> row) 
	{
		try 
		{

			//Launch -- if not launched
			String strXPath = "";
			if (! isApplicationLaunched)
			{
				rc = launchApplication (row);
				if (rc == false){
					return false;
				}

				rc = login (row);
				if (rc == false){
					return false;
				}

				//Wait for Dashboard to load
				strXPath = "//*[@id='dashboard_cm']";///¬1/*[text()='Resource']";
				waitForELement(strXPath);
				//TimeUnit.SECONDS.sleep(10);

				isApplicationLaunched = true;
			}

			//Navigate to vehicle page - if not navigated - Click Resource
			strXPath = "//*[text()='Resource']";
			rc = clickElementByXPath (strXPath, "Resources Menu");
			if (rc == false){
				return false;
			}

			//Click Vehicle
			strXPath = "//*[text()='Vehicle']";////*[text()='Resource']";
			rc = clickElementByXPath(strXPath, "Vehicle");
			if (rc == false){
				return false;
			}

			rc = setVehiclePageSize();//
			Assert.assertTrue(rc);

			//Paginate through dataset - //Get total vehicles - //*[contains (@class, 'pagination-container') and contains (.,'of')]
			ArrayList<Integer> pageDetails = getPaginationDetails();
			int iTotalElements = pageDetails.get(0);

			//Will Loop over the vehicle pages and get an unsorted list of vehicle numbers
			List <String> allUnsortedVehicles = getAllUnsortedVehiclesOnVehiclePage();
			if (allUnsortedVehicles.size() == iTotalElements){
				//Pagination passed
				logMessage("Verify pagination", "Total Elements should be equal to vehicle present in List", "Pagination Passed : Vehicles present in List : "+allUnsortedVehicles.size()+" Total Vehicles : "+iTotalElements, "Passed");
			}
			else {
				//Pagination failed
				logMessage("Verify pagination", "Total Elements should be equal to vehicle present in List", "Pagination Failed : Vehicles present in List : "+allUnsortedVehicles.size()+" Total Vehicles : "+iTotalElements, "Failed");
				rc = false;
			}
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	public List <String> getAllUnsortedVehiclesOnVehiclePage (){

		try {

			//Paginate through dataset - //Get total vehicles - //*[contains (@class, 'pagination-container') and contains (.,'of')]
			ArrayList<Integer> pageDetails = getPaginationDetails ();
			int iTotalElements = pageDetails.get(0);
			int iPageElementsFrom = pageDetails.get(1);
			int iPageElementsTo = pageDetails.get(2);
			//System.out.println("iPageElementsTo: "+iPageElementsTo);
			//SortedSet <String> allUnsortedVehicles = new TreeSet<>();
			List <WebElement> unsortedVehicles = new ArrayList<>();
			List <String> allUnsortedVehiclesList = new ArrayList<>();

			//Set Page size
			rc = setVehiclePageSize();
			Assert.assertTrue(rc);

			//loop though till we dont get last value or value is less than total vehicles present
			String strDisabled = "";
			String strLastElem = "";
			while (iPageElementsTo < iTotalElements){


				pageDetails = getPaginationDetails();
				iTotalElements = pageDetails.get(0);
				iPageElementsFrom = pageDetails.get(1);
				iPageElementsTo =  pageDetails.get(2);
				System.out.println("Page From "+iPageElementsFrom+" to : "+iPageElementsTo+" Size "+iTotalElements);

				//Get vehicles in a list
				unsortedVehicles = udsGetVehicleList (driver);
				for (int i = 0; i < unsortedVehicles.size(); i++) 
				{
					WebElement element = unsortedVehicles.get(i);
					//System.out.println(element.getText());
					//allUnsortedVehicles.add(element.getText());
					allUnsortedVehiclesList.add(element.getText());
				}

				//click next - //*[@value="Next"]
				String strNextPageButtonXPath = "//*[@value='Next']";
				clickElementByXPath(strNextPageButtonXPath, "Next Page Button");

				if (strDisabled != null && strDisabled.equals("true"))
				{
					System.out.println("Completed navigating for every page, Next button disabled...");
					break;
				}
				//Verify whether next button is not disabled..
				strDisabled = getAttributeByXPath(strNextPageButtonXPath, "Next Page Button", "disabled");
				System.out.println("strDisabled : "+strDisabled);
			}
			//end loop
			return allUnsortedVehiclesList;

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	public boolean verifyVehicleSorting (LinkedHashMap<String, String>row)
	{
		try {

			String strXPath = "";
			if (! isApplicationLaunched)
			{
				rc = launchApplication (row);
				Assert.assertTrue(rc);

				rc = login (row);
				Assert.assertTrue(rc);

				//Wait for Dashboard to load
				strXPath = "//*[@id='dashboard_cm']";///¬1/*[text()='Resource']";
				waitForELement(strXPath);
				//TimeUnit.SECONDS.sleep(10);

				isApplicationLaunched = true;
			}


			//Navigate to vehicle page - if not navigated - Click Resource
			strXPath = "//*[text()='Resource']";
			rc = clickElementByXPath (strXPath, "Resources Menu");
			Assert.assertTrue(rc);

			//Click Vehicle
			strXPath = "//*[text()='Vehicle']";////*[text()='Resource']";
			rc = clickElementByXPath(strXPath, "Vehicle");
			Assert.assertTrue(rc);

			//Set Vehicle Page
			rc = setVehiclePageSize();
			Assert.assertTrue(rc);//

			//Get all unsorted vehicle list
			List <String> allUnsortedVehiclesList = getAllUnsortedVehiclesOnVehiclePage();

			//Remove lowercase chars due to sort error
			for (int i = 0; i < allUnsortedVehiclesList.size(); i++) 
			{
				System.out.println("allUnsortedVehiclesList "+allUnsortedVehiclesList.get(i));
				/*	String strCurrentVehicle = allUnsortedVehiclesList.get(i);
				if (strCurrentVehicle != null && strCurrentVehicle.equals(strCurrentVehicle.toLowerCase())){
					allUnsortedVehiclesList.remove(allUnsortedVehiclesList.get(i));
				}*/
			}

			String rules = ((RuleBasedCollator) Collator.getInstance(Locale.US)).getRules(); 
			RuleBasedCollator correctedCollator = new RuleBasedCollator(rules.replaceAll("<'\u005f'", "<' '<'\u005f'"));

			//Collator coll = Collator.getInstance(Locale.US);
			//coll.setStrength(Collator.IDENTICAL);
			Collections.sort(allUnsortedVehiclesList, correctedCollator);
			System.out.println("allUnsortedVehiclesList.size() : "+allUnsortedVehiclesList.size());

			//Collections.sort(allUnsortedVehiclesList);

			System.out.println("SortedList");
			for (int i = 0; i < allUnsortedVehiclesList.size(); i++) 
			{
				System.out.println("-"+"allUnsortedVehiclesList: "+allUnsortedVehiclesList.get(i));
			}

			//Navigate to vehicle page - if not navigated - Click Resource
			strXPath = "//*[text()='Resource']";
			rc = clickElementByXPath (strXPath, "Resources Menu");
			Assert.assertTrue(rc);

			//Click Vehicle
			strXPath = "//*[text()='Vehicle']";////*[text()='Resource']";
			rc = clickElementByXPath(strXPath, "Vehicle");
			Assert.assertTrue(rc);

			//Set Vehicle Page
			rc = setVehiclePageSize();
			Assert.assertTrue(rc);

			////Sort by asc - on vehicle number - Click drop down next to Vehicle header column name - //*[@title='Vehicle No.']//following::i[@class='ui-grid-icon-angle-down'][1]
			String strVehicleNumberDropdownXPath = "//*[@title='Vehicle No.']//following::i[@class='ui-grid-icon-angle-down'][1]";
			rc = clickElementByXPath(strVehicleNumberDropdownXPath , "Vehicle Number - Dropdown");
			Assert.assertTrue(rc);

			TimeUnit.SECONDS.sleep(3);

			//Click sort by asc - //*[@class="ui-grid-icon-sort-alt-up"] - Sort by Asc is always menu item 0
			String strSortByAscXPath = "//*[@class='ui-grid-icon-sort-alt-up']";//"//*[@id='menuitem-0']";
			rc = clickElementByXPath(strSortByAscXPath , "Sort by Asc");
			Assert.assertTrue(rc);

			//Print vehicle list
			List <WebElement> sortedVehiclesWebElem = udsGetVehicleList (driver);
			List <String> sortedVehicleOnFirstPage = new ArrayList<>();
			List <String> sortedVehiclesOnAllPages = new ArrayList<>();

			for (int i = 0; i < sortedVehiclesWebElem.size(); i++) 
			{
				WebElement element = sortedVehiclesWebElem.get(i);
				//System.out.println(element.getText());

				//Remove Lowercase chars for sorting error
				if (element.getText().equals(element.getText().toUpperCase()))
				{
					sortedVehicleOnFirstPage.add(element.getText());
					//sortedVehiclesWebElem.remove(sortedVehiclesWebElem.get(i));
				}
			}

			System.out.println("All Sorted Vehicles from all pages...");
			for (int i = 0; i < allUnsortedVehiclesList.size(); i++) 
			{
				String strCurrentVehicle = allUnsortedVehiclesList.get(i);

				//Add to sortedVehiclesOnAllPages if it is in Uppercase
				if (strCurrentVehicle.toUpperCase().equals(strCurrentVehicle)){
					sortedVehiclesOnAllPages.add(strCurrentVehicle);
				}
			}

			for (int i = 0; i < sortedVehiclesOnAllPages.size(); i++)
			{
				System.out.println("sortedVehiclesOnAllPages: "+sortedVehiclesOnAllPages.get(i));
			}

			for (int i = 0; i < sortedVehicleOnFirstPage.size(); i++) 
			{
				String element = sortedVehicleOnFirstPage.get(i);
				System.out.println(element);
				if (sortedVehiclesOnAllPages.contains(element)){
					if (sortedVehiclesOnAllPages.get(i).equalsIgnoreCase(element) == false)
					{
						//failed
						logMessage("Verify Elements", "Elements should be sorted in Asc Order", "Elements not equal", "Failed");
						rc = false;
					}
				}
			}
			System.out.println("allVehiclesList.size() : "+allUnsortedVehiclesList.size());

			if (rc == true){
				logMessage("Verify sort in Asc", "Sort vehicle in Asc", "Successfully verified sorting on vehicle names in Asc order", "Passed");
			}
			else {
				logMessage("Verify sort in Asc", "Sort vehicle in Asc", "Sorting failed in Asc order", "Failed");
				return false;
			}

			//Verify sorting on capacity in units desc order
			String strDropdownXPath = "//*[@title='Capacity (in Units)']//following::i[@class='ui-grid-icon-angle-down'][1]";

			////Sort by asc - on vehicle number - Click drop down next to Vehicle header column name - //*[@title='Vehicle No.']//following::i[@class='ui-grid-icon-angle-down'][1]
			rc = clickElementByXPath(strDropdownXPath , "Capacity (in Units) - Dropdown");
			Assert.assertTrue(rc);

			String strSortByDescXPath = "//*[@class='ui-grid-icon-sort-alt-down']";//"//*[@id='menuitem-0']";
			rc = clickElementByXPath(strSortByDescXPath, "Sort by Desc"); 
			Assert.assertTrue(rc);
			TimeUnit.SECONDS.sleep(3);

			//Get Numbers for Capacity (in Units) - //*[@id="vehicleId-capacityInUnits"]
			String strCapacityInUnitsColXPath = "//*[@id='vehicleId-capacityInUnits']";
			rc = verifyListViewData (strCapacityInUnitsColXPath, "Capacity in Units");
			Assert.assertTrue(rc);

			//Verify sorting on capacity in KGs desc order   
			strDropdownXPath = "//*[@title='Capacity (in Kg)']//following::i[@class='ui-grid-icon-angle-down'][1]";

			////Sort by asc - on vehicle number - Click drop down next to Vehicle header column name - //*[@title='Vehicle No.']//following::i[@class='ui-grid-icon-angle-down'][1]
			rc = clickElementByXPath(strDropdownXPath , "Capacity (in Kg) - Dropdown");
			Assert.assertTrue(rc);

			strSortByDescXPath = "//*[@class='ui-grid-icon-sort-alt-down']";//"//*[@id='menuitem-0']";
			rc = clickElementByXPath(strSortByDescXPath, "Sort by Desc"); 
			Assert.assertTrue(rc);
			TimeUnit.SECONDS.sleep(3);

			//Get Numbers for Capacity (in Wt) - //*[@id="vehicleId-capacityInWeight"]
			String strCapacityInKGColXPath = "//*[@id='vehicleId-capacityInWeight']";
			rc = verifyListViewData (strCapacityInKGColXPath, "Capacity in Wt");
			Assert.assertTrue(rc);

			//Verify sorting on capacity in CC desc order
			strDropdownXPath = "//*[@title='Capacity (in Cc)']//following::i[@class='ui-grid-icon-angle-down'][1]";

			////Sort by asc - on vehicle number - Click drop down next to Vehicle header column name - //*[@title='Vehicle No.']//following::i[@class='ui-grid-icon-angle-down'][1]
			rc = clickElementByXPath(strDropdownXPath , "Capacity (in CC) - Dropdown");
			Assert.assertTrue(rc);

			strSortByDescXPath = "//*[@class='ui-grid-icon-sort-alt-down']";//"//*[@id='menuitem-0']";
			rc = clickElementByXPath(strSortByDescXPath, "Sort by Desc"); 
			Assert.assertTrue(rc);
			TimeUnit.SECONDS.sleep(3);

			//Get Numbers for Capacity (in CC) - //*[@id="vehicleId-capacityInVolume"]
			String strCapacityInCColXPath = "//*[@id='vehicleId-capacityInVolume']";
			rc = verifyListViewData (strCapacityInCColXPath, "Capacity in CC");
			Assert.assertTrue(rc);

			//Verify by desc - on vehicle number - Click drop down next to Vehicle header column name - //*[@title='Vehicle No.']//following::i[@class='ui-grid-icon-angle-down'][1]

			/***strVehicleNumberDropdownXPath = "//*[@title='Vehicle No.']//following::i[@class='ui-grid-icon-angle-down'][1]";
			rc = clickElementByXPath(strVehicleNumberDropdownXPath , "Vehicle Number - Dropdown");
			Assert.assertTrue(rc);

			//Click sort by desc - //*[@class="ui-grid-icon-sort-alt-down"] - Sort by Desc is always menu item 1
			strSortByAscXPath = "//*[@class='ui-grid-icon-sort-alt-down']";//"//*[@id='menuitem-1']";
			rc = clickElementByXPath(strSortByAscXPath , "Sort by Desc");
			Assert.assertTrue(rc);

			//Print vehicle list
			List <WebElement> sortedDescVehiclesElem = udsGetVehicleList (driver);
			List <String> sortedDescVehiclesOnCurrentPage = new ArrayList<>();

			//Filter lowercase elements from desc array
			for (int i = 0; i < sortedDescVehiclesElem.size(); i++) 
			{
				String strElementText = sortedDescVehiclesElem.get(i).getText();
				if (strElementText != null && strElementText.equals(strElementText.toUpperCase())){
					sortedDescVehiclesOnCurrentPage.add(strElementText);
				}
			}

			//Get Sorted veicles in desc order
			List <String> sortedVehiclesAllPagesInDesc = new ArrayList<>();
			for (int i = sortedVehiclesOnAllPages.size() - 1; i>=0 ;i--) 
			{
				sortedVehiclesAllPagesInDesc.add(sortedVehiclesOnAllPages.get(i));
			}

			for (int i = 0; i < sortedDescVehiclesOnCurrentPage.size(); i++) 
			{
				System.out.println("Comparing : - "+sortedDescVehiclesOnCurrentPage.get(i) +" - "+sortedVehiclesAllPagesInDesc.get(i));
			}


			if (rc == true)
			{
				logMessage("Verify sort in Desc", "Sort vehicle in Desc", "Successfully verified sortingo on vehicles in Desc order", "Passed");
			}
			else
			{
				logMessage("Verify sort in Desc", "Sort vehicle in Desc", "Sorting failed in Desc order", "Failed");
				return false;
			}***/

			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean verifyListViewData (String strCapacityColXPath, String strColHeader) {	
		List <Double> allData = new ArrayList<>();
		List <WebElement> allElements = driver.findElements(By.xpath(strCapacityColXPath));

		for (int i = 0; i < allElements.size(); i++) 
		{
			String strElementText = allElements.get(i).getText();
			if (strElementText.contains(",")){
				strElementText = strElementText.replaceAll(",", "");
			}
			System.out.println(strElementText);

			try {
				allData.add(Double.parseDouble(strElementText));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		if (allData.size() == 0){
			logMessage("Verify sorting on "+strColHeader, "Sorting on capacity in units should be verified", "Element size is 0 for "+strColHeader, "Failed");
			return false;
		}
		else {
			for (int i = 0; i < allData.size() - 1; i++) 
			{
				//If any element is greater than next element - Failed it is not sorted
				if (allData.get(i+1) > allData.get(i))
				{
					logMessage("Sorting on "+strColHeader, "Sorting should be verified", "Sorting process failed in desc order for "+strColHeader, "Failed");			
					return false;
				}
			}
		}
		logMessage("Sorting on "+strColHeader, "Sorting should be verified", "Successfully verified sorting in desc order for "+strColHeader, "Passed");

		return true;
	}

	/**
	 * Will default vehicle page size 
	 * @return
	 */
	public boolean setVehiclePageSize (){

		//Change Page size to 25
		int iPageSize = 25;
		int iTotalVehicles = 0;
		int iCtr = 0;
		do {
			iTotalVehicles = udsGetVehicleList (driver).size();
			System.out.println("Loading Total Vehicles : "+iTotalVehicles);
			if (iCtr > 30){
				rc = false;
				break;
			}
			iCtr ++;
		}while (iTotalVehicles <= 0);

		if (rc == false){
			logMessage("Page load", "Verify elements on vehicle page", "No vehicles appeared on vehicle page", "Failed");
			return false;
		}

		//Set Page size = 25 - //select[@name="pageSize"]//option[@value='25']
		String strPagesizeDropdownXPath = "//select[@name='pageSize']";  //option[@value='25']";
		Select selectPageDropDown =new Select (driver.findElement(By.xpath(strPagesizeDropdownXPath)));
		selectPageDropDown.selectByValue(""+iPageSize);//"25");

		//Wait for vehicle column to appear exactly 25 - //*[@id="vehicleId-vehicleNumber"]
		rc = udsWaitForVehiclesInListView(iPageSize);
		Assert.assertTrue(rc);
		return rc;
	}

	/**
	 * Will default vehicle page size 
	 * @return
	 */
	public boolean setVehiclePageSize (int iPageSize){

		//Change Page size to 25
		int iTotalVehicles = 0;
		int iCtr = 0;
		do {
			iTotalVehicles = udsGetVehicleList (driver).size();
			System.out.println("Loading Total Vehicles : "+iTotalVehicles);
			if (iCtr>30)
			{
				rc = false;
				break;
			}iCtr ++;
		}while (iTotalVehicles <= 0);

		if (rc == false){
			return false;
		}

		//Set Page size = 25 - //select[@name="pageSize"]//option[@value='25']
		String strPagesizeDropdownXPath = "//select[@name='pageSize']";  //option[@value='25']";
		Select selectPageDropDown =new Select (driver.findElement(By.xpath(strPagesizeDropdownXPath)));
		selectPageDropDown.selectByValue(""+iPageSize);//"25");

		//Wait for vehicle column to appear exactly 25 - //*[@id="vehicleId-vehicleNumber"]
		rc = udsWaitForVehiclesInListView(iPageSize);
		Assert.assertTrue(rc);
		return rc;
	}

	/**
	 * Return an array of current page details 
	 * Having Below elements
	 * Total Page Size - Elem0
	 * From - Elem1
	 * To - Elem2
	 * @return
	 */
	public ArrayList<Integer> getPaginationDetails () {

		String strPaginationHeader = getCurrentPaginationHeader();
		ArrayList <Integer> pageDetails = new ArrayList<>();
		//System.out.println(strPaginationHeader);
		if (strPaginationHeader != null && strPaginationHeader.contains(app_PageLabels.get("of").getAsString() )){//"of")){
			try {

				//Split -1 - 25   of   90 by of
				String strPageElementsOfSize [] = strPaginationHeader.split(app_PageLabels.get("of").getAsString()); //"of");
				String strPageElements = strPageElementsOfSize [0].trim();// WIll Contain 1 - 25
				String strPageSize = strPageElementsOfSize [1].trim();// Will Contain 90

				int iPageSize = Integer.parseInt(strPageSize);
				pageDetails.add(iPageSize);

				//Split strPageElements by hyphen '-' 
				String strPage []= strPageElements.split("-");
				String strFromElement = strPage [0].trim();
				String strToElement = strPage [1].trim();

				int iFromElement = Integer.parseInt(strFromElement);
				int iToElement = Integer.parseInt(strToElement);
				pageDetails.add(iFromElement);
				pageDetails.add(iToElement);

			} catch (Exception e) {
				e.printStackTrace();
				return null;
			}
			return pageDetails;
		}
		else {
			return null;
		}
	}

	/**
	 * Will return current value for pagination 
	 * @return - Eg. - "1 - 25   of   90"
	 */
	public String getCurrentPaginationHeader () 
	{
		String strPaginationContainerXPath = "//*[contains (@class, 'pagination-container') and contains (.,'"+app_PageLabels.get("of").getAsString()+"')]";
		String strText = getElementTextByXPath(strPaginationContainerXPath, "Pagination Header");
		//System.out.println(strText);
		return strText;
	}

	public boolean updateVehicleInline(LinkedHashMap<String, String> row) {
		try 
		{
			//***rc = addVehicle(row);
			//***Assert.assertTrue(rc);

			//Test to update the added vehicle
			//***row = getTempData();

			String strVehicleNumber = "MH1235734831";//this.strVehicleNumber;
			System.out.println("strVehicleNumber: "+strVehicleNumber);
			//row.get("vehicleNumber");
			/*String strVehicleUnladenWt = row.get("unladdenWeight");
			String strVehicleCapacityUnits = row.get("capacityInUnits");
			String strsubIdWeight = row.get("capacityInWeight");
			String strVehilcleVolume = row.get("capacityInVolume");
			System.out.println("strVehicleUnladenWt: "+strVehicleUnladenWt);
			System.out.println("strVehicleCapacityUnits: "+strVehicleCapacityUnits);
			System.out.println("strsubIdWeight: "+strsubIdWeight);
			System.out.println("strVehilcleVolume: "+strVehilcleVolume);
			 */			

			//String strVehicleNumber = row.get("VehicleNumber");

			//Launch and navigate app if it is not launched
			String strXPath = "";
			if (! isApplicationLaunched)
			{
				rc = launchApplication (row);
				Assert.assertTrue(rc);

				rc = login (row);
				Assert.assertTrue(rc);

				//Wait for Dashboard to load
				strXPath = "//*[@id='dashboard_cm']";///¬1/*[text()='Resource']";
				waitForELement(strXPath);
				//TimeUnit.SECONDS.sleep(10);

				row = getAuthDetailsWeb(row);
				updateTempData(row);

				rc = initApp_PageLabels(row);
				Assert.assertTrue(rc);

				rc = initApp_MenuItems(row);
				Assert.assertTrue(rc);

				isApplicationLaunched = true;
			}
			/*
			//Click Resource
			strXPath = "//*[text()='Resource']";
			rc = clickElementByXPath (strXPath, "Resources Menu");
			if (rc == false){
				return false;
			}

			//Click Vehicle
			strXPath = "//*[text()='Vehicle']";////*[text()='Resource']";
			rc = clickElementByXPath(strXPath, "Vehicle");
			if (rc == false){
				return false;
			}
			 */
			//Search for vehicle//
			String strVehicleID = udsVehicleSearch (strVehicleNumber);
			if (strVehicleID == null)
			{
				System.out.println("Error in searching with vehicle number - "+strVehicleNumber);
				return false;
			}
			System.out.println("strVehicleID: "+strVehicleID);

			//Check for checkbox next to vehicle id
			String strVehicleCheckboxXPath = "//*[@id='"+strVehicleID+"' and @type='checkbox']"; //  //*[@id='vehicleId-12594' and @type='checkbox']
			WebElement element = driver.findElement(By.xpath(strVehicleCheckboxXPath));
			showWebElement(element);
			rc = clickElementByJavascript(driver, strVehicleCheckboxXPath, "Vehicle Checkbox");//clickElementByXPath(strVehicleCheckboxXPath, "Vehicle Checkbox");

			//Click Inline Update - //a[@id="update-record"]
			String strInlineUpdateXPath = "//a[@id='update-record']";
			rc = clickElementByXPath(strInlineUpdateXPath, "Inline Update Button");
			Assert.assertTrue(rc);

			//Update Data by entering new vehicle number
			String strNewVehicleNumberXPath = "//div[@id='vehicleId-vehicleNumber']//input[@type='text']";// - //div[@id="vehicleId-vehicleNumber"]//input[@type='text']
			rc = setValueByJavascript(driver, strNewVehicleNumberXPath, "Vehicle Number", "");
			strVehicleNumber = strVehicleNumber + "1";
			rc = sendKeys(strNewVehicleNumberXPath, strVehicleNumber, "Vehicle Number", true);
			Assert.assertTrue(rc);
			row.put("VehicleNumber", strVehicleNumber);

			//Update Capacity - Units  - //div[@id="vehicleId-capacityInUnits"]//input
			String strCapacityUnitsXPath = "//div[@id='vehicleId-capacityInUnits']//input[@type='text']";
			String strCapacityInUnitsValue = getAttributeByXPath(strCapacityUnitsXPath, "Capacity in Units", "value");
			//rc = sendKeys(strCapacityUnitsXPath, "", "Capacity in Units", false);
			rc = setValueByJavascript(driver, strCapacityUnitsXPath, "Capacity in Units", "");
			strCapacityInUnitsValue = strCapacityInUnitsValue + "1";
			rc = sendKeys(strCapacityUnitsXPath, strCapacityInUnitsValue, "Capacity in Units", true);
			Assert.assertTrue(rc);
			row.put("VehicleCapacityUnits", strCapacityInUnitsValue);

			//Update Capacity - Kgs
			//String strCapacityKGsXPath = id="vehicleId-capacityInWeight" // inpjut 
			String strCapacityInKGsXPath = "//div[@id='vehicleId-capacityInWeight']//input";
			String strCapacityInKGsValue = getAttributeByXPath(strCapacityInKGsXPath, "Capacity in KGs", "value");
			rc = setValueByJavascript(driver, strCapacityInKGsXPath, "Capacity in KGs", "");
			strCapacityInKGsValue = strCapacityInKGsValue + "1";
			rc = sendKeys(strCapacityInKGsXPath, strCapacityInKGsValue, "Capacity in KGs", true);
			Assert.assertTrue(rc);
			row.put("VehicleCapacityWtKgs", strCapacityInKGsValue);

			//Update Capacity in - CC
			String strCapacityInCCXPath = "//div[@id='vehicleId-capacityInVolume']//input";
			String strCapacityInCCValue = getAttributeByXPath(strCapacityInCCXPath, "Capacity in - CC", "value");
			rc = setValueByJavascript(driver, strCapacityInCCXPath, "Capacity in - CC", "");
			Assert.assertTrue(rc);
			strCapacityInCCValue = strCapacityInCCValue + "1";
			rc = sendKeys(strCapacityInCCXPath, strCapacityInCCValue, "Capacity in CC", true);
			row.put("VehicleCapacityVolumeCC", strCapacityInCCValue);

			//Save - id="save-record"
			String strSaveButtonXPath = "//*[@id='save-record']";
			rc = clickElementByXPath(strSaveButtonXPath , "Save Record");
			Assert.assertTrue(rc);

			//Search and validate data 
			rc = searchVehicleAndValidateDetails(row);//
			Assert.assertTrue(rc);

			return rc;
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			return false;
		}
	}

	/**
	 * Requires an input data for vehicleNumber, 
	 * Capacity in Units, Kgs and CC etc in row object
	 * to validate the row present with 
	 * existing added data 
	 * 
	 * @preconditions - should call addVehicle test before 
	 * this otherwise function will not be able to search 
	 * for the vehicle and will search for invalid data
	 * 
	 * @param row
	 * @return true if we are able to search for the vehicle
	 */
	public boolean searchVehicleAndValidateDetails (LinkedHashMap<String, String> row) {
		try 
		{

			String strVehicleNumber = row.get("VehicleNumber");
			String strVehicleTypeDropdownValue = row.get("VehicleType"); // VehicleType
			String strVehicleCapacityUnits =  row.get("VehicleCapacityUnits"); // VehicleCapacityUnits
			String strsubIdWeight =  row.get("VehicleCapacityWtKgs"); //VehicleCapacityWtKgs
			String strVehilcleVolume =  row.get("VehicleCapacityVolumeCC"); //VehicleCapacityVolumeCC			

			//Search for vehicleName and get the respective vehicleID
			String strVehicleID = udsVehicleSearch (strVehicleNumber);//
			System.out.println("strVehicleID : "+strVehicleID);
			Assert.assertTrue(rc);

			//Validate vehicle type cell - id="vehicleId-vehicleType" - //*[@id='vehicleId-vehicleType']//span[@id='vehicleId-13133'] 
			/*String strVehicleTypeTableXPath = "//*[@id='vehicleId-vehicleType']//span[@id='"+strVehicleID+"']";
			String strVehicleTypeTblValue = getElementTextByXPath(strVehicleTypeTableXPath, "Vehicle Type");
			rc = validateGivenValues ("Vehicle Type", strVehicleTypeDropdownValue, strVehicleTypeTblValue, false);
			Assert.assertTrue(rc);*/

			//Validate Capacity in Units - id="vehicleId-capacityInUnits" - //*[@id='vehicleId-capacityInUnits']//span[@id='vehicleId-13133']
			String strCapacityUnitsTableXPath = "//*[@id='vehicleId-capacityInUnits']//span[@id='"+strVehicleID+"']";
			String strCapacityInUnitsTblValue = getElementTextByXPath(strCapacityUnitsTableXPath, "Capacity in Units");
			rc = validateGivenValues ("Capacity in Units", strVehicleCapacityUnits, strCapacityInUnitsTblValue, true);
			Assert.assertTrue(rc);

			//Validate Capacity in Kgs - id="vehicleId-capacityInWeight" - //*[@id='vehicleId-capacityInWeight']//span[@id='vehicleId-13133']
			String strCapacityInKgsTblXpath = "//*[@id='vehicleId-capacityInWeight']//span[@id='"+strVehicleID+"']";
			String strCapacityInKgsTblValue = getElementTextByXPath(strCapacityInKgsTblXpath , "Capacity in Kgs");
			rc = validateGivenValues("Capcaity in Kgs", strsubIdWeight, strCapacityInKgsTblValue, true);
			Assert.assertTrue(rc);

			//Validate Capacity in CC - id="vehicleId-capacityInVolume" - id="vehicleId-capacityInVolume"
			String strCapacityInCCTblXpath = "//*[@id='vehicleId-capacityInVolume']//span[@id='"+strVehicleID+"']";
			String strCapacityInCCTblValue = getElementTextByXPath(strCapacityInCCTblXpath , "Capacity in CC");
			rc = validateGivenValues("Capcaity in CC", strVehilcleVolume, strCapacityInCCTblValue, true);
			Assert.assertTrue(rc);

			logMessage("Search and validate data","Should be able to search and validate data for Vehicle", "Successfully saearched and validated data", "Passed");
			return true;
		}
		catch (Exception e) 
		{
			logMessage("Search and validate data","Should be able to search and validate data for Vehicle", "Unable to search and validate data", "Failed");
			e.printStackTrace();
			return false;
		}

	}

	public boolean launchApplication(LinkedHashMap<String,String> row)
	{
		
		String strAppURL = null;
		try
		{
			strAppURL =  row.get("URL");//"http://localhost:9001/";
			System.out.println("Launching App");
			driver.get(strAppURL);
			logMessage("Launch Application", "Should be able to launch Application", "Successfully Launched application : URL : "+strAppURL, "Passed");
		}
		catch (Exception e)
		{
			e.printStackTrace();
			//Re-execute - Driver

			iTimesRecoveryPerformed ++;
			if (iTimesRecoveryPerformed < iMaxRecoveriesAllowed)
			{
				logMessage("Launch Application", "Should be able to launch Application", "Unable to Launch application, URL : "+strAppURL +" Error : "+e.getMessage()+" Re-executing application launch, Retry count : "+iTimesRecoveryPerformed, "Passed");
				try {
					
					//Close all existing browser windows
					waitForRandomSec(1);
					close();//Close all current instances...
					relaunchDriverInstance();//Relaunch driver...
					rc = launchApplication(row);
					if (rc){
						System.err.println("Successfully launched application...");
						return true;
					}
				} catch (Exception e2) {
					e2.getMessage();
				}
			}
			else
			{
				System.err.println("Max limits reached, Unable to launch application failing...");
			}
			
			logMessage("Launch Application", "Should be able to launch Application", "Unable to Launch application, URL : "+strAppURL +" Error : "+e.getMessage(), "Failed");
			return false;
		}
		return true;
	}

	public boolean login (LinkedHashMap<String, String> row) {

		try {

			String strUserName = row.get("UserName");
			String strPassword = row.get("Password");

			String strXPath = "//*[@id='username']";

			mutedReporting = true;
			boolean rc = sendKeys(strXPath, "", "UserName", true);
			if (rc == false){
				System.out.println("Relaunching application...");
				//close();
				driver.navigate().refresh();/*
				String strAppURL = row.get("URL");
				System.out.println("Launching App");
				driver.get(strAppURL);*/
			}
			mutedReporting = false;


			rc = sendKeys(strXPath, strUserName, "UserName", true);
			if (rc == false) {
				return false;
			}

			strXPath = "//*[@id='password']";
			rc = sendKeys(strXPath, strPassword, "Password", false);
			if (rc == false) {
				return false;
			}

			driver.findElement(By.xpath("//*[text()='Login']")).click();

		} catch (Exception e) {
			e.printStackTrace();
			logMessage("Login to application", "Should be able to login to application", "Unable to login to application", "Failed");
			return false;
		}
		return true;
	}


	/**
	 * 
	 * @param row - TestData Map Object
	 * @return true if delivery boy gets successfully added in system.
	 */
	@Deprecated // - Use addDeliveryBoyTest Instead
	public boolean addDeliveryBoy (LinkedHashMap<String, String> row) {

		try 
		{
			/*** Page Elements ***/
			String strDashBoard = "//*[@id='dashboard_cm']";
			String strEmployeeID_TextBox = "//*[@id='id-employee-id']";

			String strBranchNameSelect = "//div[@id='id-branch-name']";
			String strBranchTextBox = "//div[@id='id-branch-name']/descendant::input[not(contains(@ng-disabled,'$select.disabled'))]";

			String strUserGroupSelectBox = "//*[@id='id-user-group']";
			String strUserGroupTextBox = "//*[@id='id-user-group']/descendant::input[not(contains(@ng-disabled,'$select.disabled'))]";

			/*Test Steps ***/
			rc = launchApplication (row);
			Assert.assertTrue(rc);

			rc = login (row);
			Assert.assertTrue(rc);

			TimeUnit.SECONDS.sleep(10);

			//Wait for Dashboard to load
			rc = waitForELement(strDashBoard);
			Assert.assertTrue(rc);

			//Get login API auth key and client secret
			row = getAuthDetailsWeb (row);
			Assert.assertNotNull(row);

			//Get Application Label - key value pairs
			rc = initApp_PageLabels(row);
			Assert.assertTrue(rc);

			//Get page menu items
			rc = initApp_MenuItems(row);
			Assert.assertTrue(rc);

			//Click Resource
			String strResourcesLabel = getMenuName("Resource");//Orders also reffered to as Tasks
			String strXPath = "//*[text()="+strResourcesLabel+"]";
			rc = clickElementByXPath (strXPath, "Resources Menu");
			Assert.assertTrue(rc);

			//Click 
			String strDeliveryBoy= getMenuName("deliveryMedium");
			strXPath = "//*[text()="+strDeliveryBoy+"]";
			rc = clickElementByJavascript(driver, strXPath, "Delivery Medium Menu");//(strXPath, "Delivery Medium Menu");
			Assert.assertTrue(rc);
			/*
			//Click Resource
			String strResourceMenu = "//*[text()='Resource']";
			rc = clickElementByXPath(strResourceMenu, "Resources Menu");
			Assert.assertTrue(rc);
			TimeUnit.SECONDS.sleep(1);

			//Click Delivery Boy
			String strDeliveryBoyMenuItem = "//*[text()='Delivery Boy']";
			rc = clickElementByXPath(strDeliveryBoyMenuItem, "Delivery Boy");
			Assert.assertTrue(rc);
			 */
			//Click Add Button - //*[contains (@class,'icon-add')]
			String strAddButton = "//*[contains (@class,'icon-add')]"; // "//*[@class='logi-icon icon-Product-Icons_Add']";// "//*[contains (@class,'icon-add')]";
			rc = clickElementByXPath(strAddButton, "Add Button");
			Assert.assertTrue(rc);

			//Generate a random Number - 
			String strRandomNumber = getUniqueIntegerValue(9);
			String strImeiNumber = getUniqueIntegerValue(15);

			//Enter Employee ID
			String strText = "EmpID"+strRandomNumber;
			rc = sendKeys(strEmployeeID_TextBox, strText, "Emloyee ID Textbox", true);
			Assert.assertTrue(rc);

			//Get Value from DataMap and Enter Branch Name - 
			strText = "LMDMumbai";//row.get("Branch");

			//Click on main div - and sendkeys on the input element..
			/*clickElementByXPath (strBranchNameSelect, "Branch Name Textbox");
			rc = sendKeys(strBranchTextBox, strText, "Branch Name Textbox", true);
			Assert.assertTrue(rc);

			//Press Enter on Branch Name...
			TimeUnit.SECONDS.sleep(2);
			driver.findElement(By.xpath(strBranchTextBox)).sendKeys(Keys.ENTER);
			 */
			rc = udsSelectLM_Dropdown(strBranchNameSelect, "Branch Name", strText);
			Assert.assertTrue(rc);

			//Get Value from DataMap and Enter Branch Name - 
			strText = row.get("UserGroup");

			//Enter User Group - //*[@id="id-user-group"]
			/*clickElementByXPath(strUserGroupSelectBox, "User Group Textbox");
			rc = sendKeys(strUserGroupTextBox, strText, "User Group Textbox", true);
			Assert.assertTrue(rc);

			//Press Enter on User Group...
			TimeUnit.SECONDS.sleep(2);
			driver.findElement(By.xpath(strUserGroupTextBox)).sendKeys(Keys.ENTER);
			 */
			rc = udsSelectLM_Dropdown(strUserGroupSelectBox, "User Group Textbox", strText);
			Assert.assertTrue(rc);

			//Enter Full Name - //*[@id='id-full-name']
			String strFullNameTextBox = "//*[@id='id-full-name']";
			strText = "User"+strRandomNumber;
			rc = sendKeys(strFullNameTextBox, strText, "Full Name Textbox", true);
			Assert.assertTrue(rc);

			//Enter Mobile Number - //*[@name='mobile-number']//input  - Value - 9<Followed By 8 Random Digits>
			String strMobileNumberTextBox  = "//*[@name='mobile-number']//input";
			strText = "9"+strRandomNumber;
			rc = sendKeys(strMobileNumberTextBox, strText, "Mobile Number Textbox", true);
			Assert.assertTrue(rc);

			//Enter IMEI Number - //*[@name='imei-no']//input - 15 Random Characters
			String strIMEINumberTextBox = "//*[@name='imei-no']//input";
			strText = strImeiNumber;
			rc = sendKeys(strIMEINumberTextBox, strText, "IMEI Number Textbox", true);
			Assert.assertTrue(rc);

			//Enter Email ID - //*[@name='emailId'
			String strEmailDTextBox = "//*[@name='emailId']";
			String strEmail = "User"+strRandomNumber+"@test.com";
			rc = sendKeys(strEmailDTextBox, strEmail, "Email ID", true);
			Assert.assertTrue(rc);

			//Enter User Name - //*[@id='id-username']
			String strUserNameTextBox = "//*[@id='id-username']";
			String strUserName = "User"+strRandomNumber;
			rc = sendKeys(strUserNameTextBox, strUserName, "User Name", true);
			Assert.assertTrue(rc);

			//Enter Password - //*[@id='id-password']
			String strPassword = "Password123";
			String strPasswordTextBox = "//*[@id='id-password']";
			rc = sendKeys(strPasswordTextBox, strPassword, "Password", true);
			Assert.assertTrue(rc);

			//Confirm Password - //*[@id='id-confirm-password']
			String strPasswordConfirmTextBox = "//*[@id='id-confirm-password']";
			rc = sendKeys(strPasswordConfirmTextBox, strPassword, "Confirm Password", true);
			Assert.assertTrue(rc);

			//Capacity in Units - //*[@name='capacityInUnits']
			String strCapacityInUnitsTextBox = "//*[@name='capacityInUnits']";
			String strCapacityInUnitsValue = "10";
			rc = sendKeys(strCapacityInUnitsTextBox, strCapacityInUnitsValue, "Capacity In Units", true);
			Assert.assertTrue(rc);

			//Capacity in weight - //*[@name='capacityInWeight']
			String strCapacityInWeightTextBox = "//*[@name='capacityInWeight']";
			String strCapacityInWeightValue = "100";
			rc = sendKeys(strCapacityInWeightTextBox, strCapacityInWeightValue, "Capacity In Weight", true);
			Assert.assertTrue(rc);

			//Capacity in volume - //*[@name='capacityInVolume']
			String strCapacityInVolumeTextBox = "//*[@name='capacityInVolume']";
			String strCapacityInVomumeValue = "10";
			rc = sendKeys(strCapacityInVolumeTextBox, strCapacityInVomumeValue, "Capacity In Volume", true);
			Assert.assertTrue(rc);

			//Enter Date Of Birth - //*[@id='id-dob']
			String strDateOfBirth = "01/02/1992";
			String strDateOfBirthTextBox = "//*[@id='id-dob']";
			rc = sendKeys(strDateOfBirthTextBox, strDateOfBirth, "Date Of Birth", true);
			Assert.assertTrue(rc);

			//Enter Language - //*[@id='id-language'] 
			String strLanguageSelectBox = "//*[@id='id-language']";
			String strLanguageTextBox = "//*[@id='id-language']/descendant::input";
			String strLanguageValues = "ENGLISH,HINDI,MARATHI";

			//Loop through all Languages available...
			String strAllLanguages [] = strLanguageValues.split(",");
			//clickElementByXPath(strLanguageSelectBox, "User Language");
			for (int i = 0; i < strAllLanguages.length; i++) {

				String strCurrentLanguageValue = strAllLanguages[i];
				rc = udsSelectLM_Dropdown(strLanguageSelectBox, "User Language", strCurrentLanguageValue);
				Assert.assertTrue(rc);
				/*
				//Enter Current Language
				String strCurrentLanguageValue = strAllLanguages[i];
				rc = sendKeys(strLanguageTextBox, strCurrentLanguageValue, "User Language", true);
				Assert.assertTrue(rc);

				//Press Enter on Language Select Box...
				TimeUnit.SECONDS.sleep(2);
				driver.findElement(By.xpath(strLanguageTextBox)).sendKeys(Keys.ENTER);
				 */
			}

			//Select Delivery Boy's Gender
			String strGenderValue = "Male";
			String strGenderRadioButton = "//input[@id='Male']//ancestor::div[1]";
			if (strGenderValue != null && strGenderValue.equalsIgnoreCase("Female")){
				strGenderRadioButton = "//input[@id='Female']//ancestor::div[1]";;
			}
			else {
				strGenderRadioButton = "//input[@id='Male']//ancestor::div[1]";
			}
			rc = clickElementByXPath(strGenderRadioButton, "Gender");
			Assert.assertTrue(rc);

			//Set Vehicle Ownership - id="Owned" / id="Company"
			String strVehicleOwnership = "Company";
			String strVehicleOwnershipRadioBtn = "//input[@id='Owned']//ancestor::div[1]";
			if (strVehicleOwnership != null && 
					strVehicleOwnership.equals("Company")){
				strVehicleOwnershipRadioBtn = "//input[@id='Company']//ancestor::div[1]";

				rc = clickElementByXPath(strVehicleOwnershipRadioBtn, "Vehicle Ownership");
				Assert.assertTrue(rc);

				//Set Vehicle Number
				//String strVehicleNumberValue = "KA12-3412-34";
				String strVehicleNumberSelectBox = "//*[@id='id-vehicle-number']";
				String strVehicleNumberInputBox = "//*[@id='id-vehicle-number']//input";

				rc = clickElementByXPath(strVehicleNumberSelectBox, "Vehicle Ownership");
				Assert.assertTrue(rc);

				//Get all options for vehicle number
				List <WebElement> allOptions = getAllElementsFromSelect(strVehicleNumberSelectBox , "Vehicle Number");
				if (allOptions.size() == 0)
				{
					System.err.println("No option availalble to select from dropdown...");
					logMessage("Verify vehicle number", "Vehicle number should be selected", "No vehicle number present in dropdown", "Failed");
					return false;
				}
				else
				{

					//Get first Option WebElement
					System.out.println(allOptions.size() +""+allOptions.toArray().toString());
					WebElement option = allOptions.get(0);
					System.out.println("Clicking Option Name : "+option.getText());
					String strOptionToSelect = option.getText();

					//Click on the Option
					rc = udsSelectLM_Dropdown(strVehicleNumberSelectBox, "Vehicle Number", strOptionToSelect);
					Assert.assertTrue(rc);
				}


			}
			else if (strVehicleOwnership != null && 
					strVehicleOwnership.equals("Owned")) {
				strVehicleOwnershipRadioBtn = "//input[@id='Owned']//ancestor::div[1]";

				rc = clickElementByXPath(strVehicleOwnershipRadioBtn, "Vehicle Ownership");
				Assert.assertTrue(rc);

			}

			//Set Delivery Medium Type = //*[@id='id-delivery-medium-type']
			String strDeliveryMediumTypeSelect = "//*[@id='id-delivery-medium-type']";
			String strDeliveryMediumTypeInputBox = "//*[@id='id-delivery-medium-type']//input";
			String strDeliveryMediumTypeValues = "Type A,Type B";

			//Loop through all delivery medium types...
			String strDeliveryMediumTypes [] = strDeliveryMediumTypeValues.split(",");
			for (int i = 0; i < strDeliveryMediumTypes.length; i++) {

				String strCurrentDeliveryMediumType = strDeliveryMediumTypes[i];
				rc = udsSelectLM_Dropdown(strDeliveryMediumTypeSelect, "Delivery Medium Type", strCurrentDeliveryMediumType);
				Assert.assertTrue(rc);

				//Click on Select Button
				/*clickElementByXPath(strDeliveryMediumTypeSelect, "Delivery Medium Type");
				Assert.assertTrue(rc);

				//Type Delivery Medium Type 
				rc = sendKeys(strDeliveryMediumTypeInputBox, strCurrentDeliveryMediumType, "Delivery Medium Type", true);
				Assert.assertTrue(rc);

				//Click Enter
				TimeUnit.SECONDS.sleep(2);
				driver.findElement(By.xpath(strDeliveryMediumTypeInputBox)).sendKeys(Keys.ENTER);
				 */
			}

			//Enter Preffered Postal Code - id="id-preferred-pincode"
			String strPostalCodeSelectBox = "//*[@id='id-preferred-pincode']";
			String strPostalCodeInput = "//*[@id='id-preferred-pincode']//input";
			String strPostalCodeValue = "401107";

			//Click on Select Button
			/*clickElementByXPath(strPostalCodeSelectBox, "Postal Code");
			Assert.assertTrue(rc);

			//Type Delivery Medium Type 
			rc = sendKeys(strPostalCodeInput, strPostalCodeValue, "Postal Code", true);
			Assert.assertTrue(rc);

			//Click Enter
			TimeUnit.SECONDS.sleep(2);
			driver.findElement(By.xpath(strPostalCodeInput)).sendKeys(Keys.ENTER);
			 */
			rc = udsSelectLM_Dropdown(strPostalCodeSelectBox, "Postal Code", strPostalCodeValue);
			Assert.assertTrue(rc);

			//Enter Shift Timings - From -id="subId-from-0"
			String strShiftTimingsFromTextbox = "//*[@id='subId-from-0']";
			String strShiftTimingsToTextbox = "//*[@id='subId-to-0']";

			String strShiftTimingsFromValue = "09:00";
			String strShiftTimingsToValue = "18:00";

			rc = sendKeys(strShiftTimingsFromTextbox, strShiftTimingsFromValue, "Shift From", true);
			Assert.assertTrue(rc);

			rc = sendKeys(strShiftTimingsToTextbox, strShiftTimingsToValue, "Shift To", true);
			Assert.assertTrue(rc);

			//Enter Week Off Day - id="id-weekly-off-day"
			String strWeekOffDaySelectBox = "//*[@id='id-weekly-off-day']";
			String strWeekOffDayTextBox = "//*[@id='id-weekly-off-day']//input";
			String strWeekOffDays = "Saturday,Sunday";

			//Loop through and enter all week off days
			String strWeekOffDaysArr [] = strWeekOffDays.split(",");
			for (int i = 0; i < strWeekOffDaysArr.length; i++) {
				String strCurrentWeekOffDay = strWeekOffDaysArr[i];

				//Click on Select Button
				/*clickElementByXPath(strWeekOffDaySelectBox, "Week Off Day");
				Assert.assertTrue(rc);

				//Type Delivery Medium Type 
				rc = sendKeys(strWeekOffDayTextBox, strCurrentWeekOffDay, "Week Off Day", true);
				Assert.assertTrue(rc);

				//Click Enter
				TimeUnit.SECONDS.sleep(2);
				driver.findElement(By.xpath(strWeekOffDayTextBox)).sendKeys(Keys.ENTER);
				 */
				rc = udsSelectLM_Dropdown(strWeekOffDaySelectBox, "Week Off Day", strCurrentWeekOffDay);
				Assert.assertTrue(rc);

			}

			//Enter Distance Allowed - id="id-distance-allowed"
			String strDistanceAllowedTextbpx = "//*[@id='id-distance-allowed']";
			String strDistanceAllowedValue = "10";
			rc = sendKeys(strDistanceAllowedTextbpx, strDistanceAllowedValue, "Distance Allowed Texrbox", true);
			Assert.assertTrue(rc);

			//Enter Licence Validity - id="licenseValidity"
			String strLicenseValidityPath = "//*[@id='licenseValidity']";
			String strLicenseValidityExpiryDate = "16/02/2035";
			rc = sendKeys(strLicenseValidityPath, strLicenseValidityExpiryDate, "License Validity Expiry Date", true);
			Assert.assertTrue(rc);

			//Enter Variable Cost - id="id-variable-cost"
			String strVariableCostXPath = "//*[@id='id-variable-cost']";
			String strDeliveryBoyVariableCost = "100";
			rc = sendKeys(strVariableCostXPath, strDeliveryBoyVariableCost, "Variable Cost Textbox", true);
			Assert.assertTrue(rc);

			//Enter Fixed Cost - id="id-fixed-cost"
			String strFixedCostXPath = "//*[@id='id-fixed-cost']";
			String strDeliveryBoyFixedCost = "200";
			rc = sendKeys(strFixedCostXPath, strDeliveryBoyFixedCost, "Fixed Cost Textbox", true);
			Assert.assertTrue(rc);

			//Click Save Button - id="saveText"
			String strSaveButton = "//*[@id='saveText']";
			rc = clickElementByXPath(strSaveButton, "Save Button");
			Assert.assertTrue(rc);

			//Wait for Success Message - Delivery Boy Created Successfully
			String strPromptXPath = "//*[@id='js-prompt']//*[.='Delivery Boy created successfully']";//String strPromptXPath = "//*[@id='js-prompt']";
			String strPromptValue = "";

			//Get Text from Prompt
			int totalElements = 0;
			int iCtr = 0;
			do {
				totalElements = driver.findElements(By.xpath(strPromptXPath)).size();
				System.out.println("Pronpt appeared - totalElements : "+totalElements);
				if (totalElements > 0){
					strPromptValue = "Delivery Boy created successfully";//driver.findElement(By.xpath(strPromptXPath)).getText();
					break;
				}
				if (iCtr > 30){
					strPromptValue = null;
					break;
				}
				iCtr ++; TimeUnit.SECONDS.sleep(1);
			} while (totalElements > 0);

			if (strPromptValue != null && totalElements > 0)
			{
				logMessage("Verify Success Message", "Success Message - delivery boy created successfully should display", "Message : "+strPromptValue+" is displayed", "Passed");
			}
			else
			{
				logMessage("Verify Success Message", "Success Message - delivery boy created successfully should display", "Message : "+strPromptValue+" is displayed, Unable to create an order", "Failed");
				return false;
			}

			//Search Delivery Boy
			String strDeliveryBoyID = searchDeliveryBoy(strUserName);
			System.out.println("strDeliveryBoyID: "+strDeliveryBoyID);
			Assert.assertNotEquals(strDeliveryBoyID, null);

			//Click Check box - Delete Delivery Boy
			String strDeliveryBoyCheckbox = "//input[@id='"+strDeliveryBoyID+"']";
			String strDeliveryBoyLabelCheckbox = "//label[@for='"+strDeliveryBoyID+"']";
			rc = clickCheckboxByXPath(strDeliveryBoyCheckbox, strDeliveryBoyLabelCheckbox, "Delivery Boy Checkbox", true);
			Assert.assertTrue(rc);


			//Update Delivery Boy Page

			//Bulk Update

			//Inline Update

			//Mark as present 

			//Mark as absent 

			//Mark as Active 

			//Mark as Inactive

			//Map view 

			//Download Excel Template 

			//Upload Delivery Boy


			return rc;
		}
		catch (Exception e)
		{
			e.printStackTrace();
			logMessage("Verify addition of a delivery boy", "Delivery boy should be added", "Unable to add delivery boy", "Failed");
			return false;
		}		
	}

	/**
	 * Will return User ID which is unique for the user - id can help us identifying the entire recordset
	 * @param strDeliveryMediumMasterName - name for the delivery boy
	 * @return
	 */
	public String searchDeliveryBoy (String strDeliveryMediumMasterName){
		try 
		{

			//Navigate to Resources > Delivery Boy
			LinkedHashMap<String, String> row = getTempData();
			rc = navigateToDeliveryBoyPage(row);

//
			//Get The Page Structure API for Delivery Medium - https://testing.loginextsolutions.com/LoginApp/framework/structure?modelName=DELIVERYMEDIUM&pageName=DELIVERYMEDIUM&sectionName=DELIVERY_MEDIUM_LIST_VIEW - {"columns":{"deliveryMediumMasterName":{"label":"Name","fieldName":"input","fieldType":"text","permission":true,"id":"deliveryMediumMasterName","required":true,"childLength":0,"rowSpan":2,"colSpan":0,"childNodes":{},"validation":{"minlength":{"args":"3","message":"Minimum 3 characters required."},"required":{"message":"Full Name is required"},"maxlength":{"args":"50","message":"Full Name must be maximum 50 characters long."}},"labelKey":"deliveryMediumMasterName","allowed":false,"searchable":true,"editable":true,"sortable":true,"infoFlag":false},"phoneNumber":{"label":"Phone Number","fieldName":"input","fieldType":"text","permission":true,"id":"phoneNumber","required":true,"childLength":0,"rowSpan":2,"colSpan":0,"childNodes":{},"validation":{"required":{"message":"Mobile Number is Required"},"phonenumber":{"args":"","message":"INVALID Mobile Number"},"maxlength":{"args":"18","message":"Mobile Number must be maximum 18 characters long."}},"labelKey":"phoneNumber","allowed":false,"searchable":true,"editable":true,"sortable":true,"infoFlag":false},"branchName":{"label":"Kendra","fieldName":"input","fieldType":"select","permission":true,"id":"branchName","required":false,"childLength":0,"rowSpan":2,"colSpan":0,"childNodes":{},"validation":{},"labelKey":"branchName","allowed":false,"searchable":true,"editable":true,"sortable":true,"infoFlag":false},"capacity":{"label":"Capacity","permission":true,"id":"capacity","required":false,"childLength":3,"rowSpan":1,"colSpan":0,"childNodes":{"capacityInWeight":{"label":"(in Kg)","fieldName":"input","fieldType":"text","permission":true,"id":"capacityInWeight","required":false,"childLength":0,"rowSpan":0,"colSpan":0,"childNodes":{},"validation":{"numeric":{"args":"","message":"Please enter a valid Capacity."},"minlength":{"args":"0","message":"Please enter a valid Capacity."},"max":{"args":"999999999","message":"Capacity (Weight) value must be less than equal to 999999999."}},"labelKey":"capacityInWeight","allowed":false,"searchable":true,"editable":true,"sortable":true,"infoFlag":false},"capacityInUnits":{"label":"(in Units)","fieldName":"input","fieldType":"text","permission":true,"id":"capacityInUnits","required":true,"childLength":0,"rowSpan":0,"colSpan":0,"childNodes":{},"validation":{"numeric":{"args":"","message":"Please enter a valid Capacity."},"required":{"message":"Units is Required"},"minlength":{"args":"0","message":"Please enter a valid Capacity."},"min":{"args":"0","message":"Please enter a valid Capacity."},"max":{"args":"999999999","message":"Capacity (Units) value must be less than equal to 999999999."}},"labelKey":"capacityInUnits","allowed":false,"searchable":true,"editable":true,"sortable":true,"infoFlag":false},"capacityInVolume":{"label":"(in Cc)","fieldName":"input","fieldType":"text","permission":true,"id":"capacityInVolume","required":false,"childLength":0,"rowSpan":0,"colSpan":0,"childNodes":{},"validation":{"numeric":{"args":"","message":"Please enter a valid Capacity."},"minlength":{"args":"0","message":"Please enter a valid Capacity."},"max":{"args":"999999999","message":"Capacity (Volume) value must be less than equal to 999999999."}},"labelKey":"capacityInVolume","allowed":false,"searchable":true,"editable":true,"sortable":true,"infoFlag":false}},"validation":{},"labelKey":"capacity","allowed":false,"searchable":false,"editable":true,"sortable":false,"infoFlag":false},"deliveryMediumMasterTypeCd":{"label":"Type","fieldName":"input","fieldType":"dropdown","permission":true,"id":"deliveryMediumMasterTypeCd","required":false,"childLength":0,"rowSpan":2,"colSpan":0,"childNodes":{},"validation":{},"labelKey":"deliveryMediumMasterTypeCd","allowed":false,"searchable":false,"editable":true,"sortable":true,"infoFlag":false},"userName":{"label":"User Name","fieldName":"input","fieldType":"text","permission":true,"id":"userName","required":true,"childLength":0,"rowSpan":2,"colSpan":0,"childNodes":{},"validation":{"minlength":{"args":"3","message":"Minimum 3 characters required."},"required":{"message":"Username is required."},"maxlength":{"args":"25","message":"Username must be maximum 25 characters long."}},"labelKey":"User Name","allowed":false,"searchable":true,"editable":false,"sortable":true,"infoFlag":false},"statusCd":{"label":"Status","fieldName":"input","fieldType":"dropdown","permission":true,"id":"statusCd","required":false,"childLength":0,"rowSpan":2,"colSpan":0,"childNodes":{},"validation":{},"labelKey":"statusCd","infoTool":[{"key":"deliverymedium_statusCd_infotip","message":"Possible Delivery Resource statuses - Available, Intransit, Inactive."}],"allowed":false,"searchable":true,"editable":false,"sortable":true,"infoFlag":true},"deviceStatus":{"label":"Device Status","fieldName":"input","fieldType":"text","permission":true,"id":"deviceStatus","required":false,"childLength":0,"rowSpan":2,"colSpan":0,"childNodes":{},"validation":{},"labelKey":"deviceStatus","allowed":false,"searchable":false,"editable":false,"sortable":true,"infoFlag":false},"tripName":{"label":"Running Trip","fieldName":"input","fieldType":"text","permission":true,"id":"tripName","required":false,"childLength":0,"rowSpan":2,"colSpan":0,"childNodes":{},"validation":{},"labelKey":"Running Trip","allowed":false,"searchable":true,"editable":false,"sortable":true,"infoFlag":false},"trackingDate":{"label":"Last Tracking","fieldName":"input","fieldType":"calendar","permission":true,"id":"trackingDate","required":false,"childLength":0,"rowSpan":2,"colSpan":0,"childNodes":{},"validation":{},"labelKey":"trackingDate","allowed":false,"searchable":true,"editable":false,"sortable":true,"infoFlag":false},"isAttandanceFl":{"label":"Attendance","fieldName":"input","fieldType":"checkbox","permission":true,"id":"isAttandanceFl","required":false,"childLength":0,"rowSpan":2,"colSpan":0,"childNodes":{},"validation":{},"labelKey":"isAttandanceFl","allowed":false,"searchable":false,"editable":false,"sortable":true,"infoFlag":false},"isActiveFl":{"label":"Active / Inactive","fieldName":"input","fieldType":"checkbox","permission":true,"id":"isActiveFl","required":false,"childLength":0,"rowSpan":2,"colSpan":0,"childNodes":{},"validation":{},"labelKey":"isActiveFl","allowed":false,"searchable":false,"editable":false,"sortable":true,"infoFlag":false},"isOnBreakFl":{"label":"On-Break","fieldName":"input","fieldType":"text","permission":false,"id":"isOnBreakFl","required":false,"childLength":0,"rowSpan":2,"colSpan":0,"childNodes":{},"validation":{},"labelKey":"On-Break","allowed":false,"searchable":false,"editable":true,"sortable":true,"infoFlag":false}},"buttons":{"delete":{"label":"Delete","fieldName":"button","fieldType":"button","permission":true,"id":"delete","required":false,"childLength":0,"rowSpan":0,"colSpan":0,"labelKey":"Delete","allowed":false,"searchable":true,"editable":false,"sortable":true,"infoFlag":false},"duplicate":{"label":"Duplicate","fieldName":"button","fieldType":"button","permission":false,"id":"duplicate","required":false,"childLength":0,"rowSpan":0,"colSpan":0,"labelKey":"Duplicate","allowed":false,"searchable":true,"editable":false,"sortable":true,"infoFlag":false},"update":{"label":"Update","fieldName":"button","fieldType":"button","permission":true,"id":"update","required":false,"childLength":0,"rowSpan":0,"colSpan":0,"labelKey":"Update","allowed":false,"searchable":true,"editable":false,"sortable":true,"infoFlag":false},"save":{"label":"Save","fieldName":"button","fieldType":"button","permission":false,"id":"save","required":false,"childLength":0,"rowSpan":0,"colSpan":0,"labelKey":"Save","allowed":false,"searchable":true,"editable":false,"sortable":true,"infoFlag":false},"cancel":{"label":"Cancel","fieldName":"button","fieldType":"button","permission":false,"id":"cancel","required":false,"childLength":0,"rowSpan":0,"colSpan":0,"labelKey":"Cancel","allowed":false,"searchable":true,"editable":false,"sortable":true,"infoFlag":false},"changePwd":{"label":"Change Password","fieldName":"button","fieldType":"button","permission":true,"required":false,"childLength":0,"rowSpan":0,"colSpan":0,"labelKey":"Change Password","allowed":false,"searchable":true,"editable":false,"sortable":true,"infoFlag":false},"bulkUpdate":{"label":"Bulk Update","fieldName":"button","fieldType":"button","permission":true,"id":"bulkUpdate","required":false,"childLength":0,"rowSpan":0,"colSpan":0,"labelKey":"bulkUpdate","allowed":false,"searchable":true,"editable":false,"sortable":true,"infoFlag":false},"notify":{"label":"Notify","fieldName":"button","fieldType":"button","permission":true,"id":"notify","required":false,"childLength":0,"rowSpan":2,"colSpan":0,"validation":{},"labelKey":"notify","allowed":false,"searchable":false,"editable":false,"sortable":false,"infoFlag":false},"more":{"label":"More","fieldName":"button","fieldType":"button","permission":true,"id":"more","required":false,"childLength":0,"rowSpan":0,"colSpan":0,"dropdownValues":{"absent":"Mark as Absent","present":"Mark as Present","active":"Mark as Active","inActive":"Mark as Inactive"},"labelKey":"More","allowed":false,"searchable":true,"editable":false,"sortable":true,"infoFlag":false},"advancedSearch":{"label":"advancedSearch","fieldName":"button","fieldType":"button","permission":true,"id":"advancedSearch","required":false,"childLength":0,"rowSpan":2,"colSpan":0,"labelKey":"advancedSearch","allowed":false,"searchable":false,"editable":false,"sortable":false,"infoFlag":false}}}
			JsonObject pageStructureDeliveryMedium = getStructureAPI("DELIVERYMEDIUM", "DELIVERYMEDIUM", "DELIVERY_MEDIUM_LIST_VIEW");
			String strDeliveryMediumMasterNameLabel = (pageStructureDeliveryMedium.getAsJsonObject().has("columns") && pageStructureDeliveryMedium.getAsJsonObject().get("columns").getAsJsonObject().has("deliveryMediumMasterName")) ? pageStructureDeliveryMedium.getAsJsonObject().get("columns").getAsJsonObject().get("deliveryMediumMasterName").getAsJsonObject().get("label").getAsString() : null;
			if (strDeliveryMediumMasterNameLabel == null)
			{
				logMessage("Get Column Name from Structure API", "Should be able to fetch column name from structire API", "Unable to fetch column name deliveryMediumMasterName from Structure API", "Failed");
				return null;
			}

			//Waiting implicitly for user textbox
			TimeUnit.SECONDS.sleep(3);

			//Search for Passed in User Name - //*[contains (@title, 'User Name')]//ancestor::div[@role='columnheader']//input
			String strUserNameSearchBox = "//*[contains (@title, '"+strDeliveryMediumMasterNameLabel+"')]//ancestor::div[@role='columnheader']//input";
			rc = sendKeys(strUserNameSearchBox, strDeliveryMediumMasterName +  Keys.ENTER, "Delivery Medium Master Name Search textbox", true);
			Assert.assertTrue(rc);

			TimeUnit.SECONDS.sleep(7);//
			
			//Count Results in List View Should be equal to one - Full Name - id="deliveryMediumMasterId-deliveryMediumMasterName" 
			rc = waitForDeliveryBoyResults(1);
			Assert.assertTrue(rc);

			//Get the User Name / deliveryMedium ID's > span's - ID - deliveryMediumMasterId-deliveryMediumMasterName - which will be ID for the whole row
			String strDeliveryBoyIDXPath = "//*[@id='deliveryMediumMasterId-deliveryMediumMasterName']//*[@title='"+strDeliveryMediumMasterName+"']";
			String strDeliveryBoyID = getAttributeByXPath(strDeliveryBoyIDXPath, "Delivery Boy user name", "id");
			if (strDeliveryBoyID == null || strDeliveryBoyID.equals("")){
				logMessage("Verify delivery boy search", "Should be able to search for Delivery Boy", "Unable to search for delivery boy User Name - "+strDeliveryMediumMasterName, "Failed");
				return null;
			}
			logMessage("Verify delivery boy search", "Should be able to search for Delivery Boy", "Successfully searched for delivery boy User Name - "+strDeliveryMediumMasterName, "Passed");

			//Return back the id to parent funtion - Search End
			System.out.println("strDeliveryBoyID : "+strDeliveryBoyID);
			return strDeliveryBoyID;

		} catch (Exception e) {
			logMessage("Verify delivery boy search", "Should be able to search for Delivery Boy", "Unable to search for delivery boy User Name - "+strDeliveryMediumMasterName, "Failed");
			e.printStackTrace();
			return null;
		}
	}


	public List <String> getDeliveryBoyResults (){
		try 
		{
			String strDeliveryBoyListViewDetailsXPath = "//*[@id='deliveryMediumMasterId-userName']"; // deliveryMediumMasterId-userName//"//*[@id='deliveryMediumMasterId-deliveryMediumMasterName']";
			List <WebElement> allDeliveryBoys = driver.findElements(By.xpath(strDeliveryBoyListViewDetailsXPath));
			List <String> strDeliveryBoyNames = new ArrayList<>(); 

			for (int i = 0; i < allDeliveryBoys.size(); i++) 
			{
				String strCurrentDeliveryBoy = allDeliveryBoys.get(i).getText();
				strDeliveryBoyNames.add(strCurrentDeliveryBoy);
			}

			return strDeliveryBoyNames;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	public boolean waitForDeliveryBoyResults (int iExpectedRows)
	{
		try {
			List <String> allDeliveryBoys = getDeliveryBoyResults();
			int iCtr = 0;
			rc = false;
			do 
			{
				allDeliveryBoys = getDeliveryBoyResults();
				if (allDeliveryBoys.size() == iExpectedRows){
					rc = true;
				}
				if (iCtr > 30)
				{
					System.out.println("Unable to get expected conditions..");
					rc = false;
					break;
				}
				iCtr++;
				System.out.println(" Expecting : "+iExpectedRows+ " Actual : "+allDeliveryBoys.size());
			} while (allDeliveryBoys.size() != iExpectedRows);
			if (rc == false){
				logMessage("Fetch Delivery Boy Results", "Shold be able to fetch delivery boy results","Unable to fetch delivery boy results",  "Failed");
				return false;
			}
			return rc;
		} catch (Exception e) 
		{
			e.printStackTrace();
			return false;
		}
	}

	public boolean searchOrder (LinkedHashMap <String , String> row)
	{
		try {

			if (isApplicationLaunched == false)
			{

				rc = launchApplication (row);
				Assert.assertTrue(rc);

				rc = login (row);
				Assert.assertTrue(rc);

				//Get login API auth key and client secret
				row = getAuthDetailsWeb (row);
				if (row == null)
				{
					return false;
				}

				updateTempData(row);

				//Get all labels associated with application
				rc = initApp_PageLabels(row);
				Assert.assertTrue(rc);

				rc = initApp_MenuItems(row);
				Assert.assertTrue(rc);

				//Wait for Dashboard to load
				String strDashBoard = "//*[@id='dashboard_cm']";
				waitForELement(strDashBoard);
			}

			//Get all labels associated with application
			rc = initApp_PageLabels(row);
			Assert.assertTrue(rc);

			rc = initApp_MenuItems(row);
			Assert.assertTrue(rc);

			/*** Page Elements ***/
			String strOrderLabel = getMenuName("order");//Orders also reffered to as Tasks
			String strOrderMenu = "//*[text()="+strOrderLabel+"]";
			String strAllOrdersMenuItem = "//*[@logi-google-analytics='order']";

			//Click Order
			rc = clickElementByXPath(strOrderMenu, "Order");
			Assert.assertTrue(rc);

			//Click All Orders
			rc = clickElementByJavascript(driver, strAllOrdersMenuItem, "All Orders");//clickElementByXPath(strAllOrdersMenuItem, "All Orders");
			Assert.assertTrue(rc);

			rc = getApplicationProperties(row);
			Assert.assertTrue(rc);

			TimeUnit.SECONDS.sleep(5);//
			
			//Set Page size 
			rc = setOrderPageSize();//
			Assert.assertTrue(rc);

			TimeUnit.SECONDS.sleep(5);//
			String strCurrentOrderNumber = row.containsKey("OrderNumber") ? row.get("OrderNumber") : "";
			System.out.println("Order Number from tempData : "+strCurrentOrderNumber);

			//If strCurrentOrderNumber is not set - get the first order number from the list view to searchw with
			if (strCurrentOrderNumber == null 
					|| strCurrentOrderNumber.equals("")
					|| strCurrentOrderNumber.equals("null"))
			{
				//Search a sample test order from list view and update back in testdata
				System.out.println("Searching a sample order from listview...");

				//Fetch first from current page -  //
				List <WebElement> elemOrders = udsGetOrderList (driver);
				System.out.println("elemOrders: "+elemOrders);
				int iCtr = 0;
				do 
				{

					//On every 5 Iterations when Order is not found on page - refresh the page once
					if (iCtr % 5 == 0)
					{
						driver.navigate().refresh();
					}

					elemOrders = udsGetOrderList (driver);
					System.out.println(iCtr+" Orders found on page "+elemOrders);					
					iCtr++;
					TimeUnit.SECONDS.sleep(5);//
				} while (elemOrders.size() <= 0 && iCtr < 30);

				strCurrentOrderNumber = elemOrders.get(0).getText();
				row.put("OrderNumber", strCurrentOrderNumber);
				updateTempData(row);
			}
			TimeUnit.SECONDS.sleep(5);
			
			//Search with - strCurrentOrderNumber ///
			rc = udsSearchByOrderNumber(strCurrentOrderNumber);
			Assert.assertTrue(rc);//

			//Wait for only single order to appear 
			rc = udsWaitForOrdersInListView (5);
			Assert.assertTrue(rc);

			//Verify whether the searched order is equal to order number displayed 
			List<WebElement> currentOrders = udsGetOrderList(driver);
			String strOrderSearchResult = currentOrders.get(0).getText();
			if (strOrderSearchResult != null && strOrderSearchResult.equals(strCurrentOrderNumber))
			{
				//passed
				logMessage("Verify Order search", "Order Search should match with results appeared", "Successfully fetched results : Expected Order : "+strCurrentOrderNumber+" Actual Order : "+strOrderSearchResult, "Passed");
			}
			else
			{
				//failed
				logMessage("Verify Order search", "Order Search should match with results appeared", "Mismatch in results : Expected Order : "+strCurrentOrderNumber+" Actual Order : "+strOrderSearchResult, "Failed");
				return false;
			}

			return true;
		} catch (Exception e) {
			logMessage("Search Order", "Should be able to search for an order", "Unable to search order : "+e.getMessage(), "Failed");
			e.printStackTrace();
			return false;
		}
	}



	//Inline Update - Precondition - Create a new Order in order 
	public boolean orderUpdateInline (LinkedHashMap <String , String> row)
	{
		try {

			//Create a new order to update
			LinkedHashMap<String, String> pageDataMap = addOrderTest(row);
			System.out.println("pageDataMap: "+pageDataMap);

			/*** Page Elements ***/
			String strOrderLabel = getMenuName("order");//Orders also reffered to as Tasks
			String strOrderMenu = "//*[text()="+strOrderLabel+"]";
			String strAllOrdersMenuItem = "//*[@logi-google-analytics='order']";
			//String strAddButton = "//*[contains (@logi-google-analytics, 'Orders - Add')]";// "//*[contains (@class,'icon-add')]"; // "//*[@class='logi-icon icon-Product-Icons_Add']";// "//*[contains (@class,'icon-add')]";

			//String strOrderMenu = "//*[text()='Order']";
			//String strAllOrdersMenuItem = "//*[text()='All Orders']";

			rc = initApp_MenuItems(row);
			Assert.assertTrue(rc);

			/*** Page Elements ***/
			//String strOrderLabel = getMenuName("order");//Orders also reffered to as Tasks
			strOrderMenu = "//*[text()="+strOrderLabel+"]";
			strAllOrdersMenuItem = "//*[@logi-google-analytics='order']";


			//Set Page size - After Order gets added in system and search for the order 
			rc = setOrderPageSize();
			Assert.assertTrue(rc);

			rc = searchOrder(row);//
			Assert.assertTrue(rc);

			//Reset Column Preferences 
			JsonObject ordersStructure_Json = getStructureAPI("ORDERS", "ORDERS", "ALL_ORDER_LIST_VIEW");
			/*
			//Validate Wallets columns exists on page
			rc = verifyColumnsExistsOnPage(ordersStructure_Json);
			Assert.assertTrue(rc);
			 */
			//Get the order number searched with
			row = getTempData();

			//Check checkbox present for row 0- //*[contains(@id,'-0-uiGrid')]//*[@role='checkbox']
			String strOrderCheckbox = "//*[contains(@id,'-0-uiGrid')]//*[@role='checkbox']";
			rc = clickElementByXPath(strOrderCheckbox, "Order Checkbox");
			Assert.assertTrue(rc);

			//Try inline Update for this order - //*[@id="update-record"]
			String strUpdateButtonInlineXPath = "//*[@id='update-record']"; 
			rc = clickElementByXPath(strUpdateButtonInlineXPath, "Update Button");
			Assert.assertTrue(rc);



			//Update - Mar 11- cpandit Get the date format from application properties

			//Get login API auth key and client secret
			row = getAuthDetailsWeb (row);
			if (row == null)
			{
				return false;
			}

			//Get client properties w.r.t Date Format / Currentcy Format, etc
			rc = getApplicationProperties(row);
			Assert.assertTrue(rc);
			row = getTempData();//

			String strDateFormat = row.get("DATEFORMAT");
			String strTimeFormat = "HH:mm"; //24 Hour format
			String strDateFormatString = strDateFormat +" "+strTimeFormat;// "dd/MM/yyyy HH:mm";
			SimpleDateFormat sdf = new SimpleDateFormat(strDateFormatString);
			//SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");

			//Update Start Time Window - //*[contains (@onload,'startTimeWindow')]//input (Reduce one day)
			String strStartTimeWindowTextBoxXPath = "//*[contains (@onload,'startTimeWindow')]//input";
			String strStartTimeWindow = getAttributeByXPath(strStartTimeWindowTextBoxXPath, "Start Time Window Textbox", "value");
			System.out.println("strStartTimeWindow : "+strStartTimeWindow);

			//Reduce start time by one day
			Date dStartDateNew = sdf.parse(strStartTimeWindow);
			Calendar cStartDate = Calendar.getInstance();
			cStartDate.setTime(dStartDateNew);
			cStartDate.add(Calendar.HOUR, -1);
			//cStartDate.add(Calendar.DAY_OF_WEEK, +1);
			rc = setValueByJavascript(driver, strStartTimeWindowTextBoxXPath, "Start Time Window", "");
			rc = sendKeys(strStartTimeWindowTextBoxXPath, sdf.format(cStartDate.getTime()), "Start Time Window", true);
			Assert.assertTrue(rc);

			//Update End Time Window - //*[contains (@onload,'endTimeWindow')]//input (Reduce one day)
			String strEndTimeWindowTextBoxXPath = "//*[contains (@onload,'endTimeWindow')]//input";
			String strEndTimeWindow = getAttributeByXPath(strEndTimeWindowTextBoxXPath, "End Time Window Textbox", "value");
			System.out.println("strEndTimeWindow : "+strEndTimeWindow);

			//Reduce the existing date by one day end update back in the textbox
			Date dEndDateNew = sdf.parse(strEndTimeWindow);
			Calendar cEndDate = Calendar.getInstance();
			cEndDate.setTime(dEndDateNew);
			cEndDate.add(Calendar.HOUR, -1);
			//cEndDate.add(Calendar.DAY_OF_WEEK, +1);
			rc = setValueByJavascript(driver, strEndTimeWindowTextBoxXPath, "End Time Window", "");//sendKeys(strEndTimeWindowTextBoxXPath, "", "End Time Window", true);
			rc = sendKeys(strEndTimeWindowTextBoxXPath, sdf.format(cEndDate.getTime()), "End Time Window", true);
			Assert.assertTrue(rc);

			//Click Save Record - id="save-record" button
			String strSaveRecordXPath = "//*[@id='save-record']";
			rc = clickElementByXPath(strSaveRecordXPath, "Save Button");
			Assert.assertTrue(rc);

			//Wait for popup to dissappear
			TimeUnit.SECONDS.sleep(5);

			String strPromptXPath = "//*[@id='js-prompt']";
			String strExpectedPromptValue = getLabel_PageLabelAPI(row, "update.order.success");
			System.out.println("strExpectedPromptValue: "+strExpectedPromptValue);
			rc = waitForJS_PromptMessageJS(strExpectedPromptValue, "Order Updated Success Message");
			if (rc)
			{
				logMessage("Verify Success Message", "Success Message - "+strExpectedPromptValue+" Successfully should display", "Message : "+strExpectedPromptValue+" is displayed", "Passed");
			}
			else
			{
				String strPromptValue = getPromptElementTextByXPath(strPromptXPath, "Prompt");
				logMessage("Verify Success Message", "Success Message - "+strExpectedPromptValue+" should display", "Success Message is not displayed, Expecting Message : "+strExpectedPromptValue+" Actual : "+strPromptValue, "Failed");
				return false;
			}

			//Search order again
			navigateToOrdersPage(row);
			/*
			//Click Order
			rc = clickElementByXPath(strOrderMenu, "Order");
			Assert.assertTrue(rc);

			//Click All Orders // 
			rc = clickElementByXPath(strAllOrdersMenuItem, "All Orders");
			Assert.assertTrue(rc);
			 */
			//Set Page size 
			rc = setOrderPageSize();
			Assert.assertTrue(rc);

			//Fetch Order from earlier function-  
			String strCurrentOrderNumber = row.get("OrderNumber");

			//Search with - strCurrentOrderNumber 
			rc = udsSearchByOrderNumber(strCurrentOrderNumber);
			Assert.assertTrue(rc);

			//Wait for only single order to appear //
			rc = udsWaitForOrdersInListView (1);
			Assert.assertTrue(rc);
			//
			//Verify whether the searched order is equal to order number displayed 
			List<WebElement> currentOrders = udsGetOrderList(driver);
			String strOrderSearchResult = currentOrders.get(0).getText();
			if (strOrderSearchResult != null && strOrderSearchResult.equals(strCurrentOrderNumber))
			{
				//passed
				logMessage("Verify Order search", "Order Search should match with results appeared", "Successfully fetched results : Expected Order : "+strCurrentOrderNumber+" Actual Order : "+strOrderSearchResult, "Passed");
			}
			else
			{
				//failed
				logMessage("Verify Order search", "Order Search should match with results appeared", "Mismatch in results : Expected Order : "+strCurrentOrderNumber+" Actual Order : "+strOrderSearchResult, "Failed");
				return false;
			}

			//Check checkbox present for row 0- //*[contains(@id,'-0-uiGrid')]//*[@role='checkbox']
			rc = clickElementByXPath(strOrderCheckbox, "Order Checkbox");
			Assert.assertTrue(rc);

			//Try clicking inline Update for this order - //*[@id="update-record"]
			rc = clickElementByXPath(strUpdateButtonInlineXPath, "Update Button");
			Assert.assertTrue(rc);

			//Get Start Time Window - //*[contains (@onload,'startTimeWindow')]//input (Reduce one day)
			String strStartTimeWindowUpdated = getAttributeByXPath(strStartTimeWindowTextBoxXPath, "Start Time Window Textbox", "value");
			System.out.println("strStartTimeWindow : "+strStartTimeWindowUpdated);

			if (strStartTimeWindowUpdated != null 
					&& strStartTimeWindowUpdated.equalsIgnoreCase(sdf.format(cStartDate.getTime())))
			{
				logMessage("Verify Start Dates are updated inline", "Dates should get updated inline", "Expected Updated date : "+sdf.format(cStartDate.getTime())+" Actual Updated Date : "+strStartTimeWindowUpdated, "Passed");
			}
			else
			{
				logMessage("Verify Start Dates are updated inline", "Dates should get updated inline", "Expected Updated date : "+sdf.format(cStartDate.getTime())+" Actual Updated Date : "+strStartTimeWindowUpdated, "Failed");	
			}
			//Get End Time Window - //*[contains (@onload,'endTimeWindow')]//input (Reduce one day)
			String strEndTimeWindowUpdated = getAttributeByXPath(strEndTimeWindowTextBoxXPath, "End Time Window Textbox", "value");
			System.out.println("strEndTimeWindow : "+strEndTimeWindowUpdated);
			if (strEndTimeWindowUpdated != null 
					&& strEndTimeWindowUpdated.equalsIgnoreCase(sdf.format(cEndDate.getTime())))
			{
				logMessage("Verify End Dates are updated inline", "Dates should get updated inline", "Expected Updated date : "+sdf.format(cEndDate.getTime())+" Actual Updated Date : "+strEndTimeWindowUpdated, "Passed");
			}
			else
			{
				logMessage("Verify End Dates are updated inline", "Dates should get updated inline", "Expected Updated date : "+sdf.format(cEndDate.getTime())+" Actual Updated Date : "+strEndTimeWindowUpdated, "Failed");	
			}


			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}


	public boolean orderUpdateBulk (LinkedHashMap <String , String> row)
	{
		try {

			//Create a new order for bulk update
			LinkedHashMap<String, String> pageDataMap = addOrderTest(row);
			//Assert.assertTrue(rc);
			if (pageDataMap == null){
				return false;
			}

			//
			//Set Page size - After Order gets added in system and search for the order 
			rc = setOrderPageSize();//
			Assert.assertTrue(rc);

			//Get the order number searched with
			/**
			 * 
			 * OrderNumber - Ord115070017
				OrderDate
				OrderStartDate - 24/02/2018 17:37
				OrderEndDate - 24/02/2018 18:38

			row.put("OrderNumber", "Ord115070017");
			row.put("OrderStartDate", "24/02/2018 17:37");
			row.put("OrderEndDate", "24/02/2018 18:38");
			 */

			row = getTempData();

			rc = initApp_MenuItems(row);
			Assert.assertTrue(rc);

			/*** Page Elements ***/
			String strOrderLabel = getMenuName("order");//Orders also reffered to as Tasks
			String strOrderMenu = "//*[text()="+strOrderLabel+"]";
			String strAllOrdersMenuItem = "//*[@logi-google-analytics='order']";

			TimeUnit.SECONDS.sleep(5);
			
			rc = searchOrder(row);//
			Assert.assertTrue(rc);

			//Check checkbox present for row 0- //*[contains(@id,'-0-uiGrid')]//*[@role='checkbox']
			String strOrderCheckbox = "//*[contains(@id,'-0-uiGrid')]//*[@role='checkbox']";
			rc = clickElementByXPath(strOrderCheckbox, "Order Checkbox");
			Assert.assertTrue(rc);

			//Try inline Update for this order - //*[@id="update-record"]
			String strUpdateButtonInlineXPath = "//*[@id='bulkUpdate-record']"; 
			rc = clickElementByXPath(strUpdateButtonInlineXPath, "Bulk Update Button");
			Assert.assertTrue(rc);

			//Update - Mar 11- cpandit Get the date format from application properties

			//Get login API auth key and client secret
			row = getAuthDetailsWeb (row);
			Assert.assertNotNull(row);

			//Get client properties w.r.t Date Format / Currentcy Format, etc
			rc = getApplicationProperties(row);
			Assert.assertTrue(rc);
			row = getTempData();//

			String strDateFormat = row.get("DATEFORMAT");
			String strTimeFormat = "HH:mm"; //24 Hour format
			String strDateFormatString = strDateFormat +" "+strTimeFormat;// "dd/MM/yyyy HH:mm";
			SimpleDateFormat sdf = new SimpleDateFormat(strDateFormatString);

			//Update Start Time Window - //*[contains (@onload,'startTimeWindow')]//input (Reduce one day)
			String strStartTimeWindowTextBoxXPath = "//*[@id='js-startTime']";
			String strStartTimeWindow = row.get("OrderStartDate");// getAttributeByXPath(strStartTimeWindowTextBoxXPath, "Start Time Window Textbox", "value");
			System.out.println("strStartTimeWindow : "+strStartTimeWindow);

			//Reduce start time by one day
			Date dStartDateNew = sdf.parse(strStartTimeWindow);
			Calendar cStartDate = Calendar.getInstance();
			cStartDate.setTime(dStartDateNew);
			//cStartDate.add(Calendar.DAY_OF_WEEK, -1);
			cStartDate.add(Calendar.HOUR, -1);
			rc = setValueByJavascript(driver, strStartTimeWindowTextBoxXPath, "Start Time Window on bulk update Prompt", "");
			rc = sendKeys(strStartTimeWindowTextBoxXPath, sdf.format(cStartDate.getTime())+Keys.ENTER, "Start Time Window - on bulk update Prompt", true);
			Assert.assertTrue(rc);

			//Update End Time Window - //*[contains (@onload,'endTimeWindow')]//input (Reduce one day)
			String strEndTimeWindowTextBoxXPath = "//*[@id='js-endTime']";
			String strEndTimeWindow = row.get("OrderEndDate"); //getAttributeByXPath(strEndTimeWindowTextBoxXPath, "End Time Window Textbox", "value");
			System.out.println("strEndTimeWindow : "+strEndTimeWindow);

			//Reduce the existing date by one day end update back in the textbox
			Date dEndDateNew = sdf.parse(strEndTimeWindow);
			Calendar cEndDate = Calendar.getInstance();
			cEndDate.setTime(dEndDateNew);
			cEndDate.add(Calendar.HOUR, -1);
			//cEndDate.add(Calendar.DAY_OF_WEEK, -1);
			rc = setValueByJavascript(driver, strEndTimeWindowTextBoxXPath, "End Time Window - on bulk update Prompt", "");//sendKeys(strEndTimeWindowTextBoxXPath, "", "End Time Window", true);
			rc = sendKeys(strEndTimeWindowTextBoxXPath, sdf.format(cEndDate.getTime())+Keys.ENTER, "End Time Window - on bulk update Prompt", true);
			Assert.assertTrue(rc);

			//Select Order Status - Click More button - id="more-action" - Select orderStatus
			String strOrderStatusXPath = "//*[@id='more-action' and contains (text(), '"+getLabel_PageLabelAPI(row, "Select")+" "+getLabel_PageLabelAPI(row, "orderStatus")+"')]"; //"//*[@id='more-action' and contains (text(), 'Select Order Status')]";
			rc = clickElementByXPath(strOrderStatusXPath, "Order Status");
			Assert.assertTrue(rc);

			//Set Order Status - //*[contains(text(), 'Mark as Not Dispatched')]
			String strOrderStatus = getLabel_PageLabelAPI(row, "DELAYEDNOTDISPATCHED");//"Mark as Not Dispatched";
			strOrderStatusXPath = "//*[@class='cancellation-reasons']//li[contains(., '"+strOrderStatus+"')]";//"//*[contains(text(), '"+strOrderStatus+"')]";
			rc = clickElementByXPath(strOrderStatusXPath, "Order Status - on bulk update Prompt");
			Assert.assertTrue(rc);

			//Set Branch - //div[@on-select="setBranch()"]
			String strReturnToHubSelect = "//div[@on-select='setBranch()']";
			//String strReturnToHubBox = "//div[@id='id-return-to-hub']/input";
			String strBranchNameValue = row.get("distributionCenter");//"LMDMumbai";
			rc = udsSelectLM_Dropdown(strReturnToHubSelect, "Branch Name - on bulk update Prompt", strBranchNameValue);
			Assert.assertTrue(rc);

			//Click Save Record - id="save-record" button
			String strSaveRecordXPath = "//*[@ng-click='saveBulkUpdateData()']";
			rc = clickElementByXPath(strSaveRecordXPath, "Save Button - on bulk update Prompt");
			Assert.assertTrue(rc);

			//Wait for Sccess Message

			//Verify JS Prompt - Order Created Successfully
			String strPromptXPath = "//*[@id='js-prompt']";
			String strPromptValue = "";

			//Get Text from Prompt
			strPromptValue = getElementTextByXPath(strPromptXPath, "Prompt");
			if (strPromptValue != null && strPromptValue.toLowerCase().contains("updated successfully"))
			{
				logMessage("Verify Success Message", "Success Message - Order updated successfully should display", "Message : "+strPromptValue+" is displayed", "Passed");
			}
			else
			{
				logMessage("Verify Success Message", "Success Message - Order updated successfully should display", "Message : "+strPromptValue+" is displayed, Unable to create an order", "Failed");
				return false;
			}
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}




	//Delete Order
	public boolean orderDelete (LinkedHashMap <String , String> row)
	{
		try {


			String strOrderNumber;
			if (strLastAddedOrder== null || strLastAddedOrder.equals("")){
				System.out.println("Order Number is null..");

				//Update - Creating order using rest API
				updateTempData(row);
				rc = authenticate_ClientAPI();//
				System.out.println("rc : "+rc);
				row = getTempData();

				//add Order// - this will add into global var last added order
				JsonObject o = addOrder_ClientAPI();
				System.out.println("o "+o);//
				System.out.println("strLastAddedOrder : "+strLastAddedOrder);

				//End - Creation of order using rest API

			}
			
			if (strLastAddedOrder == null || strLastAddedOrder.equals("") || strLastAddedOrder.equals("null"))
			{
				logMessage("Verify order gets created using API", "Order should get created", "Order is not created", "Failed");
				return false;
			}
			strOrderNumber = row.get("OrderNumber");
			
			rc = searchOrder(row);//
			Assert.assertTrue(rc);

			//Get the order number searched with
			row = getTempData();

			//Check checkbox present for row 0- //*[contains(@id,'-0-uiGrid')]//*[@role='checkbox']
			String strOrderCheckbox = "//*[contains(@id,'-0-uiGrid')]//*[@role='checkbox']";
			rc = clickElementByXPath(strOrderCheckbox, "Order Checkbox");
			Assert.assertTrue(rc);

			//Delete the entered order - //*[@id="delete-record"]
			String strDeleteButtonXPath = "//*[@id='delete-record']"; 
			rc = clickElementByXPath(strDeleteButtonXPath, "Delete Button");
			Assert.assertTrue(rc);

			//String click confirm button - //button[@data-bb-handler="confirm"]
			String strDeleteButtonConfirmXPath = "//button[@data-bb-handler='confirm']"; 
			rc = clickElementByXPath(strDeleteButtonConfirmXPath , "Confirm Delete Button");
			Assert.assertTrue(rc);

			return true;
		} catch (Exception e) {
			logMessage("Verify order deletion", "Should be able to perform order deletion", "Unable to perform order deletion", "Failed");
			e.printStackTrace();
			return false;
		}
	}

	/**
	 * Creates an Order in LM Only Configuration
	 * @param row
	 * @return
	 */
	public boolean addOrderDeliverOnly_LM_Order_old (LinkedHashMap<String, String> row) {

		try 
		{
			//Setting the format for any date field 
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:ss"); // 21/02/2018 12:30

			/*** Page Elements ***/
			String strDashBoard = "//*[@id='dashboard_cm']";
			String strOrderMenu = "//*[text()='Order']";
			String strAllOrdersMenuItem = "//*[text()='All Orders']";
			String strAddButton = "//*[contains (@class,'icon-add')]"; // "//*[@class='logi-icon icon-Product-Icons_Add']";// "//*[contains (@class,'icon-add')]";

			/*Test Steps ***/
			rc = launchApplication (row);
			Assert.assertTrue(rc);

			rc = login (row);
			Assert.assertTrue(rc);

			//Wait for Dashboard to load
			waitForELement(strDashBoard);

			isApplicationLaunched = true;

			//Click Order
			rc = clickElementByXPath(strOrderMenu, "Order");
			Assert.assertTrue(rc);

			//Click All Orders
			rc = clickElementByXPath(strAllOrdersMenuItem, "All Orders");
			Assert.assertTrue(rc);

			//Click Add Button - //*[contains (@class,'icon-add')] - class='logi-icon icon-Product-Icons_Add'
			rc = clickElementByXPath(strAddButton, "Add Button");
			Assert.assertTrue(rc);

			//Enter Branch Name - id="id-branch-name"
			String strBranchName = "LMDMumbai";//row.get("Branch");

			//Click on main div - and sendkeys on the input element..
			String strBranchNameSelect = "//div[@id='id-branch-name']";
			String strBranchTextBox = "//div[@id='id-branch-name']/input";
			rc = udsSelectLM_Dropdown(strBranchNameSelect, "Branch Name", strBranchName);
			Assert.assertTrue(rc);

			//Enter Return to Hub - id="id-return-to-hub"
			String strReturnToHub = "LMDMumbai";//row.get("Branch");

			//Click on main div - and sendkeys on the input element..
			String strReturnToHubSelect = "//div[@id='id-return-to-hub']";
			String strReturnToHubBox = "//div[@id='id-return-to-hub']/input";

			rc = udsSelectLM_Dropdown(strReturnToHubSelect, "Return To Hub", strReturnToHub);
			Assert.assertTrue(rc);

			//Emter Order Number - id="id-order-number"
			String strRandomNumber = getUniqueIntegerValue(9);
			String strOrderNumber = "Ord"+strRandomNumber;
			String strOrderNumberXPath = "//*[@id='id-order-number']";
			rc = sendKeys(strOrderNumberXPath, strOrderNumber, "Order Number Textbox", true);

			//Enter PO Number - id="id-airway-bill-number"
			String strAWB_Number = strOrderNumber;
			String strAWB_NumberXPath = "//*[@id='id-airway-bill-number']";
			rc = sendKeys(strAWB_NumberXPath, strAWB_Number, "AWB Number Textbox", true);

			//Enter Order Date - id="js-startTime-shipmentOrderDt" - JSExecutor

			Calendar c = Calendar.getInstance();	
			c.add(Calendar.DAY_OF_WEEK, -5);
			c.add(Calendar.HOUR_OF_DAY, -1);

			String strOrderedDate = sdf.format(c.getTime())+""; //"04/02/2018 11:15";
			String strOrderedDateXPath = "//*[@id='js-startTime-shipmentOrderDt']";
			setValueByJavascript(driver, strOrderedDateXPath, "Order Date", strOrderedDate);
			row.put("OrderDate", strOrderedDate);

			//Enter Delivery Type - Optional
			String strDeliveryTypeOptions = "Type A,Type B";
			String strDeliveryTypeOptArr [] = strDeliveryTypeOptions.split(",");

			for (int i = 0; i < strDeliveryTypeOptArr.length; i++) {

				String strDeliveryTypeOption = strDeliveryTypeOptArr [i];//"Type A";

				//Click select - id="id-delivery-type"
				String strDeliveryTypeSelectBox = "//*[@id='id-delivery-type']";
				String strDeliveryTypeInputXPath = "//*[@id='id-delivery-type']//input";
				rc = clickElementByXPath(strDeliveryTypeSelectBox, "Delivery Type");

				//Enter in Input - id="id-delivery-type"//input
				rc = sendKeys(strDeliveryTypeInputXPath, strDeliveryTypeOption, "Delivery Type", true);

				//Select the option availabe in the dropdown
				rc = clickElementByXPath(strDeliveryTypeSelectBox + "//div[.='"+strDeliveryTypeOption+"']", "Option - "+strDeliveryTypeOption);
				Assert.assertTrue(rc);

			}

			//Enter Weight in Kgs - id="id-weight-(#@#weight#@#)"
			String strOrderWeightInKGs = "10";
			String strOrderWeightTextBox = "//*[@id='id-weight-(#@#weight#@#)']";
			rc = setValueByJavascript(driver, strOrderWeightTextBox, "Weight KGs", strOrderWeightInKGs); //(strOrderWeightInKGs, strOrderWeightTextBox, "Order Weight", true);

			//Enter Volume - id="id-volume-(#@#volume#@#)"
			String strOrderVolumeInCC = "10";
			String strOrderVolumeTextBox = "//*[@id='id-volume-(#@#volume#@#)']";
			rc = setValueByJavascript(driver, strOrderVolumeTextBox, "Volumne CC", strOrderVolumeInCC); // (strOrderVolumeInKGs, strOrderVolumeTextBox, "Order Weight", true);

			//Enter Payment Mode - id="id-payment-mode"
			String strPaymentModeSelectBox = "//*[@id='id-payment-mode']";
			String strPaymentModeTextBox = "//*[@id='id-payment-mode']//input";
			String strPaymentModeValue = "Cash On Delivery";

			clickElementByXPath(strPaymentModeSelectBox, "Payment Mode");
			rc = sendKeys(strPaymentModeTextBox, strPaymentModeValue, "Payment Mode Textbox", true);
			Assert.assertTrue(rc);

			//Click the option available...
			clickElementByXPath(strPaymentModeSelectBox + "//div[.='"+strPaymentModeValue+"']", "Option - "+strPaymentModeValue);

			//Enter Value - id="id-value"
			String strValue = "200";
			String strValueXPath = "//*[@id='id-value']";
			rc = setValueByJavascript(driver, strValueXPath, "Value", strValue);
			Assert.assertTrue(rc);

			//Enter Service Time - id="id-servicetime"
			String strServiceTimeValue = "15";
			String strServiceTimeXPath = "//*[@id='id-servicetime']";
			rc = setValueByJavascript(driver, strServiceTimeXPath, "Value", strServiceTimeValue);
			Assert.assertTrue(rc);

			//Enter Start Time - id="js-startTime-StartTimeWindow"
			c = Calendar.getInstance();	
			c.add(Calendar.DAY_OF_MONTH, 1);
			c.add(Calendar.DAY_OF_WEEK, -5);
			String strStartTime = sdf.format(c.getTime()) + "";//"21/02/2018 12:30";
			String strStartTimeXPath = "//*[@id='js-startTime-StartTimeWindow']";
			rc = setValueByJavascript(driver, strStartTimeXPath, "Start Time", strStartTime);
			Assert.assertTrue(rc);
			row.put("OrderStartDate", strStartTime);

			//Enter End Time - id="js-startTime-EndTimeWindow"
			c = Calendar.getInstance();
			c.add(Calendar.DAY_OF_MONTH, 1);
			c.add(Calendar.HOUR, 1);
			c.add(Calendar.DAY_OF_WEEK, -5);
			String strEndTime = sdf.format(c.getTime()) + "";//"21/02/2018 15:30";
			String strEndTimeXPath = "//*[@id='js-startTime-EndTimeWindow']";
			rc = setValueByJavascript(driver, strEndTimeXPath, "End Time", strEndTime);
			Assert.assertTrue(rc);
			row.put("OrderEndDate",strEndTime);

			//Partial Delivery Allowed Checkbox - for="id-partial-delivery-allowed"
			String strPartialDeliveryAllowedLabelXPath = "//*[contains (@for, '-partial-delivery-allowed')]";//"//*[@for='id-partial-delivery-allowed']";
			String strPartialDeliveryAllowedCheckboxXPath = "//*[contains (@id,'-partial-delivery-allowed')]";//"//*[@id='id-partial-delivery-allowed']";
			rc = clickCheckboxByXPath(strPartialDeliveryAllowedCheckboxXPath, strPartialDeliveryAllowedLabelXPath, "Is Partial Delivery Allowed", true);
			Assert.assertTrue(rc);

			//Sales Return Allowed
			String strSalesReturnAllowedLabelXPath = "//*[contains (@for,'-sales-return-allowed')]";//"//*[@for='id-sales-return-allowed']";
			String strSalesReturnAllowedCheckboxXPath = "//*[contains (@id, '-sales-return-allowed')]"; // "//*[@id='id-sales-return-allowed']";
			rc = clickCheckboxByXPath(strSalesReturnAllowedCheckboxXPath, strSalesReturnAllowedLabelXPath , "Sales Return Allowed", true);
			Assert.assertTrue(rc);

			//Order Cancellation Checkbox 
			String strOrderCancellationLabelXPath = "//*[contains (@for, '-order-cancellation-allowed')]";// "//*[@for='id-order-cancellation-allowed']";
			String strOrderCancellationCheckboxXPath = "//*[contains (@id, '-order-cancellation-allowed')]";// "//*[@id='id-order-cancellation-allowed']";
			rc = clickCheckboxByXPath(strOrderCancellationCheckboxXPath, strOrderCancellationLabelXPath , "Order Cancellaton Allowed", true);
			Assert.assertTrue(rc);


			//*** Enter Customer Details ***

			//Enter Customer Number - id="id-customer-id"
			String strRandomValue = getUniqueIntegerValue(7);
			String strCustomerIDValue = "Cust"+strRandomValue;
			String strCustomerNumberXPath = "//*[@id='id-customer-id']";
			rc = sendKeys(strCustomerNumberXPath, strCustomerIDValue, "Customer ID", true);
			Assert.assertTrue(rc);

			//Enter Customer Name - id="id-name"
			String strCustomerName = "CustName"+strRandomValue;
			String strCustomerNameXPath = "//*[@id='id-name']";
			rc = sendKeys(strCustomerNameXPath, strCustomerName, "Customer Name", true);
			Assert.assertTrue(rc);

			//Enter Customer Email ID - id="id-email-id"
			String strCustEmailID = "cust"+strRandomValue+"@test.com";
			String strCustEmailIDXPath = "//*[@id='id-email-id']";
			rc = sendKeys(strCustEmailIDXPath, strCustEmailID, "Email ID", true);
			Assert.assertTrue(rc);

			//Enter Customer Phone Number - name="PhoneNumber"
			String strCustPhoneNumber = "9"+ getUniqueIntegerValue(9);
			String strCustomerPhoneNumberXPath = "//*[@name='PhoneNumber']";
			//rc = setValueByJavascript(driver, strCustomerPhoneNumberXPath, "Customer Email ID", strCustPhoneNumber);
			rc = sendKeys(strCustomerPhoneNumberXPath, strCustPhoneNumber, "Phone Number", true);
			Assert.assertTrue(rc);

			//Enter Country - id="id-country"
			String strCustomerCountry = "INDIA";
			strCustomerCountry = strCustomerCountry.toUpperCase();
			String strCustCounterySelectXPath = "//*[@id='id-country']";
			String strCustCounteryInputXPath = "//*[@id='id-country']//input";
			rc = clickElementByXPath(strCustCounterySelectXPath, "Country Name"); //(driver, strCustCounteryInputXPath, "Customer Country", strCustomerCountery);
			rc = sendKeys(strCustCounteryInputXPath, strCustomerCountry, "Country Name", true);

			//Find for the option - //*[@id='id-country']//div[.='INDIA']
			String strOptionText = strCustCounterySelectXPath + "//div[.='"+strCustomerCountry+"']";
			rc = clickElementByXPath(strOptionText, "Option - "+strCustomerCountry);
			Assert.assertTrue(rc);

			//Enter Apartment - id="id-apartment"
			String strApartmentDetail = "B12 501  Silver Park";
			String strAptDetailXPath = "//*[@id='id-apartment']";
			rc = sendKeys(strAptDetailXPath, strApartmentDetail, "Apartment Details", true);
			Assert.assertTrue(rc);

			//Enter Locality / Street - id="id-society-/-street"
			String strLocalityStreet = "Mira Road East";
			String strLocalityStreetXPath = "//*[@id='id-society-/-street']";
			rc = sendKeys(strLocalityStreetXPath, strLocalityStreet, "Society Street", true);
			Assert.assertTrue(rc);

			//Enter Landmark - id="id-landmark"
			String strLandmarkValue = "Silver Park";
			String strLandmarkXPath = "//*[@id='id-landmark']";
			rc = sendKeys(strLandmarkXPath, strLandmarkValue, "Landmark", true);
			Assert.assertTrue(rc);

			//Enter Locality / Area - id="id-locality-/-area"
			String strLocalityValue = "Silver Park, Mira Road E";
			String strLocalityXPath = "//*[@id='id-locality-/-area']";
			rc = sendKeys(strLocalityXPath, strLocalityValue, "Locality", true);
			Assert.assertTrue(rc);

			//Enter State - id="id-state"
			String strStateValue = "Maharashtra";
			String strStateSelectBox = "//*[@id='id-state']";
			String strStateInputBox = "//*[@id='id-state']//input";
			rc = clickElementByXPath(strStateSelectBox, "Select State Dropdown");
			rc = sendKeys(strStateInputBox, strStateValue, "Select State Dropdown", true);

			//Select Option for State
			String strStateOption = strStateSelectBox + "//div[.='"+strStateValue+"']";
			rc = clickElementByXPath(strStateOption, "Option - "+strStateValue);

			//Enter City - id="id-city"
			String strCityXPath = "//*[@id='id-city']";
			String strCityValue = "Mumbai";
			rc = sendKeys(strCityXPath, strCityValue, "City", true);

			//Enter Postal Code - id="id-pincode"
			String strPinCodeValue = "401107";
			String strPinCodeXPath = "//*[@id='id-pincode']";
			String strPinCodeInputXPath = "//*[@id='id-pincode']//input";

			rc = clickElementByXPath(strPinCodeXPath, "Postal Code");
			rc = sendKeys(strPinCodeInputXPath, strPinCodeValue, "Postal Code", true);

			//Select the option present in dropdown
			String strPinCodeOption = strPinCodeXPath + "//div[.='"+strPinCodeValue+"']";
			rc = clickElementByXPath(strPinCodeOption, "Option - Postal Code - "+strPinCodeValue);
			Assert.assertTrue(rc);

			//Enter Notes - id="id-notes"
			String strNotesXPath = "//*[@id='id-notes']";
			String strNotesValue = "Testing Customer Details";
			rc = sendKeys(strNotesXPath, strNotesValue, "Notes", true);
			/*
			//Enter Number of Items - id="id-number-of-items" - //*[@id="id-number-of-items"]//following::button
			String strAddCrateItems = "//*[@id='id-number-of-items']";
			rc = clickElementByJavascript(driver,strAddCrateItems, "Add Items Button");
			Assert.assertTrue(rc);
			 */
			//Enter Crate Information in Modal - 
			rc = enterCrateItems();

			/**
			if (rc == false){
				//Try to enter singleton crate items

				int iCounter = 1;
				int iExpectedCrates = 3;
				do {
					//Enter Crate Code - (//main)[1]//*[@name='crateCd']
					String strCrateCodeValue = getUniqueValue(5);
					String strCrateCodeValueXPath =  "(//main)["+iCounter+"]//*[@name='crateCd']"; 
					rc = sendKeys(strCrateCodeValueXPath, strCrateCodeValue, "Crate Code", true);
					Assert.assertTrue(rc);

					//Enter Crate Value - name="crateType"
					String strCrateTypeValue = "Crate Type";//getUniqueValue(5);
					String strCrateValueXPath =  "(//main)["+iCounter+"]//*[@name='crateType']"; 
					rc = sendKeys(strCrateValueXPath, strCrateTypeValue, "Crate Type", true);
					Assert.assertTrue(rc);

					//Enter Qty - name="noOfUnits"
					String strCrateQtyValue = getUniqueIntegerValue(2);
					String strCrateQtyXPath =  "(//main)["+iCounter+"]//*[@name='noOfUnits']"; 
					rc = sendKeys(strCrateQtyXPath, strCrateQtyValue, "Crate Qty", true);
					Assert.assertTrue(rc);

					//Enter Amt - name="crateAmount"
					String strCrateAmtValue = getUniqueIntegerValue(2);
					String strCrateAmtXPath =  "(//main)["+iCounter+"]//*[@name='crateAmount']"; 
					rc = sendKeys(strCrateAmtXPath, strCrateAmtValue, "Crate Amt", true);
					Assert.assertTrue(rc);

					//Add Button - (//main)[iCounter]//following::div[contains(@class,'add')]
					if (iCounter <= iExpectedCrates - 1){
						String strAddButtonXPath = "(//main)["+iCounter+"]//following::div[contains(@class,'add')]";
						rc = clickElementByXPath(strAddButtonXPath, "Add Button");						
						Assert.assertTrue(rc);
					}
					iCounter ++;
				}while (iCounter <= iExpectedCrates);

				//Click Save Button - //a[text()='Save']
				String strSaveButton = "//a[text()='Save']";
				rc = clickElementByXPath(strSaveButton, "Save Crate Button");
			}**/

			//Assert.assertTrue(rc);

			//Click Save Button for Order
			String strSaveButton = "//*[@logi-google-analytics='Orders Add : save']";//"//button[@type='submit' and text()='Save']";
			rc = clickElementByXPath(strSaveButton, "Save Order Button");
			Assert.assertTrue(rc);

			//Verify JS Prompt - Order Created Successfully
			String strPromptXPath = "//*[@id='js-prompt']";
			String strPromptValue = "";

			//Get Text from Prompt
			strPromptValue = getElementTextByXPath(strPromptXPath, "Prompt");
			if (strPromptValue != null && strPromptValue.toLowerCase().contains("order created successfully"))
			{
				logMessage("Verify Success Message", "Success Message - Order Created Successfully should display", "Message : "+strPromptValue+" is displayed", "Passed");
			}
			else
			{
				logMessage("Verify Success Message", "Success Message - Order Created Successfully should display", "Message : "+strPromptValue+" is displayed, Unable to create an order", "Failed");
				return false;
			}

			row.put("OrderNumber", strOrderNumber);
			row.put("OrderDate", strOrderedDate);
			row.put("OrderStartDate", strStartTime);
			row.put("OrderEndDate",strEndTime);

			updateTempData(row);

			//Create an Order Searching function


			//Navigate back to Orders Page - Order - All Orders
			/*
			String strOrderMenu = "//*[text()='Order']";
			String strAllOrdersMenuItem = "//*[text()='All Orders']";*/

			//Click Order
			//rc = clickElementByXPath(strOrderMenu, "Order");
			//Assert.assertTrue(rc);

			//Click All Orders
			//rc = clickElementByXPath(strAllOrdersMenuItem, "All Orders");
			//Assert.assertTrue(rc);

			//Set Page size 
			//setOrderPageSize();

			//Wait for list view to show items greater than 0 - //*[@logi-google-analytics="Orders - Open order history"]

			//Get first result - 

			//Search Order - Order Number

			//  //*[@logi-google-analytics="Orders - Open order history"]


			//Verify orders within the date range - //input[@title='Choose a date range to display Orders during that time.']

			//Click - //li[@data-range-key="Next 30 days"]

			//Search for order number - 



		}
		catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}



	public boolean enterCrateItems (){
		try {

			//Enter Number of Items - id="id-number-of-items" - //*[@id="id-number-of-items"]//following::button
			String strAddCrateItems = "//*[@id='id-number-of-items']";
			rc = clickElementByJavascript(driver,strAddCrateItems, "Add Items Button");
			Assert.assertTrue(rc);

			//Get Crate Information Modal - //*[contains(@class,'crate-section')]
			String strCrateInformationModal = "//*[contains(@class,'crate-section')]";


			//Verify if Single line crate -  http://10.124.92.41//LoginApp/framework/structure?pageName=ORDERS&modelName=ORDERS&sectionName=CRATE_LIST&CLIENT_SECRET_KEY=$2a$08$OhDPr4fuTbyN508%2FshScm.IyvWS%2FIK9jToUnEQ0X4ZZBKaG7Y%2FuU2&access_token=cd784a43-1fdc-4948-bdad-6913b0800c5c
			/*JsonObject crateStructure_Json = getStructureAPI("ORDERS", "ORDERS", "CRATE_LIST");
			System.out.println("crateStructure_Json: "+crateStructure_Json);
			 */// - https://demo.loginextsolutions.com/LoginApp/framework/structure?pageName=ORDERS&modelName=ORDERS&sectionName=CRATE_ITEM_LIST
			//If Client Property JsonObject - has ( propertyValue:  "CRATEITEM") - then it is a multiline crate, else if -CRATE then it is a single line crate - Get the property from https://demo.loginextsolutions.com/ClientApp/client/property?propertyKey=CRATESTRUCTURE

			JsonObject crateStructureClientProperty = getClientProperties("CRATESTRUCTURE");
			System.out.println("crateStructureClientProperty: "+crateStructureClientProperty);

			String strCrateLevelClientProperty = crateStructureClientProperty.has("propertyValue") ? crateStructureClientProperty.get("propertyValue").getAsString() : "";
			System.out.println("strCrateLevelClientProperty: "+strCrateLevelClientProperty);

			String strCrateLevel = "";
			if (strCrateLevelClientProperty.equalsIgnoreCase("CRATE")) 
			{
				strCrateLevel = "SINGLE";
			}
			else if (strCrateLevelClientProperty.equalsIgnoreCase("CRATEITEM")) 
			{
				strCrateLevel = "MULTIPLE";
			}
			else 
			{
				logMessage("Fetch Crate Level", "Crate Level should be fetched", "Unable to fetch crate level, Should be SINGLE / MULTIPLE based on CLient Property : "+strCrateLevelClientProperty, "Failed");
				return false;
			}
			/*
			if (crateStructure_Json.has("columns") 
					&& crateStructure_Json.get("columns").getAsJsonObject().has("crateCd")
					&& crateStructure_Json.get("columns").getAsJsonObject().has("crateCd")
					&& crateStructure_Json.get("columns").getAsJsonObject().has("crateType")
					&& crateStructure_Json.get("columns").getAsJsonObject().has("noOfUnits")
					){
				strCrateLevel = "SINGLE";
			}
			else {
				strCrateLevel = "MULTIPLE";
			}*/

			System.out.println("Crate Type - "+strCrateLevel);
			if (strCrateLevel != null && strCrateLevel.equals("SINGLE")){

				//Try to Enter Crate Items with no line Items 
				if (strCrateLevel != null && strCrateLevel.equals("SINGLE")){
					//It can be a case of crate with no line Items - Try to enter singleton crate items
					int iCounter = 1;
					int iExpectedCrates = 2;
					do {
						//Enter Crate Code - (//main)[1]//*[@name='crateCd']
						String strCrateCodeValue = getUniqueValue(5);
						String strCrateCodeValueXPath =  "(//main)["+iCounter+"]//*[@name='crateCd']"; 
						rc = sendKeys(strCrateCodeValueXPath, strCrateCodeValue, "Crate Code", true);
						Assert.assertTrue(rc);

						//Enter Crate Value - name="crateType"
						String strCrateTypeValue = "Crate Type";//getUniqueValue(5);
						String strCrateValueXPath =  "(//main)["+iCounter+"]//*[@name='crateType']"; 
						rc = sendKeys(strCrateValueXPath, strCrateTypeValue, "Crate Type", true);
						Assert.assertTrue(rc);

						//Enter Qty - name="noOfUnits"
						String strCrateQtyValue = getUniqueIntegerValue(1);
						String strCrateQtyXPath =  "(//main)["+iCounter+"]//*[@name='noOfUnits']"; 
						rc = sendKeys(strCrateQtyXPath, strCrateQtyValue, "Crate Qty", true);
						Assert.assertTrue(rc);

						//Enter Amt - name="crateAmount"
						String strCrateAmtValue = getUniqueIntegerValue(1);
						String strCrateAmtXPath =  "(//main)["+iCounter+"]//*[@name='crateAmount']"; 
						rc = sendKeys(strCrateAmtXPath, strCrateAmtValue, "Crate Amt", true);
						Assert.assertTrue(rc);

						//Add Button - (//main)[iCounter]//following::div[contains(@class,'add')]
						if (iCounter <= iExpectedCrates - 1){
							String strAddButtonXPath = "(//main)["+iCounter+"]//following::div[contains(@class,'add')]";
							rc = clickElementByXPath(strAddButtonXPath, "Add Button");						
							Assert.assertTrue(rc);
						}
						iCounter ++;
					}while (iCounter <= iExpectedCrates);

					//Click Save Button - //a[text()='Save']
					String strSaveButton = "//a[@ng-click='saveOrderCrates()']";//"//a[text()='Save']";
					rc = clickElementByXPath(strSaveButton, "Save Crate Button");
				}
				//END - crate with no line Items - Try to enter singleton crate items
				return rc;
			}

			//Enter Crate Barcode - @placeholder='Enter Crate Barcode'
			String strCrateBarcodeTextbox = strCrateInformationModal + "//*[@placeholder='Enter Crate Barcode']";
			String strCrateBarCode = getUniqueValue(15);
			rc = sendKeys(strCrateBarcodeTextbox, strCrateBarCode, "Crate Barcode", true);

			int iTotalItemsPerCrate;
			int iCrateNumber = 1;

			int iMaxTotalItemsPerCrate = 2;
			int iMaxCrates = 2;
			TimeUnit.SECONDS.sleep(3);
			do
			{
				iTotalItemsPerCrate = 0;
				do
				{

					//Get total Sections - //*[contains(@class,'crate-section')]//*[@name="addDeliveryMedium"]
					String strTotalItemSections = "//*[contains(@class,'crate-section')]//*[@name='addDeliveryMedium']";
					iTotalItemsPerCrate ++;//driver.findElements(By.xpath(strTotalItemSections)).size();
					System.out.println("Total Available : "+iTotalItemsPerCrate);

					//Fill In Section 1 - <Section1> //*[contains(@class,'crate-section')]//*[@name="addDeliveryMedium"][1|2|3]
					String strCurrentSection = "("+strTotalItemSections + "["+iTotalItemsPerCrate+"]"+")"+"["+iCrateNumber+"]";

					//Item Barcode - <Setion1>//id="id-item-barcode"
					String strItemBarCodeXPath = strCurrentSection + "//*[@id='id-item-barcode']";
					String strItemBarCodeValue = getUniqueIntegerValue(7);
					rc = sendKeys(strItemBarCodeXPath, strItemBarCodeValue, "Item BarCode - "+iTotalItemsPerCrate, true);
					Assert.assertTrue(rc);

					String strRandomValue = getUniqueIntegerValue(3);

					//Enter Item Name - <Setion1>//id="id-item-name"
					String strItemNameXPath = strCurrentSection + "//*[@id='id-item-name']";
					String strItemNameValue = "Item Name - "+iTotalItemsPerCrate+ " - "+strRandomValue;
					rc = sendKeys(strItemNameXPath, strItemNameValue, "Item Name - "+iTotalItemsPerCrate, true);
					Assert.assertTrue(rc);

					//Enter Item Type - <Setion1>//id="id-item-type"
					String strItemType = strCurrentSection + "//*[@id='id-item-type']";
					String strItemTypeValue = "Item Type - "+iTotalItemsPerCrate+ " - "+strRandomValue;
					rc = sendKeys(strItemType, strItemTypeValue, "Item Type - "+iTotalItemsPerCrate, true);
					Assert.assertTrue(rc);

					//Enter Item Weight - <Setion1>//id="id-item-weight"
					String strItemWeight = strCurrentSection + "//*[@id='id-item-weight']";
					String strItemWeightValue = getUniqueIntegerValue(1);
					rc = sendKeys(strItemWeight, strItemWeightValue, "Item Weight", true);
					Assert.assertTrue(rc);

					//Enter Item Units - <Setion1>//id="id-no.-of-units"
					String strItemUnits = strCurrentSection + "//*[@id='id-no.-of-units']";
					String strItemUnitsValue = getUniqueIntegerValue(1);
					rc = sendKeys(strItemUnits, strItemUnitsValue, "Item Units", true);
					Assert.assertTrue(rc);

					//Enter Item Price - <Setion1>//id="id-price/unit"
					String strItemPrice = strCurrentSection + "//*[@id='id-price/unit']";
					String strItemPriceValue = getUniqueIntegerValue(1);
					rc = sendKeys(strItemPrice, strItemPriceValue, "Item Price", true);
					Assert.assertTrue(rc);

					if (iTotalItemsPerCrate == iMaxTotalItemsPerCrate)
					{
						System.out.println("Completed adding items for Crate - "+strCrateBarCode);
						break;
					}
					else {
						//Click Add Button for Crate 1 - class contains add-lineitem
						//iTotalSections = driver.findElements(By.xpath(strTotalItemSections)).size();
						//System.out.println("Total Available Rows: "+iTotalSections);
						String strAddLineItemButton = strCurrentSection +"//div[contains(@class, 'add-lineitem')]";
						//strTotalItemSections + "["+iTotalSections+"]"+"//div[contains(@class, 'add-lineitem')]";
						clickElementByXPath(strAddLineItemButton, "Add Line Item - "+iTotalItemsPerCrate);
					}
					//Get total Sections - Find Elements - //*[contains(@class,'crate-section')]//*[@name="addDeliveryMedium"]

					//Enter 5 Items - for each section - //*[contains(@class,'crate-section')]//*[@name="addDeliveryMedium"]

				}
				while (true);

				//Repeat Adding 5 Items per crate
				iCrateNumber++;

				if (iCrateNumber > iMaxCrates){
					break;
				}
				else {

					//Add 5 New Crates Enter Text in - class="addNewCrateInput"
					String strAddCrateBarCodeValue = getUniqueValue(15);
					String strAddCrateTextboxXPath = "//*[@class='addNewCrateInput']";
					rc = sendKeys(strAddCrateTextboxXPath, strAddCrateBarCodeValue, "Crate - "+strAddCrateBarCodeValue, true);
					Assert.assertTrue(rc);

					//Click Add Button for each crate - //*[contains (@class, 'addCrate')]//i
					String strAddCrateButtonXPath = "//*[contains (@class, 'addCrate')]//i";
					clickElementByXPath(strAddCrateButtonXPath, "Add Crate Button");

					TimeUnit.SECONDS.sleep(3);
				}
			}
			while (true);

			//Click Save Button - //a[text()='Save']
			String strSaveButton = "//*[@ng-click='saveOrderCrates()']";// "//a[text()='Save']";
			clickElementByXPath(strSaveButton, "Save Crate Button");

			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}


	public boolean enterCrateItems_bup (){
		try {

			//Enter Number of Items - id="id-number-of-items" - //*[@id="id-number-of-items"]//following::button
			String strAddCrateItems = "//*[@id='id-number-of-items']";
			rc = clickElementByJavascript(driver,strAddCrateItems, "Add Items Button");
			Assert.assertTrue(rc);

			//Get Crate Information Modal - //*[contains(@class,'crate-section')]
			String strCrateInformationModal = "//*[contains(@class,'crate-section')]";

			mutedReporting = true;
			int iTmpMaxwaitTime = MAX_WAIT_TIME;
			MAX_WAIT_TIME = 10;

			//Enter Crate Barcode - @placeholder='Enter Crate Barcode'
			String strCrateBarcodeTextbox = strCrateInformationModal + "//*[@placeholder='Enter Crate Barcode']";
			String strCrateBarCode = getUniqueValue(15);
			rc = sendKeys(strCrateBarcodeTextbox, strCrateBarCode, "Crate Barcode", true);

			//Revert back logging
			mutedReporting = false;
			MAX_WAIT_TIME = iTmpMaxwaitTime;
			TimeUnit.SECONDS.sleep(3);
			if (rc == false){

				//Try to Enter Crate Items with no line Items 
				if (rc == false){
					//It can be a case of crate with no line Items - Try to enter singleton crate items
					int iCounter = 1;
					int iExpectedCrates = 2;
					do {
						//Enter Crate Code - (//main)[1]//*[@name='crateCd']
						String strCrateCodeValue = getUniqueValue(5);
						String strCrateCodeValueXPath =  "(//main)["+iCounter+"]//*[@name='crateCd']"; 
						rc = sendKeys(strCrateCodeValueXPath, strCrateCodeValue, "Crate Code", true);
						Assert.assertTrue(rc);

						//Enter Crate Value - name="crateType"
						String strCrateTypeValue = "Crate Type";//getUniqueValue(5);
						String strCrateValueXPath =  "(//main)["+iCounter+"]//*[@name='crateType']"; 
						rc = sendKeys(strCrateValueXPath, strCrateTypeValue, "Crate Type", true);
						Assert.assertTrue(rc);

						//Enter Qty - name="noOfUnits"
						String strCrateQtyValue = getUniqueIntegerValue(1);
						String strCrateQtyXPath =  "(//main)["+iCounter+"]//*[@name='noOfUnits']"; 
						rc = sendKeys(strCrateQtyXPath, strCrateQtyValue, "Crate Qty", true);
						Assert.assertTrue(rc);

						//Enter Amt - name="crateAmount"
						String strCrateAmtValue = getUniqueIntegerValue(1);
						String strCrateAmtXPath =  "(//main)["+iCounter+"]//*[@name='crateAmount']"; 
						rc = sendKeys(strCrateAmtXPath, strCrateAmtValue, "Crate Amt", true);
						Assert.assertTrue(rc);

						//Add Button - (//main)[iCounter]//following::div[contains(@class,'add')]
						if (iCounter <= iExpectedCrates - 1){
							String strAddButtonXPath = "(//main)["+iCounter+"]//following::div[contains(@class,'add')]";
							rc = clickElementByXPath(strAddButtonXPath, "Add Button");						
							Assert.assertTrue(rc);
						}
						iCounter ++;
					}while (iCounter <= iExpectedCrates);

					//Click Save Button - //a[text()='Save']
					String strSaveButton = "//a[@ng-click='saveOrderCrates()']";//"//a[text()='Save']";
					rc = clickElementByXPath(strSaveButton, "Save Crate Button");
				}
				//END - crate with no line Items - Try to enter singleton crate items
				return rc;
			}

			int iTotalItemsPerCrate;
			int iCrateNumber = 1;

			int iMaxTotalItemsPerCrate = 2;
			int iMaxCrates = 2;
			TimeUnit.SECONDS.sleep(3);
			do
			{
				iTotalItemsPerCrate = 0;
				do
				{

					//Get total Sections - //*[contains(@class,'crate-section')]//*[@name="addDeliveryMedium"]
					String strTotalItemSections = "//*[contains(@class,'crate-section')]//*[@name='addDeliveryMedium']";
					iTotalItemsPerCrate ++;//driver.findElements(By.xpath(strTotalItemSections)).size();
					System.out.println("Total Available : "+iTotalItemsPerCrate);

					//Fill In Section 1 - <Section1> //*[contains(@class,'crate-section')]//*[@name="addDeliveryMedium"][1|2|3]
					String strCurrentSection = "("+strTotalItemSections + "["+iTotalItemsPerCrate+"]"+")"+"["+iCrateNumber+"]";

					//Item Barcode - <Setion1>//id="id-item-barcode"
					String strItemBarCodeXPath = strCurrentSection + "//*[@id='id-item-barcode']";
					String strItemBarCodeValue = getUniqueIntegerValue(7);
					rc = sendKeys(strItemBarCodeXPath, strItemBarCodeValue, "Item BarCode - "+iTotalItemsPerCrate, true);
					Assert.assertTrue(rc);

					String strRandomValue = getUniqueIntegerValue(3);

					//Enter Item Name - <Setion1>//id="id-item-name"
					String strItemNameXPath = strCurrentSection + "//*[@id='id-item-name']";
					String strItemNameValue = "Item Name - "+iTotalItemsPerCrate+ " - "+strRandomValue;
					rc = sendKeys(strItemNameXPath, strItemNameValue, "Item Name - "+iTotalItemsPerCrate, true);
					Assert.assertTrue(rc);

					//Enter Item Type - <Setion1>//id="id-item-type"
					String strItemType = strCurrentSection + "//*[@id='id-item-type']";
					String strItemTypeValue = "Item Type - "+iTotalItemsPerCrate+ " - "+strRandomValue;
					rc = sendKeys(strItemType, strItemTypeValue, "Item Type - "+iTotalItemsPerCrate, true);
					Assert.assertTrue(rc);

					//Enter Item Weight - <Setion1>//id="id-item-weight"
					String strItemWeight = strCurrentSection + "//*[@id='id-item-weight']";
					String strItemWeightValue = getUniqueIntegerValue(1);
					rc = sendKeys(strItemWeight, strItemWeightValue, "Item Weight", true);
					Assert.assertTrue(rc);

					//Enter Item Units - <Setion1>//id="id-no.-of-units"
					String strItemUnits = strCurrentSection + "//*[@id='id-no.-of-units']";
					String strItemUnitsValue = getUniqueIntegerValue(1);
					rc = sendKeys(strItemUnits, strItemUnitsValue, "Item Units", true);
					Assert.assertTrue(rc);

					//Enter Item Price - <Setion1>//id="id-price/unit"
					String strItemPrice = strCurrentSection + "//*[@id='id-price/unit']";
					String strItemPriceValue = getUniqueIntegerValue(1);
					rc = sendKeys(strItemPrice, strItemPriceValue, "Item Price", true);
					Assert.assertTrue(rc);

					if (iTotalItemsPerCrate == iMaxTotalItemsPerCrate)
					{
						System.out.println("Completed adding items for Crate - "+strCrateBarCode);
						break;
					}
					else {
						//Click Add Button for Crate 1 - class contains add-lineitem
						//iTotalSections = driver.findElements(By.xpath(strTotalItemSections)).size();
						//System.out.println("Total Available Rows: "+iTotalSections);
						String strAddLineItemButton = strCurrentSection +"//div[contains(@class, 'add-lineitem')]";
						//strTotalItemSections + "["+iTotalSections+"]"+"//div[contains(@class, 'add-lineitem')]";
						clickElementByXPath(strAddLineItemButton, "Add Line Item - "+iTotalItemsPerCrate);
					}
					//Get total Sections - Find Elements - //*[contains(@class,'crate-section')]//*[@name="addDeliveryMedium"]

					//Enter 5 Items - for each section - //*[contains(@class,'crate-section')]//*[@name="addDeliveryMedium"]

				}
				while (true);

				//Repeat Adding 5 Items per crate
				iCrateNumber++;

				if (iCrateNumber > iMaxCrates){
					break;
				}
				else {

					//Add 5 New Crates Enter Text in - class="addNewCrateInput"
					String strAddCrateBarCodeValue = getUniqueValue(15);
					String strAddCrateTextboxXPath = "//*[@class='addNewCrateInput']";
					rc = sendKeys(strAddCrateTextboxXPath, strAddCrateBarCodeValue, "Crate - "+strAddCrateBarCodeValue, true);
					Assert.assertTrue(rc);

					//Click Add Button for each crate - //*[contains (@class, 'addCrate')]//i
					String strAddCrateButtonXPath = "//*[contains (@class, 'addCrate')]//i";
					clickElementByXPath(strAddCrateButtonXPath, "Add Crate Button");

					TimeUnit.SECONDS.sleep(3);
				}
			}
			while (true);

			//Click Save Button - //a[text()='Save']
			String strSaveButton = "//*[@ng-click='saveOrderCrates()']";// "//a[text()='Save']";
			clickElementByXPath(strSaveButton, "Save Crate Button");

			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}



	public LinkedHashMap <String , String> getAuthDetailsWeb (LinkedHashMap<String, String> row){

		try {

			//Get the auth token and Client Secret from from Auth API
			String strAuthURL = row.get("URL") + // demo.loginextsolutions.com/
					"LoginApp/login/auth";
			//"https://demo.loginextsolutions.com/LoginApp/login/auth";
			String strUser = row.get("UserName");
			String strPassword = row.get("Password");
			String strAuthRequestBody = "{\"userName\":\""+strUser+"\",\"password\":\""+strPassword+"\",\"mode\":\"web\"}";//"{'userName':'"+strUser+"','password':'"+strPassword+"','mode':'web'}";
			System.out.println("Getting strAuthURL : "+strAuthURL+" : BODY :"+strAuthRequestBody);
			System.out.println("Before Auth...");
			Response responseAuthenticate = given()
					.contentType(ContentType.JSON)
					.body(strAuthRequestBody)
					.post(strAuthURL);
			System.out.println("After Auth...");
			String strResponseBody = responseAuthenticate.getBody().asString();
			System.out.println("strResponseBody : "+strResponseBody);
			JsonParser parser = new JsonParser();
			JsonElement responseBodyAsJson = parser.parse(strResponseBody);
			//System.out.println("responseBodyAsJson: "+responseBodyAsJson);
			String strAuthReponseToken = responseBodyAsJson.getAsJsonObject().get("data").getAsJsonObject().get("token").getAsString();
			String strModelType = responseBodyAsJson.getAsJsonObject().get("data").getAsJsonObject().get("modelType").getAsString();
			String strClientSecretKey = responseAuthenticate.getHeaders().getValue("CLIENT_SECRET_KEY");

			//Adding auth details to LinkedHashMap
			row.put("token", strAuthReponseToken);
			row.put("clientSecretKey", strClientSecretKey);
			row.put("modelType", strModelType);
			System.out.println("Added auth details...");
			return row;
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			if (iTimesAPI_RecoveryPerformed < iMaxAPI_RecoveryAllowed)
			{
				iTimesAPI_RecoveryPerformed ++;
				logMessage("Recover API", "Re-Execute API due to "+e.getMessage(), "Re-executing API", "Passed");
				row = getAuthDetailsWeb (row);
				if (row.get("clientSecretKey") != null){
					return row;
				}
			}

			logMessage("Get Authentication Details", "Auth Token Details should be fetched", "Authentication Response and token details not fetched : "+e.getMessage(), "Failed");
			e.printStackTrace();
			return row;//null
		}
	}



	public boolean initApp_PageLabels (LinkedHashMap<String, String> row){

		try {

			//Get the auth token and Client Secret from from Auth API
			String strLabelAPI = row.get("URL") + // demo.loginextsolutions.com/
					"LoginApp/framework/label?labels=";

			System.out.println("Getting Label Structure - Label : "+strLabelAPI+" ");
			System.out.println("Headers \n"
					+ "client_secret_key:"+""+ row.get("clientSecretKey"));
			System.out.println("www-authenticate:"+""+ "BASIC "+row.get("token"));
			System.out.println("Content-Type:"+""+"application/json");

			String strApplicationLabels = "[ \"drsTripNumber\", \"search\",\"updateLocation\", \"last30Days\",\"downloadDbListView\",\"STARTTRIP_WH\",\"NoContinuePlanning\",\"clickHereToSelectAll\", \"YesGeocodeOrdersYesGeocodeOrders\",\"drsDeliveryBoy\",\"order_p\",\"crate_p\",\"total\",\"time\", \"vehicle.created.success\", \"create.deliverymedium.success\",\"Select\", \"reason\", \"of\",\"orderCreatedSuccessfully\",\"DELIVERED\",\"INTRANSIT\",\"NOTDISPATCHED\",\"PICKEDUP\",\"NOTPICKEDUP\",\"NOTDELIVERED\",\"CANCELLED\",\"DELIVER\",\"FORWARD\",\"REVERSE\",\"RTM\",\"PICKUP\",\"DELIVERYLOCATION\",\"PICKUPLOCATION\",\"STARTED\",\"NOTSTARTED\",\"ENDED\",\"PENDING\",\"CONFIRMED\",\"INTRANSITCONFIRMED\",\"ARRIVED\",\"CANCELLED_OD\",\"DELAYEDDISPATCH_OD\",\"DELAYEDPICKUP\",\"DELAYEDDELIVERY\",\"INSCANNED\",\"OUTSCANNED\",\"HANDEDOVER\",\"CLOSED\",\"NOTSCANNED\",\"CASH\",\"CARD_AUTO\",\"CARD_MANUAL\",\"MOMOE\",\"COD\",\"currentLocation\",\"fetching\",\"deliveryBoy\",\"distanceInKms\",\"eta\",\"orderNumber\",\"locationNotFound\", \"saasPlanExpired\",\"saasPlanExpiredMsg\",\"saasPlanExpiredUpgradeNow\",\"saasPlanExpiredViewPlansMsg\",\"saasPlanExpiryMsg\",\"saasOrderCurrentUsage\",\"saasCurrentOrders\",\"saasNoOrders\",\"saasPlanExpitedINRMsg\",\"saasTrialPlanExpiredMsg\",\"saasPlanExpiredViewInvoiceMsg\",\"saasPlanExpiredViewInvoices\",\"saasTrialExpired\",\"allocationLimitReached\",\"webAppHeaderMessage\",\"saasPlanExpiredMsgForce\", \"currentLocation\",\"fetching\",\"deliveryBoy\",\"distanceInKms\",\"eta\",\"orderNumber\",\"locationNotFound\",\"areYouSureChangeDrsOrder\",\"yes\",\"or\",\"no\",\"geofenceName\",\"avgDetentionMins\",\"maxDetentionMins\",\"trips\",\"speed\",\"lastTrackedDate\",\"batteryPercentage\",\"lastLocation\",\"vehicleNumber\",\"trackerId\",\"phoneNumber\",\"capacity\",\"orderNumber\",\"address\",\"startTime\",\"endTime\",\"dropMarkerOrderAllocation\",\"tripName\",\"locationType\",\"location\",\"position\",\"latitude\",\"longitude\",\"startDate\",\"endDate\",\"geofenceName\",\"radius\",\"createdOn\",\"name\",\"hub\",\"distance\",\"speed\",\"weight\",\"volume\",\"speed_label\",\"lowAlert\",\"highAlert\",\"units\",\"temperature\",\"odometer\",\"direction\",\"fuel\",\"ignition\",\"transferTime\",\"deliveryBoyName\",\"isManuallyAssignedFlTrue\",\"isManuallyAssignedFlFalse\",\"noDataChangesMessage\",\"invalidTemperatureMsg\",\"invalid\",\"Coordinates\",\"notAvailable\",\"contactNo\",\"customerName\",\"changePassword\",\"logout\",\"asyncVisitsPlanDone\",\"asyncPlanVisitsOptimized\",\"optimizingVisits\",\"processingVisits\",\"recentVisitPlans\",\"enterTripNo\",\"enterOrderNo\",\"currentPassword\",\"currentPasswordReqd\",\"newPassword\",\"newPasswordReqd\",\"newPasswordCharValidation\",\"confirmPassword\",\"confirmPasswordReqd\",\"passwordsDoNotMatch\",\"close\",\"save\",\"header_403\",\"content_403\",\"viewTours\",\"clickOnModulesTour\",\"selectTour\",\"noDataAvailable\",\"fetchingData\",\"onboarding\",\"dashboard\",\"vehicles\",\"deliveryBoy\",\"trips\",\"ordersPlanning\",\"orders\",\"alerts\",\"drivers\",\"trackers\",\"geofence\",\"addGeofence\",\"routes\",\"addRoutes\",\"click\",\"toSeeNextTour\",\"backToAdminConsole\",\"changeProfilePicture\",\"uploadNewPicture\",\"removeProfilePhoto\",\"next\",\"skipTour\",\"prev\",\"finish\",\"ALL\",\"STARTED\",\"NOTDISPATCHED\",\"ended\",\"INTRANSIT\",\"DELAYEDNOTDISPATCHED\",\"COMPLETED\",\"NOTCOMPLETED\",\"DELETED\",\"startLabel\",\"backToHome\",\"Tour\",\"INVALID_COUNTRY_CODE\",\"NOT_A_NUMBER\",\"TOO_LONG\",\"TOO_SHORT_AFTER_IDD\",\"TOO_SHORT_NSN\",\"numberNotValid\",\"numberPossibleNotValid\",\"numberNotValidForRegion\",\"pleaseSelectCountry\",\"notPhoneNumber\",\"watched\",\"pending\",\"asyncPlanRouteOptimized\",\"asyncPlanDone\",\"asyncPlanViewResults\",\"noDataAvailable\",\"planTrip\",\"fetchingData\",\"cancel\",\"cancelled\",\"completed\",\"recentOrderPlannings\",\"noRecentActivity\",\"showAll\",\"loading\",\"cancellationFailed\",\"tooLateToCancel\",\"scrollToViewPlanningHistory\",\"noMoreDataToLoad\",\"fetchingProgressDataFailed\",\"cancelConfirmation\",\"cancelConfirmationMsg\",\"noDontCancel\",\"yesCancelPlanning\",\"finishing\",\"calculatingDistances\",\"optimizingRoutes\",\"planningHasBeenCancelled\",\"view\",\"needHelpWatchTutorial\",\"needHelpWatchGif\",\"label_searchPlaceholder\",\"label_helpCenter\",\"label_Examples\",\"label_Results\",\"label_noResults\",\"label_Search\",\"label_popularQuestions\"]";
			System.out.println("strApplicationLabels: "+strApplicationLabels);
			Response structurePageModelResponse = given().when().headers(
					"client_secret_key", row.get("clientSecretKey"),
					"www-authenticate", "BASIC "+row.get("token"),
					"Content-Type","application/json")
					.body(strApplicationLabels)
					.post(strLabelAPI);

			String strLabelModel = structurePageModelResponse.getBody().asString();
			System.out.println("strLabelModel: "+strLabelModel);
			JsonParser parser = new JsonParser();
			JsonObject labelMap = parser.parse(strLabelModel).getAsJsonObject();
			System.out.println("labelMap : "+labelMap);

			app_PageLabels = labelMap;
			return true;
		}
		catch (Exception e) 
		{

			//Re-Execute once
			if (iTimesAPI_RecoveryPerformed < iMaxAPI_RecoveryAllowed)
			{
				iTimesAPI_RecoveryPerformed ++;
				waitForRandomSec(1);
				logMessage("Recover API", "Re-Execute API due to "+e.getMessage(), "Re-executing API", "Passed");
				rc = initApp_PageLabels (row);
				if (rc == true){
					return true;
				}
			}

			logMessage("Get Label Details", "Label Details should be fetched", "Label API response not fetched - "+e.getMessage(), "Failed");
			e.printStackTrace();
			return false;//null
		}
	}


	public String getLabel_PageLabelAPI (LinkedHashMap<String, String> row, String strLabelName){

		try 
		{

			//Get the auth token and Client Secret from from Auth API
			String strLabelAPI = row.get("URL") + // demo.loginextsolutions.com/
					"LoginApp/framework/label?labels=";

			System.out.println("Getting Label Structure - Label : "+strLabelAPI+" ");
			System.out.println("Headers \n"
					+ "client_secret_key:"+""+ row.get("clientSecretKey"));
			System.out.println("www-authenticate:"+""+ "BASIC "+row.get("token"));
			System.out.println("Content-Type:"+""+"application/json");

			if (app_PageLabels.has(strLabelName))
			{
				return app_PageLabels.get(strLabelName).getAsString();
			}

			//If not found in appPage_labels -> Hit label API and add it to app_PageLabels - 

			String strApplicationLabels = "[ \""+strLabelName+"\"]";
			System.out.println("strApplicationLabels: "+strApplicationLabels);
			Response structurePageModelResponse = given().when().headers(
					"client_secret_key", row.get("clientSecretKey"),
					"www-authenticate", "BASIC "+row.get("token"),
					"Content-Type","application/json")
					.body(strApplicationLabels)
					.post(strLabelAPI);

			String strLabelModel = structurePageModelResponse.getBody().asString();
			System.out.println("strLabelModel: "+strLabelModel);
			JsonParser parser = new JsonParser();
			JsonObject labelMap = parser.parse(strLabelModel).getAsJsonObject();
			System.out.println("labelMap : "+labelMap);
			String strLabel = labelMap.get(strLabelName).getAsString();
			if (strLabel == null){
				logMessage("Verify label value", "Label value should not be null", "Label value from Label API for '"+strLabelName+ "' is null, API URL : "+strLabelAPI, "Failed");
			}

			app_PageLabels.addProperty(strLabelName, strLabel);
			return strLabel;
		}
		catch (Exception e) 
		{

			if (iTimesAPI_RecoveryPerformed < iMaxAPI_RecoveryAllowed)
			{
				waitForRandomSec(1);
				iTimesAPI_RecoveryPerformed++;
				logMessage("Recover API", "Re-Execute API due to "+e.getMessage(), "Re-executing API", "Passed");
				String returnValue = getLabel_PageLabelAPI (row, strLabelName);
				System.out.println("returnValue: "+returnValue);
				if (returnValue != null)
				{
					return returnValue;
				}
			}

			logMessage("Get Label Details", "Label Details should be fetched", "Label API response not fetched - "+e.getMessage(), "Failed");
			e.printStackTrace();
			return null;//null
		}
	}


	/**
	 * Will call menu API and retrieve all menu labels
	 * @param row
	 * @return
	 */
	public boolean initApp_MenuItems (LinkedHashMap<String, String> row){

		try {

			//Get the auth token and Client Secret from from Auth API
			String strMenuAPI = row.get("URL") + // demo.loginextsolutions.com/
					"UserAccessApp/userAccess/get";

			System.out.println("Getting Label Structure - Label : "+strMenuAPI+" ");
			System.out.println("Headers \n"
					+ "client_secret_key:"+""+ row.get("clientSecretKey"));
			System.out.println("www-authenticate:"+""+ "BASIC "+row.get("token"));
			System.out.println("Content-Type:"+""+"application/json");

			Response structurePageModelResponse = given().when().headers(
					"client_secret_key", row.get("clientSecretKey"),
					"www-authenticate", "BASIC "+row.get("token"),
					"Content-Type","application/json")
					.get(strMenuAPI);

			String strMenulModel = structurePageModelResponse.getBody().asString();
			System.out.println("strMenulModel: "+strMenulModel);
			JsonParser parser = new JsonParser();
			JsonArray menuMap = parser.parse(strMenulModel).getAsJsonArray();
			app_MenuLabels = menuMap;
			return true;
		}
		catch (Exception e) 
		{
			if (iTimesAPI_RecoveryPerformed < iMaxAPI_RecoveryAllowed)
			{
				iTimesAPI_RecoveryPerformed++;
				logMessage("Recover API", "Re-Execute API due to "+e.getMessage(), "Re-executing API", "Passed");
				rc = initApp_MenuItems (row);
				if (rc == true)
				{
					return true;
				}
			}

			logMessage("Get Menu Details", "Menu Details should be fetched", "UserAccessApp/userAccess/get API details not fetched - "+e.getLocalizedMessage(), "Failed");
			e.printStackTrace();
			return false;//null
		}
	}


	/**
	 * Will call getByTypeAndId API and retrieve all NOTDELIVERED Reasons / CANCELREASONS  / RETURNREASONS etc
	 * @param row
	 * @return
	 */
	public ArrayList <String> initApp_getByTypeAndId (String strKeyName){

		try {

			ArrayList <String> list = new ArrayList <String> ();

			//Get the auth token and Client Secret from from Auth API
			LinkedHashMap<String, String> row = getTempData();

			String strMenuAPI = row.get("URL") + // demo.loginextsolutions.com/
					"ClientApp/client/getByTypeAndId?type="+strKeyName;// CANCELREASONS";

			System.out.println("Getting Label Structure - Label : "+strMenuAPI+" ");
			System.out.println("Headers \n"
					+ "client_secret_key:"+""+ row.get("clientSecretKey"));
			System.out.println("www-authenticate:"+""+ "BASIC "+row.get("token"));
			System.out.println("Content-Type:"+""+"application/json");

			Response structurePageModelResponse = given().when().headers(
					"client_secret_key", row.get("clientSecretKey"),
					"www-authenticate", "BASIC "+row.get("token"),
					"Content-Type","application/json")
					.get(strMenuAPI);

			String strMenulModel = structurePageModelResponse.getBody().asString();
			System.out.println("strMenulModel: "+strMenulModel);
			JsonParser parser = new JsonParser();
			JsonArray reasons = parser.parse(strMenulModel).getAsJsonArray();
			//app_MenuLabels = menuMap;
			for (int i = 0; i < reasons.size(); i++) 
			{
				JsonElement currentElem = reasons.get(i);
				String strReason = currentElem.getAsJsonObject().get("name").getAsString();
				list.add(strReason);
			}

			return list;
		}
		catch (Exception e) 
		{
			logMessage("Get NotDeliveredReasons", "NotDeliveredReasons API should be fetched", "Not Delivered Reasons API details not fetched : "+e.getLocalizedMessage(), "Failed");
			e.printStackTrace();
			return null;//null
		}
	}



	/**
	 * Statuses are customized for each client 
	 * this function Will get back the JsonMapping for the statuses - return angular.element(document.body).injector("common").get("statusMappings")
	 * Below are status mappings
	 * {NOTDISPATCHED=Not Dispatched, PICKEDUP=Picked Up, DELIVERED=Delivered, NOTDELIVERED=Attempted Delivery, DELIVERYLOCATION=Delivery Location, NOTPICKEDUP=Attempted Pickup, ENDED=Ended, FORWARD=Forward, RTM=RTM, CANCELLED=Cancelled, DELIVER=Delivery, PICKUPLOCATION=Pickup Location, NOTSTARTED=Not Started, STARTED=Started, PICKUP=Pickup, REVERSE=Reverse, INTRANSIT=Intransit}
	 * CANCELLED:"Cancelled"
		DELIVER:"Delivery"
		DELIVERED:"Delivered"
		DELIVERYLOCATION:"Delivery Location"
		ENDED:"Ended"
		FORWARD:"Forward"
		INTRANSIT:"Intransit"
		NOTDELIVERED:"Attempted Delivery"
		NOTDISPATCHED:"Not Dispatched"
		NOTPICKEDUP:"Attempted Pickup"
		NOTSTARTED:"Not Started"
		PICKEDUP:"Picked Up"
		PICKUP:"Pickup"
		PICKUPLOCATION:"Pickup Location"
		REVERSE:"Reverse"
		RTM:"RTM"
		STARTED:"Started"
	 * @param strStatusMapping
	 * @return
	 */
	public String initApp_getOrderStatusMappings (String strStatusMapping){
		String strScript = "return angular.element(document.body).injector(\"common\").get(\"statusMappings\")";
		try 
		{
			JavascriptExecutor js = (JavascriptExecutor)driver;
			Map<String, Object>return_value = (Map<String, Object>) js.executeScript(strScript);
			return return_value.get(strStatusMapping).toString();
		}
		catch (Exception e) 
		{
			logMessage("Get Order Statuses", "Dynamic Order Status mapping should be fetched from application", "Unable to fetch order status mapping, Failed to execute JS Script : "+strScript, "Failed");
			e.printStackTrace();
			return null;
		}
	}


	/**
	 * Will return the custom name present in menu for the customers
	 * for Main menus
	 * Pass the below keywords associated for menus 
	 * home - Dashboard
	 * order - Order / Task
	 * Resource - Resource / Fleet
	 * Trip Planning - Trip Planning 
	 * Beat - Beat Planning
	 * report - Reports
	 * 
	 * Sub Menus - Use logi-analytics attribute for object identification
	 * trip - Trips
	 * deliveryMedium - Delivery Boy / Custodian
	 * deliveryPlanning - Tasks Planning
	 * Outlet - Outlets

	 * getMenuName - get API
	 * @param strMenuName 
	 * @return
	 */
	public String getMenuName (String strMenuName)
	{
		try {

			if (app_MenuLabels == null){
				System.out.println("Menu map is undefined please assign a menu map by using 'initApp_MenuItems' method..");
				initApp_MenuItems(this.dataMap);//row object
				//return null;
			}

			//Get the menu name from the map present...
			String jsonPath = "$..[?(@.url=='"+strMenuName+"')].name";//"$..[?(@.name=='"+strMenuName+"')]";
			System.out.println("Finding Menu Item - "+jsonPath);
			String strElementStructure = JsonPath.read(app_MenuLabels.toString(), jsonPath).toString();//new JsonPath(strOrdersPageStructure).get(jsonPath);//JsonPath.read(strOrdersPageStructure, "$..[?(@.id=\""+strElementIdentifier+"\")]");
			System.out.println("strElementStructure : "+strElementStructure);

			//Get current element attributes
			JsonParser parser = new JsonParser();
			JsonElement currentElementAttributes = parser.parse(strElementStructure.toString()).getAsJsonArray().get(0);//allElements.getValue();
			String strMenuItemString = currentElementAttributes.toString();
			/*if (strMenuItemString.length() > 15){
				strMenuItemString = strMenuItemString.substring(0, 14)  + "...";
				System.out.println("Truncating Menu String back to 15 chars. strMenuItemString: "+strMenuItemString);
			}*/
			return strMenuItemString;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}



	public String getStructure_OrderListView (String strMenuName)
	{
		try {
//
			//https://demo.loginextsolutions.com/LoginApp/framework/structure?modelName=ORDERS&pageName=ORDERS&sectionName=ALL_ORDER_LIST_VIEW
			LinkedHashMap <String, String> row = getTempData();

			//Get the auth token and Client Secret from from Auth API
			String strMenuAPI = row.get("URL") + // demo.loginextsolutions.com/
					"LoginApp/framework/structure?modelName=ORDERS&pageName=ORDERS&sectionName=ALL_ORDER_LIST_VIEW";

			if (row.get("clientSecretKey") == null){
				row = getAuthDetailsWeb(row);
			}

			System.out.println("Getting Order List - Label Structure - Label : "+strMenuAPI+" ");
			System.out.println("Headers \n"
					+ "client_secret_key:"+""+ row.get("clientSecretKey"));
			System.out.println("www-authenticate:"+""+ "BASIC "+row.get("token"));
			System.out.println("Content-Type:"+""+"application/json");

			Response structurePageModelResponse = given().when().headers(
					"client_secret_key", row.get("clientSecretKey"),
					"www-authenticate", "BASIC "+row.get("token"),
					"Content-Type","application/json")
					.get(strMenuAPI);

			String strMenulModel = structurePageModelResponse.getBody().asString();
			System.out.println("strMenulModel: "+strMenulModel);
			JsonParser parser = new JsonParser();
			JsonObject menuMap = parser.parse(strMenulModel).getAsJsonObject();

			//Get the menu name from the map present...
			String jsonPath = "$..[?(@.id=='"+strMenuName+"')].label";//"$..[?(@.name=='"+strMenuName+"')]";
			System.out.println("Finding Grid Label - "+jsonPath);
			String strElementStructure = JsonPath.read(menuMap.toString(), jsonPath).toString();//new JsonPath(strOrdersPageStructure).get(jsonPath);//JsonPath.read(strOrdersPageStructure, "$..[?(@.id=\""+strElementIdentifier+"\")]");
			System.out.println("strElementStructure : "+strElementStructure); //["Order No."]
			
			JsonElement currentElementAttributes = parser.parse(strElementStructure.toString()).getAsJsonArray().get(0);//allElements.getValue();
			String strMenuItemString = currentElementAttributes.getAsString();
			System.out.println("strMenuItemString: "+strMenuItemString);
			
			//return "";//Not sure why did I send in false response
			return strMenuItemString;//Should have been this line
		} catch (Exception e) {///

			if (iTimesAPI_RecoveryPerformed <= iMaxAPI_RecoveryAllowed)
			{
				iTimesAPI_RecoveryPerformed ++;
				logMessage("Performing API Recovery", "API should be responded", "Invoking API again for Error : "+e.getMessage(), "Passed");
				waitForRandomSec(1);
				
				//Invoke the function again to get the page structure
				String strResponse = getStructure_OrderListView (strMenuName);
				if (strResponse != null && strResponse.equals("") == false){
					return strResponse;
				}//Else fail the test//

			}
			e.printStackTrace();
			return null;
		}
	}


	//structure?modelName=TRIPS&pageName=TRIPS&sectionName=ALL_TRIPS_LIST_VIEW

	/**
	 * Will fetch JsonOutput for structure API
	 * @param strModelName - TRIPS
	 * @param strPageName - TRIPS
	 * @param strSectionName - ALL_TRIPS_LIST_VIEW
	 * @return
	 */
	public JsonObject getStructureAPI (
			String strModelName,
			String strPageName, 
			String strSectionName)
	{
		JsonObject structure = null;

		//https://demo.loginextsolutions.com/LoginApp/framework/structure?modelName=ORDERS&pageName=ORDERS&sectionName=ALL_ORDER_LIST_VIEW
		LinkedHashMap <String, String> row = getTempData();

		//Get the auth token and Client Secret from from Auth API
		String strAPI = null;

		try {
			strAPI = row.get("URL") + // demo.loginextsolutions.com/
					"LoginApp/framework/structure?"
					+ "modelName="+strModelName
					+ "&pageName="+strPageName
					+ "&sectionName="+strSectionName;

			if (row.get("clientSecretKey") == null){
				row = getAuthDetailsWeb(row);
			}

			System.out.println("Getting strAPI : "+strAPI+" ");
			System.out.println("Headers \n"
					+ "client_secret_key:"+""+ row.get("clientSecretKey"));
			System.out.println("www-authenticate:"+""+ "BASIC "+row.get("token"));
			System.out.println("Content-Type:"+""+"application/json");

			Response structurePageModelResponse = given().when().headers(
					"client_secret_key", row.get("clientSecretKey"),
					"www-authenticate", "BASIC "+row.get("token"),
					"Content-Type","application/json")
					.get(strAPI);

			String strMenulModel = structurePageModelResponse.getBody().asString();
			System.out.println("strMenulModel: "+strMenulModel);
			JsonParser parser = new JsonParser();
			structure = parser.parse(strMenulModel).getAsJsonObject();

			return structure;
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			logMessage("Get Structure API", "Response from structure API should be fetched", "Unable to get structure API Details - "+e.getLocalizedMessage()+" URL : "+strAPI, "Failed");
			return null;
		}
	}


	/**
	 * https://demo.loginextsolutions.com/ClientApp/clientnode/list?pageNumber=1&pageSize=50&searchBy=
	 * @param strPgNumber
	 * @param strPgSize
	 * @return
	 */
	public JsonObject getGeoCodingListView_API (
			String strPgNumber, 
			String strPgSize)
	{
		JsonObject structure = null;
		try {

			//https://demo.loginextsolutions.com/LoginApp/framework/structure?modelName=ORDERS&pageName=ORDERS&sectionName=ALL_ORDER_LIST_VIEW
			LinkedHashMap <String, String> row = getTempData();

			//Get the auth token and Client Secret from from Auth API
			String strAPI = row.get("URL") + // demo.loginextsolutions.com/
					"ClientApp/clientnode/list?pageNumber="+strPgNumber+"&pageSize="+strPgSize+"&searchBy=";

			if (row.get("clientSecretKey") == null){
				row = getAuthDetailsWeb(row);
			}

			System.out.println("Getting strAPI : "+strAPI+" ");
			System.out.println("Headers \n"
					+ "client_secret_key:"+""+ row.get("clientSecretKey"));
			System.out.println("www-authenticate:"+""+ "BASIC "+row.get("token"));
			System.out.println("Content-Type:"+""+"application/json");

			Response structurePageModelResponse = given().when().headers(
					"client_secret_key", row.get("clientSecretKey"),
					"www-authenticate", "BASIC "+row.get("token"),
					"Content-Type","application/json")
					.get(strAPI);

			String strMenulModel = structurePageModelResponse.getBody().asString();
			System.out.println("strMenulModel: "+strMenulModel);
			JsonParser parser = new JsonParser();
			structure = parser.parse(strMenulModel).getAsJsonObject();

			return structure;
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			logMessage("Get Structure API", "Response from structure API should be fetched", "Unable to get structure API Details - "+e.getLocalizedMessage(), "Failed");
			return null;
		}
	}


	/// http://10.124.92.41/VehicleApp/vehicle/fmlm/list?pageNumber=1&pageSize=50
	public JsonObject getVehicleListView_API (
			String strPgNumber, 
			String strPgSize)
	{
		JsonObject structure = null;
		String strAPI = "";
		try {

			//https://demo.loginextsolutions.com/LoginApp/framework/structure?modelName=ORDERS&pageName=ORDERS&sectionName=ALL_ORDER_LIST_VIEW
			LinkedHashMap <String, String> row = getTempData();

			//Get the auth token and Client Secret from from Auth API
			strAPI = row.get("URL") + // demo.loginextsolutions.com/
					"VehicleApp/vehicle/fmlm/list?"
					+ "pageNumber="+strPgNumber
					+"&pageSize="+strPgSize;

			if (row.get("clientSecretKey") == null){
				row = getAuthDetailsWeb(row);
			}

			System.out.println("Getting strAPI : "+strAPI+" ");
			System.out.println("Headers \n"
					+ "client_secret_key:"+""+ row.get("clientSecretKey"));
			System.out.println("www-authenticate:"+""+ "BASIC "+row.get("token"));
			System.out.println("Content-Type:"+""+"application/json");

			Response structurePageModelResponse = given().when().headers(
					"client_secret_key", row.get("clientSecretKey"),
					"www-authenticate", "BASIC "+row.get("token"),
					"Content-Type","application/json")
					.get(strAPI);

			String strMenulModel = structurePageModelResponse.getBody().asString();
			System.out.println("strMenulModel: "+strMenulModel);
			JsonParser parser = new JsonParser();
			structure = parser.parse(strMenulModel).getAsJsonObject();

			return structure;
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			logMessage("Get List View API", "Response from API should be fetched", "Unable to get data from list view API Error - "+e.getLocalizedMessage()+" API URL : "+strAPI, "Failed");
			return null;
		}
	}

	//http://10.124.92.41/				 DeliveryMediumApp/deliverymedium/fmlm/list?pageNumber=1&pageSize=50
	//https://demo.loginextsolutions.com/DeliveryMediumApp/deliverymedium/fmlm/list?pageNumber=1&pageSize=50
	public JsonObject getDeliveryBoyListView_API (
			String strPgNumber, 
			String strPgSize)
	{
		JsonObject structure = null;

		//Get the auth token and Client Secret from from Auth API
		String strAPI = "";

		try {
			//https://demo.loginextsolutions.com/LoginApp/framework/structure?modelName=ORDERS&pageName=ORDERS&sectionName=ALL_ORDER_LIST_VIEW
			LinkedHashMap <String, String> row = getTempData();

			strAPI = row.get("URL") + // demo.loginextsolutions.com/
					"DeliveryMediumApp/deliverymedium/fmlm/list?"
					+ "pageNumber="+strPgNumber
					+"&pageSize="+strPgSize;

			if (row.get("clientSecretKey") == null){
				row = getAuthDetailsWeb(row);
			}

			System.out.println("Getting strAPI : "+strAPI+"");
			System.out.println("Headers \n"
					+ "client_secret_key:"+""+ row.get("clientSecretKey"));
			System.out.println("www-authenticate:"+""+ "BASIC "+row.get("token"));
			System.out.println("Content-Type:"+""+"application/json");

			Response structurePageModelResponse = given().when().headers(
					"client_secret_key", row.get("clientSecretKey"),
					"www-authenticate", "BASIC "+row.get("token"),
					"Content-Type","application/json")
					.post(strAPI);

			String strMenulModel = structurePageModelResponse.getBody().asString();
			System.out.println("strMenulModel: "+strMenulModel);
			JsonParser parser = new JsonParser();
			structure = parser.parse(strMenulModel).getAsJsonObject();

			return structure;
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			logMessage("Get List View API", "Response from API should be fetched", "Re-Executing - Unable to get data from list view API Error - "+e.getLocalizedMessage()+" API URL : "+strAPI, "Passed");
			waitForRandomSec(1);
			if (iTimesAPI_RecoveryPerformed < iMaxAPI_RecoveryAllowed)
			{
				JsonObject deliveryMediumListView = getDeliveryBoyListView_API(strPgNumber,strPgSize);
				System.out.println("deliveryMediumListView: "+deliveryMediumListView);

				//Validate resultset
				if (deliveryMediumListView != null)
				{
					System.err.println("Fetched data...");
					return deliveryMediumListView;
				}
			}
			
			logMessage("Get List View API", "Response from API should be fetched", "Unable to get data from list view API Error - "+e.getLocalizedMessage()+" API URL : "+strAPI, "Failed");
			return null;
		}
	}

	/**
	 * Will return column label given column id for Trips List view structure
	 * @param strMenuName
	 * @return
	 */
	public String getStructure_AllTrips_ListView (String strMenuName)
	{
		try {

			JsonObject menuMap = getStructureAPI("TRIPS", "TRIPS", "ALL_TRIPS_LIST_VIEW");
			Assert.assertNotNull(menuMap);

			//Get the menu name from the map present...
			String jsonPath = "$..[?(@.id=='"+strMenuName+"')].label";//"$..[?(@.name=='"+strMenuName+"')]";
			System.out.println("Finding Grid Label - "+jsonPath);
			String strElementStructure = JsonPath.read(menuMap.toString(), jsonPath).toString();//new JsonPath(strOrdersPageStructure).get(jsonPath);//JsonPath.read(strOrdersPageStructure, "$..[?(@.id=\""+strElementIdentifier+"\")]");
			System.out.println("strElementStructure : "+strElementStructure);

			return "";
		}
		catch (Exception e) 
		{
			if (iTimesAPI_RecoveryPerformed <= iMaxAPI_RecoveryAllowed)
			{
				logMessage("Recover API", "Should be able to recover API", "Trying to re-execute API due to "+e.getMessage(), "Passed");
				String strTripsListView = getStructure_AllTrips_ListView(strMenuName);
				if (strTripsListView != null && strTripsListView.equals("") == false)
				{
					return strTripsListView;
				}
			}
			e.printStackTrace();
			return null;
		}
	}


	/**
	 * 
	 * @param strMenuName
	 * @return
	 */
	public JsonObject getDataset_AllTrips_ListView (
			String strPageNumber,
			String strPageSize,
			String strStatus
			)
	{
		try {

			//https://demo.loginextsolutions.com/LoginApp/framework/structure?modelName=ORDERS&pageName=ORDERS&sectionName=ALL_ORDER_LIST_VIEW
			LinkedHashMap <String, String> row = getTempData();

			//Get the auth token and Client Secret from from Auth API
			String strMenuAPI = row.get("URL") + // demo.loginextsolutions.com/
					"TripApp/trip/lmfm/triplist"
					+ "?pageNumber="+strPageNumber//1
					+ "&pageSize="+strPageSize//50"
					+ "&status="+strStatus;//ALL";

			if (row.get("clientSecretKey") == null){
				row = getAuthDetailsWeb(row);
			}

			System.out.println("Getting Order List - : "+strMenuAPI+" ");
			System.out.println("Headers \n"
					+ "client_secret_key:"+""+ row.get("clientSecretKey"));
			System.out.println("www-authenticate:"+""+ "BASIC "+row.get("token"));
			System.out.println("Content-Type:"+""+"application/json");

			Response structurePageModelResponse = given().when().headers(
					"client_secret_key", row.get("clientSecretKey"),
					"www-authenticate", "BASIC "+row.get("token"),
					"Content-Type","application/json")
					.get(strMenuAPI);

			String strDataset = structurePageModelResponse.getBody().asString();
			System.out.println("strDataset: "+strDataset);
			JsonParser parser = new JsonParser();
			JsonObject responseData = parser.parse(strDataset).getAsJsonObject();
			int status = responseData.get("status").getAsInt();
			if (status != 200)
			{
				logMessage("Verify response status", "Dataset should be fetched", "Unable to fetch trips dataset from API", "Failed");
				return null;
			}
			return responseData;
		} catch (Exception e) {

			e.printStackTrace();
			if (iTimesAPI_RecoveryPerformed <= iMaxAPI_RecoveryAllowed)
			{
				logMessage("API Recovery - "+iTimesAPI_RecoveryPerformed, "Should be able to perform API Recovery", "Perform API Recovery due to "+e.getMessage(), "Passed");
				JsonObject resultData = getDataset_AllTrips_ListView (strPageNumber, strPageSize, strStatus);
				if (resultData != null)
				{
					return resultData;
				}
			}

			logMessage("Verify Trips Dataset API", "API Response should be fetched", "Failed to fetch API Response - TripApp/trip/lmfm/triplist - "+e.getLocalizedMessage(), "Failed");
			return null;
		}
	}


	/**
	 * 
	 * @param authDetails with Client Secret Key and Token
	 * @param strUrlPageStructureAPI - https://demo.loginextsolutions.com/LoginApp/framework/structure?modelName=ORDERS&pageName=ORDERS&sectionName=ADD_ORDER_FORM
	 * @return
	 */
	public JsonElement getOrderPageStructure (
			LinkedHashMap <String, String> authDetails, 
			String strUrlPageStructureAPI
			){
		try {

			System.out.println("Getting Page Structure - strUrlPageStructureAPI : "+strUrlPageStructureAPI+" ");
			System.out.println("Headers \n"
					+ "client_secret_key:"+""+ authDetails.get("clientSecretKey"));
			System.out.println("www-authenticate:"+""+ "BASIC "+authDetails.get("token"));
			System.out.println("Content-Type:"+""+"application/json");


			Response structurePageModelResponse = null;
			try {
				structurePageModelResponse =
						given().when().headers(
								"client_secret_key", authDetails.get("clientSecretKey"),
								"www-authenticate", "BASIC "+authDetails.get("token"),
								"Content-Type","application/json")
						.get(strUrlPageStructureAPI);
			} catch (Exception e) {
				structurePageModelResponse =
						given().when().headers(
								"client_secret_key", authDetails.get("clientSecretKey"),
								"www-authenticate", "BASIC "+authDetails.get("token"),
								"Content-Type","application/json")
						.get(strUrlPageStructureAPI);
			}

			String strOrderPageModel = structurePageModelResponse.getBody().asString();
			System.out.println("strOrderPageModel: "+strOrderPageModel);
			JsonParser parser = new JsonParser();
			JsonElement pageStructureModel = parser.parse(strOrderPageModel);
			return pageStructureModel;
		} catch (Exception e) {

			if (iTimesAPI_RecoveryPerformed <= iMaxAPI_RecoveryAllowed)
			{
				iTimesAPI_RecoveryPerformed ++;
				logMessage("Performing API Recovery - "+iTimesAPI_RecoveryPerformed, "API should be responded", "Invoking API again for Error : "+e.getMessage(), "Passed");

				//Invoke the function again to get the page structure
				JsonElement pageStructure = getOrderPageStructure(authDetails, strUrlPageStructureAPI);
				if (pageStructure != null && pageStructure.getAsJsonObject().size() != 0){
					return pageStructure;
				}//Else fail the test
			}

			logMessage("Get Page Structure from API", "Should be able to fetch details about page structure", "Unable to fetch details about page strcture", "Failed");
			e.printStackTrace();
			return null;
		}
	}

	public boolean getApplicationProperties (LinkedHashMap <String,String> row){
		String strPropertiesUrl = "";
		try {
			strPropertiesUrl = row.get("URL") + "ClientApp/client/property/list?propertyKey=DATEFORMAT,BASECURRENCY,DESKTOPNOTIFICATION,TRIPMODEL,PAYMENTTRANSACTIONBUFFER,AWBGENERATIONMETHOD,CRATESTRUCTURE,TRIPMODEL,VEHICLESELECT";
			Response structurePageModelResponse = given().when().headers(
					"propertyKey","DATEFORMAT,BASECURRENCY,DESKTOPNOTIFICATION,TRIPMODEL,PAYMENTTRANSACTIONBUFFER,AWBGENERATIONMETHOD,CRATESTRUCTURE,TRIPMODEL,VEHICLESELECT",
					"client_secret_key", row.get("clientSecretKey"),
					"www-authenticate", "BASIC "+row.get("token"),
					"Content-Type","application/json")
					.get(strPropertiesUrl);

			String strResponseBody = structurePageModelResponse.getBody().asString();
			JsonParser parser = new JsonParser();
			JsonElement responseJson = parser.parse(strResponseBody);
			JsonArray clientPropertiesData = responseJson.getAsJsonObject().get("data").getAsJsonArray();
			System.out.println("Finding dateformat...");
			rc = false;
			for (int i = 0; i < clientPropertiesData.size(); i++) 
			{
				JsonElement currentPropertyData = clientPropertiesData.get(i);
				String strPropertyKey = currentPropertyData.getAsJsonObject().get("propertyKey").getAsString();
				String strPropertyValue = currentPropertyData.getAsJsonObject().get("propertyValue").getAsString();
				System.out.println(strPropertyKey+": "+strPropertyValue);
				if (strPropertyKey.equals("DATEFORMAT"))
				{
					row.put("DATEFORMAT", strPropertyValue);
					updateTempData(row);
					rc = true;
					break;
				}
			}

			return rc;
		}
		catch (Exception e) 
		{
			e.printStackTrace();

			//Try to re-execute API Call again to avoid exceptions
			if (iTimesAPI_RecoveryPerformed <= iMaxAPI_RecoveryAllowed)
			{
				iTimesAPI_RecoveryPerformed++;
				logMessage("Recover API - "+iTimesAPI_RecoveryPerformed, "Should be able to recover API", "Trying to re-execute API because of "+e.getMessage(), "Passed");
				rc = getApplicationProperties(row);
				if (rc == true){
					return true;
				}
			}

			logMessage("Get Application properties", "Application Properties like, Curreny/Dateformat should be fetched", "Unable to fetch applciation properties : URL : "+strPropertiesUrl+" Error : "+e.getMessage(), "Failed");

			return false;
		}
	}


	/**
	 * Will return the client properties JsonObject when passed in a key for Client - http://10.124.92.41/ClientApp/client/property?propertyKey=CRATESTRUCTURE
	 * @param row
	 * @return
	 */
	public JsonObject getClientProperties (String strPropertyName){
		String strPropertiesUrl = "";
		try {
			LinkedHashMap <String,String> row = getTempData();
			strPropertiesUrl = 
					row.get("URL") + "ClientApp/client/property?propertyKey="+strPropertyName;//CRATESTRUCTURE
			Response structurePageModelResponse = given().when().headers(
					"client_secret_key", row.get("clientSecretKey"),
					"www-authenticate", "BASIC "+row.get("token"),
					"Content-Type","application/json")
					.get(strPropertiesUrl);

			String strResponseBody = structurePageModelResponse.getBody().asString();
			System.out.println("strResponseBody: "+strResponseBody);
			JsonParser parser = new JsonParser();
			JsonElement responseJson = parser.parse(strResponseBody);
			JsonObject clientPropertiesData = responseJson.getAsJsonObject();
			return clientPropertiesData;

		} catch (Exception e) {
			if (iTimesAPI_RecoveryPerformed < iMaxAPI_RecoveryAllowed)
			{
				//ReInvoke the same function
				iTimesAPI_RecoveryPerformed ++ ;
				waitForRandomSec(1);
				logMessage("Recover API", "Should be able to recover API", "Trying to re-execute API because of API Error "+e.getMessage(), "Passed");
				JsonObject obj_rc = getClientProperties(strPropertyName);
				if (obj_rc != null)
				{
					System.out.println("Fetched data - return...");
					return obj_rc;
				}
			}
			
			logMessage("Get Client properties", "Client Properties like, CrateDetails should be fetched", "Unable to fetch client properties : URL : "+strPropertiesUrl, "Failed");
			e.printStackTrace();
			return null;
		}
	}

	public List <WebElement> udsGetOrderList (WebDriver driver){

		try {
			String strOrderNumberXPath = "//*[@logi-google-analytics='Orders - Open order history']";
			/*
			rc = clickElementByXPath(strOrderNumberXPath, "Order Number");
			Assert.assertTrue(rc);
			 */
			List <WebElement> allOrderList = driver.findElements(By.xpath(strOrderNumberXPath));
			TimeUnit.SECONDS.sleep(5);
			return allOrderList;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	public boolean setOrderPageSize_old (){

		try 
		{

			//Change Page size to 25
			int iPageSize = 25;
			int iTotalOrders = 0;
			int iCtr = 0;
			do {
				iTotalOrders = udsGetOrderList (driver).size();//
				System.out.println(iCtr + " Loading Total Orders : "+iTotalOrders);

				//Refresh page after some interval
				if (iCtr % 5 == 0){
					driver.navigate().refresh();
				}

				if (iCtr > 30){
					rc = false;
					break;
				}
				iCtr ++;
				TimeUnit.SECONDS.sleep(3);

			}while (iTotalOrders <= 0);

			if (rc == false){
				logMessage("Page load", "Verify elements on order page", "No orders appeared on order page", "Failed");
				return false;
			}

			//Get the date range - Will be in GMT String
			String strElementXPath = "//*[@id='orderHeaderDateRange']";
			String strOrderHeaderDateRange = getAttributeByXPath(strElementXPath, "Date Header Range", "value");//getElementTextByXPath(strElementXPath, "Date Range Header");
			System.out.println("strOrderHeaderDateRange: "+strOrderHeaderDateRange);
			String strDateFrom = "";
			String strDateTo = "";
			if (strOrderHeaderDateRange != null 
					&& strOrderHeaderDateRange.contains(" - ")){
				String dateRange [] = strOrderHeaderDateRange.split(" - ");
				strDateFrom = dateRange [0].trim();
				strDateTo = dateRange [1].trim();
			}
			LinkedHashMap<String, String> row = getTempData();

			//Hit List View API for that date range - Will be in GMT String
			String strDateFormat = row.get("DATEFORMAT");
			SimpleDateFormat sdfSourceFormat = new SimpleDateFormat(strDateFormat);
			SimpleDateFormat sdfOutputFormat = new SimpleDateFormat("yyyy-MM-dd");

			Date startDate;
			Date endDate;
			try {
				startDate = sdfSourceFormat.parse(strDateFrom);
				endDate = sdfSourceFormat.parse(strDateTo);
			} catch (ParseException e) {
				e.printStackTrace();
				return false;
			}

			String strOrderStartDate = sdfOutputFormat.format(startDate) + " 00:00:00";
			String strOrderEndDate = sdfOutputFormat.format(endDate) + " 23:59:59";

			JsonArray orderResults = getOrderListViewAPI(strOrderStartDate, strOrderEndDate, "1" +"", "50", "ALL", null, null);
			System.out.println("orderResults: "+orderResults);


			//Set Page size = 25 - //select[@name="pageSize"]//option[@value='25']
			String strPagesizeDropdownXPath = "//*[@id='pagination-dropdown']";//"//select[@name='pageSize']";  //option[@value='25']";
			//Select selectPageDropDown =new Select (driver.findElement(By.xpath(strPagesizeDropdownXPath)));
			//selectPageDropDown.selectByValue(""+iPageSize);//"25");
			rc = clickElementByXPath(strPagesizeDropdownXPath, "Page Size");
			Assert.assertTrue(rc);

			String strPageSizeOption = "//ul[@aria-labelledby='pagination-dropdown']//a[contains (text(),'"+iPageSize+"')]";
			rc = clickElementByXPath(strPageSizeOption, "Page Size Option");
			Assert.assertTrue(rc);

			//Wait for order column to appear
			//rc = udsWaitForOrdersInListView (iPageSize);//
			//Assert.assertTrue(rc);//

			return rc;
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			logMessage("Set Page size", "Should be able to set page size", "Unable to set page size", "Failed");
			return false;
		}

	}
	

	public boolean setOrderPageSize (){

		try 
		{

			//Change Page size to 25
			int iPageSize = 25;
			int iTotalOrders = 0;
			int iCtr = 0;
			do {
				iTotalOrders = udsGetOrderList (driver).size();//
				System.out.println(iCtr + " Loading Total Orders : "+iTotalOrders);

				//Refresh page after some interval
				if (iCtr % 5 == 0){
					driver.navigate().refresh();
				}

				if (iCtr > 30){
					rc = false;
					break;
				}
				iCtr ++;
				TimeUnit.SECONDS.sleep(3);

			}while (iTotalOrders <= 0);

			if (rc == false){
				logMessage("Page load", "Verify elements on order page", "No orders appeared on order page", "Failed");
				return false;
			}

			//Get the date range - Will be in GMT String
			String strElementXPath = "//*[@id='orderHeaderDateRange']";
			String strOrderHeaderDateRange = getAttributeByXPath(strElementXPath, "Date Header Range", "value");//getElementTextByXPath(strElementXPath, "Date Range Header");
			System.out.println("strOrderHeaderDateRange: "+strOrderHeaderDateRange);
			String strDateFrom = "";
			String strDateTo = "";
			if (strOrderHeaderDateRange != null 
					&& strOrderHeaderDateRange.contains(" - ")){
				String dateRange [] = strOrderHeaderDateRange.split(" - ");
				strDateFrom = dateRange [0].trim();
				strDateTo = dateRange [1].trim();
			}
			LinkedHashMap<String, String> row = getTempData();

			//Hit List View API for that date range - Will be in GMT String
			String strDateFormat = row.get("DATEFORMAT");
			SimpleDateFormat sdfSourceFormat = new SimpleDateFormat(strDateFormat);
			SimpleDateFormat sdfOutputFormat = new SimpleDateFormat("yyyy-MM-dd");

			Date startDate;
			Date endDate;
			try {
				startDate = sdfSourceFormat.parse(strDateFrom);
				endDate = sdfSourceFormat.parse(strDateTo);
			} catch (ParseException e) {
				e.printStackTrace();
				return false;
			}

			String strOrderStartDate = sdfOutputFormat.format(startDate) + " 00:00:00";
			String strOrderEndDate = sdfOutputFormat.format(endDate) + " 23:59:59";

			JsonArray orderResults = getOrderListViewAPI(strOrderStartDate, strOrderEndDate, "1" +"", "50", "ALL", null, null);
			System.out.println("orderResults: "+orderResults);

			TimeUnit.SECONDS.sleep(7);
			
			//update - do not set the page size
			//Set Page size = 25 - //select[@name="pageSize"]//option[@value='25']
			//String strPagesizeDropdownXPath = "//*[@id='pagination-dropdown']";//"//select[@name='pageSize']";  //option[@value='25']";
			//Select selectPageDropDown =new Select (driver.findElement(By.xpath(strPagesizeDropdownXPath)));
			//selectPageDropDown.selectByValue(""+iPageSize);//"25");
			//rc = clickElementByXPath(strPagesizeDropdownXPath, "Page Size");
			//Assert.assertTrue(rc);

			//String strPageSizeOption = "//ul[@aria-labelledby='pagination-dropdown']//a[contains (text(),'"+iPageSize+"')]";
			//rc = clickElementByXPath(strPageSizeOption, "Page Size Option");
			//Assert.assertTrue(rc);

			//Wait for order column to appear
			//rc = udsWaitForOrdersInListView (iPageSize);//
			//Assert.assertTrue(rc);//

			return rc;
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			logMessage("Set Page size", "Should be able to set page size", "Unable to set page size", "Failed");
			return false;
		}

	}

	public boolean udsEnterBranchName (String strBranchName){
		try 
		{
			String strBranchNameSelect = "//div[@id='id-branch-name']";
			String strBranchTextBox = "//div[@id='id-branch-name']/input";
			clickElementByXPath(strBranchNameSelect, "Branch Name Textbox");
			rc = sendKeys(strBranchTextBox, strBranchName, "Branch Name Textbox", true);
			String strOptionText = strBranchNameSelect + "//div[.='"+strBranchName+"']";
			rc = clickElementByXPath(strOptionText, "Option - "+strBranchName);
			Assert.assertTrue(rc);

			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}




	public void close(){
		try 
		{

			Configuration configurationProperties = Configuration.getConfigurationInstance();
			String strExecutionMode = configurationProperties.getExecutionMode();

			if (strExecutionMode.equals("CI")){
				System.out.println("Exiting remote browsers");
				driver.close();
				driver.quit();	

				//Firefox Has Issues with closing the browser sessions, Use docker restart selenium-firefox-debug-node0 - Follow #966 - https://github.com/mozilla/geckodriver/issues/966 
			}
			else {
				System.out.println("Exiting local browsers");
				driver.close();
				driver.quit();	
			}
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			System.err.println("Unable to close driver session...");
		}
	}


	/**
	 * Function to add vehicle object...
	 * @param row - testdataMap Object
	 */
	@Deprecated
	public boolean addVehicle_old (LinkedHashMap<String, String> row) 
	{

		try 
		{
			String strXPath = "";
			if (! isApplicationLaunched)
			{
				rc = launchApplication (row);
				if (rc == false){
					return false;
				}

				rc = login (row);
				if (rc == false){
					return false;
				}

				//Wait for Dashboard to load
				strXPath = "//*[@id='dashboard_cm']";///¬1/*[text()='Resource']";
				waitForELement(strXPath);
				//TimeUnit.SECONDS.sleep(10);

				isApplicationLaunched = true;
			}

			//Click Resource
			strXPath = "//*[text()='Resource']";
			rc = clickElementByXPath (strXPath, "Resources Menu");
			if (rc == false){
				return false;
			}

			//Click Vehicle
			strXPath = "//*[text()='Vehicle']";////*[text()='Resource']";
			rc = clickElementByXPath(strXPath, "Vehicle");
			if (rc == false){
				return false;
			}

			//Click Add Button - //*[contains (@class,'icon-add')]
			strXPath = "//*[contains (@class,'icon-add')]"; //"//*[contains (@class,'icon-add')]" ; //"//*[@class='logi-icon icon-Product-Icons_Add']";//"//*[contains (@class,'icon-add')]";////*[text()='Resource']";
			rc = clickElementByXPath(strXPath, "Add Button");
			if (rc == false){
				return false;
			}

			//Enter Branch Name - LMDMumbai - id="id-branch-name" // input - select
			String strBranchName = "LMDMumbai";
			rc = udsEnterBranchName(strBranchName);
			Assert.assertTrue(rc);

			//Enter Vehicle Type - id="id-type-of-vehicle" // input - select
			String strVehicleTypeDropdownXPath = "//*[@id='id-type-of-vehicle']";
			String strVehicleTypeDropdownValue = "4 Wheeler";
			rc = udsSelectLM_Dropdown(strVehicleTypeDropdownXPath, "Vehicle Type", strVehicleTypeDropdownValue);
			Assert.assertTrue(rc);
			row.put("VehicleType", strVehicleTypeDropdownValue);

			//Enter vehicle number - id="id-vehicle-number" // input 
			String strVehicleNumber = //"MH396509651";
					"MH"+getUniqueIntegerValue(9);
			String strVehicleNumberXPath = "//*[@id='id-vehicle-number']";
			rc = sendKeys(strVehicleNumberXPath, strVehicleNumber, "Vehicle Number", true);
			Assert.assertTrue(rc);
			row.put("VehicleNumber", strVehicleNumber);

			//Enter Make - id="id-make" - input
			String strVehicleMake = "Van";
			String strVehicleMakeXPath = "//*[@id='id-make']";
			rc = sendKeys(strVehicleMakeXPath, strVehicleMake, "Vehicle make", true);
			Assert.assertTrue(rc);

			//Enter Model - id="id-model" - input 
			String strVehicleModel = "Tempo";
			String strVehicleModelXPath = "//*[@id='id-model']";
			rc = sendKeys(strVehicleModelXPath, strVehicleModel, "Vehicle Model", true);
			Assert.assertTrue(rc);

			//Enter Unladen Weight - id="id-unladen-weight-(#@#weight#@#)"
			String strVehicleUnladenWt = "1000";
			String strVehicleUnladenWtXPath = "//*[@id='id-unladen-weight-(#@#weight#@#)']";
			rc = sendKeys(strVehicleUnladenWtXPath, strVehicleUnladenWt, "Vehicle Unladen Wt", true);
			Assert.assertTrue(rc);
			row.put("VehicleUnladenWt", strVehicleUnladenWt);

			//Enter Capacity Units - id="id-capacity"
			String strVehicleCapacityUnits = "500";
			String strVehicleCapacityUnitsXPath = "//*[@id='subId-units']";
			rc = sendKeys(strVehicleCapacityUnitsXPath, strVehicleCapacityUnits, "Vehicle capacity units", true);
			Assert.assertTrue(rc);
			row.put("VehicleCapacityUnits", strVehicleCapacityUnits);

			//Enter Weights - id="subId-weight"
			String strsubIdWeight = "1000";
			String strsubIdWeightXPath = "//*[@id='subId-weight']";
			rc = sendKeys(strsubIdWeightXPath, strsubIdWeight, "Vehicle Weight", true);
			Assert.assertTrue(rc);
			row.put("VehicleCapacityWtKgs", strsubIdWeight);

			//Enter Volume - id="subId-volume" 
			String strVehilcleVolume = "33";
			String strVehilcleVolumeXPath = "//*[@id='subId-volume']";
			rc = sendKeys(strVehilcleVolumeXPath, strVehilcleVolume, "Vehicle Volume", true);
			Assert.assertTrue(rc);
			row.put("VehicleCapacityVolumeCC", strVehilcleVolume);

			//Enter Chasis Number - id="id-chassis-number" - C0234567
			String strVehicleChasisNumber = "C"+getUniqueIntegerValue(9);
			String strVehilcleChasisNumberXPath = "//*[@id='id-chassis-number']";
			rc = sendKeys(strVehilcleChasisNumberXPath, strVehicleChasisNumber, "Vehicle Chasis Number", true);
			Assert.assertTrue(rc);

			//Enter Engine Number - id="id-engine-number" - E0234567
			String strVehicleEngineNumber = "E"+getUniqueIntegerValue(9);
			String strVehicleEngineXPath = "//*[@id='id-engine-number']";
			rc = sendKeys(strVehicleEngineXPath, strVehicleEngineNumber, "Vehicle Engine Number", true);
			Assert.assertTrue(rc);

			//Optional - Enter Marker Name - id="id-marker-name"
			String strMarkerNameValue = "M"+getUniqueIntegerValue(9);
			String strMarkerNameXPath = "//*[@id='id-marker-name']";
			rc = sendKeys(strMarkerNameXPath, strMarkerNameValue, "Marker Name", true);
			Assert.assertTrue(rc);

			//Enter Vehicle Permit - id="id-vehicle-permit" //input - 
			String strVehiclePermitSelectXPath = "//*[@id='id-vehicle-permit']";//*[@id="id-vehicle-permit"]//ul//a

			List <WebElement> allOptions = getAllElementsFromSelect(strVehiclePermitSelectXPath, "Vehicle Permit");
			if (allOptions.size() == 0)
			{
				System.err.println("No option availalble to select from dropdown...");
				return false;
			}
			else
			{

				//Get first Option WebElement
				System.out.println(allOptions.size() +""+allOptions.toArray().toString());
				WebElement option = allOptions.get(0);
				System.out.println("Clicking Option Name : "+option.getText());
				String strOptionToSelect = option.getText();

				//Click on the Option
				rc = udsSelectLM_Dropdown(strVehiclePermitSelectXPath, "Vehicle Permit", strOptionToSelect);
				Assert.assertTrue(rc);
			}

			//Enter Registration Number - id="id-registration-number-&-copy"  - R[AUTOGEN]
			String strRegistrationNumberXPath =   "//input[@id='id-registration-number-&-copy']";
			String strRegistrationNumberValue = "R"+ getUniqueIntegerValue(5);
			rc = sendKeys(strRegistrationNumberXPath, strRegistrationNumberValue, "Registration Copy", true);
			Assert.assertTrue(rc);

			//Upload File - input type = file - id="id-registration-copy"
			String strFileName = "testRegistrationCopy.pdf";
			String strFileText = "Registration Copy";//
			String strFilePath = createTempFile(strFileName, strFileText);
			String strRegistrationCopyFileUploadValue = strFilePath; //"";
			String strRegistrationCopyFileUploadXPath = "//input[@id='id-registration-copy']";
			rc = sendKeysFile(strRegistrationCopyFileUploadXPath, strRegistrationCopyFileUploadValue, "Registration Copy - File Upload", true);
			Assert.assertTrue(rc);

			//Enter PUC Validity Textbox - //*[@name="pucValidity"] - 14/02/2018
			String strPUCValidityXPath = "//*[@name='pucValidity']";
			String strPUCValidityValue = "14/02/2025";
			rc = setValueByJavascript(driver, strPUCValidityXPath, "PUC Validity", strPUCValidityValue);
			Assert.assertTrue(rc);

			//Upload PUC Validation Copy - File - id="id-puc-validity-copy"
			strFileName = "testPUCValidityCopy.pdf";
			strFileText = "PUC Validity Copy";
			strFilePath = createTempFile(strFileName, strFileText);
			String strPUCValidityFileValue = strFilePath; //"";
			String strPUCValidityFileUploadXPath = "//input[@id='id-puc-validity-copy']";
			rc = sendKeysFile (strPUCValidityFileUploadXPath, strPUCValidityFileValue, "PUC Validity Copy", true);
			Assert.assertTrue(rc);

			//Enter Insaurance Validity - //*[@name="insuranceValidity"] - 14/02/2018
			String strInsauranceValidityXPath = "//*[@name='insuranceValidity']";
			String strInsauranceValidityValue = "14/02/2025";
			rc = setValueByJavascript(driver, strInsauranceValidityXPath, "Insaurance Validity", strInsauranceValidityValue);
			Assert.assertTrue(rc);

			//Upload File - Type = file, name="insuranceCopy"
			strFileName = "testInsauranceCopy.pdf";
			strFileText = "Insauance Copy";
			strFilePath = createTempFile(strFileName, strFileText);
			String strInsauranceCopyFileValue = strFilePath; //"";
			String strInsauranceCopyFileUploadXPath = "//input[@name='insuranceCopy']";
			rc = sendKeysFile (strInsauranceCopyFileUploadXPath, strInsauranceCopyFileValue, "Insaurance Copy", true);
			Assert.assertTrue(rc);

			//Enter Owner Name - id="id-owner-name"
			String strOwnerNameXPath = "//*[@id='id-owner-name']";
			String strOwnerValue = "AutoTestOwner_"+getUniqueIntegerValue(5);
			rc = sendKeys(strOwnerNameXPath, strOwnerValue, "Owner Name", true);
			Assert.assertTrue(rc);

			//Vehicle Production Year - text - id="id-vehicle-production-year"
			/*String strVehicleProductionYearXPath = "//*[@id='id-vehicle-production-year']";
			String strVehicleProductionYearValue = "2009";
			rc = sendKeys(strVehicleProductionYearXPath, strVehicleProductionYearValue, "Vehicle Production Year", true);
			Assert.assertTrue(rc);*/

			//Vehicle Purchase Date - text - id="id-vehiclePurchaseDate"
			/*String strVehiclePurchaseDate = "//*[@id='id-vehiclePurchaseDate']";
			String strPurchaseDateValue = "20/08/2012";
			rc = setValueByJavascript(driver, strVehiclePurchaseDate, "Vehicle Purchase Date", strPurchaseDateValue);
			Assert.assertTrue(rc);*/

			//Enter Vehicle Ownership - id="id-ownership"
			String strVehicleOwnershipXPath = "//*[@id='id-ownership']";
			String strVehicleOwnershipValue ="Vendor";// "Company";
			rc = udsSelectLM_Dropdown(strVehicleOwnershipXPath, "Vehicle Ownership", strVehicleOwnershipValue);
			Assert.assertTrue(rc);

			//if Vehicle Ownership = Vendor
			System.out.println("strVehicleOwnershipValue : "+strVehicleOwnershipValue);
			if (strVehicleOwnershipValue != null && strVehicleOwnershipValue.equalsIgnoreCase("Vendor")){
				//Enter Rented Start Date - id="rentStartDate" 
				String strRentedStartDateValue = strGetCurrentDate("dd/MM/yyyy", 0);
				String strRentedStartDateXPath = "//*[@id='rentStartDate']"; 
				rc = setValueByJavascript(driver, strRentedStartDateXPath, "Rented Start Date", strRentedStartDateValue);
				Assert.assertTrue(rc);

				//Enter Rented End Date - id="rentEndDate" 
				String strRentedEndDateValue = strGetCurrentDate("dd/MM/yyyy", 60);
				String strRentedEndDateXPath = "//*[@id='rentEndDate']"; 
				rc = setValueByJavascript(driver, strRentedEndDateXPath, "Rented End Date", strRentedEndDateValue);
				Assert.assertTrue(rc);

			}

			//Enter Financer - id="id-financer"
			String strFinancerXPath = "//*[@id='id-financer']";
			String strFinancerValue = "Financer "+getUniqueIntegerValue(5);
			rc = sendKeys(strFinancerXPath, strFinancerValue, "Financer", true);
			Assert.assertTrue(rc);

			//Enter Transporter - id="id-transporter"
			String strTransporterXPath = "//*[@id='id-transporter']";
			String strTransporterValue = "Transporter "+getUniqueIntegerValue(5);
			rc = sendKeys(strTransporterXPath, strTransporterValue, "Transporter", true);
			Assert.assertTrue(rc);

			//Enter Accident History - text - id="id-accident-history-(160-characters-limit)"
			String strAccidentHistoryXPath = "//*[@id='id-accident-history-(160-characters-limit)']";
			String strAccidentHistoryValue = "None";
			rc = sendKeys(strAccidentHistoryXPath, strAccidentHistoryValue, "Accident History", true);
			Assert.assertTrue(rc);


			TimeUnit.SECONDS.sleep(2);

			//Enter Save Button 
			String strSaveButtonXPath = "//button[@class='save']";
			rc = clickElementByXPath (strSaveButtonXPath, "Save Button");
			Assert.assertTrue(rc);

			//Get text from Prompt Message on success or failiure - //*[@id='js-prompt']
			String strPromptXPath = "//*[@id='js-prompt']";
			String strPromptValue = "";

			//Get Text from Prompt
			strPromptValue = getElementTextByXPath(strPromptXPath, "Prompt");
			if (strPromptValue != null && strPromptValue.toLowerCase().contains("vehicle created successfully"))
			{
				logMessage("Verify Success Message", "Success Message - Vehicle created successfully should display", "Message : "+strPromptValue+" is displayed", "Passed");
			}
			else
			{
				logMessage("Verify Success Message", "Success Message - Vehicle created successfully should display", "Message : "+strPromptValue+" is displayed, Unable to create an order", "Failed");
				return false;
			}
			/*
			//Click on edit button for that searched vehicle id - #vehicleId-13131 - //*[@id='vehicleId-13131' and contains (@class, 'edit')]
			String strVehicleEditButtonXPath = "//*[@id='"+strVehicleID+"' and contains (@class, 'edit')]";
			WebElement editButton = driver.findElement(By.xpath(strVehicleEditButtonXPath));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].style.display = 'block';", editButton);
			rc = clickElementByXPath(strVehicleEditButtonXPath, "Edit Button - Vehicle - "+strVehicleNumber);
			Assert.assertTrue(rc);

			//wait for page having vehicle details element - //*[text()='Vehicle Details']
			String strVehicleDetailsElement = "//*[text()='Vehicle Details']";
			rc = clickElementByXPath(strVehicleDetailsElement, "Vehicle Details");
			Assert.assertTrue(rc);

			 */

			/*			
			rc = updateVehicleNumber(strVehicleNumber, row);
			Assert.assertTrue(rc);
			 */			
			//Validate Details for Vehicle Number


		}
		catch (Exception e)
		{
			e.printStackTrace();
			logMessage("Verify addition of a delivery boy", "Delivery boy should be added", "Unable to add delivery boy", "Failed");
			return false;
		}		
		finally {
			updateTempData (row);
		}
		return true;
	}




	/**
	 * Function to add vehicle object...
	 * @param row - testdataMap Object
	 */
	public LinkedHashMap<String, String> addDeliveryBoyTest (LinkedHashMap<String, String> row) 
	{

		try 
		{
			String strXPath = "";
			if (! isApplicationLaunched)
			{
				rc = launchApplication (row);
				Assert.assertTrue(rc);

				rc = login (row);
				Assert.assertTrue(rc);

				//Get login API auth key and client secret
				row = getAuthDetailsWeb (row);
				Assert.assertNotNull(row);

				//Wait for Dashboard to load
				strXPath = "//*[@id='dashboard_cm']";///¬1/*[text()='Resource']";
				waitForELement(strXPath);
				//TimeUnit.SECONDS.sleep(10);

				isApplicationLaunched = true;
			}


			//Get login API auth key and client secret
			row = getAuthDetailsWeb (row);
			Assert.assertNotNull(row);

			//Get Application Label - key value pairs
			rc = initApp_PageLabels(row);
			Assert.assertTrue(rc);

			//Get page menu items
			rc = initApp_MenuItems(row);
			Assert.assertTrue(rc);

			//Click Resource
			String strResourcesLabel = getMenuName("Resource");//Orders also reffered to as Tasks
			strXPath = "//*[text()="+strResourcesLabel+"]";
			rc = clickElementByXPath (strXPath, "Resources Menu");
			Assert.assertTrue(rc);

			//Click Vehicle
			String strDeliveryBoy= getMenuName("deliveryMedium");
			strXPath = "//*[text()="+strDeliveryBoy+"]";
			rc = clickElementByJavascript(driver, strXPath, "Delivery Medium Menu");//clickElementByXPath(strXPath, "Delivery Medium Menu");
			Assert.assertTrue(rc);

			TimeUnit.SECONDS.sleep(5);

			/*
			//Click Resource
			strXPath = "//*[text()='Resource']";
			rc = clickElementByXPath (strXPath, "Resources Menu");
			if (rc == false){
				return false;
			}

			//Click Delivery Boy
			String strDeliveryBoyMenuItem = "//*[text()='Delivery Boy']";
			rc = clickElementByXPath(strDeliveryBoyMenuItem, "Delivery Boy");
			Assert.assertTrue(rc);*/

			//Click Add Button - //*[contains (@class,'icon-add')]
			String strAddButton = "//*[@logi-google-analytics='Delivery Associate - Add']";//"//*[contains (@class,'icon-add')]"; // "//*[@class='logi-icon icon-Product-Icons_Add']";// "//*[contains (@class,'icon-add')]";
			rc = clickElementByXPath(strAddButton, "Add Button");
			Assert.assertTrue(rc);

			//Get page structure
			String strPageStructureRequestURL = "LoginApp/framework/structure?pageName=DELIVERYMEDIUM&sectionName=ADD_DELIVERY_MEDIUM_FORM&modelName=DELIVERYMEDIUM";// "LoginApp/framework/structure?pageName=VEHICLE&sectionName=ADD_VEHICLE_FORM&modelName=VEHICLE";
			JsonElement pageStructure = getOrderPageStructure(row, row.get("URL")+strPageStructureRequestURL);//"LoginApp/framework/structure?modelName=ORDERS&pageName=ORDERS&sectionName=ADD_ORDER_FORM");
			if (pageStructure == null || pageStructure.getAsJsonObject().size() == 0){
				return null;
			}
			String strOrdersPageStructure = pageStructure.toString();
			System.out.println("strOrdersPageStructure: "+strOrdersPageStructure);

			//Fetch Order Page Specific TestData
			//String strSheetName = "DataMap";
			String strPageName = "DeliveryBoy_Page";//"Vehicle_Page";//"Orders_Page";
			LinkedHashMap <String, String> pageDataMap = getPageObjects(row, strPageName); // ReadExcel2.readSortedTestDataMap(strSheetName, strPageName);

			//Perform substitution of keywords or functions like AUTOGEN / DATE / BOOLEAN / INTEGER / DECIMAL etc from DataSheet with actual values,
			updateTempData(row);
			pageDataMap = substituteDataMapKeywords (pageDataMap);
			System.out.println("pageDataMap: "+pageDataMap);

			//On Success put entries in hashMap
			row.put("db.employeeId", pageDataMap.get("db.employeeId"));
			row.put("db.deliveryMediumMasterName", pageDataMap.get("db.deliveryMediumMasterName"));
			row.put("db.userName", pageDataMap.get("db.userName"));
			row.put("db.capacityInUnits", pageDataMap.get("db.capacityInUnits"));
			row.put("db.capacityInVolume", pageDataMap.get("db.capacityInVolume"));
			row.put("db.capacityInWeight", pageDataMap.get("db.capacityInWeight"));

			updateTempData(row);

			//Enter Data on orders page//
			rc = enterValues (pageDataMap, strOrdersPageStructure);
			Assert.assertTrue(rc);

			//Click Save Button 
			String strSaveButton = "//*[@logi-google-analytics='Delivery Associate Add - Save']";//"//button[@type='submit' and text()='Save']";
			rc = clickElementByXPath(strSaveButton, "Save Button");
			Assert.assertTrue(rc);

			String strExpectedPromptValue = app_PageLabels.has("create.deliverymedium.success") ? app_PageLabels.get("create.deliverymedium.success").getAsString() : "";
			if (strExpectedPromptValue == null || strExpectedPromptValue.equals("")){
				logMessage("Verify create.deliverymedium.success Label", "create.deliverymedium.success Label should be defined", "Label - create.deliverymedium.success is not defined", "Failed");
			}
			String strJSPromptXPath = "//*[@id='js-prompt']";
			rc = waitForJS_PromptMessageJS(strExpectedPromptValue, strJSPromptXPath);
			if (rc)
			{
				logMessage("Verify Success Message", "Success Message - "+strExpectedPromptValue+" Successfully should display", "Message : "+strExpectedPromptValue+" is displayed", "Passed");
			}
			else
			{
				String strPromptValue =	getPromptElementTextByXPath(strJSPromptXPath, "JS Prompt");//"";
				logMessage("Verify Success Message", "Success Message - "+strExpectedPromptValue+" should display", "Success Message is not displayed, Unable to create a delivery boy, Expecting Message : "+strExpectedPromptValue+" Actual : "+strPromptValue, "Failed");

				//when success is not displayed - Navigate back to orders page and fail the test
				//navigateToDeliveryBoyPage(row);
				return null;
			}



			return pageDataMap;
		}
		catch (Exception e)
		{
			e.printStackTrace();
			logMessage("Verify addition of a delivery boy", "Delivery boy should be added", "Unable to add delivery boy", "Failed");
			return null;
		}		
		finally {
			//updateTempData (row);
		}
	}

	/**
	 * 
	 * @param strOutputFormat 
	 * 		Eg -  "dd/MM/yyyy"
	 * 			  "yyyy/MM/dd HH:mm:ss"
	 * @return
	 */
	public String strGetCurrentDate (String strOutputFormat, long iTotalDaysToAddOrSubtract){
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(strOutputFormat);//"yyyy/MM/dd HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now(); 
		now = now.plusDays(iTotalDaysToAddOrSubtract);
		System.out.println(dtf.format(now));
		String strDateTimeFormat = dtf.format(now);
		return strDateTimeFormat;
	}

	public String createTempFile (String strFileName, String strFileTextContent)
	{
		//String strRegistrationCopyFilePath = "testRegistrationCopy.pdf";
		try {
			//Create a temp file 
			File f = new File(strFileName);
			if (f.exists() == false){
				f.createNewFile();
			}
			PrintWriter out = new PrintWriter( f );
			out.print(strFileTextContent);//"Registration Copy");
			out.flush();
			out.close();
			System.out.println("Created Test file - Name : "+strFileName+ " with Path "+f.getAbsolutePath());
			return f.getAbsolutePath();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	public List<WebElement> getAllElementsFromSelect (String strDropDownSelectXPath, String strDropdownName) {
		try 
		{
			List <WebElement> allElements = null;
			rc = clickElementByXPath(strDropDownSelectXPath+"//input" ,strDropdownName);

			int iCtr = 0;
			do {
				allElements = driver.findElements(By.xpath(strDropDownSelectXPath+"//ul//a"));
				if (iCtr > 30){
					break;
				}
				rc = clickElementByXPath(strDropDownSelectXPath+"//input", strDropdownName);
				iCtr ++;
			}while (allElements == null || allElements.size() > 0);

			if (allElements == null){
				logMessage("Get total elements from dropdown", "Should be able to fetch total elements present in dropdown "+strDropdownName, "No options found to select from dropdown - "+strDropdownName, "Failed");
				return null;
			}

			return allElements;
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			logMessage("Get total elements from dropdown", "Should be able to fetch total elements present in dropdown", "No elements found in dropdown - "+strDropdownName, "Failed");
			return null;
		}
	}

	/**
	 * Will update global data LinkedHashMap of Key Value pairs 
	 * @param row
	 */
	public void updateTempData (LinkedHashMap<String, String> row) 
	{
		this.dataMap = row;
	}

	public LinkedHashMap <String, String> getTempData ()
	{
		return this.dataMap;
	}

	private boolean validateGivenValues (String strValidationName, String strExpected, String strActual, boolean isNumberComparision) 
	{
		try {

			if (isNumberComparision){
				strExpected = strExpected.replaceAll(",", "");
				strActual = strActual.replace(",", "");
				try {

					double dExpected = Double.parseDouble(strExpected);
					double dActual = Double.parseDouble(strActual);

					strExpected = dExpected + "";
					strActual = dActual + "";
				} catch (NumberFormatException e) {
					logMessage("Validate values", strValidationName+" should be equal to "+strExpected, "Unable to compare numeric values - failed to convert string to numbers, Expected = "+strExpected+", Actual = "+strActual , "Failed");
					e.printStackTrace();
					return false;
				}

			}

			if (strExpected != null && strExpected.toLowerCase().trim().equals(strActual.toLowerCase().trim())){
				logMessage("Validate values", strValidationName+" should be equal to "+strExpected, "Actual value displayed - : "+strActual+", Expected : "+strExpected, "Passed");
				return true;
			}
			else {
				logMessage("Validate values", strValidationName+" should be equal to "+strExpected, "Actual value displayed - : "+strActual + ", Expected : "+strExpected, "Failed");
				return false;
			}
		} catch (Exception e) {
			logMessage("Validate values", strValidationName+" should be equal to "+strExpected, "Unable to compare values", "Failed");
			return false;
		}
	}

	public boolean updateVehicleNumber_old (String strVehicleNumber, LinkedHashMap<String , String> row) {

		try 
		{
			System.out.println("Updating - Vehicle Number...");

			String strXPath = "";

			//strVehicleNumber = "MH097450568";

			// if application is not launched
			if (isApplicationLaunched == false) 
			{
				rc = launchApplication (row);
				if (rc == false){
					return false;
				}

				rc = login (row);
				if (rc == false){
					return false;
				}

				//Wait for Dashboard to load
				strXPath = "//*[@id='dashboard_cm']";///¬1/*[text()='Resource']";
				waitForELement(strXPath);
				//TimeUnit.SECONDS.sleep(10);
				isApplicationLaunched = true;
			}

			String strVehicleID = udsVehicleSearch (strVehicleNumber);
			if (strVehicleID == null)
			{
				//System.out.println("Error in searching with vehicle number - "+strVehicleNumber);
				return false;
			}

			//Click on edit button for that searched vehicle id - #vehicleId-13131 - //*[@id='vehicleId-13131' and contains (@class, 'edit')]
			String strVehicleEditButtonXPath = "//*[@id='"+strVehicleID+"' and contains (@class, 'edit')]";
			WebElement editButton = driver.findElement(By.xpath(strVehicleEditButtonXPath));
			showWebElement (editButton);
			rc = clickElementByXPath(strVehicleEditButtonXPath, "Edit Button - Vehicle - "+strVehicleNumber);
			Assert.assertTrue(rc);

			//wait for page having vehicle details element - //*[text()='Vehicle Details']
			String strVehicleDetailsElement = "//*[text()='Vehicle Details']";
			rc = clickElementByXPath(strVehicleDetailsElement, "Vehicle Details");
			Assert.assertTrue(rc);

			//Wait for vehicle number to get populated with the number we provided
			String strVehicleNumberXPath = "//*[@id='id-vehicle-number']";
			rc = waitForVehicleDataPopulation (strVehicleNumber, strVehicleNumberXPath);

			//Update Vehicle Number - Add Character one - //*[@id='id-vehicle-number']
			strVehicleNumber = strVehicleNumber + "1";
			rc = setValueByJavascript(driver, strVehicleNumberXPath, "Vehicle Number", "");
			rc = sendKeys(strVehicleNumberXPath, strVehicleNumber, "Vehicle Number", true);
			Assert.assertTrue(rc);
			row.put("VehicleNumber", strVehicleNumber);

			//Update Capacity in Units by one - //*[@id='subId-units']
			String strVehicleCapacityUnitsXPath = "//*[@id='subId-units']";
			String strVehicleCapacityUnits = getAttributeByXPath (strVehicleCapacityUnitsXPath, "Capacty in Units", "value");//getElementTextByXPath(strVehicleCapacityUnitsXPath, "Capacty in Units");

			try {
				if (strVehicleCapacityUnits == null || 
						strVehicleCapacityUnits.equals("")){
					strVehicleCapacityUnits = "0";
				}
				int dNumber = Integer.parseInt(strVehicleCapacityUnits);
				dNumber += 1;
				strVehicleCapacityUnits = dNumber + "";
			} catch (Exception e) {
				logMessage("Update Capacity in Units", "Capacity in Units should be updated", "Unable to update Capcity in Units - Number format error, Current Vehicle Capacity Units = "+strVehicleCapacityUnits, "Failed");
				e.printStackTrace();
				return false;
			}

			//Clear Vehicle Capacity existing value
			rc = setValueByJavascript(driver, strVehicleCapacityUnitsXPath, "Vehicle Capacity", "");
			Assert.assertTrue(rc);

			//Update Vehicle Capacity 
			rc = sendKeys(strVehicleCapacityUnitsXPath, strVehicleCapacityUnits, "Vehicle capacity units", true);
			Assert.assertTrue(rc);
			row.put("VehicleCapacityUnits", strVehicleCapacityUnits);

			//Update Capacity in Kgs by one - "//*[@id='subId-weight']"
			String strsubIdWeightXPath = "//*[@id='subId-weight']";
			String strsubIdWeight = getAttributeByXPath(strsubIdWeightXPath, "Capcaity Kgs", "value");

			try {
				double dNumber = Double.parseDouble(strsubIdWeight);
				dNumber += 1;
				strsubIdWeight = dNumber + "";
			} catch (Exception e) {
				e.printStackTrace();
				logMessage("Update Capacity in Kgs", "Capacity in Kgs should be updated", "Unable to update Capcity in Kgs - Number format error, Current Capacity in Kgs = "+strsubIdWeight, "Failed");
				return false;
			}

			//Clear Vehicle Wt value
			rc = setValueByJavascript(driver, strsubIdWeightXPath, "Vehicle Wt", "");
			Assert.assertTrue(rc);

			rc = sendKeys(strsubIdWeightXPath, strsubIdWeight, "Vehicle Weight", true);
			Assert.assertTrue(rc);
			row.put("VehicleCapacityWtKgs", strsubIdWeight);

			//Clear Vehicle Wt value
			String strVehilcleVolumeXPath = "//*[@id='subId-volume']";

			//Update Capacity in CC by one - //*[@id='subId-volume']
			String strVehilcleVolume = getAttributeByXPath(strVehilcleVolumeXPath, "Vehicle Volumne", "value");
			try {
				double dNumber = Double.parseDouble(strVehilcleVolume);
				dNumber += 1;
				strVehilcleVolume = dNumber + "";
			} catch (Exception e) {
				logMessage("Update Capacity in CC", "Capacity in CC should be updated", "Unable to update Capcity in CC - Number format error, Current Capacity in CC = "+strsubIdWeight, "Failed");
				return false;
			}
			rc = setValueByJavascript(driver, strVehilcleVolumeXPath, "Vehicle Volume", "");
			Assert.assertTrue(rc);

			rc = sendKeys(strVehilcleVolumeXPath, strVehilcleVolume, "Vehicle Volume", true);
			Assert.assertTrue(rc);
			row.put("VehicleCapacityVolumeCC", strVehilcleVolume);

			//Enter Make - id="id-make" - input
			String strVehicleMakeXPath = "//*[@id='id-make']";
			String strVehicleMake = getAttributeByXPath(strVehicleMakeXPath, "Make", "value");
			rc = setValueByJavascript(driver, strVehicleMakeXPath, "Vehicle make", "");
			strVehicleMake = strVehicleMake + "_Update";
			rc = sendKeys(strVehicleMakeXPath, strVehicleMake, "Vehicle make", true);
			Assert.assertTrue(rc);

			//Enter Model - id="id-model" - input 
			String strVehicleModelXPath = "//*[@id='id-model']";
			String strVehicleModel = getAttributeByXPath(strVehicleModelXPath, "Vehicle Model", "value");
			rc = setValueByJavascript(driver, strVehicleModelXPath, "Vehicle Model", "");
			strVehicleModel = strVehicleModel + "_Update";
			rc = sendKeys(strVehicleModelXPath, strVehicleModel, "Vehicle Model", true);
			Assert.assertTrue(rc);

			//Enter Unladen Weight - id="id-unladen-weight-(#@#weight#@#)"
			String strVehicleUnladenWtXPath = "//*[@id='id-unladen-weight-(#@#weight#@#)']";
			String strVehicleUnladenWt = getAttributeByXPath(strVehicleUnladenWtXPath, "Vehicle Unladen Wt", "value"); //"1000";
			rc = setValueByJavascript(driver, strVehicleUnladenWtXPath, "Vehicle Unladen Wt", "");
			strVehicleUnladenWt = strVehicleUnladenWt + "1";
			rc = sendKeys(strVehicleUnladenWtXPath, strVehicleUnladenWt, "Vehicle Unladen Wt", true);
			Assert.assertTrue(rc);
			row.put("VehicleUnladenWt", strVehicleUnladenWt);

			//Enter Chasis Number - id="id-chassis-number" - C0234567
			String strVehilcleChasisNumberXPath = "//*[@id='id-chassis-number']";
			String strVehicleChasisNumber = getAttributeByXPath(strVehilcleChasisNumberXPath, "Chasis Number", "value");
			rc = setValueByJavascript(driver, strVehilcleChasisNumberXPath, "Chasis Number", "");
			strVehicleChasisNumber = strVehicleChasisNumber + "1";
			rc = sendKeys(strVehilcleChasisNumberXPath, strVehicleChasisNumber, "Vehicle Chasis Number", true);
			Assert.assertTrue(rc);

			//Enter Engine Number - id="id-engine-number" - E0234567
			String strVehicleEngineXPath = "//*[@id='id-engine-number']";
			String strVehicleEngineNumber = getAttributeByXPath(strVehicleEngineXPath, "Engine Number", "value");//"E"+getUniqueIntegerValue(9);
			rc = setValueByJavascript(driver, strVehicleEngineXPath, "Engine Number", "");
			strVehicleEngineNumber = strVehicleEngineNumber + "1";
			rc = sendKeys(strVehicleEngineXPath, strVehicleEngineNumber, "Vehicle Engine Number", true);
			Assert.assertTrue(rc);

			//Optional - Enter Marker Name - id="id-marker-name"
			String strMarkerNameXPath = "//*[@id='id-marker-name']";
			String strMarkerNameValue = getAttributeByXPath(strMarkerNameXPath, "Marker Name", "value");//"M"+getUniqueIntegerValue(9);
			rc = setValueByJavascript(driver, strMarkerNameXPath, "Marker Name", "");
			strMarkerNameValue = strMarkerNameValue + "1";
			rc = sendKeys(strMarkerNameXPath, strMarkerNameValue, "Marker Name", true);
			Assert.assertTrue(rc);

			//Enter Vehicle Permit - id="id-vehicle-permit" //input - 
			String strVehiclePermitSelectXPath = "//*[@id='id-vehicle-permit']";//*[@id="id-vehicle-permit"]//ul//a

			List <WebElement> allOptions = getAllElementsFromSelect(strVehiclePermitSelectXPath, "Vehicle Permit");
			if (allOptions.size() < 3)
			{
				System.err.println("No option availalble to update Vehicle Permit from dropdown...");
			}
			else
			{
				//Get first Option WebElement
				System.out.println(allOptions.size() +""+allOptions.toArray().toString());
				WebElement option = allOptions.get(2);
				System.out.println("Clicking Option Name : "+option.getText());
				String strOptionToSelect = option.getText();

				//Click on the Option
				rc = udsSelectLM_Dropdown(strVehiclePermitSelectXPath, "Vehicle Permit", strOptionToSelect);
				Assert.assertTrue(rc);
			}

			//Enter Registration Number - id="id-registration-number-&-copy"  - R[AUTOGEN]
			String strRegistrationNumberXPath =   "//input[@id='id-registration-number-&-copy']";
			String strRegistrationNumberValue = getAttributeByXPath(strRegistrationNumberXPath, "Registration Number", "value");//"R"+ getUniqueIntegerValue(5);
			strRegistrationNumberValue = strRegistrationNumberValue + "1";
			rc = setValueByJavascript(driver, strRegistrationNumberXPath,  "Registration Number", "");
			rc = sendKeys(strRegistrationNumberXPath, strRegistrationNumberValue, "Registration Copy", true);
			Assert.assertTrue(rc);

			//Upload File - input type = file - id="id-registration-copy"
			/*String strFileName = "testRegistrationCopy.pdf";
			String strFileText = "Registration Copy";
			String strFilePath = createTempFile(strFileName, strFileText);
			String strRegistrationCopyFileUploadValue = strFilePath; //"";
			String strRegistrationCopyFileUploadXPath = "//input[@id='id-registration-copy']";
			rc = sendKeysFile(strRegistrationCopyFileUploadXPath, strRegistrationCopyFileUploadValue, "Registration Copy - File Upload", true);
			Assert.assertTrue(rc);*/

			//Enter PUC Validity Textbox - //*[@name="pucValidity"] - 14/02/2018
			String strPUCValidityXPath = "//*[@name='pucValidity']";
			String strPUCValidityValue = "15/02/2025";
			rc = setValueByJavascript(driver, strPUCValidityXPath, "PUC Validity", "");
			rc = setValueByJavascript(driver, strPUCValidityXPath, "PUC Validity", strPUCValidityValue);
			Assert.assertTrue(rc);

			//Upload PUC Validation Copy - File - id="id-puc-validity-copy"
			/*strFileName = "testPUCValidityCopy.pdf";
			strFileText = "PUC Validity Copy";
			strFilePath = createTempFile(strFileName, strFileText);
			String strPUCValidityFileValue = strFilePath; //"";
			String strPUCValidityFileUploadXPath = "//input[@id='id-puc-validity-copy']";
			rc = sendKeysFile (strPUCValidityFileUploadXPath, strPUCValidityFileValue, "PUC Validity Copy", true);
			Assert.assertTrue(rc);*/

			//Enter Insaurance Validity - //*[@name="insuranceValidity"] - 14/02/2018
			String strInsauranceValidityXPath = "//*[@name='insuranceValidity']";
			String strInsauranceValidityValue = "15/02/2025";
			rc = setValueByJavascript(driver, strInsauranceValidityXPath, "Insaurance Validity", "");
			rc = setValueByJavascript(driver, strInsauranceValidityXPath, "Insaurance Validity", strInsauranceValidityValue);
			Assert.assertTrue(rc);

			//Upload File - Type = file, name="insuranceCopy"
			/*strFileName = "testInsauranceCopy.pdf";
			strFileText = "Insauance Copy";
			strFilePath = createTempFile(strFileName, strFileText);
			String strInsauranceCopyFileValue = strFilePath; //"";
			String strInsauranceCopyFileUploadXPath = "//input[@name='insuranceCopy']";
			rc = sendKeysFile (strInsauranceCopyFileUploadXPath, strInsauranceCopyFileValue, "Insaurance Copy", true);
			Assert.assertTrue(rc);*/

			//Enter Owner Name - id="id-owner-name"
			String strOwnerNameXPath = "//*[@id='id-owner-name']";
			String strOwnerValue = getAttributeByXPath(strOwnerNameXPath, "Owner Name", "value");//"AutoTestOwner_"+getUniqueIntegerValue(5);
			rc = setValueByJavascript(driver, strOwnerNameXPath, "Owner Name", "");
			strOwnerValue = strOwnerValue + "_Update";
			rc = sendKeys(strOwnerNameXPath, strOwnerValue, "Owner Name", true);
			Assert.assertTrue(rc);

			//Vehicle Production Year - text - id="id-vehicle-production-year"
			/*String strVehicleProductionYearXPath = "//*[@id='id-vehicle-production-year']";
			String strVehicleProductionYearValue = "2008";
			rc = setValueByJavascript(driver, strVehicleProductionYearXPath, "Vehicle Production", "");
			rc = sendKeys(strVehicleProductionYearXPath, strVehicleProductionYearValue, "Vehicle Production Year", true);
			Assert.assertTrue(rc);*/

			//Vehicle Purchase Date - text - id="id-vehiclePurchaseDate"
			/*String strVehiclePurchaseDate = "//*[@id='id-vehiclePurchaseDate']";
			String strPurchaseDateValue = "20/08/2011";
			rc = setValueByJavascript(driver, strVehiclePurchaseDate, "Vehicle Purchase Date", "");
			rc = setValueByJavascript(driver, strVehiclePurchaseDate, "Vehicle Purchase Date", strPurchaseDateValue);
			Assert.assertTrue(rc);*/

			//Enter Transporter - id="id-transporter"
			String strTransporterXPath = "//*[@id='id-transporter']";
			String strTransporterValue = getAttributeByXPath(strTransporterXPath, "Transporter", "value");//"Transporter "+getUniqueIntegerValue(5);
			strTransporterValue = strTransporterValue + "_Update";
			rc = setValueByJavascript(driver, strTransporterXPath, "Transporter", "");
			rc = sendKeys(strTransporterXPath, strTransporterValue, "Transporter", true);
			Assert.assertTrue(rc);

			//Enter Financer - id="id-financer"
			String strFinancerXPath = "//*[@id='id-financer']";
			String strFinancerValue = getAttributeByXPath(strFinancerXPath, "Financer", "value");//"Financer "+getUniqueIntegerValue(5);
			strFinancerValue = strFinancerValue + "_Update";
			rc = setValueByJavascript(driver, strFinancerXPath, "Financer", "");
			rc = sendKeys(strFinancerXPath, strFinancerValue, "Financer", true);
			Assert.assertTrue(rc);

			//Enter Accident History - text - id="id-accident-history-(160-characters-limit)"
			String strAccidentHistoryXPath = "//*[@id='id-accident-history-(160-characters-limit)']";
			String strAccidentHistoryValue = getAttributeByXPath(strAccidentHistoryXPath, "Acct History", "value");//"Transporter "+getUniqueIntegerValue(5); //"None";
			strAccidentHistoryValue = strAccidentHistoryValue + "_Update";
			rc = setValueByJavascript(driver, strAccidentHistoryXPath, "Accident History", "");
			rc = sendKeys(strAccidentHistoryXPath, strAccidentHistoryValue, "Accident History", true);
			Assert.assertTrue(rc);

			
			//Click Update button
			String strSaveButtonXPath = "//*[text()='Update']";//"//button[@class='save']";
			rc = clickElementByXPath (strSaveButtonXPath, "Save Button");
			Assert.assertTrue(rc);

			//Get text from Prompt Message on success or failiure - //*[@id='js-prompt']
			String strPromptXPath = "//*[@id='js-prompt']";
			String strPromptValue = "";

			//Get Text from Prompt
			strPromptValue = getElementTextByXPath(strPromptXPath, "Prompt");
			if (strPromptValue != null && strPromptValue.toLowerCase().contains("vehicle updated successfully"))
			{
				logMessage("Verify Success Message", "Success Message - Vehicle updated successfully should display", "Message : "+strPromptValue+" is displayed", "Passed");
			}
			else
			{
				logMessage("Verify Success Message", "Success Message - Vehicle updated successfully should display", "Message : "+strPromptValue+" is displayed, Unable to create an order", "Failed");
				return false;
			}

			rc = searchVehicleAndValidateDetails(row);
			Assert.assertTrue(rc);

			return rc;
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			return false;	
		}
		finally{
			updateTempData(row);
		}
	}

	private void showWebElement(WebElement editButton) {
		// TODO Auto-generated method stub
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.display = 'block';", editButton);

	}

	

	public boolean showWebElementByXPath (String strXPath, String strElementName)
	{
		try 
		{
			WebElement editButton = driver.findElement(By.xpath(strXPath)); 
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].style.display = 'block';", editButton);	
			logMessage("Should be able to perform action", "Should be able to display element by XPath", "Unable to display element : "+strElementName, "Passed");
			return true;
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			logMessage("Should be able to perform action", "Should be able to display element by XPath", "Unable to display element : "+strElementName+"; using XPath : "+strXPath+" Error : "+e.getMessage(), "Failed");
			return false;
		}

	}

	private boolean waitForVehicleDataPopulation (String strVehicleNumber, String strVehicleNumberXPath) {

		try {


			String strVehicleNumberTextboxValue = null;//getAttributeByXPath(strVehicleNumberXPath, "Vehicle Text field", "value");
			int iCtr = 0;
			do {
				strVehicleNumberTextboxValue = getAttributeByXPath(strVehicleNumberXPath, "Vehicle Text field", "value");
				System.out.println("Current value - "+strVehicleNumberTextboxValue +" Expected : "+strVehicleNumber);
				iCtr ++ ;
				TimeUnit.SECONDS.sleep(1);
				if (iCtr > 30){
					break;
				}
			} while (strVehicleNumberTextboxValue == null
					|| strVehicleNumberTextboxValue.equals(strVehicleNumber) == false);

			if (strVehicleNumberTextboxValue.equals(strVehicleNumber) == false){
				System.out.println("Current value - "+strVehicleNumberTextboxValue +" Expected : "+strVehicleNumber);
				return false;
			}

			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	/**
	 * Will Search for the vehicle based on input of vehicle number - Eg : MH185576497
	 * @param strVehicleNumberToSearch
	 * @return - VehicleID for further getting the entire record from table for that particular Vehicle Number
	 */
	public String udsVehicleSearch (String strVehicleNumberToSearch)
	{
		try 
		{
			//Navigate to Resources Page

			//Click Resource
			/*String strResourceMenu = "//*[text()='Resource']";
			rc = clickElementByXPath(strResourceMenu, "Resources Menu");
			Assert.assertTrue(rc);

			//Navigate to vehicle page
			String strVehicleMenuItem = "//*[text()='Vehicle']";
			rc = clickElementByXPath(strVehicleMenuItem, "Vehicle");
			Assert.assertTrue(rc);*/

			//Click Resource
			String strResourcesLabel = getMenuName("Resource");//Orders also reffered to as Tasks
			String strXPath = "//*[text()="+strResourcesLabel+"]";
			rc = clickElementByXPath (strXPath, "Resources Menu");
			Assert.assertTrue(rc);

			//Click Vehicle
			String strVehicleLabel = getMenuName("Vehicle");
			strXPath = "//*[text()="+strVehicleLabel+"]";
			rc = clickElementByJavascript(driver, strXPath, "Vehicle Menu");//clickElementByXPath(strXPath, "Vehicle Menu");
			Assert.assertTrue(rc);


			//Click Add Button - //*[contains (@class,'icon-add')]
			/*String strAddButton = "//*[contains (@class,'icon-add')]";
			rc = clickElementByXPath(strAddButton, "Add Button");
			Assert.assertTrue(rc);*/

			//Wait for vehicle column at least show 1 option - //*[@id="vehicleId-vehicleNumber"]
			int iTotalVehicles = 0;
			int iCtr = 0;
			do {
				iTotalVehicles = udsGetVehicleList(driver).size();
				System.out.println("Loading Total Vehicles : "+iTotalVehicles);
				if (iCtr > 30){
					logMessage("Vehicle Search", "Should be able to search for vehicles", "No data present", "Failed");
					return null;
				}
			}while (iTotalVehicles <= 0);

			/*
			int iPageSize = 25;

			//Set Page size = 25 - //select[@name="pageSize"]//option[@value='25']
			String strPagesizeDropdownXPath = "//*[@id='pagination-dropdown']";//"//select[@name='pageSize']";  //option[@value='25']";
			//Select selectPageDropDown =new Select (driver.findElement(By.xpath(strPagesizeDropdownXPath)));
			//selectPageDropDown.selectByValue(""+iPageSize);//"25");
			rc = clickElementByXPath(strPagesizeDropdownXPath, "Page Size");
			Assert.assertTrue(rc);

			String strPageSizeOption = "//ul[@aria-labelledby='pagination-dropdown']//a[contains (text(),'"+iPageSize+"')]";
			rc = clickElementByXPath(strPageSizeOption, "Page Size Option");
			Assert.assertTrue(rc);

			//Wait for vehicle column to appear exactly 25 - //*[@id="vehicleId-vehicleNumber"]
			udsWaitForVehiclesInListView(25);
			*/
			//Search with vehicle number//
			rc = udsSearchByVehicleNumber (strVehicleNumberToSearch);
			Assert.assertTrue(rc);

			//Wait for only one result to appear
			rc = udsWaitForVehiclesInListView(1);
			Assert.assertTrue(rc);

			//Get Vehicle ID 
			WebElement searchedVehicle = null;
			try 
			{
				searchedVehicle = udsGetVehicleList(driver).get(0);
				searchedVehicle = searchedVehicle.findElement(By.xpath("//span[@title='"+strVehicleNumberToSearch+"']"));
				if (searchedVehicle.getText().equalsIgnoreCase(strVehicleNumberToSearch) == false){
					logMessage("Search for vehicle", "Should be able to search for vehicle number", "Vehicle Data searched with does not exists in list Vehicle Number To Search - "+strVehicleNumberToSearch, "Failed");
					return null;
				}
			}
			catch (Exception e) 
			{
				logMessage("Search for vehicle", "Should be able to search for vehicle number", "Vehicle Data searched with does not exists in list Vehicle Number To Search - "+strVehicleNumberToSearch, "Failed");
				return null;
			}

			String strVehicleID = searchedVehicle.getAttribute("id");
			System.out.println("strVehicleID: "+strVehicleID);

			if (strVehicleID == null){
				logMessage("Verify vehicle search", "Should be able to get Vehicle ID", "Unable to get vehicle ID - "+strVehicleID, "Failed");
				return null;
			}
			else {
				logMessage("Verify vehicle search", "Should be able to get Vehicle ID", "Successfully fetched vehicle ID - "+strVehicleID, "Passed");
			}
			return strVehicleID;
		}
		catch (Exception e)
		{
			e.printStackTrace();
			logMessage("Verify Vehicle Search", "Should be able to search for vehicle", "Unable to search for vehicle", "Failed");
			return null;
		}
	}

	/**
	 * 
	 * @param iNumberOfVehiclesToAppear - iNumberOfVehiclesToAppear in List View
	 * @return
	 */
	public boolean udsWaitForVehiclesInListView (int iTotalVehiclesExpected)
	{
		try 
		{
			int iCtr = 0;
			int iNumberOfVehiclesToAppear = 0;
			do {
				iNumberOfVehiclesToAppear = udsGetVehicleList(driver).size();
				System.out.println("Loading Total Vehicles : "+iNumberOfVehiclesToAppear+" Expecting : "+iTotalVehiclesExpected);
				TimeUnit.SECONDS.sleep(1);
				if (iCtr > 25)
				{
					logMessage("Verify vehicle list appears on webpage", "Total vehicles appearing on webpage should be "+iTotalVehiclesExpected, "Total Number of vehicles appeared on webpage - "+iNumberOfVehiclesToAppear, "Failed");
					return false;
				}
				iCtr++;
			}while (iNumberOfVehiclesToAppear != iTotalVehiclesExpected);

			return true;
		}
		catch (Exception e) 
		{
			logMessage("Verify vehicle list appears on webpage", "Total vehicles appearing on webpage should be "+iTotalVehiclesExpected, "Unable to determine - Total Number of vehicles appeared on webpage", "Failed");
			e.printStackTrace();
			return false;
		}
	}


	public boolean udsWaitForOrdersInListView (int iTotalOrdersExpected)
	{
		try 
		{
			int iCtr = 0;
			int iNumberOfOrdersToAppear = 0;
			do {

				iNumberOfOrdersToAppear = udsGetOrderList (driver).size();
				System.out.println("Loading Total Orders : "+iNumberOfOrdersToAppear+" Expecting : "+iTotalOrdersExpected);
				TimeUnit.SECONDS.sleep(1);//

				//Update - Check the list of orders on current page - if less than iTotalOrdersExpected -then pass
				ArrayList<Integer> pageDetails = getPaginationDetails();
				int iTotalElements = pageDetails.get(0);
				int iPageElementsFrom = pageDetails.get(1);
				int iPageElementsTo =  pageDetails.get(2);
				System.out.println("Page From "+iPageElementsFrom+" to : "+iPageElementsTo+" Size "+iTotalElements);
				if (iTotalElements != 0 && //Result from Pagination Header 
						iNumberOfOrdersToAppear != 0 && //Result from Page list output
						iTotalElements < iTotalOrdersExpected){
					break;
				}

				if (iCtr > 10)
				{
					break;
					//logMessage("Verify orders appears on webpage", "Total orders appearing on webpage should be "+iTotalOrdersExpected, "Total Number of vehicles appeared on webpage - "+iNumberOfOrdersToAppear, "Failed");
					//return false;
				}
				iCtr++;
			}while (iNumberOfOrdersToAppear != iTotalOrdersExpected);

			if (iNumberOfOrdersToAppear <= iTotalOrdersExpected 
					&& iNumberOfOrdersToAppear > 0){
				return true;
			}
			else {

				logMessage("Verify orders appears on webpage", "Total orders appearing on webpage should be "+iTotalOrdersExpected, "Total Number of orders appeared on webpage - "+iNumberOfOrdersToAppear, "Failed");
				return false;
			}

			//return true;
		}
		catch (Exception e) 
		{
			logMessage("Verify order list appears on webpage", "Total order appearing on webpage should be "+iTotalOrdersExpected, "Unable to determine - Total order appeared on webpage", "Failed");
			e.printStackTrace();
			return false;
		}
	}

	public List <WebElement> udsGetVehicleList (WebDriver driver){

		try {
			List <WebElement> allVehicleList = driver.findElements(By.xpath("//*[@id='vehicleId-vehicleNumber']"));
			TimeUnit.SECONDS.sleep(1);
			return allVehicleList;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}


	/**
	 * WIP - Will loop through each vehicle present in the list and return back the list of VehicleNumbers Present on the page
	 * @param iExpectedListSize
	 * @return Should return the list of vehicles on current page of size = iExpectedListSize 
	 */
	public Set <String> udsGetVehicleList (int iExpectedListSize){

		Set <String> totalVehiclesOnPage = new HashSet();
		try {
			//List <WebElement> allVehicleList = driver.findElements(By.xpath("//*[@id='vehicleId-vehicleNumber']"));
			List <WebElement> allVehicleList = udsGetVehicleList(driver);//driver.findElements(By.xpath("//*[@id='vehicleId-vehicleNumber']"));
			int x = 0;
			for (int i = 0; i <=iExpectedListSize
					// allVehicleList.size()
					; i++) 
			{
				try 
				{

					WebElement element = allVehicleList.get(i);
					((JavascriptExecutor) driver).executeScript(
							"arguments[0].scrollIntoView();", element);

					String strElementText = element.getText();

					totalVehiclesOnPage.add(strElementText);
					System.out.println("x = "+x++);
					if (totalVehiclesOnPage.size() == iExpectedListSize){
						break;
					}
					if (i == allVehicleList.size() - 1){
						i = i - (allVehicleList.size() + 5);
						allVehicleList = udsGetVehicleList(driver);
					}
				} 
				catch (StaleElementReferenceException e){
					System.err.println("Fetched data...");
					break;
				}
				catch (Exception e) {
					System.err.println("Continue for next element...");
					e.printStackTrace();
					continue;
				}
			}

			System.out.println(totalVehiclesOnPage.size());

			Iterator <String> totalVehicles = totalVehiclesOnPage.iterator();
			while (totalVehicles .hasNext()){
				String strCurrentVehicleName = totalVehicles .next();
				System.out.println(strCurrentVehicleName);
			}

			TimeUnit.SECONDS.sleep(1);
			return totalVehiclesOnPage;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}


	public boolean udsSearchByVehicleNumber (String strVehicleNumberValue) {
		try 
		{
			System.out.println("Searching for vehicle number - "+strVehicleNumberValue);
			
			//Using dynamic lable from page structure 
			JsonObject vehicleListViewStructure = getStructureAPI("VEHICLE", "VEHICLE", "VEHICLE_LIST_VIEW");
			if (vehicleListViewStructure == null)
			{
				logMessage("Get Vehicle List view column structure", "Should be able to get vehicle list view column structure", "Unable to get vehicle list view column structure - "+vehicleListViewStructure, "Failed");
				return false;
			}
			
			String strVehicleColumnLabel = vehicleListViewStructure.has("columns") ? vehicleListViewStructure.get("columns").getAsJsonObject().get("vehicleNumber").getAsJsonObject().get("label").getAsString() : null; 
			System.out.println("strVehicleColumnLabel: "+strVehicleColumnLabel);
			if (strVehicleColumnLabel == null)
			{
				logMessage("Should be able to get label key", "Vehicle No. column label key should be fetched", "Unable to fetch vehicle column key", "Failed");
				return false;
			}
			
			//Enter Vehicle Number in Global Search box - //*[contains (@title, "Vehicle No.")]//ancestor::div[@role="columnheader"]//input
			String strVehicleNumberXPath = "//*[contains (@title, '"+strVehicleColumnLabel+"')]//ancestor::div[@role='columnheader']//input";;//"//*[contains (@title, 'Vehicle No.')]//ancestor::div[@role='columnheader']//input";
			rc = sendKeys(strVehicleNumberXPath, strVehicleNumberValue + Keys.ENTER, "Vehicle Number - Global Search", true);
			Assert.assertTrue(rc);
			return true;
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			return false;
		}
	}

	//Will Search with given order number
	public boolean udsSearchByOrderNumber (String strOrderNumber)
	{
		try 
		{
			System.out.println("Searching for order : "+strOrderNumber);
			//String strOrderNumberXPath = "//*[contains (@title, 'Order No.')]//ancestor::div[@role='columnheader']//input";

			//Wait for grid to load
			TimeUnit.SECONDS.sleep(5);
			
			String strOrderColumnLabel = getStructure_OrderListView ("orderNo");////
			System.out.println("strOrderColumnLabel: "+strOrderColumnLabel);
			String strOrderNumberXPath = "//*[contains (@title, '"+strOrderColumnLabel+"')]//ancestor::div[@role='columnheader']//input";
			System.out.println("strOrderNumberXPath: "+strOrderNumberXPath);
			
			//Wait for 5 Seconds for the grid to load 
			TimeUnit.SECONDS.sleep(5);
			
			rc = sendKeys(strOrderNumberXPath, strOrderNumber + Keys.ENTER, "Order Number - Global Search", true);
			Assert.assertTrue(rc);
			
			//Wait for 5 Seconds for the results to respond back
			TimeUnit.SECONDS.sleep(5);
			
			return true;////
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			return false;
		}
	}


	public String getOrder_CrateStructure ()
	{
		try 
		{
			LinkedHashMap<String, String> row = this.dataMap;
			String strPropertiesUrl = row.get("URL") + "LoginApp/framework/structure?pageName=ORDERS&modelName=ORDERS&sectionName=CRATE_LIST";
			Response structurePageModelResponse = given().when().headers(
					"client_secret_key", row.get("clientSecretKey"),
					"www-authenticate", "BASIC "+row.get("token"),
					"Content-Type","application/json")
					.get(strPropertiesUrl);

			String strResponseBody = structurePageModelResponse.getBody().asString();
			System.out.println("strResponseBody: "+strResponseBody);
			if (strResponseBody != null && strResponseBody.contains("\"id\":\"crateCd\"")){
				return "multi_line_crate";
			}
			else {
				return "single_line_crate";
			}
		}
		catch (Exception e) 
		{
			logMessage("Get Crate Structure", "Should be able to fetch response from structure API", "Unable to feth response from structure API","Failed");
			e.printStackTrace();
			return null;
		}
	}

	@Deprecated
	public boolean enterCrateItems_old (){
		try {

			//Enter Number of Items - id="id-number-of-items" - //*[@id="id-number-of-items"]//following::button
			String strAddCrateItems = "//*[@id='id-number-of-items']";
			rc = clickElementByJavascript(driver,strAddCrateItems, "Add Items Button");
			Assert.assertTrue(rc);
			//
			//Get Crate Information Modal - //*[contains(@class,'crate-section')]
			String strCrateInformationModal = "//*[contains(@class,'crate-section')]";

			String strCrateStrcture = getOrder_CrateStructure();
			System.out.println("strCrateStructure: "+strCrateStrcture);
			if (strCrateStrcture != null && strCrateStrcture.equals("single_line_crate")){

				//Try to Enter Crate Items with no line Items 
				//It can be a case of crate with no line Items - Try to enter singleton crate items
				int iCounter = 1;
				int iExpectedCrates = 3;
				do {
					//Enter Crate Code - (//main)[1]//*[@name='crateCd']
					String strCrateCodeValue = getUniqueValue(5);
					String strCrateCodeValueXPath =  "(//main)["+iCounter+"]//*[@name='crateCd']"; 
					rc = sendKeys(strCrateCodeValueXPath, strCrateCodeValue, "Crate Code", true);
					Assert.assertTrue(rc);

					//Enter Crate Value - name="crateType"
					String strCrateTypeValue = "Crate Type";//getUniqueValue(5);
					String strCrateValueXPath =  "(//main)["+iCounter+"]//*[@name='crateType']"; 
					rc = sendKeys(strCrateValueXPath, strCrateTypeValue, "Crate Type", true);
					Assert.assertTrue(rc);

					//Enter Qty - name="noOfUnits"
					String strCrateQtyValue = getUniqueIntegerValue(2);
					String strCrateQtyXPath =  "(//main)["+iCounter+"]//*[@name='noOfUnits']"; 
					rc = sendKeys(strCrateQtyXPath, strCrateQtyValue, "Crate Qty", true);
					Assert.assertTrue(rc);

					//Enter Amt - name="crateAmount"
					String strCrateAmtValue = getUniqueIntegerValue(2);
					String strCrateAmtXPath =  "(//main)["+iCounter+"]//*[@name='crateAmount']"; 
					rc = sendKeys(strCrateAmtXPath, strCrateAmtValue, "Crate Amt", true);
					Assert.assertTrue(rc);

					//Add Button - (//main)[iCounter]//following::div[contains(@class,'add')]
					if (iCounter <= iExpectedCrates - 1){
						String strAddButtonXPath = "(//main)["+iCounter+"]//following::div[contains(@class,'add')]";
						rc = clickElementByXPath(strAddButtonXPath, "Add Button");						
						Assert.assertTrue(rc);
					}
					iCounter ++;
				}while (iCounter <= iExpectedCrates);

				//Click Save Button - //a[text()='Save']
				String strSaveButton = "//a[text()='Save']";
				rc = clickElementByXPath(strSaveButton, "Save Crate Button");

				//END - crate with no line Items - Try to enter singleton crate items
				return rc;
			}

			//Enter Crate Barcode - @placeholder='Enter Crate Barcode'
			String strCrateBarcodeTextbox = strCrateInformationModal + "//div[@class='crate-details']//input"; //"//*[@placeholder='Enter Crate Barcode']";
			String strCrateBarCode = getUniqueValue(15);
			rc = sendKeys(strCrateBarcodeTextbox, strCrateBarCode, "Crate Barcode", true);
			Assert.assertTrue(rc);

			//
			int iTotalItemsPerCrate;
			int iCrateNumber = 1;

			int iMaxTotalItemsPerCrate = 3;
			int iMaxCrates = 2;

			do
			{
				iTotalItemsPerCrate = 0;
				do
				{

					//Get total Sections - //*[contains(@class,'crate-section')]//*[@name="addDeliveryMedium"]
					String strTotalItemSections = "//*[contains(@class,'crate-section')]//*[@name='addDeliveryMedium']";
					iTotalItemsPerCrate ++;//driver.findElements(By.xpath(strTotalItemSections)).size();
					System.out.println("Total Available : "+iTotalItemsPerCrate);

					//Fill In Section 1 - <Section1> //*[contains(@class,'crate-section')]//*[@name="addDeliveryMedium"][1|2|3]
					String strCurrentSection = "("+strTotalItemSections + "["+iTotalItemsPerCrate+"]"+")"+"["+iCrateNumber+"]";

					//Item Barcode - <Setion1>//id="id-item-barcode"
					String strItemBarCodeXPath = strCurrentSection + "//*[@id='id-item-barcode']";
					String strItemBarCodeValue = getUniqueIntegerValue(7);
					rc = sendKeys(strItemBarCodeXPath, strItemBarCodeValue, "Item BarCode - "+iTotalItemsPerCrate, true);
					Assert.assertTrue(rc);

					String strRandomValue = getUniqueIntegerValue(3);

					//Enter Item Name - <Setion1>//id="id-item-name"
					String strItemNameXPath = strCurrentSection + "//*[@id='id-item-name']";
					String strItemNameValue = "Item Name - "+iTotalItemsPerCrate+ " - "+strRandomValue;
					rc = sendKeys(strItemNameXPath, strItemNameValue, "Item Name - "+iTotalItemsPerCrate, true);
					Assert.assertTrue(rc);

					//Enter Item Type - <Setion1>//id="id-item-type"
					String strItemType = strCurrentSection + "//*[@id='id-item-type']";
					String strItemTypeValue = "Item Type - "+iTotalItemsPerCrate+ " - "+strRandomValue;
					rc = sendKeys(strItemType, strItemTypeValue, "Item Type - "+iTotalItemsPerCrate, true);
					Assert.assertTrue(rc);

					//Enter Item Weight - <Setion1>//id="id-item-weight"
					String strItemWeight = strCurrentSection + "//*[@id='id-item-weight']";
					String strItemWeightValue = getUniqueIntegerValue(2);
					rc = sendKeys(strItemWeight, strItemWeightValue, "Item Weight", true);
					Assert.assertTrue(rc);

					//Enter Item Units - <Setion1>//id="id-no.-of-units"
					String strItemUnits = strCurrentSection + "//*[@id='id-no.-of-units']";
					String strItemUnitsValue = getUniqueIntegerValue(2);
					rc = sendKeys(strItemUnits, strItemUnitsValue, "Item Units", true);
					Assert.assertTrue(rc);

					//Enter Item Price - <Setion1>//id="id-price/unit"
					String strItemPrice = strCurrentSection + "//*[@id='id-price/unit']";
					String strItemPriceValue = getUniqueIntegerValue(2);
					rc = sendKeys(strItemPrice, strItemPriceValue, "Item Price", true);
					Assert.assertTrue(rc);

					if (iTotalItemsPerCrate == iMaxTotalItemsPerCrate)
					{
						System.out.println("Completed adding items for Crate - "+strCrateBarCode);
						break;
					}
					else {
						//Click Add Button for Crate 1 - class contains add-lineitem
						//iTotalSections = driver.findElements(By.xpath(strTotalItemSections)).size();
						//System.out.println("Total Available Rows: "+iTotalSections);
						String strAddLineItemButton = strCurrentSection +"//div[contains(@class, 'add-lineitem')]";
						//strTotalItemSections + "["+iTotalSections+"]"+"//div[contains(@class, 'add-lineitem')]";
						clickElementByXPath(strAddLineItemButton, "Add Line Item - "+iTotalItemsPerCrate);
					}
					//Get total Sections - Find Elements - //*[contains(@class,'crate-section')]//*[@name="addDeliveryMedium"]

					//Enter 5 Items - for each section - //*[contains(@class,'crate-section')]//*[@name="addDeliveryMedium"]

				}
				while (true);

				//Repeat Adding 5 Items per crate
				iCrateNumber++;

				if (iCrateNumber > iMaxCrates){
					break;
				}
				else {

					//Add 5 New Crates Enter Text in - class="addNewCrateInput"
					String strAddCrateBarCodeValue = getUniqueValue(15);
					String strAddCrateTextboxXPath = "//*[@class='addNewCrateInput']";
					rc = sendKeys(strAddCrateTextboxXPath, strAddCrateBarCodeValue, "Crate - "+strAddCrateBarCodeValue, true);
					Assert.assertTrue(rc);

					//Click Add Button for each crate - //*[contains (@class, 'addCrate')]//i
					String strAddCrateButtonXPath = "//*[contains (@class, 'addCrate')]//i";
					clickElementByXPath(strAddCrateButtonXPath, "Add Crate Button");

					TimeUnit.SECONDS.sleep(3);
				}
			}
			while (true);

			//Click Save Button - //a[text()='Save']
			String strSaveButton = "//a[text()='Save']";
			clickElementByXPath(strSaveButton, "Save Crate Button");

			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}


	/******Custom WebDriver Waits ********/

	public WebElement waitForElementToBeDisplayed(final WebElement element, int timeOutPeriod)
	{
		WebDriverWait webDriverWait = new WebDriverWait(driver, timeOutPeriod);
		webDriverWait.pollingEvery(10, TimeUnit.MICROSECONDS);
		return webDriverWait.until(new ExpectedCondition<WebElement>()
		{
			public WebElement apply(WebDriver driver)
			{
				try
				{
					return element.isDisplayed() ? element : null;
				}
				catch (NoSuchElementException ex)
				{
					return null;
				}
				catch (StaleElementReferenceException ex)
				{
					return null;
				}
				catch (NullPointerException ex)
				{
					return null;
				}
			}
		});
	}

	public WebElement waitForElementToBeDisplayed(final By by, int timeOutPeriod)
	{

		WebDriverWait webDriverWait = new WebDriverWait(driver, timeOutPeriod);
		webDriverWait.pollingEvery(10, TimeUnit.MICROSECONDS);
		return webDriverWait.until(new ExpectedCondition<WebElement>()
		{
			public WebElement apply(WebDriver driver)
			{
				try
				{
					WebElement element = driver.findElement(by);
					return element.isEnabled() && element.isDisplayed() ? element : null;
				}
				catch (NoSuchElementException ex)
				{
					return null;
				}
				catch (StaleElementReferenceException ex)
				{
					System.out.println("Error in stale block");
					return null;
				}
				catch (NullPointerException ex)
				{
					return null;
				}

			};

		});
	}

	public WebElement waitForElementToBeClickable(final By by, int timeOutPeriod)
	{
		WebDriverWait webDriverWait = new WebDriverWait(driver, timeOutPeriod);
		webDriverWait.pollingEvery(10, TimeUnit.MICROSECONDS);
		return webDriverWait.until(new ExpectedCondition<WebElement>()
		{
			public WebElement apply(WebDriver driver)
			{
				try
				{
					WebElement element = driver.findElement(by);
					return element.isEnabled() && element.isDisplayed() ? element : null;
				}
				catch (NoSuchElementException ex)
				{
					return null;
				}
				catch (StaleElementReferenceException ex)
				{
					return null;
				}
				catch (NullPointerException ex)
				{
					return null;
				}
			}
		});
	}

	public WebElement waitForElementToBePresent(final By by, int timeOutPeriod)
	{
		WebDriverWait webDriverWait = new WebDriverWait(driver, timeOutPeriod);
		webDriverWait.pollingEvery(10, TimeUnit.MICROSECONDS);
		return webDriverWait.until(new ExpectedCondition<WebElement>()
		{
			public WebElement apply(WebDriver driver)
			{
				try
				{
					return driver.findElement(by);
				}
				catch (NoSuchElementException ex)
				{
					return null;
				}
				catch (StaleElementReferenceException ex)
				{
					return null;
				}
				catch (NullPointerException ex)
				{
					return null;
				}
			}
		});
	}

	public WebElement waitForElementToBeClickable(final WebElement element, int timeOutPeriod)
	{
		WebDriverWait webDriverWait = new WebDriverWait(driver, timeOutPeriod);
		webDriverWait.pollingEvery(10, TimeUnit.MICROSECONDS);
		return webDriverWait.until(new ExpectedCondition<WebElement>()
		{
			public WebElement apply(WebDriver driver)
			{
				try
				{
					return element.isEnabled() && element.isDisplayed() ? element : null;
				}
				catch (NoSuchElementException ex)
				{
					return null;
				}
				catch (StaleElementReferenceException ex)
				{
					return null;
				}
				catch (NullPointerException ex)
				{
					return null;
				}
			}
		});
	}

	public WebElement waitForElementToBePopulatedWithText(final By element, int timeOutPeriod, final String text)
	{
		WebDriverWait webDriverWait = new WebDriverWait(driver, timeOutPeriod);
		webDriverWait.pollingEvery(10, TimeUnit.MICROSECONDS);
		return webDriverWait.until(new ExpectedCondition<WebElement>()
		{
			public WebElement apply(WebDriver driver)
			{
				try
				{
					WebElement webElement = driver.findElement(element);
					return webElement.getText().trim().equalsIgnoreCase(text) ? webElement : null;
				}
				catch (NoSuchElementException ex)
				{
					return null;
				}
				catch (StaleElementReferenceException ex)
				{
					return null;
				}
				catch (NullPointerException ex)
				{
					return null;
				}
			}
		});
	}

	public WebElement waitForElementToBeEnabled(final WebElement element, int timeOutPeriod)
	{
		WebDriverWait webDriverWait = new WebDriverWait(driver, timeOutPeriod);
		webDriverWait.pollingEvery(10, TimeUnit.MICROSECONDS);
		return webDriverWait.until(new ExpectedCondition<WebElement>()
		{
			public WebElement apply(WebDriver driver)
			{
				try
				{
					return element.isEnabled() ? element : null;
				}
				catch (NoSuchElementException ex)
				{
					return null;
				}
				catch (StaleElementReferenceException ex)
				{
					return null;
				}
				catch (NullPointerException ex)
				{
					return null;
				}
			}
		});
	}

	public WebElement waitForElementToBeEnabled(final By by, int timeOutPeriod)
	{
		WebDriverWait webDriverWait = new WebDriverWait(driver, timeOutPeriod);
		webDriverWait.pollingEvery(10, TimeUnit.MICROSECONDS);
		return webDriverWait.until(new ExpectedCondition<WebElement>()
		{
			public WebElement apply(WebDriver driver)
			{
				try
				{
					WebElement element = driver.findElement(by);
					return element.isEnabled() ? element : null;
				}
				catch (NoSuchElementException ex)
				{
					return null;
				}
				catch (StaleElementReferenceException ex)
				{
					return null;
				}
				catch (NullPointerException ex)
				{
					return null;
				}
			}
		});
	}

	public WebElement waitForOptionToBePopulatedInList(final WebElement dropDownList, int timeOutPeriod)
	{
		WebDriverWait webDriverWait = new WebDriverWait(driver, timeOutPeriod);
		webDriverWait.pollingEvery(10, TimeUnit.MICROSECONDS);
		return webDriverWait.until(new ExpectedCondition<WebElement>()
		{
			public WebElement apply(WebDriver driver)
			{
				try
				{
					List<WebElement> options = dropDownList.findElements(By.tagName("option"));
					return options.size() > 1 ? dropDownList : null;
				}
				catch (NoSuchElementException ex)
				{
					return null;
				}
				catch (StaleElementReferenceException ex)
				{
					return null;
				}
				catch (NullPointerException ex)
				{
					return null;
				}
			}
		});
	}

	//Will Make the element visible
	public void bringElementInView(WebElement element)
	{
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	}

	//Will Make the element visible
	public void bringElementInView(String elementXPath)
	{
		try {
			WebDriverWait wait = new WebDriverWait(driver, MAX_WAIT_TIME);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(elementXPath)));
			WebElement element = driver.findElement(By.xpath(elementXPath));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void bringElementInView_NoWait (String elementXPath)
	{
		WebElement element = driver.findElement(By.xpath(elementXPath));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	}




	/*** Helper Methods ***/
	public static String getUniqueValue()
	{
		// get current date time with Date() to create unique file name
		try
		{
			Thread.sleep(1000);
		}
		catch (InterruptedException e)
		{
		}
		char[] chars = "abcdefghijklmnopqrstuvwxyzABSDEFGHIJKLMNOPQRSTUVWXYZ1234567890".toCharArray();
		Random r = new Random(System.currentTimeMillis());
		char[] id = new char[15];
		for (int i = 0; i < 15; i++)
		{
			id[i] = chars[r.nextInt(chars.length)];
		}
		return new String(id);
	}

	public static String getUniqueValue(int length)
	{
		// get current date time with Date() to create unique file name
		try
		{
			Thread.sleep(1000);
		}
		catch (InterruptedException e)
		{
		}
		char[] chars = "abcdefghijklmnopqrstuvwxyzABSDEFGHIJKLMNOPQRSTUVWXYZ1234567890".toCharArray();
		Random r = new Random(System.currentTimeMillis());
		char[] id = new char[length];
		for (int i = 0; i < length; i++)
		{
			id[i] = chars[r.nextInt(chars.length)];
		}
		return new String(id);
	}
	

	public static String getUniqueValue_AlphabetsOnly (int length)
	{
		// get current date time with Date() to create unique file name
		try
		{
			Thread.sleep(1000);
		}
		catch (InterruptedException e)
		{
		}
		char[] chars = "abcdefghijklmnopqrstuvwxyzABSDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
		Random r = new Random(System.currentTimeMillis());
		char[] id = new char[length];
		for (int i = 0; i < length; i++)
		{
			id[i] = chars[r.nextInt(chars.length)];
		}
		return new String(id);
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


	public static void waitForRandomSec (int length)
	{
		// get current date time with Date() to create unique file name
		char[] chars = "1234567890".toCharArray();
		Random r = new Random(System.currentTimeMillis());
		char[] id = new char[length];
		for (int i = 0; i < length; i++)
		{
			id[i] = chars[r.nextInt(chars.length)];
		}
		String strRandom = new String(id);
		int iRandomNumber = Integer.parseInt(strRandom);
		try {
			TimeUnit.SECONDS.sleep(iRandomNumber);
		} catch (Exception e) {
			System.err.println("Error in waiting..");
		}
	}

	
	public boolean testScenario(LinkedHashMap<String, String> row) {
		report.logMessage("Test", "Test", "Test", "Passed", driver);
		report.logMessage("Test", "Test", "Test", "Passed", driver);
		report.logMessage("Test", "Test", "Test", "Passed", driver);
		report.logMessage("Test", "Test", "Test", "Passed", driver);
		report.logMessage("Test", "Test", "Test", "Passed", driver);
		report.logMessage("Test", "Test", "Test", "Passed", driver);
		return true;
	}



	public boolean orderDRS (LinkedHashMap<String, String> row, boolean isPaginationTest) {

		try 
		{
			//Launch Application
			rc = launchApplication (row);
			Assert.assertTrue(rc);

			//launch app
			rc = login(row);
			Assert.assertTrue(rc);

			//Authenticate and fetch back token from API
			row = getAuthDetailsWeb(row);
			Assert.assertNotNull(row);

			//init label objects
			rc = initApp_PageLabels(row);
			Assert.assertTrue(rc);

			//init menu objects
			rc = initApp_MenuItems(row);
			Assert.assertTrue(rc);

			//Navigate to Trip Planning
			String strTripPlanningMenu = getMenuName("Trip Planning");
			strTripPlanningMenu = strTripPlanningMenu.replaceAll(" ", "");
			System.out.println("strTripPlanningMenu: "+strTripPlanningMenu);
			String strTripPlanningMenuItemXPath = "//*[@id="+strTripPlanningMenu+"]";
			rc = clickElementByXPath(strTripPlanningMenuItemXPath, "Trips Menu Item");
			Assert.assertTrue(rc);

			//Click Trips Menu Item
			String strTripsMenuItem = getMenuName("trip");
			System.out.println("strTripsMenuItem: "+strTripsMenuItem);
			String strTripsMenuItemXPath = "//*[text()="+strTripsMenuItem+"]";
			rc = clickElementByJavascript(driver, strTripsMenuItemXPath, "Trips Menu Item");//clickElementByXPath(strTripsMenuItemXPath, "Trips Menu Item");
			Assert.assertTrue(rc);

			updateTempData(row);

			int iPageNumber = 1;
			int iExpectedDRS_TripID = 0;
			int iExpectedTotalOrdersForTrip = 0;
			boolean tripFoundForDRS_Test = false;
			String strExpectedDRS_TripName = "";
			String strExpectedDeliveryBoyName = "";


			//Paginate through the dataset to find the ideal trip having at least order count > 2
			do 
			{

				ArrayList <String> allTripsForThisPage = new ArrayList<String>();

				//Hit Trips List View API and fetch all trips for current space - https://demo.loginextsolutions.com/TripApp/trip/lmfm/triplist?pageNumber=1&pageSize=50&status=ALL
				JsonObject resultData = getDataset_AllTrips_ListView(iPageNumber+"", "50", "ALL");//
				System.out.println("resultData : "+resultData);

				//Wait for next page to load
				TimeUnit.SECONDS.sleep(5);

				//Loop - through dataset
				JsonArray results_TestData = resultData.get("data").getAsJsonObject().get("results").getAsJsonArray();
				for (JsonElement currentMilkRunJsonElem : results_TestData) 
				{

					//String strMilkRunName = currentMilkRunJsonElem.getAsJsonObject().get("milkRun").getAsString();
					//System.out.println("strMilkRunName: "+strMilkRunName);

					//Loop through Trips for each milk run
					JsonArray results_Trips = currentMilkRunJsonElem.getAsJsonObject().get("trips").getAsJsonArray();
					for(JsonElement currentTripDetails : results_Trips){
						//Get Trip Name
						String strTripName = currentTripDetails.getAsJsonObject().get("tripName").getAsString();
						int iTotalOrdersForThisTrip = currentTripDetails.getAsJsonObject().get("orderCount").getAsInt();//orderCount
						//Focus on trip name 
						System.out.println("strTripName: "+strTripName);
						System.out.println("Trip has : "+iTotalOrdersForThisTrip+" orders");
						allTripsForThisPage.add(strTripName);
						logMessage("Get Trip Details", "Should be able to get Trip Details from API", "Fetched Trip : "+strTripName+" with order count : "+iTotalOrdersForThisTrip, "Passed");

						//If it is not a pagination test and available trip is found exit out of the loop
						if (iTotalOrdersForThisTrip > 0 //DRS should have an Order
								&& iTotalOrdersForThisTrip < 50 
								&& isPaginationTest == false)
						{
							System.out.println("Trip found for DRS Test...");
							tripFoundForDRS_Test = true;
							strExpectedDRS_TripName = strTripName;

							//Save its Trip ID for getting further info
							int iTripID = currentTripDetails.getAsJsonObject().get("tripId").getAsInt();
							strExpectedDeliveryBoyName =currentTripDetails.getAsJsonObject().get("deliveryMediumName").getAsString();//- deliveryMediumName
							iExpectedTotalOrdersForTrip = iTotalOrdersForThisTrip;
							iExpectedDRS_TripID = iTripID;
							break;
						}
					}//For Loop End to iterate over all Trips Object under a milk run

					if (tripFoundForDRS_Test){
						System.out.println("Trip found for DRS Test exiting out remaining milk runs...");
						break;
					}
				}//For Loop End to iterate over all milk run object
				/*
				if (iPageNumber%2 == 0){
					Collections.reverse(allTripsForThisPage);
				}*/
				for(int i = 0; i< allTripsForThisPage.size(); i++)
				{
					//Scroll to view - //*[text()='TRIP-15345']//ancestor::div[contains (@id, '-uiGrid-')]
					String strTripName = allTripsForThisPage.get(i);
					String strTripElementXPath = "//*[text()='"+strTripName+"']//ancestor::div[contains (@id, '-uiGrid-')]";
					bringElementInView(strTripElementXPath);
					String strTripNameActual = getElementTextByXPath(strTripElementXPath, "Trip : "+strTripName);
					if (strTripNameActual == null || strTripNameActual.equals(strTripName)== false)
					{
						logMessage("Verify trip on screen", "Should be able to verify trip is displayed on screen", "Unable to get trip - "+strTripName+" on screen", "Failed");
						return false;
					}

					if (strTripName.equals(strExpectedDRS_TripName)){
						logMessage("Find a trip having few orders", "Trip should be found with atleast 2 orders", "Trip found for DRS Verification : "+strExpectedDRS_TripName, "Passed");
						System.out.println("Need to view Trip's "+strExpectedDRS_TripName+" DRS.");
						break;
					}
				}

				if (tripFoundForDRS_Test == false){
					//Goto Next Page
					String strNextPageButtonXPath = "//*[@value='Next']";
					clickElementByXPath(strNextPageButtonXPath, "Next Page Button on Page "+iPageNumber);
					iPageNumber++;
				}

				if (isPaginationTest == true){

					//if pagination test - Need to loop through the dataset and exit
					if (iPageNumber > 5 || allTripsForThisPage.size() < 50){
						rc = true;
						break;
					}
				}

				if (allTripsForThisPage.size() < 50 || tripFoundForDRS_Test)
				{
					System.out.println("Reached End of page or found trip having order more than expected count of 3...");
					break;
				}
			}
			while (tripFoundForDRS_Test == false);

			if (isPaginationTest == true){
				if (rc == true)
				{
					logMessage("Verify user is able to paginate Trips List View", "User should be able to paginate the list view","User is able to paginate List view", "Passed");
					return true;
				}
				else
				{
					logMessage("Verify user is able to paginate Trips List View", "User should be able to paginate the list view","User is able to paginate List view", "Failed");
					return false;
				}
			}

			//Else normal DRS Test
			if (tripFoundForDRS_Test == false)
			{
				logMessage("Verify Trip is found with minimum order set", "Should be able to get trip having more than 2 orders", "Trip number Not found having more than 2 orders for DRS verification", "Failed");
				return false;
			}

			//Get its id attribute 
			String strTripElementXPath = "//*[text()='"+strExpectedDRS_TripName+"']//ancestor::div[contains (@id, '-uiGrid-')]";
			bringElementInView(strTripElementXPath);
			String strTripID = getAttributeByXPath(strTripElementXPath, "Trip with orders", "id");
			System.out.println("strTripID : "+strTripID);
			strTripID = strTripID.substring(0, strTripID.indexOf("uiGrid-")+7);
			System.out.println("strTripID : "+strTripID);

			//Check the Checkbox for that trip - //*[contains (@id, '1521552197884-2-uiGrid-')]//div[@role='checkbox']
			String strTripCheckboxXPath = "//*[contains (@id, '"+strTripID+"')]//div[@role='checkbox']";
			rc = clickElementByXPath(strTripCheckboxXPath, "Trip Checkbox");
			Assert.assertTrue(rc);//

			//Get the label for DRS Button from Structure API
			//JsonObject trips_menuMap = getStructureAPI("TRIPS", "TRIPS", "ALL_TRIPS_LIST_VIEW");
			//Assert.assertNotNull(trips_menuMap);

			//String strLabel = trips_menuMap.get("buttons").getAsJsonObject().get("showdrs").getAsJsonObject().get("label").getAsString(); 
			//System.out.println("Show DRS Button Label - "+strLabel);

			//Click Show DRS Button 
			String strShow_DRS_ButtonXPath = "//*[@id='showdrs-record']"; 
			rc = clickElementByXPath(strShow_DRS_ButtonXPath, "Show DRS Button");
			Assert.assertTrue(rc);

			//Hit Trips API and fetch Trips Data - i.e data for 
			System.out.println("iTripID: "+iExpectedDRS_TripID);


			//Hit DRS API and fetch the number of orders associated to the current Trip ID - https://demo.loginextsolutions.com/ShipmentApp/shipment/fmlm/deliveryrunsheet?pageNumber=1&pageSize=200&status=DRS&tripId=450551
			String strDRS_PageNumber = "1";
			String strDRS_PageSize = "200";
			String strDRS_Status = "DRS";
			JsonObject jsonResultData_DRS_Data_Orders = getOrdersForTrip_DRS_API (strDRS_PageNumber, strDRS_PageSize, strDRS_Status, iExpectedDRS_TripID);
			System.out.println("jsonResultData_DRS_Data_Orders"+jsonResultData_DRS_Data_Orders);
			Assert.assertNotNull(jsonResultData_DRS_Data_Orders);

			//Validate orders present in DRS API with List view - https://demo.loginextsolutions.com/ShipmentApp/shipment/fmlm/deliveryrunsheet?pageNumber=1&pageSize=200&status=DRS&tripId=450551 // data.results[n].orderNo should match with  - focussed //*[contains (@id, "js-orderNo-") and text()='test578art']
			try 
			{
				JsonArray ordersResultsOnDRSPage = jsonResultData_DRS_Data_Orders.get("data").getAsJsonObject().get("results").getAsJsonArray();
				int iCtr = 0;
				for(JsonElement strCurrentResult : ordersResultsOnDRSPage){
					String strAPI_OrderNo = strCurrentResult.getAsJsonObject().get("orderNo").getAsString();
					System.out.println("Fetching strAPI_OrderNo : "+strAPI_OrderNo+" in DRS list view");
					String strOrderNoDRSXpath = "//*[contains (@id, 'shipmentLocationId-orderNo') and contains (., '"+strAPI_OrderNo+"')]";//"//*[contains (@id, 'js-orderNo-') and text()='"+strAPI_OrderNo+"']//ancestor::td[1]";
					bringElementInView(strOrderNoDRSXpath);
					String strActualOrder = getElementTextByXPath(strOrderNoDRSXpath, "Order DRS Page"+strAPI_OrderNo);
					if (strActualOrder == null || strAPI_OrderNo.trim().equals(strActualOrder.trim()) == false){
						logMessage("Get Order text from DRS Page", "Should be able to get order number from DRS Page", "Expecting : "+strAPI_OrderNo+" Actual : "+strActualOrder, "Failed");
						return false;
					}
					logMessage("Get Order", "Should be able to fetch order from DRS Page", "Order fetched from DRS Page : "+strAPI_OrderNo, "Passed");
				}
				rc = true;
			}
			catch (Exception e) 
			{
				e.printStackTrace();
				rc = false;
			}

			if (rc == false){
				logMessage("Verify orders in DRS Page with API", "Orders from API should be validated ", "Error unable to validate orders for DRS Page with API", "Failed");
				return false;
			}
			else {
				logMessage("Verify orders in DRS Page with API", "Orders from API should be validated ", "Successfully validated orders in DRS page with API", "Passed");
			}

			//Hit Trips DRS Structure API and fetch DRS Structure - structure?modelName=DRS&pageName=DRS&sectionName=DRS_LIST_VIEW
			JsonObject drsListViewJsonResultData = getStructureAPI("DRS", "DRS", "DRS_LIST_VIEW");
			System.out.println("drsListViewColumns : "+drsListViewJsonResultData);
			//
			//Validate all columns from Structure API (drsListViewColumns) with DRS List View 
			JsonObject drsListViewColumnsJsonObject = drsListViewJsonResultData.get("columns").getAsJsonObject();
			//rc = verifyColumnsExistsOnPage(drsListViewColumnsJsonObject);
			//Assert.assertTrue(rc);
			ArrayList <String> arrColumnsToValidate = new ArrayList<>(); 
			arrColumnsToValidate.add("deliveryOrder");
			arrColumnsToValidate.add("orderNo");
			arrColumnsToValidate.add("packageStatusCd");

			for(String strCurrentColumnKey : drsListViewColumnsJsonObject.keySet()){
				String strId = drsListViewColumnsJsonObject.get(strCurrentColumnKey).getAsJsonObject().get("id").getAsString();
				String strColumnLabel = drsListViewColumnsJsonObject.get(strCurrentColumnKey).getAsJsonObject().get("label").getAsString();
				if (arrColumnsToValidate.contains(strId) == false){
					continue;
				}

				String strElementColumnXPath = "//*[contains (@class , '"+strId+"_colKey')]";//"//*[@title='"+strColumnLabel+"']";
				bringElementInView(strElementColumnXPath);
				rc = verifyElementIsVisible_DynamicWaits(strElementColumnXPath, "Column - "+strColumnLabel);
				Assert.assertTrue(rc);
			}

			//Get DRS Page Header from - https://demo.loginextsolutions.com/ShipmentApp/shipment/fmlm/data/count
			JsonArray drs_headerDetails_JsonArray = get_DRS_API_Trip_Header(iExpectedDRS_TripID);
			System.out.println("drs_headerDetails_JsonArray : "+drs_headerDetails_JsonArray);

			//Validate the data present on DRS page header with the Count API - https://demo.loginextsolutions.com/ShipmentApp/shipment/fmlm/data/count   
			String strdrsTripNumberLabel = app_PageLabels.get("drsTripNumber").getAsString();

			//Validate Trip Name - Label drsTripNumber
			if (strdrsTripNumberLabel == null || strdrsTripNumberLabel.equalsIgnoreCase("")){
				logMessage("Verify Trip Number for DRS", "Should be able to fetch Trip Number for DRS", "Label Details for drsTripNumber not found", "Failed");
				return false;
			}
			String strTripNumberElementXPath = "//*[text()='"+strdrsTripNumberLabel+"']//ancestor::div[@class='summary-item'][1]";
			String strElementText = getElementTextByXPath(strTripNumberElementXPath, "DRS Trip Number");
			bringElementInView(strTripNumberElementXPath);
			if (strElementText != null && strElementText.trim().endsWith(strExpectedDRS_TripName)){
				logMessage("Verify Trip Name on DRS Page", "Trip Number should be equal to '"+strExpectedDRS_TripName+"' on DRS Page", "Found : "+strElementText+" : Expected : "+strExpectedDRS_TripName, "Passed");
			}
			else {
				logMessage("Verify Trip Name on DRS Page", "Trip Number should be equal to '"+strExpectedDRS_TripName+"' on DRS Page", "Found : "+strElementText+" : Expected : "+strExpectedDRS_TripName, "Failed");
				return false;
			}

			//Validate Delivery Boy - drsDeliveryBoy 
			String strdrsDeliveryBoy = app_PageLabels.get("drsDeliveryBoy").getAsString();
			String strDRSDeliveryBoyElementXPath = "//*[text()='"+strdrsDeliveryBoy+"']//ancestor::div[@class='summary-item'][1]";
			String strDeliveryBoyDRSText = getElementTextByXPath(strDRSDeliveryBoyElementXPath, "DRS Delivery Boy");
			if (strDeliveryBoyDRSText != null && strDeliveryBoyDRSText .trim().endsWith(strExpectedDeliveryBoyName)){
				logMessage("Verify Delivery Boy Name on DRS Page", "Delivery Boy Name should be equal to '"+strExpectedDeliveryBoyName+"' on DRS Page", "Found : "+strDeliveryBoyDRSText+" : Expected : "+strExpectedDeliveryBoyName, "Passed");	
			}
			else {
				logMessage("Verify Delivery Boy Name on DRS Page", "Delivery Boy Name should be equal to '"+strExpectedDeliveryBoyName+"' on DRS Page", "Found : "+strDeliveryBoyDRSText+" : Expected : "+strExpectedDeliveryBoyName, "Failed");
				return false;
			}

			//Validate Total Orders - order_p
			String strdrsOrders_Label = app_PageLabels.get("order_p").getAsString();
			String strDRSTotalOrdersElementXPath = "//*[text()='"+strdrsOrders_Label+"']//ancestor::div[@class='summary-item'][1]";//div[1]";
			String strTotalOrdersForDRSText = getElementTextByXPath(strDRSTotalOrdersElementXPath, "DRS Total Orders");
			if (strTotalOrdersForDRSText != null && strTotalOrdersForDRSText .trim().endsWith(iExpectedTotalOrdersForTrip+"")){
				logMessage("Verify Total Orders on DRS Page", "Total Orders should be equal to '"+iExpectedTotalOrdersForTrip+"' on DRS Page", "Found : "+strTotalOrdersForDRSText+" : Expected : "+iExpectedTotalOrdersForTrip, "Passed");	
			}
			else {
				logMessage("Verify Total Orders on DRS Page", "Total Orders should be equal to '"+iExpectedTotalOrdersForTrip+"' on DRS Page", "Found : "+strTotalOrdersForDRSText+" : Expected : "+iExpectedTotalOrdersForTrip, "Failed");
				return false;
			}

			//Validate Total Time - {{total}} {{time}}
			/**
			int iTotalTimeInMinsAPI = drs_headerDetails_JsonArray.get(0).getAsJsonObject().get("plannedTripTimeInMins").getAsInt();
			int iTotalHours = iTotalTimeInMinsAPI / 60;
			int iTotalMins = iTotalTimeInMinsAPI % 60;
			String strdrsTotalTime_Label = app_PageLabels.get("total").getAsString() + " " + app_PageLabels.get("time").getAsString();
			String strExpectedStringMatch = strdrsTotalTime_Label + "(.*):(.*)"+iTotalHours+"(.*):(.*)"+iTotalMins+"(.*)";//"Total Waktu : 502 (.*): 47 (.*)";
			String strDRSTotalTimeElementXPath = "//*[text()='"+strdrsTotalTime_Label+"']//ancestor::div[1]";
			String strDRSTotalTimeDRSText = getElementTextByXPath(strDRSTotalTimeElementXPath, "Planned Total Time");
			bringElementInView(strDRSTotalTimeElementXPath);
			if (strDRSTotalTimeDRSText != null && strDRSTotalTimeDRSText.trim().matches(strExpectedStringMatch)){
				logMessage("Verify Total Time on DRS Page", "Total Time should be equal to '"+iTotalHours+"Hrs: "+iTotalMins+" Mins"+"' on DRS Page", "Found : "+strDRSTotalTimeDRSText+" : Expected "+iTotalHours+"Hrs: "+iTotalMins+" Mins", "Passed");	
			}
			else {
				logMessage("Verify Total Time on DRS Page", "Total Time should be equal to '"+iTotalHours+"Hrs: "+iTotalMins+" Mins"+"' on DRS Page", "Found : "+strDRSTotalTimeDRSText+" : Expected "+iTotalHours+"Hrs: "+iTotalMins+" Mins"+", Matcher : "+strExpectedStringMatch, "Failed");
				return false;
			}
			 **/

			/***
			//Get Trip Planning List view column structure API and sort by desc on no of orders - https://demo.loginextsolutions.com/LoginApp/framework/structure?modelName=TRIPS&pageName=TRIPS&sectionName=ALL_TRIPS_LIST_VIEW
			String strNoOfOrdersColumnLabel = getStructure_AllTrips_ListView("orderCount");// No of orders column name
			String strColumnDropdownXPath = "//*[@title='"+strNoOfOrdersColumnLabel+"']//following::i[@class='ui-grid-icon-angle-down'][1]";
			rc = clickElementByXPath(strColumnDropdownXPath , strNoOfOrdersColumnLabel+" - Dropdown");
			Assert.assertTrue(rc);

			//Sort Data in Desc
			String strSortByDescXPath = "//*[@class='ui-grid-icon-sort-alt-down']";//"//*[@id='menuitem-0']";
			rc = clickElementByXPath(strSortByDescXPath , "Sort by Desc");
			Assert.assertTrue(rc);

			//Verify Trips column data with structure


			//Sort by desc on No. Of orders
			 ***/

			return true;
		}
		catch (Exception e) 
		{
			logMessage("Verify DRS Page", "Should be able to verify DRS Page", "Unable to verify DRS Page - "+e.getMessage(), "Failed");
			e.printStackTrace();
			return false;
		}
	}



	/**
	 * Will hit DRS (DeliveryRunSheet API) and fetch back all orders associated with it
	 * DRS API - https://demo.loginextsolutions.com/ShipmentApp/shipment/fmlm/deliveryrunsheet?pageNumber=1&pageSize=200&status=DRS&tripId=450551
	 * 
	 * @param strDRS_PageNumber - 1 
	 * @param strDRS_PageSize - 200
	 * @param strDRS_Status - DRS
	 * @param iExpectedDRS_TripID - tripID for DRS
	 * @return
	 */
	public JsonObject getOrdersForTrip_DRS_API(
			String strDRS_PageNumber,
			String strDRS_PageSize, 
			String strDRS_Status,
			int iExpectedDRS_TripID) {

		JsonObject structure = null;
		try {

			//https://demo.loginextsolutions.com/LoginApp/framework/structure?modelName=ORDERS&pageName=ORDERS&sectionName=ALL_ORDER_LIST_VIEW
			LinkedHashMap <String, String> row = getTempData();

			//Get the auth token and Client Secret from from Auth API
			String strAPI = row.get("URL") + // demo.loginextsolutions.com/
					"ShipmentApp/shipment/fmlm/deliveryrunsheet"
					+ "?pageNumber="+strDRS_PageNumber
					+ "&pageSize="+strDRS_PageSize
					+ "&status="+strDRS_Status
					+ "&tripId="+iExpectedDRS_TripID;

			if (row.get("clientSecretKey") == null){
				row = getAuthDetailsWeb(row);
			}

			System.out.println("Getting strAPI : "+strAPI+" ");
			System.out.println("Headers \n"
					+ "client_secret_key:"+""+ row.get("clientSecretKey"));
			System.out.println("www-authenticate:"+""+ "BASIC "+row.get("token"));
			System.out.println("Content-Type:"+""+"application/json");

			Response structurePageModelResponse = given().when().headers(
					"client_secret_key", row.get("clientSecretKey"),
					"www-authenticate", "BASIC "+row.get("token"),
					"Content-Type","application/json")
					.get(strAPI);

			String strMenulModel = structurePageModelResponse.getBody().asString();
			System.out.println("API Response: "+strMenulModel);
			JsonParser parser = new JsonParser();
			structure = parser.parse(strMenulModel).getAsJsonObject();

			return structure;
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			logMessage("Get DRS API", "Response from DRS API should be fetched", "Unable to get DRS API Details - ShipmentApp/shipment/fmlm/deliveryrunsheet - "+e.getLocalizedMessage(), "Failed");
			return null;
		}
	}


	/**
	 * Will fetch DRS Trip Header details 
	 * @param iExpectedDRS_TripID
	 * @return
	 */
	public JsonArray get_DRS_API_Trip_Header(
			int iExpectedDRS_TripID) {

		JsonArray responseJsonData = null;
		try {

			//https://demo.loginextsolutions.com/LoginApp/framework/structure?modelName=ORDERS&pageName=ORDERS&sectionName=ALL_ORDER_LIST_VIEW
			LinkedHashMap <String, String> row = getTempData();

			//Get the auth token and Client Secret from from Auth API
			String strAPI = row.get("URL") + // demo.loginextsolutions.com/
					"ShipmentApp/shipment/fmlm/data/count";

			if (row.get("clientSecretKey") == null){
				row = getAuthDetailsWeb(row);
			}

			System.out.println("Getting strAPI : "+strAPI+" ");
			System.out.println("Headers \n"
					+ "client_secret_key:"+""+ row.get("clientSecretKey"));
			System.out.println("www-authenticate:"+""+ "BASIC "+row.get("token"));
			System.out.println("Content-Type:"+""+"application/json");

			Response structurePageModelResponse = given().when().headers(
					"client_secret_key", row.get("clientSecretKey"),
					"www-authenticate", "BASIC "+row.get("token"),
					"Content-Type","application/json")
					.body("["+iExpectedDRS_TripID+"]")
					.post(strAPI);

			String strAPIResponse = structurePageModelResponse.getBody().asString();
			System.out.println("API Response: "+strAPIResponse);
			JsonParser parser = new JsonParser();
			responseJsonData = parser.parse(strAPIResponse).getAsJsonArray();

			return responseJsonData;
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			logMessage("Get DRS API", "Response from DRS API should be fetched", "Unable to get DRS Count API Details ( ShipmentApp/shipment/fmlm/data/count )- "+e.getLocalizedMessage(), "Failed");
			return null;
		}
	}



	public boolean createTrip(LinkedHashMap<String, String> row) {
		try 
		{
			System.out.println("Creating Trip with : "+row.get("OrderNumber"));
			System.out.println("Using Delivery Boy for Trip : "+row.get("db.deliveryMediumMasterName"));

			String strOrderNumber = row.get("OrderNumber");
			String strDeliveryBoyName  = row.get("db.deliveryMediumMasterName");

			//strOrderNumber = "Ord_4076716_test";
			//strDeliveryBoyName  = row.get("db.deliveryMediumMasterName");

			if (isApplicationLaunched == false)
			{

				//Launch Application
				rc = launchApplication (row);
				Assert.assertTrue(rc);

				//launch app
				rc = login(row);
				Assert.assertTrue(rc);

				//Authenticate and fetch back token from API
				row = getAuthDetailsWeb(row);
				Assert.assertNotNull(row);

				//init label objects
				rc = initApp_PageLabels(row);
				Assert.assertTrue(rc);

				//init menu objects
				rc = initApp_MenuItems(row);
				Assert.assertTrue(rc);

			}

			//Get client properties w.r.t Date Format / Currentcy Format, etc
			rc = getApplicationProperties(row);
			Assert.assertTrue(rc);
			row = getTempData();

			//If Date format is not set - do not perform substitution
			if (row.get("DATEFORMAT") == null)
			{
				System.out.println("Creation of trip will not be performed, Unknown date format recieved from application");
				return false;
			}


			//Check if Scan Orders menu Item is present - if yes - Try to Inscan and Outscan the order


			TimeUnit.SECONDS.sleep(10);

			//Navigate to Trip Planning - Menu url - Trip Planning 
			String strTripPlanningMenu = getMenuName("Trip Planning");
			strTripPlanningMenu = strTripPlanningMenu.replaceAll(" ", "");
			System.out.println("strTripPlanningMenu: "+strTripPlanningMenu);//
			String strTripPlanningMenuItemXPath = "//*[@id="+strTripPlanningMenu+"]";
			rc = clickElementByXPath(strTripPlanningMenuItemXPath, "Trips Menu Item");
			Assert.assertTrue(rc);

			//Navigate to Orders Planning - Menu url - deliveryPlanning
			String strOrderPlanningMenuItem = getMenuName("deliveryPlanning");
			System.out.println("strOrderPlanningMenuItem: "+strOrderPlanningMenuItem);
			String strTripsMenuItemXPath = "//*[text()="+strOrderPlanningMenuItem+"]";
			rc = clickElementByJavascript(driver, strTripsMenuItemXPath, "Order Planning Menu Item");//clickElementByXPath(strTripsMenuItemXPath, "Order Planning Menu Item");
			Assert.assertTrue(rc);

			//Adding wait for page to load once it reaches Trip Planning Page... 
			TimeUnit.SECONDS.sleep(10);
			
			//Wait for first form element to load -   
			String strRouteNameTextBoxXPath = "//*[@name='routeName']";//"//*[text()='"+strSearchButtonLabel+"']";
			rc = clickElementByXPath(strRouteNameTextBoxXPath, "Route Name text box");//
			Assert.assertTrue(rc);
			
			LinkedHashMap <String, String> pageDataMap = getPageObjects(row, "RoutePlanning_Page");

			//Perform substitution of keywords or functions like AUTOGEN / DATE / BOOLEAN / INTEGER / DECIMAL etc from DataSheet with actual values,
			updateTempData(row);
			pageDataMap = substituteDataMapKeywords (pageDataMap);
			System.out.println("pageDataMap: "+pageDataMap);
			String strRouteName = pageDataMap.get("rp.routeName");
			row.put("RouteName", strRouteName);
			updateTempData(row);

			//Get Structure API for Trip Creation Page - https://demo.loginextsolutions.com/LoginApp/framework/structure?pageName=ROUTE_PLANNING&sectionName=ROUTE_PLANNING_FORM&modelName=ROUTE_PLANNING_FORM
			JsonObject jsonStrAPI_RoutePlanning = getStructureAPI("ROUTE_PLANNING_FORM", "ROUTE_PLANNING", "ROUTE_PLANNING_FORM");
			rc = enterValues(pageDataMap, jsonStrAPI_RoutePlanning.toString());
			Assert.assertTrue(rc);

			//Click Search order - logi-google-analytics="Route planning : Select orders : search orders"
			String strSearchButtonLabel = app_PageLabels.get("search").getAsString();//"";//search
			String strSearchButtonXPath = "//*[@logi-google-analytics='Route planning : Select orders : search orders']";//"//*[text()='"+strSearchButtonLabel+"']";
			rc = clickElementByXPath(strSearchButtonXPath, "Search Button");
			Assert.assertTrue(rc);

			TimeUnit.SECONDS.sleep(15);

			//Wait for Orders to populate - id="ele-orderNo-0"
			int iTotalOrdersOnOrdersPlanning = 0; int iCtr = 0;
			do {
				//Get total orders present on trip planning page
				String strOrdersListXPath = "//*[contains (@id, 'shipmentId-orderNo')]";
				rc = clickElementByXPath(strOrdersListXPath, "Order Id");
				Assert.assertTrue(rc);
				
				TimeUnit.SECONDS.sleep(10);
				
				iTotalOrdersOnOrdersPlanning = driver.findElements(By.xpath(strOrdersListXPath)).size();
				if (iTotalOrdersOnOrdersPlanning > 0){
					break;
				}
				TimeUnit.SECONDS.sleep(5);
				System.out.println(iCtr+"Waiting for orders to populate for the given time frame...");
				iCtr++;
			}while (iTotalOrdersOnOrdersPlanning == 0 && iCtr < 7);
			if (iTotalOrdersOnOrdersPlanning == 0){
				logMessage("Should be able to fetch results for order","Order Results should be fetched", "No Results fetched", "Failed");
				return false;
			}

			JsonObject planningListViewStructure = getStructureAPI("PLANNING", "PLANNING", "PLANNING_LIST_VIEW");	
			String strOrderColumnLabel = planningListViewStructure.get("columns").getAsJsonObject().get("orderNo").getAsJsonObject().get("label").getAsString();//"";//planningListViewStructure.columns.orderNo.label

			//Search Order - Ord_4076716_test - st-search="orderNo" 
			String strSearchInputXPath = "//*[contains (@title, '"+strOrderColumnLabel+"')]//ancestor::div[@role='columnheader']//input";//"";//"//*[@st-search='orderNo']";//"//*[@st-search='orderNo']";
			rc = sendKeys(strSearchInputXPath, strOrderNumber + Keys.ENTER, "Search Order", true);
			Assert.assertTrue(rc);

			//Wait for one result to populate
			int iExpectedOrders = 1;
			iTotalOrdersOnOrdersPlanning = 0; iCtr = 0;
			do {
				//Get total orders present on trip planning page
				String strOrdersListXPath = "//*[contains (@id,'-0-uiGrid-')]//*[@title='"+strOrderNumber+"']";;//"//*[contains (@id, 'ele-orderNo-')]";
				iTotalOrdersOnOrdersPlanning = driver.findElements(By.xpath(strOrdersListXPath)).size();
				if (iTotalOrdersOnOrdersPlanning == iExpectedOrders){
					break;
				}
				System.out.println(iCtr+++"Waiting for searched orders "+strOrderNumber+"...");
				TimeUnit.SECONDS.sleep(1);
			}while (iTotalOrdersOnOrdersPlanning == 0 || iCtr < 3);
			System.out.println("iTotalOrdersOnOrdersPlanning: "+iTotalOrdersOnOrdersPlanning);
			System.out.println("iExpectedOrders: "+iExpectedOrders);
			if (iTotalOrdersOnOrdersPlanning != iExpectedOrders){
				logMessage("Should be able to fetch results for order","Order Results should be fetched", "Unable to get order on row 0 - Searched order : "+strOrderNumber, "Failed");
				return false;
			}
			else {
				logMessage("Verify Order searched", "Order should be appeared on webpage as searched with", "Successfully fetched order", "Passed");
			}

			//Click on Geo Code orders - //*[@class="icon icon-geocoding-not-done"]
			/*String strGeoCodeOrdersXPath = "//*[@class='icon icon-geocoding-not-done']";
			bringElementInView(strGeoCodeOrdersXPath);
			rc = clickElementByXPath(strGeoCodeOrdersXPath, "Geo Code Orders");
			Assert.assertTrue(rc);*/

			String strGeoCodeOrdersXPath = "//*[@class='icon icon-geocoding-not-done']"; 
			int iNonGeoCodedOrders = driver.findElements(By.xpath(strGeoCodeOrdersXPath)).size();
			System.out.println("iNonGeoCodedOrders: "+iNonGeoCodedOrders);
			if (iNonGeoCodedOrders > 0)
			{
				//Click on Geo Code and update Customer Location
				bringElementInView(strGeoCodeOrdersXPath);
				rc = clickElementByXPath(strGeoCodeOrdersXPath, "Geo Code Orders");
				Assert.assertTrue(rc);	

				//Set String in input box - id="searchBox" - value from row.GeoCodingString
				String strSearchBoxXPath = "//*[@id='searchBox']";
				String strGeoCodeString = row.get("GeoCodingString");
				rc = sendKeys(strSearchBoxXPath, strGeoCodeString,
						//+Keys.ENTER, 
						"Geo Code String", true);
				Assert.assertTrue(rc);

				rc = sendKeys(strSearchBoxXPath, Keys.ENTER+"", 
						"Geo Code String", true);
				Assert.assertTrue(rc);

				//Verify values in id="newlatitude" - non zero 
				String strLatitudeXPath = "//*[@id='newlatitude']";
				String strNewLatitudeValue = getAttributeByXPath(strLatitudeXPath, "Latitude", "value");
				System.out.println("strNewLatitudeValue: "+strNewLatitudeValue);

				//Verify Values in id="newlongitude" - non zero
				String strLongitudeXPath = "//*[@id='newlongitude']";
				String strLongitudeValue = getAttributeByXPath(strLongitudeXPath, "Longitude", "value");
				System.out.println("strLongitudeValue: "+strLongitudeValue);

				//Click //*[text()='Update Location'] // Init App - Label -updateLocation
				String strUpdateLocationXPath = "//*[text()='"+app_PageLabels.get("updateLocation").getAsString()+"']";
				bringElementInView_NoWait(strUpdateLocationXPath);//bringElementInView(strUpdateLocationXPath);
				rc = clickElementByXPath(strUpdateLocationXPath, "Update Location Button");
				Assert.assertTrue(rc);

				//Wait for jsPrompt Message Success Message
				String strPromptXPath = "//*[@id='js-prompt']";//"//*[@id='js-prompt']";
				String strExpectedPromptValue = "success";
				rc = waitForJS_PromptMessageJS(strExpectedPromptValue, strPromptXPath);// waitForJS_PromptMessage(strExpectedPromptValue);
				//getElementTextByXPath(strPromptXPath, "Prompt");
				if (rc)
				{
					logMessage("Verify Success Message", "Success Message - "+strExpectedPromptValue+" Successfully should display", "Message : "+strExpectedPromptValue+" is displayed", "Passed");
				}
				else
				{
					String strPromptValue = getPromptElementTextByXPath(strPromptXPath, "Prompt");
					logMessage("Verify Success Message", "Success Message - "+strExpectedPromptValue+" should display", "Success Message is not displayed, Unable to create an order, Expecting Message : "+strExpectedPromptValue+" Actual : "+strPromptValue, "Failed");
					return false;
				}

				//Click Cancel Button - Label - cancel
				String strCancelButtonXPath = "//*[@id=\"geocodingModal\"]//*[contains (@class,'icon-Product-Icons_X')]";//"//a[text()="+app_PageLabels.get("cancel")+"]";
				rc = clickElementByXPath(strCancelButtonXPath, "Cancel Button on Geocoding window");
				Assert.assertTrue(rc);
			}
			else
			{
				strGeoCodeOrdersXPath ="//*[@class='icon icon-geo-coding-done']";
				bringElementInView(strGeoCodeOrdersXPath);
				rc = clickElementByXPath(strGeoCodeOrdersXPath, "Geo Code Orders");
				Assert.assertTrue(rc);

				//Click Cancel Button - Label - cancel
				String strCancelButtonXPath = "//*[@id=\"geocodingModal\"]//*[contains (@class,'icon-Product-Icons_X')]";//"//a[text()="+app_PageLabels.get("cancel")+"]";
				bringElementInView(strCancelButtonXPath);
				rc = clickElementByXPath(strCancelButtonXPath, "Cancel Button on Geocoding window");
				Assert.assertTrue(rc);
			}

			//Wait for geocoding modal to disappear
			TimeUnit.SECONDS.sleep(5);

			//Click Checkbox - label for="js-checkbox-0" - //input id for="js-checkbox-0" 
			String strOrdersSelectCheckbox = "//*[@id='selectAll']";
			String strOrdersSelectCheckboxLabel = "//*[@for='selectAll']";
			rc = clickCheckboxByXPath(strOrdersSelectCheckbox, strOrdersSelectCheckboxLabel, "Select All Orders Checkbox", true);//clickElementByXPath(strOrdersSelectCheckbox, "Select All Orders Checkbox");
			Assert.assertTrue(rc);

			TimeUnit.SECONDS.sleep(5);

			//Click Element - //*[contains (text(),'Click here to select all')] - Click here to select all 1 Orders - Label Key clickHereToSelectAll 
			String strClickAllOrdersElement = "//*[contains (text(),"+app_PageLabels.get("clickHereToSelectAll")+")]";
			rc = clickElementByXPath(strClickAllOrdersElement, "Click Element By XPath");//clickCheckboxByXPath(strOrdersSelectCheckbox, strOrdersSelectCheckboxLabel, "Select All Orders Checkbox", true);//clickElementByXPath(strOrdersSelectCheckbox, "Select All Orders Checkbox");
			Assert.assertTrue(rc);

			//Click Next Button
			String strNextButtonXPath = "//*[text()="+app_PageLabels.get("next")+"]";
			rc = clickElementByXPath(strNextButtonXPath, "Next Button");
			Assert.assertTrue(rc);

			//Click No Contunue Planning Button if exists - NoContinuePlanning
			mutedReporting = true;
			int iTempMaxWaitTime = MAX_WAIT_TIME;
			MAX_WAIT_TIME = 10;

			String strContinuePlanningBtn = "//*[text()="+app_PageLabels.get("NoContinuePlanning")+"]";//NoContinuePlanning
			rc = clickElementByXPath(strContinuePlanningBtn, "No Continue Planning Button");

			//Revert Back Timeout setting
			MAX_WAIT_TIME = iTempMaxWaitTime;
			mutedReporting = false;

			//Searh for Delivery Boy - st-search="deliveryMediumMasterName"
			String strDeliveryBoyTripSearchXPath = "//div[contains (@class,'deliveryMediumMasterName_colKey')]//input";//"//input[@st-search='deliveryMediumMasterName']";
			System.out.println("strDeliveryBoyName : "+strDeliveryBoyName);
			rc = sendKeys(strDeliveryBoyTripSearchXPath, strDeliveryBoyName+Keys.ENTER, "Search Delivery Boy on Trip Planning - Step 2", true);
			Assert.assertTrue(rc);

			TimeUnit.SECONDS.sleep(5);

			//Click Select all for Delivery Boy Checkbox - //*[@id="delMedDetailsTable"]//input[@id="selectAll"]
			String strDeliveryBoyCheckbox = "//input[@id='selectAll']";
			String strDeliveryBoyLabelCheckbox = "//label[@for='selectAll']";
			rc = clickElementByXPath(strDeliveryBoyLabelCheckbox, "Delivery Boy Select All Checkbox");
			//rc = clickCheckboxByXPath(strDeliveryBoyCheckbox, strDeliveryBoyLabelCheckbox, "Delivery Boy Select All Checkbox", true);
			Assert.assertTrue(rc);

			//Click Plan Button - //*[@logi-google-analytics="Route planning : Select Delivery Associates : Start Planning"]  or using Label Plan having label key - plan 
			String strPlanButtonXPath = "//*[@logi-google-analytics='Route planning : Select Delivery Associates : Start Planning']";
			rc = clickElementByXPath(strPlanButtonXPath, "Order Planning - Plan Button");
			Assert.assertTrue(rc);
			//
			//Wait and Verify total deliveries created Should be more than 1 - //i[contains(@class, '-trip-formed')]//ancestor::div[@class='row'][1]//div[contains (@class, 'badgeCount')]
			int iTotalTripsCreated = waitForTripPlanningCount();//
			if (iTotalTripsCreated <= 0)
			{
				logMessage("Fetch Total Trips", "Should be able to fetch total trips", "Total trips created : "+iTotalTripsCreated, "Failed");
				return false;
			}
			else
			{
				logMessage("Fetch Total Trips", "Should be able to fetch total trips", "Total trips created : "+iTotalTripsCreated, "Passed");	
			}
			return true;
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			logMessage("Create Trip", "Should be able to create trip", "Unable to create trip, "+e.getLocalizedMessage(), "Failed");
			return false;
		}
	}

	public boolean startTrip (){
		try 
		{
			LinkedHashMap<String, String> row = getTempData();
			String strRouteName = row.get("RouteName");

			//Click Close Icon if Exists 
			mutedReporting = true;
			int iTempMaxWaitTime = MAX_WAIT_TIME;
			MAX_WAIT_TIME = 10;
			String strCloseIconXPath = "//*[@class='modal-header']//button[text()='×']";
			rc = clickElementByXPath(strCloseIconXPath, "Close Button");

			TimeUnit.SECONDS.sleep(7);
			
			//Revert Back Timeout setting
			MAX_WAIT_TIME = iTempMaxWaitTime;
			mutedReporting = false;
			//Assert.assertTrue(rc);

			//Click Start Trip Button
			String strStartTripButtonXPath = "//a[contains (@id, 'startTrip')]//span";//"//*[text()="+app_PageLabels.get("STARTTRIP_WH")+"]";
			bringElementInView_NoWait(strStartTripButtonXPath);
			rc = clickElementByJavascript(driver, strStartTripButtonXPath,  "Start Trip Button");//clickElementByXPath(strStartTripButtonXPath, "Start Trip Button");
			Assert.assertTrue(rc);

			TimeUnit.SECONDS.sleep(3);
			
			//Click Start 
			strStartTripButtonXPath = "//button[@data-bb-handler=\"confirm\"]//i[contains(@class,'icon-Product-Icons_Check-Circle')]";//"//button[contains (text(), 'Start')]";//"//*[text()="+app_PageLabels.get("STARTTRIP_WH")+"]";
			rc = clickElementByXPath(strStartTripButtonXPath, "Start Button on Prompt window");
			Assert.assertTrue(rc);

			TimeUnit.SECONDS.sleep(3);

			//Find Elements on page having String - STARTED - Should be more than zero
			int iTotalTripsStarted = driver.findElements(By.xpath("//*[contains (text(),'STARTED')]")).size();
			System.out.println("iTotalTripsStarted : "+iTotalTripsStarted);
			if (iTotalTripsStarted > 0){
				logMessage("Verify Trip is started", "Should be able to verify that trip is started", "Trip is started : Route Name : "+strRouteName, "Passed");
			}
			else {
				logMessage("Verify Trip is started", "Should be able to verify that trip is started", "Trip is not started : Route Name : "+strRouteName, "Failed");
				return false;
			}	
			return true;
		}
		catch (Exception e) 
		{
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
	}

	public boolean createTrip_NewUI (LinkedHashMap<String, String> row) {
		try 
		{
			System.out.println("Creating Trip with : "+row.get("OrderNumber"));
			System.out.println("Using Delivery Boy for Trip : "+row.get("db.deliveryMediumMasterName"));

			String strOrderNumber = row.get("OrderNumber");
			String strDeliveryBoyName  = row.get("db.deliveryMediumMasterName");

			//strOrderNumber = "Ord_4076716_test";
			//strDeliveryBoyName  = row.get("db.deliveryMediumMasterName");

			if (isApplicationLaunched == false)
			{

				//Launch Application
				rc = launchApplication (row);
				Assert.assertTrue(rc);

				//launch app
				rc = login(row);
				Assert.assertTrue(rc);

				//Authenticate and fetch back token from API
				row = getAuthDetailsWeb(row);
				Assert.assertNotNull(row);

				//init label objects
				rc = initApp_PageLabels(row);
				Assert.assertTrue(rc);

				//init menu objects
				rc = initApp_MenuItems(row);
				Assert.assertTrue(rc);

			}

			//Get client properties w.r.t Date Format / Currentcy Format, etc
			rc = getApplicationProperties(row);
			Assert.assertTrue(rc);
			row = getTempData();

			//If Date format is not set - do not perform substitution
			if (row.get("DATEFORMAT") == null)
			{
				System.out.println("Creation of trip will not be performed, Unknown date format recieved from application");
				return false;
			}

			//Navigate to Trip Planning - Menu url - Trip Planning 
			String strTripPlanningMenu = getMenuName("Trip Planning");
			strTripPlanningMenu = strTripPlanningMenu.replaceAll(" ", "");
			System.out.println("strTripPlanningMenu: "+strTripPlanningMenu);//
			String strTripPlanningMenuItemXPath = "//*[@id="+strTripPlanningMenu+"]";
			rc = clickElementByXPath(strTripPlanningMenuItemXPath, "Trips Menu Item");
			Assert.assertTrue(rc);

			//Navigate to Orders Planning - Menu url - deliveryPlanning
			String strOrderPlanningMenuItem = getMenuName("deliveryPlanning");
			System.out.println("strOrderPlanningMenuItem: "+strOrderPlanningMenuItem);
			String strTripsMenuItemXPath = "//*[text()="+strOrderPlanningMenuItem+"]";
			rc = clickElementByJavascript(driver, strTripsMenuItemXPath, "Order Planning Menu Item");//clickElementByXPath(strTripsMenuItemXPath, "Order Planning Menu Item");
			Assert.assertTrue(rc);

			LinkedHashMap <String, String> pageDataMap = getPageObjects(row, "RoutePlanning_Page");

			//Perform substitution of keywords or functions like AUTOGEN / DATE / BOOLEAN / INTEGER / DECIMAL etc from DataSheet with actual values,
			updateTempData(row);
			pageDataMap = substituteDataMapKeywords (pageDataMap);
			System.out.println("pageDataMap: "+pageDataMap);

			//Get Structure API for Trip Creation Page - https://demo.loginextsolutions.com/LoginApp/framework/structure?pageName=ROUTE_PLANNING&sectionName=ROUTE_PLANNING_FORM&modelName=ROUTE_PLANNING_FORM
			JsonObject jsonStrAPI_RoutePlanning = getStructureAPI("ROUTE_PLANNING_FORM", "ROUTE_PLANNING", "ROUTE_PLANNING_FORM");
			rc = enterValues(pageDataMap, jsonStrAPI_RoutePlanning.toString());
			Assert.assertTrue(rc);

			//Click Search order - logi-google-analytics="Route planning : Select orders : search orders"
			String strSearchButtonLabel = app_PageLabels.get("search").getAsString();//"";//search
			String strSearchButtonXPath = "//*[@logi-google-analytics='Route planning : Select orders : search orders']";//"//*[text()='"+strSearchButtonLabel+"']";
			rc = clickElementByXPath(strSearchButtonXPath, "Search Button");
			Assert.assertTrue(rc);

			//Wait for Orders to populate - id="ele-orderNo-0"
			int iTotalOrdersOnOrdersPlanning = 0; int iCtr = 0;
			do {
				//Get total orders present on trip planning page
				String strOrdersListXPath = "//*[contains (@type, 'checkbox')]";
				iTotalOrdersOnOrdersPlanning = driver.findElements(By.xpath(strOrdersListXPath)).size();
				if (iTotalOrdersOnOrdersPlanning > 1){
					break;
				}
				iCtr++;
				TimeUnit.SECONDS.sleep(1);
				System.out.println(iCtr+"Waiting for orders to populate for the given time frame...");
			}while (iTotalOrdersOnOrdersPlanning == 0 && iCtr < MAX_WAIT_TIME);
			if (iTotalOrdersOnOrdersPlanning == 0){
				logMessage("Should be able to fetch results for order","Order Results should be fetched", "No Results fetched", "Failed");
				return false;
			}

			//Search Order - Ord_4076716_test - st-search="orderNo" 
			//https://testing.loginextsolutions.com/LoginApp/framework/structure?modelName=PLANNING&pageName=PLANNING&sectionName=PLANNING_LIST_VIEW
			JsonObject planningListViewStructure = getStructureAPI("PLANNING", "PLANNING", "PLANNING_LIST_VIEW");	

			String strOrderColumnLabel = planningListViewStructure.get("columns").getAsJsonObject().get("orderNo").getAsJsonObject().get("label").getAsString();//"";//planningListViewStructure.columns.orderNo.label
			String strSearchInputXPath = "//*[contains (@title, '"+strOrderColumnLabel+"')]//ancestor::div[@role='columnheader']//input";//"";//"//*[@st-search='orderNo']"; 
			rc = sendKeys(strSearchInputXPath, strOrderNumber + Keys.ENTER, "Search Order Textbox", true);
			Assert.assertTrue(rc);

			//Wait for one result to populate
			int iExpectedOrders = 1; 

			iTotalOrdersOnOrdersPlanning = 0; iCtr = 0;
			do {
				//Get total orders present on trip planning page
				String strOrdersListXPath = "//*[contains (@id,'-0-uiGrid-')]//*[@title='"+strOrderNumber+"']";//Ord_6460211_test"]";//"//*[contains (@type, 'checkbox')]";
				iTotalOrdersOnOrdersPlanning = driver.findElements(By.xpath(strOrdersListXPath)).size();
				if (iTotalOrdersOnOrdersPlanning == iExpectedOrders){
					break;
				}

				iCtr++;
				TimeUnit.SECONDS.sleep(1);
				System.out.println(iCtr+"Waiting for searched orders "+strOrderNumber+"...");
			}while (iTotalOrdersOnOrdersPlanning != iExpectedOrders && iCtr < MAX_WAIT_TIME);

			System.out.println("iTotalOrdersOnOrdersPlanning: "+iTotalOrdersOnOrdersPlanning);
			System.out.println("iExpectedCheckboxCount: "+iExpectedOrders);
			if (iTotalOrdersOnOrdersPlanning != iExpectedOrders){
				logMessage("Should be able to fetch results for order","Order Results should be fetched", "Unable to get order on row 0 - Searched order : "+strOrderNumber, "Failed");
				return false;
			}
			else {
				logMessage("Verify Order searched", "Order should be appeared on webpage as searched with", "Successfully fetched order", "Passed");
			}

			//Click on Geo Code orders - //*[@class="icon icon-geocoding-not-done"]
			String strGeoCodeOrdersXPath = "//*[@class='icon icon-geocoding-not-done']"; 
			int iNonGeoCodedOrders = driver.findElements(By.xpath(strGeoCodeOrdersXPath)).size();
			System.out.println("iNonGeoCodedOrders: "+iNonGeoCodedOrders);
			if (iNonGeoCodedOrders > 0)
			{
				//Click on Geo Code and update Customer Location
				rc = clickElementByXPath(strGeoCodeOrdersXPath, "Geo Code Orders");
				Assert.assertTrue(rc);	
			}
			else
			{
				strGeoCodeOrdersXPath ="//*[@class='icon icon-geo-coding-done']";
				rc = clickElementByXPath(strGeoCodeOrdersXPath, "Geo Code Orders");
				Assert.assertTrue(rc);
			}

			//If Tutorial overlay exists - click on it to remove - //*[@class="mapTutorial_image"]
			int iTutorialExists  = driver.findElements(By.xpath("//*[@class='mapTutorial_image']")).size();
			if (iTutorialExists > 0){
				driver.findElement(By.xpath("(//*[@class='mapTutorial_image'])[1]")).click();
			}

			//Set String in input box - id="searchBox" - value from row.GeoCodingString
			String strSearchBoxXPath = "//*[@placeholder='Enter location to geocode' or @placeholder='Search Location']";//"//*[@id='searchBox']";
			String strGeoCodeString = row.get("GeoCodingString");
			rc = sendKeys(strSearchBoxXPath, strGeoCodeString+Keys.ENTER, "Geo Code String", true);
			Assert.assertTrue(rc);

			//Verify values in id="newlatitude" - non zero 
			String strLatitudeXPath = "//*[@placeholder='Latitude']";
			String strNewLatitudeValue = getAttributeByXPath(strLatitudeXPath, "Latitude", "value");
			System.out.println("strNewLatitudeValue: "+strNewLatitudeValue);

			//Verify Values in id="newlongitude" - non zero
			String strLongitudeXPath = "//*[@placeholder='Longitude']";
			String strLongitudeValue = getAttributeByXPath(strLongitudeXPath, "Longitude", "value");
			System.out.println("strLongitudeValue: "+strLongitudeValue);

			//Click //*[text()='Update Location'] // Init App - Label -updateLocation
			String strUpdateLocationXPath = "//*[text()='"+app_PageLabels.get("updateLocation").getAsString()+"']";
			rc = clickElementByXPath(strUpdateLocationXPath, "Update Location Button");
			Assert.assertTrue(rc);

			//Wait for jsPrompt Message Success Message
			String strPromptXPath = "//*[@id='js-prompt']";//"//*[@id='js-prompt']";
			String strExpectedPromptValue = "success";
			rc = waitForJS_PromptMessageJS(strExpectedPromptValue, strPromptXPath);// waitForJS_PromptMessage(strExpectedPromptValue);
			String strPromptValue = getPromptElementTextByXPath(strPromptXPath, "Prompt");//getElementTextByXPath(strPromptXPath, "Prompt");
			if (rc)
			{
				logMessage("Verify Success Message", "Success Message - "+strExpectedPromptValue+" Successfully should display", "Message : "+strExpectedPromptValue+" is displayed", "Passed");
			}
			else
			{
				logMessage("Verify Success Message", "Success Message - "+strExpectedPromptValue+" should display", "Success Message is not displayed, Unable to create an order, Expecting Message : "+strExpectedPromptValue+" Actual : "+strPromptValue, "Failed");
				return false;
			}

			//Click Cancel Button - Label - cancel
			String strCancelButtonXPath = "//*[@text()='"+app_PageLabels.get("cancel")+"']";
			rc = clickElementByXPath(strCancelButtonXPath, "Cancel Button");
			Assert.assertTrue(rc);

			//Click Checkbox - label for="js-checkbox-0" - //input id for="js-checkbox-0" 

			//Click Next Button - Label - next



			return true;
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			logMessage("Create Trip", "Should be able to create trip", "Unable to create trip, "+e.getLocalizedMessage(), "Failed");
			return false;
		}
	}

	public boolean stopTrip (LinkedHashMap<String, String> row) {

		try 
		{

			//Mark Order as Delivered - row.get("OrderNumber");
			isApplicationLaunched = true;
			rc = markOrderDelivered(row);//
			Assert.assertTrue(rc);

			//Navigate to Trips Menu - Trip Planning
			String strTripPlanningMenu = getMenuName("Trip Planning");
			strTripPlanningMenu = strTripPlanningMenu.replaceAll(" ", "");
			System.out.println("strTripPlanningMenu: "+strTripPlanningMenu);
			String strTripPlanningMenuItemXPath = "//*[@id="+strTripPlanningMenu+"]";
			rc = clickElementByXPath(strTripPlanningMenuItemXPath, "Trips Menu Item");
			Assert.assertTrue(rc);

			//Click Trips Menu Item
			String strTripsMenuItem = getMenuName("trip");
			System.out.println("strTripsMenuItem: "+strTripsMenuItem);
			String strTripsMenuItemXPath = "//*[text()="+strTripsMenuItem+"]";
			rc = clickElementByJavascript(driver, strTripsMenuItemXPath, "Trips Menu Item");//clickElementByXPath(strTripsMenuItemXPath, "Trips Menu Item");
			Assert.assertTrue(rc);

			//Get the page structure and find the column associated with Milk Run Name - http://10.124.92.41/LoginApp/framework/structure?modelName=TRIPS&pageName=TRIPS&sectionName=ALL_TRIPS_LIST_VIEW
			JsonObject drsListViewJsonResultData = getStructureAPI("TRIPS", "TRIPS", "ALL_TRIPS_LIST_VIEW");
			System.out.println("drsListViewColumns : "+drsListViewJsonResultData);
			String strMilkRunLabel = drsListViewJsonResultData.getAsJsonObject().get("columns").getAsJsonObject().get("milkRun").getAsJsonObject().get("label").getAsString();// milkRun
			System.out.println("strMilkRunLabel: "+strMilkRunLabel);

			//Search for Route ID / Milk Run Name - System.out.println(row.get("RouteName"));
			String strSearchByMilkRunXPath = "//*[contains (@title, '"+strMilkRunLabel+"')]//ancestor::div[@role='columnheader']//input";
			System.out.println("Searching for route : "+row.get("RouteName"));
			String strMilkRunName = row.get("RouteName");
			rc = sendKeys(strSearchByMilkRunXPath, strMilkRunName + Keys.ENTER, "Milk Run - Search Textbox", true);
			Assert.assertTrue(rc);

			//Verify Route Search Results come on first row - //*[contains (@id, '-0-uiGrid-')]//a[text()='RouteName_MilkRunName']
			String strRoutePresentXPath = "//*[contains (@id, '-0-uiGrid-')]//a[text()='"+strMilkRunName+"']"; 
			String strRouteNameOnSearchWith = getElementTextByXPath(strRoutePresentXPath, "Milk Run Name - Searched with");
			if (strRouteNameOnSearchWith != null && strRouteNameOnSearchWith.equalsIgnoreCase(strMilkRunName) == false){
				logMessage("Search for Milk Run", "Should be able to search with Milk Run", "Route Name does not exists : Searched with - "+strMilkRunName+", and Fetched : "+strRouteNameOnSearchWith+" on row 0", "Failed");
				return false;
			}
			else {
				logMessage("Search for Milk Run", "Should be able to search with Milk Run", "Route Name exists : Searched with - "+strMilkRunName+", and Fetched : "+strRouteNameOnSearchWith+" on row 0", "Passed");
			}

			//Check Route Name Checkbox - //*[contains (@id, '-0-uiGrid-')]//*[@role='checkbox'] 
			String strRouteNameCheckboxXPath = "//*[contains (@id, '-0-uiGrid-')]//*[@role='checkbox']";
			rc = clickElementByXPath(strRouteNameCheckboxXPath, "Route Name Checkbox");
			Assert.assertTrue(rc);

			//Click More Button 
			String strMoreButton = "//*[@id='more-action']";
			rc = clickElementByXPath(strMoreButton, "More Button");
			Assert.assertTrue(rc);

			//Click End Trip
			String strEndTripXPath = "//*[@logi-google-analytics='mileTrip - endTrip-record']";
			rc = clickElementByXPath(strEndTripXPath, "End Trip Button");
			Assert.assertTrue(rc);

			//Click Stop Trip - //button[text()='Stop']
			String strModalStopXPath = "//span[text()='Stop']";//"//button[text()='Stop']";
			rc = clickElementByXPath(strModalStopXPath, "Stop");
			Assert.assertTrue(rc);

			//Check if this checkbox exists ? for="selectAll" - >  if yes - > Check the checkbox and click button with key - > 'deliver' 
			String strSelectAllOrdersCheckboxLabel = "//label[@for=\"selectAll\"]";
			
			mutedReporting = true;
			int iTempMaxWaitTime = MAX_WAIT_TIME;
			MAX_WAIT_TIME = 30;
		
			try {
				rc = verifyElementVisible_DynamicWaits(strSelectAllOrdersCheckboxLabel, "Select All Label");//(strSelectAllOrdersCheckboxLabel, "Select All Checkbox");	
			} catch (Exception e) {
				System.err.println("No select all checkboxes available...");
				rc = false;
			}
			
			if (rc == true)
			{////
				mutedReporting = false;
				//Click Select All checkbox
				String strSelectAllCheckbox = "//input[@id=\"selectAll\"]";
				rc = clickCheckboxByXPath(strSelectAllCheckbox, strSelectAllOrdersCheckboxLabel, "Select All Orders", true);
				if (rc == true)
				{
					System.out.println("Clicked select all orders checkbox...");
				}
				else
				{
					System.out.println("Unable to Click select all orders checkbox...");
				}
				
				//Click Deliver button
				String strDeliverButtonXPath = "//*[text()='"+getLabel_PageLabelAPI(row, "deliver")+"']";
				scrollIntoElementByXPath_NoRecovery(strDeliverButtonXPath, "Deliver Button");
				rc = clickElementByXPath(strDeliverButtonXPath, "Deliver Button");
				Assert.assertTrue(rc);
				
			}
			else
			{
				System.out.println("Trip has all the orders delivered...");
			}
			MAX_WAIT_TIME = iTempMaxWaitTime; 
			mutedReporting = false;
			//Update End - normal case when no popup is shown...
			
			String strExpectedJsMessage = "Trip stopped successfully";
			String strPromptXPath = "//*[@id='js-prompt')]";
			rc = waitForJS_PromptMessageJS(strExpectedJsMessage, strPromptXPath);
			if (rc){
				logMessage("Stop Trip", "Should be able to fetch Prompt Message", "Successfully stopped trip : Message displayed : "+strExpectedJsMessage, "Passed");
			}
			else {
				String strActualMessage = getPromptElementTextByXPath(strPromptXPath, "Prompt Message");
				logMessage("Stop Trip", "Should be able to fetch Prompt Message", "Unable to stop trip : Message not displayed : "+strExpectedJsMessage + ", Actual Message found : "+strActualMessage, "Failed");
			}
			Assert.assertTrue(rc);
		}
		catch (Exception e) 
		{
			logMessage("Get details of trip stopped", "Trip stop test should be performed", "Error in Trip Stop"+e.getLocalizedMessage(), "Failed");
			e.printStackTrace();
			return false;
		}
		return true;
	}


	public LinkedHashMap<String, String> updateCustomerLocationGeoCode (LinkedHashMap<String, String> row) {
		try 
		{

			String strOrderNumber = row.get("OrderNumber");
			if (strOrderNumber== null || strOrderNumber.equals("")){
				System.out.println("Order Number is null..");

				//Update - Creating order using rest API
				updateTempData(row);
				rc = authenticate_ClientAPI();//
				System.out.println("rc : "+rc);
				row = getTempData();

				//add Order// - this will add into global var last added order
				JsonObject o = addOrder_ClientAPI();
				System.out.println("o "+o);//
				System.out.println("strLastAddedOrder : "+strLastAddedOrder);

				//End - Creation of order using rest API

			}
			//navigateToOrdersPage(row);
			//row.put("OrderNumber", "Ord_0699229_test");

			row = getTempData();
			strOrderNumber = row.get("OrderNumber");
			if (strOrderNumber== null || strOrderNumber.equals("")){
				System.out.println("Order Number is null..");
				return null;
			}
			System.out.println("Order Number to geocode : "+strOrderNumber);

			//Navigate to orders page
			row = navigateToOrdersPage(row);
			
			//Click Order Menu
			String strOrderMenu = getMenuName("order");
			strOrderMenu = strOrderMenu.replaceAll(" ", "");
			System.out.println("strOrderMenuItem : "+strOrderMenu);
			String strOrderItemXPath = "//*[@id="+strOrderMenu+"]";
			rc = clickElementByXPath(strOrderItemXPath, "Order Menu Item");
			Assert.assertTrue(rc);

			//Click Update Cusotmer Location
			String strGeocodingMenuItem = getMenuName("geocoding");
			System.out.println("strTripsMenuItem: "+strGeocodingMenuItem);
			String strUpdateCustLocXPath = "//*[text()="+strGeocodingMenuItem+"]";
			rc = clickElementByJavascript(driver, strUpdateCustLocXPath, "Update Customer Location");//clickElementByXPath(strUpdateCustLocXPath, "Update Customer Location");
			Assert.assertTrue(rc);

			TimeUnit.SECONDS.sleep(15);
			
			//Get Structure API for List view page on Update Customer Location - https://demo.loginextsolutions.com/LoginApp/framework/structure?modelName=GEOCODING&pageName=GEOCODING&sectionName=GEOCODING_LIST_VIEW
			JsonObject geocodingListViewStructureJson = getStructureAPI("GEOCODING", "GEOCODING", "GEOCODING_LIST_VIEW");
			System.out.println("geocodingListViewStructureJson: "+geocodingListViewStructureJson);
			Assert.assertNotNull(geocodingListViewStructureJson);

			//Wait for Response from List API - GET - https://demo.loginextsolutions.com/ClientApp/clientnode/list?pageNumber=1&pageSize=50&searchBy=
			JsonObject geoCodingListViewResults = getGeoCodingListView_API("1", "50");
			System.out.println("geoCodingListViewResults: "+geoCodingListViewResults);

			//Optional - Iterate over all order list present on Update Customer Page

			//Search for order number 
			String strOrderNumberLabel_TableColumn = geocodingListViewStructureJson.get("columns").getAsJsonObject().get("orderNo").getAsJsonObject().get("id").getAsString();//columns.orderNo.id
			String strSearchByOrderXPath = "//*[contains (@class, '"+strOrderNumberLabel_TableColumn+"')]//input";//"//*[@columnname='"+strOrderNumberLabel_TableColumn+"']//input";//*[contains (@title, '"+strOrderColumnLabel+"')]//ancestor::div[@role='columnheader']//input";
			rc = sendKeys(strSearchByOrderXPath, strOrderNumber + Keys.ENTER, "Search By Order Number", true);
			Assert.assertTrue(rc);

			TimeUnit.SECONDS.sleep(12);

			//Verify Results on row 0
			String strOrderOnRow0XPath = "//*[contains (text(),'"+strOrderNumber+"')]";
			String strOrderSearchedWith = getElementTextByXPath(strOrderOnRow0XPath, "Order Number on first row");
			if (strOrderSearchedWith == null || strOrderSearchedWith.equals("") || strOrderSearchedWith.equals(strOrderNumber) == false){
				return null;
			}

			//Wait for overlay to exit after search
			TimeUnit.SECONDS.sleep(15);
			
			//Click Radio Button present on row - 0
			String strSelectOrderRadioXPath = "(//label[contains (@for, 'js-')])[1]";//"//*[@id='js-0']";//*[@id='js-0']
			rc = clickElementByXPath(strSelectOrderRadioXPath, "Order Radio Button");
			Assert.assertTrue(rc);

			//If Tutorial overlay exists - click on it to remove - //*[@class="mapTutorial_image"]
			int iTutorialExists  = driver.findElements(By.xpath("//*[@class='mapTutorial_image']")).size();
			if (iTutorialExists > 0){
				rc = clickElementByJavascript(driver, "(//*[@class='mapTutorial_image'])[1]", "Map Tutorial");//driver.findElement(By.xpath("(//*[@class='mapTutorial_image'])[1]")).click();
			}

			//Set String in input box - id="searchBox" - value from row.GeoCodingString
			String strSearchBoxXPath = "//*[contains (@class,'addressBox')]//input";//"//*[@id='searchBox']";
			String strGeoCodeString = row.get("GeoCodingString");
			rc = sendKeys(strSearchBoxXPath, strGeoCodeString,
					//+Keys.ENTER, 
					"Geo Code String", true);
			Assert.assertTrue(rc);

			rc = sendKeys(strSearchBoxXPath, Keys.ENTER+"", 
					"Geo Code String", true);
			Assert.assertTrue(rc);

			//Verify values in id="newlatitude" - non zero 
			String strLatitudeXPath = "//*[contains (@class,'latitudeInput')]";//"//*[@id='newlatitude']";
			String strNewLatitudeValue = getAttributeByXPath(strLatitudeXPath, "Latitude", "value");
			System.out.println("strNewLatitudeValue: "+strNewLatitudeValue);


			//Verify Values in id="newlongitude" - non zero
			String strLongitudeXPath =  "//*[contains (@class,'longitudeInput')]"; //"//*[@id='newlongitude']";
			String strLongitudeValue = getAttributeByXPath(strLongitudeXPath, "Longitude", "value");
			System.out.println("strLongitudeValue: "+strLongitudeValue);

			//Click //*[text()='Update Location'] // Init App - Label -updateLocation
			String strUpdateLocationXPath = "//*[@logi-google-analytics='Save geocode']";//Save Button //"//*[text()='"+app_PageLabels.get("updateLocation").getAsString()+"']";
			bringElementInView_NoWait(strUpdateLocationXPath);//bringElementInView(strUpdateLocationXPath);
			rc = clickElementByXPath(strUpdateLocationXPath, "Update Location Button");
			Assert.assertTrue(rc);

			//Wait for jsPrompt Message Success Message
			String strPromptXPath = "//*[@id='js-prompt']";//"//*[@id='js-prompt']";
			String strExpectedPromptValue = "success";
			rc = waitForJS_PromptMessageJS(strExpectedPromptValue, strPromptXPath);// waitForJS_PromptMessage(strExpectedPromptValue);
			//getElementTextByXPath(strPromptXPath, "Prompt");
			if (rc)
			{
				logMessage("Verify Success Message", "Success Message - "+strExpectedPromptValue+" Successfully should display", "Message : "+strExpectedPromptValue+" is displayed", "Passed");
			}
			else
			{
				String strPromptValue = getPromptElementTextByXPath(strPromptXPath, "Prompt");
				logMessage("Verify Success Message", "Success Message - "+strExpectedPromptValue+" should display", "Success Message is not displayed, Expecting Message : "+strExpectedPromptValue+" Actual : "+strPromptValue, "Failed");
				return null;
			}

			//Search order - Page gets refreshed 
			//rc = sendKeys(strSearchByOrderXPath, strOrderNumber + Keys.ENTER, "Search By Order Number", true);
			//Assert.assertTrue(rc);
			TimeUnit.SECONDS.sleep(10);

			//Verify Element Exists 
			String strGeoCodeOrdersXPath ="//*[contains (@class, 'icon icon-geo-coding-done')]";
			bringElementInView(strGeoCodeOrdersXPath);
			rc = clickElementByXPath(strGeoCodeOrdersXPath, "Geo Code Done Orders");
			//Assert.assertTrue(rc);

			if (rc == false){
				logMessage("Verify Geocoding","Orders should be geocoded", "Orders not geocoded", "Failed");
				return null;
			}
			else {
				logMessage("Verify Geocoding","Orders should be geocoded", "Orders successfully geocoded : "+strOrderNumber, "Passed");
			}

			return row;
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			logMessage("Update Customer Location", "Should be able to update customer location", "Unable to update customer location, Error :"+e.getLocalizedMessage(), "Failed");
			return null;
		}

	}


	/**
	 * Will update the current reporting logger to a new file 
	 * Use this function when you are trying to triiger multiple tests in one single scenario i.e Trying to create a flow rather than multiple methods Eg. Order Creation -> Geocode that order
	 * @param testReport
	 */
	public void updateTestLogger (TestReporter testReport) {
		this.report = testReport;
	}

	public String captureScreenshot (WebDriver driver){
		File scrFile = null;
		String strCurrentImagePath = null;
		String strCurrentImageName = "info_image_"+System.currentTimeMillis()+".png";
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
	public boolean orderReportDownload (LinkedHashMap<String, String> row) {
		try 
		{
			row = navigateToOrdersPage(row);
			Assert.assertTrue(rc);

			//Set Date filter
			//Click  - id="orderHeaderDateRange" - //*[@id="orderHeaderDateRange"]
			String strOrderHederDateRangeXPath = "//*[@id='orderHeaderDateRange']";
			rc = clickElementByXPath(strOrderHederDateRangeXPath, "Order Header Date Range");
			Assert.assertTrue(rc);

			TimeUnit.SECONDS.sleep(5);
			/*
			//Click Last 30 Days Date range - Label - last30Days  - //*[text()='30 Hari Terakhir']
			String strLast30DaysDateRangeXPath = "//*[@class='ranges']//ul";//"//li[text()="+app_PageLabels.get("last30Days")+"]";
			Select dateRanges = new Select (driver.findElement(By.xpath(strLast30DaysDateRangeXPath)));
			dateRanges.selectByValue(app_PageLabels.get("last30Days").toString());
			logMessage("Select Dropdown", "Should be able to select option from doropdown", "Successfully able to select last 30 days from dropdown", "Passed");
			//rc = clickElementByXPath(strOrderHederDateRangeXPath, "Last 30 Days - Order Header Date Range");
			//Assert.assertTrue(rc);
			 */

			//Click Last 30 Days Date range - Label - last30Days  - //*[text()='30 Hari Terakhir']
			String strLast30DaysDateRangeXPath = "//*[contains(@style,'display')]//li[text()='Last 7 Days']";
			clickElementByXPath(strOrderHederDateRangeXPath, "Last 7 Days - Order Header Date Range");
			rc = clickElementByJavascript(driver, strLast30DaysDateRangeXPath, "Last 7 Days");
			Assert.assertTrue(rc);

			TimeUnit.SECONDS.sleep(10);

			//Click Download Report Button - //*[@aria-label='Download All Orders Report'or @title='Download All Orders Report'] -  //*[@logi-google-analytics="Orders - download format"]
			String strDownloadButton = "//*[@aria-label='"+getLabel_PageLabelAPI(row, "downloadAllOrdersReport")+"'or @title='"+getLabel_PageLabelAPI(row, "downloadAllOrdersReport")+"']";//"//*[@logi-google-analytics='Orders - download format']";
			//rc = clickElementByXPath(strDownloadButton, "Download Template");
			rc = clickElementByJavascript(driver,strDownloadButton, "Download Template");
			//focusElement(strDownloadButton);
			Assert.assertTrue(rc);

			//Get Last Modified File - and wait for System to download file
			File f1_lastModFile = lastFileModified(strLocalWebDownloadsDir);
			System.out.println("f1_lastModFile : "+f1_lastModFile);

			//Click Excel Button - //*[text()='Excel']
			//String strExcelBtnXPath = "//*[text()='Excel']";
			//rc = clickElementByXPath(strExcelBtnXPath, "Excel");
			TimeUnit.SECONDS.sleep(5);

			String strExcelBtnXPath = "//span[text()='"+getLabel_PageLabelAPI(row, "downloadCsv")+"']//ancestor::button[1]"; 
			focusElement(strExcelBtnXPath);//
			rc = clickElementByJavascript(driver, strExcelBtnXPath, "CSV Button");///(strExcelBtnXPath, "CSV Button");//clickElementByJavascript(driver,strExcelBtnXPath, "Excel");
			//rc = clickElementByXPath(strDownloadButton, "Download Template");
			Assert.assertTrue(rc);

			TimeUnit.SECONDS.sleep(5);
			System.out.println("File Downloaded...");

			//Wait for - last Modified File To Get Changed 
			//File f2_lastModFile = //getDownloadedFile(f1_lastModFile);
			//Assert.assertNotNull(f2_lastModFile);

			int iExpectedFilesToBeDownloaded = 1;
			/*
			Configuration configurationProperties = Configuration.getConfigurationInstance();
			if (configurationProperties.getBrowser().equalsIgnoreCase("chrome")
					&& configurationProperties.getExecutionMode().equalsIgnoreCase("CI"))
			{
				iExpectedFilesToBeDownloaded = 1;
			}
			 */
			System.out.println("iExpectedFilesToBeDownloaded: "+iExpectedFilesToBeDownloaded);	

			List <File> lastModFiles = getDownloadedFiles(f1_lastModFile, iExpectedFilesToBeDownloaded);

			//Display all filenames which are added to list
			for (int i = 0; i < lastModFiles.size(); i++) 
			{
				logMessage("Get File Name", "Should be able to get the downloaded file name", "Successfully able to get file name : "+lastModFiles.get(i).getName(), "Passed");
			}

			if (iExpectedFilesToBeDownloaded != lastModFiles.size())
			{
				logMessage("Get Last Modified Files", "Should be able to fetch files from local filesystem", "Unable to get "+iExpectedFilesToBeDownloaded+" Files from Local FileSystem, Total Files Downloaded : "+lastModFiles.size()+" ", "Failed");
				return false;
			}
			else 
			{
				logMessage("Get Last Modified Files", "Should be able to fetch files from local filesystem", "Successfully able to get "+iExpectedFilesToBeDownloaded+" Files from Local FileSystem, Total Files Downloaded : "+lastModFiles.size()+" ", "Passed");
			}

			
			//Update - Extract zip file after download
			f1_lastModFile = lastModFiles.get(0);
			File downloadedOrderZip = f1_lastModFile;
			lastModFiles = getUncompressedZipFiles(downloadedOrderZip);
			//Update End - Order report is now read using zip
			
			File f2_lastModFile = null;
			for (int i = 0; i < lastModFiles.size(); i++) 
			{
				if (lastModFiles.get(i).getName().toLowerCase().contains("ord")){
					f2_lastModFile = lastModFiles.get(i); 
				}
			}

			if (f2_lastModFile == null)
			{
				logMessage("Get Order File", "Should be able to get file starting with Order_***", "Report having name of ORD_TIMESTAMP not downloaded", "Failed");
				return false;
			}

			try {

				//Validate Columns in Downloaded Excel File... - Employee Id	Branch Name	User Group	Delivery Associate Name	Mobile Number	IMEI Number	Username	Capacity (in Units)	Capacity (in Kg)	Capacity (in Cc)	Vehicle Ownership	Vehicle Number	Delivery Associate Type	Mapped Geofence	Preferred Zip Code	Shift Timings	Weekly Off	Fixed Cost	Variable Cost	Active/Inactive	Active/Inactive Reason	Active/Inactive Since	Attendance	Status	On Break	Active Trip	Trip Start Date	Last Tracking Date	Current Cash Balance	Alternate Mobile Number	Landline Number	Email Id	Date of Birth	Language	Gender	Marital Status	Current Address	Permanent Address	License Issuance Date	License Validity in Years	License Number	License Expiry Date
				String strExcelColumnKeysToValidate [] = { "awbNo", "orderNo", "clientName", "Order Branch", "origin",
						"destination", "destinationLat", "destinationLng", "orderType", "orderState",
						"deliveryType", "deliveryLocationType", "orderDate", "startDate", "endDate", "notes","paymentType", "orderValue", "recalculatedValue", "amountCollected", "PaymentSubtype","TransactionId", "Cash Mismatch Reason", "openingCash", "closingCash", "status","plannedServiceTime", "serviceTime", "deliveryBoy", "DB Employee ID", "assignedThrough","trip", "Planned Checkout Time", "startTimeActual", "endTimeActual", "plannedDistance",
						"actualDistance", "distanceFromHub", "actualTravelledDistance", "startTimePlanned","endTimePlanned", "timeTakenDifferenceInMins", "checkinTime", "checkOutTime","checkinLatitude", "checkinLongitude", "checkOutLatitude", "checkOutLongitude","orderSequence", "customerCode", "customerName", "podCount", "noOfCrates", "orderWeight","orderVolume", "customerComments", "deliveryNotes", "ratings", "noOfAttempts","Delivery Geofence Enter Time", "Delivery Geofence Exit Time", "Delayed", "delayedBy",
						"HubScanStatus", "parentOrderNo"};

				String strExcelColumnsToValidate = "";
				mutedReporting = true;
				for (int i = 0; i < strExcelColumnKeysToValidate.length; i++) 
				{
					String strCurrentKey = getLabel_PageLabelAPI(row, strExcelColumnKeysToValidate[i]);
					if (strCurrentKey == null || strCurrentKey.equals("null")){
						strCurrentKey = "";
					}
					strExcelColumnsToValidate += strCurrentKey+",";
				}
				mutedReporting = false;

				System.out.println("strExcelColumnsToValidate: "+strExcelColumnsToValidate);
				;//"AWB No,Document No.,Client Name,Document Branch,Origin,Destination,Destination Latitude,Destination Longitude,Document Type,Document State,Delivery Type,Delivery Location Type,Document Date,Start Date,End Date,Notes,Payment Type,Document Value,Re-calculated Value,Amount Collected,Payment Subtype,Transaction Id,Cash Mismatch Reason,Opening Cash,Closing Cash,Status,Planned Service Time,Service Time,Delivery Associate,DB Employee ID,Assigned Through,Trip,Planned Checkout Time,Start Time (Actual),End Time (Actual),Planned Distance,Actual Distance Travelled,Actual Distance from Hub,Actual Tracked Distance,Start Time (Planned),End Time (Planned),Time Taken (Difference in Mins.),Check-in Time,Check-out Time,Check-in Latitude,Check-in Longitude,Check-out Latitude,Check-out Longitude,Order Sequence,Vendor/Customer code,Customer name,POD count,No. of Crates,Weight (Kg),Volume (Cc),Customer comments,Delivery notes,Ratings,No. of Attempts,Delivery Geofence Enter Time,Delivery Geofence Exit Time,Delayed,Delayed by (Mins),Scan Status,parentOrderNo";//"Employee Id,Branch Name,User Group,Delivery Associate Name,Mobile Number,IMEI Number,Username,Capacity (in Units),Capacity (in Kg),Capacity (in Cc),Vehicle Ownership,Vehicle Number,Delivery Associate Type,Mapped Geofence,Preferred Zip Code,Shift Timings,Weekly Off,Fixed Cost,Variable Cost,Active/Inactive,Active/Inactive Reason,Active/Inactive Since,Attendance,Status,On Break,Active Trip,Trip Start Date,Last Tracking Date,Current Cash Balance,Alternate Mobile Number,Landline Number,Email Id,Date of Birth,Language,Gender,Marital Status,Current Address,Permanent Address,License Issuance Date,License Validity in Years,License Number,License Expiry Date";
				String strExcelColumns [] = strExcelColumnsToValidate.split(",");
				if (strExcelColumns.length == 0)
				{
					logMessage("Get Columns to validate", "Should be able to validate columns to validate", "Unable to get total columns present from API Keys", "Failed");
					return false;
				}

				int iSheetNo = 0;
				int iRowNo = 0;
				String strFilePathToRead = f2_lastModFile.getCanonicalPath();
				ArrayList<String> strActualColumns = getCSVData (strFilePathToRead, iRowNo, false);
				String strActualRow = getCSV_Row(strFilePathToRead, iRowNo, false);
				//getExcelColumns(iSheetNo, iRowNo, strFilePathToRead, false);
				System.out.println("strActualColumns: "+strActualColumns);
				//Validate for all columns present in excel file
				boolean rc = true;
				if (strExcelColumns.length == 0)
				{
					logMessage("Get Excel Columns", "Should be able to get columns in excel", "Unable to get Labels associated to columns in Excel", "Failed");
					return false;
				}

				//There is a special char due to which string comparision fails for first column - need to handle separately
				for (int i = 0; i < strExcelColumns.length; i++)
				{

					String strCurrentColumn = strExcelColumns[i];
					if (strCurrentColumn == null || strCurrentColumn.equals("") || strCurrentColumn.equalsIgnoreCase(" ") || strCurrentColumn.equals("null")){
						continue;
					}
					System.out.println("Current Column : "+strCurrentColumn);

					if (strActualColumns.indexOf(strCurrentColumn.toString()) == -1)
					{
						logMessage("Validate columns exist in downloaded report", "Column "+strCurrentColumn+" Should be present in excel", strCurrentColumn+" does not exists in excel", "Failed");
						rc = false;
						return false;
					}
					else
					{
						rc = true;
						logMessage("Validate columns exist in downloaded report", "Column "+strCurrentColumn+" Should be present in excel", strCurrentColumn+" exists in excel", "Passed");	
					}
				}
				System.out.println("rc : "+rc);
				if (rc == false){
					logMessage("Validate Orders Sheet", "Should be able to validate orders sheet", "Unable to validate orders sheet", "Failed");
					return false;
				}

			} catch (Exception e) {
				logMessage("Validate Excel", "Should be able to validate excel", "Unable to validate excel document - "+e.getLocalizedMessage(), "Failed");
				e.printStackTrace();
				return false;
			}
			/*
			if (configurationProperties.getBrowser().equalsIgnoreCase("chrome")
					&& configurationProperties.getExecutionMode().equalsIgnoreCase("CI"))
			{
				System.out.println("Completing validating orders file...");
				return true;//iExpectedFilesToBeDownloaded = 1;
			}
			 */

			logMessage("Validate Crates sheet", "Should be able to validate crates sheet", "Validating crates sheet", "Passed");
			try {
				f2_lastModFile = null;
				for (int i = 0; i < lastModFiles.size(); i++) 
				{
					if (lastModFiles.get(i).getName().toLowerCase().contains("crate")){
						f2_lastModFile = lastModFiles.get(i); 
					}
				}

				if (f2_lastModFile == null)
				{
					logMessage("Get Crates File", "Should be able to get Crates file starting with Crates_***", "No File was downloaded having Crates Info", "Failed");
					return false;
				}

				//Validate Columns in Downloaded Excel File... - Employee Id	Branch Name	User Group	Delivery Associate Name	Mobile Number	IMEI Number	Username	Capacity (in Units)	Capacity (in Kg)	Capacity (in Cc)	Vehicle Ownership	Vehicle Number	Delivery Associate Type	Mapped Geofence	Preferred Zip Code	Shift Timings	Weekly Off	Fixed Cost	Variable Cost	Active/Inactive	Active/Inactive Reason	Active/Inactive Since	Attendance	Status	On Break	Active Trip	Trip Start Date	Last Tracking Date	Current Cash Balance	Alternate Mobile Number	Landline Number	Email Id	Date of Birth	Language	Gender	Marital Status	Current Address	Permanent Address	License Issuance Date	License Validity in Years	License Number	License Expiry Date
				String strExcelColumnKeysToValidate [] = { "accountCode", "orderNo", "date", "crateCode", "status"};

				String strExcelColumnsToValidate = "";
				mutedReporting = true;
				for (int i = 0; i < strExcelColumnKeysToValidate.length; i++) 
				{
					String strCurrentKey = getLabel_PageLabelAPI(row, strExcelColumnKeysToValidate[i]);
					if (strCurrentKey == null || strCurrentKey.equals("null")){
						strCurrentKey = "";
					}
					strExcelColumnsToValidate += strCurrentKey+",";
				}
				mutedReporting = false;

				System.out.println("strExcelColumnsToValidate: "+strExcelColumnsToValidate);
				;//"AWB No,Document No.,Client Name,Document Branch,Origin,Destination,Destination Latitude,Destination Longitude,Document Type,Document State,Delivery Type,Delivery Location Type,Document Date,Start Date,End Date,Notes,Payment Type,Document Value,Re-calculated Value,Amount Collected,Payment Subtype,Transaction Id,Cash Mismatch Reason,Opening Cash,Closing Cash,Status,Planned Service Time,Service Time,Delivery Associate,DB Employee ID,Assigned Through,Trip,Planned Checkout Time,Start Time (Actual),End Time (Actual),Planned Distance,Actual Distance Travelled,Actual Distance from Hub,Actual Tracked Distance,Start Time (Planned),End Time (Planned),Time Taken (Difference in Mins.),Check-in Time,Check-out Time,Check-in Latitude,Check-in Longitude,Check-out Latitude,Check-out Longitude,Order Sequence,Vendor/Customer code,Customer name,POD count,No. of Crates,Weight (Kg),Volume (Cc),Customer comments,Delivery notes,Ratings,No. of Attempts,Delivery Geofence Enter Time,Delivery Geofence Exit Time,Delayed,Delayed by (Mins),Scan Status,parentOrderNo";//"Employee Id,Branch Name,User Group,Delivery Associate Name,Mobile Number,IMEI Number,Username,Capacity (in Units),Capacity (in Kg),Capacity (in Cc),Vehicle Ownership,Vehicle Number,Delivery Associate Type,Mapped Geofence,Preferred Zip Code,Shift Timings,Weekly Off,Fixed Cost,Variable Cost,Active/Inactive,Active/Inactive Reason,Active/Inactive Since,Attendance,Status,On Break,Active Trip,Trip Start Date,Last Tracking Date,Current Cash Balance,Alternate Mobile Number,Landline Number,Email Id,Date of Birth,Language,Gender,Marital Status,Current Address,Permanent Address,License Issuance Date,License Validity in Years,License Number,License Expiry Date";
				String strExcelColumns [] = strExcelColumnsToValidate.split(",");
				if (strExcelColumns.length == 0)
				{
					logMessage("Get Columns to validate", "Should be able to validate columns to validate", "Unable to get total columns present from API Keys", "Failed");
					return false;
				}

				int iSheetNo = 1;
				int iRowNo = 0;
				String strFilePathToRead = f2_lastModFile.getCanonicalPath();
				ArrayList<String> strActualColumns = getCSVData (strFilePathToRead, iRowNo, false);
				//getExcelColumns(iSheetNo, iRowNo, strFilePathToRead, false);
				String strActualRow = getCSV_Row(strFilePathToRead, iRowNo, false);
				//Validate for all columns present in excel file
				boolean rc = true;
				for (int i = 0; i < strExcelColumns.length; i++)
				{
					String strCurrentColumn = strExcelColumns[i];
					if (strCurrentColumn == null || strCurrentColumn.equals("") || strCurrentColumn.equalsIgnoreCase(" ") || strCurrentColumn.equals("null")){
						continue;
					}
					System.out.println("Current Column : "+strCurrentColumn);
					if (strActualColumns.contains(strCurrentColumn) == false)
					{
						logMessage("Validate columns exist in downloaded report", "Column "+strCurrentColumn+" Should be present in excel", strCurrentColumn+" does not exists in excel", "Failed");
						rc = false;
						//return false;
					}
					else
					{
						rc = true;
						logMessage("Validate columns exist in downloaded report", "Column "+strCurrentColumn+" Should be present in excel", strCurrentColumn+" exists in excel", "Passed");	
					}
				}
				if (rc == false){
					System.out.println("rc : "+rc);
					logMessage("Validate Orders Sheet", "Should be able to validate orders sheet", "Unable to validate orders sheet", "Failed");
					return false;
				}


			} catch (Exception e) {
				logMessage("Validate Excel", "Should be able to validate excel", "Unable to validate excel document - "+e.getLocalizedMessage(), "Failed");
				e.printStackTrace();
				return false;
			}


			return true;
		}
		catch (Exception e) 
		{
			logMessage("Verify Order Report Download", "Order report should be downloaded", "Error in test : "+e.getLocalizedMessage(), "Failed");
			e.printStackTrace();
			return false;
		}
	}
	
	public ArrayList <File> getUncompressedZipFiles (File zipfile)
	{
		try
		{
			//
			ArrayList <File> files = new ArrayList<>();
			System.out.println("Unzipping file : "+zipfile.getName()+" - in "+strLocalWebDownloadsDir+"/"+zipfile.getName());
			String strUncompressedDirPath = strLocalWebDownloadsDir+"/uncompressedOrdReport"+System.currentTimeMillis();
			unzip(zipfile.getCanonicalPath(), strUncompressedDirPath);
			System.out.println("Unzip successful...");

			//Get all files from uncompressed dir...
			File uncompressedDir = new File (strUncompressedDirPath); 
			File[] listOfFiles = uncompressedDir.listFiles();
			ArrayList <File> allUncompressedFiles = new ArrayList<>();
			for (int i = 0; i < listOfFiles.length; i++) {
				allUncompressedFiles.add(listOfFiles[i]);
				if (listOfFiles[i].isFile()) {
					System.out.println("File " + listOfFiles[i].getName());
				} else if (listOfFiles[i].isDirectory()) {
					System.out.println("Directory " + listOfFiles[i].getName());
				}
			}

			return allUncompressedFiles;
		} catch (Exception e) {
			e.printStackTrace();
			logMessage("Unzip", "Should be able to unzip files", "Unable to unzip files "+e.getMessage(), "Failed");
			return null;
		}
	}

	/**
     * Size of the buffer to read/write data
     */
    private static final int BUFFER_SIZE = 4096;
    /**
     * Extracts a zip file specified by the zipFilePath to a directory specified by
     * destDirectory (will be created if does not exists)
     * @param zipFilePath
     * @param destDirectory
     * @throws IOException
     */
    public void unzip(String zipFilePath, String destDirectory) throws IOException {
        File destDir = new File(destDirectory);
        if (!destDir.exists()) {
            destDir.mkdir();
        }
        ZipInputStream zipIn = new ZipInputStream(new FileInputStream(zipFilePath));
        ZipEntry entry = zipIn.getNextEntry();
        // iterates over entries in the zip file
        while (entry != null) {
            String filePath = destDirectory + File.separator + entry.getName();
            if (!entry.isDirectory()) {
                // if the entry is a file, extracts it
                extractFile(zipIn, filePath);
            } else {
                // if the entry is a directory, make the directory
                File dir = new File(filePath);
                dir.mkdir();
            }
            zipIn.closeEntry();
            entry = zipIn.getNextEntry();
        }
        zipIn.close();
    }
    /**
     * Extracts a zip entry (file entry)
     * @param zipIn
     * @param filePath
     * @throws IOException
     */
    private void extractFile(ZipInputStream zipIn, String filePath) throws IOException {
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(filePath));
        byte[] bytesIn = new byte[BUFFER_SIZE];
        int read = 0;
        while ((read = zipIn.read(bytesIn)) != -1) {
            bos.write(bytesIn, 0, read);
        }
        bos.close();
    }

	private ArrayList <String> getCSVData(String strFilePathToRead, int iRowNo, boolean lowerCaseLetters) {
		try 
		{


			String[] attributes;
			//Open CSV File 
			BufferedReader br = new BufferedReader(new FileReader(strFilePathToRead));

			String line = "";
			int iCurrentRow = 0;
			ArrayList <String> data = null;
			while ((line = br.readLine()) != null) {
				System.out.println("iCurrentRow : "+iCurrentRow);
				if (iCurrentRow == iRowNo)
				{
					//Read Data Set - for iRowNum
					System.out.println("line: "+line);
					line = line.substring(1, line.length());
					attributes = line.split(",");
					System.out.println(attributes.toString());
					data = new ArrayList<String>();
					for (int i = 0; i < attributes.length; i++) 
					{
						System.out.println("Data : "+attributes [i]);
						data.add(attributes [i].toString().trim());	
						//Store dataset in Array - data

					}
					break;
				}
				iCurrentRow++;
			}

			logMessage("Get CSV Data", "Should be able to validata CSV Data", "Successfully validated data in CSV", "Passed");

			//Return Arraylist
			System.out.println(data);
			return data;
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			logMessage("Get CSV Data", "Should be able to validata CSV Data", "Unable to validate data in CSV", "Failed");
			return null;
		}
	}


	private String getCSV_Row_old(String strFilePathToRead, int iRowNo, boolean lowerCaseLetters) {
		try 
		{
			BufferedReader br = new BufferedReader(new FileReader(strFilePathToRead));
			String line = "";
			int iCurrentRow = 0;
			while ((line = br.readLine()) != null) {
				line = line.substring(1, line.length());
				System.out.println("iCurrentRow : "+iCurrentRow);
				if (iCurrentRow == iRowNo)
				{
					//Read Data Set - for iRowNum
					System.out.println("line: "+line);

					return line;
				}
				iCurrentRow++;
			}

			logMessage("Get CSV Data", "Should be able to validata CSV Data", "Successfully validated data in CSV", "Passed");

			//Return Arraylist
			return null;
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			logMessage("Get CSV Data", "Should be able to validata CSV Data", "Unable to validate data in CSV", "Failed");
			return null;
		}
	}


	private String getCSV_Row (String strFilePathToRead, int iRowNo, boolean lowerCaseLetters) {
		try 
		{

			Reader reader = Files.newBufferedReader(Paths.get(strFilePathToRead));
			CSVReader csvReader = new CSVReader(reader);

			logMessage("Get CSV Data", "Should be able to validata CSV Data", "Successfully validated data in CSV", "Passed");

			// Reading Records One by One in a String array
			String[] nextRecord;
			String strLine = "";
			int iCtr = 0;
			while ((nextRecord = csvReader.readNext()) != null) {

				for (int i = 0; i < nextRecord.length; i++) 
				{
					strLine+=nextRecord[i]+",";
				}
				strLine = strLine.substring(1, strLine.length());
				System.out.println("strLine: "+strLine);
				if (iRowNo == iCtr){
					System.out.println("Exiting...");
					return strLine;
				}
				iCtr++;
			}
			//Return Arraylist
			return strLine;
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			logMessage("Get CSV Data", "Should be able to validata CSV Data", "Unable to validate data in CSV", "Failed");
			return null;
		}
	}


	public ArrayList <String> getExcelColumns (int iSheetNo, int iRowToValidate, String workbookFilePath, boolean lowerCaseLetters)
	{
		try {

			System.out.println("iSheetNo: "+iSheetNo);
			System.out.println("iRowToValidate: "+iRowToValidate);
			System.out.println("workbookFilePath: "+workbookFilePath);

			//Open excel file
			InputStream XlsxFileToRead = null;
			XSSFWorkbook workbook = null;
			try {
				XlsxFileToRead = new FileInputStream(workbookFilePath);//f2_lastModFile.getCanonicalPath());

				//Getting the workbook instance for xlsx file
				workbook = new XSSFWorkbook(XlsxFileToRead);

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}

			XSSFRow excelrow = null;
			XSSFCell cell = null;
			XSSFSheet sheet = workbook.getSheetAt(iSheetNo);//0); //(strSheetName);
			ArrayList <String> strActualColumns = new ArrayList<String>();

			//Iterating all the rows in the sheet
			Iterator rows = sheet.rowIterator();
			while (rows.hasNext()) {
				excelrow = (XSSFRow) rows.next();
				Iterator cells = excelrow.cellIterator();
				if (excelrow.getRowNum()==iRowToValidate){ //On row 1

					//Get All Columns from Second row
					while (cells.hasNext()) {
						//Loop through the columns from seconds row and fetch back results
						cell = (XSSFCell) cells.next();
						String strValue = "";
						if (cell.getCellType() == XSSFCell.CELL_TYPE_STRING) {
							strValue = cell.getStringCellValue();
							//header.add(cell.getStringCellValue());
						} else if (cell.getCellType() == XSSFCell.CELL_TYPE_NUMERIC) {
							strValue = cell.getNumericCellValue()+"";
							//header.add(cell.getStringCellValue().toString());
						} else if (cell.getCellType() == XSSFCell.CELL_TYPE_BOOLEAN) {
							strValue = cell.getStringCellValue();
							//header.add(cell.getStringCellValue().toString());
						} else { // //Here if require, we can also add below methods to
							// read the cell content
							// XSSFCell.CELL_TYPE_BLANK
							// XSSFCell.CELL_TYPE_FORMULA
							// XSSFCell.CELL_TYPE_ERROR
						}
						if (lowerCaseLetters && strValue != null){
							strValue = strValue.toLowerCase();
						}
						strActualColumns.add(strValue);
						//strActualColumns += strValue +",";
					}

					break;
				}
			}

			System.out.println("strActualColumns: "+strActualColumns);
			if (strActualColumns.size() < 1)
			{
				logMessage("Get columns from excel sheet", "Should be able to fetch columns from excel", "Unable to fetch columns from excel, Columns found : "+strActualColumns, "Failed");
				return null;
			}
			return strActualColumns;
		} catch (Exception e) {
			e.printStackTrace();
			logMessage("Read Datasheet", "Should be able to read datasheet", "Unable to read through datasheet", "Failed");
			return null;
		}
	}

	public boolean orderReportUpload (LinkedHashMap <String, String> row)
	{
		try 
		{
			//Navigate to orders planning page
			row = navigateToOrdersPage(row);
			Assert.assertNotNull(row);

			//Get Last Modified File - and wait for System to download file
			File f1_lastModFile = lastFileModified(strLocalWebDownloadsDir);
			System.out.println("f1_lastModFile : "+f1_lastModFile);

			//Click UUpload Orders Button
			String strLabelUpload = getLabel_PageLabelAPI(row, "Upload");
			String strUploadXPathBtn = "//li//span[text()='"+strLabelUpload+"']";
			rc = clickElementByXPath(strUploadXPathBtn, "Upload Button");
			Assert.assertTrue(rc);

			//Click download file format - //*[contains (@class,'icon-Product-Icons_Download-Report')]
			String strDownloadLinkXPath = "//*[contains (@class,'icon-Product-Icons_Download-Report')]";
			rc = clickElementByXPath(strDownloadLinkXPath, "Download File Link");
			Assert.assertTrue(rc);

			//Get Latest File from filesystem
			File f2_lastModFile = getDownloadedFile(f1_lastModFile);
			Assert.assertNotNull(f2_lastModFile);
			//
			//Copy Move Downloaded File to local Reporting directory
			String strLocalReportingDir = "Reports/"+Reporter.strR_CurrentReportsUniqueDir;
			System.out.println("Copying files to local reporting dir : "+strLocalReportingDir+"/"+f2_lastModFile.getName());
			File f_downloadedOrderFormatFile = new File(strLocalReportingDir+"/"+f2_lastModFile.getName());
			File f_modifiedOrderDataFile = new File(strLocalReportingDir+"/"+getFileNameWithoutExtension(f2_lastModFile)+"_UPLOAD"+getFileExtension(f2_lastModFile));

			System.out.println("f_downloadedOrderFormatFile: "+f_downloadedOrderFormatFile.getAbsolutePath());
			rc = copyFileUsingStream(f2_lastModFile, f_downloadedOrderFormatFile);//f_downloadedOrderFormatFile.renameTo(f_modifiedOrderDataFile);
			if (rc)//(f2_lastModFile.renameTo(f_downloadedOrderFormatFile))
			{
				// if file copied successfully then delete the original file
				f2_lastModFile.delete();
				System.out.println("File moved successfully");
				rc = copyFileUsingStream(f_downloadedOrderFormatFile, f_modifiedOrderDataFile);//f_downloadedOrderFormatFile.renameTo(f_modifiedOrderDataFile);
				System.out.println("f_downloadedOrderFormatFile :"+f_downloadedOrderFormatFile);

				String strLinkToReport = "./";//Reporter.strR_CurrentReportsUniqueDir ;//+ "/"+f_downloadedOrderFormatFile.getName();
				System.out.println("Link to report : "+strLinkToReport);
				logMessage("Copy downloaded file", "Should be able to copy downloaded file", "Downloaded file "+f_downloadedOrderFormatFile.getName()+" - <a target = \"_blank\" href = "+URLEncoder.encode(strLinkToReport, "UTF-8")+">Click to download file format from application</a>", "Passed");
			}
			else
			{
				System.out.println("Failed to move the file");
				logMessage("Copy downloaded file", "Should be able to copy downloaded file", "Unable to copy downloaded file", "Failed");
				return false;
			}

			//Read file and verify it contains the columns required for file upload
			HashMap<String,Integer> fileUploadExcel_Columns = new HashMap();//We need to know at what column index do we need to enter what data
			//HashMap <String,String> fileUploadExcel_ColumnIndex_DataType = new HashMap(); // We also need to know which index holds what column datatype


			try 
			{
				InputStream XlsxFileToRead = null;
				HSSFWorkbook workbook = null;
				XlsxFileToRead = new FileInputStream(f_modifiedOrderDataFile.getCanonicalPath());

				//Getting the workbook instance for xlsx file
				workbook = new HSSFWorkbook(XlsxFileToRead);
				HSSFRow excelrow = null;
				HSSFCell cell = null;
				HSSFSheet sheet = workbook.getSheetAt(0); //(strSheetName);

				//Iterating all the rows in the sheet
				Iterator rows = sheet.rowIterator();
				while (rows.hasNext()) {
					excelrow = (HSSFRow) rows.next();
					Iterator cells = excelrow.cellIterator();
					if (excelrow.getRowNum()==2){ //On Third hidden row - Get Column Keys

						//Get All Columns from Second row
						while (cells.hasNext()) {
							//Loop through the columns from Fifth row and fetch back results
							cell = (HSSFCell) cells.next();
							String strValue = "";
							if (cell.getCellType() == XSSFCell.CELL_TYPE_STRING) {
								strValue = cell.getStringCellValue();
							}

							if (strValue.contains("*")){
								strValue = strValue.replaceAll("\\*", "");
							}

							fileUploadExcel_Columns.put(strValue,cell.getColumnIndex());
							//strActualColumns += strValue +",";
						}


						break;// Stop reading the rest of the file
					}

					/*if (excelrow.getRowNum()==5){ //On Sixth Row - get their datatypes

						//Get All Columns from Second row
						while (cells.hasNext()) {
							//Loop through the columns from Fifth row and fetch back results
							cell = (HSSFCell) cells.next();
							String strValue = "";
							if (cell.getCellType() == XSSFCell.CELL_TYPE_STRING) {
								strValue = cell.getStringCellValue();
							}

							if (strValue.contains("*")){
								strValue = strValue.replaceAll("\\*", "");
							}

							//Fetch - fileUploadExcel_ColumnIndex_DataType 
							//fileUploadExcel_ColumnIndex_DataType.put(cell.getColumnIndex(), strValue);
						}

						break;// Stop reading the rest of the file
					}*/
				}
			}
			catch (Exception e) {
				logMessage("Verify file data", "Should be albe to read file data", "Error in Reading and validating file data : "+e.getLocalizedMessage(), "Failed");
				e.printStackTrace();
				return false;
			}


			if (fileUploadExcel_Columns.size() == 0)
			{
				logMessage("Validate number of columns", "Columns should be more than zero", "Columns are zero, failed to validation of excel sheet", "Failed");
				return false;
			}
			else
			{
				logMessage("Validate number of columns", "Columns should be more than zero", "Columns are present in downloaded excel", "Passed");	
			}

			//Modify file by gettimg parameters from local datasheet
			String strPageName = "OrdersUpload_Page";//"Vehicle_Page";//"Orders_Page";
			LinkedHashMap <String, String> pageDataMap = getPageObjects(row, strPageName); // ReadExcel2.readSortedTestDataMap(strSheetName, strPageName);

			//Set Date Format
			applicationTimeFormat = "HH:mm:ss";
			row.put("DATEFORMAT", "yyyy-MM-dd");
			updateTempData(row);

			//Perform substitution of keywords or functions like AUTOGEN / DATE / BOOLEAN / INTEGER / DECIMAL etc from DataSheet with actual values,
			pageDataMap = substituteDataMapKeywords (pageDataMap);
			System.out.println("pageDataMap: "+pageDataMap);
			pageDataMap = removeDotReferences(pageDataMap);

			//Loop through pageDataMap and enter values in excel sheet
			System.out.println("fileUploadExcel_Columns: "+fileUploadExcel_Columns);
			//System.out.println("fileUploadExcel_ColumnIndex_DataType: "+fileUploadExcel_ColumnIndex_DataType);
			System.out.println("pageDataMap : "+pageDataMap);

			for(String strDataMapKey : pageDataMap.keySet())
			{
				//Get current column from datamap
				String strDataValue = pageDataMap.get(strDataMapKey);
				System.out.println("strDataMapKey: "+strDataMapKey+" Value : "+strDataValue);
				int iExcelColumnIndex = -1;
				String strColumnDataType = "";
				//Get Column Index from Datasheet mapped with current column
				for(String excelColumnName : fileUploadExcel_Columns.keySet())
				{
					//System.out.println("Column "+excelColumnName+" on " +fileUploadExcel_Columns.get(excelColumnName));
					if (excelColumnName != null && excelColumnName.startsWith(strDataMapKey))
					{
						//Get the index mapped with the column name
						iExcelColumnIndex = fileUploadExcel_Columns.get(excelColumnName);

						//Get the datatype of Column Name present at that column index - (iExcelColumnIndex)
						System.out.println("Column value in row : "+row.get("u."+excelColumnName));
						if (row.get("u."+excelColumnName).contains("DECIMAL")){
							strColumnDataType = "DECIMAL";
						}
						else if (row.get("u."+excelColumnName).contains("INTEGER")){
							strColumnDataType = "INTEGER";
						}
						else if (row.get("u."+excelColumnName).contains("DATE")){
							strColumnDataType = "DATE";
						}
						else {
							strColumnDataType = "TEXT";
						}
						//strColumnDataType = fileUploadExcel_ColumnIndex_DataType.get(iExcelColumnIndex);
						System.out.println("strColumnDataType: "+strColumnDataType);
						break;
					}
				}

				if (iExcelColumnIndex < 0)
				{
					logMessage("Get column Index mapped with Column : "+strDataMapKey, "Should be able to get column index present in excel with Column : "+strDataMapKey, "Column Index not found in downloaded excel for Column : "+strDataMapKey, "Failed");
					return false;
				}
				else
				{
					logMessage("Get column Index mapped with Column : "+strDataMapKey, "Should be able to get column index present in excel with Column : "+strDataMapKey, "Column "+strDataMapKey+" found at Index - "+iExcelColumnIndex+" in downloaded excel", "Passed");

					//Update Value for index in excel for that column at row 8 onwards
					int iExcelRow = 7;//Row8
					int iSheetNum = 0;

					rc = writeDataToXLSFile(strDataValue, strColumnDataType, iExcelColumnIndex, iExcelRow, iSheetNum, f_modifiedOrderDataFile);
					Assert.assertTrue(rc);	
				}
			}

			//Run Javascript To Enable hidden element for file upload -- document.getElementById("importExcel").classList.remove("hidden");document.getElementById("importExcel").style.display="block";
			String strJS = "document.getElementById('importExcel').classList.remove('hidden');document.getElementById('importExcel').style.display='block';";
			try 
			{
				((JavascriptExecutor) driver).executeScript(strJS);
			} catch (Exception e) {
				logMessage("Execute Javascript", "Should be able to execute script", "Unable to perform script execution", "Failed");
			}

			//Upload File - Click File upload 
			System.out.println("f_modifiedOrderDataFile: "+f_modifiedOrderDataFile);
			String strFileUploadXPath = "//input[@logi-google-analytics=\"Orders - Upload order excel\"]";//"//*[@id='importExcel']"; // //*[@name='licenseFileUpload']
			rc = sendKeysFile(strFileUploadXPath, f_modifiedOrderDataFile.getAbsolutePath(), "Link - File Upload - <a href='./'>"+f_modifiedOrderDataFile.getName()+"</a>", true);
			Assert.assertTrue(rc);//

			//Wait for file transfer / upload
			TimeUnit.SECONDS.sleep(10);

			//Wait for //*[contains (@class, 'filename')] - to change to our file name  - Loginext_Order_Format_DELIVER_STATE_NONMANDATORY (18)_UPLOAD.xls
			String strFileNameXPath = "//*[contains (@class, 'filename')]";
			String strFileNameUploaded = getElementTextByXPath(strFileNameXPath, "Uploaded File Name Info Label");
			System.out.println("strFileNameUploaded: "+strFileNameUploaded);

			//Get the status of files uploaded
			String strStatusXPath = "//*[@class='message-box']"; // - "//*[@class='message-box']"
			String strFileUploadStatus = getElementTextByXPath(strStatusXPath, "Status Message");

			int iUploadCounter = 0;
			do {
				TimeUnit.SECONDS.sleep(1);
				if (iUploadCounter > 20)
				{
					System.err.println("Error in uploading...");
					break;
				}
				iUploadCounter++;
				strFileUploadStatus = getElementTextByXPath(strStatusXPath, "Status Message");

			}while (strFileUploadStatus != null && strFileUploadStatus.equals("Uploading.."));

			if (strFileUploadStatus == null
					|| strFileUploadStatus.toLowerCase().contains("error") 
					|| strFileUploadStatus.toLowerCase().contains("failed")){
				logMessage("Verify file uploaded", "Should be able to get the file which is uploaded", "Found status message : "+strFileUploadStatus, "Failed");
				return false;
			}

			String strScreenshot = captureScreenshot(driver);//
			if (strFileNameUploaded.equalsIgnoreCase(f_modifiedOrderDataFile.getName())){
				logMessage("Verify file name uploaded", "Should be able to get the file which is uploaded", "Expected File Uploaded Name : "+f_modifiedOrderDataFile.getName()+" Actual File name found : "+strFileNameUploaded+" screen : <a target='_blank' href="+strScreenshot+">"+"File Uploaded Screen"+"</a>", "Passed");
			}
			else {
				logMessage("Verify file name uploaded", "Should be able to get the file which is uploaded", "Upload popup message screen : <a target='_blank' href="+strScreenshot+">"+"File Uploaded Screen"+"</a>", "Passed");
			}

			//logMessage("Verify file name uploaded", "Should be able to get the file which is uploaded", "Expected File Uploaded Name : "+f_modifiedOrderDataFile.getName()+" Actual File name found : "+strFileNameUploaded+" screen : <a target='_blank' href="+strScreenshot+">"+"File Uploaded Screen"+"</a>", "Passed");

			//Click Close button on modal - icon-Product-Icons_X
			String strCancelButtonXPath = "//*[@ng-if=\"uploadFilePopupActive\"]//*[contains (@class,'icon-Product-Icons_X')]";//"//a[text()="+app_PageLabels.get("cancel")+"]";
			rc = clickElementByXPath(strCancelButtonXPath, "Cancel Button on File Upload window");
			Assert.assertTrue(rc);

			//Navigate to orders page
			row = navigateToOrdersPage(row);
			Assert.assertNotNull(row);
			
			//Set Page size 
			rc = setOrderPageSize();//
			Assert.assertTrue(rc);
			//

			//Search for order number and verify whether order 
			String strOrderNoUploaded = pageDataMap.get("ORDERNO");

			
			//Search with - strCurrentOrderNumber 
			rc = udsSearchByOrderNumber(strOrderNoUploaded);
			Assert.assertTrue(rc);//

			//Wait for only single order to appear 
			rc = udsWaitForOrdersInListView (5);
			Assert.assertTrue(rc);//

			//Verify whether the searched order is equal to order number which is uploaded 
			List<WebElement> currentOrders = udsGetOrderList(driver);
			String strOrderSearchResult = currentOrders.get(0).getText();
			if (strOrderSearchResult != null && strOrderSearchResult.equals(strOrderNoUploaded))
			{
				//passed
				logMessage("Verify Order search", "Order Search should match with results appeared", "Successfully fetched results : Expected Order : "+strOrderNoUploaded+" Actual Order : "+strOrderSearchResult, "Passed");
			}
			else
			{
				//failed
				logMessage("Verify Order search", "Order Search should match with results appeared", "Mismatch in results : Expected Order : "+strOrderNoUploaded+" Actual Order : "+strOrderSearchResult, "Failed");
				return false;
			}


			return true;
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			return false;
		}
	}

	public boolean writeDataToXLSFile (
			String strDataToWrite, 
			String strColumnDataType,
			int iExcelColumn, 
			int iExcelRow,
			int iSheetNum,
			File excelFileToWrite)
	{
		try 
		{

			System.out.println("excelFileToWrite: "+excelFileToWrite.getAbsolutePath());
			FileInputStream file = new FileInputStream(excelFileToWrite);
			HSSFWorkbook workbook = new HSSFWorkbook(file);
			//HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.getSheetAt(iSheetNum);

			HSSFCell cell = null;

			//Update the value of cell
			if (sheet.getRow(iExcelRow) == null){
				sheet.createRow(iExcelRow);	
			}

			HSSFRow row = sheet.getRow(iExcelRow);
			if (strColumnDataType != null && strColumnDataType.toUpperCase().contains("INTEGER"))
			{
				try 
				{
					long iDataToWrite = Long.parseLong(strDataToWrite);
					row.createCell(iExcelColumn).setCellValue(iDataToWrite);	
					logMessage("Write Data to file", "Should be able to write into file", "Successfully written Data in <br/>Row "+iExcelRow+", <br/>Col: "+iExcelColumn+"<br/> with Data : "+strDataToWrite+" <br/> in sheet "+iSheetNum+" <br/> excel file : "+excelFileToWrite.getName(), "Passed");
				} catch (Exception e) {
					e.printStackTrace();
					logMessage("Enter value in excel", "Should be able to write data to excel", "Unable to convert datatype to integer for - "+strDataToWrite+" Storing it as String", "Failed");
					row.createCell(iExcelColumn).setCellValue(strDataToWrite);
				}
			}
			else if (strColumnDataType != null && strColumnDataType.toUpperCase().contains("DECIMAL"))
			{
				try 
				{
					double iDataToWrite = Double.parseDouble(strDataToWrite);
					row.createCell(iExcelColumn).setCellValue(iDataToWrite);	
					logMessage("Write Data to file", "Should be able to write into file", "Successfully written Data in <br/>Row "+iExcelRow+", <br/>Col: "+iExcelColumn+"<br/> with Data : "+strDataToWrite+" <br/> in sheet "+iSheetNum+" <br/> excel file : "+excelFileToWrite.getName(), "Passed");
				} catch (Exception e) {
					e.printStackTrace();
					logMessage("Enter value in excel", "Should be able to write data to excel", "Unable to convert datatype to integer for - "+strDataToWrite+" Storing it as String", "Failed");
					row.createCell(iExcelColumn).setCellValue(strDataToWrite);
				}
			}
			else
			{
				row.createCell(iExcelColumn).setCellValue(strDataToWrite);		
				logMessage("Write Data to file", "Should be able to write into file", "Successfully written Data in <br/>Row "+iExcelRow+", <br/>Col: "+iExcelColumn+"<br/> with Data : "+strDataToWrite+" <br/> in sheet "+iSheetNum+" <br/> excel file : "+excelFileToWrite.getName(), "Passed");
			}

			//System.out.println("Write Data to "+iExcelRow+", "+iExcelColumn+" with "+strDataToWrite+" in sheet "+iSheetNum+" in excel file : "+excelFileToWrite.getCanonicalPath());
			file.close();
			FileOutputStream outFile =new FileOutputStream(excelFileToWrite);
			workbook.write(outFile);
			outFile.close();

		}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("Unable to write data to file...");
			logMessage("Write Data to file", "Should be able to write into file", "Unable to Write Data to "+iExcelRow+", "+iExcelColumn+" with "+strDataToWrite+" in sheet "+iSheetNum+" in excel file : "+excelFileToWrite.getPath(), "Failed");
			return false;
		}
		return true;
	}

	public LinkedHashMap <String, String> removeDotReferences (LinkedHashMap <String , String> pageDataMap){
		try {

			//Remove all canonical references (Dot references)
			LinkedHashMap<String, String> pageDataMapNew = new LinkedHashMap<>();
			Iterator <String> iterator = pageDataMap.keySet().iterator();
			while (iterator.hasNext())
			{
				String strCurrentKey = iterator.next();
				String strValue = pageDataMap.get(strCurrentKey);
				if (strCurrentKey.contains("."))
				{
					strCurrentKey = strCurrentKey.substring(strCurrentKey.indexOf(".")+1, strCurrentKey.length());
				}
				pageDataMapNew.put(strCurrentKey, strValue);
			}
			return pageDataMapNew;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public boolean deliveryBoyReportDownload (LinkedHashMap <String, String> row)
	{
		try 
		{
			//Navigate to delivery boy page
			rc = navigateToDeliveryBoyPage(row);
			Assert.assertTrue(rc);

			//Click DB Report Download - //a[@ng-click="showOdometerDownload();"]
			String strDeliveryBoyReportDownloadLabel = getLabel_PageLabelAPI(row, "downloadDeliveryBoyReport");
			String strDBReportXPath = "//a[@aria-label=\""+strDeliveryBoyReportDownloadLabel+"\"]//img";//"//a[@aria-label=\"Download Delivery Associate Report\"]//img";//"//a[@ng-click='showOdometerDownload();']";
			rc = clickElementByXPath(strDBReportXPath, "Delivery Boy Report");

			//Get Last Modified File - and wait for System to download file
			File f1_lastModFile = lastFileModified(strLocalWebDownloadsDir);
			System.out.println("f1_lastModFile : "+f1_lastModFile.getName());

			//Click Excel Button - //*[text()='Excel']
			String strExcelBtnXPath = "//*[text()="+app_PageLabels.get("downloadDbListView")+"]";
			rc = clickElementByXPath(strExcelBtnXPath, "Excel");
			Assert.assertTrue(rc);

			System.out.println("Waiting for file download to complete...");
			TimeUnit.SECONDS.sleep(5);
			File f2_lastModFile = getDownloadedFile(f1_lastModFile);
			Assert.assertNotNull(f2_lastModFile);

			try {

				//Validate Columns in Downloaded Excel File... - Employee Id	Branch Name	User Group	Delivery Associate Name	Mobile Number	IMEI Number	Username	Capacity (in Units)	Capacity (in Kg)	Capacity (in Cc)	Vehicle Ownership	Vehicle Number	Delivery Associate Type	Mapped Geofence	Preferred Zip Code	Shift Timings	Weekly Off	Fixed Cost	Variable Cost	Active/Inactive	Active/Inactive Reason	Active/Inactive Since	Attendance	Status	On Break	Active Trip	Trip Start Date	Last Tracking Date	Current Cash Balance	Alternate Mobile Number	Landline Number	Email Id	Date of Birth	Language	Gender	Marital Status	Current Address	Permanent Address	License Issuance Date	License Validity in Years	License Number	License Expiry Date
				String strExcelColumnKeysToValidate [] = { "Employee Id", "userGroup","Delivery Boy Name","mobileNum","IMEI Number","Username", "Capacity (in Units)","Capacity (in #@#weight#@#)", "Capacity (in #@#volume#@#)", "Vehicle Ownership", "Mapped Geofence","Preferred Zip Code", "Shift Timings", "weeklyOff", "Fixed Cost", "variableCost_Excel", "Active/Inactive", "Active/Inactive Reason","Active/Inactive Since", "attendance", "status", "Email Id", "Date of Birth"};

				String strExcelColumnsToValidate = "";
				mutedReporting = true;
				for (int i = 0; i < strExcelColumnKeysToValidate.length; i++) 
				{
					String strCurrentKey = getLabel_PageLabelAPI(row, strExcelColumnKeysToValidate[i]);
					if (strCurrentKey == null || strCurrentKey.equals("null")){
						strCurrentKey = "";
					}
					strExcelColumnsToValidate += strCurrentKey+",";
				}
				mutedReporting = false;

				System.out.println("strExcelColumnsToValidate: "+strExcelColumnsToValidate);
				;//"AWB No,Document No.,Client Name,Document Branch,Origin,Destination,Destination Latitude,Destination Longitude,Document Type,Document State,Delivery Type,Delivery Location Type,Document Date,Start Date,End Date,Notes,Payment Type,Document Value,Re-calculated Value,Amount Collected,Payment Subtype,Transaction Id,Cash Mismatch Reason,Opening Cash,Closing Cash,Status,Planned Service Time,Service Time,Delivery Associate,DB Employee ID,Assigned Through,Trip,Planned Checkout Time,Start Time (Actual),End Time (Actual),Planned Distance,Actual Distance Travelled,Actual Distance from Hub,Actual Tracked Distance,Start Time (Planned),End Time (Planned),Time Taken (Difference in Mins.),Check-in Time,Check-out Time,Check-in Latitude,Check-in Longitude,Check-out Latitude,Check-out Longitude,Order Sequence,Vendor/Customer code,Customer name,POD count,No. of Crates,Weight (Kg),Volume (Cc),Customer comments,Delivery notes,Ratings,No. of Attempts,Delivery Geofence Enter Time,Delivery Geofence Exit Time,Delayed,Delayed by (Mins),Scan Status,parentOrderNo";//"Employee Id,Branch Name,User Group,Delivery Associate Name,Mobile Number,IMEI Number,Username,Capacity (in Units),Capacity (in Kg),Capacity (in Cc),Vehicle Ownership,Vehicle Number,Delivery Associate Type,Mapped Geofence,Preferred Zip Code,Shift Timings,Weekly Off,Fixed Cost,Variable Cost,Active/Inactive,Active/Inactive Reason,Active/Inactive Since,Attendance,Status,On Break,Active Trip,Trip Start Date,Last Tracking Date,Current Cash Balance,Alternate Mobile Number,Landline Number,Email Id,Date of Birth,Language,Gender,Marital Status,Current Address,Permanent Address,License Issuance Date,License Validity in Years,License Number,License Expiry Date";
				String strExcelColumns [] = strExcelColumnsToValidate.split(",");
				if (strExcelColumns.length == 0)
				{
					logMessage("Get Columns to validate", "Should be able to validate columns to validate", "Unable to get total columns present from API Keys", "Failed");
					return false;
				}

				int iSheetNo = 0;
				int iRowNo = 1;
				String strFilePathToRead = f2_lastModFile.getCanonicalPath();
				boolean lowerCaseLetters = true;
				ArrayList<String> strActualColumns = getExcelColumns(iSheetNo, iRowNo, strFilePathToRead, lowerCaseLetters);

				//Validate for all columns present in excel file
				boolean rc = true;
				for (int i = 0; i < strExcelColumns.length; i++)
				{
					String strCurrentColumn = strExcelColumns[i];
					if (strCurrentColumn == null || strCurrentColumn.equals("") || strCurrentColumn.equalsIgnoreCase(" ") || strCurrentColumn.equals("null")){
						continue;
					}
					System.out.println("Current Column : "+strCurrentColumn);


					if (strActualColumns.contains(strCurrentColumn.toLowerCase()) == false)
					{
						logMessage("Validate columns exist in downloaded report", "Column "+strCurrentColumn+" Should be present in excel", strCurrentColumn+" does not exists in excel", "Failed");
						rc = false;
						//return false;
					}
					else
					{
						rc = true;
						logMessage("Validate columns exist in downloaded report", "Column "+strCurrentColumn+" Should be present in excel", strCurrentColumn+" exists in excel", "Passed");	
					}
				}
				System.out.println("rc : "+rc);
				if (rc == false){
					logMessage("Validate Delivery Boy Sheet", "Should be able to validate Delivery Boy sheet", "Unable to validate Delivery Boy sheet", "Failed");
					return false;
				}

			} catch (Exception e) {
				logMessage("Validate Excel", "Should be able to validate excel", "Unable to validate excel document - "+e.getLocalizedMessage(), "Failed");
				e.printStackTrace();
			}
			return true;
		}
		catch (Exception e) 
		{
			logMessage("Verify delivery Boy Report", "Should be able to verify delivery boy report", "Unable to verify delivery boy report "+e.getLocalizedMessage(), "Failed");
			e.printStackTrace();
			return false;
		}
	}


	public boolean deliveryBoyReportUpload (LinkedHashMap <String, String> row)
	{
		try 
		{
			//Navigate to delivery boy page
			rc = navigateToDeliveryBoyPage(row);
			Assert.assertTrue(rc);

			//Get Last Modified File - and wait for System to download file
			File f1_lastModFile = lastFileModified(strLocalWebDownloadsDir);
			System.out.println("f1_lastModFile : "+f1_lastModFile.getName());

			//Click DB Report Download - //a[@ng-click="showOdometerDownload();"]
			String strDBReportXPath = "//*[@aria-label=\"Click here to upload new Resources sheet\"]";//"//a[@aria-label=\"Download Delivery Associate Report\"]//img";//"//a[@ng-click='showOdometerDownload();']";
			rc = clickElementByXPath(strDBReportXPath, "Delivery Boy Report Download");

			//Download Format - logi-google-analytics="Delivery Associate - Download Format"
			String strDownloadFormatXPath = "//*[@logi-google-analytics=\"Delivery Associate - Download Format\"]";
			rc = clickElementByXPath(strDownloadFormatXPath, "Delivery Boy Format Download");

			//Get Latest File from filesystem
			File f2_lastModFile = getDownloadedFile(f1_lastModFile);
			Assert.assertNotNull(f2_lastModFile);			

			//Copy Move Downloaded File to local Reporting directory
			String strLocalReportingDir = "Reports/"+Reporter.strR_CurrentReportsUniqueDir;
			System.out.println("Copying files to local reporting dir : "+strLocalReportingDir+"/"+f2_lastModFile.getName());
			File f_downloadedOrderFormatFile = new File(strLocalReportingDir+"/"+f2_lastModFile.getName());
			File f_modifiedOrderDataFile = new File(strLocalReportingDir+"/"+getFileNameWithoutExtension(f2_lastModFile)+"_UPLOAD"+getFileExtension(f2_lastModFile));

			System.out.println("f_downloadedOrderFormatFile: "+f_downloadedOrderFormatFile.getAbsolutePath());
			rc = copyFileUsingStream(f2_lastModFile, f_downloadedOrderFormatFile);//f_downloadedOrderFormatFile.renameTo(f_modifiedOrderDataFile);
			if (rc)//(f2_lastModFile.renameTo(f_downloadedOrderFormatFile))
			{
				// if file copied successfully then delete the original file
				f2_lastModFile.delete();
				System.out.println("File moved successfully");
				rc = copyFileUsingStream(f_downloadedOrderFormatFile, f_modifiedOrderDataFile);//f_downloadedOrderFormatFile.renameTo(f_modifiedOrderDataFile);
				System.out.println("f_downloadedOrderFormatFile :"+f_downloadedOrderFormatFile);

				String strLinkToReport = "./";//Reporter.strR_CurrentReportsUniqueDir ;//+ "/"+f_downloadedOrderFormatFile.getName();
				System.out.println("Link to report : "+strLinkToReport);
				logMessage("Copy downloaded file", "Should be able to copy downloaded file", "Downloaded file "+f_downloadedOrderFormatFile.getName()+" - <a target = \"_blank\" href = "+URLEncoder.encode(strLinkToReport, "UTF-8")+">Click to download file format from application</a>", "Passed");
			}
			else
			{
				System.out.println("Failed to move the file");
				logMessage("Copy downloaded file", "Should be able to copy downloaded file", "Unable to copy downloaded file", "Failed");
				return false;
			}

			//Read file and verify it contains the columns required for file upload
			HashMap<String,Integer> fileUploadExcel_Columns = new HashMap();//We need to know at what column index do we need to enter what data
			//HashMap <String,String> fileUploadExcel_ColumnIndex_DataType = new HashMap(); // We also need to know which index holds what column datatype

			try 
			{
				InputStream XlsxFileToRead = null;
				HSSFWorkbook workbook = null;
				XlsxFileToRead = new FileInputStream(f_modifiedOrderDataFile.getCanonicalPath());

				//Getting the workbook instance for xlsx file
				workbook = new HSSFWorkbook(XlsxFileToRead);
				HSSFRow excelrow = null;
				HSSFCell cell = null;
				HSSFSheet sheet = workbook.getSheetAt(0); //(strSheetName);

				//Iterating all the rows in the sheet
				Iterator rows = sheet.rowIterator();
				while (rows.hasNext()) {
					excelrow = (HSSFRow) rows.next();
					Iterator cells = excelrow.cellIterator();
					if (excelrow.getRowNum()==2){ //On Third hidden row - Get Column Keys

						//Get All Columns from Second row
						while (cells.hasNext()) {
							//Loop through the columns from Fifth row and fetch back results
							cell = (HSSFCell) cells.next();
							String strValue = "";
							if (cell.getCellType() == XSSFCell.CELL_TYPE_STRING) {
								strValue = cell.getStringCellValue();
							}

							if (strValue.contains("*")){
								strValue = strValue.replaceAll("\\*", "");
							}

							fileUploadExcel_Columns.put(strValue,cell.getColumnIndex());
							//strActualColumns += strValue +",";
						}


						break;// Stop reading the rest of the file
					}

					/*if (excelrow.getRowNum()==5){ //On Sixth Row - get their datatypes

						//Get All Columns from Second row
						while (cells.hasNext()) {
							//Loop through the columns from Fifth row and fetch back results
							cell = (HSSFCell) cells.next();
							String strValue = "";
							if (cell.getCellType() == XSSFCell.CELL_TYPE_STRING) {
								strValue = cell.getStringCellValue();
							}

							if (strValue.contains("*")){
								strValue = strValue.replaceAll("\\*", "");
							}

							//Fetch - fileUploadExcel_ColumnIndex_DataType 
							//fileUploadExcel_ColumnIndex_DataType.put(cell.getColumnIndex(), strValue);
						}

						break;// Stop reading the rest of the file
					}*/
				}
			}
			catch (Exception e) {
				logMessage("Verify file data", "Should be albe to read file data", "Error in Reading and validating file data : "+e.getLocalizedMessage(), "Failed");
				e.printStackTrace();
				return false;
			}


			if (fileUploadExcel_Columns.size() == 0)
			{
				logMessage("Validate number of columns", "Columns should be more than zero", "Columns are zero, failed to validation of excel sheet", "Failed");
				return false;
			}
			else
			{
				logMessage("Validate number of columns", "Columns should be more than zero", "Columns are present in downloaded excel", "Passed");	
			}

			//Modify file by gettimg parameters from local datasheet
			String strPageName = "DeliveryBoyUpload_Page";//"Vehicle_Page";//"Orders_Page";
			LinkedHashMap <String, String> pageDataMap = getPageObjects(row, strPageName); // ReadExcel2.readSortedTestDataMap(strSheetName, strPageName);

			//Set Date Format
			applicationTimeFormat = "";//"HH:m:ss";
			row.put("DATEFORMAT", "yyyy-MM-dd");
			updateTempData(row);//

			//Perform substitution of keywords or functions like AUTOGEN / DATE / BOOLEAN / INTEGER / DECIMAL etc from DataSheet with actual values,
			pageDataMap = substituteDataMapKeywords (pageDataMap);
			System.out.println("pageDataMap: "+pageDataMap);
			pageDataMap = removeDotReferences(pageDataMap);

			//Loop through pageDataMap and enter values in excel sheet
			System.out.println("fileUploadExcel_Columns: "+fileUploadExcel_Columns);
			//System.out.println("fileUploadExcel_ColumnIndex_DataType: "+fileUploadExcel_ColumnIndex_DataType);
			System.out.println("pageDataMap : "+pageDataMap);

			String strUploadedDeliveryBoyFullName = pageDataMap.get("FULLNAME");
			System.out.println("strUploadedDeliveryBoyFullName: "+strUploadedDeliveryBoyFullName);

			for(String strDataMapKey : pageDataMap.keySet())
			{
				//Get current column from datamap
				String strDataValue = pageDataMap.get(strDataMapKey);
				System.out.println("strDataMapKey: "+strDataMapKey+" Value : "+strDataValue);
				int iExcelColumnIndex = -1;
				String strColumnDataType = "";
				//Get Column Index from Datasheet mapped with current column
				for(String excelColumnName : fileUploadExcel_Columns.keySet())
				{
					//System.out.println("Column "+excelColumnName+" on " +fileUploadExcel_Columns.get(excelColumnName));
					if (excelColumnName != null && excelColumnName.startsWith(strDataMapKey))
					{
						//Get the index mapped with the column name
						iExcelColumnIndex = fileUploadExcel_Columns.get(excelColumnName);

						//Get the datatype of Column Name present at that column index - (iExcelColumnIndex)
						System.out.println("Column value in row : "+row.get("du."+excelColumnName));
						if (row.get("du."+excelColumnName).contains("DECIMAL")){
							strColumnDataType = "DECIMAL";
						}
						else if (row.get("du."+excelColumnName).contains("INTEGER")){
							strColumnDataType = "INTEGER";
						}
						else if (row.get("du."+excelColumnName).contains("DATE")){
							strColumnDataType = "DATE";
						}
						else {
							strColumnDataType = "TEXT";
						}
						//strColumnDataType = fileUploadExcel_ColumnIndex_DataType.get(iExcelColumnIndex);
						System.out.println("strColumnDataType: "+strColumnDataType);
						break;
					}
				}

				if (iExcelColumnIndex < 0)
				{
					logMessage("Get column Index mapped with Column : "+strDataMapKey, "Should be able to get column index present in excel with Column : "+strDataMapKey, "Column Index not found in downloaded excel for Column : "+strDataMapKey, "Failed");
					return false;
				}
				else
				{
					logMessage("Get column Index mapped with Column : "+strDataMapKey, "Should be able to get column index present in excel with Column : "+strDataMapKey, "Column "+strDataMapKey+" found at Index - "+iExcelColumnIndex+" in downloaded excel", "Passed");

					//Update Value for index in excel for that column at row 8 onwards
					int iExcelRow = 7;//Row8
					int iSheetNum = 0;

					rc = writeDataToXLSFile(strDataValue, strColumnDataType, iExcelColumnIndex, iExcelRow, iSheetNum, f_modifiedOrderDataFile);
					Assert.assertTrue(rc);	
				}
			}

			//Run Javascript To Enable hidden element for file upload -- document.getElementById("importExcel").classList.remove("hidden");document.getElementById("importExcel").style.display="block";
			/*String strJS = "document.getElementById('importExcel').classList.remove('hidden');document.getElementById('importExcel').style.display='block';";
			try 
			{
				((JavascriptExecutor) driver).executeScript(strJS);
			} catch (Exception e) {
				logMessage("Execute Javascript", "Should be able to execute script", "Unable to perform script execution", "Failed");
			}*/

			//Upload File - Click File upload 
			System.out.println("f_modifiedOrderDataFile: "+f_modifiedOrderDataFile);
			String strFileUploadXPath = "//input[@logi-google-analytics=\"Orders - Upload order excel\"]";//"//*[@id='importExcel']"; // //*[@name='licenseFileUpload']
			rc = sendKeysFile(strFileUploadXPath, f_modifiedOrderDataFile.getAbsolutePath(), "Link - File Upload - <a href='./'>"+f_modifiedOrderDataFile.getName()+"</a>", true);
			Assert.assertTrue(rc);//

			//Wait for file transfer / upload
			TimeUnit.SECONDS.sleep(10);

			//Wait for //*[contains (@class, 'filename')] - to change to our file name  - Loginext_Order_Format_DELIVER_STATE_NONMANDATORY (18)_UPLOAD.xls
			String strFileNameXPath = "//*[contains (@class, 'filename')]";
			String strFileNameUploaded = getElementTextByXPath(strFileNameXPath, "Uploaded File Name Info Label");
			System.out.println("strFileNameUploaded: "+strFileNameUploaded);

			//Get the status of files uploaded
			String strStatusXPath = "//*[@class='message-box']"; // - "//*[@class='message-box']"
			String strFileUploadStatus = getElementTextByXPath(strStatusXPath, "Status Message");

			int iUploadCounter = 0;
			do {
				TimeUnit.SECONDS.sleep(1);
				if (iUploadCounter > 20)
				{
					System.err.println("Error in uploading...");
					break;
				}
				iUploadCounter++;
				strFileUploadStatus = getElementTextByXPath(strStatusXPath, "Status Message");

			}while (strFileUploadStatus != null && strFileUploadStatus.equals("Uploading.."));

			if (strFileUploadStatus == null
					|| strFileUploadStatus.toLowerCase().contains("error") 
					|| strFileUploadStatus.toLowerCase().contains("failed")
					|| strFileUploadStatus.toLowerCase().contains("issue")){
				logMessage("Verify file uploaded", "Should be able to get the file which is uploaded", "Found status message : "+strFileUploadStatus, "Failed");
				return false;
			}
			//Upload Successful
			else if (strFileUploadStatus == null
					|| strFileUploadStatus.toLowerCase().contains("upload successful")
					|| strFileUploadStatus.toLowerCase().contains("upload completed"))
			{
				logMessage("Verify file uploaded", "Should be able to get the file which is uploaded", "Found status message : "+strFileUploadStatus, "Passed");
			}
			else {
				logMessage("Verify file uploaded", "Should be able to get the file which is uploaded", "Found status message : "+strFileUploadStatus +" Expecting : "+"upload successful", "Failed");	
				return false;
			}

			System.out.println("Searching for Uploaded Delivery Boy... : "+strUploadedDeliveryBoyFullName);
			String strCancelButtonXPath = "//*[@ng-if=\"uploadFilePopupActive\"]//*[contains (@class,'icon-Product-Icons_X')]";//"//a[text()="+app_PageLabels.get("cancel")+"]";
			rc = clickElementByXPath(strCancelButtonXPath, "Cancel Button on File Upload window");
			Assert.assertTrue(rc);

			//Search Delivery Boy
			String strDeliveryBoyID = searchDeliveryBoy(strUploadedDeliveryBoyFullName);
			System.out.println("strDeliveryBoyID: "+strDeliveryBoyID);
			Assert.assertNotEquals(strDeliveryBoyID, null);


			/*
			String strScreenshot = captureScreenshot(driver);//
			if (strFileNameUploaded.equalsIgnoreCase(f_modifiedOrderDataFile.getName())){
				logMessage("Verify file name uploaded", "Should be able to get the file which is uploaded", "Expected File Uploaded Name : "+f_modifiedOrderDataFile.getName()+" Actual File name found : "+strFileNameUploaded+" screen : <a target='_blank' href="+strScreenshot+">"+"File Uploaded Screen"+"</a>", "Passed");
			}
			else {
				logMessage("Verify file name uploaded", "Should be able to get the file which is uploaded", "Expected File Uploaded Name : "+f_modifiedOrderDataFile.getName()+" Actual File name found : "+strFileNameUploaded, "Failed");
			}*/

			//logMessage("Verify file name uploaded", "Should be able to get the file which is uploaded", "Expected File Uploaded Name : "+f_modifiedOrderDataFile.getName()+" Actual File name found : "+strFileNameUploaded+" screen : <a target='_blank' href="+strScreenshot+">"+"File Uploaded Screen"+"</a>", "Passed");
			/**
			//Click Close button on modal - icon-Product-Icons_X
			String strCancelButtonXPath = "//*[@ng-if=\"uploadFilePopupActive\"]//*[contains (@class,'icon-Product-Icons_X')]";//"//a[text()="+app_PageLabels.get("cancel")+"]";
			rc = clickElementByXPath(strCancelButtonXPath, "Cancel Button on File Upload window");
			Assert.assertTrue(rc);
			 **/

			return true;
		}
		catch (Exception e) 
		{
			logMessage("Verify delivery Boy Report", "Should be able to verify delivery boy report", "Unable to verify delivery boy report "+e.getLocalizedMessage(), "Failed");
			e.printStackTrace();
			return false;
		}
	}

	public File getDownloadedFile (File f1_lastModFile)
	{
		try 
		{

			//Get Last Modified File - wait till System does not downloads file
			File f2_lastModFile = null;
			int iCtr = 0;
			do{
				f2_lastModFile = lastFileModified(strLocalWebDownloadsDir);
				System.out.println(iCtr+" f2_lastModFile : "+f2_lastModFile.getName() + " Size : "+f2_lastModFile.length() +" Bytes");
				if (iCtr > MAX_WAIT_TIME_FILE_DOWNLOADS){
					System.out.println("File Download is not completed...");
					break;
				}
				TimeUnit.SECONDS.sleep(1);
				iCtr ++;
			} while (f2_lastModFile.getName().equals(f1_lastModFile.getName())
					|| f2_lastModFile.getName().contains("crdownload")
					|| f2_lastModFile.getName().contains("part")
					|| f2_lastModFile.getName().contains("com.google.Chrome")
					|| f2_lastModFile.length() == 0);

			//Wait for the file to get copied from docker system to local
			TimeUnit.SECONDS.sleep(5);

			if (f2_lastModFile.getName().equals(f1_lastModFile.getName())
					|| f2_lastModFile.getName().contains("crdownload")){
				logMessage("Get last modified file", "Report should get downloaded", "Report was not downloaded - Unable to get report from local filesystem", "Failed");
				return null;
			}
			else {
				logMessage("Get last modified file", "Report should get downloaded", "Report was downloaded in local filesystem", "Passed");
			}
			return f2_lastModFile;
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			logMessage("Get last modified file", "Report should get downloaded", "Report was not downloaded - Unable to get report from local filesystem", "Failed");
			return null;
		}
	}


	public List <File> getDownloadedFiles (File f1_lastModFile, int iExpectedNumberOfFilesDownloaded)
	{
		try 
		{
			List <File> files = new ArrayList<File>();


			do {


				//Get Last Modified File - wait till System does not downloads file
				File f2_lastModFile = null;
				int iCtr = 0;
				do{
					f2_lastModFile = lastFileModified(strLocalWebDownloadsDir);
					System.out.println(iCtr+" f2_lastModFile : "+f2_lastModFile.getName() + " Size : "+f2_lastModFile.length() +" Bytes");
					if (iCtr > MAX_WAIT_TIME_FILE_DOWNLOADS){
						System.out.println("File Download is not completed...");
						break;
					}
					TimeUnit.SECONDS.sleep(1);
					iCtr ++;
				} while (f2_lastModFile.getName().equals(f1_lastModFile.getName())
						|| f2_lastModFile.getName().contains("crdownload")
						|| f2_lastModFile.getName().contains("part")
						|| f2_lastModFile.getName().contains("com.google.Chrome")
						|| f2_lastModFile.length() == 0);

				//Wait for the file to get copied from docker system to local
				TimeUnit.SECONDS.sleep(5);

				if (f2_lastModFile.getName().equals(f1_lastModFile.getName())
						|| f2_lastModFile.getName().contains("crdownload")){
					logMessage("Get last modified file", "Report should get downloaded", "Report was not downloaded - Unable to get report from local filesystem", "Failed");
					return null;
				}
				else {
					logMessage("Get last modified file", "Report should get downloaded", "Report was downloaded in local filesystem", "Passed");
				}
				//return f2_lastModFile;
				files.add(f2_lastModFile);

				//Reset file name to f1
				f1_lastModFile = f2_lastModFile; 

				if (iCtr > MAX_WAIT_TIME_FILE_DOWNLOADS){
					System.out.println("File Download is not completed..., Expected Files : "+iExpectedNumberOfFilesDownloaded+" Actual Files : "+files.size());
					break;
				}
				else {
					System.out.println("File Download is in progress..., Expected Files : "+iExpectedNumberOfFilesDownloaded+" Actual Files : "+files.size());
				}

			}
			while (files.size() != iExpectedNumberOfFilesDownloaded); //Continue on if the number of files added in bucket is not equals to expected downloads



			return files;
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			logMessage("Get last modified file", "Report should get downloaded", "Report was not downloaded - Unable to get report from local filesystem", "Failed");
			return null;
		}
	}

	public static File lastFileModified(String dir) {
		try {
			System.out.println("Current Reporting Dir : "+dir);
			File fl = new File(dir);
			File[] files = fl.listFiles();
			long lastMod = Long.MIN_VALUE;
			File choice = null;
			for (File file : files) {
				if (file.lastModified() > lastMod) {
					choice = file;
					lastMod = file.lastModified();
				}
			}
			return choice;
		} catch (Exception e) {
			System.out.println("Please make sure there are files in the current dir...");
			e.printStackTrace();
			return null;
		}
	}


	//Order List Views and pagination
	public boolean deliveryBoyListView(LinkedHashMap<String, String> row) {
		try 
		{
			updateTempData(row);
			rc = navigateToDeliveryBoyPage(row);

			//Navigate to 3 Pages and verify data exists for the user 
			int iCurrentPageNumber = 0;
			int iTotalElements = 0;
			int iPageElementsFrom = 0;
			int iPageElementsTo = 0;
			String strDisabled = "false";

			rc = true;
			do {
				iCurrentPageNumber++; 

				JsonObject deliveryMediumListView = getDeliveryBoyListView_API(iCurrentPageNumber+"", "50");
				System.out.println("deliveryMediumListView: "+deliveryMediumListView);

				//Validate resultset
				Assert.assertNotNull(deliveryMediumListView);

				//Wait for the results to re-arrange
				TimeUnit.SECONDS.sleep(5);

				JsonArray deliveryMediumListView_JsonData = deliveryMediumListView.getAsJsonObject().get("data").getAsJsonObject().get("results").getAsJsonArray();

				if (iCurrentPageNumber % 2 == 0)
				{
					//Reverse the list view
					for (int i = deliveryMediumListView_JsonData.size() -1; i >= 0 ; i--) 
					{
						JsonObject currentJsonElement = deliveryMediumListView_JsonData.get(i).getAsJsonObject();
						String strUserName = currentJsonElement.get("userName").getAsString();

						//Find User on list view page
						String strUserNameElementXPath = "//*[text()='"+strUserName+"']";
						bringElementInView(strUserNameElementXPath);
						String strUserNameTextValue = getElementTextByXPath(strUserNameElementXPath , "User Name"+strUserName);
						if (strUserNameTextValue != null && strUserNameTextValue.equals(strUserName)){
							System.out.println("Found User : "+strUserNameTextValue+" on list view page...");
						}
						else {
							System.out.println("Unable to find User : "+strUserName+" on list view page; Actual : "+strUserNameTextValue+" ...");
							rc = false;
							return false;
						}
					}				
				}
				else
				{

					for (int i = 0; i < deliveryMediumListView_JsonData.size(); i++) 
					{
						JsonObject currentJsonElement = deliveryMediumListView_JsonData.get(i).getAsJsonObject();
						String strUserName = currentJsonElement.get("userName").getAsString();

						//Find User on list view page
						String strUserNameElementXPath = "//*[text()='"+strUserName+"']";
						bringElementInView(strUserNameElementXPath);
						String strUserNameTextValue = getElementTextByXPath(strUserNameElementXPath , "User Name - "+strUserName);
						if (strUserNameTextValue != null && strUserNameTextValue.equals(strUserName)){
							System.out.println("Found User : "+strUserNameTextValue+" on list view page...");
						}
						else {
							System.out.println("Unable to find User : "+strUserName+" on list view page; Actual : "+strUserNameTextValue+" ...");
							rc = false;
							return false;
						}
					}					
				}

				//mutedReporting = false;
				Assert.assertTrue(rc);

				//Loop through all dataset - or break it till the point it reaches 5 Pages Max
				ArrayList<Integer> pageDetails = getPaginationDetails ();
				iTotalElements = pageDetails.get(0);
				iPageElementsFrom = pageDetails.get(1);
				iPageElementsTo = pageDetails.get(2);

				//click next - //*[@value="Next"]
				String strNextPageButtonXPath = "//*[@value='Next']";
				clickElementByXPath(strNextPageButtonXPath, "Next Page Button");

				if (strDisabled != null && strDisabled.equals("true"))
				{
					System.out.println("Completed navigating for every page, Next button disabled...");
					break;
				}
				//Verify whether next button is not disabled..
				strDisabled = getAttributeByXPath(strNextPageButtonXPath, "Next Page Button", "disabled");
				System.out.println("strDisabled : "+strDisabled);

				if (iCurrentPageNumber > 0){
					logMessage("Verify pagination", "Pagination should be verified", "Verified pagination, Exiting out due to larger dataset", "Passed");
					break;
				}

			}
			while (iPageElementsFrom < iTotalElements);
			if (rc == false){
				logMessage("Verify pagination", "Should be able to verify pagination", "List view Pagination Failed", "Failed");
				rc = false;
			}
			else {
				logMessage("Verify pagination", "Should be able to verify pagination", "List view Successfully verified pagination", "Passed");
				rc = true;
			}
			return rc;
		}
		catch (Exception e) 
		{
			logMessage("Verify List View", "List view should be validated", "Unable to verify list view, Error : "+e.getLocalizedMessage(), "Failed");
			e.printStackTrace();
			return false;
		}

	}


	public boolean deliveryBoyMapView(LinkedHashMap<String, String> row) {
		try 
		{
			//Navigate to Delivery Boy Page...
			updateTempData(row);
			rc = navigateToDeliveryBoyPage(row);
			Assert.assertTrue(rc);

			//Click Map View - 
			String strMapViewXPath = "//*[@logi-google-analytics='Delivery Associate - Map view']";
			rc = clickElementByXPath(strMapViewXPath, "Map View Button");
			Assert.assertTrue(rc);

			//Navigate to 3 Pages and verify data exists for the user 
			int iCurrentPageNumber = 0;
			int iTotalElements = 0;
			int iPageElementsFrom = 0;
			int iPageElementsTo = 0;
			String strDisabled = "false";

			rc = true;
			do {
				iCurrentPageNumber++; 

				JsonObject deliveryMediumListView = getDeliveryBoyListView_API(iCurrentPageNumber+"", "50");
				System.out.println("deliveryMediumListView: "+deliveryMediumListView);

				//Validate resultset
				Assert.assertNotNull(deliveryMediumListView);

				//Wait for results to rearrange
				TimeUnit.SECONDS.sleep(5);

				JsonArray deliveryMediumListView_JsonData = deliveryMediumListView.getAsJsonObject().get("data").getAsJsonObject().get("results").getAsJsonArray();
				for (int i = 0; i < deliveryMediumListView_JsonData.size(); i++) 
				{
					JsonObject currentJsonElement = deliveryMediumListView_JsonData.get(i).getAsJsonObject();
					String strUserName = currentJsonElement.get("deliveryMediumMasterName").getAsString();

					//Find User on list view page
					String strUserNameElementXPath = "//*[text()='"+strUserName+"']";
					bringElementInView(strUserNameElementXPath);
					String strUserNameTextValue = getElementTextByXPath(strUserNameElementXPath , "User Name - "+strUserName);
					if (strUserNameTextValue != null && strUserNameTextValue.trim().equals(strUserName.trim())){
						System.out.println("Found User : "+strUserNameTextValue+" on list view page...");
					}
					else {
						System.out.println("Unable to find User : "+strUserName+" on list view page; Actual : "+strUserNameTextValue+" ...");
						rc = false;
						return false;
					}

					if (i % 10 == 0)
					{
						System.out.println("Iterating to next page..");
						break;
					}
				}		
				/*
				if (iCurrentPageNumber % 2 == 0)
				{
					//Reverse the list view
					for (int i = deliveryMediumListView_JsonData.size() -1; i >= 0 ; i--) 
					{
						JsonObject currentJsonElement = deliveryMediumListView_JsonData.get(i).getAsJsonObject();
						String strUserName = currentJsonElement.get("deliveryMediumMasterName").getAsString();

						//Find User on list view page
						String strUserNameElementXPath = "//*[text()='"+strUserName+"']";
						bringElementInView(strUserNameElementXPath);
						String strUserNameTextValue = getElementTextByXPath(strUserNameElementXPath , "User Name "+strUserName);
						System.out.println("strUserNameTextValue: "+strUserNameTextValue+" strUserName: "+strUserName);

						if (strUserNameTextValue != null && strUserNameTextValue.trim().equals(strUserName.trim())){
							System.out.println("Found User : "+strUserNameTextValue+" on list view page...");
						}
						else {
							System.out.println("Unable to find User : "+strUserName+" on list view page; Actual : "+strUserNameTextValue+" ...");
							rc = false;
							return false;
						}

						if (i % 10 == 0)
						{
							System.out.println("Iterating to next page..");
							break;
						}

					}				
				}
				else
				{

					for (int i = 0; i < deliveryMediumListView_JsonData.size(); i++) 
					{
						JsonObject currentJsonElement = deliveryMediumListView_JsonData.get(i).getAsJsonObject();
						String strUserName = currentJsonElement.get("deliveryMediumMasterName").getAsString();

						//Find User on list view page
						String strUserNameElementXPath = "//*[text()='"+strUserName+"']";
						bringElementInView(strUserNameElementXPath);
						String strUserNameTextValue = getElementTextByXPath(strUserNameElementXPath , "User Name - "+strUserName);
						if (strUserNameTextValue != null && strUserNameTextValue.trim().equals(strUserName.trim())){
							System.out.println("Found User : "+strUserNameTextValue+" on list view page...");
						}
						else {
							System.out.println("Unable to find User : "+strUserName+" on list view page; Actual : "+strUserNameTextValue+" ...");
							rc = false;
							return false;
						}

						if (i % 10 == 0)
						{
							System.out.println("Iterating to next page..");
							break;
						}
					}					
				}*/

				//mutedReporting = false;
				Assert.assertTrue(rc);

				//Loop through all dataset - or break it till the point it reaches 5 Pages Max
				ArrayList<Integer> pageDetails = getPaginationDetails ();
				iTotalElements = pageDetails.get(0);
				iPageElementsFrom = pageDetails.get(1);
				iPageElementsTo = pageDetails.get(2);

				//click next - //*[@value="Next"]
				String strNextPageButtonXPath = "//*[@value='Next']";
				clickElementByXPath(strNextPageButtonXPath, "Next Page Button");

				if (strDisabled != null && strDisabled.equals("true"))
				{
					System.out.println("Completed navigating for every page, Next button disabled...");
					break;
				}
				//Verify whether next button is not disabled..
				strDisabled = getAttributeByXPath(strNextPageButtonXPath, "Next Page Button", "disabled");
				System.out.println("strDisabled : "+strDisabled);

				if (iCurrentPageNumber > 2){
					logMessage("Verify pagination", "Pagination should be verified", "Verified pagination, Exiting out due to larger dataset", "Passed");
					break;
				}


			}
			while (iPageElementsFrom < iTotalElements);
			if (rc == false){
				logMessage("Verify pagination", "Should be able to verify pagination", "List view Pagination Failed", "Failed");
				rc = false;
			}
			else {
				logMessage("Verify pagination", "Should be able to verify pagination", "List view Successfully verified pagination", "Passed");
				rc = true;
			}


			return true;
		}
		catch (Exception e) 
		{
			logMessage("Verify Map View", "Map view should be validated", "Unable to verify Map view, Error : "+e.getLocalizedMessage(), "Failed");
			e.printStackTrace();
			return false;
		}

	}

	public boolean orderVerifyOrderMaptView (LinkedHashMap<String, String> row)
	{
		try{


			//Navigate to orders page
			row = navigateToOrdersPage(row);
			Assert.assertNotNull(row);

			//Click Map View - logi-google-analytics="Orders - map view"
			String strMapView = "//*[@logi-google-analytics='Orders - map view']";
			rc = clickElementByXPath(strMapView, "Map View Button");
			Assert.assertTrue(rc);

			//

			return rc;
		}
		catch (Exception e) 
		{
			logMessage("Verify Map View", "Map view should be validated", "Unable to verify Map view, Error : "+e.getLocalizedMessage(), "Failed");
			e.printStackTrace();
			return false;
		}
	}


	public boolean verifyDashboard(LinkedHashMap<String, String> row) {

		try {

			if (!isApplicationLaunched){

				rc = launchApplication (row);
				Assert.assertTrue(rc);

				rc = login (row);
				Assert.assertTrue(rc);

			}
			else
			{
				//Just refresh the page once...
				driver.navigate().refresh();
			}
			isApplicationLaunched = true;
			
			//Get login API auth key and client secret
			row = getAuthDetailsWeb (row);
			Assert.assertNotNull(row);

			//Assign Page Labels
			rc = initApp_PageLabels(row);
			Assert.assertTrue(rc);

			//Assign Menu Items
			rc = initApp_MenuItems(row);
			Assert.assertTrue(rc);

			rc = getApplicationProperties(row);
			Assert.assertTrue(rc);
			row = getTempData();

			//Click Dashboard Menu Item 


			//Get Dashboard API for Deliver Shipments (Today's Activities > Delivery Leg Details)- https://demo.loginextsolutions.com/ReportingApp/dashboard/FMLM/DeliverShipments
			JsonArray dashboardComponentsJsonArr = getDashboardAPI_DeliverShipments();
			if (dashboardComponentsJsonArr.size() > 0)
			{
				logMessage("Verify Dashboard API Response", "Dashboard API should be retrieved", "Successfully responded back dashboard API Results", "Passed");
			}
			else 
			{
				logMessage("Verify Dashboard API Response", "Dashboard API should be retrieved", "Total API Results for Dashobard charts - "+dashboardComponentsJsonArr.size(), "Failed");
				return false;
			}

			for (int i = 0; i < dashboardComponentsJsonArr.size(); i++)
			{
				JsonObject graphElement = dashboardComponentsJsonArr.get(i).getAsJsonObject();
				logMessage("Validate chart", "Chart should be validated", "Validating chart : "+graphElement.get("name"), "Passed");

				String strGraphElem_UI = "";
				String strHeaderLabel = "";
				String strPercentageLabel = "";
				String strGraphName = "";
				if (graphElement.get("name").getAsString().equals("TOTAL DELIVERIES"))
				{
					strGraphElem_UI = "//*[@id='total_deliveries_cm']";
					strGraphName = "Total Deliveries Chart";
					strHeaderLabel = getLabel_PageLabelAPI(row, "totalDeliveries");	
					strPercentageLabel = getLabel_PageLabelAPI(row, "OrdersNotStarted");
				}

				if (graphElement.get("name").getAsString().equals("ORDERS NOT COMPLETED"))
				{
					strGraphElem_UI = "//*[@id='orders_not_completed_cm']";
					strGraphName = "Orders not completed Chart";
					strHeaderLabel = getLabel_PageLabelAPI(row, "ordersNotCompleted");	
					strPercentageLabel = getLabel_PageLabelAPI(row, "deliverOrdersNotCompletedMessage");	
				}

				if (graphElement.get("name").getAsString().equals("ORDER STATES"))
				{
					strGraphElem_UI = "//*[@id='order_states_cm']";
					strGraphName = "Orders States Chart";
					strHeaderLabel = getLabel_PageLabelAPI(row, "orderStates");	
					strPercentageLabel = getLabel_PageLabelAPI(row, "deliverOrdersStateMessage");	
				}

				if (graphElement.get("name").getAsString().equals("DELAYED ORDERS"))
				{
					strGraphElem_UI = "//*[@id='delayed_orders_cm']";
					strGraphName = "Delayed Orders Chart";
					strHeaderLabel = getLabel_PageLabelAPI(row, "delayedOrders");	
					strPercentageLabel = getLabel_PageLabelAPI(row, "OrdersLateStarted");	
				}

				//Check whether header element label is displayed - Label - totalDeliveries Element is displayed - //*[@id='total_deliveries_cm']//span[@class="ng-binding" and text()='Total Deliveries']
				String strHeaderXPath = strGraphElem_UI+"//span[@class='ng-binding' and text()='"+strHeaderLabel+"']";
				rc = verifyElementIsVisible_DynamicWaits(strHeaderXPath, strHeaderLabel+" - Header Label");
				Assert.assertTrue(rc);

				//Check for percentages - Label - 'OrdersNotStarted' - 100% - {{Orders not dispatched, 'OrdersNotStarted'}}
				String strPercentage = graphElement.get("percentage").getAsString();
				String strPercentageXPath = strGraphElem_UI+"//span[@class='ng-binding' and text()='"+strPercentage+"% "+strPercentageLabel+"']";
				rc = verifyElementIsVisible_DynamicWaits(strHeaderXPath, strPercentageLabel+" - Header Label");
				Assert.assertTrue(rc);

				//Check whether the key performance number on chart top right is displayed - //*[@id='total_deliveries_cm']//span[@class="ng-binding" and text()='6']
				String strKeyTotalOrders = graphElement.get("percentage").getAsString();
				String strKeyNumberXPath = strGraphElem_UI+"//span[@class='ng-binding' and text()='"+strKeyTotalOrders+"']";
				rc = verifyElementIsVisible_DynamicWaits(strHeaderXPath, "Total Orders - on chart (top right)");
				Assert.assertTrue(rc);

				//Check linked graph data exists for our chart
				if (graphElement.has("linked_graph_data")){

					JsonObject linkedGraphData = graphElement.get("linked_graph_data").getAsJsonObject();
					for (String graphDataLabel : linkedGraphData.keySet())
					{
						if (graphElement.get("name").getAsString().equals("ORDERS NOT COMPLETED"))
						{
							String strValue = linkedGraphData.get(graphDataLabel).getAsString();
							String strLabel = graphDataLabel;
							if (strLabel.length() > 10){
								strLabel = strLabel.substring(0, 10);
							}

							//Validate whether the values are present inside chart component 
							String strGraphUI_DataElementXPath = strGraphElem_UI+"//*[contains (text(), '"+strValue+" - "+strLabel+"')]";
							//+"//*[starts-with (text(), '"+strValue+" - "+strLabel+"')]";//"//*[text()='"+strValue+" - "+strLabel+"']";
							rc = verifyElementIsVisible_DynamicWaits(strGraphUI_DataElementXPath, "Graph Data Element : "+graphDataLabel+" - "+strValue);
							Assert.assertTrue(rc);
						}
						else {

							String strValue = linkedGraphData.get(graphDataLabel).getAsString();
							String strLabel = getLabel_PageLabelAPI(row, graphDataLabel);
							Assert.assertNotNull(strLabel);

							if (strLabel.length() > 10){
								strLabel = strLabel.substring(0, 10);
							}

							//Validate whether the values are present inside chart component 
							String strGraphUI_DataElementXPath = strGraphElem_UI+"//*[contains (text(), '"+strValue+" - "+strLabel+"')]";//"//*[text()='"+strValue+" - "+strLabel+"']";
							rc = verifyElementIsVisible_DynamicWaits(strGraphUI_DataElementXPath, "Graph Data Element : "+graphDataLabel+" - "+strValue);
							Assert.assertTrue(rc);

						}
					}//End of data elements for this chart
				}
				else {
					//Verify No Data Available is present - Label - noDataAvailable
					String strLabelNoDataAvl = getLabel_PageLabelAPI(row, "noDataAvailable");
					if (strLabelNoDataAvl.length() > 10){
						strLabelNoDataAvl = strLabelNoDataAvl.substring(0, 10);
					}

					String strGraphUI_DataElementXPath = strGraphElem_UI+"//*[contains (text(), '"+strLabelNoDataAvl+"')]";//"//*[text()='"+strValue+" - "+strLabel+"']";
					rc = verifyElementIsVisible_DynamicWaits(strGraphUI_DataElementXPath, "Graph Element : No Data Available");
					Assert.assertTrue(rc);
				}

			}//For end - pick next chart


			//Verify Resources Pane - id="mile-resource-wrapper"
			String strResourcesPaneXPath = "//*[@id='mile-resource-wrapper']";

			//Get Resurces API Response
			JsonArray resourcesResults_JsonArr = getDashboardAPI_Resources();
			if (resourcesResults_JsonArr == null || resourcesResults_JsonArr.size() <= 0)
			{
				logMessage("Get Resources Dashboard API", "Should be able to verify resources API with Dashboard", "Unable to fetch resources response from API", "Failed");
				return false;
			}

			boolean validatedForVehicle = false;
			boolean validatedForDriver = false;
			boolean validatedForDeliveryMedium = false;

			for (int i = 0; i < resourcesResults_JsonArr.size(); i++) 
			{
				JsonObject resourceResultElem = resourcesResults_JsonArr.get(i).getAsJsonObject();
				String strName = resourceResultElem.get("name").getAsString();

				String strResourceElementXPath = "";
				if (strName != null && strName.equals("vehicle")){
					strResourceElementXPath = "//*[@category='Vehicle']";
					logMessage("Validate data for resource chart", "Resource Chart should be validated", "Validating for "+strName, "Passed");

					bringElementInView(strResourceElementXPath);
					JsonObject graphData = resourceResultElem.get("graph_data").getAsJsonObject();
					for(String strGraphKey : graphData.keySet())
					{
						String strGraphValue = graphData.get(strGraphKey).getAsString();
						String strGraphLabel = getLabel_PageLabelAPI(row,strGraphKey);
						if (strGraphLabel.length() > 10){
							strGraphLabel = strGraphLabel.substring(0, 10);
						}
						String strGraphDataXPath = strResourceElementXPath+"//*[text() = '"+strGraphValue+" - "+strGraphLabel+"']";////*[@category='Vehicle']//*[translate(text(),'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz') = '123 - available']//"//*[ starts-with (lower-case (text(), '"+strGraphValue+" - "+strGraphLabel.toLowerCase()+"'))]";//strGraphValue+" - "+strGraphLabel;
						rc = verifyElementIsVisible_DynamicWaits(strGraphDataXPath, "Graph Data : "+ strGraphValue+" - "+strGraphKey);
						Assert.assertTrue(rc);
					}

					validatedForVehicle = true;
				}
				else if (strName != null && strName.equals("driver")){
					strResourceElementXPath = "//*[@category='driver']";
					logMessage("Validate data for resource chart", "Resource Chart should be validated", "Validating for "+strName, "Passed");

					bringElementInView(strResourceElementXPath);
					JsonObject graphData = resourceResultElem.get("graph_data").getAsJsonObject();
					for(String strGraphKey : graphData.keySet())
					{
						String strGraphValue = graphData.get(strGraphKey).getAsString();
						String strGraphLabel = getLabel_PageLabelAPI(row,strGraphKey);
						if (strGraphLabel.length() > 10){
							strGraphLabel = strGraphLabel.substring(0, 10);
						}
						String strGraphDataXPath = strResourceElementXPath+"//*[text() = '"+strGraphValue+" - "+strGraphLabel+"']";////*[@category='Vehicle']//*[translate(text(),'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz') = '123 - available']//"//*[ starts-with (lower-case (text(), '"+strGraphValue+" - "+strGraphLabel.toLowerCase()+"'))]";//strGraphValue+" - "+strGraphLabel;
						rc = verifyElementIsVisible_DynamicWaits(strGraphDataXPath, "Graph Data : "+ strGraphValue+" - "+strGraphKey);
						Assert.assertTrue(rc);
					}

					validatedForDriver = true;
				}
				else if (strName != null && strName.equals("DELIVERY BOYS")){
					strResourceElementXPath = "//*[@category='deliveryMedium']";
					logMessage("Validate data for resource chart", "Resource Chart should be validated", "Validating for "+strName, "Passed");

					bringElementInView(strResourceElementXPath);
					JsonObject graphData = resourceResultElem.get("graph_data").getAsJsonObject();
					for(String strGraphKey : graphData.keySet())
					{
						String strGraphValue = graphData.get(strGraphKey).getAsString();
						String strGraphLabel = strGraphKey;//getLabel_PageLabelAPI(row,strGraphKey);
						if (strGraphLabel.length() > 10){
							strGraphLabel = strGraphLabel.substring(0, 10);
						}
						String strGraphDataXPath = strResourceElementXPath+"//*[text() = '"+strGraphValue+" - "+strGraphLabel+"']";////*[@category='Vehicle']//*[translate(text(),'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz') = '123 - available']//"//*[ starts-with (lower-case (text(), '"+strGraphValue+" - "+strGraphLabel.toLowerCase()+"'))]";//strGraphValue+" - "+strGraphLabel;
						rc = verifyElementIsVisible_DynamicWaits(strGraphDataXPath, "Graph Data : "+ strGraphValue+" - "+strGraphKey);
						Assert.assertTrue(rc);
					}

					validatedForDeliveryMedium = true;
				}
				else {
					continue;
				}
			}

			if (validatedForDeliveryMedium == false){
				logMessage("Validate delivery medium pie chart", "Pie chart for delivery medium should be validated", "Delivery Medium Resources chart was not validated", "Failed");
			}
			if (validatedForVehicle == false){
				logMessage("Validate Driver pie chart", "Pie chart for Driver should be validated", "Driver Resources chart was not validated", "Failed");
			}
			if (validatedForDriver == false){
				logMessage("Validate Driver pie chart", "Pie chart for Driver should be validated", "Driver Resources chart was not validated", "Failed");
			}

			//String strScreenshot = captureScreenshot(driver);//
			logMessage("Verify Dashboard", "Should be able to verify dashboard", "Verified dashboard screen", "Passed");


			return true;
		}
		catch (Exception e) 
		{
			
			//Adding Recovery
			if (iTimesRecoveryPerformed < iMaxRecoveriesAllowed)
			{
				iTimesRecoveryPerformed ++;
				waitForRandomSec(1);
				logMessage("Should be able to verify dashboard", "Re-trying dashboard verification due to "+e.getMessage(), "Retrying Dashboard verification", "Passed");

				//Recall Dashboard again 
				rc = verifyDashboard(row);
				if (rc == true){
					return true;
				}
			}
			logMessage("Verify Dashboard", "Dashboard view should be validated", "Unable to verify Dashboard view, Error : "+e.getLocalizedMessage(), "Failed");
			e.printStackTrace();
			return false;
		}
	}


	private JsonArray getDashboardAPI_DeliverShipments() 
	{

		JsonArray dashboardDeliverShipments = null;

		//https://demo.loginextsolutions.com/ReportingApp/dashboard/FMLM/DeliverShipments
		LinkedHashMap <String, String> row = getTempData();

		//Get the auth token and Client Secret from from Auth API
		String strAPI = null;

		try {
			strAPI = row.get("URL") + // demo.loginextsolutions.com/
					"ReportingApp/dashboard/FMLM/DeliverShipments";

			if (row.get("clientSecretKey") == null){
				row = getAuthDetailsWeb(row);
			}

			System.out.println("Getting strAPI : "+strAPI+" ");
			System.out.println("Headers \n"
					+ "client_secret_key:"+""+ row.get("clientSecretKey"));
			System.out.println("www-authenticate:"+""+ "BASIC "+row.get("token"));
			System.out.println("Content-Type:"+""+"application/json");

			Response structurePageModelResponse = given().when().headers(
					"client_secret_key", row.get("clientSecretKey"),
					"www-authenticate", "BASIC "+row.get("token"),
					"Content-Type","application/json")
					.post(strAPI);

			String strMenulModel = structurePageModelResponse.getBody().asString();
			System.out.println("strMenulModel: "+strMenulModel);
			JsonParser parser = new JsonParser();
			dashboardDeliverShipments = parser.parse(strMenulModel).getAsJsonArray();

			return dashboardDeliverShipments;
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			logMessage("Get Dashboard API", "Response from Dashboard API should be fetched", "Unable to get structure API Details - "+e.getLocalizedMessage()+" URL : "+strAPI, "Failed");
			return null;
		}

	}


	private JsonArray getDashboardAPI_Resources() 
	{

		JsonArray dashboardResources = null;

		//https://demo.loginextsolutions.com/ReportingApp/dashboard/FMLM/resources
		LinkedHashMap <String, String> row = getTempData();

		//Get the auth token and Client Secret from from Auth API
		String strAPI = null;

		try {
			strAPI = row.get("URL") + // demo.loginextsolutions.com/
					"ReportingApp/dashboard/FMLM/resources";

			if (row.get("clientSecretKey") == null){
				row = getAuthDetailsWeb(row);
			}

			System.out.println("Getting strAPI : "+strAPI+" ");
			System.out.println("Headers \n"
					+ "client_secret_key:"+""+ row.get("clientSecretKey"));
			System.out.println("www-authenticate:"+""+ "BASIC "+row.get("token"));
			System.out.println("Content-Type:"+""+"application/json");

			Response jsonResponse = given().when().headers(
					"client_secret_key", row.get("clientSecretKey"),
					"www-authenticate", "BASIC "+row.get("token"),
					"Content-Type","application/json")
					.post(strAPI);

			String strMenulModel = jsonResponse.getBody().asString();
			System.out.println("strMenulModel: "+strMenulModel);
			JsonParser parser = new JsonParser();
			dashboardResources = parser.parse(strMenulModel).getAsJsonArray();

			return dashboardResources;
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			logMessage("Get Dashboard API", "Response from Dashboard API should be fetched", "Unable to get structure API Details - "+e.getLocalizedMessage()+" URL : "+strAPI, "Failed");
			return null;
		}

	}


	/**
	 * 
	 * @param strPageDateHeader - Date Header on page - Eg - "//*[@id='walletBalanceDateRange']"
	 * @return
	 */
	public String getPageHeaderDates (String strPageDateHeader, String strReturnValue)
	{
		try 
		{
			System.out.println("strPageDateHeader: "+strPageDateHeader);
			System.out.println("strReturnValue: "+strReturnValue);

			//Get the date range - Will be in GMT String
			String strElementXPath = strPageDateHeader; //"//*[@id='walletBalanceDateRange']";
			String strOrderHeaderDateRange = getAttributeByXPath(strElementXPath, "Date Header Range", "value");//getElementTextByXPath(strElementXPath, "Date Range Header");
			System.out.println("Date Range ID: "+strOrderHeaderDateRange);
			String strDateFrom = "";
			String strDateTo = "";
			if (strOrderHeaderDateRange != null 
					&& strOrderHeaderDateRange.contains(" - ")){
				String dateRange [] = strOrderHeaderDateRange.split(" - ");
				strDateFrom = dateRange [0].trim();
				strDateTo = dateRange [1].trim();
			}

			//Hit List View API for that date range - Will be in GMT String
			LinkedHashMap<String, String> row = getTempData();
			String strDateFormat = row.get("DATEFORMAT");
			SimpleDateFormat sdfSourceFormat = new SimpleDateFormat(strDateFormat);
			SimpleDateFormat sdfOutputFormat = new SimpleDateFormat("yyyy-MM-dd");

			Date startDate = sdfSourceFormat.parse(strDateFrom);
			Date endDate = sdfSourceFormat.parse(strDateTo);

			String strStartDate = sdfOutputFormat.format(startDate) + " 00:00:00";
			String strEndDate = sdfOutputFormat.format(endDate) + " 23:59:59";

			//System.out.println("strStartDate: "+strStartDate);
			//System.out.println("strEndDate: "+strEndDate);

			if (strReturnValue != null && strReturnValue.equals("STARTDATE")){
				strReturnValue = strStartDate;	
			}
			else	 if (strReturnValue != null && strReturnValue.equals("ENDDATE")){
				strReturnValue = strEndDate;
			}
			else {
				strReturnValue = strStartDate +" - " + strEndDate;				
			}
			System.out.println("strReturnValue : "+strReturnValue);
			return strReturnValue;
		} catch (Exception e) {
			e.printStackTrace();
			logMessage("Get Dates listed on page header", "Should be able to get dates listed on page header", "Unable to get dates listed on page header", "Failed");
			return null;
		}
	}

	public boolean verifyColumnsExistsOnPage (JsonObject PageStructure_Json)
	{
		try {

			if (PageStructure_Json == null || PageStructure_Json.has("columns") == false){
				logMessage("Verify Json Structure", "Json Structure should not be null and contain info about column data","Json Structure Response : "+PageStructure_Json, "Failed");
			}

			//Click Show columns
			LinkedHashMap<String, String> row = getTempData();
			String strShowMoreColumnsLabel = getLabel_PageLabelAPI(row, "moreColumnBtnLabel");
			if (strShowMoreColumnsLabel == null){
				logMessage("Verify More Columns Label", "Label for moreColumnBtnLabel should be defined eg. 'Customize your view by adding/removing columns. We recommend max 8 columns for the best view'", "Label for - 'moreColumnBtnLabel' is not defined - assigning it to defaults", "Failed");
				strShowMoreColumnsLabel = "moreColumnBtnLabel";
			}

			String strShowColumnsXPath = "//*[@aria-label='"+strShowMoreColumnsLabel+"']";
			clickElementByJavascript(driver, strShowColumnsXPath, "Show more columns button");

			JsonObject PageStructureColumns = PageStructure_Json.get("columns").getAsJsonObject();
			for(String currentJsonElement : PageStructureColumns.keySet())
			{
				System.out.println("currentJsonElement: "+currentJsonElement);
				JsonObject strCurrentJsonElement = PageStructureColumns.get(currentJsonElement).getAsJsonObject();
				String strLabel = strCurrentJsonElement.getAsJsonObject().get("label").getAsString();
				System.out.println("strLabel: "+strLabel);

				//Check for -childLength /  childNodes length attrivute 
				int iChildNodeLength = strCurrentJsonElement.has ("childLength") ? strCurrentJsonElement.get("childLength").getAsInt() : 0;

				//If childLength > 0
				if (iChildNodeLength > 0){

					System.out.println("Element has child nodes...");
					JsonObject childNodesJsonObject =  strCurrentJsonElement.has ("childNodes") ? strCurrentJsonElement.get("childNodes").getAsJsonObject() : null;

					//Loop through Each ChildNode and Append it to Label 
					for(String currentChildNode : childNodesJsonObject.keySet()){
						String strChildLabel = childNodesJsonObject.get(currentChildNode).getAsJsonObject().get("label").getAsString();
						System.out.println("strChildLabel : "+strChildLabel);

						//Check for the visibility of the element by performing the actions over childnode
						String strChildLabelName = strLabel + strChildLabel;
						String strLabelXPath = "//label[@for='"+currentChildNode+"']";
						String strCheckboxXPath = "//input[@type='checkbox' and @id='"+currentChildNode+"']";
						rc = clickCheckboxByXPath(strCheckboxXPath, strLabelXPath, strLabel, true);
						//Adding wait for firefox 
						TimeUnit.SECONDS.sleep(5);

						//Verify whether column is shown in UI.
						String strColumnHeaderXPath = "//*[@class='ui-grid-header-cell-row']//*[contains (@class, '"+currentChildNode+"')]";//"//div[@role='columnheader']//*[@title='"+strLabel+"']";
						System.out.println("verify column header '"+strChildLabelName+"' is displayed...");
						bringElementInView_NoWait(strColumnHeaderXPath);
						boolean isDisplayed = verifyElementIsVisible_DynamicWaits (strColumnHeaderXPath, "Column Header - "+strChildLabelName);
						if (isDisplayed == false)
						{
							//Select the checkbox and validate the presence of column header
							System.out.println("Column is not displayed looping through next column...");
							continue;
						}


					}//End for Loop
				}
				else { //else if - childnode length is 0  
					System.out.println("Element does not have child nodes...");
					String strLabelXPath = "//label[@for='"+currentJsonElement+"']";
					String strCheckboxXPath = "//input[@type='checkbox' and @id='"+currentJsonElement+"']";
					rc = clickCheckboxByXPath(strCheckboxXPath, strLabelXPath, strLabel, true);
					//Adding wait for firefox 
					TimeUnit.SECONDS.sleep(5);

					//Verify whether column is shown in UI.
					String strColumnHeaderXPath = "//*[@class='ui-grid-header-cell-row']//*[contains (@class, '"+currentJsonElement+"')]";//"//div[@role='columnheader']//*[@title='"+strLabel+"']";
					System.out.println("verify column header '"+strLabel+"' is displayed...");
					bringElementInView_NoWait(strColumnHeaderXPath);
					boolean isDisplayed = verifyElementIsVisible_DynamicWaits (strColumnHeaderXPath, "Column Header - "+strLabel);
					if (isDisplayed == false)
					{
						//Select the checkbox and validate the presence of column header
						System.out.println("Column is not displayed looping through next column...");
						continue;
					}
				}
			}

			//CLick Save Button - //i[@class="logi-icon icon-save"]
			String strSaveColumnPreferences = "//i[@class='logi-icon icon-save']";
			rc = clickElementByXPath(strSaveColumnPreferences, "Save Column Preferences");
			Assert.assertTrue(rc);

		} catch (Exception e) {
			logMessage("Validate columns", "Should be able to validate columns", "Unable to validate columns", "Failed");
			e.printStackTrace();
			return false;
		}
		return true;
	}


	public boolean verifyOrderColumns (LinkedHashMap<String, String> row){

		//Navigate to orders page
		row = navigateToOrdersPage(row);

		//Get Orders Page Structure -  https://testing.loginextsolutions.com/LoginApp/framework/structure?modelName=ORDERS&pageName=ORDERS&sectionName=ALL_ORDER_LIST_VIEW
		JsonObject walletBranchStructure_Json = getStructureAPI("ORDERS", "ORDERS", "ALL_ORDER_LIST_VIEW");

		//Validate Wallets columns exists on page
		rc = verifyColumnsExistsOnPage(walletBranchStructure_Json);
		Assert.assertTrue(rc);


		return true;
	}

	//https://testing.loginextsolutions.com/ClientApp/client/wallet/list?endDate=2018-04-03+18:29:59&pageNumber=2&pageSize=50&startDate=2018-03-26+18:30:00&tab=BRANCH
	public JsonObject getWalletListView (
			String strStartDate, 
			String strEndDate, 
			String strTabName,
			String strPageNumber,
			String strPageSize)
	{

		JsonObject listViewResults = null;
		String strAPI = "";
		try {

			//https://demo.loginextsolutions.com/LoginApp/framework/structure?modelName=ORDERS&pageName=ORDERS&sectionName=ALL_ORDER_LIST_VIEW
			LinkedHashMap <String, String> row = getTempData();

			//Get the auth token and Client Secret from from Auth API
			strAPI = row.get("URL") + // demo.loginextsolutions.com/
					"ClientApp/client/wallet/list?"
					+ "endDate="+strEndDate//2018-04-03+18:29:59"
					+ "&pageNumber="+strPageNumber//2"
					+ "&pageSize="+strPageSize//50"
					+ "&startDate="+strStartDate//2018-03-26+18:30:00"
					+ "&tab="+strTabName;//BRANCH";

			if (row.get("clientSecretKey") == null){
				row = getAuthDetailsWeb(row);
			}

			System.out.println("Getting strAPI : "+strAPI+" ");
			System.out.println("Headers \n"
					+ "client_secret_key:"+""+ row.get("clientSecretKey"));
			System.out.println("www-authenticate:"+""+ "BASIC "+row.get("token"));
			System.out.println("Content-Type:"+""+"application/json");

			Response structurePageModelResponse = given().when().headers(
					"client_secret_key", row.get("clientSecretKey"),
					"www-authenticate", "BASIC "+row.get("token"),
					"Content-Type","application/json")
					.get(strAPI);

			String strMenulModel = structurePageModelResponse.getBody().asString();
			System.out.println("strMenulModel: "+strMenulModel);
			JsonParser parser = new JsonParser();
			listViewResults = parser.parse(strMenulModel).getAsJsonObject();

			if (listViewResults == null
					|| listViewResults.has("results") == false 
					//|| listViewResults.get("results").getAsJsonArray().size() == 0
					){
				logMessage("Get Data from list view", "Should be able to verify data for list view", "Unable to get data from list view API: url : "+strAPI, "Failed");
				return null;
			}
			return listViewResults;
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			logMessage("Get List View API", "Response from API should be fetched", "Unable to get data from list view API Error - "+e.getLocalizedMessage()+" API URL : "+strAPI, "Failed");
			return null;
		}

	}

	/**
	 * Verify wallet balances
	 * @param row
	 * @return
	 */
	public boolean verifyWalletBalance (LinkedHashMap<String, String> row) {
		try 
		{
			//Launch and navigate to Wallets Page
			rc = navigateToWalletsPage(row, "walletbalance");
			Assert.assertTrue(rc);

			//Click branch view
			String strWalletPageHeaderID = "//*[@id='walletBalanceDateRange']";
			String strHeaderStartDate = getPageHeaderDates(strWalletPageHeaderID, "STARTDATE");
			String strHeaderEndDate = getPageHeaderDates(strWalletPageHeaderID, "ENDDATE");

			//Get Branch View - Page Structure -  https://testing.loginextsolutions.com/LoginApp/framework/structure?modelName=WALLET_BALANCE&pageName=WALLET_BALANCE&sectionName=WALLET_BALANCE_BRANCH_LIST_VIEW
			JsonObject walletBranchStructure_Json = getStructureAPI("WALLET_BALANCE", "WALLET_BALANCE", "WALLET_BALANCE_BRANCH_LIST_VIEW");

			//Validate Wallets columns exists on page
			/*rc = verifyColumnsExistsOnPage(walletBranchStructure_Json);
			Assert.assertTrue(rc);*/
			TimeUnit.SECONDS.sleep(5);

			//Get Wallets List view - Branch Data -  https://testing.loginextsolutions.com/ClientApp/client/wallet/list?endDate=2018-04-03+18:29:59&pageNumber=2&pageSize=50&startDate=2018-03-26+18:30:00&tab=BRANCH
			JsonObject listViewResults = getWalletListView(strHeaderStartDate, strHeaderEndDate, "BRANCH", "1", "50");
			Assert.assertNotNull(listViewResults);

			//Verify Client view results with ones displayed on page
			JsonArray resultsArray = listViewResults.get("results").getAsJsonArray();
			if (resultsArray.size() == 0){
				logMessage("Get Data from list view", "Should be able to verify data for list view", "No Records fetched for - WALLET_BALANCE_BRANCH_LIST_VIEW", "Failed");
			}

			NumberFormat numberFormat = NumberFormat.getInstance();
			for (int i = 0; i < resultsArray.size(); i++)
			{
				JsonObject currentObject = resultsArray.get(i).getAsJsonObject();

				//Verify Branch Name exists on page - //*[@title='CXP']
				String strCurrentBranchName = currentObject.get("branchName").getAsString();
				String strClientBranchID = currentObject.get("clientBranchId").getAsString();//clientBranchId
				String strDeliveredOrderValue = currentObject.get("deliveredOrderValue").getAsString();//deliveredOrderValue
				String strDeliveredOrderCount = currentObject.get("deliveredOrderCount").getAsString();//deliveredOrderCount
				String strCurrentBalance = currentObject.get("currentBalance").getAsString();//currentBalance

				Number nExpectedBalance = numberFormat.parse(strCurrentBalance);
				Number nDeliveredOrderValue = numberFormat.parse(strDeliveredOrderValue);

				//Verify Branch Name exists
				String strBranchNameXPath = "//*[@title='"+strCurrentBranchName+"']";
				bringElementInView(strBranchNameXPath);
				String strBranchNameActual = getElementTextByXPath(strBranchNameXPath, "Branch Name : "+strCurrentBranchName);
				if (strBranchNameActual == null || strBranchNameActual.trim().equals(strCurrentBranchName.trim()) == false){
					logMessage("Get branch name", "Should be able to fetch results", "Branch name should be present", "Failed");
					return false;
				}

				//Validate No of orders delivered - deliveredOrderCount - //*[@id="clientBranchId-deliveredOrderCount"]//*[@id="clientBranchId-54696"]
				String strNoOfOrdersDeliveredXPath = "//*[@id='clientBranchId-deliveredOrderCount']//*[@id='clientBranchId-"+strClientBranchID+"']";
				String strActualNoOfOrdersDelivered = getElementTextByXPath(strNoOfOrdersDeliveredXPath, "No of orders delivered");

				//Validate Value of orders delivered - deliveredOrderValue - //*[@id="clientBranchId-deliveredOrderValue"]//*[@id="clientBranchId-54696"]
				String strValueOfOrdersDeliveredXPath = "//*[@id='clientBranchId-deliveredOrderValue']//*[@id='clientBranchId-"+strClientBranchID+"']";
				String strActualValueOfOrdersDelivered = getElementTextByXPath(strValueOfOrdersDeliveredXPath, "Value of orders delivered");
				Number nActualOrderValue = numberFormat.parse(strActualValueOfOrdersDelivered);
				//System.out.println(nActualOrderValue);
				if (nDeliveredOrderValue.toString().equals(nActualOrderValue.toString()))
				{
					logMessage("Verify order value", "Order value for branch "+strCurrentBranchName +" Should be validated, Equal to "+nActualOrderValue, "Expecting : "+nDeliveredOrderValue+", Actual Order Value : "+nActualOrderValue, "Passed");
				}
				else{
					logMessage("Verify order value", "Order value for branch "+strCurrentBranchName +" Should be validated, Equal to "+nActualOrderValue, "Expecting : "+nDeliveredOrderValue+", Actual Order Value : "+nActualOrderValue, "Failed");
					return false;
				}

				//Validate current balance with Json - currentBalance - //*[@id="clientBranchId-currentBalance"]//*[@id="clientBranchId-54696"] - id="clientBranchId-currentBalance"
				String strCurrentBalanceXPath = "//*[@id='clientBranchId-currentBalance']//*[@id='clientBranchId-"+strClientBranchID+"']";
				String strActualCurrentBalance = getElementTextByXPath(strCurrentBalanceXPath, "Current Balance");
				Number nActualOrderBalance = numberFormat.parse(strActualCurrentBalance);
				//System.out.println(nActualOrderBalance);
				if (nExpectedBalance.toString().equals(nActualOrderBalance.toString())){
					logMessage("Verify Balance", "Order value for branch "+strCurrentBranchName +" Should be validated, Equal to "+nExpectedBalance, "Expecting : "+nExpectedBalance+", Actual Balance : "+nActualOrderValue, "Passed");
				}
				else{
					logMessage("Verify Balance", "Order value for branch "+strCurrentBranchName +" Should be validated, Equal to "+nExpectedBalance, "Expecting : "+nExpectedBalance+", Actual Balance : "+nActualOrderValue, "Failed");
					return false;
				}
			}

			//Click Client View / Account View
			String strClientViewButtonXPath = "//*[@logi-google-analytics='Wallet Balance - Account View']";
			bringElementInView(strClientViewButtonXPath);
			rc = clickElementByJavascript(driver, strClientViewButtonXPath, "Wallet Balances - Client View"); // (strClientViewButton, "Wallet Balances - Client View");
			Assert.assertTrue(rc);

			//Get Page Structure - https://testing.loginextsolutions.com/LoginApp/framework/structure?modelName=WALLET_BALANCE&pageName=WALLET_BALANCE&sectionName=WALLET_BALANCE_ACCOUNT_LIST_VIEW
			JsonObject walletAccountClient_Structure_Json = getStructureAPI ("WALLET_BALANCE", "WALLET_BALANCE", "WALLET_BALANCE_ACCOUNT_LIST_VIEW");

			//Validate Wallets columns exists on page
			/*rc = verifyColumnsExistsOnPage(walletAccountClient_Structure_Json);
			Assert.assertTrue(rc);*/
			TimeUnit.SECONDS.sleep(5);
			
			//Get Accounts View Data - https://testing.loginextsolutions.com/ClientApp/client/wallet/list?endDate=2018-04-03+23:59:59&startDate=2018-03-27+00:00:00&tab=ACCOUNT
			listViewResults = getWalletListView(strHeaderStartDate, strHeaderEndDate, "ACCOUNT", "1", "50");
			Assert.assertNotNull(listViewResults);

			//Verify Client view results with ones displayed on page
			resultsArray = listViewResults.get("results").getAsJsonArray();
			if (resultsArray.size() == 0){
				logMessage("Get Data from list view", "Should be able to verify data for list view", "No Records fetched for - WALLET_BALANCE_ACCOUNT_LIST_VIEW", "Failed");
			}


			//Verify Accounts view results with ones displayed on page
			for (int i = 0; i < resultsArray.size(); i++)
			{
				JsonObject currentObject = resultsArray.get(i).getAsJsonObject();

				//Verify accountName exists on page - //*[@title='CXP']
				String strCurrentBranchName = currentObject.get("accountName").getAsString();
				String strClientBranchId = currentObject.get("clientBranchId").getAsString();//clientBranchId
				String strDeliveredOrderValue = currentObject.get("deliveredOrderValue").getAsString();//deliveredOrderValue
				String strDeliveredOrderCount = currentObject.get("deliveredOrderCount").getAsString();//deliveredOrderCount
				String strCurrentBalance = currentObject.get("currentBalance").getAsString();//currentBalance

				Number nExpectedBalance = numberFormat.parse(strCurrentBalance);
				Number nDeliveredOrderValue = numberFormat.parse(strDeliveredOrderValue);

				//Verify Branch Name exists
				String strBranchNameXPath = "//*[@title='"+strCurrentBranchName+"']";
				bringElementInView(strBranchNameXPath);
				String strBranchNameActual = getElementTextByXPath(strBranchNameXPath, "Sub Client Name : "+strCurrentBranchName);
				if (strBranchNameActual == null || strBranchNameActual.trim().equals(strCurrentBranchName.trim()) == false){
					logMessage("Get branch name", "Should be able to fetch results", "Branch name should be present", "Failed");
					return false;
				}

				//Validate No of orders delivered - deliveredOrderCount - //*[@id="clientBranchId-deliveredOrderCount"]//*[@id="clientBranchId-54696"]
				String strNoOfOrdersDeliveredXPath = "//*[@id='clientBranchId-deliveredOrderCount']//*[@id='clientBranchId-"+strClientBranchId+"']";
				String strActualNoOfOrdersDelivered = getElementTextByXPath(strNoOfOrdersDeliveredXPath, "No of orders delivered - subclient");

				//Validate Value of orders delivered - deliveredOrderValue - //*[@id="clientBranchId-deliveredOrderValue"]//*[@id="clientBranchId-54696"]
				String strValueOfOrdersDeliveredXPath = "//*[@id='clientBranchId-deliveredOrderValue']//*[@id='clientBranchId-"+strClientBranchId+"']";
				String strActualValueOfOrdersDelivered = getElementTextByXPath(strValueOfOrdersDeliveredXPath, "Value of orders delivered - subclient");
				Number nActualOrderValue = numberFormat.parse(strActualValueOfOrdersDelivered);
				//System.out.println(nActualOrderValue);
				if (nDeliveredOrderValue.toString().equals(nActualOrderValue.toString())){
					logMessage("Verify order value", "Order value for Sub Client "+strCurrentBranchName +" Should be validated, Equal to "+nDeliveredOrderValue, "Expecting : "+nDeliveredOrderValue+", Actual Order Value : "+nActualOrderValue, "Passed");
				}
				else{
					logMessage("Verify order value", "Order value for Sub Client "+strCurrentBranchName +" Should be validated, Equal to "+nDeliveredOrderValue, "Expecting : "+nDeliveredOrderValue+", Actual Order Value : "+nActualOrderValue, "Failed");
					return false;
				}

				//Validate current balance with Json - currentBalance - //*[@id="clientBranchId-currentBalance"]//*[@id="clientBranchId-54696"] - id="clientBranchId-currentBalance"
				String strCurrentBalanceXPath = "//*[@id='clientBranchId-currentBalance']//*[@id='clientBranchId-"+strClientBranchId+"']";
				String strActualCurrentBalance = getElementTextByXPath(strCurrentBalanceXPath, "Current Balance");
				Number nActualOrderBalance = numberFormat.parse(strActualCurrentBalance);
				//System.out.println(nActualOrderBalance);
				if (nExpectedBalance.toString().equals(nActualOrderBalance.toString())){
					logMessage("Verify Balance", "Order value for Sub Client "+strCurrentBranchName +" Should be validated, Equal to "+nExpectedBalance, "Expecting : "+nExpectedBalance+", Actual Balance : "+nActualOrderBalance, "Passed");
				}
				else{
					logMessage("Verify Balance", "Order value for Sub Client "+strCurrentBranchName +" Should be validated, Equal to "+nExpectedBalance, "Expecting : "+nExpectedBalance+", Actual Balance : "+nActualOrderBalance, "Failed");
					return false;
				}
			}


			/***CREATE AN ORDER AND VERIFY WALLET BALANCES

			//Get auth token keys
			row = getTempData();
			Assert.assertNotNull(row);

			//Add an order against the branch name
			row = addOrderTest(row);

			//Verify order is added
			row = getTempData();
			String strAddedOrderNo = row.get("OrderNumber");
			Assert.assertNotNull(strAddedOrderNo);

			//Mark Order Delivered
			rc = markOrderDelivered(row);

			 ***/
			return true;	
		}
		catch (Exception e) 
		{
			logMessage("Verify wallet", "Should be able to perform wallet", "Unable to perform wallet test "+e.getMessage(),"Failed");
			e.printStackTrace();
			return false;
		}
	}

	/**
	 * Verify wallet balances
	 * @param row
	 * @return
	 */
	public boolean verifyWalletTransactions (LinkedHashMap<String, String> row) {
		try 
		{
			//Launch and navigate to Wallets Page
			rc = navigateToWalletsPage(row, "wallettransaction");
			Assert.assertTrue(rc);

			//Click branch view
			String strWalletPageHeaderID = "//*[@id='walletTransactionDateRange']";
			String strHeaderStartDate = getPageHeaderDates(strWalletPageHeaderID, "STARTDATE");
			String strHeaderEndDate = getPageHeaderDates(strWalletPageHeaderID, "ENDDATE");

			//Get Branch View - Wallet Transaction - Page Structure -  https://testing.loginextsolutions.com/LoginApp/framework/structure?modelName=WALLET_TRANSACTIONS&pageName=WALLET_TRANSACTIONS&sectionName=WALLET_TRANSACTIONS_BRANCH_LIST_VIEW
			JsonObject walletTrxStructure_Json = getStructureAPI("WALLET_TRANSACTIONS", "WALLET_TRANSACTIONS", "WALLET_TRANSACTIONS_BRANCH_LIST_VIEW");

			//Validate Wallets columns exists on page
			/*rc = verifyColumnsExistsOnPage(walletTrxStructure_Json);
			Assert.assertTrue(rc);*/
			TimeUnit.SECONDS.sleep(5);

			//Get Wallets Transactions List view - Branch Data -  https://testing.loginextsolutions.com/ClientApp/client/wallet/history?endDate=2018-04-03+18:29:59&startDate=2018-03-26+18:30:00&tab=BRANCH
			JsonObject listViewResults = getWalletTransactionHistory(strHeaderStartDate, strHeaderEndDate, "BRANCH", "1", "50");
			Assert.assertNotNull(listViewResults);

			//Wait for Results Data to rearrange on current page - 
			TimeUnit.SECONDS.sleep(5);

			//Verify Client view results with ones displayed on page
			JsonArray resultsArray = listViewResults.get("results").getAsJsonArray();
			System.out.println("resultsArray: "+resultsArray);
			NumberFormat numberFormat = NumberFormat.getInstance();
			for (int i = 0; i < resultsArray.size(); i++)
			{
				JsonObject currentObject = resultsArray.get(i).getAsJsonObject();

				//Verify Ledger ID exists on page - //*[@title='CXP']
				String strLedgerDetailsID = currentObject.get("ledgerDetailsId").getAsString();
				String strAmount = currentObject.get("amount").getAsString();//clientBranchId
				String strType = currentObject.get("type").getAsString();//clientBranchId
				String strStatus = currentObject.get("status").getAsString();//clientBranchId

				Number nExpectedAmount = numberFormat.parse(strAmount);

				//Scroll to Transaction ID
				String strRowXPath = "//*[@id='ledgerDetailsId-"+strLedgerDetailsID+"']";
				bringElementInView(strRowXPath);

				String strAmountXPath = "//*[@id='ledgerDetailsId-amount']//*[@id='ledgerDetailsId-"+strLedgerDetailsID+"']";
				String strActualAmount = getElementTextByXPath(strAmountXPath, "Amount");
				Number nActualAmount = numberFormat.parse(strActualAmount);
				if (nExpectedAmount.toString().equals(nActualAmount.toString())){
					logMessage("Verify Amount for Ledger ID : "+strLedgerDetailsID, " Should be validated, Equal to "+nExpectedAmount, "Expecting : "+nExpectedAmount+", Actual Order Value : "+nActualAmount, "Passed");
				}
				else{
					logMessage("Verify Amount for Ledger ID : "+strLedgerDetailsID, " Should be validated, Equal to "+nExpectedAmount, "Expecting : "+nExpectedAmount+", Actual Order Value : "+nActualAmount, "Failed");
					return false;
				}

				String strTypeXPath = "//*[@id='ledgerDetailsId-type']//*[@id='ledgerDetailsId-"+strLedgerDetailsID+"']";
				String strActualType = getElementTextByXPath(strTypeXPath, "Type");
				if (strActualType.equals(strType)){
					logMessage("Verify Transaction Type : "+strLedgerDetailsID, " Should be validated, Equal to "+strType, "Expecting : "+strType+", Actual : "+strActualType, "Passed");
				}
				else{
					logMessage("Verify Transaction Type : "+strLedgerDetailsID, " Should be validated, Equal to "+strType, "Expecting : "+strType+", Actual : "+strActualType, "Failed");
					return false;
				}

			}

			//Click Client View / Account View
			String strClientViewButtonXPath = "//*[@logi-google-analytics='Wallet Balance - Account View']";
			bringElementInView(strClientViewButtonXPath);
			rc = clickElementByJavascript(driver, strClientViewButtonXPath, "Wallet Balances - Client View"); // (strClientViewButton, "Wallet Balances - Client View");
			Assert.assertTrue(rc);

			//Get Client View - Wallet Transaction - Page Structure -  https://testing.loginextsolutions.com/LoginApp/framework/structure?modelName=WALLET_TRANSACTIONS&pageName=WALLET_TRANSACTIONS&sectionName=WALLET_TRANSACTIONS_BRANCH_LIST_VIEW
			walletTrxStructure_Json = getStructureAPI("WALLET_TRANSACTIONS", "WALLET_TRANSACTIONS", "WALLET_TRANSACTIONS_ACCOUNT_LIST_VIEW");

			//Validate Wallets columns exists on page
			/*rc = verifyColumnsExistsOnPage(walletTrxStructure_Json);
			Assert.assertTrue(rc);*/
			TimeUnit.SECONDS.sleep(5);
			
			listViewResults = getWalletTransactionHistory(strHeaderStartDate, strHeaderEndDate, "ACCOUNT", "1", "50");
			Assert.assertNotNull(listViewResults);

			//Wait for Results Data to rearrange on current page - 
			TimeUnit.SECONDS.sleep(5);

			resultsArray = listViewResults.get("results").getAsJsonArray();
			System.out.println("resultsArray: "+resultsArray);

			for (int i = 0; i < resultsArray.size(); i++)
			{
				JsonObject currentObject = resultsArray.get(i).getAsJsonObject();

				//Verify Ledger ID exists on page - //*[@title='CXP']
				String strLedgerDetailsID = currentObject.get("ledgerDetailsId").getAsString();
				String strAmount = currentObject.get("amount").getAsString();//clientBranchId
				String strType = currentObject.get("type").getAsString();//clientBranchId
				String strStatus = currentObject.get("status").getAsString();//clientBranchId

				Number nExpectedAmount = numberFormat.parse(strAmount);

				//Scroll to Transaction ID
				String strRowXPath = "//*[@id='ledgerDetailsId-"+strLedgerDetailsID+"']";
				bringElementInView(strRowXPath);

				String strAmountXPath = "//*[@id='ledgerDetailsId-amount']//*[@id='ledgerDetailsId-"+strLedgerDetailsID+"']";
				String strActualAmount = getElementTextByXPath(strAmountXPath, "Amount");
				Number nActualAmount = numberFormat.parse(strActualAmount);
				if (nExpectedAmount.toString().equals(nActualAmount.toString())){
					logMessage("Verify Amount for Ledger ID : "+strLedgerDetailsID, " Should be validated, Equal to "+nExpectedAmount, "Expecting : "+nExpectedAmount+", Actual Order Value : "+nActualAmount, "Passed");
				}
				else{
					logMessage("Verify Amount for Ledger ID : "+strLedgerDetailsID, " Should be validated, Equal to "+nExpectedAmount, "Expecting : "+nExpectedAmount+", Actual Order Value : "+nActualAmount, "Failed");
					return false;
				}

				String strTypeXPath = "//*[@id='ledgerDetailsId-type']//*[@id='ledgerDetailsId-"+strLedgerDetailsID+"']";
				String strActualType = getElementTextByXPath(strTypeXPath, "Type");
				if (strActualType.equals(strType)){
					logMessage("Verify Transaction Type : "+strLedgerDetailsID, " Should be validated, Equal to "+strType, "Expecting : "+strType+", Actual : "+strActualType, "Passed");
				}
				else{
					logMessage("Verify Transaction Type : "+strLedgerDetailsID, " Should be validated, Equal to "+strType, "Expecting : "+strType+", Actual : "+strActualType, "Failed");
					return false;
				}

			}

			return true;	
		}
		catch (Exception e) 
		{
			logMessage("Verify wallet", "Should be able to perform wallet", "Unable to perform wallet test "+e.getMessage(),"Failed");
			e.printStackTrace();
			return false;
		}

	}


	//https://testing.loginextsolutions.com/ClientApp/client/wallet/history?endDate=2018-04-03+18:29:59&pageNumber=1&pageSize=100&startDate=2018-03-26+18:30:00&tab=BRANCH
	private JsonObject getWalletTransactionHistory(
			String strStartDate, 
			String strEndDate,
			String strTabName,
			String strPageNumber, 
			String strPageSize) {


		JsonObject listViewResults = null;
		String strAPI = "";
		try {

			//https://demo.loginextsolutions.com/LoginApp/framework/structure?modelName=ORDERS&pageName=ORDERS&sectionName=ALL_ORDER_LIST_VIEW
			LinkedHashMap <String, String> row = getTempData();

			//Get the auth token and Client Secret from from Auth API
			strAPI = row.get("URL") + // demo.loginextsolutions.com/
					"ClientApp/client/wallet/history?"
					+ "endDate="+strEndDate
					+ "&pageNumber="+strPageNumber
					+ "&pageSize="+strPageSize
					+ "&startDate="+strStartDate
					+ "&tab="+strTabName;
			//"ClientApp/client/wallet/list?"
			//+ "endDate="+strEndDate//2018-04-03+18:29:59"
			//+ "&pageNumber="+strPageNumber//2"
			//+ "&pageSize="+strPageSize//50"
			//+ "&startDate="+strStartDate//2018-03-26+18:30:00"
			//+ "&tab="+strTabName;//BRANCH";

			if (row.get("clientSecretKey") == null){
				row = getAuthDetailsWeb(row);
			}

			System.out.println("Getting strAPI : "+strAPI+" ");
			System.out.println("Headers \n"
					+ "client_secret_key:"+""+ row.get("clientSecretKey"));
			System.out.println("www-authenticate:"+""+ "BASIC "+row.get("token"));
			System.out.println("Content-Type:"+""+"application/json");

			Response structurePageModelResponse = given().when().headers(
					"client_secret_key", row.get("clientSecretKey"),
					"www-authenticate", "BASIC "+row.get("token"),
					"Content-Type","application/json")
					.get(strAPI);

			String strMenulModel = structurePageModelResponse.getBody().asString();
			System.out.println("strMenulModel: "+strMenulModel);
			JsonParser parser = new JsonParser();
			listViewResults = parser.parse(strMenulModel).getAsJsonObject();

			if (listViewResults == null
					|| listViewResults.has("results") == false 
					//|| listViewResults.get("results").getAsJsonArray().size() == 0
					){
				logMessage("Get Data from list view", "Should be able to verify data for list view", "Unable to get data from list view API: url : "+strAPI, "Failed");
				return null;
			}
			return listViewResults;
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			logMessage("Get List View API", "Response from API should be fetched", "Unable to get data from list view API Error - "+e.getLocalizedMessage()+" API URL : "+strAPI, "Failed");
			return null;
		}

	}


	public void scrollUp(){
		//to perform Scroll on application using  Selenium
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-250)", "");
	}


	public boolean verifyWalletWithdrawal(LinkedHashMap<String, String> row) {
		try 
		{

			//Launch and navigate to Wallets Page
			rc = navigateToWalletsPage(row, "wallettransaction");
			Assert.assertTrue(rc);

			//Wait for some amount of time after reaching wallet transactions page
			TimeUnit.SECONDS.sleep(12);

			//Get Wallets Date Range
			String strWalletPageHeaderID = "//*[@id='walletTransactionDateRange']";
			String strHeaderStartDate = getPageHeaderDates(strWalletPageHeaderID, "STARTDATE");
			String strHeaderEndDate = getPageHeaderDates(strWalletPageHeaderID, "ENDDATE");
			System.out.println("strHeaderStartDate: "+strHeaderStartDate);
			System.out.println("strHeaderEndDate: "+strHeaderEndDate);

			String strTotalAvlBalanceLabel = getLabel_PageLabelAPI(row, "totalAvailableBalance");

			//Get Wallets Transactions List view - Branch Data -  https://testing.loginextsolutions.com/ClientApp/client/wallet/history?endDate=2018-04-03+18:29:59&startDate=2018-03-26+18:30:00&tab=BRANCH
			JsonObject listViewResults = getWalletTransactionHistory(strHeaderStartDate, strHeaderEndDate, "BRANCH", "1", "50");
			Assert.assertNotNull(listViewResults);

			//Get Total Balance - //*[@class="balance-item"]
			String strTotalAvlBalanceXPath = "//*[@class='balance-item']";
			String strTotalAvlBalance = getElementTextByXPath(strTotalAvlBalanceXPath, "Total Available Balance");
			System.out.println("strTotalAvlBalance: "+strTotalAvlBalance);
			if (strTotalAvlBalance.contains(strTotalAvlBalanceLabel) == false)
			{
				logMessage("Get Total Available Balance Label from screen","Should be able to get Label Total Available balance from screen", "Total Available balance label was not found on screen - Label - "+strTotalAvlBalanceLabel, "Failed");
				return false;
			}

			//Get the amount from total available balance to withdraw
			String strTotalAmountAvailable = strTotalAvlBalance.substring(strTotalAvlBalance.indexOf(":")+1,  strTotalAvlBalance.length()).trim();
			System.out.println("strTotalAmountAvailable: "+strTotalAmountAvailable);

			NumberFormat format = NumberFormat.getInstance();
			Number n_TotalAvlBalance = format.parse(strTotalAmountAvailable);
			long dTotalBalance = (long) n_TotalAvlBalance;
			if (dTotalBalance <= 0){
				logMessage("Get total available balance", "Total Available balance should not be zero for withdrawal", "Total available balance is "+dTotalBalance, "Failed");
				return false;
			}

			//Click withdraw button - logi-google-analytics="Wallet Balance - Withdraw"
			String strWithdrawAmountBtm = "//*[@logi-google-analytics='Wallet Balance - Withdraw']";
			rc = clickElementByXPath(strWithdrawAmountBtm, "Wallet Balance - Withdrawal");
			Assert.assertTrue(rc);

			//Wait for the popup to appear
			TimeUnit.SECONDS.sleep(7);

			//Get Wallet withdrawal structure - https://testing.loginextsolutions.com/LoginApp/framework/structure?pageName=WALLET_TRANSACTIONS_WITHDRAW&sectionName=WALLET_TRANSACTION_WITHDRAW_FORM&modelName=WALLET_TRANSACTIONS_WITHDRAW&
			JsonObject pageStructure = getStructureAPI("WALLET_TRANSACTIONS_WITHDRAW", "WALLET_TRANSACTIONS_WITHDRAW", "WALLET_TRANSACTION_WITHDRAW_FORM");
			String strPageStructure = pageStructure.toString();
			System.out.println("strPageStructure: "+strPageStructure);

			//Fetch Page Specific TestData
			String strPageName = "Wallets_Withdrawal_Page";//"Vehicle_Page";//"Orders_Page";
			LinkedHashMap <String, String> pageDataMap = getPageObjects(row, strPageName); // ReadExcel2.readSortedTestDataMap(strSheetName, strPageName);

			//Perform substitution of keywords or functions like AUTOGEN / DATE / BOOLEAN / INTEGER / DECIMAL etc from DataSheet with actual values,
			updateTempData(row);
			pageDataMap = substituteDataMapKeywords (pageDataMap);
			System.out.println("pageDataMap: "+pageDataMap);
			String strWithdrawAmt = pageDataMap.get("withdrawAmount");
			long l_WithdrawAmt = Long.parseLong(strWithdrawAmt);  
			rc = enterValues(pageDataMap, strPageStructure);		
			Assert.assertTrue(rc);

			//Click Withdraw button - //*[@logi-google-analytics="Withdraw Balance - Withdraw"]
			String strWithdraBtnwXPath = "//*[@logi-google-analytics='Withdraw Balance - Withdraw']";
			rc = clickElementByXPath(strWithdraBtnwXPath, "Withdraw button");
			Assert.assertTrue(rc);

			//Verify Success Message - Withdrawal request queued successfully - Label - wallet.withdrawal.queued.success
			String strExpectedPromptValue = getLabel_PageLabelAPI(row, "wallet.withdrawal.queued.success");

			//Wait for prompt message //
			String strPromptXPath = "//*[@id='js-prompt']";//"//*[@id='js-prompt']";
			rc = waitForJS_PromptMessageJS(strExpectedPromptValue, strPromptXPath);// waitForJS_PromptMessage(strExpectedPromptValue);
			if (rc)
			{
				logMessage("Verify Success Message", "Success Message - "+strExpectedPromptValue+" Successfully should display", "Message : "+strExpectedPromptValue+" is displayed", "Passed");
			}
			else
			{
				String strPromptValue = getPromptElementTextByXPath(strPromptXPath, "Prompt");//getElementTextByXPath(strPromptXPath, "Prompt");
				logMessage("Verify Success Message", "Success Message - "+strExpectedPromptValue+" should display", "Success Message is not displayed, Unable to create an order, Expecting Message : "+strExpectedPromptValue+" Actual : "+strPromptValue, "Failed");
				return false;
			}

			TimeUnit.SECONDS.sleep(3);

			//Verify the subtraction of Amount from total Available balance 
			strTotalAvlBalance = getElementTextByXPath(strTotalAvlBalanceXPath, "Total Available Balance - Post withdraw");
			System.out.println("strTotalAvlBalance: "+strTotalAvlBalance);

			//Get the amount from total available balance to withdraw
			strTotalAmountAvailable = strTotalAvlBalance.substring(strTotalAvlBalance.indexOf(":")+1,  strTotalAvlBalance.length()).trim();
			System.out.println("strTotalAmountAvailable: "+strTotalAmountAvailable);

			Number n_TotalAvlBalance_New = format.parse(strTotalAmountAvailable);
			long dTotalBalance_PostWithdraw = (long) n_TotalAvlBalance_New;
			if (dTotalBalance_PostWithdraw <= 0){
				logMessage("Get total available balance post withdraw", "Total Available balance post withdraw should not be zero", "Total available balance is "+dTotalBalance_PostWithdraw, "Failed");
				return false;
			}

			//Verify whether total avl balance gets subtracted
			System.out.println("dTotalBalance :"+dTotalBalance);
			System.out.println("l_WithdrawAmt :"+l_WithdrawAmt);
			System.out.println("dTotalBalance_PostWithdraw :"+dTotalBalance_PostWithdraw);

			long l_expectedAmt = dTotalBalance - l_WithdrawAmt;
			long l_ActualAmt = dTotalBalance_PostWithdraw;
			System.out.println("Expected Displayed Amount "+l_expectedAmt+" \nl_ActualAmt"+l_ActualAmt+"");
			if (l_expectedAmt == l_ActualAmt){
				logMessage("Verify total withdraw amount post withdraw", "Total withdraw amount should be "+l_expectedAmt, "Total Withdraw amount is updated "+l_ActualAmt+" Before withdrawal : "+dTotalBalance+"", "Passed");
			}
			else {
				logMessage("Verify total withdraw amount post withdraw", "Total withdraw amount should be "+l_expectedAmt, "Total Withdraw amount is "+l_ActualAmt+" Expected : "+l_expectedAmt, "Failed");
				return false;
			}

			return true;
		} 
		catch (Exception e) 
		{
			logMessage("Verify wallet", "Should be able to perform wallet", "Unable to perform wallet test "+e.getMessage(),"Failed");
			e.printStackTrace();
			return false;	
		}

	}


	public boolean verifyDeliveryBoyInlineUpdate (LinkedHashMap<String, String> row) 
	{
		try 
		{
			//Add Delivery Boy
			row = addDeliveryBoyTest(row);
			row = getTempData();
			/*
			row.put("db.deliveryMediumMasterName","User_9566");//db.deliveryMediumMasterName=User_9566
			row.put("db.capacityInUnits","10");//db.capacityInUnits=10,
			row.put("db.capacityInVolume","90.1");//db.capacityInVolume=90.1, 
			row.put("db.capacityInWeight","90.1");//db.capacityInWeight=90.1
			 */
			Assert.assertNotNull(row);

			String strDeliveryBoyName = row.get("db.deliveryMediumMasterName");
			System.out.println("strDeliveryBoyName: "+strDeliveryBoyName);

			//Get The Page Structure API for Delivery Medium - https://testing.loginextsolutions.com/LoginApp/framework/structure?modelName=DELIVERYMEDIUM&pageName=DELIVERYMEDIUM&sectionName=DELIVERY_MEDIUM_LIST_VIEW - {"columns":{"deliveryMediumMasterName":{"label":"Name","fieldName":"input","fieldType":"text","permission":true,"id":"deliveryMediumMasterName","required":true,"childLength":0,"rowSpan":2,"colSpan":0,"childNodes":{},"validation":{"minlength":{"args":"3","message":"Minimum 3 characters required."},"required":{"message":"Full Name is required"},"maxlength":{"args":"50","message":"Full Name must be maximum 50 characters long."}},"labelKey":"deliveryMediumMasterName","allowed":false,"searchable":true,"editable":true,"sortable":true,"infoFlag":false},"phoneNumber":{"label":"Phone Number","fieldName":"input","fieldType":"text","permission":true,"id":"phoneNumber","required":true,"childLength":0,"rowSpan":2,"colSpan":0,"childNodes":{},"validation":{"required":{"message":"Mobile Number is Required"},"phonenumber":{"args":"","message":"INVALID Mobile Number"},"maxlength":{"args":"18","message":"Mobile Number must be maximum 18 characters long."}},"labelKey":"phoneNumber","allowed":false,"searchable":true,"editable":true,"sortable":true,"infoFlag":false},"branchName":{"label":"Kendra","fieldName":"input","fieldType":"select","permission":true,"id":"branchName","required":false,"childLength":0,"rowSpan":2,"colSpan":0,"childNodes":{},"validation":{},"labelKey":"branchName","allowed":false,"searchable":true,"editable":true,"sortable":true,"infoFlag":false},"capacity":{"label":"Capacity","permission":true,"id":"capacity","required":false,"childLength":3,"rowSpan":1,"colSpan":0,"childNodes":{"capacityInWeight":{"label":"(in Kg)","fieldName":"input","fieldType":"text","permission":true,"id":"capacityInWeight","required":false,"childLength":0,"rowSpan":0,"colSpan":0,"childNodes":{},"validation":{"numeric":{"args":"","message":"Please enter a valid Capacity."},"minlength":{"args":"0","message":"Please enter a valid Capacity."},"max":{"args":"999999999","message":"Capacity (Weight) value must be less than equal to 999999999."}},"labelKey":"capacityInWeight","allowed":false,"searchable":true,"editable":true,"sortable":true,"infoFlag":false},"capacityInUnits":{"label":"(in Units)","fieldName":"input","fieldType":"text","permission":true,"id":"capacityInUnits","required":true,"childLength":0,"rowSpan":0,"colSpan":0,"childNodes":{},"validation":{"numeric":{"args":"","message":"Please enter a valid Capacity."},"required":{"message":"Units is Required"},"minlength":{"args":"0","message":"Please enter a valid Capacity."},"min":{"args":"0","message":"Please enter a valid Capacity."},"max":{"args":"999999999","message":"Capacity (Units) value must be less than equal to 999999999."}},"labelKey":"capacityInUnits","allowed":false,"searchable":true,"editable":true,"sortable":true,"infoFlag":false},"capacityInVolume":{"label":"(in Cc)","fieldName":"input","fieldType":"text","permission":true,"id":"capacityInVolume","required":false,"childLength":0,"rowSpan":0,"colSpan":0,"childNodes":{},"validation":{"numeric":{"args":"","message":"Please enter a valid Capacity."},"minlength":{"args":"0","message":"Please enter a valid Capacity."},"max":{"args":"999999999","message":"Capacity (Volume) value must be less than equal to 999999999."}},"labelKey":"capacityInVolume","allowed":false,"searchable":true,"editable":true,"sortable":true,"infoFlag":false}},"validation":{},"labelKey":"capacity","allowed":false,"searchable":false,"editable":true,"sortable":false,"infoFlag":false},"deliveryMediumMasterTypeCd":{"label":"Type","fieldName":"input","fieldType":"dropdown","permission":true,"id":"deliveryMediumMasterTypeCd","required":false,"childLength":0,"rowSpan":2,"colSpan":0,"childNodes":{},"validation":{},"labelKey":"deliveryMediumMasterTypeCd","allowed":false,"searchable":false,"editable":true,"sortable":true,"infoFlag":false},"userName":{"label":"User Name","fieldName":"input","fieldType":"text","permission":true,"id":"userName","required":true,"childLength":0,"rowSpan":2,"colSpan":0,"childNodes":{},"validation":{"minlength":{"args":"3","message":"Minimum 3 characters required."},"required":{"message":"Username is required."},"maxlength":{"args":"25","message":"Username must be maximum 25 characters long."}},"labelKey":"User Name","allowed":false,"searchable":true,"editable":false,"sortable":true,"infoFlag":false},"statusCd":{"label":"Status","fieldName":"input","fieldType":"dropdown","permission":true,"id":"statusCd","required":false,"childLength":0,"rowSpan":2,"colSpan":0,"childNodes":{},"validation":{},"labelKey":"statusCd","infoTool":[{"key":"deliverymedium_statusCd_infotip","message":"Possible Delivery Resource statuses - Available, Intransit, Inactive."}],"allowed":false,"searchable":true,"editable":false,"sortable":true,"infoFlag":true},"deviceStatus":{"label":"Device Status","fieldName":"input","fieldType":"text","permission":true,"id":"deviceStatus","required":false,"childLength":0,"rowSpan":2,"colSpan":0,"childNodes":{},"validation":{},"labelKey":"deviceStatus","allowed":false,"searchable":false,"editable":false,"sortable":true,"infoFlag":false},"tripName":{"label":"Running Trip","fieldName":"input","fieldType":"text","permission":true,"id":"tripName","required":false,"childLength":0,"rowSpan":2,"colSpan":0,"childNodes":{},"validation":{},"labelKey":"Running Trip","allowed":false,"searchable":true,"editable":false,"sortable":true,"infoFlag":false},"trackingDate":{"label":"Last Tracking","fieldName":"input","fieldType":"calendar","permission":true,"id":"trackingDate","required":false,"childLength":0,"rowSpan":2,"colSpan":0,"childNodes":{},"validation":{},"labelKey":"trackingDate","allowed":false,"searchable":true,"editable":false,"sortable":true,"infoFlag":false},"isAttandanceFl":{"label":"Attendance","fieldName":"input","fieldType":"checkbox","permission":true,"id":"isAttandanceFl","required":false,"childLength":0,"rowSpan":2,"colSpan":0,"childNodes":{},"validation":{},"labelKey":"isAttandanceFl","allowed":false,"searchable":false,"editable":false,"sortable":true,"infoFlag":false},"isActiveFl":{"label":"Active / Inactive","fieldName":"input","fieldType":"checkbox","permission":true,"id":"isActiveFl","required":false,"childLength":0,"rowSpan":2,"colSpan":0,"childNodes":{},"validation":{},"labelKey":"isActiveFl","allowed":false,"searchable":false,"editable":false,"sortable":true,"infoFlag":false},"isOnBreakFl":{"label":"On-Break","fieldName":"input","fieldType":"text","permission":false,"id":"isOnBreakFl","required":false,"childLength":0,"rowSpan":2,"colSpan":0,"childNodes":{},"validation":{},"labelKey":"On-Break","allowed":false,"searchable":false,"editable":true,"sortable":true,"infoFlag":false}},"buttons":{"delete":{"label":"Delete","fieldName":"button","fieldType":"button","permission":true,"id":"delete","required":false,"childLength":0,"rowSpan":0,"colSpan":0,"labelKey":"Delete","allowed":false,"searchable":true,"editable":false,"sortable":true,"infoFlag":false},"duplicate":{"label":"Duplicate","fieldName":"button","fieldType":"button","permission":false,"id":"duplicate","required":false,"childLength":0,"rowSpan":0,"colSpan":0,"labelKey":"Duplicate","allowed":false,"searchable":true,"editable":false,"sortable":true,"infoFlag":false},"update":{"label":"Update","fieldName":"button","fieldType":"button","permission":true,"id":"update","required":false,"childLength":0,"rowSpan":0,"colSpan":0,"labelKey":"Update","allowed":false,"searchable":true,"editable":false,"sortable":true,"infoFlag":false},"save":{"label":"Save","fieldName":"button","fieldType":"button","permission":false,"id":"save","required":false,"childLength":0,"rowSpan":0,"colSpan":0,"labelKey":"Save","allowed":false,"searchable":true,"editable":false,"sortable":true,"infoFlag":false},"cancel":{"label":"Cancel","fieldName":"button","fieldType":"button","permission":false,"id":"cancel","required":false,"childLength":0,"rowSpan":0,"colSpan":0,"labelKey":"Cancel","allowed":false,"searchable":true,"editable":false,"sortable":true,"infoFlag":false},"changePwd":{"label":"Change Password","fieldName":"button","fieldType":"button","permission":true,"required":false,"childLength":0,"rowSpan":0,"colSpan":0,"labelKey":"Change Password","allowed":false,"searchable":true,"editable":false,"sortable":true,"infoFlag":false},"bulkUpdate":{"label":"Bulk Update","fieldName":"button","fieldType":"button","permission":true,"id":"bulkUpdate","required":false,"childLength":0,"rowSpan":0,"colSpan":0,"labelKey":"bulkUpdate","allowed":false,"searchable":true,"editable":false,"sortable":true,"infoFlag":false},"notify":{"label":"Notify","fieldName":"button","fieldType":"button","permission":true,"id":"notify","required":false,"childLength":0,"rowSpan":2,"colSpan":0,"validation":{},"labelKey":"notify","allowed":false,"searchable":false,"editable":false,"sortable":false,"infoFlag":false},"more":{"label":"More","fieldName":"button","fieldType":"button","permission":true,"id":"more","required":false,"childLength":0,"rowSpan":0,"colSpan":0,"dropdownValues":{"absent":"Mark as Absent","present":"Mark as Present","active":"Mark as Active","inActive":"Mark as Inactive"},"labelKey":"More","allowed":false,"searchable":true,"editable":false,"sortable":true,"infoFlag":false},"advancedSearch":{"label":"advancedSearch","fieldName":"button","fieldType":"button","permission":true,"id":"advancedSearch","required":false,"childLength":0,"rowSpan":2,"colSpan":0,"labelKey":"advancedSearch","allowed":false,"searchable":false,"editable":false,"sortable":false,"infoFlag":false}}}
			JsonObject pageStructureDeliveryMedium = getStructureAPI("DELIVERYMEDIUM", "DELIVERYMEDIUM", "DELIVERY_MEDIUM_LIST_VIEW");
			String strDeliveryMediumMasterNameLabel = (pageStructureDeliveryMedium.getAsJsonObject().has("columns") && pageStructureDeliveryMedium.getAsJsonObject().get("columns").getAsJsonObject().has("deliveryMediumMasterName")) ? pageStructureDeliveryMedium.getAsJsonObject().get("columns").getAsJsonObject().get("deliveryMediumMasterName").getAsJsonObject().get("label").getAsString() : null;
			if (strDeliveryMediumMasterNameLabel == null)
			{
				logMessage("Get Column Name from Structure API", "Should be able to fetch column name from structire API", "Unable to fetch column name deliveryMediumMasterName from Structure API", "Failed");
				return false;
			}

			//Validate columns exists on page
			rc = verifyColumnsExistsOnPage(pageStructureDeliveryMedium);//true
			Assert.assertTrue(rc);

			TimeUnit.SECONDS.sleep(3);

			//**
			String strDeliveryMediumID = searchDeliveryBoy(strDeliveryBoyName);
			System.out.println("strDeliveryMediumID : "+strDeliveryMediumID);
			if (strDeliveryMediumID == null || strDeliveryMediumID.equals(""))
			{
				logMessage("Search for Delivery Medium", "Should be able to search for Delivery Medium", "Unable to search for delivery medium", "Failed");
				return false;
			}

			//Click Delivery Medium Checkbox
			String strDeliveryMediumCheckboxXPath = "//*[@id='"+strDeliveryMediumID+"']";
			String strDeliveryMediumCheckboxLabelXPath = "//*[@for='"+strDeliveryMediumID+"']";
			rc = clickCheckboxByXPath(strDeliveryMediumCheckboxXPath, strDeliveryMediumCheckboxLabelXPath, "Delivery Medium Checkbox", true);
			Assert.assertTrue(rc);

			//Click Update Button - //*[@logi-google-analytics="deliveryMedium - update-record"]
			String strUpdateButtonXPath = "//*[@logi-google-analytics=\"deliveryMedium - update-record\"]";
			rc = clickElementByXPath(strUpdateButtonXPath, "Update Button"); 
			Assert.assertTrue(rc);

			//Update - name="deliveryMediumMasterName"
			String strDeliveryMediumMasterNameXPath = "//input[@name=\"deliveryMediumMasterName\"]";
			String strdeliveryMediumMasterNameValue = row.get("db.deliveryMediumMasterName");
			String strUpdatedDeliveryMediumMasterName = strdeliveryMediumMasterNameValue+"U";
			rc = sendKeys(strDeliveryMediumMasterNameXPath, strUpdatedDeliveryMediumMasterName, "Delivery boy Master Name - Update", true);
			Assert.assertTrue(rc);

			//Update - name="capacityInWeight"
			String strCapacityInWtXPath = "//input[@name=\"capacityInWeight\"]";
			String strCapacityWtValue = row.get("db.capacityInWeight");
			String strUpdatedCapacityWt = "1"+strCapacityWtValue;
			rc = sendKeys(strCapacityInWtXPath, strUpdatedCapacityWt, "Capacity Wt - Update", true);
			Assert.assertTrue(rc);	

			//Update - name="capacityInUnits"
			String strCapacityUnitsXPath = "//input[@name=\"capacityInUnits\"]";
			String strCapacityUnitsValue = row.get("db.capacityInUnits");
			String strUpdatedCapacityUnits = "1"+strCapacityUnitsValue;
			rc = sendKeys(strCapacityUnitsXPath, strUpdatedCapacityUnits, "Capacity Units - Update", true);
			Assert.assertTrue(rc);	

			//Update name="capacityInVolume"
			String strCapacityVolumeXPath = "//input[@name=\"capacityInVolume\"]";
			String strCapacityVolumeValue = row.get("db.capacityInVolume");
			String strUpdatedCapacityVolume = "1"+strCapacityVolumeValue;
			rc = sendKeys(strCapacityVolumeXPath, strUpdatedCapacityVolume, "Capacity Volume - Update", true);
			Assert.assertTrue(rc);	

			//Update Phone Number - 

			//Update Branch Name - //*[@id="deliveryMediumMasterId-branchName"]//select
		/*	String strUpdatedBranchValue = "";
			try 
			{
				//Get Options for Select Box - //*[@id="deliveryMediumMasterId-branchName"]//select
				String strSelectBoxXPath = "//*[@id=\"deliveryMediumMasterId-branchName\"]//select";
				Select brnchSelectBox = new Select (driver.findElement (By.xpath(strSelectBoxXPath)));
				List <WebElement> options = brnchSelectBox.getOptions();
				if (options.size() > 2){
					strUpdatedBranchValue = options.get(2).getAttribute("value");
				}
				else {
					strUpdatedBranchValue = options.get(0).getAttribute("value");
				}
				System.out.println("strUpdatedValue: "+strUpdatedBranchValue);
				brnchSelectBox.selectByValue(strUpdatedBranchValue);
				logMessage("Update Branch Name", "Should be able to update Branch Value", "Successfully Updated Branch : "+strUpdatedBranchValue, "Passed");
			}
			catch (Exception e) 
			{
				logMessage("Update Branch Name", "Should be able to update Branch Name", "Unable to update Branch Name", "Failed");
			}
		 */
			//Update Phone Number - //input [@name="phoneNumber"]
			String strPhoneNumberXPath = "//input [@name=\"phoneNumber\"]";
			String strPhoneNumberValue = getAttributeByXPath(strPhoneNumberXPath, "Phone Number Value", "value");
			String strUpdatedPhoneNumber = "";
			if (strPhoneNumberValue == null || strPhoneNumberValue.equals("")){
				strUpdatedPhoneNumber = "";
			}
			else {
				strUpdatedPhoneNumber = strPhoneNumberValue.substring(0, strPhoneNumberValue.length() - 3)+getUniqueIntegerValue(3);
			}
			System.out.println("strUpdatedPhoneNumber: "+strUpdatedPhoneNumber);
			rc = sendKeys(strPhoneNumberXPath, strUpdatedPhoneNumber, "Phone Number - Update", true);
			Assert.assertTrue(rc);	


			//Click Save - //*[@logi-google-analytics="deliveryMedium - save-record"]
			String strSaveButtonXPath = "//*[@logi-google-analytics=\"deliveryMedium - save-record\"]";
			rc = clickElementByXPath(strSaveButtonXPath, "Save Button");
			Assert.assertTrue(rc);

			//Verify Message for update.deliverymedium.success - i.e Delivery Boy updated successfully
			String strLabelKey = "update.deliverymedium.success";
			getLabel_PageLabelAPI(row, strLabelKey);
			String strExpectedPromptValue = app_PageLabels.has(strLabelKey) ? app_PageLabels.get(strLabelKey).getAsString() : "";
			if (strExpectedPromptValue == null || strExpectedPromptValue.equals("")){
				logMessage("Verify "+strLabelKey+" Label", ""+strLabelKey+" Label should be defined", "Label - "+strLabelKey+" is not defined", "Failed");
			}
			String strJSPromptXPath = "//*[@id='js-prompt']";
			rc = waitForJS_PromptMessageJS(strExpectedPromptValue, strJSPromptXPath);
			if (rc)
			{
				logMessage("Verify Success Message", "Success Message - "+strExpectedPromptValue+" Successfully should display", "Message : "+strExpectedPromptValue+" is displayed", "Passed");
			}
			else
			{
				String strPromptValue =	getPromptElementTextByXPath(strJSPromptXPath, "JS Prompt");//"";
				logMessage("Verify Success Message", "Success Message - "+strExpectedPromptValue+" should display", "Success Message is not displayed, Unable to create an order, Expecting Message : "+strExpectedPromptValue+" Actual : "+strPromptValue, "Failed");
				return false;
			}

			//Try searching for delivery medium and verify its values
			strDeliveryMediumID = searchDeliveryBoy(strUpdatedDeliveryMediumMasterName);
			System.out.println("strDeliveryMediumID : "+strDeliveryMediumID);
			if (strDeliveryMediumID == null || strDeliveryMediumID.equals(""))
			{
				logMessage("Search for Delivery Medium", "Should be able to search for Delivery Medium", "Unable to search for delivery medium", "Failed");
				return false;
			}

			//Click Delivery Medium Checkbox
			rc = clickCheckboxByXPath(strDeliveryMediumCheckboxXPath, strDeliveryMediumCheckboxLabelXPath, "Delivery Medium Checkbox", true);
			Assert.assertTrue(rc);

			//Click Update Button - //*[@logi-google-analytics="deliveryMedium - update-record"]
			rc = clickElementByXPath(strUpdateButtonXPath, "Update Button"); 
			Assert.assertTrue(rc);

			//Get Actual Updated values
			String strActualDeliveryMediumMasterName = getAttributeByXPath(strDeliveryMediumMasterNameXPath, "Delivery Boy Name post update", "value");
			if (strActualDeliveryMediumMasterName != null && strActualDeliveryMediumMasterName.equals(strUpdatedDeliveryMediumMasterName))
			{
				logMessage("Verify Updated Delivery Medium Master Name", "Should be able to verify Delivery Medium Master Name", "Expected : "+strUpdatedDeliveryMediumMasterName+" Found : "+strActualDeliveryMediumMasterName, "Passed");
			}
			else
			{
				logMessage("Verify Updated Delivery Medium Master Name", "Should be able to verify Delivery Medium Master Name", "Expected : "+strUpdatedDeliveryMediumMasterName+" Found : "+strActualDeliveryMediumMasterName, "Failed");
			}

			//Get - name="capacityInWeight"
			String strActualCapacityWt = getAttributeByXPath(strCapacityInWtXPath, "Capacity Wt - Post Update", "value");
			strUpdatedCapacityWt = strUpdatedCapacityWt.contains(".") ? strActualCapacityWt.substring(0, strUpdatedCapacityWt.indexOf(".")) : strUpdatedCapacityWt;
			strActualCapacityWt = strActualCapacityWt.contains(".") ? strActualCapacityWt.substring(0, strActualCapacityWt.indexOf(".")) : strActualCapacityWt;
			if (strActualCapacityWt != null && strActualCapacityWt.equals(strUpdatedCapacityWt))
			{
				logMessage("Verify Updated Capacity Wt", "Should be able to verify Capacity Wt", "Expected : "+strUpdatedCapacityWt+" Found : "+strActualCapacityWt, "Passed");
			}
			else
			{
				logMessage("Verify Updated Capacity Wt", "Should be able to verify Capacity Wt", "Expected : "+strUpdatedCapacityWt+" Found : "+strActualCapacityWt, "Failed");
			}

			//Update - name="capacityInUnits"
			String strActualCapacityUnits = getAttributeByXPath(strCapacityUnitsXPath, "Capacity Units - Post Update", "value");
			strUpdatedCapacityUnits = strUpdatedCapacityUnits.contains(".") ? strUpdatedCapacityUnits.substring(0, strUpdatedCapacityUnits.indexOf(".")) : strUpdatedCapacityUnits;
			strActualCapacityUnits = strActualCapacityUnits.contains(".") ? strActualCapacityUnits.substring(0, strActualCapacityUnits.indexOf(".")) : strActualCapacityUnits;
			if (strActualCapacityUnits != null && strActualCapacityUnits.equals(strUpdatedCapacityUnits))
			{
				logMessage("Verify Updated Capacity Units", "Should be able to verify Capacity Units", "Expected : "+strUpdatedCapacityUnits+" Found : "+strActualCapacityUnits, "Passed");
			}
			else
			{
				logMessage("Verify Updated Capacity Units", "Should be able to verify Capacity Units", "Expected : "+strUpdatedCapacityUnits+" Found : "+strActualCapacityUnits, "Failed");
			}

			//Update name="capacityInVolume"
			String strActualCapacityVolume = getAttributeByXPath(strCapacityVolumeXPath, "Capacity Volume - Post Update", "value");
			strUpdatedCapacityVolume = strUpdatedCapacityVolume.contains(".") ? strUpdatedCapacityVolume.substring(0, strUpdatedCapacityVolume.indexOf(".")) : strUpdatedCapacityVolume;
			strActualCapacityVolume = strActualCapacityVolume.contains(".") ? strActualCapacityVolume.substring(0, strActualCapacityVolume.indexOf(".")) : strActualCapacityVolume;
			if (strActualCapacityVolume != null && strActualCapacityVolume.equals(strUpdatedCapacityVolume))
			{
				logMessage("Verify Updated Capacity Volume", "Should be able to verify Capacity Volume", "Expected : "+strUpdatedCapacityVolume+" Found : "+strActualCapacityVolume, "Passed");
			}
			else
			{
				logMessage("Verify Updated Capacity Volume", "Should be able to verify Capacity Volume", "Expected : "+strUpdatedCapacityVolume+" Found : "+strActualCapacityVolume, "Failed");
			}

			//Verify Branch Name
			/*try 
			{
				//Get Options for Select Box - //*[@id="deliveryMediumMasterId-branchName"]//select
				String strSelectBoxXPath = "//*[@id=\"deliveryMediumMasterId-branchName\"]//select";
				Select brnchSelectBox = new Select (driver.findElement (By.xpath(strSelectBoxXPath)));
				WebElement options = brnchSelectBox.getFirstSelectedOption();
				String strActualUpdatedBranchValue = options.getAttribute("value");
				System.out.println("strActualUpdatedValue : "+strActualUpdatedBranchValue );
				logMessage("Get Updated Branch Name", "Should be able to update Branch Name", "Successfully fetched updated Branch Name "+strActualUpdatedBranchValue , "Passed");
				if (strActualUpdatedBranchValue != null || strActualUpdatedBranchValue.equals(strUpdatedBranchValue))
				{
					logMessage("Verify Updated branch value", "Should be able to verify for updated branch value", "Expected : should be different than : "+strUpdatedBranchValue+" Actual : "+strActualUpdatedBranchValue, "Passed");
				}
				else
				{
					logMessage("Verify Updated branch value", "Should be able to verify for updated branch value", "Expected : should be different than : "+strUpdatedBranchValue+" Actual : "+strActualUpdatedBranchValue, "Failed");	
				}

			}
			catch (Exception e) 
			{
				logMessage("Get Updated Branch Name", "Should be able to update Branch Name", "Unable to get updated Branch Name", "Failed");
			}*/

			String strActualPhoneNumberValue = getAttributeByXPath(strPhoneNumberXPath, "Phone Number Updated Value", "value");
			if (strActualPhoneNumberValue != null && strActualPhoneNumberValue.equals(strUpdatedPhoneNumber))
			{
				logMessage("Verify Updated phone number", "Should be able to verify updated phone number", "Actual : "+strActualPhoneNumberValue+" Expected : "+strUpdatedPhoneNumber , "Passed");
			}
			else 
			{
				logMessage("Verify Updated phone number", "Should be able to verify updated phone number", "Actual : "+strActualPhoneNumberValue+" Expected : "+strUpdatedPhoneNumber , "Failed");
			}

			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean verifyDeliveryBoyBulkUpdate (LinkedHashMap<String, String> row) 
	{
		try
		{
			//Add Delivery Boy
			row = addDeliveryBoyTest(row);
			row = getTempData();

			Assert.assertNotNull(row);

			String strDeliveryBoyName = row.get("db.deliveryMediumMasterName");
			System.out.println("strDeliveryBoyName: "+strDeliveryBoyName);

			//Get The Page Structure API for Delivery Medium - https://testing.loginextsolutions.com/LoginApp/framework/structure?modelName=DELIVERYMEDIUM&pageName=DELIVERYMEDIUM&sectionName=DELIVERY_MEDIUM_LIST_VIEW - {"columns":{"deliveryMediumMasterName":{"label":"Name","fieldName":"input","fieldType":"text","permission":true,"id":"deliveryMediumMasterName","required":true,"childLength":0,"rowSpan":2,"colSpan":0,"childNodes":{},"validation":{"minlength":{"args":"3","message":"Minimum 3 characters required."},"required":{"message":"Full Name is required"},"maxlength":{"args":"50","message":"Full Name must be maximum 50 characters long."}},"labelKey":"deliveryMediumMasterName","allowed":false,"searchable":true,"editable":true,"sortable":true,"infoFlag":false},"phoneNumber":{"label":"Phone Number","fieldName":"input","fieldType":"text","permission":true,"id":"phoneNumber","required":true,"childLength":0,"rowSpan":2,"colSpan":0,"childNodes":{},"validation":{"required":{"message":"Mobile Number is Required"},"phonenumber":{"args":"","message":"INVALID Mobile Number"},"maxlength":{"args":"18","message":"Mobile Number must be maximum 18 characters long."}},"labelKey":"phoneNumber","allowed":false,"searchable":true,"editable":true,"sortable":true,"infoFlag":false},"branchName":{"label":"Kendra","fieldName":"input","fieldType":"select","permission":true,"id":"branchName","required":false,"childLength":0,"rowSpan":2,"colSpan":0,"childNodes":{},"validation":{},"labelKey":"branchName","allowed":false,"searchable":true,"editable":true,"sortable":true,"infoFlag":false},"capacity":{"label":"Capacity","permission":true,"id":"capacity","required":false,"childLength":3,"rowSpan":1,"colSpan":0,"childNodes":{"capacityInWeight":{"label":"(in Kg)","fieldName":"input","fieldType":"text","permission":true,"id":"capacityInWeight","required":false,"childLength":0,"rowSpan":0,"colSpan":0,"childNodes":{},"validation":{"numeric":{"args":"","message":"Please enter a valid Capacity."},"minlength":{"args":"0","message":"Please enter a valid Capacity."},"max":{"args":"999999999","message":"Capacity (Weight) value must be less than equal to 999999999."}},"labelKey":"capacityInWeight","allowed":false,"searchable":true,"editable":true,"sortable":true,"infoFlag":false},"capacityInUnits":{"label":"(in Units)","fieldName":"input","fieldType":"text","permission":true,"id":"capacityInUnits","required":true,"childLength":0,"rowSpan":0,"colSpan":0,"childNodes":{},"validation":{"numeric":{"args":"","message":"Please enter a valid Capacity."},"required":{"message":"Units is Required"},"minlength":{"args":"0","message":"Please enter a valid Capacity."},"min":{"args":"0","message":"Please enter a valid Capacity."},"max":{"args":"999999999","message":"Capacity (Units) value must be less than equal to 999999999."}},"labelKey":"capacityInUnits","allowed":false,"searchable":true,"editable":true,"sortable":true,"infoFlag":false},"capacityInVolume":{"label":"(in Cc)","fieldName":"input","fieldType":"text","permission":true,"id":"capacityInVolume","required":false,"childLength":0,"rowSpan":0,"colSpan":0,"childNodes":{},"validation":{"numeric":{"args":"","message":"Please enter a valid Capacity."},"minlength":{"args":"0","message":"Please enter a valid Capacity."},"max":{"args":"999999999","message":"Capacity (Volume) value must be less than equal to 999999999."}},"labelKey":"capacityInVolume","allowed":false,"searchable":true,"editable":true,"sortable":true,"infoFlag":false}},"validation":{},"labelKey":"capacity","allowed":false,"searchable":false,"editable":true,"sortable":false,"infoFlag":false},"deliveryMediumMasterTypeCd":{"label":"Type","fieldName":"input","fieldType":"dropdown","permission":true,"id":"deliveryMediumMasterTypeCd","required":false,"childLength":0,"rowSpan":2,"colSpan":0,"childNodes":{},"validation":{},"labelKey":"deliveryMediumMasterTypeCd","allowed":false,"searchable":false,"editable":true,"sortable":true,"infoFlag":false},"userName":{"label":"User Name","fieldName":"input","fieldType":"text","permission":true,"id":"userName","required":true,"childLength":0,"rowSpan":2,"colSpan":0,"childNodes":{},"validation":{"minlength":{"args":"3","message":"Minimum 3 characters required."},"required":{"message":"Username is required."},"maxlength":{"args":"25","message":"Username must be maximum 25 characters long."}},"labelKey":"User Name","allowed":false,"searchable":true,"editable":false,"sortable":true,"infoFlag":false},"statusCd":{"label":"Status","fieldName":"input","fieldType":"dropdown","permission":true,"id":"statusCd","required":false,"childLength":0,"rowSpan":2,"colSpan":0,"childNodes":{},"validation":{},"labelKey":"statusCd","infoTool":[{"key":"deliverymedium_statusCd_infotip","message":"Possible Delivery Resource statuses - Available, Intransit, Inactive."}],"allowed":false,"searchable":true,"editable":false,"sortable":true,"infoFlag":true},"deviceStatus":{"label":"Device Status","fieldName":"input","fieldType":"text","permission":true,"id":"deviceStatus","required":false,"childLength":0,"rowSpan":2,"colSpan":0,"childNodes":{},"validation":{},"labelKey":"deviceStatus","allowed":false,"searchable":false,"editable":false,"sortable":true,"infoFlag":false},"tripName":{"label":"Running Trip","fieldName":"input","fieldType":"text","permission":true,"id":"tripName","required":false,"childLength":0,"rowSpan":2,"colSpan":0,"childNodes":{},"validation":{},"labelKey":"Running Trip","allowed":false,"searchable":true,"editable":false,"sortable":true,"infoFlag":false},"trackingDate":{"label":"Last Tracking","fieldName":"input","fieldType":"calendar","permission":true,"id":"trackingDate","required":false,"childLength":0,"rowSpan":2,"colSpan":0,"childNodes":{},"validation":{},"labelKey":"trackingDate","allowed":false,"searchable":true,"editable":false,"sortable":true,"infoFlag":false},"isAttandanceFl":{"label":"Attendance","fieldName":"input","fieldType":"checkbox","permission":true,"id":"isAttandanceFl","required":false,"childLength":0,"rowSpan":2,"colSpan":0,"childNodes":{},"validation":{},"labelKey":"isAttandanceFl","allowed":false,"searchable":false,"editable":false,"sortable":true,"infoFlag":false},"isActiveFl":{"label":"Active / Inactive","fieldName":"input","fieldType":"checkbox","permission":true,"id":"isActiveFl","required":false,"childLength":0,"rowSpan":2,"colSpan":0,"childNodes":{},"validation":{},"labelKey":"isActiveFl","allowed":false,"searchable":false,"editable":false,"sortable":true,"infoFlag":false},"isOnBreakFl":{"label":"On-Break","fieldName":"input","fieldType":"text","permission":false,"id":"isOnBreakFl","required":false,"childLength":0,"rowSpan":2,"colSpan":0,"childNodes":{},"validation":{},"labelKey":"On-Break","allowed":false,"searchable":false,"editable":true,"sortable":true,"infoFlag":false}},"buttons":{"delete":{"label":"Delete","fieldName":"button","fieldType":"button","permission":true,"id":"delete","required":false,"childLength":0,"rowSpan":0,"colSpan":0,"labelKey":"Delete","allowed":false,"searchable":true,"editable":false,"sortable":true,"infoFlag":false},"duplicate":{"label":"Duplicate","fieldName":"button","fieldType":"button","permission":false,"id":"duplicate","required":false,"childLength":0,"rowSpan":0,"colSpan":0,"labelKey":"Duplicate","allowed":false,"searchable":true,"editable":false,"sortable":true,"infoFlag":false},"update":{"label":"Update","fieldName":"button","fieldType":"button","permission":true,"id":"update","required":false,"childLength":0,"rowSpan":0,"colSpan":0,"labelKey":"Update","allowed":false,"searchable":true,"editable":false,"sortable":true,"infoFlag":false},"save":{"label":"Save","fieldName":"button","fieldType":"button","permission":false,"id":"save","required":false,"childLength":0,"rowSpan":0,"colSpan":0,"labelKey":"Save","allowed":false,"searchable":true,"editable":false,"sortable":true,"infoFlag":false},"cancel":{"label":"Cancel","fieldName":"button","fieldType":"button","permission":false,"id":"cancel","required":false,"childLength":0,"rowSpan":0,"colSpan":0,"labelKey":"Cancel","allowed":false,"searchable":true,"editable":false,"sortable":true,"infoFlag":false},"changePwd":{"label":"Change Password","fieldName":"button","fieldType":"button","permission":true,"required":false,"childLength":0,"rowSpan":0,"colSpan":0,"labelKey":"Change Password","allowed":false,"searchable":true,"editable":false,"sortable":true,"infoFlag":false},"bulkUpdate":{"label":"Bulk Update","fieldName":"button","fieldType":"button","permission":true,"id":"bulkUpdate","required":false,"childLength":0,"rowSpan":0,"colSpan":0,"labelKey":"bulkUpdate","allowed":false,"searchable":true,"editable":false,"sortable":true,"infoFlag":false},"notify":{"label":"Notify","fieldName":"button","fieldType":"button","permission":true,"id":"notify","required":false,"childLength":0,"rowSpan":2,"colSpan":0,"validation":{},"labelKey":"notify","allowed":false,"searchable":false,"editable":false,"sortable":false,"infoFlag":false},"more":{"label":"More","fieldName":"button","fieldType":"button","permission":true,"id":"more","required":false,"childLength":0,"rowSpan":0,"colSpan":0,"dropdownValues":{"absent":"Mark as Absent","present":"Mark as Present","active":"Mark as Active","inActive":"Mark as Inactive"},"labelKey":"More","allowed":false,"searchable":true,"editable":false,"sortable":true,"infoFlag":false},"advancedSearch":{"label":"advancedSearch","fieldName":"button","fieldType":"button","permission":true,"id":"advancedSearch","required":false,"childLength":0,"rowSpan":2,"colSpan":0,"labelKey":"advancedSearch","allowed":false,"searchable":false,"editable":false,"sortable":false,"infoFlag":false}}}
			JsonObject pageStructureDeliveryMedium = getStructureAPI("DELIVERYMEDIUM", "DELIVERYMEDIUM", "DELIVERY_MEDIUM_LIST_VIEW");
			String strDeliveryMediumMasterNameLabel = (pageStructureDeliveryMedium.getAsJsonObject().has("columns") && pageStructureDeliveryMedium.getAsJsonObject().get("columns").getAsJsonObject().has("deliveryMediumMasterName")) ? pageStructureDeliveryMedium.getAsJsonObject().get("columns").getAsJsonObject().get("deliveryMediumMasterName").getAsJsonObject().get("label").getAsString() : null;
			if (strDeliveryMediumMasterNameLabel == null)
			{
				logMessage("Get Column Name from Structure API", "Should be able to fetch column name from structire API", "Unable to fetch column name deliveryMediumMasterName from Structure API", "Failed");
				return false;
			}

			//Validate columns exists on page
			rc = verifyColumnsExistsOnPage(pageStructureDeliveryMedium);//true
			Assert.assertTrue(rc);
			//**
			String strDeliveryMediumID = searchDeliveryBoy(strDeliveryBoyName);
			System.out.println("strDeliveryMediumID : "+strDeliveryMediumID);
			if (strDeliveryMediumID == null || strDeliveryMediumID.equals(""))
			{
				logMessage("Search for Delivery Medium", "Should be able to search for Delivery Medium", "Unable to search for delivery medium", "Failed");
				return false;
			}

			//Click Delivery Medium Checkbox
			String strDeliveryMediumCheckboxXPath = "//*[@id='"+strDeliveryMediumID+"']";
			String strDeliveryMediumCheckboxLabelXPath = "//*[@for='"+strDeliveryMediumID+"']";
			rc = clickCheckboxByXPath(strDeliveryMediumCheckboxXPath, strDeliveryMediumCheckboxLabelXPath, "Delivery Medium Checkbox", true);
			Assert.assertTrue(rc);

			//Click Update Button - //*[@logi-google-analytics="deliveryMedium - update-record"]
			String strUpdateButtonXPath = "//*[@logi-google-analytics=\"deliveryMedium - bulkUpdate-record\"]";
			rc = clickElementByXPath(strUpdateButtonXPath, "Delivery Boy - Bulk Update Button"); 
			Assert.assertTrue(rc);

			//Get Bulk Update Structure API - https://testing.loginextsolutions.com/LoginApp/framework/structure?pageName=DELIVERYMEDIUM&sectionName=BULK_UPDATE_DELIVERY_MEDIUM_FORM&modelName=DELIVERYMEDIUM -  {"general details":{"distributionCenter":{"label":"Branch Name","fieldName":"Branch Name","fieldType":"select","permission":true,"id":"distributionCenter","required":true,"options":[],"childLength":0,"rowSpan":0,"colSpan":0,"lookupType":"getDistributionCenterForDM","validation":{"required":{"message":"Branch Name is required."}},"labelKey":"Branch Name","infoTool":[{"key":"deliverymedium_distributionCenter_infotip","message":"This branch manager will be able to view and track the Delivery Associate. Ensures Delivery Associates are assigned Documents of their Branch only. Use this field to ensure that your Delivery Associates are assigned Documents of their Branch"}],"allowed":false,"searchable":false,"editable":true,"sortable":false,"infoFlag":true},"capacity":{"label":"Capacity","fieldName":"Capacity","fieldType":"number","permission":true,"id":"capacity","required":false,"childLength":3,"rowSpan":0,"colSpan":0,"childNodes":{"capacityInUnits":{"label":"Units","fieldName":"Units","permission":true,"id":"capacityInUnits","required":true,"childLength":0,"rowSpan":0,"colSpan":0,"validation":{"numeric":{"args":"","message":"Please enter a valid Capacity."},"required":{"message":"Units is Required"},"minlength":{"args":"0","message":"Please enter a valid Capacity."},"min":{"args":"0","message":"Please enter a valid Capacity."},"max":{"args":"999999999","message":"Capacity (Units) value must be less than equal to 999999999."}},"labelKey":"Units","allowed":false,"searchable":false,"editable":true,"sortable":false,"infoFlag":false},"capacityInWeight":{"label":"Weight","fieldName":"Weight","permission":true,"id":"capacityInWeight","required":false,"childLength":0,"rowSpan":0,"colSpan":0,"validation":{"numeric":{"args":"","message":"Please enter a valid Capacity."},"minlength":{"args":"0","message":"Please enter a valid Capacity."},"max":{"args":"999999999","message":"Capacity (Weight) value must be less than equal to 999999999."}},"labelKey":"Weight","allowed":false,"searchable":false,"editable":true,"sortable":false,"infoFlag":false},"capacityInVolume":{"label":"Volume","fieldName":"Volume","permission":true,"id":"capacityInVolume","required":false,"childLength":0,"rowSpan":0,"colSpan":0,"validation":{"numeric":{"args":"","message":"Please enter a valid Capacity."},"minlength":{"args":"0","message":"Please enter a valid Capacity."},"max":{"args":"999999999","message":"Capacity (Volume) value must be less than equal to 999999999."}},"labelKey":"Volume","allowed":false,"searchable":false,"editable":true,"sortable":false,"infoFlag":false}},"validation":{},"labelKey":"Capacity","allowed":false,"searchable":false,"editable":false,"sortable":false,"infoFlag":false},"deliveryType":{"label":"Delivery Associate Type","fieldName":"Delivery Medium Type","fieldType":"multiselect","permission":true,"id":"deliveryType","required":false,"options":[],"childLength":0,"rowSpan":0,"colSpan":0,"lookupType":"delMedType","validation":{},"labelKey":"Delivery Medium Type","infoTool":[{"key":"deliverymedium_deliveryType_infotip","message":"Set this field to ensure that your Delivery Associates are assigned appropriate type of Documents"}],"allowed":false,"searchable":false,"editable":true,"sortable":false,"infoFlag":true},"weeklyOffList":{"label":"Weekly Off Day","fieldName":"Weekly Off Day","fieldType":"multiselect","permission":true,"id":"weeklyOffList","required":false,"options":[],"childLength":0,"rowSpan":0,"colSpan":0,"lookupType":"weeklyOff","validation":{},"labelKey":"Weekly Off Day","infoTool":[{"key":"deliverymedium_weeklyOffList_infotip","message":"Helps in planning the Documents according to the availability of Delivery Associates. Delivery Associates will automatically marked as Absent on their weekly-off day/s"}],"allowed":false,"searchable":false,"editable":true,"sortable":false,"infoFlag":true},"isAttandanceFl":{"label":"Attendance","fieldName":"attendance","fieldType":"radio","permission":true,"id":"isAttandanceFl","required":false,"options":["Mark as Present","Mark as Absent"],"childLength":0,"rowSpan":0,"colSpan":0,"validation":{},"dropdownValues":{"PresentX":"Mark as Present","AbsentX":"Mark as Absent"},"labelKey":"attendance","allowed":false,"searchable":false,"editable":true,"sortable":false,"infoFlag":false},"isActiveFl":{"label":"Active","fieldName":"Active","fieldType":"radio","permission":true,"id":"isActiveFl","required":false,"options":["Mark as Active","Mark as Inactive"],"childLength":0,"rowSpan":0,"colSpan":0,"validation":{},"dropdownValues":{"ActiveX":"Mark as Active","InactiveX":"Mark as Inactive"},"labelKey":"active","allowed":false,"searchable":false,"editable":true,"sortable":false,"infoFlag":false}}}
			JsonObject bulkUpdateStructureResponse = getStructureAPI("DELIVERYMEDIUM", "DELIVERYMEDIUM", "BULK_UPDATE_DELIVERY_MEDIUM_FORM");

			String strPageName = "DeliveryBoyBulkUpdate_Page";//"Vehicle_Page";//"Orders_Page";
			LinkedHashMap <String, String> pageDataMap = getPageObjects(row, strPageName); // ReadExcel2.readSortedTestDataMap(strSheetName, strPageName);

			//Perform substitution of keywords or functions like AUTOGEN / DATE / BOOLEAN / INTEGER / DECIMAL etc from DataSheet with actual values,
			updateTempData(row);
			pageDataMap = substituteDataMapKeywords (pageDataMap);
			System.out.println("pageDataMap: "+pageDataMap);

			updateTempData(row);

			//Enter Data on orders page//
			rc = enterValues (pageDataMap, bulkUpdateStructureResponse.toString());
			Assert.assertTrue(rc);

			//Click Update Button - //*[@id='dmBulkUpdate']//*[contains (@class,'icon-Product-Icons_Save')]
			String strBulkUpdateButtonXPath = "//*[@id='dmBulkUpdate']//*[contains (@class,'icon-Product-Icons_Save')]";
			rc = clickElementByXPath(strBulkUpdateButtonXPath, "Bulk Update Button");
			Assert.assertTrue(rc);

			//Verify Message for update.deliverymedium.success - i.e Delivery Boy updated successfully
			String strLabelKey = "update.deliverymedium.success";
			getLabel_PageLabelAPI(row, strLabelKey);
			String strExpectedPromptValue = app_PageLabels.has(strLabelKey) ? app_PageLabels.get(strLabelKey).getAsString() : "";
			if (strExpectedPromptValue == null || strExpectedPromptValue.equals("")){
				logMessage("Verify "+strLabelKey+" Label", ""+strLabelKey+" Label should be defined", "Label - "+strLabelKey+" is not defined", "Failed");
			}
			String strJSPromptXPath = "//*[@id='js-prompt']";
			rc = waitForJS_PromptMessageJS(strExpectedPromptValue, strJSPromptXPath);
			if (rc)
			{
				logMessage("Verify Success Message", "Success Message - "+strExpectedPromptValue+" Successfully should display", "Message : "+strExpectedPromptValue+" is displayed", "Passed");
			}
			else
			{
				String strPromptValue =	getPromptElementTextByXPath(strJSPromptXPath, "JS Prompt");//"";
				logMessage("Verify Success Message", "Success Message - "+strExpectedPromptValue+" should display", "Success Message is not displayed, Unable to create an order, Expecting Message : "+strExpectedPromptValue+" Actual : "+strPromptValue, "Failed");
				return false;
			}

			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}



	public boolean verifyDeliveryBoyUpdate (LinkedHashMap<String, String> row) 
	{
		try
		{
			//Add Delivery Boy
			row = addDeliveryBoyTest(row);
			row = getTempData();
			Assert.assertNotNull(row);

			String strDeliveryBoyName = row.get("db.deliveryMediumMasterName");
			System.out.println("strDeliveryBoyName: "+strDeliveryBoyName);

			//Get The Page Structure API for Delivery Medium - https://testing.loginextsolutions.com/LoginApp/framework/structure?modelName=DELIVERYMEDIUM&pageName=DELIVERYMEDIUM&sectionName=DELIVERY_MEDIUM_LIST_VIEW - {"columns":{"deliveryMediumMasterName":{"label":"Name","fieldName":"input","fieldType":"text","permission":true,"id":"deliveryMediumMasterName","required":true,"childLength":0,"rowSpan":2,"colSpan":0,"childNodes":{},"validation":{"minlength":{"args":"3","message":"Minimum 3 characters required."},"required":{"message":"Full Name is required"},"maxlength":{"args":"50","message":"Full Name must be maximum 50 characters long."}},"labelKey":"deliveryMediumMasterName","allowed":false,"searchable":true,"editable":true,"sortable":true,"infoFlag":false},"phoneNumber":{"label":"Phone Number","fieldName":"input","fieldType":"text","permission":true,"id":"phoneNumber","required":true,"childLength":0,"rowSpan":2,"colSpan":0,"childNodes":{},"validation":{"required":{"message":"Mobile Number is Required"},"phonenumber":{"args":"","message":"INVALID Mobile Number"},"maxlength":{"args":"18","message":"Mobile Number must be maximum 18 characters long."}},"labelKey":"phoneNumber","allowed":false,"searchable":true,"editable":true,"sortable":true,"infoFlag":false},"branchName":{"label":"Kendra","fieldName":"input","fieldType":"select","permission":true,"id":"branchName","required":false,"childLength":0,"rowSpan":2,"colSpan":0,"childNodes":{},"validation":{},"labelKey":"branchName","allowed":false,"searchable":true,"editable":true,"sortable":true,"infoFlag":false},"capacity":{"label":"Capacity","permission":true,"id":"capacity","required":false,"childLength":3,"rowSpan":1,"colSpan":0,"childNodes":{"capacityInWeight":{"label":"(in Kg)","fieldName":"input","fieldType":"text","permission":true,"id":"capacityInWeight","required":false,"childLength":0,"rowSpan":0,"colSpan":0,"childNodes":{},"validation":{"numeric":{"args":"","message":"Please enter a valid Capacity."},"minlength":{"args":"0","message":"Please enter a valid Capacity."},"max":{"args":"999999999","message":"Capacity (Weight) value must be less than equal to 999999999."}},"labelKey":"capacityInWeight","allowed":false,"searchable":true,"editable":true,"sortable":true,"infoFlag":false},"capacityInUnits":{"label":"(in Units)","fieldName":"input","fieldType":"text","permission":true,"id":"capacityInUnits","required":true,"childLength":0,"rowSpan":0,"colSpan":0,"childNodes":{},"validation":{"numeric":{"args":"","message":"Please enter a valid Capacity."},"required":{"message":"Units is Required"},"minlength":{"args":"0","message":"Please enter a valid Capacity."},"min":{"args":"0","message":"Please enter a valid Capacity."},"max":{"args":"999999999","message":"Capacity (Units) value must be less than equal to 999999999."}},"labelKey":"capacityInUnits","allowed":false,"searchable":true,"editable":true,"sortable":true,"infoFlag":false},"capacityInVolume":{"label":"(in Cc)","fieldName":"input","fieldType":"text","permission":true,"id":"capacityInVolume","required":false,"childLength":0,"rowSpan":0,"colSpan":0,"childNodes":{},"validation":{"numeric":{"args":"","message":"Please enter a valid Capacity."},"minlength":{"args":"0","message":"Please enter a valid Capacity."},"max":{"args":"999999999","message":"Capacity (Volume) value must be less than equal to 999999999."}},"labelKey":"capacityInVolume","allowed":false,"searchable":true,"editable":true,"sortable":true,"infoFlag":false}},"validation":{},"labelKey":"capacity","allowed":false,"searchable":false,"editable":true,"sortable":false,"infoFlag":false},"deliveryMediumMasterTypeCd":{"label":"Type","fieldName":"input","fieldType":"dropdown","permission":true,"id":"deliveryMediumMasterTypeCd","required":false,"childLength":0,"rowSpan":2,"colSpan":0,"childNodes":{},"validation":{},"labelKey":"deliveryMediumMasterTypeCd","allowed":false,"searchable":false,"editable":true,"sortable":true,"infoFlag":false},"userName":{"label":"User Name","fieldName":"input","fieldType":"text","permission":true,"id":"userName","required":true,"childLength":0,"rowSpan":2,"colSpan":0,"childNodes":{},"validation":{"minlength":{"args":"3","message":"Minimum 3 characters required."},"required":{"message":"Username is required."},"maxlength":{"args":"25","message":"Username must be maximum 25 characters long."}},"labelKey":"User Name","allowed":false,"searchable":true,"editable":false,"sortable":true,"infoFlag":false},"statusCd":{"label":"Status","fieldName":"input","fieldType":"dropdown","permission":true,"id":"statusCd","required":false,"childLength":0,"rowSpan":2,"colSpan":0,"childNodes":{},"validation":{},"labelKey":"statusCd","infoTool":[{"key":"deliverymedium_statusCd_infotip","message":"Possible Delivery Resource statuses - Available, Intransit, Inactive."}],"allowed":false,"searchable":true,"editable":false,"sortable":true,"infoFlag":true},"deviceStatus":{"label":"Device Status","fieldName":"input","fieldType":"text","permission":true,"id":"deviceStatus","required":false,"childLength":0,"rowSpan":2,"colSpan":0,"childNodes":{},"validation":{},"labelKey":"deviceStatus","allowed":false,"searchable":false,"editable":false,"sortable":true,"infoFlag":false},"tripName":{"label":"Running Trip","fieldName":"input","fieldType":"text","permission":true,"id":"tripName","required":false,"childLength":0,"rowSpan":2,"colSpan":0,"childNodes":{},"validation":{},"labelKey":"Running Trip","allowed":false,"searchable":true,"editable":false,"sortable":true,"infoFlag":false},"trackingDate":{"label":"Last Tracking","fieldName":"input","fieldType":"calendar","permission":true,"id":"trackingDate","required":false,"childLength":0,"rowSpan":2,"colSpan":0,"childNodes":{},"validation":{},"labelKey":"trackingDate","allowed":false,"searchable":true,"editable":false,"sortable":true,"infoFlag":false},"isAttandanceFl":{"label":"Attendance","fieldName":"input","fieldType":"checkbox","permission":true,"id":"isAttandanceFl","required":false,"childLength":0,"rowSpan":2,"colSpan":0,"childNodes":{},"validation":{},"labelKey":"isAttandanceFl","allowed":false,"searchable":false,"editable":false,"sortable":true,"infoFlag":false},"isActiveFl":{"label":"Active / Inactive","fieldName":"input","fieldType":"checkbox","permission":true,"id":"isActiveFl","required":false,"childLength":0,"rowSpan":2,"colSpan":0,"childNodes":{},"validation":{},"labelKey":"isActiveFl","allowed":false,"searchable":false,"editable":false,"sortable":true,"infoFlag":false},"isOnBreakFl":{"label":"On-Break","fieldName":"input","fieldType":"text","permission":false,"id":"isOnBreakFl","required":false,"childLength":0,"rowSpan":2,"colSpan":0,"childNodes":{},"validation":{},"labelKey":"On-Break","allowed":false,"searchable":false,"editable":true,"sortable":true,"infoFlag":false}},"buttons":{"delete":{"label":"Delete","fieldName":"button","fieldType":"button","permission":true,"id":"delete","required":false,"childLength":0,"rowSpan":0,"colSpan":0,"labelKey":"Delete","allowed":false,"searchable":true,"editable":false,"sortable":true,"infoFlag":false},"duplicate":{"label":"Duplicate","fieldName":"button","fieldType":"button","permission":false,"id":"duplicate","required":false,"childLength":0,"rowSpan":0,"colSpan":0,"labelKey":"Duplicate","allowed":false,"searchable":true,"editable":false,"sortable":true,"infoFlag":false},"update":{"label":"Update","fieldName":"button","fieldType":"button","permission":true,"id":"update","required":false,"childLength":0,"rowSpan":0,"colSpan":0,"labelKey":"Update","allowed":false,"searchable":true,"editable":false,"sortable":true,"infoFlag":false},"save":{"label":"Save","fieldName":"button","fieldType":"button","permission":false,"id":"save","required":false,"childLength":0,"rowSpan":0,"colSpan":0,"labelKey":"Save","allowed":false,"searchable":true,"editable":false,"sortable":true,"infoFlag":false},"cancel":{"label":"Cancel","fieldName":"button","fieldType":"button","permission":false,"id":"cancel","required":false,"childLength":0,"rowSpan":0,"colSpan":0,"labelKey":"Cancel","allowed":false,"searchable":true,"editable":false,"sortable":true,"infoFlag":false},"changePwd":{"label":"Change Password","fieldName":"button","fieldType":"button","permission":true,"required":false,"childLength":0,"rowSpan":0,"colSpan":0,"labelKey":"Change Password","allowed":false,"searchable":true,"editable":false,"sortable":true,"infoFlag":false},"bulkUpdate":{"label":"Bulk Update","fieldName":"button","fieldType":"button","permission":true,"id":"bulkUpdate","required":false,"childLength":0,"rowSpan":0,"colSpan":0,"labelKey":"bulkUpdate","allowed":false,"searchable":true,"editable":false,"sortable":true,"infoFlag":false},"notify":{"label":"Notify","fieldName":"button","fieldType":"button","permission":true,"id":"notify","required":false,"childLength":0,"rowSpan":2,"colSpan":0,"validation":{},"labelKey":"notify","allowed":false,"searchable":false,"editable":false,"sortable":false,"infoFlag":false},"more":{"label":"More","fieldName":"button","fieldType":"button","permission":true,"id":"more","required":false,"childLength":0,"rowSpan":0,"colSpan":0,"dropdownValues":{"absent":"Mark as Absent","present":"Mark as Present","active":"Mark as Active","inActive":"Mark as Inactive"},"labelKey":"More","allowed":false,"searchable":true,"editable":false,"sortable":true,"infoFlag":false},"advancedSearch":{"label":"advancedSearch","fieldName":"button","fieldType":"button","permission":true,"id":"advancedSearch","required":false,"childLength":0,"rowSpan":2,"colSpan":0,"labelKey":"advancedSearch","allowed":false,"searchable":false,"editable":false,"sortable":false,"infoFlag":false}}}
			JsonObject pageStructureDeliveryMedium = getStructureAPI("DELIVERYMEDIUM", "DELIVERYMEDIUM", "DELIVERY_MEDIUM_LIST_VIEW");
			String strDeliveryMediumMasterNameLabel = (pageStructureDeliveryMedium.getAsJsonObject().has("columns") && pageStructureDeliveryMedium.getAsJsonObject().get("columns").getAsJsonObject().has("deliveryMediumMasterName")) ? pageStructureDeliveryMedium.getAsJsonObject().get("columns").getAsJsonObject().get("deliveryMediumMasterName").getAsJsonObject().get("label").getAsString() : null;
			if (strDeliveryMediumMasterNameLabel == null)
			{
				logMessage("Get Column Name from Structure API", "Should be able to fetch column name from structire API", "Unable to fetch column name deliveryMediumMasterName from Structure API", "Failed");
				return false;
			}

			//Validate columns exists on page
			//rc = verifyColumnsExistsOnPage(pageStructureDeliveryMedium);//true
			//Assert.assertTrue(rc);
			
			TimeUnit.SECONDS.sleep(3);

			//**//
			String strDeliveryMediumID = searchDeliveryBoy(strDeliveryBoyName);
			System.out.println("strDeliveryMediumID : "+strDeliveryMediumID);
			if (strDeliveryMediumID == null || strDeliveryMediumID.equals(""))
			{
				logMessage("Search for Delivery Medium", "Should be able to search for Delivery Medium", "Unable to search for delivery medium", "Failed");
				return false;
			}

			//Click Delivery Medium Checkbox
			String strDeliveryMediumCheckboxXPath = "//*[@id='"+strDeliveryMediumID+"']";
			String strDeliveryMediumCheckboxLabelXPath = "//*[@for='"+strDeliveryMediumID+"']";
			rc = clickCheckboxByXPath(strDeliveryMediumCheckboxXPath, strDeliveryMediumCheckboxLabelXPath, "Delivery Medium Checkbox", true);
			Assert.assertTrue(rc);

			//Click pencil icon after Delivery Boy - //a[@id="deliveryMediumId-35033(strDeliveryMediumID)"] 
			String strPencilIcon = "//a[@id=\""+strDeliveryMediumID+"\"]";
			rc = clickElementByJavascript(driver, strPencilIcon, "Delivery Boy Update - Pencil Icon");
			Assert.assertTrue(rc);

			//Get data associated with Delivery Boy Update - 
			String strPageName = "DeliveryBoyUpdate_Page";//"Vehicle_Page";//"Orders_Page";
			LinkedHashMap <String, String> pageDataMap = getPageObjects(row, strPageName); // ReadExcel2.readSortedTestDataMap(strSheetName, strPageName);

			//Perform substitution of keywords or functions like AUTOGEN / DATE / BOOLEAN / INTEGER / DECIMAL etc from DataSheet with actual values,
			updateTempData(row);
			pageDataMap = substituteDataMapKeywords (pageDataMap);
			System.out.println("pageDataMap: "+pageDataMap);

			row.put("db.employeeId", pageDataMap.get("db.employeeId"));
			row.put("db.deliveryMediumMasterName", pageDataMap.get("db.deliveryMediumMasterName"));
			row.put("db.userName", pageDataMap.get("db.userName"));

			String strUpdatedDeliveryBoyName = row.get("db.deliveryMediumMasterName");

			//Get page structure
			String strPageStructureRequestURL = "LoginApp/framework/structure?pageName=DELIVERYMEDIUM&sectionName=ADD_DELIVERY_MEDIUM_FORM&modelName=DELIVERYMEDIUM";// "LoginApp/framework/structure?pageName=VEHICLE&sectionName=ADD_VEHICLE_FORM&modelName=VEHICLE";
			JsonElement pageStructure = getOrderPageStructure(row, row.get("URL")+strPageStructureRequestURL);//"LoginApp/framework/structure?modelName=ORDERS&pageName=ORDERS&sectionName=ADD_ORDER_FORM");
			if (pageStructure == null || pageStructure.getAsJsonObject().size() == 0){
				return false;
			}

			//Enter Values on Delivery Boy Page 
			rc = enterValues(pageDataMap, pageStructure.toString());
			Assert.assertTrue(rc);

			//Click Save Button - logi-google-analytics="Delivery Associate Update - Save"
			String strDeliveryBoySaveButton = "//*[@logi-google-analytics=\"Delivery Associate Update - Save\"]";
			rc = clickElementByXPath(strDeliveryBoySaveButton, "Delivery Boy - Save Button");
			Assert.assertTrue(rc);

			//Verify Message for update.deliverymedium.success - i.e Delivery Boy updated successfully
			String strLabelKey = "update.deliverymedium.success";
			getLabel_PageLabelAPI(row, strLabelKey);
			String strExpectedPromptValue = app_PageLabels.has(strLabelKey) ? app_PageLabels.get(strLabelKey).getAsString() : "";
			if (strExpectedPromptValue == null || strExpectedPromptValue.equals("")){
				logMessage("Verify "+strLabelKey+" Label", ""+strLabelKey+" Label should be defined", "Label - "+strLabelKey+" is not defined", "Failed");
			}
			String strJSPromptXPath = "//*[@id='js-prompt']";
			rc = waitForJS_PromptMessageJS(strExpectedPromptValue, strJSPromptXPath);
			if (rc)
			{
				logMessage("Verify Success Message", "Success Message - "+strExpectedPromptValue+" Successfully should display", "Message : "+strExpectedPromptValue+" is displayed", "Passed");
			}
			else
			{
				String strPromptValue =	getPromptElementTextByXPath(strJSPromptXPath, "JS Prompt");//"";
				logMessage("Verify Success Message", "Success Message - "+strExpectedPromptValue+" should display", "Success Message is not displayed, Unable to create an order, Expecting Message : "+strExpectedPromptValue+" Actual : "+strPromptValue, "Failed");
				return false;
			}


			logMessage("Update Delivery Boy Details", "Delivery Boy Details should be updated", "Successfully updated Delivery Boy Details : "+strDeliveryBoyName,"Passed");
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}



	private static String getFileExtension(File file) {
		String extension = "";

		try {
			if (file != null && file.exists()) {
				String name = file.getName();
				extension = name.substring(name.lastIndexOf("."));
			}
		} catch (Exception e) {
			extension = "";
		}

		return extension;

	}
	private static String getFileNameWithoutExtension(File file) {
		String fileName = "";
		try {
			if (file != null && file.exists()) {
				String name = file.getName();
				fileName = name.replaceFirst("[.][^.]+$", "");
			}
		} catch (Exception e) {
			e.printStackTrace();
			fileName = "";
		}

		return fileName;

	}

	private boolean copyFileUsingStream(File source, File dest) throws IOException {

		InputStream is = null;
		OutputStream os = null;
		try {
			is = new FileInputStream(source);
			os = new FileOutputStream(dest);
			byte[] buffer = new byte[1024];
			int length;
			while ((length = is.read(buffer)) > 0) {
				os.write(buffer, 0, length);
			}
			is.close();
			os.close();

			return true;
		}
		catch (Exception ex){
			logMessage("Copy files", "Should be able to copy files", "Unable to copy files <br/>source: "+source+" <br/>Dest : "+dest+" <br/> error : "+ex.getLocalizedMessage(), "Failed");
			ex.printStackTrace();
			is.close();
			os.close();
			return false;
		}
	}


	public boolean assignOrder(LinkedHashMap<String, String> row) 
	{
		try 
		{
			//Removing Order Creation via UI and creating order using Rest API
			//row = addOrderTest(row);//
			
			//Update - Creating order using rest API
			updateTempData(row);
			rc = authenticate_ClientAPI();//
			System.out.println("rc : "+rc);
			row = getTempData();

			//add Order// - this will add into global var last added order
			JsonObject o = addOrder_ClientAPI();
			System.out.println("o "+o);//
			//End - Creation of order using rest API
			
			System.out.println("strLastAddedOrder: "+strLastAddedOrder);
			row.put("OrderNumber",strLastAddedOrder);
			
			//Verify order is added
			row = getTempData();
			String addedOrder = row.get("OrderNumber");
			if (addedOrder == null || addedOrder.equals("")){
				logMessage("Get added order", "Should be able to get added order",  "Added order - '"+addedOrder+"'", "Failed");
				return false;
			}

			//Search for order
			rc = searchOrder(row);
			Assert.assertTrue(rc);

			//Wait for results to appear and then click checkbox - use checkbox function to check elements  / verify that trip checkbox is clicked
			TimeUnit.SECONDS.sleep(7);
			
			//Check checkbox present for row 0- //*[contains(@id,'-0-uiGrid')]//*[@role='checkbox']
			String strOrderCheckbox = "//*[contains(@id,'-0-uiGrid')]//*[@role='checkbox']";
			rc = clickElementByXPath(strOrderCheckbox, "Order Checkbox");
			Assert.assertTrue(rc);

			
			//Click More Button 
			String strAssignOrderButton = "//*[@id=\"assignNow-record\"]";
			rc = clickElementByXPath(strAssignOrderButton, "Assign Order Button");
			Assert.assertTrue(rc);

			//Get trips data - https://testing.loginextsolutions.com/TripApp/trip/lmfm/getToAssignOrders?status=NOTSTARTED,STARTED - {"status":200,"message":"Successfully obtained trips","data":{"totalCount":14269,"otherCount":0,"clientBranchId":0,"results":[{"milkRun":"DEFAULT","trips":[{"tripId":506516,"tripName":"TRIP-16456","tripStatus":"NOTSTARTED","routePlanningId":-1,"routeName":"DEFAULT","deliveryMediumId":39912,"deliveryMediumStatus":"AVAILABLE","deliveryMediumName":"User_6712","phoneNumber":"9631186466","weightCapacity":198.64,"unitsCapacity":10,"volumeCapacity":5.5,"branchName":"LMDMumbai"},{"tripId":506515,"tripName":"TRIP-16455","tripStatus":"NOTSTARTED","routePlanningId":-1,"routeName":"DEFAULT","deliveryMediumId":39911,"deliveryMediumStatus":"AVAILABLE","deliveryMediumName":"User_9765","phoneNumber":"9497828683","weightCapacity":90.1,"unitsCapacity":10,"volumeCapacity":90.1,"branchName":"LMDMumbai"},{"tripId":506512,"tripName":"TRIP-16454","tripStatus":"NOTSTARTED","routePlanningId":-1,"routeName":"DEFAULT","deliveryMediumId":39910,"deliveryMediumStatus":"AVAILABLE","deliveryMediumName":"User_7030","phoneNumber":"9890383431","weightCapacity":90.1,"unitsCapacity":10,"volumeCapacity":90.1,"branchName":"LMDMumbai"},{"tripId":506511,"tripName":"TRIP-16453","tripStatus":"NOTSTARTED","routePlanningId":-1,"routeName":"DEFAULT","deliveryMediumId":39909,"deliveryMediumStatus":"AVAILABLE","deliveryMediumName":"User_5226","phoneNumber":"9334718863","weightCapacity":90.1,"unitsCapacity":10,"volumeCapacity":90.1,"branchName":"LMDMumbai"},{"tripId":506510,"tripName":"TRIP-16452","tripStatus":"NOTSTARTED","routePlanningId":-1,"routeName":"DEFAULT","deliveryMediumId":39908,"deliveryMediumStatus":"AVAILABLE","deliveryMediumName":"User_4972","phoneNumber":"9574526935","weightCapacity":90.1,"unitsCapacity":10,"volumeCapacity":90.1,"branchName":"LMDMumbai"},{"tripId":506508,"tripName":"TRIP-16450","tripStatus":"NOTSTARTED","routePlanningId":-1,"routeName":"DEFAULT","deliveryMediumId":39907,"deliveryMediumStatus":"DISPATCHED","deliveryMediumName":"User_2324","phoneNumber":"9928579040","weightCapacity":90.1,"unitsCapacity":10,"volumeCapacity":90.1,"branchName":"LMDMumbai"},{"tripId":506507,"tripName":"TRIP-16449","tripStatus":"NOTSTARTED","routePlanningId":-1,"routeName":"DEFAULT","deliveryMediumId":39906,"deliveryMediumStatus":"AVAILABLE","deliveryMediumName":"User_4539","phoneNumber":"9439727354","weightCapacity":90.1,"unitsCapacity":10,"volumeCapacity":90.1,"branchName":"LMDMumbai"},{"tripId":506506,"tripName":"TRIP-16448","tripStatus":"NOTSTARTED","routePlanningId":-1,"routeName":"DEFAULT","deliveryMediumId":39905,"deliveryMediumStatus":"AVAILABLE","deliveryMediumName":"SUPERMAN123","phoneNumber":"9892147971","weightCapacity":11.3398227359,"unitsCapacity":10,"volumeCapacity":9832.2455046154,"vehicleId":4390,"vehicleNo":"MH 407 04","vehicleType":"4 Wheeler","branchName":"LMDMumbai"},{"tripId":506505,"tripName":"TRIP-16447","tripStatus":"NOTSTARTED","routePlanningId":-1,"routeName":"DEFAULT","deliveryMediumId":39904,"deliveryMediumStatus":"ABSENT","deliveryMediumName":"SUPERMAN443","phoneNumber":"9862147758","weightCapacity":4.5359290944,"unitsCapacity":10,"volumeCapacity":163.8707584103,"vehicleId":10251,"vehicleNo":"HR26CAM1234","vehicleType":"4 Wheeler","branchName":"LMDMumbai"},{"tripId":506504,"tripName":"TRIP-16446","tripStatus":"NOTSTARTED","routePlanningId":-1,"routeName":"DEFAULT","deliveryMediumId":39903,"deliveryMediumStatus":"ABSENT","deliveryMediumName":"SUPERMAN44","phoneNumber":"9892147788","weightCapacity":4.5359290944,"unitsCapacity":10,"volumeCapacity":163.8707584103,"vehicleId":13084,"vehicleNo":"mh02ep1693","vehicleType":"2 Wheeler","branchName":"LMDMumbai"},{"tripId":506503,"tripName":"TRIP-16445","tripStatus":"NOTSTARTED","routePlanningId":-1,"routeName":"DEFAULT","deliveryMediumId":39902,"deliveryMediumStatus":"ABSENT","deliveryMediumName":"SUPERMAN123","phoneNumber":"9892147970","weightCapacity":4.5359290944,"unitsCapacity":10,"volumeCapacity":163.8707584103,"vehicleId":4389,"vehicleNo":"MH 407 03","vehicleType":"4 Wheeler","branchName":"LMDMumbai"},{"tripId":506502,"tripName":"TRIP-16444","tripStatus":"NOTSTARTED","routePlanningId":-1,"routeName":"DEFAULT","deliveryMediumId":39901,"deliveryMediumStatus":"ABSENT","deliveryMediumName":"SUPERMAN12","phoneNumber":"9892147969","weightCapacity":4.5359290944,"unitsCapacity":10,"volumeCapacity":163.8707584103,"vehicleId":4388,"vehicleNo":"MH 407 02","vehicleType":"4 Wheeler","branchName":"LMDMumbai"},{"tripId":506500,"tripName":"TRIP-16442","tripStatus":"NOTSTARTED","routePlanningId":-1,"routeName":"DEFAULT","deliveryMediumId":39900,"deliveryMediumStatus":"DISPATCHED","deliveryMediumName":"User_9119","phoneNumber":"9272521255","weightCapacity":90.1,"unitsCapacity":10,"volumeCapacity":90.1,"branchName":"LMDMumbai"},{"tripId":506497,"tripName":"TRIP-16439","tripStatus":"NOTSTARTED","routePlanningId":-1,"routeName":"DEFAULT","deliveryMediumId":39899,"deliveryMediumStatus":"DISPATCHED","deliveryMediumName":"User_3224","phoneNumber":"9179242283","weightCapacity":90.1,"unitsCapacity":10,"volumeCapacity":90.1,"branchName":"LMDMumbai"},{"tripId":506495,"tripName":"TRIP-16437","tripStatus":"NOTSTARTED","routePlanningId":-1,"routeName":"DEFAULT","deliveryMediumId":39898,"deliveryMediumStatus":"AVAILABLE","deliveryMediumName":"User_6025","phoneNumber":"9244418282","weightCapacity":90.1,"unitsCapacity":10,"volumeCapacity":90.1,"branchName":"LMDMumbai"},{"tripId":506494,"tripName":"TRIP-16436","tripStatus":"NOTSTARTED","routePlanningId":-1,"routeName":"DEFAULT","deliveryMediumId":39897,"deliveryMediumStatus":"ABSENT","deliveryMediumName":"SUPERMAN2","phoneNumber":"9872121358","weightCapacity":13.6077872831,"unitsCapacity":10,"volumeCapacity":327.7415168205,"vehicleId":869,"vehicleNo":"MB02B1290","vehicleType":"4 wheeler","branchName":"LMDMumbai"},{"tripId":506491,"tripName":"TRIP-16435","tripStatus":"STARTED","routePlanningId":-1,"routeName":"DEFAULT","deliveryMediumId":39896,"deliveryMediumStatus":"DISPATCHED","deliveryMediumName":"User_8649","phoneNumber":"9661633085","weightCapacity":90.1,"unitsCapacity":10,"volumeCapacity":90.1,"branchName":"LMDMumbai"},{"tripId":506490,"tripName":"TRIP-16434","tripStatus":"NOTSTARTED","routePlanningId":-1,"routeName":"DEFAULT","deliveryMediumId":39895,"deliveryMediumStatus":"AVAILABLE","deliveryMediumName":"User_1101","phoneNumber":"9466111934","weightCapacity":90.1,"unitsCapacity":10,"volumeCapacity":90.1,"branchName":"LMDMumbai"},{"tripId":506489,"tripName":"TRIP-16433","tripStatus":"NOTSTARTED","routePlanningId":-1,"routeName":"DEFAULT","deliveryMediumId":39894,"deliveryMediumStatus":"AVAILABLE","deliveryMediumName":"User_0629","phoneNumber":"9038561213","weightCapacity":90.1,"unitsCapacity":10,"volumeCapacity":90.1,"branchName":"LMDMumbai"},{"tripId":506488,"tripName":"TRIP-16432","tripStatus":"NOTSTARTED","routePlanningId":-1,"routeName":"DEFAULT","deliveryMediumId":39893,"deliveryMediumStatus":"ABSENT","deliveryMediumName":"SUPERMAN","phoneNumber":"9892147789","weightCapacity":10.0,"unitsCapacity":10,"volumeCapacity":10.0,"vehicleId":13926,"vehicleNo":"MH8337547101","vehicleType":"4 Wheeler","branchName":"LMDMumbai"},{"tripId":506487,"tripName":"TRIP-16431","tripStatus":"NOTSTARTED","routePlanningId":-1,"routeName":"DEFAULT","deliveryMediumId":39892,"deliveryMediumStatus":"ABSENT","deliveryMediumName":"Auto23589202","phoneNumber":"9854781518","weightCapacity":0.0,"unitsCapacity":10,"volumeCapacity":0.0,"branchName":"LMDMumbai"},{"tripId":506484,"tripName":"TRIP-16429","tripStatus":"NOTSTARTED","routePlanningId":-1,"routeName":"DEFAULT","deliveryMediumId":39891,"deliveryMediumStatus":"ABSENT","deliveryMediumName":".123","phoneNumber":"9892145585","weightCapacity":0.0,"unitsCapacity":10,"volumeCapacity":0.0,"vehicleId":13927,"vehicleNo":"MH1235734831","vehicleType":"4 Wheeler","branchName":"LMDMumbai"},{"tripId":506473,"tripName":"TRIP-16428","tripStatus":"STARTED","routePlanningId":-1,"routeName":"DEFAULT","deliveryMediumId":39883,"deliveryMediumStatus":"AVAILABLE","deliveryMediumName":"abc","phoneNumber":"9586501668","weightCapacity":1137.32,"unitsCapacity":123,"volumeCapacity":0.87,"branchName":"LMDMumbai"},{"tripId":506207,"tripName":"TRIP-16427","tripStatus":"STARTED","routePlanningId":-1,"routeName":"DEFAULT","deliveryMediumId":24125,"deliveryMediumStatus":"DISPATCHED","deliveryMediumName":"mm3","phoneNumber":"9203981238","weightCapacity":0.0,"unitsCapacity":100,"volumeCapacity":0.0,"branchName":"IOSAppReview"},{"tripId":506206,"tripName":"TRIP-16426","tripStatus":"STARTED","routePlanningId":-1,"routeName":"DEFAULT","deliveryMediumId":24124,"deliveryMediumStatus":"DISPATCHED","deliveryMediumName":"mm2","phoneNumber":"9203981237","weightCapacity":0.0,"unitsCapacity":100,"volumeCapacity":0.0,"branchName":"IOSAppReview"},{"tripId":506205,"tripName":"TRIP-16425","tripStatus":"STARTED","routePlanningId":-1,"routeName":"DEFAULT","deliveryMediumId":24123,"deliveryMediumStatus":"DISPATCHED","deliveryMediumName":"mm1","phoneNumber":"9203981236","weightCapacity":0.0,"unitsCapacity":100,"volumeCapacity":0.0,"branchName":"IOSAppReview"},{"tripId":506204,"tripName":"TRIP-16424","tripStatus":"STARTED","routePlanningId":-1,"routeName":"DEFAULT","deliveryMediumId":24121,"deliveryMediumStatus":"AVAILABLE","deliveryMediumName":"mi4","phoneNumber":"9203981234","weightCapacity":0.0,"unitsCapacity":100,"volumeCapacity":0.0,"branchName":"IOSAppReview"},{"tripId":506203,"tripName":"TRIP-16423","tripStatus":"STARTED","routePlanningId":-1,"routeName":"DEFAULT","deliveryMediumId":24122,"deliveryMediumStatus":"AVAILABLE","deliveryMediumName":"mm4","phoneNumber":"9203981235","weightCapacity":0.0,"unitsCapacity":100,"volumeCapacity":0.0,"branchName":"IOSAppReview"},{"tripId":506202,"tripName":"TRIP-16422","tripStatus":"STARTED","routePlanningId":-1,"routeName":"DEFAULT","deliveryMediumId":24126,"deliveryMediumStatus":"DISPATCHED","deliveryMediumName":"ios1","phoneNumber":"9203981239","weightCapacity":0.0,"unitsCapacity":100,"volumeCapacity":0.0,"branchName":"IOSAppReview"},{"tripId":506201,"tripName":"TRIP-16421","tripStatus":"NOTSTARTED","routePlanningId":-1,"routeName":"DEFAULT","deliveryMediumId":19604,"deliveryMediumStatus":"AVAILABLE","deliveryMediumName":"sarthak","phoneNumber":"9009087677","weightCapacity":0.0,"unitsCapacity":10,"volumeCapacity":0.0,"branchName":"IOSAppReview"},{"tripId":505440,"tripName":"TRIP-16418","tripStatus":"NOTSTARTED","routePlanningId":-1,"routeName":"DEFAULT","deliveryMediumId":15715,"deliveryMediumStatus":"AVAILABLE","deliveryMediumName":"Aron","phoneNumber":"9889098990","weightCapacity":0.0,"unitsCapacity":10,"volumeCapacity":0.0,"branchName":"IOSAppReview"},{"tripId":498719,"tripName":"TRIP-16405","tripStatus":"NOTSTARTED","routePlanningId":-1,"routeName":"DEFAULT","deliveryMediumId":23567,"deliveryMediumStatus":"AVAILABLE","deliveryMediumName":"Salman","phoneNumber":"9987301248","weightCapacity":0.0,"unitsCapacity":12,"volumeCapacity":0.0,"branchName":"IOSAppReview"}]},{"milkRun":"AUTOTRP_64430","trips":[{"tripId":506509,"tripName":"TRIP-16451","tripStatus":"STARTED","routePlanningId":3757634,"routeName":"AUTOTRP_64430","deliveryMediumId":39907,"deliveryMediumStatus":"DISPATCHED","deliveryMediumName":"User_2324","phoneNumber":"9928579040","weightCapacity":90.1,"unitsCapacity":10,"volumeCapacity":90.1,"branchName":"LMDMumbai"}]},{"milkRun":"AUTOTRP_60809","trips":[{"tripId":506501,"tripName":"TRIP-16443","tripStatus":"STARTED","routePlanningId":3757631,"routeName":"AUTOTRP_60809","deliveryMediumId":39900,"deliveryMediumStatus":"DISPATCHED","deliveryMediumName":"User_9119","phoneNumber":"9272521255","weightCapacity":90.1,"unitsCapacity":10,"volumeCapacity":90.1,"branchName":"LMDMumbai"}]},{"milkRun":"AUTOTRP_63232","trips":[{"tripId":506499,"tripName":"TRIP-16441","tripStatus":"STARTED","routePlanningId":3757630,"routeName":"AUTOTRP_63232","deliveryMediumId":39899,"deliveryMediumStatus":"DISPATCHED","deliveryMediumName":"User_3224","phoneNumber":"9179242283","weightCapacity":90.1,"unitsCapacity":10,"volumeCapacity":90.1,"branchName":"LMDMumbai"}]},{"milkRun":"AUTOTRP_73187","trips":[{"tripId":506498,"tripName":"TRIP-16440","tripStatus":"NOTSTARTED","routePlanningId":3757629,"routeName":"AUTOTRP_73187","deliveryMediumId":39899,"deliveryMediumStatus":"DISPATCHED","deliveryMediumName":"User_3224","phoneNumber":"9179242283","weightCapacity":90.1,"unitsCapacity":10,"volumeCapacity":90.1,"branchName":"LMDMumbai"}]},{"milkRun":"AUTOTRP_39627","trips":[{"tripId":506496,"tripName":"TRIP-16438","tripStatus":"NOTSTARTED","routePlanningId":3757628,"routeName":"AUTOTRP_39627","deliveryMediumId":39898,"deliveryMediumStatus":"AVAILABLE","deliveryMediumName":"User_6025","phoneNumber":"9244418282","weightCapacity":90.1,"unitsCapacity":10,"volumeCapacity":90.1,"branchName":"LMDMumbai"}]},{"milkRun":"TestPlanning1234","trips":[{"tripId":506485,"tripName":"TRIP-16430","tripStatus":"STARTED","routePlanningId":3757611,"routeName":"TestPlanning1234","deliveryMediumId":39203,"deliveryMediumStatus":"DISPATCHED","deliveryMediumName":"James","phoneNumber":"9920211245","weightCapacity":0.0,"unitsCapacity":10,"volumeCapacity":0.0,"vehicleId":866,"vehicleNo":"MH887","vehicleType":"4 wheeler","branchName":"LMDMumbai"}]},{"milkRun":"-","trips":[{"tripId":500116,"tripName":"TRIP-16414","tripStatus":"NOTSTARTED","routePlanningId":-2,"routeName":"-","deliveryMediumId":20082,"deliveryMediumStatus":"DISPATCHED","deliveryMediumName":"MH12BD70001","phoneNumber":"9922905336","weightCapacity":0.0,"unitsCapacity":50,"volumeCapacity":0.0,"branchName":"Last Mile Demo"},{"tripId":500115,"tripName":"TRIP-16413","tripStatus":"NOTSTARTED","routePlanningId":-2,"routeName":"-","deliveryMediumId":20082,"deliveryMediumStatus":"DISPATCHED","deliveryMediumName":"MH12BD70001","phoneNumber":"9922905336","weightCapacity":0.0,"unitsCapacity":50,"volumeCapacity":0.0,"branchName":"Last Mile Demo"},{"tripId":500114,"tripName":"TRIP-16412","tripStatus":"NOTSTARTED","routePlanningId":-2,"routeName":"-","deliveryMediumId":20082,"deliveryMediumStatus":"DISPATCHED","deliveryMediumName":"MH12BD70001","phoneNumber":"9922905336","weightCapacity":0.0,"unitsCapacity":50,"volumeCapacity":0.0,"branchName":"Last Mile Demo"},{"tripId":500113,"tripName":"TRIP-16411","tripStatus":"NOTSTARTED","routePlanningId":-2,"routeName":"-","deliveryMediumId":20082,"deliveryMediumStatus":"DISPATCHED","deliveryMediumName":"MH12BD70001","phoneNumber":"9922905336","weightCapacity":0.0,"unitsCapacity":50,"volumeCapacity":0.0,"branchName":"Last Mile Demo"},{"tripId":500112,"tripName":"TRIP-16410","tripStatus":"NOTSTARTED","routePlanningId":-2,"routeName":"-","deliveryMediumId":20082,"deliveryMediumStatus":"DISPATCHED","deliveryMediumName":"MH12BD70001","phoneNumber":"9922905336","weightCapacity":0.0,"unitsCapacity":50,"volumeCapacity":0.0,"branchName":"Last Mile Demo"},{"tripId":500111,"tripName":"TRIP-16409","tripStatus":"NOTSTARTED","routePlanningId":-2,"routeName":"-","deliveryMediumId":20082,"deliveryMediumStatus":"DISPATCHED","deliveryMediumName":"MH12BD70001","phoneNumber":"9922905336","weightCapacity":0.0,"unitsCapacity":50,"volumeCapacity":0.0,"branchName":"Last Mile Demo"}]},{"milkRun":"Test_123_982389","trips":[{"tripId":498740,"tripName":"TRIP-16407","tripStatus":"NOTSTARTED","routePlanningId":3756016,"routeName":"Test_123_982389","deliveryMediumId":36331,"deliveryMediumStatus":"AVAILABLE","deliveryMediumName":"INDB488","phoneNumber":"9325435966","weightCapacity":0.0,"unitsCapacity":10,"volumeCapacity":0.0,"branchName":"INDONESIA BETA1"},{"tripId":498739,"tripName":"TRIP-16406","tripStatus":"NOTSTARTED","routePlanningId":3756016,"routeName":"Test_123_982389","deliveryMediumId":36343,"deliveryMediumStatus":"AVAILABLE","deliveryMediumName":"INDB500","phoneNumber":"9325445978","weightCapacity":0.0,"unitsCapacity":10000,"volumeCapacity":0.0,"branchName":"INDONESIA BETA1"}]},{"milkRun":"YGWKYGKUBW","trips":[{"tripId":498577,"tripName":"TRIP-16401","tripStatus":"NOTSTARTED","routePlanningId":3755987,"routeName":"YGWKYGKUBW","deliveryMediumId":36340,"deliveryMediumStatus":"AVAILABLE","deliveryMediumName":"INDB497","phoneNumber":"9325435975","weightCapacity":0.0,"unitsCapacity":10,"volumeCapacity":0.0,"branchName":"INDONESIA BETA1"},{"tripId":498576,"tripName":"TRIP-16400","tripStatus":"NOTSTARTED","routePlanningId":3755987,"routeName":"YGWKYGKUBW","deliveryMediumId":36335,"deliveryMediumStatus":"AVAILABLE","deliveryMediumName":"INDB492","phoneNumber":"9325435970","weightCapacity":0.0,"unitsCapacity":10,"volumeCapacity":0.0,"branchName":"INDONESIA BETA1"},{"tripId":498575,"tripName":"TRIP-16399","tripStatus":"NOTSTARTED","routePlanningId":3755987,"routeName":"YGWKYGKUBW","deliveryMediumId":36300,"deliveryMediumStatus":"AVAILABLE","deliveryMediumName":"INDB457","phoneNumber":"9325435935","weightCapacity":0.0,"unitsCapacity":10,"volumeCapacity":0.0,"branchName":"INDONESIA BETA1"},{"tripId":498574,"tripName":"TRIP-16398","tripStatus":"NOTSTARTED","routePlanningId":3755987,"routeName":"YGWKYGKUBW","deliveryMediumId":36317,"deliveryMediumStatus":"AVAILABLE","deliveryMediumName":"INDB474","phoneNumber":"9325435952","weightCapacity":0.0,"unitsCapacity":10,"volumeCapacity":0.0,"branchName":"INDONESIA BETA1"}]}]},"hasError":false}
			JsonObject tripsAssignmentData = getTripAssignmentData();
			System.out.println("tripsAssignmentData: "+tripsAssignmentData);
			Assert.assertNotNull(tripsAssignmentData);

			//Get Structure of trips list view page -  https://testing.loginextsolutions.com/LoginApp/framework/structure?modelName=TRIPS&pageName=TRIPS&sectionName=ORDER_TRIPS_LIST_VIEW - {"columns":{"milkRun":{"label":"Route Name","fieldName":"input","fieldType":"text","permission":true,"id":"milkRun","required":false,"childLength":0,"rowSpan":2,"colSpan":0,"childNodes":{},"validation":{},"labelKey":"Route Name","allowed":false,"searchable":true,"editable":true,"sortable":true,"infoFlag":false},"tripName":{"label":"Trip Name","fieldName":"input","fieldType":"text","permission":true,"id":"tripName","required":true,"childLength":0,"rowSpan":2,"colSpan":0,"childNodes":{},"validation":{"required":{"message":"Trip name is required."},"maxlength":{"args":"250","message":"Trip Name must be maximum 250 characters long."}},"labelKey":"Trip Name","allowed":false,"searchable":true,"editable":true,"sortable":true,"infoFlag":false},"tripStatus":{"label":"Trip Status","fieldName":"input","fieldType":"text","permission":true,"id":"tripStatus","required":false,"childLength":0,"rowSpan":2,"colSpan":0,"childNodes":{},"validation":{},"labelKey":"Trip Status","allowed":false,"searchable":false,"editable":true,"sortable":false,"infoFlag":false},"capacity":{"label":"Capacity","permission":true,"id":"capacity","required":false,"childLength":3,"rowSpan":1,"colSpan":0,"childNodes":{"unitsCapacity":{"label":"(Units)","fieldName":"input","fieldType":"checkbox","permission":true,"id":"unitsCapacity","required":false,"childLength":0,"rowSpan":0,"colSpan":0,"childNodes":{},"validation":{},"labelKey":"(Units)","allowed":false,"searchable":false,"editable":false,"sortable":false,"infoFlag":false},"weightCapacity":{"label":"(lb)","fieldName":"input","fieldType":"checkbox","permission":true,"id":"weightCapacity","required":false,"childLength":0,"rowSpan":0,"colSpan":0,"childNodes":{},"validation":{},"labelKey":"(#@#weight#@#)","allowed":false,"searchable":false,"editable":false,"sortable":false,"infoFlag":false},"volumeCapacity":{"label":"(cubic inches)","fieldName":"input","fieldType":"checkbox","permission":true,"id":"volumeCapacity","required":false,"childLength":0,"rowSpan":0,"colSpan":0,"childNodes":{},"validation":{},"labelKey":"(#@#volume#@#)","allowed":false,"searchable":false,"editable":false,"sortable":false,"infoFlag":false}},"validation":{},"labelKey":"Capacity","allowed":false,"searchable":false,"editable":true,"sortable":false,"infoFlag":false},"vehicleNo":{"label":"Vehicle","fieldName":"input","fieldType":"text","permission":true,"id":"vehicleNo","required":false,"childLength":0,"rowSpan":2,"colSpan":0,"childNodes":{},"validation":{},"labelKey":"Vehicle","allowed":false,"searchable":true,"editable":true,"sortable":true,"infoFlag":false},"deliveryMediumName":{"label":"Delivery Associate Name","fieldName":"input","fieldType":"text","permission":true,"id":"deliveryMediumName","required":false,"childLength":0,"rowSpan":2,"colSpan":0,"childNodes":{},"validation":{},"labelKey":"Delivery Name","allowed":false,"searchable":true,"editable":true,"sortable":false,"infoFlag":false},"lastTrackingDate":{"label":"Last Tracking","fieldName":"input","fieldType":"text","permission":true,"id":"lastTrackingDate","required":false,"childLength":0,"rowSpan":2,"colSpan":0,"childNodes":{},"validation":{},"labelKey":"Last Tracking","allowed":false,"searchable":false,"editable":true,"sortable":false,"infoFlag":false}},"buttons":{}}
			JsonObject tripsStructureObject = getStructureAPI("TRIPS", "TRIPS", "ORDER_TRIPS_LIST_VIEW");
			System.out.println("tripsStructureObject: "+tripsStructureObject);
			Assert.assertNotNull(tripsStructureObject);

			//Either Fetch label name from structure - id = tripName , Label - "Trip Name" - 

			//Search for Trip Name - //*[text()='Trip Name']//ancestor::div[@role="columnheader"]//input

			//Or -- Get the trip id for the first trip
			JsonArray results_TestData = tripsAssignmentData.has("data") ? tripsAssignmentData.get("data").getAsJsonObject().get("results").getAsJsonArray() : null;
			if (results_TestData == null || results_TestData.size() <= 0)
			{
				logMessage("Get Trips assignment data", "Should be able to fetch trips assignment data", "No trips found", "Failed");
				return false;
			}
			String strTripID = "";
			String strTripName = "";
			ArrayList <String> tripsArrayLst = new ArrayList<>();
			
			//Getting the tripId for the first element in milk run
			for (JsonElement currentMilkRunJsonElem : results_TestData) 
			{

				//String strMilkRunName = currentMilkRunJsonElem.getAsJsonObject().get("milkRun").getAsString();
				//System.out.println("strMilkRunName: "+strMilkRunName);

				//Loop through Trips for each milk run
				JsonArray results_Trips = currentMilkRunJsonElem.getAsJsonObject().get("trips").getAsJsonArray();
				for(JsonElement currentTripDetails : results_Trips){
					//Get Trip Name
					strTripName = currentTripDetails.getAsJsonObject().get("tripName").getAsString();
					String strTripId = currentTripDetails.getAsJsonObject().get("tripId").getAsString();
					strTripID = strTripId;
					if (strTripId != null){
						tripsArrayLst.add(strTripId);
						if (tripsArrayLst.size() > 1){
							break;
						}
						//break; // Do not iterate over rest of the data
					}
				}
				if (strTripID != null){
					//break; // Do not iterate over rest of the data
					if (tripsArrayLst.size() > 1){
						break;
					}
				}
			}

			//Update sometimes trips gets created in background and does not gets reflected in screen
			strTripID = tripsArrayLst.get(1);
			
			//Click the trip id radio button - //*[@for="506515"]
			String strTripIDXPath = "//*[@for='"+strTripID+"']";
			rc = clickElementByJavascript(driver, strTripIDXPath, "Trip : "+strTripName+" TripID : ("+strTripID+") Radio Button");//clickElementByXPath(strTripIDXPath, "Trip : "+strTripName+" TripID : ("+strTripID+") Radio Button");
			Assert.assertTrue(rc);

			//Click Assign Now button - //*[@logi-google-analytics="Assign Now - bulk"]
			String strAssignNowBtnXPath = "//*[@logi-google-analytics=\"Assign Now - bulk\"]";

			//Bring element to view - //*[@logi-google-analytics="Assign Now - bulk"]
			bringElementInView(strAssignNowBtnXPath);
			rc = clickElementByXPath(strAssignNowBtnXPath, "Assign Now button");
			Assert.assertTrue(rc);

			//Expected Message - update.order.success - Order updated successfully
			String strExpectedPromptValue = getLabel_PageLabelAPI(row, "update.order.success");
			String strJSPromptXPath = "//*[@id='js-prompt']";
			rc = waitForJS_PromptMessageJS(strExpectedPromptValue, strJSPromptXPath);
			if (rc)
			{
				logMessage("Verify Success Message", "Success Message - "+strExpectedPromptValue+" Successfully should display", "Message : "+strExpectedPromptValue+" is displayed", "Passed");
			}
			else
			{
				String strPromptValue =	getPromptElementTextByXPath(strJSPromptXPath, "JS Prompt");//"";
				logMessage("Verify Success Message", "Success Message - "+strExpectedPromptValue+" should display", "Success Message is not displayed, Unable to create an order, Expecting Message : "+strExpectedPromptValue+" Actual : "+strPromptValue, "Failed");
				return false;
			}

			return true;
		}
		catch (Exception e) 
		{
			logMessage("Verify order assignment", "Should be able to verify order assignment to trip", "Unable to assign order to trip", "Failed");
			e.printStackTrace();
			return false;
		}
	}

	boolean saveAndAssignOrderToTrip = false; //Set this flag to true if you need to Save and Assign Order to trip
	public boolean tripAssignmentScreen (LinkedHashMap<String, String> row)
	{
		try 
		{

			//Get trips data - https://testing.loginextsolutions.com/TripApp/trip/lmfm/getToAssignOrders?status=NOTSTARTED,STARTED - {"status":200,"message":"Successfully obtained trips","data":{"totalCount":14269,"otherCount":0,"clientBranchId":0,"results":[{"milkRun":"DEFAULT","trips":[{"tripId":506516,"tripName":"TRIP-16456","tripStatus":"NOTSTARTED","routePlanningId":-1,"routeName":"DEFAULT","deliveryMediumId":39912,"deliveryMediumStatus":"AVAILABLE","deliveryMediumName":"User_6712","phoneNumber":"9631186466","weightCapacity":198.64,"unitsCapacity":10,"volumeCapacity":5.5,"branchName":"LMDMumbai"},{"tripId":506515,"tripName":"TRIP-16455","tripStatus":"NOTSTARTED","routePlanningId":-1,"routeName":"DEFAULT","deliveryMediumId":39911,"deliveryMediumStatus":"AVAILABLE","deliveryMediumName":"User_9765","phoneNumber":"9497828683","weightCapacity":90.1,"unitsCapacity":10,"volumeCapacity":90.1,"branchName":"LMDMumbai"},{"tripId":506512,"tripName":"TRIP-16454","tripStatus":"NOTSTARTED","routePlanningId":-1,"routeName":"DEFAULT","deliveryMediumId":39910,"deliveryMediumStatus":"AVAILABLE","deliveryMediumName":"User_7030","phoneNumber":"9890383431","weightCapacity":90.1,"unitsCapacity":10,"volumeCapacity":90.1,"branchName":"LMDMumbai"},{"tripId":506511,"tripName":"TRIP-16453","tripStatus":"NOTSTARTED","routePlanningId":-1,"routeName":"DEFAULT","deliveryMediumId":39909,"deliveryMediumStatus":"AVAILABLE","deliveryMediumName":"User_5226","phoneNumber":"9334718863","weightCapacity":90.1,"unitsCapacity":10,"volumeCapacity":90.1,"branchName":"LMDMumbai"},{"tripId":506510,"tripName":"TRIP-16452","tripStatus":"NOTSTARTED","routePlanningId":-1,"routeName":"DEFAULT","deliveryMediumId":39908,"deliveryMediumStatus":"AVAILABLE","deliveryMediumName":"User_4972","phoneNumber":"9574526935","weightCapacity":90.1,"unitsCapacity":10,"volumeCapacity":90.1,"branchName":"LMDMumbai"},{"tripId":506508,"tripName":"TRIP-16450","tripStatus":"NOTSTARTED","routePlanningId":-1,"routeName":"DEFAULT","deliveryMediumId":39907,"deliveryMediumStatus":"DISPATCHED","deliveryMediumName":"User_2324","phoneNumber":"9928579040","weightCapacity":90.1,"unitsCapacity":10,"volumeCapacity":90.1,"branchName":"LMDMumbai"},{"tripId":506507,"tripName":"TRIP-16449","tripStatus":"NOTSTARTED","routePlanningId":-1,"routeName":"DEFAULT","deliveryMediumId":39906,"deliveryMediumStatus":"AVAILABLE","deliveryMediumName":"User_4539","phoneNumber":"9439727354","weightCapacity":90.1,"unitsCapacity":10,"volumeCapacity":90.1,"branchName":"LMDMumbai"},{"tripId":506506,"tripName":"TRIP-16448","tripStatus":"NOTSTARTED","routePlanningId":-1,"routeName":"DEFAULT","deliveryMediumId":39905,"deliveryMediumStatus":"AVAILABLE","deliveryMediumName":"SUPERMAN123","phoneNumber":"9892147971","weightCapacity":11.3398227359,"unitsCapacity":10,"volumeCapacity":9832.2455046154,"vehicleId":4390,"vehicleNo":"MH 407 04","vehicleType":"4 Wheeler","branchName":"LMDMumbai"},{"tripId":506505,"tripName":"TRIP-16447","tripStatus":"NOTSTARTED","routePlanningId":-1,"routeName":"DEFAULT","deliveryMediumId":39904,"deliveryMediumStatus":"ABSENT","deliveryMediumName":"SUPERMAN443","phoneNumber":"9862147758","weightCapacity":4.5359290944,"unitsCapacity":10,"volumeCapacity":163.8707584103,"vehicleId":10251,"vehicleNo":"HR26CAM1234","vehicleType":"4 Wheeler","branchName":"LMDMumbai"},{"tripId":506504,"tripName":"TRIP-16446","tripStatus":"NOTSTARTED","routePlanningId":-1,"routeName":"DEFAULT","deliveryMediumId":39903,"deliveryMediumStatus":"ABSENT","deliveryMediumName":"SUPERMAN44","phoneNumber":"9892147788","weightCapacity":4.5359290944,"unitsCapacity":10,"volumeCapacity":163.8707584103,"vehicleId":13084,"vehicleNo":"mh02ep1693","vehicleType":"2 Wheeler","branchName":"LMDMumbai"},{"tripId":506503,"tripName":"TRIP-16445","tripStatus":"NOTSTARTED","routePlanningId":-1,"routeName":"DEFAULT","deliveryMediumId":39902,"deliveryMediumStatus":"ABSENT","deliveryMediumName":"SUPERMAN123","phoneNumber":"9892147970","weightCapacity":4.5359290944,"unitsCapacity":10,"volumeCapacity":163.8707584103,"vehicleId":4389,"vehicleNo":"MH 407 03","vehicleType":"4 Wheeler","branchName":"LMDMumbai"},{"tripId":506502,"tripName":"TRIP-16444","tripStatus":"NOTSTARTED","routePlanningId":-1,"routeName":"DEFAULT","deliveryMediumId":39901,"deliveryMediumStatus":"ABSENT","deliveryMediumName":"SUPERMAN12","phoneNumber":"9892147969","weightCapacity":4.5359290944,"unitsCapacity":10,"volumeCapacity":163.8707584103,"vehicleId":4388,"vehicleNo":"MH 407 02","vehicleType":"4 Wheeler","branchName":"LMDMumbai"},{"tripId":506500,"tripName":"TRIP-16442","tripStatus":"NOTSTARTED","routePlanningId":-1,"routeName":"DEFAULT","deliveryMediumId":39900,"deliveryMediumStatus":"DISPATCHED","deliveryMediumName":"User_9119","phoneNumber":"9272521255","weightCapacity":90.1,"unitsCapacity":10,"volumeCapacity":90.1,"branchName":"LMDMumbai"},{"tripId":506497,"tripName":"TRIP-16439","tripStatus":"NOTSTARTED","routePlanningId":-1,"routeName":"DEFAULT","deliveryMediumId":39899,"deliveryMediumStatus":"DISPATCHED","deliveryMediumName":"User_3224","phoneNumber":"9179242283","weightCapacity":90.1,"unitsCapacity":10,"volumeCapacity":90.1,"branchName":"LMDMumbai"},{"tripId":506495,"tripName":"TRIP-16437","tripStatus":"NOTSTARTED","routePlanningId":-1,"routeName":"DEFAULT","deliveryMediumId":39898,"deliveryMediumStatus":"AVAILABLE","deliveryMediumName":"User_6025","phoneNumber":"9244418282","weightCapacity":90.1,"unitsCapacity":10,"volumeCapacity":90.1,"branchName":"LMDMumbai"},{"tripId":506494,"tripName":"TRIP-16436","tripStatus":"NOTSTARTED","routePlanningId":-1,"routeName":"DEFAULT","deliveryMediumId":39897,"deliveryMediumStatus":"ABSENT","deliveryMediumName":"SUPERMAN2","phoneNumber":"9872121358","weightCapacity":13.6077872831,"unitsCapacity":10,"volumeCapacity":327.7415168205,"vehicleId":869,"vehicleNo":"MB02B1290","vehicleType":"4 wheeler","branchName":"LMDMumbai"},{"tripId":506491,"tripName":"TRIP-16435","tripStatus":"STARTED","routePlanningId":-1,"routeName":"DEFAULT","deliveryMediumId":39896,"deliveryMediumStatus":"DISPATCHED","deliveryMediumName":"User_8649","phoneNumber":"9661633085","weightCapacity":90.1,"unitsCapacity":10,"volumeCapacity":90.1,"branchName":"LMDMumbai"},{"tripId":506490,"tripName":"TRIP-16434","tripStatus":"NOTSTARTED","routePlanningId":-1,"routeName":"DEFAULT","deliveryMediumId":39895,"deliveryMediumStatus":"AVAILABLE","deliveryMediumName":"User_1101","phoneNumber":"9466111934","weightCapacity":90.1,"unitsCapacity":10,"volumeCapacity":90.1,"branchName":"LMDMumbai"},{"tripId":506489,"tripName":"TRIP-16433","tripStatus":"NOTSTARTED","routePlanningId":-1,"routeName":"DEFAULT","deliveryMediumId":39894,"deliveryMediumStatus":"AVAILABLE","deliveryMediumName":"User_0629","phoneNumber":"9038561213","weightCapacity":90.1,"unitsCapacity":10,"volumeCapacity":90.1,"branchName":"LMDMumbai"},{"tripId":506488,"tripName":"TRIP-16432","tripStatus":"NOTSTARTED","routePlanningId":-1,"routeName":"DEFAULT","deliveryMediumId":39893,"deliveryMediumStatus":"ABSENT","deliveryMediumName":"SUPERMAN","phoneNumber":"9892147789","weightCapacity":10.0,"unitsCapacity":10,"volumeCapacity":10.0,"vehicleId":13926,"vehicleNo":"MH8337547101","vehicleType":"4 Wheeler","branchName":"LMDMumbai"},{"tripId":506487,"tripName":"TRIP-16431","tripStatus":"NOTSTARTED","routePlanningId":-1,"routeName":"DEFAULT","deliveryMediumId":39892,"deliveryMediumStatus":"ABSENT","deliveryMediumName":"Auto23589202","phoneNumber":"9854781518","weightCapacity":0.0,"unitsCapacity":10,"volumeCapacity":0.0,"branchName":"LMDMumbai"},{"tripId":506484,"tripName":"TRIP-16429","tripStatus":"NOTSTARTED","routePlanningId":-1,"routeName":"DEFAULT","deliveryMediumId":39891,"deliveryMediumStatus":"ABSENT","deliveryMediumName":".123","phoneNumber":"9892145585","weightCapacity":0.0,"unitsCapacity":10,"volumeCapacity":0.0,"vehicleId":13927,"vehicleNo":"MH1235734831","vehicleType":"4 Wheeler","branchName":"LMDMumbai"},{"tripId":506473,"tripName":"TRIP-16428","tripStatus":"STARTED","routePlanningId":-1,"routeName":"DEFAULT","deliveryMediumId":39883,"deliveryMediumStatus":"AVAILABLE","deliveryMediumName":"abc","phoneNumber":"9586501668","weightCapacity":1137.32,"unitsCapacity":123,"volumeCapacity":0.87,"branchName":"LMDMumbai"},{"tripId":506207,"tripName":"TRIP-16427","tripStatus":"STARTED","routePlanningId":-1,"routeName":"DEFAULT","deliveryMediumId":24125,"deliveryMediumStatus":"DISPATCHED","deliveryMediumName":"mm3","phoneNumber":"9203981238","weightCapacity":0.0,"unitsCapacity":100,"volumeCapacity":0.0,"branchName":"IOSAppReview"},{"tripId":506206,"tripName":"TRIP-16426","tripStatus":"STARTED","routePlanningId":-1,"routeName":"DEFAULT","deliveryMediumId":24124,"deliveryMediumStatus":"DISPATCHED","deliveryMediumName":"mm2","phoneNumber":"9203981237","weightCapacity":0.0,"unitsCapacity":100,"volumeCapacity":0.0,"branchName":"IOSAppReview"},{"tripId":506205,"tripName":"TRIP-16425","tripStatus":"STARTED","routePlanningId":-1,"routeName":"DEFAULT","deliveryMediumId":24123,"deliveryMediumStatus":"DISPATCHED","deliveryMediumName":"mm1","phoneNumber":"9203981236","weightCapacity":0.0,"unitsCapacity":100,"volumeCapacity":0.0,"branchName":"IOSAppReview"},{"tripId":506204,"tripName":"TRIP-16424","tripStatus":"STARTED","routePlanningId":-1,"routeName":"DEFAULT","deliveryMediumId":24121,"deliveryMediumStatus":"AVAILABLE","deliveryMediumName":"mi4","phoneNumber":"9203981234","weightCapacity":0.0,"unitsCapacity":100,"volumeCapacity":0.0,"branchName":"IOSAppReview"},{"tripId":506203,"tripName":"TRIP-16423","tripStatus":"STARTED","routePlanningId":-1,"routeName":"DEFAULT","deliveryMediumId":24122,"deliveryMediumStatus":"AVAILABLE","deliveryMediumName":"mm4","phoneNumber":"9203981235","weightCapacity":0.0,"unitsCapacity":100,"volumeCapacity":0.0,"branchName":"IOSAppReview"},{"tripId":506202,"tripName":"TRIP-16422","tripStatus":"STARTED","routePlanningId":-1,"routeName":"DEFAULT","deliveryMediumId":24126,"deliveryMediumStatus":"DISPATCHED","deliveryMediumName":"ios1","phoneNumber":"9203981239","weightCapacity":0.0,"unitsCapacity":100,"volumeCapacity":0.0,"branchName":"IOSAppReview"},{"tripId":506201,"tripName":"TRIP-16421","tripStatus":"NOTSTARTED","routePlanningId":-1,"routeName":"DEFAULT","deliveryMediumId":19604,"deliveryMediumStatus":"AVAILABLE","deliveryMediumName":"sarthak","phoneNumber":"9009087677","weightCapacity":0.0,"unitsCapacity":10,"volumeCapacity":0.0,"branchName":"IOSAppReview"},{"tripId":505440,"tripName":"TRIP-16418","tripStatus":"NOTSTARTED","routePlanningId":-1,"routeName":"DEFAULT","deliveryMediumId":15715,"deliveryMediumStatus":"AVAILABLE","deliveryMediumName":"Aron","phoneNumber":"9889098990","weightCapacity":0.0,"unitsCapacity":10,"volumeCapacity":0.0,"branchName":"IOSAppReview"},{"tripId":498719,"tripName":"TRIP-16405","tripStatus":"NOTSTARTED","routePlanningId":-1,"routeName":"DEFAULT","deliveryMediumId":23567,"deliveryMediumStatus":"AVAILABLE","deliveryMediumName":"Salman","phoneNumber":"9987301248","weightCapacity":0.0,"unitsCapacity":12,"volumeCapacity":0.0,"branchName":"IOSAppReview"}]},{"milkRun":"AUTOTRP_64430","trips":[{"tripId":506509,"tripName":"TRIP-16451","tripStatus":"STARTED","routePlanningId":3757634,"routeName":"AUTOTRP_64430","deliveryMediumId":39907,"deliveryMediumStatus":"DISPATCHED","deliveryMediumName":"User_2324","phoneNumber":"9928579040","weightCapacity":90.1,"unitsCapacity":10,"volumeCapacity":90.1,"branchName":"LMDMumbai"}]},{"milkRun":"AUTOTRP_60809","trips":[{"tripId":506501,"tripName":"TRIP-16443","tripStatus":"STARTED","routePlanningId":3757631,"routeName":"AUTOTRP_60809","deliveryMediumId":39900,"deliveryMediumStatus":"DISPATCHED","deliveryMediumName":"User_9119","phoneNumber":"9272521255","weightCapacity":90.1,"unitsCapacity":10,"volumeCapacity":90.1,"branchName":"LMDMumbai"}]},{"milkRun":"AUTOTRP_63232","trips":[{"tripId":506499,"tripName":"TRIP-16441","tripStatus":"STARTED","routePlanningId":3757630,"routeName":"AUTOTRP_63232","deliveryMediumId":39899,"deliveryMediumStatus":"DISPATCHED","deliveryMediumName":"User_3224","phoneNumber":"9179242283","weightCapacity":90.1,"unitsCapacity":10,"volumeCapacity":90.1,"branchName":"LMDMumbai"}]},{"milkRun":"AUTOTRP_73187","trips":[{"tripId":506498,"tripName":"TRIP-16440","tripStatus":"NOTSTARTED","routePlanningId":3757629,"routeName":"AUTOTRP_73187","deliveryMediumId":39899,"deliveryMediumStatus":"DISPATCHED","deliveryMediumName":"User_3224","phoneNumber":"9179242283","weightCapacity":90.1,"unitsCapacity":10,"volumeCapacity":90.1,"branchName":"LMDMumbai"}]},{"milkRun":"AUTOTRP_39627","trips":[{"tripId":506496,"tripName":"TRIP-16438","tripStatus":"NOTSTARTED","routePlanningId":3757628,"routeName":"AUTOTRP_39627","deliveryMediumId":39898,"deliveryMediumStatus":"AVAILABLE","deliveryMediumName":"User_6025","phoneNumber":"9244418282","weightCapacity":90.1,"unitsCapacity":10,"volumeCapacity":90.1,"branchName":"LMDMumbai"}]},{"milkRun":"TestPlanning1234","trips":[{"tripId":506485,"tripName":"TRIP-16430","tripStatus":"STARTED","routePlanningId":3757611,"routeName":"TestPlanning1234","deliveryMediumId":39203,"deliveryMediumStatus":"DISPATCHED","deliveryMediumName":"James","phoneNumber":"9920211245","weightCapacity":0.0,"unitsCapacity":10,"volumeCapacity":0.0,"vehicleId":866,"vehicleNo":"MH887","vehicleType":"4 wheeler","branchName":"LMDMumbai"}]},{"milkRun":"-","trips":[{"tripId":500116,"tripName":"TRIP-16414","tripStatus":"NOTSTARTED","routePlanningId":-2,"routeName":"-","deliveryMediumId":20082,"deliveryMediumStatus":"DISPATCHED","deliveryMediumName":"MH12BD70001","phoneNumber":"9922905336","weightCapacity":0.0,"unitsCapacity":50,"volumeCapacity":0.0,"branchName":"Last Mile Demo"},{"tripId":500115,"tripName":"TRIP-16413","tripStatus":"NOTSTARTED","routePlanningId":-2,"routeName":"-","deliveryMediumId":20082,"deliveryMediumStatus":"DISPATCHED","deliveryMediumName":"MH12BD70001","phoneNumber":"9922905336","weightCapacity":0.0,"unitsCapacity":50,"volumeCapacity":0.0,"branchName":"Last Mile Demo"},{"tripId":500114,"tripName":"TRIP-16412","tripStatus":"NOTSTARTED","routePlanningId":-2,"routeName":"-","deliveryMediumId":20082,"deliveryMediumStatus":"DISPATCHED","deliveryMediumName":"MH12BD70001","phoneNumber":"9922905336","weightCapacity":0.0,"unitsCapacity":50,"volumeCapacity":0.0,"branchName":"Last Mile Demo"},{"tripId":500113,"tripName":"TRIP-16411","tripStatus":"NOTSTARTED","routePlanningId":-2,"routeName":"-","deliveryMediumId":20082,"deliveryMediumStatus":"DISPATCHED","deliveryMediumName":"MH12BD70001","phoneNumber":"9922905336","weightCapacity":0.0,"unitsCapacity":50,"volumeCapacity":0.0,"branchName":"Last Mile Demo"},{"tripId":500112,"tripName":"TRIP-16410","tripStatus":"NOTSTARTED","routePlanningId":-2,"routeName":"-","deliveryMediumId":20082,"deliveryMediumStatus":"DISPATCHED","deliveryMediumName":"MH12BD70001","phoneNumber":"9922905336","weightCapacity":0.0,"unitsCapacity":50,"volumeCapacity":0.0,"branchName":"Last Mile Demo"},{"tripId":500111,"tripName":"TRIP-16409","tripStatus":"NOTSTARTED","routePlanningId":-2,"routeName":"-","deliveryMediumId":20082,"deliveryMediumStatus":"DISPATCHED","deliveryMediumName":"MH12BD70001","phoneNumber":"9922905336","weightCapacity":0.0,"unitsCapacity":50,"volumeCapacity":0.0,"branchName":"Last Mile Demo"}]},{"milkRun":"Test_123_982389","trips":[{"tripId":498740,"tripName":"TRIP-16407","tripStatus":"NOTSTARTED","routePlanningId":3756016,"routeName":"Test_123_982389","deliveryMediumId":36331,"deliveryMediumStatus":"AVAILABLE","deliveryMediumName":"INDB488","phoneNumber":"9325435966","weightCapacity":0.0,"unitsCapacity":10,"volumeCapacity":0.0,"branchName":"INDONESIA BETA1"},{"tripId":498739,"tripName":"TRIP-16406","tripStatus":"NOTSTARTED","routePlanningId":3756016,"routeName":"Test_123_982389","deliveryMediumId":36343,"deliveryMediumStatus":"AVAILABLE","deliveryMediumName":"INDB500","phoneNumber":"9325445978","weightCapacity":0.0,"unitsCapacity":10000,"volumeCapacity":0.0,"branchName":"INDONESIA BETA1"}]},{"milkRun":"YGWKYGKUBW","trips":[{"tripId":498577,"tripName":"TRIP-16401","tripStatus":"NOTSTARTED","routePlanningId":3755987,"routeName":"YGWKYGKUBW","deliveryMediumId":36340,"deliveryMediumStatus":"AVAILABLE","deliveryMediumName":"INDB497","phoneNumber":"9325435975","weightCapacity":0.0,"unitsCapacity":10,"volumeCapacity":0.0,"branchName":"INDONESIA BETA1"},{"tripId":498576,"tripName":"TRIP-16400","tripStatus":"NOTSTARTED","routePlanningId":3755987,"routeName":"YGWKYGKUBW","deliveryMediumId":36335,"deliveryMediumStatus":"AVAILABLE","deliveryMediumName":"INDB492","phoneNumber":"9325435970","weightCapacity":0.0,"unitsCapacity":10,"volumeCapacity":0.0,"branchName":"INDONESIA BETA1"},{"tripId":498575,"tripName":"TRIP-16399","tripStatus":"NOTSTARTED","routePlanningId":3755987,"routeName":"YGWKYGKUBW","deliveryMediumId":36300,"deliveryMediumStatus":"AVAILABLE","deliveryMediumName":"INDB457","phoneNumber":"9325435935","weightCapacity":0.0,"unitsCapacity":10,"volumeCapacity":0.0,"branchName":"INDONESIA BETA1"},{"tripId":498574,"tripName":"TRIP-16398","tripStatus":"NOTSTARTED","routePlanningId":3755987,"routeName":"YGWKYGKUBW","deliveryMediumId":36317,"deliveryMediumStatus":"AVAILABLE","deliveryMediumName":"INDB474","phoneNumber":"9325435952","weightCapacity":0.0,"unitsCapacity":10,"volumeCapacity":0.0,"branchName":"INDONESIA BETA1"}]}]},"hasError":false}
			JsonObject tripsAssignmentData = getTripAssignmentData();
			System.out.println("tripsAssignmentData: "+tripsAssignmentData);
			Assert.assertNotNull(tripsAssignmentData);

			//Get Structure of trips list view page -  https://testing.loginextsolutions.com/LoginApp/framework/structure?modelName=TRIPS&pageName=TRIPS&sectionName=ORDER_TRIPS_LIST_VIEW - {"columns":{"milkRun":{"label":"Route Name","fieldName":"input","fieldType":"text","permission":true,"id":"milkRun","required":false,"childLength":0,"rowSpan":2,"colSpan":0,"childNodes":{},"validation":{},"labelKey":"Route Name","allowed":false,"searchable":true,"editable":true,"sortable":true,"infoFlag":false},"tripName":{"label":"Trip Name","fieldName":"input","fieldType":"text","permission":true,"id":"tripName","required":true,"childLength":0,"rowSpan":2,"colSpan":0,"childNodes":{},"validation":{"required":{"message":"Trip name is required."},"maxlength":{"args":"250","message":"Trip Name must be maximum 250 characters long."}},"labelKey":"Trip Name","allowed":false,"searchable":true,"editable":true,"sortable":true,"infoFlag":false},"tripStatus":{"label":"Trip Status","fieldName":"input","fieldType":"text","permission":true,"id":"tripStatus","required":false,"childLength":0,"rowSpan":2,"colSpan":0,"childNodes":{},"validation":{},"labelKey":"Trip Status","allowed":false,"searchable":false,"editable":true,"sortable":false,"infoFlag":false},"capacity":{"label":"Capacity","permission":true,"id":"capacity","required":false,"childLength":3,"rowSpan":1,"colSpan":0,"childNodes":{"unitsCapacity":{"label":"(Units)","fieldName":"input","fieldType":"checkbox","permission":true,"id":"unitsCapacity","required":false,"childLength":0,"rowSpan":0,"colSpan":0,"childNodes":{},"validation":{},"labelKey":"(Units)","allowed":false,"searchable":false,"editable":false,"sortable":false,"infoFlag":false},"weightCapacity":{"label":"(lb)","fieldName":"input","fieldType":"checkbox","permission":true,"id":"weightCapacity","required":false,"childLength":0,"rowSpan":0,"colSpan":0,"childNodes":{},"validation":{},"labelKey":"(#@#weight#@#)","allowed":false,"searchable":false,"editable":false,"sortable":false,"infoFlag":false},"volumeCapacity":{"label":"(cubic inches)","fieldName":"input","fieldType":"checkbox","permission":true,"id":"volumeCapacity","required":false,"childLength":0,"rowSpan":0,"colSpan":0,"childNodes":{},"validation":{},"labelKey":"(#@#volume#@#)","allowed":false,"searchable":false,"editable":false,"sortable":false,"infoFlag":false}},"validation":{},"labelKey":"Capacity","allowed":false,"searchable":false,"editable":true,"sortable":false,"infoFlag":false},"vehicleNo":{"label":"Vehicle","fieldName":"input","fieldType":"text","permission":true,"id":"vehicleNo","required":false,"childLength":0,"rowSpan":2,"colSpan":0,"childNodes":{},"validation":{},"labelKey":"Vehicle","allowed":false,"searchable":true,"editable":true,"sortable":true,"infoFlag":false},"deliveryMediumName":{"label":"Delivery Associate Name","fieldName":"input","fieldType":"text","permission":true,"id":"deliveryMediumName","required":false,"childLength":0,"rowSpan":2,"colSpan":0,"childNodes":{},"validation":{},"labelKey":"Delivery Name","allowed":false,"searchable":true,"editable":true,"sortable":false,"infoFlag":false},"lastTrackingDate":{"label":"Last Tracking","fieldName":"input","fieldType":"text","permission":true,"id":"lastTrackingDate","required":false,"childLength":0,"rowSpan":2,"colSpan":0,"childNodes":{},"validation":{},"labelKey":"Last Tracking","allowed":false,"searchable":false,"editable":true,"sortable":false,"infoFlag":false}},"buttons":{}}
			JsonObject tripsStructureObject = getStructureAPI("TRIPS", "TRIPS", "ORDER_TRIPS_LIST_VIEW");
			System.out.println("tripsStructureObject: "+tripsStructureObject);
			Assert.assertNotNull(tripsStructureObject);

			//Either Fetch label name from structure - id = tripName , Label - "Trip Name" - 

			//Search for Trip Name - //*[text()='Trip Name']//ancestor::div[@role="columnheader"]//input

			//Or -- Get the trip id for the first trip
			JsonArray results_TestData = tripsAssignmentData.has("data") ? tripsAssignmentData.get("data").getAsJsonObject().get("results").getAsJsonArray() : null;
			if (results_TestData == null || results_TestData.size() <= 0)
			{
				logMessage("Get Trips assignment data", "Should be able to fetch trips assignment data", "No trips found", "Failed");
				return false;
			}
			String strTripID = "";
			String strTripName = "";
			//Getting the tripId for the first element in milk run
			for (JsonElement currentMilkRunJsonElem : results_TestData) 
			{

				//String strMilkRunName = currentMilkRunJsonElem.getAsJsonObject().get("milkRun").getAsString();
				//System.out.println("strMilkRunName: "+strMilkRunName);

				//Loop through Trips for each milk run
				JsonArray results_Trips = currentMilkRunJsonElem.getAsJsonObject().get("trips").getAsJsonArray();
				for(JsonElement currentTripDetails : results_Trips){
					//Get Trip Name
					strTripName = currentTripDetails.getAsJsonObject().get("tripName").getAsString();
					String strTripId = currentTripDetails.getAsJsonObject().get("tripId").getAsString();
					strTripID = strTripId;
					if (strTripId != null){
						break; // Do not iterate over rest of the data
					}
				}
				if (strTripID != null){
					break; // Do not iterate over rest of the data
				}
			}

			//Click the trip id radio button - //*[@for="506515"]
			String strTripIDXPath = "//*[@for='"+strTripID+"']";
			rc = clickElementByJavascript(driver, strTripIDXPath, "Trip : "+strTripName+" TripID : ("+strTripID+") Radio Button");//clickElementByXPath(strTripIDXPath, "Trip : "+strTripName+" TripID : ("+strTripID+") Radio Button");
			Assert.assertTrue(rc);


			//Get Label for Key - assign 
			String strAssignButton = getLabel_PageLabelAPI(row, "assign");
			System.out.println("strAssignButton : "+strAssignButton);
			//Click Assign Now button Label Key - assign - //*[@logi-google-analytics="Assign Now - bulk"]
			String strAssignBtnXPath = "//*[text()=\""+strAssignButton+"\"]";// "//*[@logi-google-analytics=\"Assign Now - bulk\"]";

			//Bring element to view - //*[@logi-google-analytics="Assign Now - bulk"]
			bringElementInView(strAssignBtnXPath);
			rc = clickElementByXPath(strAssignBtnXPath, "Assign Now button");
			Assert.assertTrue(rc);

			//Expected Message - update.order.success - Order updated successfully
			String strExpectedPromptValue = getLabel_PageLabelAPI(row, "update.order.success");
			String strJSPromptXPath = "//*[@id='js-prompt']";
			rc = waitForJS_PromptMessageJS(strExpectedPromptValue, strJSPromptXPath);
			if (rc)
			{
				logMessage("Verify Success Message", "Success Message - "+strExpectedPromptValue+" Successfully should display", "Message : "+strExpectedPromptValue+" is displayed", "Passed");
			}
			else
			{
				String strPromptValue =	getPromptElementTextByXPath(strJSPromptXPath, "JS Prompt");//"";
				logMessage("Verify Success Message", "Success Message - "+strExpectedPromptValue+" should display", "Success Message is not displayed, Unable to create an order, Expecting Message : "+strExpectedPromptValue+" Actual : "+strPromptValue, "Failed");
				return false;
			}	
			return true;
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			logMessage("Verify Order is assigned to trip", "Should be able to perform order assignment to trip", "Unable to perform order assignment to trip : "+e.getMessage(), "Failed");
			return false;
		}
	}

	public JsonObject getTripAssignmentData ()
	{
		JsonObject tripsAssignmentData = null;
		String strAPI = null;

		try {

			//Get the auth token and Client Secret from from Auth API
			LinkedHashMap <String , String> row = getTempData();
			strAPI = row.get("URL") + // demo.loginextsolutions.com/
					"TripApp/trip/lmfm/getToAssignOrders?status=NOTSTARTED,STARTED";

			System.out.println("Getting  : "+strAPI+" ");
			System.out.println("Headers \n"
					+ "client_secret_key:"+""+ row.get("clientSecretKey"));
			System.out.println("www-authenticate:"+""+ "BASIC "+row.get("token"));
			System.out.println("Content-Type:"+""+"application/json");

			//If not found in appPage_labels -> Hit label API and add it to app_PageLabels - 
			Response structurePageModelResponse = given().when().headers(
					"client_secret_key", row.get("clientSecretKey"),
					"www-authenticate", "BASIC "+row.get("token"),
					"Content-Type","application/json")
					.get(strAPI);

			String strAPI_Response = structurePageModelResponse.getBody().asString();
			System.out.println("strAPI_Response: "+strAPI_Response);
			JsonParser parser = new JsonParser();
			tripsAssignmentData = parser.parse(strAPI_Response).getAsJsonObject();
			return tripsAssignmentData;
		} catch (Exception e) {
			e.printStackTrace();
			logMessage("Get trips assignment data", "Should be able to fetch trip assignemt data", "Unable to get trip assignment data : API "+strAPI, "Failed");
			return null;
		}


	}




	public boolean deleteDeliveryBoy (LinkedHashMap<String, String> row) 
	{
		try 
		{
			//Add Delivery Boy
			row = addDeliveryBoyTest(row);
			row = getTempData();
			Assert.assertNotNull(row);

			String strDeliveryBoyName = row.get("db.deliveryMediumMasterName");
			System.out.println("strDeliveryBoyName: "+strDeliveryBoyName);

			//Get The Page Structure API for Delivery Medium - https://testing.loginextsolutions.com/LoginApp/framework/structure?modelName=DELIVERYMEDIUM&pageName=DELIVERYMEDIUM&sectionName=DELIVERY_MEDIUM_LIST_VIEW - {"columns":{"deliveryMediumMasterName":{"label":"Name","fieldName":"input","fieldType":"text","permission":true,"id":"deliveryMediumMasterName","required":true,"childLength":0,"rowSpan":2,"colSpan":0,"childNodes":{},"validation":{"minlength":{"args":"3","message":"Minimum 3 characters required."},"required":{"message":"Full Name is required"},"maxlength":{"args":"50","message":"Full Name must be maximum 50 characters long."}},"labelKey":"deliveryMediumMasterName","allowed":false,"searchable":true,"editable":true,"sortable":true,"infoFlag":false},"phoneNumber":{"label":"Phone Number","fieldName":"input","fieldType":"text","permission":true,"id":"phoneNumber","required":true,"childLength":0,"rowSpan":2,"colSpan":0,"childNodes":{},"validation":{"required":{"message":"Mobile Number is Required"},"phonenumber":{"args":"","message":"INVALID Mobile Number"},"maxlength":{"args":"18","message":"Mobile Number must be maximum 18 characters long."}},"labelKey":"phoneNumber","allowed":false,"searchable":true,"editable":true,"sortable":true,"infoFlag":false},"branchName":{"label":"Kendra","fieldName":"input","fieldType":"select","permission":true,"id":"branchName","required":false,"childLength":0,"rowSpan":2,"colSpan":0,"childNodes":{},"validation":{},"labelKey":"branchName","allowed":false,"searchable":true,"editable":true,"sortable":true,"infoFlag":false},"capacity":{"label":"Capacity","permission":true,"id":"capacity","required":false,"childLength":3,"rowSpan":1,"colSpan":0,"childNodes":{"capacityInWeight":{"label":"(in Kg)","fieldName":"input","fieldType":"text","permission":true,"id":"capacityInWeight","required":false,"childLength":0,"rowSpan":0,"colSpan":0,"childNodes":{},"validation":{"numeric":{"args":"","message":"Please enter a valid Capacity."},"minlength":{"args":"0","message":"Please enter a valid Capacity."},"max":{"args":"999999999","message":"Capacity (Weight) value must be less than equal to 999999999."}},"labelKey":"capacityInWeight","allowed":false,"searchable":true,"editable":true,"sortable":true,"infoFlag":false},"capacityInUnits":{"label":"(in Units)","fieldName":"input","fieldType":"text","permission":true,"id":"capacityInUnits","required":true,"childLength":0,"rowSpan":0,"colSpan":0,"childNodes":{},"validation":{"numeric":{"args":"","message":"Please enter a valid Capacity."},"required":{"message":"Units is Required"},"minlength":{"args":"0","message":"Please enter a valid Capacity."},"min":{"args":"0","message":"Please enter a valid Capacity."},"max":{"args":"999999999","message":"Capacity (Units) value must be less than equal to 999999999."}},"labelKey":"capacityInUnits","allowed":false,"searchable":true,"editable":true,"sortable":true,"infoFlag":false},"capacityInVolume":{"label":"(in Cc)","fieldName":"input","fieldType":"text","permission":true,"id":"capacityInVolume","required":false,"childLength":0,"rowSpan":0,"colSpan":0,"childNodes":{},"validation":{"numeric":{"args":"","message":"Please enter a valid Capacity."},"minlength":{"args":"0","message":"Please enter a valid Capacity."},"max":{"args":"999999999","message":"Capacity (Volume) value must be less than equal to 999999999."}},"labelKey":"capacityInVolume","allowed":false,"searchable":true,"editable":true,"sortable":true,"infoFlag":false}},"validation":{},"labelKey":"capacity","allowed":false,"searchable":false,"editable":true,"sortable":false,"infoFlag":false},"deliveryMediumMasterTypeCd":{"label":"Type","fieldName":"input","fieldType":"dropdown","permission":true,"id":"deliveryMediumMasterTypeCd","required":false,"childLength":0,"rowSpan":2,"colSpan":0,"childNodes":{},"validation":{},"labelKey":"deliveryMediumMasterTypeCd","allowed":false,"searchable":false,"editable":true,"sortable":true,"infoFlag":false},"userName":{"label":"User Name","fieldName":"input","fieldType":"text","permission":true,"id":"userName","required":true,"childLength":0,"rowSpan":2,"colSpan":0,"childNodes":{},"validation":{"minlength":{"args":"3","message":"Minimum 3 characters required."},"required":{"message":"Username is required."},"maxlength":{"args":"25","message":"Username must be maximum 25 characters long."}},"labelKey":"User Name","allowed":false,"searchable":true,"editable":false,"sortable":true,"infoFlag":false},"statusCd":{"label":"Status","fieldName":"input","fieldType":"dropdown","permission":true,"id":"statusCd","required":false,"childLength":0,"rowSpan":2,"colSpan":0,"childNodes":{},"validation":{},"labelKey":"statusCd","infoTool":[{"key":"deliverymedium_statusCd_infotip","message":"Possible Delivery Resource statuses - Available, Intransit, Inactive."}],"allowed":false,"searchable":true,"editable":false,"sortable":true,"infoFlag":true},"deviceStatus":{"label":"Device Status","fieldName":"input","fieldType":"text","permission":true,"id":"deviceStatus","required":false,"childLength":0,"rowSpan":2,"colSpan":0,"childNodes":{},"validation":{},"labelKey":"deviceStatus","allowed":false,"searchable":false,"editable":false,"sortable":true,"infoFlag":false},"tripName":{"label":"Running Trip","fieldName":"input","fieldType":"text","permission":true,"id":"tripName","required":false,"childLength":0,"rowSpan":2,"colSpan":0,"childNodes":{},"validation":{},"labelKey":"Running Trip","allowed":false,"searchable":true,"editable":false,"sortable":true,"infoFlag":false},"trackingDate":{"label":"Last Tracking","fieldName":"input","fieldType":"calendar","permission":true,"id":"trackingDate","required":false,"childLength":0,"rowSpan":2,"colSpan":0,"childNodes":{},"validation":{},"labelKey":"trackingDate","allowed":false,"searchable":true,"editable":false,"sortable":true,"infoFlag":false},"isAttandanceFl":{"label":"Attendance","fieldName":"input","fieldType":"checkbox","permission":true,"id":"isAttandanceFl","required":false,"childLength":0,"rowSpan":2,"colSpan":0,"childNodes":{},"validation":{},"labelKey":"isAttandanceFl","allowed":false,"searchable":false,"editable":false,"sortable":true,"infoFlag":false},"isActiveFl":{"label":"Active / Inactive","fieldName":"input","fieldType":"checkbox","permission":true,"id":"isActiveFl","required":false,"childLength":0,"rowSpan":2,"colSpan":0,"childNodes":{},"validation":{},"labelKey":"isActiveFl","allowed":false,"searchable":false,"editable":false,"sortable":true,"infoFlag":false},"isOnBreakFl":{"label":"On-Break","fieldName":"input","fieldType":"text","permission":false,"id":"isOnBreakFl","required":false,"childLength":0,"rowSpan":2,"colSpan":0,"childNodes":{},"validation":{},"labelKey":"On-Break","allowed":false,"searchable":false,"editable":true,"sortable":true,"infoFlag":false}},"buttons":{"delete":{"label":"Delete","fieldName":"button","fieldType":"button","permission":true,"id":"delete","required":false,"childLength":0,"rowSpan":0,"colSpan":0,"labelKey":"Delete","allowed":false,"searchable":true,"editable":false,"sortable":true,"infoFlag":false},"duplicate":{"label":"Duplicate","fieldName":"button","fieldType":"button","permission":false,"id":"duplicate","required":false,"childLength":0,"rowSpan":0,"colSpan":0,"labelKey":"Duplicate","allowed":false,"searchable":true,"editable":false,"sortable":true,"infoFlag":false},"update":{"label":"Update","fieldName":"button","fieldType":"button","permission":true,"id":"update","required":false,"childLength":0,"rowSpan":0,"colSpan":0,"labelKey":"Update","allowed":false,"searchable":true,"editable":false,"sortable":true,"infoFlag":false},"save":{"label":"Save","fieldName":"button","fieldType":"button","permission":false,"id":"save","required":false,"childLength":0,"rowSpan":0,"colSpan":0,"labelKey":"Save","allowed":false,"searchable":true,"editable":false,"sortable":true,"infoFlag":false},"cancel":{"label":"Cancel","fieldName":"button","fieldType":"button","permission":false,"id":"cancel","required":false,"childLength":0,"rowSpan":0,"colSpan":0,"labelKey":"Cancel","allowed":false,"searchable":true,"editable":false,"sortable":true,"infoFlag":false},"changePwd":{"label":"Change Password","fieldName":"button","fieldType":"button","permission":true,"required":false,"childLength":0,"rowSpan":0,"colSpan":0,"labelKey":"Change Password","allowed":false,"searchable":true,"editable":false,"sortable":true,"infoFlag":false},"bulkUpdate":{"label":"Bulk Update","fieldName":"button","fieldType":"button","permission":true,"id":"bulkUpdate","required":false,"childLength":0,"rowSpan":0,"colSpan":0,"labelKey":"bulkUpdate","allowed":false,"searchable":true,"editable":false,"sortable":true,"infoFlag":false},"notify":{"label":"Notify","fieldName":"button","fieldType":"button","permission":true,"id":"notify","required":false,"childLength":0,"rowSpan":2,"colSpan":0,"validation":{},"labelKey":"notify","allowed":false,"searchable":false,"editable":false,"sortable":false,"infoFlag":false},"more":{"label":"More","fieldName":"button","fieldType":"button","permission":true,"id":"more","required":false,"childLength":0,"rowSpan":0,"colSpan":0,"dropdownValues":{"absent":"Mark as Absent","present":"Mark as Present","active":"Mark as Active","inActive":"Mark as Inactive"},"labelKey":"More","allowed":false,"searchable":true,"editable":false,"sortable":true,"infoFlag":false},"advancedSearch":{"label":"advancedSearch","fieldName":"button","fieldType":"button","permission":true,"id":"advancedSearch","required":false,"childLength":0,"rowSpan":2,"colSpan":0,"labelKey":"advancedSearch","allowed":false,"searchable":false,"editable":false,"sortable":false,"infoFlag":false}}}
			JsonObject pageStructureDeliveryMedium = getStructureAPI("DELIVERYMEDIUM", "DELIVERYMEDIUM", "DELIVERY_MEDIUM_LIST_VIEW");
			String strDeliveryMediumMasterNameLabel = (pageStructureDeliveryMedium.getAsJsonObject().has("columns") && pageStructureDeliveryMedium.getAsJsonObject().get("columns").getAsJsonObject().has("deliveryMediumMasterName")) ? pageStructureDeliveryMedium.getAsJsonObject().get("columns").getAsJsonObject().get("deliveryMediumMasterName").getAsJsonObject().get("label").getAsString() : null;
			if (strDeliveryMediumMasterNameLabel == null)
			{
				logMessage("Get Column Name from Structure API", "Should be able to fetch column name from structire API", "Unable to fetch column name deliveryMediumMasterName from Structure API", "Failed");
				return false;
			}

			//Validate columns exists on page
			//rc = verifyColumnsExistsOnPage(pageStructureDeliveryMedium);//true
			//Assert.assertTrue(rc);
			//**

			TimeUnit.SECONDS.sleep(3);

			String strDeliveryMediumID = searchDeliveryBoy(strDeliveryBoyName);
			System.out.println("strDeliveryMediumID : "+strDeliveryMediumID);
			if (strDeliveryMediumID == null || strDeliveryMediumID.equals(""))
			{
				logMessage("Search for Delivery Medium", "Should be able to search for Delivery Medium", "Unable to search for delivery medium", "Failed");
				return false;
			}

			//Click Delivery Medium Checkbox
			String strDeliveryMediumCheckboxXPath = "//*[@id='"+strDeliveryMediumID+"']";
			String strDeliveryMediumCheckboxLabelXPath = "//*[@for='"+strDeliveryMediumID+"']";
			rc = clickCheckboxByXPath(strDeliveryMediumCheckboxXPath, strDeliveryMediumCheckboxLabelXPath, "Delivery Medium Checkbox", true);
			Assert.assertTrue(rc);

			//Click Update Button - //*[@logi-google-analytics="deliveryMedium - update-record"]
			String strDeleteButtonXPath = "//*[@logi-google-analytics=\"deliveryMedium - delete-record\"]";
			rc = clickElementByXPath(strDeleteButtonXPath, "Delete Button"); 
			Assert.assertTrue(rc);

			TimeUnit.SECONDS.sleep(5);

			//Click Confirm Delete Button - //*[@id="delete-record"]
			strDeleteButtonXPath = "//*[contains (@class, 'icon-Product-Icons_Trash-Blank')]";
			rc = clickElementByXPath(strDeleteButtonXPath, "Confirm Delete Button"); 
			Assert.assertTrue(rc);

			//Verify Message for delete.deliverymedium.success - i.e Delivery Boy updated successfully
			String strLabelKey = "delete.deliverymedium.success";
			getLabel_PageLabelAPI(row, strLabelKey);
			String strExpectedPromptValue = app_PageLabels.has(strLabelKey) ? app_PageLabels.get(strLabelKey).getAsString() : "";
			if (strExpectedPromptValue == null || strExpectedPromptValue.equals("")){
				logMessage("Verify "+strLabelKey+" Label", ""+strLabelKey+" Label should be defined", "Label - "+strLabelKey+" is not defined", "Failed");
			}
			String strJSPromptXPath = "//*[@id='js-prompt']";
			rc = waitForJS_PromptMessageJS(strExpectedPromptValue, strJSPromptXPath);
			if (rc)
			{
				logMessage("Verify Success Message", "Success Message - "+strExpectedPromptValue+" Successfully should display", "Message : "+strExpectedPromptValue+" is displayed", "Passed");
			}
			else
			{
				String strPromptValue =	getPromptElementTextByXPath(strJSPromptXPath, "JS Prompt");//"";
				logMessage("Verify Success Message", "Success Message - "+strExpectedPromptValue+" should display", "Success Message is not displayed, Unable to create an order, Expecting Message : "+strExpectedPromptValue+" Actual : "+strPromptValue, "Failed");
				return false;
			}


			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	/***************** Haul ****************************/
	

	/**
	 * Function to add vehicle object...
	 * @param row - testdataMap Object
	 */
	public boolean addVehicleTest (LinkedHashMap<String, String> row) 
	{

		try 
		{
			
			//Navigate to vehicle page
			rc = navigateToVehiclePage(row);

			//Get all tmp auth token variables 
			row = getTempData();
			
			TimeUnit.SECONDS.sleep(5);
			
			//Click Add Button - //*[contains (@class,'icon-add')]
			String strXPath = "//*[@logi-google-analytics=\"Vehicle - Add button\"]";// "//*[contains (@class,'icon-add')]"; //"//*[contains (@class,'icon-add')]" ; //"//*[@class='logi-icon icon-Product-Icons_Add']";//"//*[contains (@class,'icon-add')]";////*[text()='Resource']";
			rc = clickElementByXPath(strXPath, "Add Button");
			Assert.assertTrue(rc);

			//Get page structure for vehicle
			String strPageStructureRequestURL = "LoginApp/framework/structure?pageName=VEHICLE&sectionName=ADD_VEHICLE_FORM&modelName=VEHICLE";
			JsonElement pageStructure = getOrderPageStructure(row, row.get("URL")+strPageStructureRequestURL);//"LoginApp/framework/structure?modelName=ORDERS&pageName=ORDERS&sectionName=ADD_ORDER_FORM");
			if (pageStructure == null || pageStructure.getAsJsonObject().size() == 0){
				return false;
			}
			String strOrdersPageStructure = pageStructure.toString();
			System.out.println("strOrdersPageStructure: "+strOrdersPageStructure);

			//Fetch Order Page Specific TestData
			//String strSheetName = "DataMap";
			String strPageName = "Vehicle_Page";//"Orders_Page";
			LinkedHashMap <String, String> pageDataMap = getPageObjects(row, strPageName); // ReadExcel2.readSortedTestDataMap(strSheetName, strPageName);

			//Perform substitution of keywords or functions like AUTOGEN / DATE / BOOLEAN / INTEGER / DECIMAL etc from DataSheet with actual values,
			updateTempData(row);
			pageDataMap = substituteDataMapKeywords (pageDataMap);
			System.out.println("pageDataMap: "+pageDataMap);

			//On Success put some entries in hashMap
			String strVehicleNumber = pageDataMap.get("vehicleNumber");
			String strVehicleUnladenWt = pageDataMap.get("unladdenWeight");
			String strVehicleCapacityUnits = pageDataMap.get("capacityInUnits");
			String strsubIdWeight = pageDataMap.get("capacityInWeight");
			String strVehilcleVolume = pageDataMap.get("capacityInVolume");

			System.out.println("strVehicleNumber: "+strVehicleNumber);
			System.out.println("strVehicleUnladenWt: "+strVehicleUnladenWt);
			System.out.println("strVehicleCapacityUnits: "+strVehicleCapacityUnits);
			System.out.println("strsubIdWeight: "+strsubIdWeight);
			System.out.println("strVehilcleVolume: "+strVehilcleVolume);
			this.strVehicleNumber = strVehicleNumber;
			row.put("VehicleNumber", strVehicleNumber);
			row.put("VehicleUnladenWt", strVehicleUnladenWt);
			row.put("VehicleCapacityUnits", strVehicleCapacityUnits);
			row.put("VehicleCapacityWtKgs", strsubIdWeight);
			row.put("VehicleCapacityVolumeCC", strVehilcleVolume);
			updateTempData(row);

			//Enter Data on orders page//
			rc = enterValues (pageDataMap, strOrdersPageStructure);
			Assert.assertTrue(rc);

			//On Success put some entries in hashMap
			//TimeUnit.SECONDS.sleep(1);

			//Enter Save Button 
			String strSaveButtonXPath ="//button [@logi-google-analytics='Vehicle Add - Save']"; //"//button[@class='"+app_PageLabels.get("save").getAsString()+"']";
			rc = clickElementByXPath (strSaveButtonXPath, "Save Button");
			Assert.assertTrue(rc);

			//Get text from Prompt Message on success or failiure - //*[@id='js-prompt']
			String strVehicleSuccessMessage = app_PageLabels.get("vehicle.created.success").getAsString();
			System.out.println("strVehicleSuccessMessage: "+strVehicleSuccessMessage);

			//rc = waitForJS_PromptMessage(strVehicleSuccessMessage);

			String strPromptXPath = "//*[@id='js-prompt')]";
			rc = waitForJS_PromptMessageJS(strVehicleSuccessMessage, strPromptXPath);// waitForJS_PromptMessage(strExpectedPromptValue);
			if (rc)
			{
				logMessage("Verify Success Message", "Success Message - Vehicle created successfully should display", "Message : "+strVehicleSuccessMessage+" is displayed", "Passed");
			}
			else
			{
				String strPromptValue = getPromptElementTextByXPath(strPromptXPath, "Prompt");//getElementTextByXPath(strPromptXPath, "Prompt");
				logMessage("Verify Success Message", "Success Message - Vehicle created successfully should display", "Message : '"+strVehicleSuccessMessage+"' is not displayed : Actual : "+strPromptValue, "Failed");
				return false;
			}

			//Get Vehicle List view Columns Structure - https://testing.loginextsolutions.com/LoginApp/framework/structure?modelName=VEHICLE&pageName=VEHICLE&sectionName=VEHICLE_LIST_VIEW 
			JsonObject vehicleListViewStructure = getStructureAPI("VEHICLE", "VEHICLE", "VEHICLE_LIST_VIEW");
			if (vehicleListViewStructure == null)
			{
				logMessage("Get Vehicle List view column structure", "Should be able to get vehicle list view column structure", "Unable to get vehicle list view column structure - "+vehicleListViewStructure, "Failed");
				return false;
			}
			
			String strVehicleColumnLabel = vehicleListViewStructure.has("columns") ? vehicleListViewStructure.get("columns").getAsJsonObject().get("vehicleNumber").getAsJsonObject().get("label").getAsString() : null; 
			System.out.println("strVehicleColumnLabel: "+strVehicleColumnLabel);
			if (strVehicleColumnLabel == null)
			{
				logMessage("Should be able to get label key", "Vehicle No. column label key should be fetched", "Unable to fetch vehicle column key", "Failed");
				return false;
			}
			
			//Wait for Vehicle Search box to appear
			String strVehicleNumberXPath =  "//*[contains (@title, '"+strVehicleColumnLabel+"')]//ancestor::div[@role='columnheader']//input";// "//*[contains (@title, 'Vehicle No.')]//ancestor::div[@role='columnheader']//input";
			rc = clickElementByXPath(strVehicleNumberXPath, "Vehicle Search box");
			Assert.assertTrue(rc);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			logMessage("Verify addition of a vehicle", "Vehicle should be added", "Unable to add vehicle", "Failed");
			return false;
		}
		return true;
	}


	public boolean updateVehicle(LinkedHashMap<String, String> row) {
		try 
		{
			
			rc = addVehicleTest(row);
			Assert.assertTrue(rc);//

			//Get all tmp auth token variables 
			row = getTempData();
			
			//Get vehicle number which is added
			String strAddedVehicleNumber = row.containsKey("VehicleNumber") ? row.get("VehicleNumber") : "";
			if (strAddedVehicleNumber == null || strAddedVehicleNumber.equals(""))
			{
				logMessage("Verify vehicle is added", "Should be able to fetch added vehicle from system", "Unable to get added vehicle number", "Failed");
				return false;
			}
			
			//Navigate to vehicle page
			rc = navigateToVehiclePage(row);

			//Search for vehicle number
			String strVehicleID = udsVehicleSearch(strAddedVehicleNumber);
			if (strVehicleID == null || strVehicleID.equals("")){
				logMessage("Verify vehicle status", "Get vehicle ID after searching for vehicle number", "Unable to search for vehicle ID", "Failed");
				return false;
			}

			//TimeUnit.SECONDS.sleep(5);

			//Click on edit button for that searched vehicle id - #vehicleId-13131 - //*[@id='vehicleId-13131' and contains (@class, 'edit')]
			String strVehicleEditButtonXPath = "//*[@id='"+strVehicleID+"' and contains (@class, 'edit')]";
			showWebElementByXPath(strVehicleEditButtonXPath, "Edit Button - Vehicle - "+strAddedVehicleNumber);
			rc = clickElementByXPath(strVehicleEditButtonXPath, "Edit Button - Vehicle - "+strAddedVehicleNumber);
			Assert.assertTrue(rc);

			//wait for page having vehicle details element - //*[text()='Vehicle Details']
			String strVehicleDetailsLabel = getLabel_PageLabelAPI(row, "vehicleDetails");
			String strVehicleDetailsElement = "//*[text()='"+strVehicleDetailsLabel+"']";
			rc = clickElementByXPath(strVehicleDetailsElement, "Vehicle Details");
			Assert.assertTrue(rc);
			
			//Get page structure for vehicle
			String strPageStructureRequestURL = "LoginApp/framework/structure?pageName=VEHICLE&sectionName=ADD_VEHICLE_FORM&modelName=VEHICLE";
			JsonElement pageStructure = getOrderPageStructure(row, row.get("URL")+strPageStructureRequestURL);//"LoginApp/framework/structure?modelName=ORDERS&pageName=ORDERS&sectionName=ADD_ORDER_FORM");
			if (pageStructure == null || pageStructure.getAsJsonObject().size() == 0){
				return false;
			}
			String strOrdersPageStructure = pageStructure.toString();
			System.out.println("strOrdersPageStructure: "+strOrdersPageStructure);

			//Fetch Data for Vehicle Updates
			String strPageName = "VehicleUpdate_Page";//"Orders_Page";
			LinkedHashMap <String, String> pageDataMap = getPageObjects(row, strPageName); // ReadExcel2.readSortedTestDataMap(strSheetName, strPageName);
			System.out.println("pageDataMap: "+pageDataMap);

			String strUpdatedVehicleNumber = pageDataMap.get("u.vehicleNumber");
			System.out.println("strUpdatedVehicleNumber : "+strUpdatedVehicleNumber);

			pageDataMap = removeDotReferences(pageDataMap);//
			System.out.println("Removed Dot References : "+pageDataMap);
			
			//Perform substitution of keywords or functions like AUTOGEN / DATE / BOOLEAN / INTEGER / DECIMAL etc from DataSheet with actual values,
			updateTempData(row);
			pageDataMap = substituteDataMapKeywords (pageDataMap);
			System.out.println("pageDataMap: "+pageDataMap);

			//Enter Data on vehicle page//
			rc = enterValues (pageDataMap, strOrdersPageStructure);
			Assert.assertTrue(rc);

			
			/**
			//Click Add Button - //*[contains (@class,'icon-add')]
			String strXPath = "//*[@logi-google-analytics=\"Vehicle - Add button\"]";// "//*[contains (@class,'icon-add')]"; //"//*[contains (@class,'icon-add')]" ; //"//*[@class='logi-icon icon-Product-Icons_Add']";//"//*[contains (@class,'icon-add')]";////*[text()='Resource']";
			rc = clickElementByXPath(strXPath, "Add Button");
			Assert.assertTrue(rc);

			//Get page structure for vehicle
			String strPageStructureRequestURL = "LoginApp/framework/structure?pageName=VEHICLE&sectionName=ADD_VEHICLE_FORM&modelName=VEHICLE";
			JsonElement pageStructure = getOrderPageStructure(row, row.get("URL")+strPageStructureRequestURL);//"LoginApp/framework/structure?modelName=ORDERS&pageName=ORDERS&sectionName=ADD_ORDER_FORM");
			if (pageStructure == null || pageStructure.getAsJsonObject().size() == 0){
				return false;
			}
			String strOrdersPageStructure = pageStructure.toString();
			System.out.println("strOrdersPageStructure: "+strOrdersPageStructure);

			//Fetch Order Page Specific TestData
			//String strSheetName = "DataMap";
			String strPageName = "Vehicle_Page";//"Orders_Page";
			LinkedHashMap <String, String> pageDataMap = getPageObjects(row, strPageName); // ReadExcel2.readSortedTestDataMap(strSheetName, strPageName);

			//Perform substitution of keywords or functions like AUTOGEN / DATE / BOOLEAN / INTEGER / DECIMAL etc from DataSheet with actual values,
			updateTempData(row);
			pageDataMap = substituteDataMapKeywords (pageDataMap);
			System.out.println("pageDataMap: "+pageDataMap);

			//On Success put some entries in hashMap
			String strVehicleNumber = pageDataMap.get("vehicleNumber");
			String strVehicleUnladenWt = pageDataMap.get("unladdenWeight");
			String strVehicleCapacityUnits = pageDataMap.get("capacityInUnits");
			String strsubIdWeight = pageDataMap.get("capacityInWeight");
			String strVehilcleVolume = pageDataMap.get("capacityInVolume");

			System.out.println("strVehicleNumber: "+strVehicleNumber);
			System.out.println("strVehicleUnladenWt: "+strVehicleUnladenWt);
			System.out.println("strVehicleCapacityUnits: "+strVehicleCapacityUnits);
			System.out.println("strsubIdWeight: "+strsubIdWeight);
			System.out.println("strVehilcleVolume: "+strVehilcleVolume);
			this.strVehicleNumber = strVehicleNumber;
			row.put("VehicleNumber", strVehicleNumber);
			row.put("VehicleUnladenWt", strVehicleUnladenWt);
			row.put("VehicleCapacityUnits", strVehicleCapacityUnits);
			row.put("VehicleCapacityWtKgs", strsubIdWeight);
			row.put("VehicleCapacityVolumeCC", strVehilcleVolume);
			updateTempData(row);

			//Enter Data on orders page//
			rc = enterValues (pageDataMap, strOrdersPageStructure);
			Assert.assertTrue(rc);

			//On Success put some entries in hashMap
			//TimeUnit.SECONDS.sleep(1);

			//Enter Save Button 
			String strSaveButtonXPath ="//button [@logi-google-analytics='Vehicle Add - Save']"; //"//button[@class='"+app_PageLabels.get("save").getAsString()+"']";
			rc = clickElementByXPath (strSaveButtonXPath, "Save Button");
			Assert.assertTrue(rc);

			//Get text from Prompt Message on success or failiure - //*[@id='js-prompt']
			String strVehicleSuccessMessage = app_PageLabels.get("vehicle.created.success").getAsString();
			System.out.println("strVehicleSuccessMessage: "+strVehicleSuccessMessage);

			//rc = waitForJS_PromptMessage(strVehicleSuccessMessage);

			String strPromptXPath = "//*[@id='js-prompt')]";
			rc = waitForJS_PromptMessageJS(strVehicleSuccessMessage, strPromptXPath);// waitForJS_PromptMessage(strExpectedPromptValue);
			if (rc)
			{
				logMessage("Verify Success Message", "Success Message - Vehicle created successfully should display", "Message : "+strVehicleSuccessMessage+" is displayed", "Passed");
			}
			else
			{
				String strPromptValue = getPromptElementTextByXPath(strPromptXPath, "Prompt");//getElementTextByXPath(strPromptXPath, "Prompt");
				logMessage("Verify Success Message", "Success Message - Vehicle created successfully should display", "Message : '"+strVehicleSuccessMessage+"' is not displayed : Actual : "+strPromptValue, "Failed");
				return false;
			}

			//Get Vehicle List view Columns Structure - https://testing.loginextsolutions.com/LoginApp/framework/structure?modelName=VEHICLE&pageName=VEHICLE&sectionName=VEHICLE_LIST_VIEW 
			JsonObject vehicleListViewStructure = getStructureAPI("VEHICLE", "VEHICLE", "VEHICLE_LIST_VIEW");
			if (vehicleListViewStructure == null)
			{
				logMessage("Get Vehicle List view column structure", "Should be able to get vehicle list view column structure", "Unable to get vehicle list view column structure - "+vehicleListViewStructure, "Failed");
				return false;
			}
			
			String strVehicleColumnLabel = vehicleListViewStructure.has("columns") ? vehicleListViewStructure.get("columns").getAsJsonObject().get("vehicleNumber").getAsJsonObject().get("label").getAsString() : null; 
			System.out.println("strVehicleColumnLabel: "+strVehicleColumnLabel);
			if (strVehicleColumnLabel == null)
			{
				logMessage("Should be able to get label key", "Vehicle No. column label key should be fetched", "Unable to fetch vehicle column key", "Failed");
				return false;
			}
			
			//Wait for Vehicle Search box to appear
			String strVehicleNumberXPath =  "//*[contains (@title, '"+strVehicleColumnLabel+"')]//ancestor::div[@role='columnheader']//input";// "//*[contains (@title, 'Vehicle No.')]//ancestor::div[@role='columnheader']//input";
			rc = clickElementByXPath(strVehicleNumberXPath, "Vehicle Search box");
			Assert.assertTrue(rc);
			
			**/
		}
		catch (Exception e)
		{
			e.printStackTrace();
			logMessage("Verify vehicle updates", "Vehicle should be updated", "Unable to verify vehicle updates - "+e.getMessage(), "Failed");
			return false;
		}
		return true;
	
	}
	
	
	String strVehicleNumber = null;

	public boolean navigateToVehiclePage (LinkedHashMap<String, String> row)
	{
		try 
		{

			String strXPath = "";
			if (! isApplicationLaunched)
			{
				rc = launchApplication (row);
				Assert.assertTrue(rc);

				rc = login (row);
				Assert.assertTrue(rc);

				//Get login API auth key and client secret
				row = getAuthDetailsWeb (row);
				Assert.assertNotNull(row);

				//Wait for Dashboard to load
				strXPath = "//*[@id='dashboard_cm']";///¬1/*[text()='Resource']";
				waitForELement(strXPath);
				//TimeUnit.SECONDS.sleep(10);

				isApplicationLaunched = true;
			}

			//Get Application Label - key value pairs
			rc = initApp_PageLabels(row);
			Assert.assertTrue(rc);

			//Get page menu items
			rc = initApp_MenuItems(row);
			Assert.assertTrue(rc);

			//Click Resource
			String strResourcesLabel = getMenuName("Resource");//Orders also reffered to as Tasks
			strXPath = "//*[text()="+strResourcesLabel+"]";
			rc = clickElementByXPath (strXPath, "Resources Menu");
			Assert.assertTrue(rc);

			//Click Vehicle
			String strVehicleLabel = getMenuName("Vehicle");
			strXPath = "//*[text()="+strVehicleLabel+"]";
			rc = clickElementByJavascript(driver, strXPath, "Vehicle Menu");//clickElementByXPath(strXPath, "Vehicle Menu");
			Assert.assertTrue(rc);

			//Update all temp vars in row object
			updateTempData(row);
			
			return true;
		}
		catch (Exception e) 
		{
			logMessage("Navigate to vehicle page", "Should be able to navigate to vehicle page", "Unable to navigate to vehicle page", "Failed");
			return false;
		}
	}
	

	public boolean navigateToDriverPage (LinkedHashMap<String, String> row)
	{
		try 
		{

			String strXPath = "";
			if (! isApplicationLaunched)
			{
				rc = launchApplication (row);
				Assert.assertTrue(rc);

				rc = login (row);
				Assert.assertTrue(rc);

				//Get login API auth key and client secret
				row = getAuthDetailsWeb (row);
				Assert.assertNotNull(row);

				//Wait for Dashboard to load
				strXPath = "//*[@id='dashboard_cm']";///¬1/*[text()='Resource']";
				waitForELement(strXPath);
				//TimeUnit.SECONDS.sleep(10);

				isApplicationLaunched = true;
			}

			//Get Application Label - key value pairs
			rc = initApp_PageLabels(row);
			Assert.assertTrue(rc);

			//Get page menu items
			rc = initApp_MenuItems(row);
			Assert.assertTrue(rc);

			//Click Resource
			String strResourcesLabel = getMenuName("Resource");//Orders also reffered to as Tasks
			strXPath = "//*[text()="+strResourcesLabel+"]";
			rc = clickElementByXPath (strXPath, "Resources Menu");
			Assert.assertTrue(rc);

			//Click Driver
			String strVehicleLabel = getMenuName("Driver");
			strXPath = "//*[text()="+strVehicleLabel+"]";
			rc = clickElementByJavascript(driver, strXPath, "Driver Menu");//clickElementByXPath(strXPath, "Vehicle Menu");
			Assert.assertTrue(rc);

			//Update all temp vars in row object
			updateTempData(row);
			
			return true;
		}
		catch (Exception e) 
		{
			e.getMessage();
			logMessage("Navigate to driver page", "Should be able to navigate to driver page", "Unable to navigate to driver page", "Failed");
			return false;
		}
	}
	
	

	/**
	 * Function to add vehicle object...
	 * @param row - testdataMap Object
	 */
	public boolean vehicleUpload (LinkedHashMap<String, String> row) 
	{

		try 
		{
			
			//Navigate to vehicle page
			rc = navigateToVehiclePage(row);

			//Get all tmp auth token variables 
			row = getTempData();
			
			//Click Vehicle Menu  
			JsonObject vehicleListViewStructure = getStructureAPI("VEHICLE", "VEHICLE", "VEHICLE_LIST_VIEW");
			if (vehicleListViewStructure == null)
			{
				logMessage("Get Vehicle List view column structure", "Should be able to get vehicle list view column structure", "Unable to get vehicle list view column structure - "+vehicleListViewStructure, "Failed");
				return false;
			}
			
			String strVehicleColumnLabel = vehicleListViewStructure.has("columns") ? vehicleListViewStructure.get("columns").getAsJsonObject().get("vehicleNumber").getAsJsonObject().get("label").getAsString() : null; 
			System.out.println("strVehicleColumnLabel: "+strVehicleColumnLabel);
			if (strVehicleColumnLabel == null)
			{
				logMessage("Should be able to get label key", "Vehicle No. column label key should be fetched", "Unable to fetch vehicle column key", "Failed");
				return false;
			}
			
			//Enter Vehicle Number in Global Search box - //*[contains (@title, "Vehicle No.")]//ancestor::div[@role="columnheader"]//input
			String strVehicleNumberXPath = "//*[contains (@title, '"+strVehicleColumnLabel+"')]//ancestor::div[@role='columnheader']//input";;//"//*[contains (@title, 'Vehicle No.')]//ancestor::div[@role='columnheader']//input";
			rc = clickElementByXPath(strVehicleNumberXPath, "Vehicle Number - Global Search");
			Assert.assertTrue(rc);
			
			TimeUnit.SECONDS.sleep(5);
			
			//Click Upload Button - - clickHereToUploadNew - //*[@aria-label=\"Click here to upload new Resources sheet\"] - clickHereToUploadNew - "Click here to upload new" - Resources - "Resources" - 
			String strLabelUpload = getLabel_PageLabelAPI(row, "Upload");
			String strUploadXPathBtn = "//li//span[text()='"+strLabelUpload+"']";
			rc = clickElementByXPath(strUploadXPathBtn, "Upload Button");
			Assert.assertTrue(rc);
			
			/*String strXPath = "//*[contains (@aria-label, \""+getLabel_PageLabelAPI(row, "clickHereToUploadNew")+" "+getLabel_PageLabelAPI(row, "Resources")+"\")]";// "//*[contains (@class,'icon-add')]"; //"//*[contains (@class,'icon-add')]" ; //"//*[@class='logi-icon icon-Product-Icons_Add']";//"//*[contains (@class,'icon-add')]";////*[text()='Resource']";
			rc = clickElementByXPath(strXPath, "Upload Vehicle Button");
			Assert.assertTrue(rc);*/

			//Fetch Order Page Specific TestData
			//String strSheetName = "DataMap";
			String strPageName = "VehicleUpload_Page";
			LinkedHashMap <String, String> pageDataMap = getPageObjects(row, strPageName); // ReadExcel2.readSortedTestDataMap(strSheetName, strPageName);
			System.out.println("pageDataMap: "+pageDataMap);
			
			//Set Date Format
			applicationTimeFormat = "";
			addSpacesBetweenDateAndTime = false;
			row.put("DATEFORMAT", "yyyy-MM-dd");
			updateTempData(row);//

			//Perform substitution of keywords or functions like AUTOGEN / DATE / BOOLEAN / INTEGER / DECIMAL etc from DataSheet with actual values,
			pageDataMap = substituteDataMapKeywords (pageDataMap);
			System.out.println("pageDataMap: "+pageDataMap);
			pageDataMap = removeDotReferences(pageDataMap);

			//System.out.println("fileUploadExcel_ColumnIndex_DataType: "+fileUploadExcel_ColumnIndex_DataType);
			System.out.println("pageDataMap : "+pageDataMap);

			//On Success put some entries in hashMap
			String strVehicleNumber = pageDataMap.get("VehicleNumber");

			System.out.println("strVehicleNumber: "+strVehicleNumber);

			this.strVehicleNumber = strVehicleNumber;
			row.put("VehicleNumber", strVehicleNumber);
			updateTempData(row);

			System.out.println("VehicleNumber : "+row.get("VehicleNumber"));
			
			//Click Download format
			

			//Get Last Modified File - and wait for System to download file
			File f1_lastModFile = lastFileModified(strLocalWebDownloadsDir);
			System.out.println("f1_lastModFile : "+f1_lastModFile);

			//Click download file format - //*[contains (@class,'icon-Product-Icons_Download-Report')]
			String strDownloadLinkXPath = "//*[contains (@class,'icon-Product-Icons_Download-Report')]";
			rc = clickElementByXPath(strDownloadLinkXPath, "Download File Link");
			Assert.assertTrue(rc);

			//Get Latest File from filesystem
			File f2_lastModFile = getDownloadedFile(f1_lastModFile);
			Assert.assertNotNull(f2_lastModFile);
			//
			//Copy Move Downloaded File to local Reporting directory
			String strLocalReportingDir = "Reports/"+Reporter.strR_CurrentReportsUniqueDir;
			System.out.println("Copying files to local reporting dir : "+strLocalReportingDir+"/"+f2_lastModFile.getName());
			File f_downloadedFormatFile = new File(strLocalReportingDir+"/"+f2_lastModFile.getName());
			File f_modifiedOrderDataFile = new File(strLocalReportingDir+"/"+getFileNameWithoutExtension(f2_lastModFile)+"_UPLOAD"+getFileExtension(f2_lastModFile));

			System.out.println("f_downloadedFormatFile: "+f_downloadedFormatFile.getAbsolutePath());
			rc = copyFileUsingStream(f2_lastModFile, f_downloadedFormatFile);//f_downloadedOrderFormatFile.renameTo(f_modifiedOrderDataFile);
			if (rc)//(f2_lastModFile.renameTo(f_downloadedOrderFormatFile))
			{
				// if file copied successfully then delete the original file
				f2_lastModFile.delete();
				System.out.println("File moved successfully");
				rc = copyFileUsingStream(f_downloadedFormatFile, f_modifiedOrderDataFile);//f_downloadedOrderFormatFile.renameTo(f_modifiedOrderDataFile);
				System.out.println("f_downloadedFormatFile :"+f_downloadedFormatFile);

				String strLinkToReport = "./";//Reporter.strR_CurrentReportsUniqueDir ;//+ "/"+f_downloadedOrderFormatFile.getName();
				System.out.println("Link to report : "+strLinkToReport);
				logMessage("Copy downloaded file", "Should be able to copy downloaded file", "Downloaded file "+f_downloadedFormatFile.getName()+" - <a target = \"_blank\" href = "+URLEncoder.encode(strLinkToReport, "UTF-8")+">Click to download file format from application</a>", "Passed");
			}
			else
			{
				System.out.println("Failed to move the file");
				logMessage("Copy downloaded file", "Should be able to copy downloaded file", "Unable to copy downloaded file", "Failed");
				return false;
			}

			//Read file and verify it contains the columns required for file upload
			HashMap<String,Integer> fileUploadExcel_Columns = new HashMap();//We need to know at what column index do we need to enter what data
			//HashMap <String,String> fileUploadExcel_ColumnIndex_DataType = new HashMap(); // We also need to know which index holds what column datatype


			try 
			{
				InputStream XlsxFileToRead = null;
				HSSFWorkbook workbook = null;
				XlsxFileToRead = new FileInputStream(f_modifiedOrderDataFile.getCanonicalPath());

				//Getting the workbook instance for xlsx file
				workbook = new HSSFWorkbook(XlsxFileToRead);
				HSSFRow excelrow = null;
				HSSFCell cell = null;
				HSSFSheet sheet = workbook.getSheetAt(0); //(strSheetName);

				//Iterating all the rows in the sheet
				Iterator rows = sheet.rowIterator();
				while (rows.hasNext()) {
					excelrow = (HSSFRow) rows.next();
					Iterator cells = excelrow.cellIterator();
					if (excelrow.getRowNum()==2){ //On Third hidden row - Get Column Keys

						//Get All Columns from Second row
						while (cells.hasNext()) {
							//Loop through the columns from Fifth row and fetch back results
							cell = (HSSFCell) cells.next();
							String strValue = "";
							if (cell.getCellType() == XSSFCell.CELL_TYPE_STRING) {
								strValue = cell.getStringCellValue();
							}

							if (strValue.contains("*")){
								strValue = strValue.replaceAll("\\*", "");
							}

							fileUploadExcel_Columns.put(strValue,cell.getColumnIndex());
							//strActualColumns += strValue +",";
						}


						break;// Stop reading the rest of the file
					}

				}
			}
			catch (Exception e) {
				logMessage("Verify file data", "Should be albe to read file data", "Error in Reading and validating file data : "+e.getLocalizedMessage(), "Failed");
				e.printStackTrace();
				return false;
			}


			if (fileUploadExcel_Columns.size() == 0)
			{
				logMessage("Validate number of columns", "Columns should be more than zero", "Columns are zero, failed to validation of excel sheet", "Failed");
				return false;
			}
			else
			{
				logMessage("Validate number of columns", "Columns should be more than zero", "Columns are present in downloaded excel", "Passed");	
			}

			//Loop through pageDataMap and enter values in excel sheet
			System.out.println("fileUploadExcel_Columns: "+fileUploadExcel_Columns);

			//Iterate over excel data and fill in with data present in automation sheet
			System.out.println("pageDataMap : "+pageDataMap);

			for(String strDataMapKey : pageDataMap.keySet())
			{
				//Get current column from datamap
				String strDataValue = pageDataMap.get(strDataMapKey);
				System.out.println("strDataMapKey: "+strDataMapKey+" Value : "+strDataValue);
				int iExcelColumnIndex = -1;
				String strColumnDataType = "";
				//Get Column Index from Datasheet mapped with current column
				for(String excelColumnName : fileUploadExcel_Columns.keySet())
				{
					//System.out.println("Column "+excelColumnName+" on " +fileUploadExcel_Columns.get(excelColumnName));
					if (excelColumnName != null && excelColumnName.startsWith(strDataMapKey))
					{
						//Get the index mapped with the column name
						iExcelColumnIndex = fileUploadExcel_Columns.get(excelColumnName);

						//Get the datatype of Column Name present at that column index - (iExcelColumnIndex)
						System.out.println("Column value in row : "+row.get("vu."+excelColumnName));
						if (row.get("vu."+excelColumnName).contains("DECIMAL")){
							strColumnDataType = "DECIMAL";
						}
						else if (row.get("vu."+excelColumnName).contains("INTEGER")){
							strColumnDataType = "INTEGER";
						}
						else if (row.get("vu."+excelColumnName).contains("DATE")){
							strColumnDataType = "DATE";
						}
						else {
							strColumnDataType = "TEXT";
						}
						//strColumnDataType = fileUploadExcel_ColumnIndex_DataType.get(iExcelColumnIndex);
						System.out.println("strColumnDataType: "+strColumnDataType);
						break;
					}
				}

				if (iExcelColumnIndex < 0)
				{
					logMessage("Get column Index mapped with Column : "+strDataMapKey, "Should be able to get column index present in excel with Column : "+strDataMapKey, "Column Index not found in downloaded excel for Column : "+strDataMapKey, "Failed");
					return false;
				}
				else
				{
					logMessage("Get column Index mapped with Column : "+strDataMapKey, "Should be able to get column index present in excel with Column : "+strDataMapKey, "Column "+strDataMapKey+" found at Index - "+iExcelColumnIndex+" in downloaded excel", "Passed");

					//Update Value for index in excel for that column at row 8 onwards
					int iExcelRow = 7;//Row8
					int iSheetNum = 0;

					rc = writeDataToXLSFile(strDataValue, strColumnDataType, iExcelColumnIndex, iExcelRow, iSheetNum, f_modifiedOrderDataFile);
					Assert.assertTrue(rc);	
				}
			}

			//Run Javascript To Enable hidden element for file upload -- document.getElementById("importExcel").classList.remove("hidden");document.getElementById("importExcel").style.display="block";
			String strJS = "document.getElementById('importExcel').classList.remove('hidden');document.getElementById('importExcel').style.display='block';";
			try 
			{
				((JavascriptExecutor) driver).executeScript(strJS);
			} catch (Exception e) {
				logMessage("Execute Javascript", "Should be able to execute script", "Unable to perform script execution", "Failed");
			}

			//Upload File - Click File upload 
			System.out.println("f_modifiedOrderDataFile: "+f_modifiedOrderDataFile);
			String strFileUploadXPath = "//input[@logi-google-analytics=\"Orders - Upload order excel\"]";//"//*[@id='importExcel']"; // //*[@name='licenseFileUpload']
			rc = sendKeysFile(strFileUploadXPath, f_modifiedOrderDataFile.getAbsolutePath(), "Link - File Upload - <a href='./'>"+f_modifiedOrderDataFile.getName()+"</a>", true);
			Assert.assertTrue(rc);//

			//Wait for file transfer / upload
			TimeUnit.SECONDS.sleep(10);

			//Wait for //*[contains (@class, 'filename')] - to change to our file name  - Loginext_Order_Format_DELIVER_STATE_NONMANDATORY (18)_UPLOAD.xls
			String strFileNameXPath = "//*[contains (@class, 'filename')]";
			String strFileNameUploaded = getElementTextByXPath(strFileNameXPath, "Uploaded File Name Info Label");
			System.out.println("strFileNameUploaded: "+strFileNameUploaded);

			//Get the status of files uploaded
			String strStatusXPath = "//*[@class='message-box']"; // - "//*[@class='message-box']"
			String strFileUploadStatus = getElementTextByXPath(strStatusXPath, "Status Message");

			int iUploadCounter = 0;
			do {
				TimeUnit.SECONDS.sleep(1);
				if (iUploadCounter > 20)
				{
					System.err.println("Error in uploading...");
					break;
				}
				iUploadCounter++;
				strFileUploadStatus = getElementTextByXPath(strStatusXPath, "Status Message");

			}while (strFileUploadStatus != null && strFileUploadStatus.equals("Uploading.."));

			if (strFileUploadStatus == null
					|| strFileUploadStatus.toLowerCase().contains("error") 
					|| strFileUploadStatus.toLowerCase().contains("failed")){
				logMessage("Verify file uploaded", "Should be able to get the file which is uploaded", "Found status message : "+strFileUploadStatus, "Failed");
				return false;
			}
			/*
			String strScreenshot = captureScreenshot(driver);//
			if (strFileNameUploaded.equalsIgnoreCase(f_modifiedOrderDataFile.getName())){
				logMessage("Verify file name uploaded", "Should be able to get the file which is uploaded", "Expected File Uploaded Name : "+f_modifiedOrderDataFile.getName()+" Actual File name found : "+strFileNameUploaded+" screen : <a target='_blank' href="+strScreenshot+">"+"File Uploaded Screen"+"</a>", "Passed");
			}
			else {
				logMessage("Verify file name uploaded", "Should be able to get the file which is uploaded", "Expected File Uploaded Name : "+f_modifiedOrderDataFile.getName()+" Actual File name found : "+strFileNameUploaded, "Failed");
			}*/

			//logMessage("Verify file name uploaded", "Should be able to get the file which is uploaded", "Expected File Uploaded Name : "+f_modifiedOrderDataFile.getName()+" Actual File name found : "+strFileNameUploaded+" screen : <a target='_blank' href="+strScreenshot+">"+"File Uploaded Screen"+"</a>", "Passed");

			//Click Close button on modal - icon-Product-Icons_X
			String strCancelButtonXPath = "//*[@ng-if=\"uploadFilePopupActive\"]//*[contains (@class,'icon-Product-Icons_X')]";//"//a[text()="+app_PageLabels.get("cancel")+"]";
			rc = clickElementByXPath(strCancelButtonXPath, "Cancel Button on File Upload window");
			Assert.assertTrue(rc);

			
			
			/*
			
			//Enter Save Button 
			String strSaveButtonXPath ="//button [@logi-google-analytics='Vehicle Add - Save']"; //"//button[@class='"+app_PageLabels.get("save").getAsString()+"']";
			rc = clickElementByXPath (strSaveButtonXPath, "Save Button");
			Assert.assertTrue(rc);

			//Get text from Prompt Message on success or failiure - //*[@id='js-prompt']
			String strVehicleSuccessMessage = app_PageLabels.get("vehicle.created.success").getAsString();
			System.out.println("strVehicleSuccessMessage: "+strVehicleSuccessMessage);

			//rc = waitForJS_PromptMessage(strVehicleSuccessMessage);

			String strPromptXPath = "//*[@id='js-prompt')]";
			rc = waitForJS_PromptMessageJS(strVehicleSuccessMessage, strPromptXPath);// waitForJS_PromptMessage(strExpectedPromptValue);
			if (rc)
			{
				logMessage("Verify Success Message", "Success Message - Vehicle created successfully should display", "Message : "+strVehicleSuccessMessage+" is displayed", "Passed");
			}
			else
			{
				String strPromptValue = getPromptElementTextByXPath(strPromptXPath, "Prompt");//getElementTextByXPath(strPromptXPath, "Prompt");
				logMessage("Verify Success Message", "Success Message - Vehicle created successfully should display", "Message : '"+strVehicleSuccessMessage+"' is not displayed : Actual : "+strPromptValue, "Failed");
				return false;
			}

			//Get Vehicle List view Columns Structure - https://testing.loginextsolutions.com/LoginApp/framework/structure?modelName=VEHICLE&pageName=VEHICLE&sectionName=VEHICLE_LIST_VIEW 
			JsonObject vehicleListViewStructure = getStructureAPI("VEHICLE", "VEHICLE", "VEHICLE_LIST_VIEW");
			if (vehicleListViewStructure == null)
			{
				logMessage("Get Vehicle List view column structure", "Should be able to get vehicle list view column structure", "Unable to get vehicle list view column structure - "+vehicleListViewStructure, "Failed");
				return false;
			}
			
			String strVehicleColumnLabel = vehicleListViewStructure.has("columns") ? vehicleListViewStructure.get("columns").getAsJsonObject().get("vehicleNumber").getAsJsonObject().get("label").getAsString() : null; 
			System.out.println("strVehicleColumnLabel: "+strVehicleColumnLabel);
			if (strVehicleColumnLabel == null)
			{
				logMessage("Should be able to get label key", "Vehicle No. column label key should be fetched", "Unable to fetch vehicle column key", "Failed");
				return false;
			}
			
			//Wait for Vehicle Search box to appear
			String strVehicleNumberXPath =  "//*[contains (@title, '"+strVehicleColumnLabel+"')]//ancestor::div[@role='columnheader']//input";// "//*[contains (@title, 'Vehicle No.')]//ancestor::div[@role='columnheader']//input";
			rc = clickElementByXPath(strVehicleNumberXPath, "Vehicle Search box");
			Assert.assertTrue(rc);
			
			*/
		}
		catch (Exception e)
		{
			e.printStackTrace();
			logMessage("Verify addition of a vehicle by file upload", "vehicle by file upload should be added", "Unable to add vehicle by file upload", "Failed");
			return false;
		}
		return true;
	}


	public boolean vehicleReportDownload(LinkedHashMap<String, String> row) 
	{
		try 
		{
			//Navigate to vehicle page
			rc = navigateToVehiclePage(row);

			//Get all tmp auth token variables 
			row = getTempData();
			
			//Click Vehicle Menu  
			JsonObject vehicleListViewStructure = getStructureAPI("VEHICLE", "VEHICLE", "VEHICLE_LIST_VIEW");
			if (vehicleListViewStructure == null)
			{
				logMessage("Get Vehicle List view column structure", "Should be able to get vehicle list view column structure", "Unable to get vehicle list view column structure - "+vehicleListViewStructure, "Failed");
				return false;
			}
			
			String strVehicleColumnLabel = vehicleListViewStructure.has("columns") ? vehicleListViewStructure.get("columns").getAsJsonObject().get("vehicleNumber").getAsJsonObject().get("label").getAsString() : null; 
			System.out.println("strVehicleColumnLabel: "+strVehicleColumnLabel);
			if (strVehicleColumnLabel == null)
			{
				logMessage("Should be able to get label key", "Vehicle No. column label key should be fetched", "Unable to fetch vehicle column key", "Failed");
				return false;
			}
			
			//Enter Vehicle Number in Global Search box - //*[contains (@title, "Vehicle No.")]//ancestor::div[@role="columnheader"]//input
			String strVehicleNumberXPath = "//*[contains (@title, '"+strVehicleColumnLabel+"')]//ancestor::div[@role='columnheader']//input";;//"//*[contains (@title, 'Vehicle No.')]//ancestor::div[@role='columnheader']//input";
			rc = clickElementByXPath(strVehicleNumberXPath, "Vehicle Number - Global Search");
			Assert.assertTrue(rc);
			
			TimeUnit.SECONDS.sleep(5);

			//Get Last Modified File - and wait for System to download file
			File f1_lastModFile = lastFileModified(strLocalWebDownloadsDir);
			System.out.println("f1_lastModFile : "+f1_lastModFile.getName());

			//Click Vehicle Report download button - //img[contains (@src,'download.svg')]
			String strVehicleDownloadXPath = "//img[contains (@src,'download.svg')]";
			rc = clickElementByXPath(strVehicleDownloadXPath, "Vehicle Report Download Button");
			Assert.assertTrue(rc);

			//Get Downloaded file from local filesystem
			System.out.println("Waiting for file download to complete...");
			TimeUnit.SECONDS.sleep(5);
			File f2_lastModFile = getDownloadedFile(f1_lastModFile);
			Assert.assertNotNull(f2_lastModFile);

			try {

				//Validate whether the file contains the following columns - vehicleNo,﻿clientBranchName,﻿Capacity (in #@#weight#@#),﻿Capacity (in #@#volume#@#),﻿trackerId,﻿gpsStatus,﻿labelLastTrackingDate,status,﻿labelTripNumber,﻿driver,﻿active,﻿temperature,﻿odometer,﻿direction,﻿fuel,﻿ignition
				String strExcelColumnKeysToValidate [] = { "vehicleNo", "clientBranchName","body", 
						"capacityKgs", "capacityCc","capacityUnits", "speed", 
						"trackerId","gpsStatus", "labelLastTrackingDate","status", 
						"labelTripNumber", "driver", "active","temperature", "odometer", "direction", "fuel", "ignition"};

				String strExcelColumnsToValidate = "";
				mutedReporting = true;
				for (int i = 0; i < strExcelColumnKeysToValidate.length; i++) 
				{
					String strCurrentKey = getLabel_PageLabelAPI(row, strExcelColumnKeysToValidate[i]);
					if (strCurrentKey == null || strCurrentKey.equals("null")){
						strCurrentKey = "";
					}
					strExcelColumnsToValidate += strCurrentKey+",";
				}
				mutedReporting = false;

				System.out.println("strExcelColumnsToValidate: "+strExcelColumnsToValidate);
				String strExcelColumns [] = strExcelColumnsToValidate.split(",");
				if (strExcelColumns.length == 0)
				{
					logMessage("Get Columns to validate", "Should be able to validate columns to validate", "Unable to get total columns present from API Keys", "Failed");
					return false;
				}

				int iSheetNo = 0;
				int iRowNo = 0;
				String strFilePathToRead = f2_lastModFile.getCanonicalPath();
				boolean lowerCaseLetters = true;
				ArrayList<String> strActualColumns = getExcelColumns(iSheetNo, iRowNo, strFilePathToRead, lowerCaseLetters);

				//Validate for all columns present in excel file
				boolean rc = true;
				for (int i = 0; i < strExcelColumns.length; i++)
				{
					String strCurrentColumn = strExcelColumns[i];
					if (strCurrentColumn == null || strCurrentColumn.equals("") || strCurrentColumn.equalsIgnoreCase(" ") || strCurrentColumn.equals("null")){
						continue;
					}
					System.out.println("Current Column : "+strCurrentColumn);


					if (strActualColumns.contains(strCurrentColumn.toLowerCase()) == false)
					{
						logMessage("Validate columns exist in downloaded report", "Column "+strCurrentColumn+" Should be present in excel", strCurrentColumn+" does not exists in excel", "Failed");
						rc = false;
						//return false;
					}
					else
					{
						rc = true;
						logMessage("Validate columns exist in downloaded report", "Column "+strCurrentColumn+" Should be present in excel", strCurrentColumn+" exists in excel", "Passed");	
					}
				}
				System.out.println("rc : "+rc);
				if (rc == false){
					logMessage("Validate Delivery Boy Sheet", "Should be able to validate Delivery Boy sheet", "Unable to validate Delivery Boy sheet", "Failed");
					return false;
				}

			} catch (Exception e) {
				logMessage("Validate Excel", "Should be able to validate excel", "Unable to validate excel document - "+e.getLocalizedMessage(), "Failed");
				e.printStackTrace();
			}
			
			
			return true;
		}
		catch (Exception e) 
		{
			logMessage("Verify Vehicle Report Download", "Should be able to verify report download", "Unable to verify vehicle report download - "+e.getMessage(), "Failed");
			e.printStackTrace();
			return false;
		}
	}
	

	public boolean driverReportDownload (LinkedHashMap<String, String> row) 
	{
		try 
		{
			//Navigate to vehicle page
			rc = navigateToDriverPage (row);

			//Get all tmp auth token variables 
			row = getTempData();
			
			//Click Vehicle Menu  
			JsonObject jsonListViewStructure = getStructureAPI("DRIVER", "DRIVER", "DRIVER_LIST_VIEW");
			if (jsonListViewStructure == null)
			{
				logMessage("Get Driver List view column structure", "Should be able to get Driver list view column structure", "Unable to get Driver list view column structure - "+jsonListViewStructure, "Failed");
				return false;
			}
			
			String strDriverNameColumnLabel = jsonListViewStructure.has("columns") ? jsonListViewStructure.get("columns").getAsJsonObject().get("driverName").getAsJsonObject().get("label").getAsString() : null; 
			System.out.println("strDriverNameColumnLabel: "+strDriverNameColumnLabel);
			if (strDriverNameColumnLabel == null)
			{
				logMessage("Should be able to get label key", "Driver Name - column label key should be fetched", "Unable to fetch Driver Name column key", "Failed");
				return false;
			}
			
			//Enter Vehicle Number in Global Search box - //*[contains (@title, "Vehicle No.")]//ancestor::div[@role="columnheader"]//input
			String strDriverNameXPath = "//*[contains (@title, '"+strDriverNameColumnLabel+"')]//ancestor::div[@role='columnheader']//input";;//"//*[contains (@title, 'Vehicle No.')]//ancestor::div[@role='columnheader']//input";
			rc = clickElementByXPath(strDriverNameXPath, "Driver Name - Global Search");
			Assert.assertTrue(rc);
			
			TimeUnit.SECONDS.sleep(5);

			//Get Last Modified File - and wait for System to download file
			File f1_lastModFile = lastFileModified(strLocalWebDownloadsDir);
			System.out.println("f1_lastModFile : "+f1_lastModFile.getName());

			//Click Vehicle Report download button - //img[contains (@src,'download.svg')]
			String strDownloadReportXPath = "//img[contains (@src,'download.svg')]";
			rc = clickElementByXPath(strDownloadReportXPath, "Driver Report Download Button");
			Assert.assertTrue(rc);

			//Get Downloaded file from local filesystem
			System.out.println("Waiting for file download to complete...");
			TimeUnit.SECONDS.sleep(5);
			File f2_lastModFile = getDownloadedFile(f1_lastModFile);
			Assert.assertNotNull(f2_lastModFile);

			try {

				//Validate whether the file contains the following columns - vehicleNo,﻿clientBranchName,﻿Capacity (in #@#weight#@#),﻿Capacity (in #@#volume#@#),﻿trackerId,﻿gpsStatus,﻿labelLastTrackingDate,status,﻿labelTripNumber,﻿driver,﻿active,﻿temperature,﻿odometer,﻿direction,﻿fuel,﻿ignition
				String strExcelColumnKeysToValidate [] = { "name","clientBranchName","contactNo",
						"workHrs","trackerID","status","lastTracking",
						"tripNo","vehicleNo","attendance","active" };

				String strExcelColumnsToValidate = "";
				mutedReporting = true;
				for (int i = 0; i < strExcelColumnKeysToValidate.length; i++) 
				{
					String strCurrentKey = getLabel_PageLabelAPI(row, strExcelColumnKeysToValidate[i]);
					if (strCurrentKey == null || strCurrentKey.equals("null")){
						strCurrentKey = "";
					}
					strExcelColumnsToValidate += strCurrentKey+",";
				}
				mutedReporting = false;

				System.out.println("strExcelColumnsToValidate: "+strExcelColumnsToValidate);
				String strExcelColumns [] = strExcelColumnsToValidate.split(",");
				if (strExcelColumns.length == 0)
				{
					logMessage("Get Columns to validate", "Should be able to validate columns to validate", "Unable to get total columns present from API Keys", "Failed");
					return false;
				}

				int iSheetNo = 0;
				int iRowNo = 0;
				String strFilePathToRead = f2_lastModFile.getCanonicalPath();
				boolean lowerCaseLetters = true;
				ArrayList<String> strActualColumns = getExcelColumns(iSheetNo, iRowNo, strFilePathToRead, lowerCaseLetters);

				//Validate for all columns present in excel file
				boolean rc = true;
				for (int i = 0; i < strExcelColumns.length; i++)
				{
					String strCurrentColumn = strExcelColumns[i];
					if (strCurrentColumn == null || strCurrentColumn.equals("") || strCurrentColumn.equalsIgnoreCase(" ") || strCurrentColumn.equals("null")){
						continue;
					}
					System.out.println("Current Column : "+strCurrentColumn);


					if (strActualColumns.contains(strCurrentColumn.toLowerCase()) == false)
					{
						logMessage("Validate columns exist in downloaded report", "Column "+strCurrentColumn+" Should be present in excel", strCurrentColumn+" does not exists in excel", "Failed");
						rc = false;
						//return false;
					}
					else
					{
						rc = true;
						logMessage("Validate columns exist in downloaded report", "Column "+strCurrentColumn+" Should be present in excel", strCurrentColumn+" exists in excel", "Passed");	
					}
				}
				System.out.println("rc : "+rc);
				if (rc == false){
					logMessage("Validate Delivery Boy Sheet", "Should be able to validate Delivery Boy sheet", "Unable to validate Delivery Boy sheet", "Failed");
					return false;
				}

			} catch (Exception e) {
				logMessage("Validate Excel", "Should be able to validate excel", "Unable to validate excel document - "+e.getLocalizedMessage(), "Failed");
				e.printStackTrace();
			}
			
			
			return true;
		}
		catch (Exception e) 
		{
			logMessage("Verify Report Download", "Should be able to verify report download", "Unable to verify report download - "+e.getMessage(), "Failed");
			e.printStackTrace();
			return false;
		}
	}

	
	
	
	/***************** Haul ****************************/
	
	
	
	/************** API Tests (Customer facing webhooks) used in automation for Data Generation *****************/



	/**
	 * Will call authenticate API and put results back in below keys 
	 * token_clientAPI - BASIC 5c513ea7-69c5-4762-8aa3-8a238524a491
	 * clientSecretKey_clientAPI - $2a$08$OkzTcdFSFt6jwGKCWUFDYud84WB2wzcgIoF6oP4bxbQyStCz35EqG
	 */
	public boolean authenticate_ClientAPI ()
	{
		String strLog_RequestBody = "";
		String strlog_ResposnseBody = "";
		String strlog_APIUrl = "";
		
		try
		{
			LinkedHashMap<String, String> row = getTempData();

			//Get URL Parameter
			String strAuthURL = row.get("URL") + // demo.loginextsolutions.com/
					"LoginApp/login/authenticate";
			strlog_APIUrl = strAuthURL;
			//"https://demo.loginextsolutions.com/LoginApp/login/auth";
			String strUser = row.get("UserName");
			String strPassword = row.get("Password");
			String strAuthRequestBody = "{\"userName\":\""+strUser+"\",\"password\":\""+strPassword+"\"}";
			System.out.println("Getting strAuthURL : "+strAuthURL+" : BODY :"+strAuthRequestBody);
			strLog_RequestBody = strAuthRequestBody;
			Response responseAuthenticate = given()
					.contentType(ContentType.JSON)
					.body(strAuthRequestBody)
					.post(strAuthURL);
			String strResponseBody = responseAuthenticate.getBody().asString();
			strlog_ResposnseBody = strResponseBody;
			Headers hdrResponseHeaders = responseAuthenticate.headers();
			System.out.println("strResponseBody : "+strResponseBody);
			JsonParser parser = new JsonParser();
			JsonElement responseBodyAsJson = parser.parse(strResponseBody);
			int iResponseStatus = responseBodyAsJson.getAsJsonObject().has("status") ? responseBodyAsJson.getAsJsonObject().get("status").getAsInt() : 0; 
			System.out.println("Client API Auth iResponseStatus: "+iResponseStatus);
			if (iResponseStatus != 200){
				logMessage("Fetch Response Status", "Response Status should be fetched", "Response status is : "+iResponseStatus+", Expecting 200;<br/>Response from Client API : "+responseBodyAsJson, "Failed"); 
				return false;
			}

			String strClientSecretKey = hdrResponseHeaders.getValue("CLIENT_SECRET_KEY").toString();
			String strAuthReponseToken = hdrResponseHeaders.getValue("WWW-Authenticate").toString();
			System.out.println("strClientSecretKey : " +strClientSecretKey);
			System.out.println("strAuthReponseToken : " +strAuthReponseToken);

			//Adding auth details to LinkedHashMap
			row.put("token_clientAPI", strAuthReponseToken);
			row.put("clientSecretKey_clientAPI", strClientSecretKey);
			updateTempData(row);
			logMessage("Authenticate User - Client API", "Should be able to authenticate", "Successfully Authenticated user", "Passed");
			return true;
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			strLog_RequestBody = toPrettyFormat (strLog_RequestBody);
			strlog_ResposnseBody = toPrettyFormat (strlog_ResposnseBody);
			
			if (iTimesAPI_RecoveryPerformed < iMaxAPI_RecoveryAllowed)
			{
				iTimesAPI_RecoveryPerformed++;
				waitForRandomSec(1);
				logMessage("Re-Execute API Call", "Application Request - Should be able to re-execute API Call die to "+e.getMessage(), "Request : URL : "+strlog_APIUrl+" <br/><br/>Request Bodoy : <br/><br/>"+strLog_RequestBody +" <br/><br/>Response Body <br/><br/> : "+strlog_ResposnseBody, "Passed");
				rc = authenticate_ClientAPI();
				if (rc == true)
				{
					System.out.println("Successfully fetched results..");
					return true;
				}
			}
			
			logMessage("Authenticate Client API", "Should be able to authenticate Client API", "Unable to validate client API, Error : "+e.getStackTrace(), "Failed");
			strLog_RequestBody = toPrettyFormat (strLog_RequestBody);
			strlog_ResposnseBody = toPrettyFormat (strlog_ResposnseBody);
			logMessage("Request", "Application Request", "Request : URL : "+strlog_APIUrl+" <br/><br/>Request Bodoy : <br/><br/>"+strLog_RequestBody +" <br/><br/>Response Body <br/><br/> : "+strlog_ResposnseBody, "Failed");
			return false;
		}
	}


	/**
	 * Add order Cient API 
	 */

	/**
	 * Will call authenticate API and put results back in below keys 
	 * token_clientAPI - BASIC 5c513ea7-69c5-4762-8aa3-8a238524a491
	 * clientSecretKey_clientAPI - $2a$08$OkzTcdFSFt6jwGKCWUFDYud84WB2wzcgIoF6oP4bxbQyStCz35EqG
	 */
	
	String strLastAddedOrder = "";
	public JsonObject addOrder_ClientAPI ()
	{
		String strLog_ApiURL = "";
		String strLog_RequestBody = "";
		String strLog_ResponseBody = "";
		try
		{
			LinkedHashMap<String, String> row = getTempData();

			//Get URL Parameter
			String strURL = row.get("URL") + // demo.loginextsolutions.com/
					"ShipmentApp/mile/v1/create";
			strLog_ApiURL = strURL;
			String strPageName = "OrderAPI_Page";//"Vehicle_Page";//"Orders_Page";
			LinkedHashMap <String, String> pageDataMap = getPageObjects(row, strPageName); // ReadExcel2.readSortedTestDataMap(strSheetName, strPageName);

			//Set Date Format - yyyy-MM-ddT23:30:00.000Z
			applicationTimeFormat = "'T'HH:mm:ss"+".000'Z'";
			row.put("DATEFORMAT", "yyyy-MM-dd");
			addSpacesBetweenDateAndTime = false;
			updateTempData(row);

			//Perform substitution of keywords or functions like AUTOGEN / DATE / BOOLEAN / INTEGER / DECIMAL etc from DataSheet with actual values,
			pageDataMap = substituteDataMapKeywords (pageDataMap);
			System.out.println("pageDataMap: "+pageDataMap);
			pageDataMap = removeDotReferences(pageDataMap);
			System.out.println("pageDataMap: "+pageDataMap);

			String strRequestBody = "["
					+ " {"
					+ " \"orderNo\": \""+pageDataMap.get("orderNo")+"\","
					+ " \"awbNumber\": \""+pageDataMap.get("awbNumber")+"\","
					+ " \"shipmentOrderTypeCd\": \""+pageDataMap.get("shipmentOrderTypeCd")+"\","
					+ " \"orderState\": \""+pageDataMap.get("orderState")+"\", "
					+ " \"shipmentOrderDt\": \""+pageDataMap.get("shipmentOrderDt")+"\","
					+ " \"distributionCenter\": \""+pageDataMap.get("distributionCenter")+"\","
					+ " \"paymentType\": \""+pageDataMap.get("paymentType")+"\", "
					+ " \"numberOfItems\": \""+pageDataMap.get("numberOfItems")+"\", "
					+ " \"partialDeliveryAllowedFl\": \""+pageDataMap.get("partialDeliveryAllowedFl")+"\","
					+ " \"returnAllowedFl\": \""+pageDataMap.get("returnAllowedFl")+"\","
					+ " \"cancellationAllowedFl\": \""+pageDataMap.get("cancellationAllowedFl")+"\","
					+ " \"deliverBranch\": \""+pageDataMap.get("deliverBranch")+"\","
					+ " \"deliverServiceTime\": \""+pageDataMap.get("deliverServiceTime")+"\", "
					+ " \"deliverStartTimeWindow\":\""+pageDataMap.get("deliverStartTimeWindow")+"\", "
					+ " \"deliverEndTimeWindow\":\""+pageDataMap.get("deliverEndTimeWindow")+"\", "
					+ " \"deliverAccountCode\": \""+pageDataMap.get("deliverAccountCode")+"\", "
					+ " \"deliverAccountName\": \""+pageDataMap.get("deliverAccountName")+"\", "
					+ " \"deliverApartment\": \""+pageDataMap.get("deliverApartment")+"\", "
					+ " \"deliverStreetName\": \""+pageDataMap.get("deliverStreetName")+"\", "
					+ " \"deliverLocality\": \""+pageDataMap.get("deliverLocality")+"\", "
					+ " \"deliverPhoneNumber\":\""+pageDataMap.get("deliverPhoneNumber")+"\","
					+ " \"deliverCity\": \""+pageDataMap.get("deliverCity")+"\", "
					+ " \"deliverState\": \""+pageDataMap.get("deliverState")+"\", "
					+ " \"deliverCountry\": \""+pageDataMap.get("deliverCountry")+"\", "
					+ " \"deliverPinCode\": \""+pageDataMap.get("deliverPinCode")+"\", "
					+ " \"deliverLatitude\":\""+pageDataMap.get("deliverLatitude")+"\","
					+ " \"deliverLongitude\":\""+pageDataMap.get("deliverLongitude")+"\", "
					+ " \"returnBranch\": \""+pageDataMap.get("returnBranch")+"\" "
					+ " } "
					+ "]";
			strLog_RequestBody = strRequestBody;
			System.out.println("Getting strURL : "+strURL+" : BODY :"+strRequestBody);
			System.out.println("clientSecretKey_clientAPI : "+row.get("clientSecretKey_clientAPI"));
			System.out.println("www-authenticate : " + row.get("token_clientAPI"));

			Response responseAuthenticate = given()
					.when()
					.headers(
							"client_secret_key", row.get("clientSecretKey_clientAPI"), // $2a$08$OkzTcdFSFt6jwGKCWUFDYud84WB2wzcgIoF6oP4bxbQyStCz35EqG
							"www-authenticate", row.get("token_clientAPI"), //BASIC 5c513ea7-69c5-4762-8aa3-8a238524a491
							"Content-Type","application/json")
					.contentType(ContentType.JSON)
					.body(strRequestBody)
					.post(strURL);
			String strResponseBody = responseAuthenticate.getBody().asString();
			strLog_ResponseBody = strResponseBody; 
			Headers hdrResponseHeaders = responseAuthenticate.getHeaders();
			System.out.println("strResponseBody : "+strResponseBody);
			JsonParser parser = new JsonParser();
			JsonElement responseBodyAsJson = parser.parse(strResponseBody);
			int iResponseStatus = responseBodyAsJson.getAsJsonObject().has("status") ? responseBodyAsJson.getAsJsonObject().get("status").getAsInt() : 0; 
			System.out.println("API iResponseStatus: "+iResponseStatus);
			
			if (iResponseStatus == 429){
				System.out.println("Error status code is 429 - Possible reasons due to parallel mode on...");
				throw new Exception();
			}
			
			if (iResponseStatus != 200){
				logMessage("Fetch Response Status", "Response Status should be fetched", "Response status is : "+iResponseStatus+", Expecting 200;<br/>"+strURL+";<br/><br/>RequestBody : "+toPrettyFormat(strRequestBody)+"<br/>;<br/>Response from Client API : "+toPrettyFormat(responseBodyAsJson.toString()), "Failed"); 
				return null;
			}

			strLastAddedOrder = pageDataMap.get("orderNo");

			row.put("OrderNumber", strLastAddedOrder);
			logMessage("Fetch Response Status", "Response Status should be fetched", "Response status is : "+iResponseStatus+", Expecting 200;<br/>"+strURL+";<br/><br/>RequestBody : "+toPrettyFormat(strRequestBody)+"<br/>;<br/>Response from Client API : "+toPrettyFormat(responseBodyAsJson.toString()), "Passed"); 

			logMessage("Add order - Client API", "Should be able to create order using Client API", "Successfully created order "+strLastAddedOrder+"- using client API", "Passed");
			return responseBodyAsJson.getAsJsonObject();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			//Error When a Status code of 429 is encountered in Production - do not hit requests in Parallel - wait for some random amount of time and re-execute
			if (iTimesAPI_RecoveryPerformed < iMaxAPI_RecoveryAllowed)
			{
				iTimesAPI_RecoveryPerformed++;
				waitForRandomSec(1);
				logMessage("Re-Execute API Call", "Application Request - Should be able to re-execute API Call die to "+e.getMessage(), "Request : URL : "+strLog_ApiURL+" <br/><br/>Request Bodoy : <br/><br/>"+strLog_RequestBody +" <br/><br/>Response Body <br/><br/> : "+strLog_ResponseBody, "Passed");
				JsonObject obj = addOrder_ClientAPI();
				if (strLastAddedOrder != null && strLastAddedOrder.equals("") == false)
				{
					System.out.println("Successfully added order...");
					return obj;
				}
			}
			
			logMessage("Add order - Client API", "Should be able to create order using Client API", "Unable to create order using client API, Error Reason : "+e.getMessage(), "Failed");
			strLog_RequestBody = toPrettyFormat (strLog_RequestBody);
			strLog_ResponseBody = toPrettyFormat (strLog_ResponseBody);
			logMessage("Request", "Application Request", "Request : URL : "+strLog_ApiURL+" <br/><br/>Request Bodoy : <br/><br/>"+strLog_RequestBody +" <br/><br/>Response Body <br/><br/> : "+strLog_ResponseBody, "Failed");
			return null;
		}
	}

	/**
	 * Convert a JSON string to pretty print version
	 * @param jsonString
	 * @return
	 */
	public static String toPrettyFormat(String jsonString) 
	{
		try 
		{

			JsonParser parser = new JsonParser();
			String return_prettyJson = jsonString;
			try {
				JsonObject json = parser.parse(jsonString).getAsJsonObject();
				Gson gson = new GsonBuilder().setPrettyPrinting().create();
				String prettyJson = gson.toJson(json);
				return_prettyJson = prettyJson; 
			}
			catch (Exception e) 
			{
				//e.printStackTrace();
				System.err.println("Unable to parse to Json trying to parse as Json Array...");
				
				try 
				{
					JsonArray json = parser.parse(jsonString).getAsJsonArray();
					Gson gson = new GsonBuilder().setPrettyPrinting().create();
					String prettyJson = gson.toJson(json);
					return_prettyJson = prettyJson;	
				}
				catch (Exception e2) 
				{
					System.err.println("Unable to parse json data - returning as plain text...");
					e.printStackTrace();
					return_prettyJson = jsonString;
				}
			}
			return return_prettyJson;
			
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("Unable to format Json String...");
			return null;
		}
	}

	public boolean addOrderByClientAPI(LinkedHashMap<String, String> row) {
		try 
		{
			updateTempData(row);
			rc = authenticate_ClientAPI();
			Assert.assertTrue(rc);

			JsonObject orderResponse = addOrder_ClientAPI();
			String strOrderCreationReferenceID = orderResponse != null && orderResponse.has("referenceId") ? orderResponse.get("referenceId").getAsJsonArray().get(0).getAsString() : "ERROR"; 
			Assert.assertNotEquals(strOrderCreationReferenceID, "ERROR");
			System.out.println("strOrderCreationReferenceID: "+strOrderCreationReferenceID);
			System.out.println("strLastAddedOrder: "+strLastAddedOrder);

			return true;
		}
		catch (Exception e) 
		{
			logMessage("Create an order using Client API","Should be able to create order", "Unable to create an order Error : "+e.getLocalizedMessage(), "Failed");
			e.printStackTrace();
			return false;
		}
	}


	/************** API Tests (Customer facing webhooks) used in automation for Data Generation *****************/

	/*************** Loginext Global Signup Screen **********************/
	
	public boolean verifyLoginextSignup (LinkedHashMap<String, String> row) {
		try 
		{
			//Close all browser session 
			System.out.println("Exiting out remote browsers and launching local instances with Chrome Extension preloaded...");
			close();
			
			
			//Set Chrome Extension
            ChromeOptions options = new ChromeOptions ();
            options.addExtensions (new File("plugins_BrowsecVPN_CRX_ChromeExtension/3.19.6_0.crx"));
            //options.addExtensions (new File("/dev/shm/ChromeExtensions/3.19.6_0.crx"));
            
            //DesiredCapabilities capabilities = new DesiredCapabilities ();
            //capabilities.setCapability(ChromeOptions.CAPABILITY, options);

            //Set Chrome Browser
            System.setProperty("webdriver.chrome.driver", "chromedriver");

            //In Case of CI - launch local browser in that system
			if (System.getProperty("user.name").toLowerCase().contains("jenkins")){
				System.out.println("Setting linux chromedriver...");
				System.setProperty("webdriver.chrome.driver", "chromedriver_linux_2_38");
			}

            ChromeDriver driver = new ChromeDriver(options);
            //DesiredCapabilities capability = DesiredCapabilities.chrome();
            //WebDriver driver = new RemoteWebDriver(new URL("http://10.124.92.40:4444/wd/hub"), capability);
            
            this.driver = driver;
            driver.manage().window().setSize(new org.openqa.selenium.Dimension(1280, 1080));//(new Dimension(1280, 920));            
			//Spoof IP by Installing Browsec - Will be added in Chrome Options at time of Driver Configuration
			activateIPSpoof();
			
			rc = launchApplication(row);
			Assert.assertTrue(rc);
			
			//Close Second Tab
		    ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		    if (tabs2.size() >=1)
		    {
		    	driver.switchTo().window(tabs2.get(1));
			    driver.close();
			    driver.switchTo().window(tabs2.get(0));
		    }
		    
			//Get URL Parameter
			String strSignUpforFreeXPath = "//a[text()='SIGNUP FOR FREE']";
			rc = clickElementByXPath_NoRecovery (strSignUpforFreeXPath, "Sign Up - Free button");
			Assert.assertTrue(rc);//
			
			//Wait for animation to slide from Right
			TimeUnit.SECONDS.sleep(5);
			//
			//Click Mile Trial Link - //*[@onclick="freesignup('TRIAL')"] 
			String strSignUpButton = "(//a[text()='Start Free Trial'])[1]";//"//*[@onclick=\"freesignup('TRIAL')\"]";
			rc = clickElementByXPath_UsingActions_NoRecovery(driver, strSignUpButton, "Sign Up Button");
			Assert.assertTrue(rc);//
			
			//Enter Name - //*[@id="name"]
			String strName = "//*[@id=\"name\"]";
			rc = sendKeys_NoRecovery(strName, "AutoUser_LoginextTestAutomation","Name", true);
			Assert.assertTrue(rc);
			
			//Enter Company Name - //*[@id="companyname"]
			String strCompanyName = "//*[@id=\"companyname\"]";
			rc = sendKeys_NoRecovery(strCompanyName, "Loginext Internal "+(System.currentTimeMillis() / 2) , "Company Name", true);
			Assert.assertTrue(rc);
			
			//Enter User Email - //*[@id='useremail'] 
			String strUserName = "//*[@id='useremail']";
			rc = sendKeys_NoRecovery(strUserName, "test"+(System.currentTimeMillis() / 2) +"@mailinator.com" , "User Email", true);
			Assert.assertTrue(rc);
			
			//Enter Phone Number - //*[@id="number"]
			String strPhoneNumber = "//*[@id=\"number\"]";
			rc = sendKeys_NoRecovery(strPhoneNumber, "8454025432" ,"Phone Number", true);
					//"2025550191", "Phone Number", true);
			Assert.assertTrue(rc);
			
			//Select - Country - //*[@id="industry"] - Select
			String strCountry = "//*[@id=\"industry\"]";
			Select selectPageDropDown = new Select (driver.findElement(By.xpath(strCountry)));
			selectPageDropDown.selectByIndex(1);

			//Select Designation - //*[@id="designation"] -  
			String strElementXPath = "//*[@id=\"designation\"]";
			rc = sendKeys_NoRecovery(strElementXPath, "QA Automation", "Designation", true);
			Assert.assertTrue(rc);
			
			//Select No of Emp - id="employeecount"- Select - 500-1000 Employees
			strElementXPath = "//*[@id=\"employeecount\"]";
			selectPageDropDown =new Select (driver.findElement(By.xpath(strElementXPath)));
			selectPageDropDown.selectByIndex(1);
			
			//Select Password - id="password" - Text field
			/*strElementXPath = "//*[@id=\"password\"]";
			rc = sendKeys_NoRecovery(strElementXPath, "TestAutomation!123", "Password", true);
			Assert.assertTrue(rc);*/
			
			//Agree checkbox 
			String strCheckboxXPath = "//*[@name=\"agree\"]";
			rc = clickCheckboxByXPath_NoRecovery(driver, strCheckboxXPath, "Agree checkbox", true);
			Assert.assertTrue(rc);
			
			//Click Sign Up Button - //*[@id="signup-submit"]
			String strSignUpFormButton = "//*[@id=\"signup-submit\"]";
			rc = clickElementByXPath_NoRecovery (strSignUpFormButton, "Sign Up - Submit button");
			Assert.assertTrue(rc);//
			
			//Wait for Thank You message - //*[text()='THANK YOU!']
			String strThankyouMessage = "//*[@id=\"thankYouText\"]";//"//*[text()='THANK YOU!']";
			//rc = scrollIntoElementByXPath_NoRecovery(strThankyouMessage, "Thank you Message");
			//Assert.assertTrue(rc);
			
			rc = verifyElementIsVisible_DynamicWaits(strThankyouMessage, "Success message");
			//rc = clickElementByXPath_NoRecovery (strThankyouMessage, "Thank you message");
			Assert.assertTrue(rc);

			captureScreenshot(driver);
			String strScreenshot = captureScreenshot(driver);//
			logMessage("Verify success screen", "Should be able to get success screen", "Printing SAAS Signup success screen : <a target='_blank' href="+strScreenshot+">"+"Loginext Signup Screen"+"</a>", "Passed");

			//Optional - Click Force Trial - freesignup('FORCETRIAL')
			
			//Optional - Click OnDemand  - freesignup('FORCETRIAL') 
			
			
			return true;	
		}
		catch (Exception e)
		{
			e.printStackTrace();
			logMessage("Verify Loginext Global Signup", "Should be able to verify Loginext SaaS Signup page", "Unable to verify Loginext Saas Signup Page error : "+e.getMessage(), "Failed");
			return false;
		}
		
	}
	
	
	
	public boolean activateIPSpoof ()
	{
		try 
		{
			String strAppURL =  "chrome-extension://omghfjlpggmjjaagoclmmobgdodcjboh/popup/popup.html";//"http://localhost:9001/";
			System.out.println("Launching App - IP Spoofer - Browsec");
			driver.get(strAppURL);
			logMessage("Launch Browsec", "Should be able to launch Browsec - for IP Spoofing", "Successfully Launched Browsec - for IP Spoofing : URL : "+strAppURL, "Passed");
			
			//TimeUnit.SECONDS.sleep(3);
			
			//Click ON Nutton - //*[@class='BackgroundText_On style-scope c-switch']
			String strOnSwitch = "//*[@class='Inactive_Button style-scope index-home']";//"//*[@class='Circle style-scope c-switch']";//"//*[@class='BackgroundText_On style-scope c-switch']";
			System.out.println("Protect Me Button : "+getElementTextByXPath(strOnSwitch, "Protext Me Button"));//rc = clickElementByXPath(strOnSwitch, "Browsec - On Button");
			rc = clickElementByXPath_NoRecovery (strOnSwitch, "Browsec - On Button");
			Assert.assertTrue(rc);//
			
			//Click On Button - //*[@class='Circle style-scope c-switch']
			String strOnButton = "//*[@class='Circle style-scope c-switch']";
			//clickElementByXPath_NoRecovery(strOnButton, "On button");
			return true;
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			logMessage("Spoof IP", "Should be able to Spoof IP Address by Browsec", "Unable to Spoof IP Address in Browsec "+e.getMessage(), "Failed");
			return false;
		}
	}

	public boolean addDriverTest(LinkedHashMap<String, String> row) {
		try 
		{
			
			//Navigate to drivers page
			rc = navigateToDriverPage (row);//

			//Get all tmp auth token variables 
			row = getTempData();
			
			TimeUnit.SECONDS.sleep(5);
			
			//Click Add Button - //*[contains (@class,'icon-add')]
			String strLabelAdd = getLabel_PageLabelAPI(row, "add");
			String strXPath = "//span[text()='"+strLabelAdd+"']";// "//*[contains (@class,'icon-add')]"; //"//*[contains (@class,'icon-add')]" ; //"//*[@class='logi-icon icon-Product-Icons_Add']";//"//*[contains (@class,'icon-add')]";////*[text()='Resource']";
			rc = clickElementByXPath(strXPath, "Add Button");
			Assert.assertTrue(rc);

			//Get page structure for drivers - https://products.loginextsolutions.com/LoginApp/framework/structure?modelName=DRIVER&pageName=DRIVER&sectionName=ADD_DRIVER_FORM
			String strPageStructureRequestURL = "LoginApp/framework/structure?modelName=DRIVER&pageName=DRIVER&sectionName=ADD_DRIVER_FORM";
			JsonElement pageStructure = getOrderPageStructure(row, row.get("URL")+strPageStructureRequestURL);//"LoginApp/framework/structure?modelName=ORDERS&pageName=ORDERS&sectionName=ADD_ORDER_FORM");
			if (pageStructure == null || pageStructure.getAsJsonObject().size() == 0){
				return false;
			}
			String strOrdersPageStructure = pageStructure.toString();
			System.out.println("strOrdersPageStructure: "+strOrdersPageStructure);

			//Fetch Order Page Specific TestData
			//String strSheetName = "DataMap";
			String strPageName = "Driver_Page";//"Orders_Page";
			LinkedHashMap <String, String> pageDataMap = getPageObjects(row, strPageName); // ReadExcel2.readSortedTestDataMap(strSheetName, strPageName);
			System.out.println("pageDataMap: "+pageDataMap);
			
			pageDataMap = removeDotReferences(pageDataMap);
			System.out.println("pageDataMap: "+pageDataMap);
			
			//Perform substitution of keywords or functions like AUTOGEN / DATE / BOOLEAN / INTEGER / DECIMAL etc from DataSheet with actual values,
			updateTempData(row);
			pageDataMap = substituteDataMapKeywords (pageDataMap);
			System.out.println("pageDataMap: "+pageDataMap);

			//On Success put some entries in hashMap
			String strDriverName = pageDataMap.get("driverName");
			System.out.println("driverName: "+strDriverName);
			
			//Enter Data on orders page//
			rc = enterValues (pageDataMap, strOrdersPageStructure);
			Assert.assertTrue(rc);

			//On Success put some entries in hashMap
			//TimeUnit.SECONDS.sleep(1);

			//Enter Save Button 
			String strSaveButtonXPath = "//ul[@class='logiFormActionButtons']//*[@class=\"logi-icon icon-Product-Icons_Save\"]";//"//button [@logi-google-analytics='Vehicle Add - Save']"; //"//button[@class='"+app_PageLabels.get("save").getAsString()+"']";
			rc = clickElementByXPath (strSaveButtonXPath, "Save Button");
			Assert.assertTrue(rc);

			//Get text from Prompt Message on success or failiure - //*[@id='js-prompt']
			String strSuccessMessage = getLabel_PageLabelAPI(row, "driver.created.success");//app_PageLabels.get("driver.created.success").getAsString();
			System.out.println("strSuccessMessage: "+strSuccessMessage);

			//rc = waitForJS_PromptMessage(strVehicleSuccessMessage);
			String strPromptXPath = "//*[@id='js-prompt')]";
			rc = waitForJS_PromptMessageJS(strSuccessMessage, strPromptXPath);// waitForJS_PromptMessage(strExpectedPromptValue);
			if (rc)
			{
				logMessage("Verify Success Message", "Success Message - Driver created successfully should display", "Message : "+strSuccessMessage+" is displayed", "Passed");
			}
			else
			{
				String strPromptValue = getPromptElementTextByXPath(strPromptXPath, "Prompt");//getElementTextByXPath(strPromptXPath, "Prompt");
				logMessage("Verify Success Message", "Success Message - Driver created successfully should display", "Message : '"+strSuccessMessage+"' is not displayed : Actual : "+strPromptValue, "Failed");
				return false;
			}
			/*
			//Get Vehicle List view Columns Structure - https://testing.loginextsolutions.com/LoginApp/framework/structure?modelName=VEHICLE&pageName=VEHICLE&sectionName=VEHICLE_LIST_VIEW 
			JsonObject vehicleListViewStructure = getStructureAPI("VEHICLE", "VEHICLE", "VEHICLE_LIST_VIEW");
			if (vehicleListViewStructure == null)
			{
				logMessage("Get Vehicle List view column structure", "Should be able to get vehicle list view column structure", "Unable to get vehicle list view column structure - "+vehicleListViewStructure, "Failed");
				return false;
			}
			
			String strVehicleColumnLabel = vehicleListViewStructure.has("columns") ? vehicleListViewStructure.get("columns").getAsJsonObject().get("vehicleNumber").getAsJsonObject().get("label").getAsString() : null; 
			System.out.println("strVehicleColumnLabel: "+strVehicleColumnLabel);
			if (strVehicleColumnLabel == null)
			{
				logMessage("Should be able to get label key", "Vehicle No. column label key should be fetched", "Unable to fetch vehicle column key", "Failed");
				return false;
			}
			
			//Wait for Vehicle Search box to appear
			String strVehicleNumberXPath =  "//*[contains (@title, '"+strVehicleColumnLabel+"')]//ancestor::div[@role='columnheader']//input";// "//*[contains (@title, 'Vehicle No.')]//ancestor::div[@role='columnheader']//input";
			rc = clickElementByXPath(strVehicleNumberXPath, "Vehicle Search box");
			Assert.assertTrue(rc);*/
		}
		catch (Exception e)
		{
			e.printStackTrace();
			logMessage("Verify addition of a driver", "Driver should be added", "Unable to add Driver - "+e.getMessage(), "Failed");
			return false;
		}
		return true;
	
	}

	public boolean deleteDriver(LinkedHashMap<String, String> row) {
		//TODO
		return false;
	}
	
	//
	public boolean createReoute (LinkedHashMap<String, String> row)
	{
		try 
		{
			
			//Navigate to Route Planning page
			rc = navigateToRoutePlanningPage(row);
			Assert.assertTrue(rc);
			
			updateTempData(row);
			
			//Click Add Button - //*[contains (@class,'icon-add')]
			String strLabelAdd = getLabel_PageLabelAPI(row, "add");
			String strXPath = "//span[text()='"+strLabelAdd+"']";// "//*[contains (@class,'icon-add')]"; //"//*[contains (@class,'icon-add')]" ; //"//*[@class='logi-icon icon-Product-Icons_Add']";//"//*[contains (@class,'icon-add')]";////*[text()='Resource']";
			rc = clickElementByXPath(strXPath, "Add Button");
			Assert.assertTrue(rc);
			
			//Get Orgin - https://products.loginextsolutions.com/LookupApp/lookup/origins - [{"clientBranchId":5095,"origin":"LineHualHub","latitude":19.1253,"longitude":72.9077},{"clientBranchId":5144,"origin":"Ahmedabad","latitude":23.028499,"longitude":72.576983},{"clientBranchId":5145,"origin":"Mumbai","latitude":19.075709,"longitude":72.882564},{"clientBranchId":5146,"origin":"Bangalore","latitude":14.86693,"longitude":75.597176},{"clientBranchId":5149,"origin":"Pune","latitude":18.520658,"longitude":73.856088},{"clientBranchId":5157,"origin":"Kolkata","latitude":22.577876,"longitude":88.368536},{"clientBranchId":5355,"origin":"Surat","latitude":21.205234,"longitude":72.840829},{"clientBranchId":15637,"origin":"Gurgaon","latitude":28.4731475,"longitude":77.0897112},{"clientBranchId":21086,"origin":"test-007","latitude":28.471731,"longitude":77.101921},{"clientBranchId":22957,"origin":"Test R1","latitude":28.543923,"longitude":77.408901},{"clientBranchId":22958,"origin":"Test R2","latitude":28.463064,"longitude":77.494187},{"clientBranchId":23258,"origin":"novire Branch","latitude":18.9992909,"longitude":72.83997870000002},{"clientBranchId":23894,"origin":"Double tree","latitude":28.422385,"longitude":77.104255},{"clientBranchId":23895,"origin":"hotel Neelam","latitude":26.920475,"longitude":75.798984},{"clientBranchId":49197,"origin":"Central India","latitude":122.0,"longitude":232.0},{"clientBranchId":49198,"origin":"South India","latitude":121.0,"longitude":123.0},{"clientBranchId":49199,"origin":"North India","latitude":8923.0,"longitude":34.0},{"clientBranchId":49201,"origin":"East India","latitude":834.0,"longitude":934.0},{"clientBranchId":49202,"origin":"West India","latitude":897435.0,"longitude":89345.0},{"clientBranchId":49208,"origin":"Jaipur","latitude":98347.0,"longitude":89345.0},{"clientBranchId":49210,"origin":"Jodhpur","latitude":8349.0,"longitude":734.0},{"clientBranchId":49211,"origin":"Ajmer","latitude":98734.0,"longitude":9854.0},{"clientBranchId":49212,"origin":"Alwar","latitude":9843.0,"longitude":9834.0},{"clientBranchId":49213,"origin":"Bhiwadi","latitude":8743.0,"longitude":3984.0},{"clientBranchId":49215,"origin":"Kota","latitude":8374.0,"longitude":859.0},{"clientBranchId":49219,"origin":"All","latitude":7834.0,"longitude":9834.0},{"clientBranchId":50012,"origin":"Test_4444","latitude":19.721,"longitude":72.34},{"clientBranchId":63665,"origin":"Supreme Business Park - Powai","latitude":19.111356,"longitude":72.908394},{"clientBranchId":63666,"origin":"D-Mart Kanjurmarg","latitude":19.12945,"longitude":72.926386},{"clientBranchId":63667,"origin":"Gurgaon 01","latitude":28.460594,"longitude":77.078251},{"clientBranchId":67592,"origin":"Covington, LA","latitude":30.4754702,"longitude":-90.10091080000001},{"clientBranchId":67593,"origin":"La Grange, KY","latitude":41.8050314,"longitude":-87.8692254},{"clientBranchId":67594,"origin":"Chicago, IL","latitude":41.8781136,"longitude":-87.62979819999998}]
			String strLookupName = "origins";
			JsonArray origins_JsonArr = getLookupResonse(strLookupName);
			if (origins_JsonArr == null || origins_JsonArr.size() < 3){
				logMessage("Get "+strLookupName+" Lookup", "Should be able to fetch "+strLookupName+" lookup", "Unable to fetch lookup details for "+strLookupName+" Lookup size "+origins_JsonArr.size(), "Failed");
				return false;
			}
			
			//Get Destinations - https://products.loginextsolutions.com/LookupApp/lookup/destinations  - [{"clientBranchId":3257762,"latitude":98734.0,"longitude":9854.0,"origin":"Ajmer"},{"clientBranchId":3257877,"latitude":7834.0,"longitude":9834.0,"origin":"All"},{"clientBranchId":3257781,"latitude":9843.0,"longitude":9834.0,"origin":"Alwar"},{"clientBranchId":160313,"latitude":23.022505,"longitude":72.571362,"origin":"AMDD"},{"clientBranchId":160314,"latitude":31.6140057216,"longitude":74.4627325535,"origin":"ATQD"},{"clientBranchId":3257814,"latitude":8743.0,"longitude":3984.0,"origin":"Bhiwadi"},{"clientBranchId":160315,"latitude":12.971599,"longitude":77.594563,"origin":"BLRH"},{"clientBranchId":160316,"latitude":13.073002,"longitude":77.796697,"origin":"BLRX"},{"clientBranchId":160317,"latitude":19.2719332346,"longitude":73.0877332687,"origin":"BOMX"},{"clientBranchId":160318,"latitude":19.3293170521,"longitude":73.1658699512,"origin":"BOMZ"},{"clientBranchId":3257681,"latitude":122.0,"longitude":232.0,"origin":"Central India"},{"clientBranchId":5843318,"latitude":41.8781136,"longitude":-87.62979819999998,"origin":"Chicago, IL"},{"clientBranchId":160319,"latitude":11.0410355811,"longitude":76.9783430099,"origin":"CJBE"},{"clientBranchId":160320,"latitude":11.8078384999,"longitude":74.4534447193,"origin":"CNND"},{"clientBranchId":160321,"latitude":10.0676087508,"longitude":76.3221199512,"origin":"COKD"},{"clientBranchId":5843316,"latitude":30.4754702,"longitude":-90.10091080000001,"origin":"Covington, LA"},{"clientBranchId":5305907,"latitude":19.12945,"longitude":72.926386,"origin":"D-Mart Kanjurmarg"},{"clientBranchId":160322,"latitude":28.6156833538,"longitude":77.1346199512,"origin":"DELD"},{"clientBranchId":160323,"latitude":28.459497,"longitude":77.02664,"origin":"DELU"},{"clientBranchId":2852468,"latitude":28.422385,"longitude":77.104255,"origin":"Double tree"},{"clientBranchId":3257685,"latitude":834.0,"longitude":934.0,"origin":"East India"},{"clientBranchId":5305986,"latitude":28.460594,"longitude":77.078251,"origin":"Gurgaon 01"},{"clientBranchId":2852469,"latitude":26.920475,"longitude":75.798984,"origin":"hotel Neelam"},{"clientBranchId":160324,"latitude":17.0649049951,"longitude":78.4627449512,"origin":"HYDX"},{"clientBranchId":160325,"latitude":15.8067445044,"longitude":74.4627277851,"origin":"IXGD"},{"clientBranchId":160326,"latitude":9.8078431372,"longitude":78.4536922425,"origin":"IXMD"},{"clientBranchId":160327,"latitude":26.912434,"longitude":75.78727,"origin":"JAID"},{"clientBranchId":3257720,"latitude":98347.0,"longitude":89345.0,"origin":"Jaipur"},{"clientBranchId":160328,"latitude":22.470702,"longitude":70.05773,"origin":"JGAD"},{"clientBranchId":3257755,"latitude":8349.0,"longitude":734.0,"origin":"Jodhpur"},{"clientBranchId":3257829,"latitude":8374.0,"longitude":859.0,"origin":"Kota"},{"clientBranchId":5843317,"latitude":41.8050314,"longitude":-87.8692254,"origin":"La Grange, KY"},{"clientBranchId":160329,"latitude":13.0516361022,"longitude":80.1217460632,"origin":"MAAD"},{"clientBranchId":3257683,"latitude":8923.0,"longitude":34.0,"origin":"North India"},{"clientBranchId":2661785,"latitude":18.9992909,"longitude":72.83997870000002,"origin":"novire Branch"},{"clientBranchId":160330,"latitude":18.6135500439,"longitude":73.7678933144,"origin":"PNQF"},{"clientBranchId":160331,"latitude":13.0100771458,"longitude":80.1958179474,"origin":"PNYD"},{"clientBranchId":3257682,"latitude":121.0,"longitude":123.0,"origin":"South India"},{"clientBranchId":5305897,"latitude":19.111356,"longitude":72.908394,"origin":"Supreme Business Park - Powai"},{"clientBranchId":160332,"latitude":11.6613587622,"longitude":78.4627450975,"origin":"SXVD"},{"clientBranchId":2442548,"latitude":28.543923,"longitude":77.408901,"origin":"Test R1"},{"clientBranchId":2442549,"latitude":28.463064,"longitude":77.494187,"origin":"Test R2"},{"clientBranchId":3947110,"latitude":19.721,"longitude":72.34,"origin":"Test_4444"},{"clientBranchId":1729701,"latitude":28.471731,"longitude":77.101921,"origin":"test-007"},{"clientBranchId":3257687,"latitude":897435.0,"longitude":89345.0,"origin":"West India"}]
			strLookupName = "destinations";
			JsonArray destinations_JsonArr = getLookupResonse(strLookupName);
			if (destinations_JsonArr == null || destinations_JsonArr.size() < 3){
				logMessage("Get "+strLookupName+" Lookup", "Should be able to fetch "+strLookupName+" lookup", "Unable to fetch lookup details for "+strLookupName+" Lookup size "+destinations_JsonArr.size(), "Failed");
				return false;
			}
			
			String strPageName = "HaulRouteDetails_Page";
			LinkedHashMap<String, String> pageDataMap = getPageObjects(row, strPageName); // ReadExcel2.readSortedTestDataMap(strSheetName, strPageName);
			System.out.println("pageDataMap: "+pageDataMap);
			
			pageDataMap = removeDotReferences(pageDataMap);
			System.out.println("Removed Dot references - pageDataMap: "+pageDataMap);
			
			//Perform substitution of keywords or functions like AUTOGEN / DATE / BOOLEAN / INTEGER / DECIMAL etc from DataSheet with actual values,
			updateTempData(row);
			pageDataMap = substituteDataMapKeywords (pageDataMap);
			System.out.println("Substituting values pageDataMap: "+pageDataMap);
			
			//Put origins_JsonArr first value in - originName
			System.out.println("origins_JsonArr : "+origins_JsonArr);
			String strOriginValue = origins_JsonArr.get(0).getAsJsonObject().get("origin").getAsString();
			pageDataMap.put("originName", strOriginValue);
			
			//Put destinations_JsonArr first value in - destination
			System.out.println("destinations_JsonArr : "+destinations_JsonArr);
			String strDestinationValue = destinations_JsonArr.get(0).getAsJsonObject().get("origin").getAsString();
			pageDataMap.put("destinationName", strDestinationValue);

			//Get Structure API - Enter Route Details - https://products.loginextsolutions.com/LoginApp/framework/structure?modelName=ROUTE_PLANNING&pageName=ROUTE_PLANNING&sectionName=ROUTE_FORM
			JsonObject routeDetails = getStructureAPI("ROUTE_PLANNING", "ROUTE_PLANNING", "ROUTE_FORM");
			if (routeDetails == null){
				logMessage("Fetch structure details", "Should be able to fetch structure details", "Unable to fetch structure details : Response : "+toPrettyFormat(routeDetails.toString()), "Failed");
				return false;
			}

			//Enter Values 
			rc = enterValues(pageDataMap, routeDetails.toString());
			System.out.println("Entered Values in Route Planning Page : "+rc);
			Assert.assertTrue(rc);
			 
			//Enter Transit Time - (//*[@name="transitTimeInMins"])[3|iTimesClicked]
			String strElementXPath = "(//*[@name=\"transitTimeInMins\"])[1]";//Initial transit point
			rc = sendKeys(strElementXPath, getUniqueIntegerValue(4), "Transit Time", true);
			if (rc == false){
				//continue;
			}

			//Enter Unloading Time - (//*[@name="serviceTimeInMins"])[3|iTimesClicked]
			strElementXPath = "(//*[@name=\"serviceTimeInMins\"])[1]";//Initial transit point
			rc = sendKeys(strElementXPath, getUniqueIntegerValue(2), "Service Time", true);
			if (rc == false){
				//continue;
			}
			
			//Enter Distance - (//*[@name="distance"])[3 | iTimesAddClicked]
			strElementXPath = "(//*[@name=\"distance\"])[1]";//Initial transit point
			rc = sendKeys(strElementXPath, getUniqueIntegerValue(3), "Distance", true);
			if (rc == false){
				//continue;
			}
			
			//Loop Through and Enter 3 Transit Points
			int iTimesClickedAddButton = 1;//We click the button once and fill in the data
			int iTotalRemoveButtonsOnPage = 0;
			do 
			{
				//Perform an Loop operation and click add button - - //*[contains (@class,'routeFormAddButton')] class="icon add addVisit routeFormAddButton"
				String strAddTransitPointsBtnXPath = "//*[contains (@class,'routeFormAddButton')]";
				rc = clickElementByXPath(strAddTransitPointsBtnXPath, "Add Transit Point Button");
				Assert.assertTrue(rc);
				
				int iWaitAfterClickingAddButton = 0;
				
				//Count number of Route Form Remove button XPath - //*[contains (@class,'routeFormRemButton')] - should be equal to number of times clicked on plus button 			
				do {
					String strRemoveButtonXPath = "//*[contains (@class,'routeFormRemButton')]";
					iTotalRemoveButtonsOnPage = driver.findElements(By.xpath(strRemoveButtonXPath)).size();
					System.out.println(iWaitAfterClickingAddButton + " : iTotalRemoveButtonsOnPage= "+iTotalRemoveButtonsOnPage+" : iTimesClickedAddButton = "+iTimesClickedAddButton);
					
					iWaitAfterClickingAddButton++;
					TimeUnit.SECONDS.sleep(1);
					if (iWaitAfterClickingAddButton > 30)
					{
						rc = false;
						System.out.println("Exiting - total remove not equal to times add button added");
						break;
					}
					
				} while (iTotalRemoveButtonsOnPage != iTimesClickedAddButton);
				
				if (rc == false)
				{
					System.out.println("Exiting - total remove not equal to times add button added");
					break;
				}
				
				//Get Structure API - Enter Transit Details - https://products.loginextsolutions.com/LoginApp/framework/structure?modelName=ROUTE_PLANNING&pageName=ROUTE_PLANNING&sectionName=ROUTE_FORM_CHILD
				JsonObject trnsitPoints = getStructureAPI("ROUTE_PLANNING", "ROUTE_PLANNING", "ROUTE_FORM_CHILD");
				if (routeDetails == null){
					logMessage("Fetch structure details", "Should be able to fetch structure details", "Unable to fetch structure details : Response : "+toPrettyFormat(routeDetails.toString()), "Failed");
					return false;
				}

				strPageName = "HaulRouteTransitPoints_Page";
				pageDataMap = getPageObjects(row, strPageName); // ReadExcel2.readSortedTestDataMap(strSheetName, strPageName);
				System.out.println("pageDataMap: "+pageDataMap);
				
				pageDataMap = removeDotReferences(pageDataMap);
				System.out.println("Removed Dot references - pageDataMap: "+pageDataMap);
				
				//Perform substitution of keywords or functions like AUTOGEN / DATE / BOOLEAN / INTEGER / DECIMAL etc from DataSheet with actual values,
				updateTempData(row);
				pageDataMap = substituteDataMapKeywords (pageDataMap);
				System.out.println("Substituting values pageDataMap: "+pageDataMap);
				
				String strCurrentRouteName = pageDataMap.get("routeConfigurationName");
				
				//Enter Destination Point by looping through origins (//*[@name="destination"])[2|4|6|8]
				System.out.println("iTimesClickedAddButton : "+iTimesClickedAddButton);
				String strDestinationPointValue = strOriginValue = origins_JsonArr.get(iTimesClickedAddButton).getAsJsonObject().get("origin").getAsString();;
				System.out.println("Current Row - Transit Point Value "+strDestinationPointValue);

				//Select option from dropdown
				String strDestinationXPath = "(//*[@name='destination'])["+(iTimesClickedAddButton * 2)+"]";//(//*[@name="destination"])[2|4|6|8]
				rc = udsSelectLM_Dropdown(strDestinationXPath, "Destination Transit Point - "+iTimesClickedAddButton, strDestinationPointValue);
				if (rc == false){
					System.err.println("Unable to enter destination point...");
					return false;
				}

				//Optional - deliveryOrder - AutoIncremented and assigned, number starts with 1 - (//*[@name='deliveryOrder'])[2]
				
				//Enter Transit Time - (//*[@name="transitTimeInMins"])[3|iTimesClicked]
				strElementXPath = "(//*[@name=\"transitTimeInMins\"])["+iTimesClickedAddButton+"]";
				rc = sendKeys(strElementXPath, getUniqueIntegerValue(4), "Transit Time", true);
				if (rc == false){
					//continue;
				}

				//Enter Unloading Time - (//*[@name="serviceTimeInMins"])[3|iTimesClicked]
				strElementXPath = "(//*[@name=\"serviceTimeInMins\"])["+iTimesClickedAddButton+"]";
				rc = sendKeys(strElementXPath, getUniqueIntegerValue(2), "Service Time", true);
				if (rc == false){
					//continue;
				}
				
				//Enter Distance - (//*[@name="distance"])[3 | iTimesAddClicked]
				strElementXPath = "(//*[@name=\"distance\"])["+iTimesClickedAddButton+"]";
				rc = sendKeys(strElementXPath, getUniqueIntegerValue(3), "Distance", true);
				if (rc == false){
					//continue;
				}
				
				iTimesClickedAddButton++;
			} while (iTimesClickedAddButton <= 3);//Repeat adding 3 Destinations
			
			if (rc == false)
			{
				logMessage("Enter transit points","Should be able to enter transit points", "Unable to enter transit points", "Failed");
				return false;
			}
			
			boolean isRouteCreatedSuccessfully = false;
			int iRetryCount = 0;
			do 
			{
				//Defining exit point for route creation
				iRetryCount++;
				if (iRetryCount > 3)
				{
					logMessage("Verify Route is created", "Route should be created successfully", "Route is not created, Retied for "+iRetryCount+" Time(s) using different destinaitons" , "Failed");
					((JavascriptExecutor) driver).executeScript("document.getElementById('js-prompt').style.display='block';");
					return false;
				}
				
				//Click Save Button - //*[contains (@id, 'saveText')]
				String strSaveButtonXPath = "//*[contains (@id, 'saveText')]";
				rc = clickElementByXPath(strSaveButtonXPath, "Save Button");
				Assert.assertTrue(rc);
				
				//Check whether 'Route already exists' (key = 'route.already.exists')message is displayed?
				String strRouteAlreadyExistsMessage = getLabel_PageLabelAPI(row, "route.already.exists");//
				System.out.println("strRouteAlreadyExistsMessage: "+strRouteAlreadyExistsMessage);
				
				//Reduce max wait time to get status message
				int iTmp = MAX_WAIT_TIME;
				MAX_WAIT_TIME = 12;
				
				String strPromptXPath = "//*[@id='js-prompt')]";
				rc = waitForJS_PromptMessageJS(strRouteAlreadyExistsMessage, strPromptXPath);// waitForJS_PromptMessage(strExpectedPromptValue);
				if (rc) // Route already exists
				{

					//Choose a different destination from dropdown					strDestinationValue = destinations_JsonArr.get(iRetryCount).getAsJsonObject().get("origin").getAsString();
					logMessage("Route Already Exists", "Verify whether Route Already exists message is appeared", "Route Already Exists;"+strDestinationValue+" Choosing an another destination from dropdown...", "Passed");
					
					//
					
					//Put destinations_JsonArr first value in - destination
					System.out.println("destinations_JsonArr : "+destinations_JsonArr);
					pageDataMap.put("destinationName", strDestinationValue);

					//Get Structure API - Enter Route Details - https://products.loginextsolutions.com/LoginApp/framework/structure?modelName=ROUTE_PLANNING&pageName=ROUTE_PLANNING&sectionName=ROUTE_FORM
					routeDetails = getStructureAPI("ROUTE_PLANNING", "ROUTE_PLANNING", "ROUTE_FORM");
					if (routeDetails == null){
						logMessage("Fetch structure details", "Should be able to fetch structure details", "Unable to fetch structure details : Response : "+toPrettyFormat(routeDetails.toString()), "Failed");
						return false;
					}

					//Enter Values 
					rc = enterValues(pageDataMap, routeDetails.toString());
					System.out.println("Entered Values in Route Planning Page : "+rc);
					Assert.assertTrue(rc);
					 
				
					//Revert back route name 
					
					continue;//Loop through by clicking save button and repeat
				}
				else
				{
					System.out.println("Route already exists message is not displayed, checking whether route is created successfully?");
				}
				
				//Revert back original max wait time
				MAX_WAIT_TIME = iTmp;
				
				//Get text from Prompt Message on success or failiure - //*[@id='js-prompt']
				String strSuccessMessage = getLabel_PageLabelAPI(row, "route.created.success");//app_PageLabels.get("driver.created.success").getAsString();
				System.out.println("strSuccessMessage: "+strSuccessMessage);

				//
				strPromptXPath = "//*[@id='js-prompt')]";
				rc = waitForJS_PromptMessageJS(strSuccessMessage, strPromptXPath);// waitForJS_PromptMessage(strExpectedPromptValue);
				if (rc)
				{//
					logMessage("Verify Success Message", "Success Message - Route created successfully should display", "Message : "+strSuccessMessage+" is displayed", "Passed");
					isRouteCreatedSuccessfully = true;
				}
				else
				{
					String strPromptValue = getPromptElementTextByXPath(strPromptXPath, "Prompt");//getElementTextByXPath(strPromptXPath, "Prompt");
					logMessage("Verify Success Message", "Success Message - Route created successfully should display", "Message : '"+strSuccessMessage+"' is not displayed : Actual : "+strPromptValue, "Failed");
					return false;
				}
					
			} while (isRouteCreatedSuccessfully == false);
			
			
			
			return true;
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			return false;
		}
	}
	
	/**
	 * Valid lookup tested as below 
	 *  - origins
	 *  - destinations
	 * @return - JsonArray of Lookup found 
	 */
	public JsonArray getLookupResonse (String strLookupName)
	{
		try 
		{

			LinkedHashMap <String,String> row = getTempData();

			//Get the auth token and Client Secret from from Auth API
			String strAPI = row.get("URL") + // demo.loginextsolutions.com/
					"LookupApp/lookup/"+strLookupName;
			
			System.out.println("Getting : "+strAPI+"");
			System.out.println("Headers \n"
					+ "client_secret_key:"+""+ row.get("clientSecretKey"));
			System.out.println("www-authenticate:"+""+ "BASIC "+row.get("token"));
			System.out.println("Content-Type:"+""+"application/json");

			Response jsonResponse = given().when()
					.headers(
							"client_secret_key", row.get("clientSecretKey"),
							"www-authenticate", "BASIC "+row.get("token"),
							"Content-Type","application/json")
					.get(strAPI);

			String strResults = jsonResponse.getBody().asString();
			System.out.println("strResults: "+strResults);
			JsonParser parser = new JsonParser();
			JsonArray dataset = parser.parse(strResults).getAsJsonArray();
			return dataset;
		}
		catch (Exception e) 
		{

			if (iTimesAPI_RecoveryPerformed <= iMaxAPI_RecoveryAllowed)
			{
				iTimesAPI_RecoveryPerformed ++;
				logMessage("Performing API Recovery", "API should be responded", "Invoking API again for Error : "+e.getMessage(), "Passed");

				//Invoke the function again to get the page structure

				JsonArray response = getLookupResonse(strLookupName);
				System.out.println("orderResults: "+response);
				if (response != null)
				{
					System.err.println("Fetched order results... ");
					return response;
				}
			}
			logMessage("Get Lookup Details", "Lookup Details should be fetched", "Lookup Details API details not fetched : "+" "+e.getMessage(), "Failed");
			e.printStackTrace();
			return null;
	
		}
	}


	
	public boolean wikipediaTest(LinkedHashMap<String, String> row) {
		
		try {

			System.out.println("BROWSERSTACK_USER : "+System.getenv("BROWSERSTACK_USER"));
			System.out.println("BROWSERSTACK_PASS : "+System.getenv("BROWSERSTACK_PASS"));
			String USERNAME = System.getenv("BROWSERSTACK_USER");
			String AUTOMATE_KEY = System.getenv("BROWSERSTACK_PASS");
			String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

		    DesiredCapabilities caps = new DesiredCapabilities();
		    caps.setCapability("browser", "Chrome");
		    caps.setCapability("browser_version", "62.0");
		    caps.setCapability("os", "Windows");
		    caps.setCapability("os_version", "10");
		    caps.setCapability("resolution", "1024x768");

		    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
		    driver.get("http://www.wikipedia.org");
		    WebElement element = driver.findElement(By.id("searchInput"));

		    element.sendKeys("BrowserStack");
		    element.submit();

		    System.out.println(driver.getTitle());
		    driver.quit();

			
			/*
			DesiredCapabilities caps = new DesiredCapabilities();

		    caps.setCapability("device", "Google Pixel");
		    caps.setCapability("os_version", "8.0");
		    caps.setCapability("app", "bs://fde33ec956c4ee5175ced35a9fa257ba0dad2604");//Wikipedia
		    
		    AndroidDriver driver = new AndroidDriver(new URL("https://"+userName+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub"), caps);
		    this.driver = driver;
		    WebElement searchElement = new WebDriverWait(driver, 30).until(
		        ExpectedConditions.elementToBeClickable(By.id("Search Wikipedia")));
		    searchElement.click();
		    WebElement insertTextElement = new WebDriverWait(driver, 30).until(
		        ExpectedConditions.elementToBeClickable(By.id("org.wikipedia.alpha:id/search_src_text")));
		    insertTextElement.sendKeys("BrowserStack");
		    Thread.sleep(5000);

		    List allProductsName = driver.findElements(By.className("android.widget.TextView"));
		    assert(allProductsName.size() > 0);
 			*/
		    //driver.quit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}
		
	
	
	/*************** End Loginext Global Signup Screen **********************/



	
	
}



//For WebSockets - TBA
//Get Client detials from - https://testing.loginextsolutions.com/LoginApp/login/clientdetail?access_token=2171ff9e-f21d-4e25-afee-549ba1aade7a
//Fetch User ID - userId
//Subscribe to event and fetch back results from WebSocket API 