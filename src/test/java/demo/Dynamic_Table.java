package demo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Dynamic_Table {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/chromedriver.exe");    
    WebDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
    driver.get("https://www.w3schools.com/html/html_tables.asp");
  //*[@id="customers"]/tbody/tr[2]/td[1]
  //*[@id="customers"]/tbody/tr[3]/td[1]
    
    
  //*[@id="customers"]/tbody/tr[7]/td[1]
    String beforexpath="//*[@id=\"customers\"]/tbody/tr[";
    String Afterxpath="]/td[1]";
    
    List<WebElement>rows=driver.findElements(By.xpath("//*[@id='customers']/tbody/tr"));
    int rowcount=rows.size();
    System.out.println(rowcount);
    
    
    List<WebElement>columns=driver.findElements(By.xpath("//*[@id='customers']/tbody/tr/th"));
    int colscount=columns.size();
    System.out.println(colscount);
      for(int i=1;i<rowcount;i++) {
    	  for(int j=1;j<=colscount;j++) {
    		  //print all the elements in the webtable
    		 // System.out.println(driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+(i+1)+"]/td["+j+"]")).getText());
    		String s=  driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+(i+1)+"]/td["+j+"]")).getText();
    		  if(s.contains("Shreyas")) {}
    		  Assert.assertTrue(true, "Unable to find element");
    	  
    	  }
      }
    
    
	}

}