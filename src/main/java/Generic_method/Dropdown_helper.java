package Generic_method;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Dropdown_helper {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// System Property for Chrome Driver
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("URL");
		By dropdownLocator = By.id("your_dropdown_id");

		
		DealingwithDropdown(dropdownLocator,  "Option3"); // Example with "visible text"
	}

	public static void DealingwithDropdown(By locator, String valueToSelect) {

		List<String> expectedDropdownValues = new ArrayList<>();
		expectedDropdownValues.add("Option1");
		expectedDropdownValues.add("Option2");
		expectedDropdownValues.add("Option3");
		expectedDropdownValues.add("Option4");
		expectedDropdownValues.add("Option5");

		// Get actual values from the dropdown
		Select dropdown = new Select(driver.findElement(locator));

		List<WebElement> actualOptions = dropdown.getOptions();
		// Converting the WebElement objects to a list of strings (List<String>) makes
		// it easier to compare and validate the values against the expected values.
		// This is often done when dealing with dropdowns or lists where you need to
		// assert that the displayed options match your expectations.
		// Extract actual values from the web page
		List<String> actualDropdownValues = new ArrayList<>();
		for (WebElement option : actualOptions) {
			actualDropdownValues.add(option.getText());
		}

		// Validate using assertions
		Assert.assertEquals(actualDropdownValues.size(), expectedDropdownValues.size(),
				"Dropdown does not have the expected number of options");

		Assert.assertEquals(actualDropdownValues, expectedDropdownValues,
				"Actual dropdown values do not match the expected values");

		// Switch case for selection type
		 // Selection by visible text
	    if (actualDropdownValues.contains(valueToSelect)) {
	        dropdown.selectByVisibleText(valueToSelect);
	        System.out.println("Selected value by visible text: " + valueToSelect);
	    } else {
	        System.out.println("Value to select is not present in the dropdown");
	    }
	}
}
//Yes, that's correct. The code snippet iterates over each WebElement in the actualOptions list, retrieves the text of each option using option.getText(), and then adds each text value to the actualDropdownValues list. So, actualDropdownValues will contain all the text values of the options present in the dropdown menu 
//represented by the actualOptions list.