package com.shreya;
import java.time.Duration;
import java.util.List;




import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;




public class Irctc {




	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions o = new ChromeOptions();
		o.addArguments("--disable-notifications");





		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/chromedriver.exe");
		WebDriver driver =new ChromeDriver(o);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.get("https://www.irctc.co.in/nget/train-search");




//		driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();
//		By fromSearch = By.xpath("//p-autocomplete[@id=\"origin\"]/span/input");
//		wait.until(ExpectedConditions.visibilityOf(driver.findElement(fromSearch)));
//		driver.findElement(fromSearch).click();
//		driver.findElement(fromSearch).sendKeys("dli");
//		Thread.sleep(3000);
//		driver.findElement(fromSearch).sendKeys(Keys.ENTER);
//
//
//
//
//		By toSearch =By.xpath("//span[@class=\"ng-tns-c58-9 ui-autocomplete ui-widget\"]/input");
//		wait.until(ExpectedConditions.visibilityOf(driver.findElement(toSearch)));
//		driver.findElement(toSearch).click();
//		driver.findElement(toSearch).sendKeys("pune");
//		Thread.sleep(3000);
//		driver.findElement(toSearch).sendKeys(Keys.ENTER);
//

		//date
		driver.findElement(By.xpath("//p-calendar[@id='jDate']")).click();
		By years = By.xpath("//div[@class='ui-datepicker-title ng-tns-c58-10']/span[2]");
		By months = By.xpath("///div[@class='ui-datepicker-title ng-tns-c58-10']/span[1]");
		By dates = By.xpath("//tbody[@class='ng-tns-c58-10']");
		By btn = By.cssSelector("//a[@class='ui-datepicker-next ui-corner-all ng-tns-c58-10 ng-star-inserted']");

		while(!driver.findElement(years).getText().contains("2024")) {
			driver.findElement(btn).click();
		}

		while(!driver.findElement(months).getText().contains("May")) {
			driver.findElement(btn).click();
		}

		WebElement allDates = driver.findElement(dates);
		List <WebElement> allDate = allDates.findElements(By.tagName("a"));

		for(WebElement currDate:allDate) {
			if(currDate.getText().contains("4")) {
				currDate.click();
				break;
			}
		}}}