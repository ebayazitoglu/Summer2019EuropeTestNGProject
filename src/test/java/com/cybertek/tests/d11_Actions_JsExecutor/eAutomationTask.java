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

public class eAutomationTask {

    WebDriver driver;
    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverFactory.GetDriver("chrome");
    }
    @AfterMethod
    public void tearDownMethod() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
    @Test
    public void test1(){
        driver.get("http://practice.cybertekschool.com/hovers");

        for (int i = 1; i < 4; i++) {
            String imageXpath="(//img)["+i+"]";
            System.out.println("imageXpath = " + imageXpath);
            WebElement img =driver.findElement(By.xpath(imageXpath));

            Actions act=new Actions(driver);
            act.pause(5000);
            act.moveToElement(img).perform();

            String textXpath="//h5[.='name: user"+i+"']";
            System.out.println("textXpath = " + textXpath);
            WebElement text = driver.findElement(By.xpath(textXpath));
            Assert.assertTrue(text.isDisplayed());
        }
    }
}
