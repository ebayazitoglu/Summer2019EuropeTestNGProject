package com.cybertek.tests.d7_TypesOfElements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DisabledElementTest {

    @Test
    public void test1(){
        WebDriver driver= WebDriverFactory.GetDriver("chrome");

        driver.get("http://practice.cybertekschool.com/radio_buttons");
        WebElement green=driver.findElement(By.id("green"));

        System.out.println("green.isEnabled() = " + green.isEnabled());

        Assert.assertFalse(green.isEnabled(),"VERIFY GREEN BUTTON IS NOT ENABLED");

        green.click();
        driver.quit();

    }
    @Test
    public void test2(){
        WebDriver driver= WebDriverFactory.GetDriver("chrome");

        driver.get("http://practice.cybertekschool.com/dynamic_controls");

        WebElement inputBox=driver.findElement(By.cssSelector("#input-example>input"));
        System.out.println("inputBox.isEnabled() = " + inputBox.isEnabled());
        inputBox.sendKeys("Mike Smith");

    }
}
