package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {
public static void main(String[] args) throws InterruptedException {  
	    
	    // System Property for Chrome Driver   
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/chromedriver.exe"); 
		 WebDriver driver = new ChromeDriver();
		 //Launch the application		
        driver.get("https://www.meesho.com/");
        driver.manage().window().maximize();
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //Find element by link text and store in variable "Element"        		
        WebElement Element = driver.findElement(By.xpath("//div[text()='Personal Care & Wellness']"));

        //This will scroll the page till the element is found vertically		
        js.executeScript("arguments[0].scrollIntoView();", Element);
        


;

	    
        

	     
}
}