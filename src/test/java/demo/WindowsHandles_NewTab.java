package demo;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandles_NewTab {
	public static void main(String[] args) throws InterruptedException {  
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/chromedriver.exe");    
    WebDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
    driver.get("https://demoqa.com/browser-windows");
    
    WebElement NewTab= driver.findElement(By.xpath("//button[text()='New Tab']"));
    NewTab.click();
    
    
    Set<String>s= driver.getWindowHandles(); 
    System.out.println(s);
    for(String i:s) {
    	String win= driver.switchTo().window(i).getCurrentUrl();
    	 System.out.println(win);
			
			 
    	 if(win.contains("https://demoqa.com/sample")) {
    		 driver.close();
    	 }
    	
    }
}
}