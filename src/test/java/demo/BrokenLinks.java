package demo;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


	public class BrokenLinks {
	    public static void main(String[] args) {
	        System.setProperty("webdriver.chrome.driver", "./src/resources/chromedriver");
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://demoqa.com/broken");

	        //Storing the links in a list
	        List<WebElement> links = driver.findElements(By.tagName("a"));

	        // This line will print the number of links and the count of links.
	        System.out.println("No of links are " + links.size());

	        // Checking the links fetched using for-each loop
	        for (WebElement link : links) {
	            String url = link.getAttribute("href");
	            verifyLinks(url);
	        }

	        driver.quit();
	    }

	    public static void verifyLinks(String linkUrl) {
	        try {
	            URL url = new URL(linkUrl);

	            // Now we will be creating url connection and getting the response code
	            HttpURLConnection h = (HttpURLConnection) url.openConnection();
	            h.setConnectTimeout(5000);
	            h.connect();
	            int responseCode = h.getResponseCode();
	            switch (responseCode) {
	                case 200:
	                    System.out.println(linkUrl + " - " + responseCode + " " + h.getResponseMessage());
	                    break;
	                case 404:
	                    System.out.println(linkUrl + " - " + responseCode + " " + h.getResponseMessage() + " is a broken link");
	                    break;
	                case 500:
	                    System.out.println(linkUrl + " - " + responseCode + " " + h.getResponseMessage() + " is a server error");
	                    break;
	                // Add more cases for different response codes if needed
	                default:
	                    System.out.println(linkUrl + " - " + responseCode + " " + h.getResponseMessage());
	                    break;
	            }
	        } catch (Exception e) {
	            System.out.println(linkUrl + " - " + "is a broken link");
	        }
	    }
	}
