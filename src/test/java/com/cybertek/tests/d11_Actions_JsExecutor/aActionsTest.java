package com.cybertek.tests.d11_Actions_JsExecutor;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.security.PublicKey;

public class aActionsTest {

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
    public void hovertest(){
        driver.get("http://practice.cybertekschool.com/hovers");
        //Actions=--> class that contains all the user interactions
        Actions hover =new Actions(driver);
        WebElement firstimage=driver.findElement(By.tagName("img"));
        //if you don't add perform (). the action is not completed
        hover.moveToElement(firstimage).perform();

        Assert.assertTrue(driver.findElement(By.linkText("View profile")).isDisplayed(),"VERIFY THE LINK TEXT FOR IMAGE ONE");


    }

}
