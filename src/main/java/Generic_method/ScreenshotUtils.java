package Generic_method;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenshotUtils {

 public static void takeScreenshot(WebDriver driver, ITestResult result) {
		try {
			// Convert WebDriver object to TakesScreenshot
			TakesScreenshot ts = (TakesScreenshot) driver;

			// Capture the screenshot as File
			// With the type-casted object ts, you can now call the getScreenshotAs method.
			// The getScreenshotAs method captures a screenshot, and the OutputType.FILE
			// argument indicates that the screenshot should be returned as a File object.
			File sourceFile = ts.getScreenshotAs(OutputType.FILE);

			// Specify the directory to store screenshots
			
			String directory;
	        if (result.getStatus() == ITestResult.SUCCESS) {
	            directory = "C:\\Users\\SSAKPAL\\eclipse-workspace\\demo\\Screenshots\\Passed";
	        } else if (result.getStatus() == ITestResult.FAILURE) {
	            directory = "C:\\Users\\SSAKPAL\\eclipse-workspace\\demo\\Screenshots\\Failed";
	        } else {
	            return;
	        }
			
			createDirectoryIfNotExists(directory);

			// Build the path for the screenshot file
			String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
			 String screenshotName = result.getName() + "_" + timestamp + ".png";
			// it's joining the directory (where the screenshots directory is located) and
			// the screenshotName (the unique name of the screenshot file).

			Path screenshotPath = Paths.get(directory, screenshotName);
            // copies the screenshot from its original location (captured by Selenium) 
			//to the specified directory and filename (screenshotPath).
			// Copy the screenshot to the specified path
			FileHandler.copy(sourceFile, screenshotPath.toFile());

			System.out.println("Screenshot captured: " + screenshotPath.toString());
		} catch (IOException e) {
			System.err.println("Exception while taking screenshot: " + e.getMessage());
		}
	}

	private static void createDirectoryIfNotExists(String directory) {
		File dir = new File(directory);
		if (!dir.exists()) {
			dir.mkdir();
		}
	}
}
