package com.cybertek.tests.d7_TestNG;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class BeforeAndAfterTest {


    @Test

   public void test1 (){
        System.out.println("this is test1");
    }

    @Ignore
    @Test
    public void test2(){
        System.out.println("Test 2");
    }
    @Test
    public void test3(){
        System.out.println("Test 3");
    }
        @BeforeMethod
    public void setUpMethod(){
            System.out.println("BEFORE METHOD");
            System.out.println("OPENING THE BROWSER");
            System.out.println("Before Method will run this before every test not just once");
            //WebDriver driver= WebDriverFactory.GetDriver("chrome");


        }


        @AfterMethod
    public void tearDown(){
            System.out.println("Close METHOD");
        }

        @BeforeClass

    public void beforeClassmethod (){
            System.out.println("BEFORE CLASS- will run before the class just once and will not repeat it for each test");
            System.out.println("Same is for @AFTER CLASS");
            System.out.println("============================");
        }
        @AfterClass
        public void afterClass(){
            System.out.println("AFTER CLASS");
            System.out.println("========!!£$%^&*()=====================");
        }

}
