package TestNg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParameters2 {
	
	
	
	@Parameters({ "browser" })
	@Test
	public void testCaseThree(String browser) {
		System.out.println("TestParameters2 browser passed as :- " + browser);
	}
	
	
	
	
}
