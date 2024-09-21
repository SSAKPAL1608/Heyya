package TestNg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParameters1 {
	
	@Parameters({ "browser" })
	@Test
	public void testCaseOne(String browser) {
		System.out.println("TestParameters1 browser passed as :- " + browser);
	}

	@Parameters({ "username", "password" })
	@Test
	public void testCaseTwo(String username, String password) {
		System.out.println("TestParameters1 Parameter for User Name passed as :- " + username);
		System.out.println("TestParameters1 Parameter for Password passed as :- " + password);
	}
}