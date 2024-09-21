package Generic_method;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationUnderstanding {

    WebDriver driver;

    @BeforeTest
    public void setup() {
        System.out.println("Setting up the WebDriver and system properties");
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
    }

    @Test(priority = 1)
    public void testChrome1() throws InterruptedException {
        System.out.println("The thread ID for Chrome is " + Thread.currentThread().getId());
        driver.get("https://www.bstackdemo.com/");
        Assert.assertEquals(driver.getTitle(), "StackDemo");
    }

    @Test(priority = 2)
    public void testChrome2() throws InterruptedException {
        System.out.println("The thread ID for Chrome is " + Thread.currentThread().getId());
        driver.get("https://www.google.com/");
       // Assert.assertEquals(driver.getTitle(), "StackDemo");
    }

    @AfterTest
    public void close() {
        System.out.println("Closing the WebDriver");
        driver.quit();
    }
}
