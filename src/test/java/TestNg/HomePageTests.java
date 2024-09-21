package TestNg;


import org.testng.annotations.Test;

public class HomePageTests {

    @Test(groups = "HomePageTest")
    public void testNavigateToHomePage() {
        System.out.println("Executing HomePageTests - testNavigateToHomePage");
    }

    @Test(groups = "HomePageTest")
    public void testVerifyHomePageContent() {
        System.out.println("Executing HomePageTests - testVerifyHomePageContent");
    }
}
