package demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToWindowHandles {
	public static void main(String[] args) {  
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/chromedriver.exe");    
    WebDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
    
    driver.get("https://demo.automationtesting.in/Windows.html");
     WebElement OpenNewTabbedWindows =driver.findElement(By.xpath("//a[text()='Open New Tabbed Windows ']"));
    
    
     WebElement clickele=driver.findElement(By.xpath("//div[@id='Tabbed']/a/button"));
     clickele.click();
     System.out.println(driver.getTitle());// focus in on parent window
     
     
     
      String parentwindow= driver.getWindowHandle();
 	  System.out.println(parentwindow);
 	  
 	  
     //lets switch focus to child window
     //getting id and how many windows are open
      Set<String> s=driver.getWindowHandles();
      List<String> allWindowHandlesList = new ArrayList<>(s);
      
      //storing all windows id(s) in i
      for(String i :s) {
    	  //here it will iterate through all windows including parent and checking if condition
    	 String Allwindows= driver.switchTo().window(i).getTitle();
    	 if(Allwindows.contains("Selenium")) {
    		 driver.close();
    	 }
    	  
      }
   
}
}