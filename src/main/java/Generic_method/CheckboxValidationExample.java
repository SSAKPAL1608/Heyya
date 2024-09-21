package Generic_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class CheckboxValidationExample {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*");
		 driver = new ChromeDriver(chromeOptions); // Use the class-level driver variable


		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.get("https://artoftesting.com/samplesiteforselenium");
		By checkboxLocator = By.xpath("//input[@type='checkbox']");
		checkboxSelected("Automation", checkboxLocator);
		// checkboxSelected("Performance", checkboxLocator);

	}

	public static void checkboxSelected(String checkboxValue, By locator) throws InterruptedException {
		List<WebElement> checkboxes = driver.findElements(locator);

		for (WebElement checkbox : checkboxes) {
			String valueAttribute = checkbox.getAttribute("value");
           // value attribute is a standard attribute for checkboxes, 
			// and its primary purpose is to provide a value associated with the checkbox.
			// Select the checkbox if the text condition is met
			// contains method is not applicable to it directly. You need to use the
			// getAttribute method to get the value and then check if it contains the
			// desired text.

			if (!checkbox.isSelected() && valueAttribute.contains(checkboxValue)) {
				checkbox.click();
				  
				// Check various conditions and assert
					Assert.assertTrue(checkbox.isDisplayed(), "Checkbox is not displayed");
					Assert.assertTrue(checkbox.isSelected(), "Checkbox is not selected");
					Assert.assertTrue(checkbox.isEnabled(), "Checkbox is not enabled");
					System.out.println("Checkbox selected successfully" + checkboxValue);
					break;
				} else {
					// Default condition or handle unknown conditions
					System.out.println("Invalid condition");
				}
			}
		}
	}




//    public static void selectAllCheckboxes(WebDriver driver, By locator) {
//        List<WebElement> checkboxes = driver.findElements(locator);
//
//        for (WebElement checkbox : checkboxes) {
//            if (!checkbox.isSelected()) {
//                checkbox.click();
//            }
//        }
//    }
//}
//
