package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Generic_method.ExcelManager;

import java.io.IOException;

public class GetDataprovider {

    @DataProvider(name = "excelDataProvider")
    public Object[][] provideTestData() throws IOException {
        return ExcelManager.getTestData("TestData");
    }

    @Test(dataProvider = "excelDataProvider")
    public void loginTest(String uname, String Password) {
        // Your test logic using username and password
       // System.out.println("Login Test with Username: " + Username + ", Password: " + Password);
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver.exe");
		 ChromeOptions chromeOptions = new ChromeOptions();
		 chromeOptions.addArguments("--remote-allow-origins=*");
		 ChromeDriver driver = new ChromeDriver(chromeOptions);
		 driver.get("https://demoqa.com/text-box");
		 driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(uname);
		 System.out.println("Hi");
    }
}
