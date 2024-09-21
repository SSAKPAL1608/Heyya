package TestNg;
import static org.testng.Assert.assertFalse;

import org.testng.annotations.Test;
  
public class Home_loan   
{  
	
	
@Test(groups= {"SmokeTest"})  
public void WebLoginHomeLoan()  
{  
  System.out.println("test1");  
}  
@Test(groups= {"SmokeTest"})  
public void MobileLoginHomeLoan()  
{  
  System.out.println("test2"); 
  
}  
@Test  (groups= {"RegressionTest","SmokeTest"})
public void APILoginHomeLoan()  
{  
  System.out.println("test3");
  
  
 }  
  
}  