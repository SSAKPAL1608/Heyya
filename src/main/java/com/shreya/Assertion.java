package com.shreya;

import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assertion {
public static void main(String[] args) throws InterruptedException {  
	    
	    // System Property for Chrome Driver   
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/chromedriver.exe");    
	    WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	    
	    driver.get("https://www.spicejet.com/");
//	    WebElement checkbox = driver.findElement(By.xpath("//div[text()='Senior Citizen']"));
//	    checkbox.click();
//	   
//	    boolean status =checkbox.isDisplayed();
//	   
//	    Assert.assertTrue(status);
//	    
//	    System.out.println(status);
	    
	    String actualURL = driver.getCurrentUrl();
        System.out.println(actualURL);
        
        String expectedURL="https://www.spicejet.com/";
        
        AssertJUnit.assertEquals("The URL are not equal",expectedURL,actualURL);
        System.out.println("Test Passed1"); 
	   
        
        AssertJUnit.assertTrue("URL does not match",expectedURL.equals(actualURL));
        System.out.println("Test Passed2"); 
        
        
        //provided true condition will throw exception here throw exception as condition expected to be false
        AssertJUnit.assertFalse("URL does  match",expectedURL.equals(actualURL));
       System.out.println("Test Passed3"); 
}
}