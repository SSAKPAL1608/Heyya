package Generic_method;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import jdk.internal.org.jline.utils.Log;

public class Alert_Handler {
	public static WebDriver driver;

	public static void assertAndAcceptAlert(String expectedAlertText) {
		try {
			// Apply explicit wait to check existence of alert
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.alertIsPresent());

			// Switch to the alert
			Alert alert = driver.switchTo().alert();

			// Get the actual text of the alert
			String actualAlertText = alert.getText();

			// Assert that the actual alert text equals the expected text
			Assert.assertEquals(actualAlertText, expectedAlertText,
					"Alert text does not match. Expected: " + expectedAlertText + ", Actual: " + actualAlertText);

			// Accept the alert
			alert.accept();
		} catch (NoAlertPresentException e) {
			throw new AssertionError("No alert is present within the specified timeout.");
		}
	}

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		String expectedAlertText = "This is a sample alert.";

		// Example usage:
		assertAndAcceptAlert(expectedAlertText);
	}
}
