package demo;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


	public class Checkbox {

	    public static WebDriver driver;

	    public static void main(String[] args) throws InterruptedException {

	        // System Property for Chrome Driver
	        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.irctc.co.in/nget/train-search");
	       

	    }

	    public static void Checkbox_helper() {
	        WebElement container = driver.findElement(By.xpath("//div[@class='col-xs-12 remove-padding']"));

	        List<WebElement> checkboxes = container.findElements(By.tagName("label"));

	        for (WebElement e : checkboxes) {
	            //String labelText = checkbox.getText().trim(); // Trim to handle spaces

	           // if (!checkbox.isSelected() && labelText.contains("Person With Disability Concession")) {
	              if(e.getText().contains("Person With Disability Concession")) {
	        	
	        	   e.click();
	               // Assert.assertTrue(checkbox.isSelected(), "Checkbox not selected");
	                System.out.println("Checkbox selected successfully");
	            } else {
	                System.out.println("Checkbox not selected or text condition not met");
	            }
	        }
	    }
	}

		  
		  
		 
		  
		  
		  
		  
		  
		  
		  
		 

		// to select all the checkboxes
		/*
		 * driver.get("https://artoftesting.com/samplesiteforselenium"); WebElement
		 * checkbox= driver.findElement(By.xpath("//input[@type='checkbox'][1]"));
		 * checkbox.click(); Assert.assertEquals(true,checkbox.isSelected());
		 * System.out.println("Checkbox is selected – Assert passed");
		 * 
		 * 
		 * List<WebElement> lst1=
		 * driver.findElements(By.xpath("//input[@type='checkbox']")); for(WebElement
		 * allcheckboxes:lst1) { allcheckboxes.click(); }
		 */
	

