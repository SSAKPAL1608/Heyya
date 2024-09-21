package TestNg;

import static org.testng.Assert.assertFalse;

import org.testng.annotations.Test;  
public class Personal_loan  
{  
	@Test(groups= {"SmokeTest"})  
	public void WebLoginPersonalLoan()  
	{  
		System.out.println("test4");  
	}  
	@Test  (groups= {"SmokeTest"})
	public void MobileLoginPersonalLoan()  
	{  
		System.out.println("test5");
		
	}  
	@Test  
	public void APILoginPersonalLoan()  
	{  
		System.out.println("test6");  
	}  
}  