package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class abc {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.seleniumeasy.com/jquery-dropdown-search-demo.html");
		Dropdown_Generic dp = new Dropdown_Generic();
		dp.DealingwithDropdown(Dropdown_Generic.countryxpath, "India");

	}
}