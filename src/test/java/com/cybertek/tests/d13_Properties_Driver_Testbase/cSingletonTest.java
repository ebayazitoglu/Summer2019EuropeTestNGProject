package com.cybertek.tests.d13_Properties_Driver_Testbase;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class cSingletonTest {
    @Test
    public void test(){

        //bSingleton s1= new bSingleton();
        // giving error because we created a private constructor

        String s1= bSingleton.getInstance();
        System.out.println("s1 = " + s1);
        String s2= bSingleton.getInstance();
        System.out.println("s2, now it has the value already = " + s2);

    }
    @Test
    public void test2(){
        //this is how we did it up till now
       /*
       WebDriver driver= WebDriverFactory.GetDriver("chrome");
        driver.get("http://google.com");
        */
       // this is how we will create WebDriver object from now on
        //type of the driver will come from configuration.properties file

       WebDriver driver= Driver.get();
       //getting the url from the configuration.properties file
       driver.get(ConfigurationReader.get("url"));

       Driver.get().navigate().refresh();

    }
    @Test
    public void test3() throws InterruptedException {
        Thread.sleep(Long.parseLong("3000"));
        Driver.get().get("http://ensonhaber.com");//you can also use it this way and no need to creat an object

        //if we are using Driver close, we use closedRIVER METHOD
        //Driver.closeDriver();
    }
}
