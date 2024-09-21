package Grid;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class SeleniumGridStandaloneExample {
	@Test
	public void t1() throws InterruptedException, MalformedURLException {
		// URL of the Selenium Grid hub
		URL hubUrl = new URL("http://192.168.1.5:4444/wd/hub");

		// Define desired capabilities for the browser and platform
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setBrowserName("chrome");
		capabilities.setPlatform(org.openqa.selenium.Platform.WINDOWS);
		// Create a RemoteWebDriver instance by connecting to the Selenium Grid hub
		WebDriver driver = new RemoteWebDriver(hubUrl, capabilities);

		// Navigate to a website and perform actions
		driver.get("https://www.google.com/");
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("Selenium Grid");
		searchBox.submit();

		// Wait for a while to observe the browser interaction
		Thread.sleep(5000);

		// Close the browser
		driver.quit();

	}

	@Test
	public void t2() throws InterruptedException, MalformedURLException {
		// URL of the Selenium Grid hub
		URL hubUrl = new URL("http://192.168.1.5:4444/wd/hub");

		// Define desired capabilities for the browser and platform
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setBrowserName("chrome");
		capabilities.setPlatform(org.openqa.selenium.Platform.WINDOWS);
		// Create a RemoteWebDriver instance by connecting to the Selenium Grid hub
		WebDriver driver = new RemoteWebDriver(hubUrl, capabilities);

		// Navigate to a website and perform actions
		driver.get("https://www.google.com/");
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("Selenium with Java");
		searchBox.submit();

		// Wait for a while to observe the browser interaction
		Thread.sleep(5000);

		// Close the browser
		driver.quit();
	}
}
