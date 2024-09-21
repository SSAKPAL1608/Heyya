package TestNg;



import org.testng.annotations.Test;

public class LoginTests {

    @Test(groups = "LoginTest")
    public void testLogin() {
        System.out.println("Executing LoginTests - testLogin");
    }

    @Test(groups = "LoginTest")
    public void testForgotPassword() {
        System.out.println("Executing LoginTests - testForgotPassword");
    }
}
