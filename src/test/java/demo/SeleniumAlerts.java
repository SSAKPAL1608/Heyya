package demo;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumAlerts {
	public static void main(String[] args) throws InterruptedException {  
	    
	    // System Property for Chrome Driver   
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/chromedriver.exe");    
	    WebDriver driver = new ChromeDriver();
	   driver.manage().window().maximize();
	    driver.get("https://demo.guru99.com/test/delete_customer.php");
	    WebElement SubmitButton = driver.findElement(By.xpath("//input[contains(@type ,'submit')]"));
	  
	    SubmitButton.click();
	   	
        
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".classlocator")));
        // Switching to Alert  
        
        
        Alert alert = driver.switchTo().alert();
        if(wait.until(ExpectedConditions.alertIsPresent())==null)
            System.out.println("Alert not exists");
            else
            System.out.println("Alert exists");

        
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));// implicit wait for selenium 4
        		
        // Capturing alert message.    
        String alertMessage= driver.switchTo().alert().getText();		
        		
        // Displaying alert message		
        System.out.println(alertMessage);	
        Thread.sleep(5000);
        alert.accept();
        Thread.sleep(3000);
        Alert alert1 = driver.switchTo().alert();
       	
		
        // Capturing alert message.    
        String alertMessage1= driver.switchTo().alert().getText();		
        		
        // Displaying alert message		
        System.out.println(alertMessage1);	
        Thread.sleep(5000);
        alert.accept();
        
        
        				

        
	   
	    		
}
}