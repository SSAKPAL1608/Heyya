package Generic_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import java.util.List;

public class RadioButtonValidationExample {
    public static WebDriver driver;

    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.get("https://artoftesting.com/samplesiteforselenium");

        By radioButtonLocator = By.xpath("//input[@type='radio']");
        radioButtonSelected("male", radioButtonLocator);
        

    }

    public static void radioButtonSelected(String radioValue, By locator) {
        List<WebElement> radioButtons = driver.findElements(locator);

        for (WebElement radioButton : radioButtons) {
            String valueAttribute = radioButton.getAttribute("value");
           // String nameAttribute = radioButton.getAttribute("name");

            // Select the radio button if the text condition is met
            if ( valueAttribute.equals(radioValue)) { 
                radioButton.click();

                // Check various conditions and assert
                if (radioValue.equalsIgnoreCase(valueAttribute)) {
                    Assert.assertTrue(radioButton.isDisplayed(), "Radio button is not displayed");
                    Assert.assertTrue(radioButton.isSelected(), "Radio button is not selected");
                    Assert.assertTrue(radioButton.isEnabled(), "Radio button is not enabled");
                    System.out.println("Radio button selected successfully: " + radioValue);
                } else {
                    // Default condition or handle unknown conditions
                    System.out.println("Invalid condition");
                }
            
        }
        }}}

 