package com.shreya;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;





public class ProdFlipKart {
	static WebDriver driver;




	public static void getProd(int i ,int j) {
		String prod = "//*[@id='container']/div/div[3]/div[1]/div[2]/div["+i+"]/div[1]/div["+j+"]";
		driver.findElement(By.xpath(prod)).click();
	}
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input"))
		.sendKeys("8237537482");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input"))
		.sendKeys("Shreya@1608");
		driver.findElement(By.xpath("//button[@type='submit' and @class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		WebElement search = driver.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
		search.sendKeys("tops");
		search.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		getProd(2,1);

	}}