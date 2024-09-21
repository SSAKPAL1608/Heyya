package Generic_method;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class CustomTestListener implements ITestListener {

    private WebDriver driver;
    private ExtentTest extentTest;

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Test Method '" + result.getName() + "' is starting...");
        extentTest = ExtentManager.createInstance().createTest(result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test Method '" + result.getName() + "' passed.");
        extentTest.log(Status.PASS, "Test Method '" + result.getName() + "' passed.");
        ScreenshotUtils.takeScreenshot(driver, result); // Capture screenshot for pass
    
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Test Method '" + result.getName() + "' failed.");
        extentTest.log(Status.FAIL, "Test Method '" + result.getName() + "' failed.");
        ScreenshotUtils.takeScreenshot(driver, result); // Capture screenshot
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("Test Method '" + result.getName() + "' skipped.");
        extentTest.log(Status.SKIP, "Test Method '" + result.getName() + "' skipped.");
    }
    
    // Other methods like onTestFailedButWithinSuccessPercentage, onTestFailedWithTimeout, etc., can be implemented if needed
}
   