package Generic_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;

public class ExtentUsage {
    private static ExtentReports extent;
    WebDriver driver;
    @BeforeSuite
    public void setUp() {
    	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        extent = ExtentManager.createInstance();
       
    }

    @Test
    public void exampleTest() {
        // Your test logic here
        driver.get("https://www.amazon.in/");
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("motorola edge 40 neo");
    }

    @AfterSuite
    public void tearDown() {
        extent.flush();
    }
}
