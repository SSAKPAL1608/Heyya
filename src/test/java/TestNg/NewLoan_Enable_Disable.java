package TestNg;

import org.testng.annotations.Test;

public class NewLoan_Enable_Disable {
	@Test(enabled=false)
	public void WebLoginHomeLoan()  
	{  
	  System.out.println("test1");  
	}  
	@Test
	public void MobileLoginHomeLoan()  
	{  
	  System.out.println("test2"); 
	  
	}  
	@Test
	public void APILoginHomeLoan()  
	{  
	  System.out.println("test3");
	}
	  @Test
		public void MotorCarloan()  
		{  
		  System.out.println("test4");
		  
	  
}
	  @Test
		public void LoanMax()  
		{  
		  System.out.println("test5");


}
}
