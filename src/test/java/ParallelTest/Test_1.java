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



public class Test_1 extends BaseTest {

	

	@Test
	public void test_01() {
		driver.get("https://demoqa.com/text-box");
		
	}
	
	public void test_02() {
		driver.get("https://chat.openai.com/");
	}

}
