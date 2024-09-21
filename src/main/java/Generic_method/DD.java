package Generic_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class DD {

    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Open the web page with the dropdown
        driver.get("your_page_url");

        // Locate the dropdown element
        By dropdownLocator = By.id("your_dropdown_id");
        Select dropdown = new Select(driver.findElement(dropdownLocator));

        // Get the options from the dropdown
        List<WebElement> dropdownOptions = dropdown.getOptions();

        // Predefined expected values
        List<String> expectedValues = new ArrayList<>();
        expectedValues.add("Option1");
        expectedValues.add("Option2");
        expectedValues.add("Option3");
        expectedValues.add("Option4");
        expectedValues.add("Option5");

        // Validate the number of elements in the dropdown
        Assert.assertEquals(dropdownOptions.size(), expectedValues.size(),
                "Number of elements in the dropdown does not match the expected count");

        // Validate each value in the dropdown
        for (int i = 0; i < dropdownOptions.size(); i++) {
            String actualValue = dropdownOptions.get(i).getText();
            String expectedValue = expectedValues.get(i);
            Assert.assertEquals(actualValue, expectedValue,
                    "Dropdown value at index " + i + " does not match the expected value");

            // Print expected and actual values for better understanding
            System.out.println("Expected Value at index " + i + ": " + expectedValue);
            System.out.println("Actual Value at index " + i + ": " + actualValue);
        }

        // Close the browser
        driver.quit();
    }
}
