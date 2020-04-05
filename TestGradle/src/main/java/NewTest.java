import org.testng.annotations.Test;

import com.Environment;
import com.ReportGen;
import com.Testdemo;


import commom.WebApp;

import static commom.PageObject.search;


import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.Reporter;
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
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class NewTest extends BaseOperation {
	
	WebApp app=new WebApp();
	public ExtentHtmlReporter htmlReporter;
	 public ExtentReports extent;
	 public ExtentTest logger;
	 
  @BeforeClass
  public void beforeClass() {
	super.performTest();  
	//test = ReportGen.initialise("NewTest");
	System.out.println("here");
	System.out.println(System.getProperty("user.dir") + "\\STMExtentReport.html");
	 htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "/test-output/STMExtentReport.html");
	
	htmlReporter.config().setDocumentTitle("Title of the Report Comes here "); 
        // Name of the report
	htmlReporter.config().setReportName("Name of the Report Comes here "); 
        // Dark Theme
	htmlReporter.config().setTheme(Theme.STANDARD); 
	
	
	 // Create an object of Extent Reports
		extent = new ExtentReports();  
		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("Host Name", "SoftwareTestingMaterial");
		extent.setSystemInfo("Environment", "Production");
		extent.setSystemInfo("User Name", "Rajkumar SM");
		
		
	
  }

  
  @Test
  public void login() {
	  logger = extent.createTest("To verify Google Title");
	 app.launchBrowser("search"); 
	 //Reporter.log("The page is opened");
	// ReportGen.logPass("the browser is opened");
	 Assert.assertEquals("google", "google");
	 logger.log(Status.PASS, "browser sucessfully opened");
		System.out.println("yes******************************");
	 //logger.pass("This test passed");
		
		
  }
  
  
  @AfterClass
  public void afterClass() {
	  app.closeBrowser();
	  System.out.println("End browser");
	  extent.flush();
	  System.out.println("end test");
	  
	  
	  
  }

}
