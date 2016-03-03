import org.testng.annotations.*;

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
    @AfterTest
    public void ThisIsAfterTest() {
        System.out.println("Test after");
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
