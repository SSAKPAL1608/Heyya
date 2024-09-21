package Generic_method;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo_multiplewin {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");

		WebElement openmulwin = driver.findElement(By.xpath("//button[@id='newWindowsBtn']"));
		openmulwin.click();
		System.out.println(driver.getTitle());

		String parentwindow = driver.getWindowHandle();
		System.out.println(parentwindow);

		Set<String> allwins = driver.getWindowHandles();
		System.out.println(allwins);

		List<String> windowHandlesList = new ArrayList<>();
		windowHandlesList.addAll(allwins);

		// Access a particular window using an index (e.g., 1 for the second window)
		int windowIndexToAccess = 1;
		String windowToAccess = windowHandlesList.get(windowIndexToAccess);
		System.out.println("Window handle to access: " + windowToAccess);
		
		
		for (String focuswin : windowHandlesList) {

			if (!focuswin.equals(parentwindow)) {

				driver.switchTo().window(focuswin);// focus on multiple child window
				System.out.println(driver.getTitle());

				// selecting particular child window
				if (driver.getTitle().contains("XPath Practice - H Y R Tutorials")) { // driver.close(); //
					driver.close();
				}

			}
		}
		driver.switchTo().window(parentwindow);
		System.out.println(driver.getCurrentUrl());

	}
	// Set: A Set does not guarantee any specific order of elements. The order of
	// window handles in a Set may not be the same as the order in which the windows
	// were opened.
	// List: If maintaining the order of window handles is important (e.g.,
	// processing windows in the order they were opened), you might prefer using a
	// List.

}
