package ParallelTest;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Test_2 extends BaseTest {

	
@Test
	
	public void test03() {

		String url = "https://www.javatpoint.com/selenium-tutorial";
		driver.manage().window().maximize();
		
		driver.get(url);
	
	}

}
