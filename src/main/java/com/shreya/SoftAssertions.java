package com.shreya;

import org.testng.annotations.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertions {
	
	@Test
	public void geekforgeeks() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/chromedriver.exe");    
    WebDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
    
    driver.get("https://www.spicejet.com/");
    
    SoftAssert softassert = new SoftAssert();
    String ActualURL=driver.getCurrentUrl();
    String ExpectedURL="https://www.geeksforgeeks.org/how-to-use-soft-asserts-in-testng/";
    softassert.assertEquals("Title does not match",ExpectedURL,ActualURL);
    
    System.out.println(driver.getTitle());
    softassert.assertAll();
    
   
}
}