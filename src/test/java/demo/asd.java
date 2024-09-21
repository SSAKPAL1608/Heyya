package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class asd {
    public static void main(String[] args) {
        // Set the path to chromedriver
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        // Open the webpage
        driver.get("https://example.com");

        try {
            // Explicitly wait until the element is either visible or clickable with a timeout of 10 seconds
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement element = wait.until(ExpectedConditions.or(
                    ExpectedConditions.visibilityOfElementLocated(By.id("element_id")),
                    ExpectedConditions.elementToBeClickable(By.id("element_id"))
            ));

            // Once the element is visible or clickable, you can proceed with further actions
            element.click(); // Example action: Clicking on the element
        } catch (Exception e) {
            // Handle the exception (e.g., log error message, take a screenshot)
            System.out.println("Error occurred: " + e.getMessage());
        } finally {
            // Close the WebDriver
            driver.quit();
        }
    }
}
