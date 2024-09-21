package Testclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pages.FactoryPage;
import Pages.LoginPage;

public class LoginTest {
    @Test
    public void loginTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");

        LoginPage loginPage = new LoginPage(driver);
        FactoryPage f = new FactoryPage(driver);
        
        f.enterPassword("");
        // Perform login actions using Page Object methods
          loginPage.enterUsername("user123");
//        loginPage.enterPassword("password123");
//        loginPage.clickLoginButton();

        // Assertions or further actions...

        // Close the browser
        driver.quit();
    }
}
 //creating in