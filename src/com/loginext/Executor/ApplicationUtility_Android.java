package com.loginext.Executor;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import junit.framework.Assert;

import org.apache.xerces.util.SynchronizedSymbolTable;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.html5.Location;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.server.handler.ClickElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ApplicationUtility_Android {
	

	public static AppiumDriver driver = null;
	private static int MAX_WAIT_TIME = 120;//120;//120;

	public static boolean clickElementByXPath_NoRecovery (String strElementXPath, String strElementName){
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

	public static boolean clickElementByID_NoRecovery (String strElementID, String strElementName){
		try {
			String strID = strElementID;//"//*[text()='Resource']";
			WebDriverWait wait = new WebDriverWait(driver, MAX_WAIT_TIME);
			//wait.until(ExpectedConditions.elementToBeClickable(By.xpath(strXPath)));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(strID)));
			wait.until(ExpectedConditions.elementToBeClickable(By.id(strID)));

			driver.findElement(By.id(strID)).click();
			logMessage("Click "+strElementName, "Should be able to click "+strElementName, "Successfully able to click "+strElementName, "Passed");
			System.out.println("ID : "+strElementID);
			return true;
		} catch (Exception e) {
			logMessage("Click "+ strElementName, "Should be able to click "+strElementName, "Unable to click "+strElementName, "Failed");
			e.printStackTrace();
			return false;
		}

	}
	

	public static boolean sendKeysByID_NoRecovery (
			String strWebElementID,
			String strText, 
			String strElementName, 
			boolean displayValueInReport)
	{
		try 
		{
			WebDriverWait wait = new WebDriverWait(driver, MAX_WAIT_TIME);
			WebElement element = driver.findElement(By.id(strWebElementID));
			//bringElementInView(element);
			wait.until(ExpectedConditions.elementToBeClickable(By.id(strWebElementID)));
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
					"Unable to enter text '"+strText+"' in "+strElementName+" : XPath : "+strWebElementID+", Error "+e.getLocalizedMessage(),
					"Failed");
			e.printStackTrace();
			System.err.println("Unable to enter text : "+strText+" on WebElement with XPath : "+strWebElementID+"");
			return false;
		}
	}
	
	private static void logMessage(String string, String string2, String string3, String string4) {
		// TODO Auto-generated method stub
		System.out.println(string4+" : "+string3);
	}

	private static List<String> getCSV_Data_CompleteFile (String strFilePathToRead) {
		try 
		{

			BufferedReader reader = new BufferedReader(new FileReader(strFilePathToRead));
			List<String> lines = new ArrayList<>();
			String line = null;
			while ((line = reader.readLine()) != null) {
			    lines.add(line);//Add Data to List - and return back the same list
			}

			//System.out.println(lines.get(1));
			return lines;
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			//logMessage("Get CSV Data", "Should be able to validata CSV Data", "Unable to validate data in CSV", "Failed");
			return null;
		}
	}
	
	public static void main (String sr[]) throws Exception{

		try 
		{
			System.out.println("Started...!");
			
			DesiredCapabilities capabilities = new DesiredCapabilities();
		
			capabilities.setCapability("appium-version", "1.0");
			capabilities.setCapability("platformName", "Android");
			capabilities.setCapability("platformVersion", "7.1.1");
			capabilities.setCapability("deviceName", "Nex6p");
			
			String strQuickrApp = "/Users/chiragpandit/gitprojects/LMAutomation/MileDemo/com.google.android.apps.tasks_1.0.193513435.release-323602_minAPI16(x86)(nodpi)_apkmirror.com.apk";
			String strGoogleMapsAndroidApp = "/Users/chiragpandit/gitprojects/LMAutomation/MileDemo/com.google.android.apps.maps_9.47.3-947300020_minAPI18(arm64-v8a,armeabi-v7a,x86,x86_64)(nodpi)_apkmirror.com.apk";
			capabilities.setCapability("app", strGoogleMapsAndroidApp);
			
			AppiumDriver wd = new AppiumDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
			wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
			//Set initial geocoding
			Location current = new Location(19.196163, 72.860308, 0);//refer https://www.latlong.net/
			wd.setLocation(current);
			
			//Click Element Got It Button if exists - id	com.google.android.apps.maps:id/tutorial_side_menu_got_it
			driver = wd;
			String strGotItButton = "com.google.android.apps.maps:id/tutorial_side_menu_got_it";
			boolean rc = clickElementByID_NoRecovery(strGotItButton, "Got It button");
			
			//Send Keys - com.google.android.apps.maps:id/search_omnibox_text_box - Loginext Andheri
			String strSearchBoxMaps  = "com.google.android.apps.maps:id/search_omnibox_text_box";
			rc = sendKeysByID_NoRecovery(strSearchBoxMaps, "Loginext Andheri", "Search box", true);//(true);//clickElementByID_NoRecovery(strGotItButton, "Got It button");
			
			//Click /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout
			String strSearchResultXPath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout";
			rc = clickElementByXPath_NoRecovery(strSearchResultXPath, "Search Result XPath");
			
			//Click View - com.google.android.apps.maps:id/recycler_view
			String strViewDetailsID  = "com.google.android.apps.maps:id/recycler_view";
			rc = clickElementByID_NoRecovery(strViewDetailsID, "Result ID");
			
			//Click Directions Button - id	com.google.android.apps.maps:id/placepage_directions_button
			String strDirectionsButtonID = "com.google.android.apps.maps:id/placepage_directions_button"; 
			rc = clickElementByID_NoRecovery(strDirectionsButtonID, "Directions Button");
			
			//if - Get Message - id	com.google.android.gms:id/message - For best results, turn on device location, which uses Google’s location service.
			
			
			//Click - id	android:id/button1
			
			
			//If Traffic suggestions button avl - Click xpath	//android.widget.RelativeLayout[@content-desc="Beat the traffic, wherever you go. You'll start getting notifications about real-time traffic conditions, based on your current location"]/android.widget.FrameLayout[2]/android.widget.TextView

			
			//Click - id - /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.support.v4.view.ViewPager/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[4]/android.view.View  - com.google.android.apps.maps:id/sheet_header
			String strStartTripButtonID = "com.google.android.apps.maps:id/start_button";//"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.support.v4.view.ViewPager/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[4]/android.view.View";
			rc = clickElementByID_NoRecovery(strStartTripButtonID, "Start Trip Button");

			//Click Ok Button - android:id/button1
			String strOkButton = "android:id/button1";
			rc = clickElementByID_NoRecovery(strOkButton, "Ok Button");

			
			//Click Set Location Button

			//TimeUnit.SECONDS.sleep(3);
			List <String> latLongData = getCSV_Data_CompleteFile("/Users/chiragpandit/gitprojects/LMAutomation/MileDemo/files/geolocation.csv");
			for (int i = 0; i < latLongData.size(); i++) 
			{
				String [] strLatLongArr = latLongData.get(i).split(",");
				System.out.println("Setting Lat long to - : "+strLatLongArr[0]+" : "+strLatLongArr[1]);
				double lati = Double.parseDouble(strLatLongArr[0]);
				double longi = Double.parseDouble(strLatLongArr[1]);
				
				current = new Location(lati, longi, 0);//refer https://www.latlong.net/
				wd.setLocation(current);
				//TimeUnit.MILLISECONDS.sleep(100);
			}
			/*
			 19.196163,72.860308
			 19.195185,72.860087
			 19.194800,72.860044
			 19.194258,72.859958
			 19.193832,72.859808
			 19.193406,72.859679
			 19.192819,72.859336
			 19.191765,72.858713
			 19.191339,72.858477
			 19.190998,72.858452
			 19.190634,72.858430
			 19.190208,72.858452
			 19.189762,72.858516
			 19.189195,72.858473
			 19.188729,72.858559
			 19.188445,72.858473
			 19.187614,72.858452
			 19.186662,72.858581
			 19.186256,72.858581
			 19.185385,72.858581
			 19.185048,72.858538
			 19.184764,72.858559
			 19.184278,72.858516
			 19.183974,72.858516
			 19.182735,72.858452
			 19.182330,72.858559
			 19.181823,72.858516
			 19.181357,72.858516
			 19.180547,72.858516
			 19.180182,72.858602
			 19.179575,72.858664
			 */
			
			
			//if the device rooted button comes up - click that button
		
			/*
			wd.findElement(By.id("android:id/button1")).click();
			wd.findElement(By.id("com.quikr:id/login_register_view")).click();
			wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			//wd.findElement(By.id("com.quikr:id/login_register_view")).click();
			wd.findElement(By.id("com.quikr:id/login_register_view")).sendKeys("dead.night@gmail.com");
			*/
			//wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v7.widget.LinearLayoutCompat[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.Button[2]")).click();
			//wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.TextView[1]")).click();
			//wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.view.View[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.EditText[1]")).click();
			//wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.view.View[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.RelativeLayout[1]/android.widget.TextView[1]")).sendKeys("dead.night7@gmail.com");
			//(JavascriptExecutor)wd.executeScript("dead.night7@gmail.com", null);
			//wd.close();

			//stopAppiumServer();
			System.out.println("Completed...!");	
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}
	}
	
	
	public static void main_quickr (String sr[]) throws Exception{


		System.out.println("Started...!");
		//startAppiumServer();
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		/*capabilities.setCapability("appium-version", "1.0");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "5.0");
		capabilities.setCapability("deviceName", "Nexus5x");
		capabilities.setCapability("app", "/Users/chiragpandit/gitprojects/LMAutomation/MileDemo/quikr.apk");
		*///capabilities.setCapability("app", "quikr.apk");
		
		capabilities.setCapability("appium-version", "1.0");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "5.0");
		capabilities.setCapability("deviceName", "MotoG5Plus");
		capabilities.setCapability("app", "/Users/chiragpandit/gitprojects/LMAutomation/MileDemo/quikr.apk");
		
		WebDriver wd = new AppiumDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
		wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		//if the device rooted button comes up - click that button
		wd.findElement(By.id("android:id/button1")).click();
		wd.findElement(By.id("com.quikr:id/login_register_view")).click();
		wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//wd.findElement(By.id("com.quikr:id/login_register_view")).click();
		wd.findElement(By.id("com.quikr:id/login_register_view")).sendKeys("dead.night@gmail.com");
		
		//wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v7.widget.LinearLayoutCompat[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.Button[2]")).click();
		//wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.TextView[1]")).click();
		//wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.view.View[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.EditText[1]")).click();
		//wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.view.View[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.RelativeLayout[1]/android.widget.TextView[1]")).sendKeys("dead.night7@gmail.com");
		//(JavascriptExecutor)wd.executeScript("dead.night7@gmail.com", null);
		//wd.close();

		//stopAppiumServer();
		System.out.println("Completed...!");	
	}
	
	static AppiumDriverLocalService appiumService;// = AppiumDriverLocalService.buildDefaultService();
	
	public static boolean startAppiumServer ()
	{
		try 
		{
			appiumService = AppiumDriverLocalService.buildService(
					//AppiumDriverLocalService.buildDefaultService(
					new AppiumServiceBuilder()
					.usingDriverExecutable(new File("/usr/local/bin/node"))//  /Applications
					.withAppiumJS(new File("/usr/local/bin/appium"))
					.withIPAddress("0.0.0.0")
					.usingPort(4723)
					.withArgument(GeneralServerFlag.SESSION_OVERRIDE)
					.withLogFile(new File("build/appium.log"))
					);
			appiumService.start();
			TimeUnit.SECONDS.sleep(3);
			return true;
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			return false;
		}
	}

	public static boolean stopAppiumServer ()
	{
		try 
		{
			appiumService.stop();
			return true;
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			return false;
		}
	}
	
}
