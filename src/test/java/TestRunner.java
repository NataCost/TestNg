import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by Nata_Cost on 03.03.2016.
 */
public class TestRunner {
    @BeforeMethod
    public  void  ThisBeforeTestMethod(){
        System.out.println("Method before");
    }
    @BeforeTest
    public void ThisIsBeforeTest(){
        System.out.println("Test before");
    }
    @AfterMethod
    public void ThisAfterTestMethod() {
        System.out.println("Method after");
    }

    @Test
    public void ThisIsTestMethod1(){
        System.out.println("Method 1");

    }
    @Test
    public void ThisIsTestMethod2(){

        System.out.println("Method 2");
    }
    @Test
    public void ThisIsTestMethod3(){
        System.out.println("Method 3");

    }


}
