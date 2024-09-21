package TestNg;


import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
 

public class FileUpload {
@Test
	    public void FileUpload() throws InterruptedException {
	    // System Property for Chrome Driver   
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/chromedriver.exe");    
	    WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	    
	    driver.get("https://demo.guru99.com/test/upload/");
	    
	    String Actualtitle= driver.getTitle();
	    String Expectedtitle= "File Upload Demo";
	    
	    //Assert.assertTrue(Actualtitle.equalsIgnoreCase(Expectedtitle), "Title doesnt matched");
	    Assert.assertEquals(Actualtitle, Expectedtitle, "The title doesnt match");
	    
	    System.out.println(Actualtitle);
	    WebElement choosefile = driver.findElement(By.xpath("//input[@type='file']"));
	    choosefile.sendKeys("C:\\Users\\SSAKPAL\\Downloads\\Shreya_Sakpal_Resume.pdf");

	    driver.findElement(By.id("terms")).click();

        // click the "UploadFile" button
        driver.findElement(By.name("send")).click();
        Thread.sleep(3000);
        
        
 WebElement filevalidation= driver.findElement(By.xpath("//*[@id=\"res\"]/center"));
 
 if(filevalidation.getText().contains("has been successfully uploaded."))
 {

     assertTrue(true);

    

}
 else {
     assertTrue(false, "Profile picture is not Uploaded"); 
 }





}}