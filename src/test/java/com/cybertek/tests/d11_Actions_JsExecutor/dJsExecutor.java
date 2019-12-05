package com.cybertek.tests.d11_Actions_JsExecutor;

import com.cybertek.utilities.WebDriverFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class dJsExecutor {

    WebDriver driver;
    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverFactory.GetDriver("chrome");
    }
    @AfterMethod
    public void tearDownMethod() throws InterruptedException {
        Thread.sleep(20000);
        driver.quit();
    }

    @Test
    public void click(){
        driver.get("http://practice.cybertekschool.com");

        WebElement link=driver.findElement(By.linkText("Dropdown"));
        //create jsexecutor
        //run js code with that object

        //how to create a jse object
        JavascriptExecutor jse=(JavascriptExecutor) driver;
        //clicking using jse
        jse.executeScript("arguments[0].click();",link);

    }
    @Test
    public void type(){
                   driver.get("http://practice.cybertekschool.com/dynamic_controls");
            WebElement inputbox = driver.findElement(By.cssSelector("input[type='text']"));
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            String str = "hello disable inputbox";
            jse.executeScript("arguments[0].setAttribute('value', '" + str + "')", inputbox);
        }

        @Test
        public void scroll() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/infinite_scroll");

        JavascriptExecutor jse=(JavascriptExecutor) driver;
//            for (int i = 0; i < 10; i++) {
//                Thread.sleep(3000);


                jse.executeScript("window.scrollBy(10,250)");
           // }
        }
    }


