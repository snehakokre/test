package commom;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.Environment;
import com.Testdemo;

public class WebApp {
	
	public static WebApp webapp= null;
	private static String currentDir = System.getProperty("user.dir");
	private static String configFile = WebApp.currentDir + "/" + "src/test/resources/PageObject.properties";
	private static WebDriver driver;
	
	public static WebDriver getDriver() {
		return driver;
	}
	public static void setDriver(WebDriver driver) {
		WebApp.driver = driver;
	}


	ReadProperty pr;
	
	
	
	
	public WebApp() {
		pr =new ReadProperty(configFile);
		
	}
	public static WebApp getInstance() {
		if(webapp==null) {
			webapp=(new Initialize()).load();
			//read my Property file
			return webapp;
		}
		
		return webapp;
	}

	
	public void launchBrowser(String search) {
		
		if(Environment.getBrowser().contains("chrome")) {
			
			ChromeOptions chromeOptions = new ChromeOptions()
		      		.setAcceptInsecureCerts(true);
		      	chromeOptions.setCapability("ignoreZoomSetting", true);
		      	String currentDir = System.getProperty("user.dir");
		          System.setProperty("webdriver.chrome.driver", currentDir+"/src/test/drivers/chromedriver.exe");
		      
		         this.driver = new ChromeDriver(chromeOptions);
		          this.driver.manage().window().maximize();
		          this.driver.get("https://www.google.com/");
				}
		
		else if(Environment.getBrowser().contains("internetexplorer")){
			System.setProperty("webdriver.ie.driver", "C:\\Users\\sneha\\Downloads\\IEDriverServer.exe");
			
			
			
			InternetExplorerOptions ieOptions = new InternetExplorerOptions()
	        		.requireWindowFocus()
	        		.ignoreZoomSettings()
	        		.introduceFlakinessByIgnoringSecurityDomains()
	        		.destructivelyEnsureCleanSession();
			DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
			caps.setCapability("ignoreZoomSetting", true); 
		}	
	}
	
	public void closeBrowser() {
		this.driver.quit();
	}
}
