package com.cybertek.tests.d7_TypesOfElements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IsDisplayed {

    @Test
    public void displayed () throws InterruptedException {
        WebDriver driver= WebDriverFactory.GetDriver("chrome");
        driver.get("http:practice.cybertekschool.com/dynamic_loading/1");

        WebElement userinput=driver.findElement(By.id("username"));
        System.out.println(userinput.isDisplayed());
        Assert.assertFalse(userinput.isDisplayed(),"VERIFY USERNAME IS NOT DISPLAYED");

        WebElement login=driver.findElement(By.cssSelector("#start>button"));
        login.click();
        Thread.sleep(10000);

        Assert.assertTrue(userinput.isDisplayed(),"VERIFY THAT USER INPUT IS DISPLAYED");


        System.out.println(userinput.isDisplayed());
    }
}
