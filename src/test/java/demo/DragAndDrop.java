package demo;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DragAndDrop {
	
	public static void main(String[] args) {  
	    
	    // System Property for Chrome Driver   
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/chromedriver.exe");    
	    WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	    
	    driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
	    
	    Actions action = new Actions(driver);
	    
		 
		WebElement from = driver.findElement(By.xpath("//div[@id='draggable']"));
		
		 
		WebElement to = driver.findElement(By.xpath("//div[@id='droppable']"));	 
		
		action.dragAndDrop(from, to).build().perform();
		//System.out.println(to.getText());
		
		if(to.getText().equals("Dropped!")) {
		
			System.out.println("PASS :Verification success Target is successfully dropped");
		}
		
		else {
			System.out.println("FAIL :Verification Failed");
		}
			
				
}
}