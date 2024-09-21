package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FactoryPage {

	private WebDriver driver;

	@FindBy(id = "username")
	private WebElement usernameInput;

	@FindBy(id = "password")
	private WebElement passwordInput;

	@FindBy(id = "loginButton")
	private WebElement loginButton;

	// Constructor
	public FactoryPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
		//Notes:In essence, PageFactory.initElements(driver, this) takes care of the initialization, and you don't need to manually set this.driver = driver. The WebDriver instance is implicitly used for element initialization in subsequent interactions with the page.

		//So, the LoginPage constructor you provided is sufficient for initializing the elements using Page Factory. It's a more concise way of achieving the same goal without explicitly assigning this.driver = driver.
		// this.driver = driver;
		// Initialize elements using Page Factory
		
	}

	// Methods for interactions with the page

	public void enterUsername(String username) {
		usernameInput.sendKeys(username);
	}

	public void enterPassword(String password) {
		passwordInput.sendKeys(password);
	}

	public void clickLoginButton() {
		loginButton.click();
	}
}

