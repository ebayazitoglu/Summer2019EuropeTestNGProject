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

import javax.swing.*;

public class bDragandDrop {
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
    public void draganddrop(){
        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        WebElement smallcircle=driver.findElement(By.id("draggable"));
        WebElement bigcircle=driver.findElement(By.id("droptarget"));
        Actions action=new Actions(driver);
        action.pause(1000);

        driver.findElement(By.xpath("//button[.='Accept Cookies']")).click();

        //if you are doing a series of action, or chain action you need to add build and perform at the end
        action.dragAndDrop(smallcircle,bigcircle).perform();
        Assert.assertTrue(driver.findElement(By.xpath("//*[text()='You did great!']")).isDisplayed(),"Verify 'You did great!' diplayed");





    }
}
