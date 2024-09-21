package Generic_method;

import java.time.Duration;

import org.openqa.selenium.NoSuchSessionException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParallelTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(chromeOptions);
    }

    @Test(priority = 1)
    public void testChrome1() throws InterruptedException {
        System.out.println("The thread ID for Chrome is " + Thread.currentThread().getId());
        driver.get("https://www.bstackdemo.com/");
        Thread.sleep(2000);
        Assert.assertEquals(driver.getTitle(), "StackDemo");
    }

    @Test(priority = 2)
    public void testChrome2() throws InterruptedException {
        System.out.println("The thread ID for Chrome is " + Thread.currentThread().getId());
        driver.get("https://www.google.com/");
        // Assert.assertEquals(driver.getTitle(), "StackDemo");
    }

    @AfterMethod
    
    public void tearDown() {
        if (driver != null) {
            try {
                driver.quit();
            } catch (NoSuchSessionException e) {
                // Handle exception, e.g., log it
            }
        }
    }

}
