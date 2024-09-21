package demo;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandles_NewWindow {
	public static void main(String[] args) throws InterruptedException { 
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/chromedriver.exe");    
	    WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
	    driver.get("https://demoqa.com/browser-windows");
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,200)");



		
		  List<WebElement> clickElement=
		  driver.findElements(By.xpath("//div[@id='browserWindows']/div/button"));
		  for(WebElement we:clickElement) { Thread.sleep(3000); we.click();
		  
		  }
		 
		  
		Set<String> allwin= driver.getWindowHandles();
		
		System.out.println(allwin);
		//op[80A591AC3585645B79F5C49002706E91, 34EE467DF486D0405AA4D8611943C246, 4D9F7D66BAABBD42CD4B12B88B310688, AF8DB7C35C4CCC18E664A5BBEB85EAAC]
	 for(String s:allwin) {
		 String focuswin= driver.switchTo().window(s).getCurrentUrl();
		 System.out.println(focuswin);
			/*op
			 * https://demoqa.com/browser-windows https://demoqa.com/sample
			 * https://demoqa.com/sample
			 */
		 Thread.sleep(3000);
		 if(focuswin.contains("https://demoqa.com/sample")) {
			 Thread.sleep(2000);
			 driver.close();
			
		 }
		
	 }
	 
	}
	}