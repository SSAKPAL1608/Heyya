package demo;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Test {
public static void main(String[] args) throws InterruptedException {  
    
    // System Property for Chrome Driver   
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/chromedriver.exe");    
    WebDriver driver = new ChromeDriver();
  //  JavascriptExecutor js = (JavascriptExecutor) driver;
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
   driver.get("https://demo.guru99.com/test/newtours/register.php");

//ChromeOptions options = new ChromeOptions();
//options.addArguments("--remote-allow-origins=*");
//dropdowm selecting one item and print
Select drpCountry = new Select(driver.findElement(By.name("country")));
drpCountry.selectByVisibleText("ANTARCTICA");

System.out.println("The Selected country is"+ " "+drpCountry.getFirstSelectedOption().getText());

//dropdown printing all the options and selecting any item
List<WebElement> printallCountries = drpCountry.getOptions();
System.out.println("The list of all the countries");
for(WebElement lst:printallCountries) {
	System.out.println(lst.getText());
	
	if(lst.getText().contains("CAMEROON")) {
		lst.click();
		break;
		}
	
	
//}
//Dropdown without select class
driver.get("https://www.irctc.co.in/nget/train-search");

WebElement allclasses= driver.findElement(By.xpath("//p-dropdown[@id='journeyClass']/div"));
allclasses.click();

WebElement e1 =driver.findElement(By.xpath("//ul[@role='listbox']"));
List<WebElement>lst1= e1.findElements(By.tagName("span"));
System.out.println("Number of items: " + lst1.size());
for(WebElement allopt:lst1) {
	System.out.println(allopt.getText());
	
	
	if(allopt.getText().contains("Second Sitting (2S)")) {
		allopt.click();
		break;
	}
	
}


}
}}