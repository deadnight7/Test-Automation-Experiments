package com.loginext.Executor;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Configuration
{
	static Configuration configuration;
	static String CONFIG_FILE_PATH = "config/configuration.properties";
	static String Log4j_FILE_PATH = "config/log4j.properties";
	private Properties configurationProperties = new Properties();

	public Configuration() {
		super();
		try {
			this.loadConfigurationProperties();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static Configuration getConfigurationInstance()
	{ 

		if (configuration == null)
			configuration = new Configuration();
		return configuration;
	}


	public static WebDriver getWebDriverInstance() throws Exception
	{

		Configuration configurationProperties = Configuration.getConfigurationInstance();

		//If execution user is jenkins and mode is not CI, Change mode to CI
		if (System.getProperty("user.name").toLowerCase().contains("jenkins")
				&& configurationProperties.getExecutionMode().equalsIgnoreCase("CI") == false){
			System.out.println("Setting Execution Mode to CI...");
			configurationProperties.setExecutionMode("CI");
		}


		//String path = configurationProperties.getProperty("CHROMEPATH");
		DesiredCapabilities capability = new DesiredCapabilities();
		ChromeOptions cr_options = new ChromeOptions();
		FirefoxProfile ff_profile = new FirefoxProfile();
		FirefoxOptions ff_options = new FirefoxOptions();

		//Set Default Download directory
		String dockerDownloadDir = "/home/seluser/Downloads";//"/dev/shm";
		if  (System.getProperty("user.name").toLowerCase().contains("jenkins") || System.getProperty("user.name").toLowerCase().contains("ubuntu")){
			dockerDownloadDir = "/home/seluser/Downloads"; // Selenium Grid - Node - Docker's Default sharing directory
		}
		else if (configurationProperties.getExecutionMode().equalsIgnoreCase("Local")){
			dockerDownloadDir = System.getenv("HOME") + "/Downloads";
		}


		configurationProperties.setDownloadPath(dockerDownloadDir);
		System.out.println("Expected vm download dir : "+dockerDownloadDir);
		if (configurationProperties.getBrowser().equalsIgnoreCase("ie"))
		{
			capability = DesiredCapabilities.internetExplorer();
			//capability.setVersion(environmentParameter.getBrowserVersion());
			capability.setCapability(InternetExplorerDriver.ENABLE_PERSISTENT_HOVERING, false);
			capability.setCapability(InternetExplorerDriver.REQUIRE_WINDOW_FOCUS, true);
			capability.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
		}
		else if (configurationProperties.getBrowser().equalsIgnoreCase("firefox"))
		{
			ff_profile = new FirefoxProfile();
			
			ff_profile.setPreference("webdriver.load.strategy", "unstable");
			//profile.setEnableNativeEvents(false);
			ff_profile.setPreference("focusmanager.testmode", true);
			ff_profile.setPreference("browser.download.dir",dockerDownloadDir);
			ff_profile.setPreference("browser.helperApps.alwaysAsk.force", false);
			ff_profile.setPreference("browser.helperApps.neverAsk.saveToDisk", 
					"video/mp4,"
					+ "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet,"
					+ "application/zip,"
					+ "application/vnd.ms-excel,"
					+ "application/octet-stream,"
					+ "binary/octet-stream,"
					+ "application/*");//Upload your file on this website to get its mimetype - http://mime.ritey.com/
			ff_profile.setPreference("pdfjs.disabled", true);  // disable the built-in viewer
			ff_profile.setPreference("browser.download.folderList", 2);
			ff_profile.setPreference("browser.download.panel.shown", false);

			ff_options.setProfile(ff_profile);
			ff_options.setLogLevel(Level.ALL);//Views all debug log 
			
			/*capability = DesiredCapabilities.firefox();
			//--capability.setCapability(FirefoxDriver.PROFILE, profile);
			capability.setCapability(FirefoxOptions.FIREFOX_OPTIONS, ff_options);
			capability.setJavascriptEnabled(true);
			capability.setCapability("ignoreProtectedModeSettings", true);
			capability.setCapability("nativeEvents", false);*/
			capability = DesiredCapabilities.firefox();
			capability.setCapability(FirefoxDriver.PROFILE, ff_profile);
			//capability.setCapability(CapabilityType.ELEMENT_SCROLL_BEHAVIOR, 1);
			FirefoxOptions options = new FirefoxOptions();
			options.setProfile(ff_profile);
			
			System.out.println(capability.getCapability("nativeEvents"));
		}
		else if (configurationProperties.getBrowser().equalsIgnoreCase("chrome"))
		{
			capability = DesiredCapabilities.chrome();
			/**options.addArguments("headless");
			/**options.addArguments("disable-gpu");
			/**options.addArguments("no-sandbox");
			/**options.addArguments("test-type");

			options.addArguments("window-size","1920,1080");**/
			cr_options.addArguments("--privileged");
			cr_options.addArguments("--no-sandbox");
			cr_options.addArguments("--start-maximized");
			
			//Add Browsec VPN Addon...
			//***cr_options.addExtensions (new File("plugins_BrowsecVPN_CRX_ChromeExtension/3.19.6_0.crx"));

			System.out.println("Setting Chrome Options...");
			
			System.out.println("Using dockerDownloadDir: "+dockerDownloadDir);
			HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
			chromePrefs.put("profile.default_content_settings.popups", 0);
			chromePrefs.put("download.default_directory", dockerDownloadDir);

			//Turns off multiple download warning
			chromePrefs.put( "profile.content_settings.pattern_pairs.*.multiple-automatic-downloads", 1 );
			chromePrefs.put("profile.default_content_settings.multiple-automatic-downloads", 1);
			//Turns off download prompt
			chromePrefs.put("download.prompt_for_download", false);

			chromePrefs.put("profile.default_content_setting_values.automatic_downloads", 1);
			chromePrefs.put("profile.content_settings.exceptions.automatic_downloads.*.setting", 1);//"profile.content_settings.exceptions.automatic_downloads.*.setting", 1 
			chromePrefs.put("profile.content_settings.pattern_pairs.*.multiple-automatic-downloads", 1);
			chromePrefs.put("plugins.always_open_pdf_externally", true);
			
			chromePrefs.put("download.prompt_for_download", false);
			cr_options.setExperimentalOption("prefs", chromePrefs);
			capability.setCapability(ChromeOptions.CAPABILITY, cr_options);
		}
		else if (configurationProperties.getBrowser().equalsIgnoreCase("safari"))
			capability = DesiredCapabilities.safari();
		else
			System.err.println("Browser Name: " + configurationProperties.getBrowser() + " is Not valid Try any one of following \n1 ie ,2 firefox,3 chrome 4 opera");

		WebDriver driver = null;
		
		String strExecuteIn = configurationProperties.getExecutionMode();//ExecutionMode = "Local"; //Local/Remote
		System.out.println("Execution Mode - "+strExecuteIn);
		if (strExecuteIn != null && strExecuteIn.toLowerCase().equals("local")){

			if (configurationProperties.getBrowser().equalsIgnoreCase("chrome"))
			{
				//Setting chromedriver
				System.setProperty("webdriver.chrome.driver", "chromedriver");
				driver = new ChromeDriver(cr_options);	
			}
			else if (configurationProperties.getBrowser().equalsIgnoreCase("firefox"))
			{
				System.setProperty("webdriver.gecko.driver", "geckodriver");
				driver = new FirefoxDriver(ff_options);
				
			}
			driver.manage().window().setSize(new Dimension(1280, 720));
		}
		else {
			driver = new RemoteWebDriver(new URL(configurationProperties.getRemote_server()), capability);
			((RemoteWebDriver)driver).setFileDetector(new LocalFileDetector());
			
			if (configurationProperties.getBrowser().equalsIgnoreCase("chrome")){
				driver.manage().window().setSize(new Dimension(1280, 920));
			}
			//driver.manage().window().setSize(new Dimension(1280, 720*3));
			//Settings for Remote WebDriver
			//driver.manage().window().setSize(new Dimension(1920, 1080));
			//driver.manage().window().setSize(new Dimension(1280, 920));
		}


		//ChromeOptions ChromeOptions = new ChromeOptions();
		//ChromeOptions.addArguments("--headless", "window-size=1280,768", "--no-sandbox");
		//driver = new ChromeDriver(ChromeOptions);

		//((RemoteWebDriver) driver).setFileDetector(new LocalFileDetector());
		// /Below condition is to handle
		// "org.openqa.selenium.WebDriverException: unknown error: cannot get automation extension"
		// issue
		// /Maximizing of the window is done through chrome options
		if (configurationProperties.getBrowser().equalsIgnoreCase("chrome"))
		{
			//driver.manage().window().maximize();
		}
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
	}


	public void loadConfigurationProperties() throws FileNotFoundException, IOException
	{
		configurationProperties.load(new FileInputStream(CONFIG_FILE_PATH));
		PropertyConfigurator.configure(Log4j_FILE_PATH);
	}


	public String getBrowser()
	{
		return getProperty("Browser");
	}

	/**
	 * Valid Params - Chrome / Firefox
	 * Will set current browser to whatever is passed
	 * @param strBrowser
	 */
	public void setBrowser(String strBrowser)
	{
		configurationProperties.setProperty("Browser", strBrowser);
	}


	public String getExecutionMode ()
	{
		return getProperty("ExecutionMode");
	}

	private void setExecutionMode(String string) {
		configurationProperties.setProperty("ExecutionMode", "CI");
	}

	private void setDownloadPath (String string) {
		configurationProperties.setProperty("DownloadPath", string);
	}


	public String getApplication_URL()
	{
		return getProperty("Application_URL");

	}

	public String getUserName()
	{
		return getProperty("UserName");

	}

	public String getPassword()
	{
		return getProperty("Password");

	}

	public String getRemote_server()
	{
		return getProperty("Remote_Server");
	}

	public String getDatasource()
	{
		return getProperty("Datasource");
	}

	public String getBaseMISReport()
	{
		return getProperty("BaseMISReport");
	}
	public String getDownloadPath()
	{
		return getProperty("DownloadPath");
	}

	public String getProperty(final String key)
	{
		String property = configurationProperties.getProperty(key);
		return property != null ? property.trim() : property;
	}




	public static void main (String s[]){
		
		FirefoxProfile ff_profile = new FirefoxProfile();
		ff_profile = new FirefoxProfile();

		ff_profile.setPreference("webdriver.load.strategy", "unstable");
		//profile.setEnableNativeEvents(false);
		ff_profile.setPreference("focusmanager.testmode", true);
		ff_profile.setPreference("browser.download.dir","/Users/chiragpandit");
		ff_profile.setPreference("browser.helperApps.alwaysAsk.force", false);
		ff_profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "video/mp4,application/vnd.ms-excel,application/vnd.openxmlformats-officedocument.spreadsheetml.sheet,application/zip");
		ff_profile.setPreference("pdfjs.disabled", true);  // disable the built-in viewer
		ff_profile.setPreference("browser.download.folderList", 2);
		ff_profile.setPreference("browser.download.panel.shown", false);

		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability(FirefoxDriver.PROFILE, ff_profile);
		capabilities.setCapability(CapabilityType.ELEMENT_SCROLL_BEHAVIOR, 1);
		FirefoxOptions options = new FirefoxOptions();
		options.setProfile(ff_profile);
		
		WebDriver driver = new FirefoxDriver(options);
		driver.manage().window().maximize();

		//WebDriver driver = new FirefoxDriver(options);
		driver.get("file:///Users/chiragpandit/Desktop/WiproDocs/Untitled");
		driver.findElement(By.linkText("Test")).click();;

		driver.close();
		driver.quit();
		
		
	}

}
