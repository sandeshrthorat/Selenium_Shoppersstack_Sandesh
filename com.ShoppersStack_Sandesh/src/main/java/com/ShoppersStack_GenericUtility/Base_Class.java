package com.ShoppersStack_GenericUtility;

import java.io.IOException;
import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.ShoppersStack_POM.HomePage;
import com.ShoppersStack_POM.LoginPage;
import com.ShoppersStack_POM.WelcomePage;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Base_Class {
	public WebDriver driver;
	public static WebDriver sdriver;
	public File_Utility file = new File_Utility();
	public WelcomePage welcomepage;
	public LoginPage loginpage;
	public HomePage homepage;
	public ExtentSparkReporter spark;
	public ExtentReports reports;
	public ExtentTest test;
	public Java_Utility javaUtility = new Java_Utility();
	public WebDriverWait wait;
	public WebDriver_Utility webdriverUtility = new WebDriver_Utility();

	@BeforeSuite
	public void brforeSuite() {
		System.out.println("Before Suite");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
		spark = new ExtentSparkReporter(FrameWorkConstants.extentReportsPath + javaUtility.localDateTime() + ".png");
		reports = new ExtentReports();
		reports.attachReporter(spark);
	}

	@BeforeClass
	public void beforeClass() throws IOException {

		System.out.println("Before Class");

		// Scanner sc1 = new Scanner(System.in);
		// System.out.println("Enter the BrowserName");
		// String browserName=sc1.next();
		// System.out.println("Enter Number Of Browsers");
		// int browserNumber = sc1.nextInt();
		// System.out.println("Name of Browser is "+browserName+" Number of Browsers are
		// "+browserNumber);
       
		String browserName = file.readPropertyData("browserName");
		String url = file.readPropertyData("url");
	 	
		
	//	String browserName =System.getProperty("browser");
	//	String url = System.getProperty("url");
		
		if (browserName.contains("chrome")) {
			driver = new ChromeDriver();
		}

		else if (browserName.contains("edge")) {
			driver = new EdgeDriver();

		} else if (browserName.contains("firefox")) {
			driver = new FirefoxDriver();

		}

		else {
			System.out.println("Invalid Browser Name");
		}

		sdriver = driver;

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url);

	}

	@BeforeMethod
	public void beforeMethod() throws IOException, InterruptedException {
		System.out.println("Before Method");
		welcomepage = new WelcomePage(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		wait.until(ExpectedConditions.elementToBeClickable(welcomepage.getLoginButton()));
		Thread.sleep(2000);
		welcomepage.getLoginButton().click();

		loginpage = new LoginPage(driver);
		loginpage.getEmailText().sendKeys(file.readPropertyData("email"));
		loginpage.getPassText().sendKeys(file.readPropertyData("password"));
		loginpage.getLoginBtn().click();

		homepage = new HomePage(driver);

	}

	@AfterMethod
	public void afterMethod() throws InterruptedException {
		System.out.println("After Method");
		Thread.sleep(5000);
		wait = new WebDriverWait(driver, Duration.ofSeconds(25));

		wait.until(ExpectedConditions.elementToBeClickable(homepage.getSettBtn()));
		homepage.getSettBtn().click();
		homepage.getLogoutBtn().click();
	}

	@AfterClass
	public void afterClass() throws InterruptedException {
		System.out.println("After Class");

		Thread.sleep(3000);
		driver.quit();

	}

	@AfterTest
	public void afterTest() {
		System.out.println("After Test");
		reports.flush();

	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite");
	}

}
