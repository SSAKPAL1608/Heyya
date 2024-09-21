package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dropdown_Generic {
	public static WebDriver driver;
	static  String countryxpath = "/html/body/div[2]/div/div[2]/div[1]/div/div[2]/span/span[1]/span";
	public static String terretoryxpath = "//*[@id=\"select2-3vsl-container\"]";

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver.exe");
		
		//
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.seleniumeasy.com/jquery-dropdown-search-demo.html");
       
		
		DealingwithDropdown(countryxpath, "India");

	}

	public static void DealingwithDropdown(String xpath, String value) {
		Select select = new Select(driver.findElement(By.xpath(xpath)));
//select.selectByVisibleText(value);
		
		List<WebElement> lst = select.getOptions();
			System.out.println(lst.size());
		for (WebElement i : lst) {
			System.out.println(i.getText());
			if (i.getText().contains(value));
			i.click();
			break;
		}

	}

}