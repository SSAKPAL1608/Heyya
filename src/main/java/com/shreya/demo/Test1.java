package com.shreya.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {  
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/chromedriver.exe");    
    WebDriver driver = new ChromeDriver();
   driver.manage().window().maximize();
    driver.get("https://www.htmlelements.com/demos/menu/shadow-dom/index.htm");

	driver.findElement(By.xpath("/html/body/smart-ui-menu//smart-menu/div[1]/div[2]/smart-menu-items-group[1]/div[1]")).click();
	
	
	
	}}
