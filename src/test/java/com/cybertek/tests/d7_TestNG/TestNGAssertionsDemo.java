package com.cybertek.tests.d7_TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAssertionsDemo {


    @Test
    public void test1() {
        System.out.println("first assertion");
        Assert.assertEquals("one", "ones");

    }
    @Test
    public void test2(){
        System.out.println("Second asssertion");
        Assert.assertEquals("1","1");
    }

    @Test
    public void test3(){

        String actualtitle="Cybertek";
        String expectedBeginning="B";

        Assert.assertTrue(actualtitle.startsWith(expectedBeginning),"verify title starts with C");
    }

    @Test
    public void test4(){
        String emailinput="ebayazitoglu@gmail.com";
        String expectedemailsign="@";
        Assert.assertTrue(emailinput.contains(expectedemailsign), "Verify @ sign in email");
        Assert.assertTrue("ebayazitoglu@gmail.com".contains("@"),"contains @");
    }
    @Test
    public void test5notEquals(){

        Assert.assertNotEquals("one", "one"," MESSAGES DO MATCH");
    }
    @Test

    public void test6Condition(){
        //negative condition , if it is false it will not complain see test 7
        Assert.assertFalse(1<0);
    }
    @Test
    public void test7Condition(){
        Assert.assertFalse(0<1, "THE CONDITIONS IS NOT FALSE AND HENCE FAILS");
    }
}
