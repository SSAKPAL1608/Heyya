package TestNg;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DP {

    @Test(dataProvider = "providedata")
    public void testMethod(String parameter1, int parameter2) {
        System.out.println("Parameter 1: " + parameter1);
        System.out.println("Parameter 2: " + parameter2);
        System.out.println("Parameter 3: " + parameter2);
    }
   

   @DataProvider(name = "providedata")
    public Object[][] dataProviderMethod() {
        return new Object[][]{
                {"Value1", 1},
                {"Value2", 2},
                {"Value3", 3}
        };
    }
}
