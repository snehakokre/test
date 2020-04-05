package com;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class NewTest {
  
	ChromeOptions chromeOptions;
	Properties testdataProperties= new Properties();
	 private static String currentDir = System.getProperty("user.dir");
	private static String configFile = NewTest.currentDir + "/" + "resources/config.properties";

	
	
  @BeforeClass
  public void beforeClass() {
	  
	 	  try {
			testdataProperties.load(new FileInputStream(NewTest.configFile));
			Environment.getInstance(testdataProperties, currentDir);
			System.out.println("va;uess**************");
			System.out.println(Environment.getDriverPath());
			System.out.println(Environment.getBrowser());
			
			
			
		} catch (FileNotFoundException e) {
			System.out.println("file not found");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  
	  
	/*System.setProperty("webdriver.ie.driver", "C:\\Users\\sneha\\Downloads\\IEDriverServer.exe");
		
		
		
		InternetExplorerOptions ieOptions = new InternetExplorerOptions()
        		.requireWindowFocus()
        		.ignoreZoomSettings()
        		.introduceFlakinessByIgnoringSecurityDomains()
        		.destructivelyEnsureCleanSession();
		DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
		caps.setCapability("ignoreZoomSetting", true);
		*/   
		

	  chromeOptions = new ChromeOptions()
	      		.setAcceptInsecureCerts(true);
	      	chromeOptions.setCapability("ignoreZoomSetting", true);
	      	String currentDir = System.getProperty("user.dir");
	          System.setProperty("webdriver.chrome.driver", currentDir+"/src/test/drivers/chromedriver.exe");
	      
         
  }

  
  @Test
  public void login() {
	/*  WebDriver driver= new InternetExplorerDriver();
		driver.manage().window().maximize();
		System.out.println("opened");
	*/
	 
	  WebDriver  driver = new ChromeDriver(chromeOptions);
          driver.manage().window().maximize();
	  
	  driver.get("https://www.google.com/");
try {
	

		driver.quit();
}
catch(Exception e) {
	
	System.out.println("Exception");
}
}
  
  
  @AfterClass
  public void afterClass() {
	  

  }

}
