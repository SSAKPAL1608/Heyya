package Generic_method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PropertyUsage {


	    public static void main(String[] args) {
	    	
	    	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/chromedriver.exe");    
	    	 ChromeOptions chromeOptions = new ChromeOptions();
			 chromeOptions.addArguments("--remote-allow-origins=*");
			 ChromeDriver driver = new ChromeDriver(chromeOptions);	        // Specify the path to your properties file
	       
	         String filePath = "C:\\Users\\SSAKPAL\\eclipse-workspace\\demo\\config.properties";
	      
	        // Create an instance of PropertyUtils
	        PropertyUtility p = new PropertyUtility(filePath);

	        // Retrieve values using key
	        String url = p.getProperty("url");
	        driver.get(url);

	        // Print the retrieved values
	        
	        System.out.println("URL: " + url);
	        
	    }

}
