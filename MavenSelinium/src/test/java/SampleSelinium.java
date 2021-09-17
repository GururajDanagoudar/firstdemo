import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleSelinium
{
	ExtentSparkReporter reporter;
	ExtentReports extent;
	
	@BeforeSuite
	public void setUp() {
	reporter = new ExtentSparkReporter("myreport.html");
	extent = new ExtentReports();
	extent.attachReporter(reporter);
	}
	@Test
	public void TestMethod()
	
	{
		ExtentTest test = extent.createTest("My first test");
		test.log(Status.INFO, "This shows info");
		//System.setProperty("webdriver.gecko.driver","C:/Users/gururajd/eclipse-workspaceSeleniumProject/SeleniumProject/drivers.gechodriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		WebElement searchbox=driver.findElement(By.name("q"));
		searchbox.sendKeys("chromeDriver");
		searchbox.submit();
		//Thread.sleep(5000);
		driver.quit();
		}
	@Test
	public void TestMethod2()
	
	{
		ExtentTest test = extent.createTest("My second test");
		test.log(Status.INFO, "This shows info");
		//System.setProperty("webdriver.gecko.driver","C:/Users/gururajd/eclipse-workspaceSeleniumProject/SeleniumProject/drivers.gechodriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		WebElement searchbox=driver.findElement(By.name("q"));
		searchbox.sendKeys("chromeDriver");
		searchbox.submit();
		//Thread.sleep(5000);
		driver.quit();
		}
	@AfterSuite
	public void tearDown() {
	extent.flush();
	}
}
