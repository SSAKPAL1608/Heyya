package Generic_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
public class ScreenshotUsage {

	WebDriver driver;
	public ExtentReports extent;

	
	    @BeforeMethod
	    public void setUp() {
	    	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	       
	    }

	    @Test
	    public void exampleTest() {
	        // Your test logic here
	        driver.get("https://www.amazon.in/");
	        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("motorola edge 40 neo");
	    }

	    @AfterMethod
	    public void tearDown(ITestResult result) {
	        // After each test method, take a screenshot if the test fails
	        ScreenshotUtils.takeScreenshot(driver, result);

	        // Close the WebDriver instance
	        driver.quit();
	    }}
	
