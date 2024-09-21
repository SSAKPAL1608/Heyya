package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	private WebDriver driver;

	// Locators
	private By usernameInput = By.id("userName");
	private By passwordInput = By.id("password");
	private By loginButton = By.id("loginButton");

     //LoginPage class is associated with a specific WebDriver instance, 
	// passing webdriver to thebconstructor so reuse this WebDriver instance throughout the test or across
	
	// Constructor
	public LoginPage(WebDriver driver) {
		this.driver = driver;// driver accessible throughout the entire class so that the methods also can use it
	}

	// Methods to interact with elements
	public void enterUsername(String username) {
		WebElement usernameElement = driver.findElement(usernameInput);
		usernameElement.sendKeys(username);
	}

	public void enterPassword(String password) {
		WebElement passwordElement = driver.findElement(passwordInput);
		passwordElement.sendKeys(password);
	}

	public void clickLoginButton() {
		WebElement loginButtonElement = driver.findElement(loginButton);
		loginButtonElement.click();
	}
}