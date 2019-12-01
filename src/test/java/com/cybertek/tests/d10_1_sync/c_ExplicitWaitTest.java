package com.cybertek.tests.d10_1_sync;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class c_ExplicitWaitTest {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.GetDriver("chrome");

    }

    @AfterMethod
    public void tearDownMethod() throws InterruptedException {

        driver.quit();
    }

    @Test
    public void test1(){
        driver.get("http://practice.cybertekschool.com/dynamic_loading/1");
        //click the start button
        driver.findElement(By.tagName("button")).click();

        // fins username inputbox
        WebElement username=driver.findElement(By.id("username"));

        //how to wait explicitly
        WebDriverWait wait= new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOf(username));

        username.sendKeys("Mike Smith");
    }
    public void test2(){
        driver.get("http://practice.cybertekschool.com/dynamic_controls");;

        //click enable

        driver.findElement(By.xpath("//button[contains(text(),'Enable')]"));

        //find input box

        WebElement inputbox=driver.findElement(By.cssSelector("input[type='text']"));

        //wait until inputbox is enabled or clickable
        // create object to wait

        WebDriverWait wait=new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(inputbox));
        //type something in the inputbox

        inputbox.sendKeys("Something something");

    }
}
