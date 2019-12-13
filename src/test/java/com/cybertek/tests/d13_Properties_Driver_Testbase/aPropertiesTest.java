package com.cybertek.tests.d13_Properties_Driver_Testbase;

import com.cybertek.utilities.ConfigurationReader;
import org.testng.annotations.Test;

public class aPropertiesTest {

    @Test
    public void test1(){

        String page= ConfigurationReader.get("browser");
        System.out.println(page);
        System.out.println(ConfigurationReader.get("url"));
        System.out.println(ConfigurationReader.get("salesmanager_username"));
        System.out.println(ConfigurationReader.get("salesmanager_password"));
        // if your key does not exist in the source file it will return "null"
        System.out.println(ConfigurationReader.get("sroremanager"));
        // if you have duplicate of the same key = value it will give out the last one

    }
}
