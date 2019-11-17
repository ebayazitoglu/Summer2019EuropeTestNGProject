package com.cybertek.tests.d7_TypesOfElements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtontest {

    @Test
    public void radioButton(){

        WebDriver driver=WebDriverFactory.GetDriver("chrome");
        driver.get("http://practice.cybertekschool.com/radio_buttons");

        WebElement blue=driver.findElement(By.id("blue"));
        WebElement red=driver.findElement(By.id("red"));

                // check if the radio button is selected or not isSelected

        System.out.println("blue is selected"+ blue.isSelected());
        System.out.println("red.isSelected() = " + red.isSelected());

       Assert.assertTrue(blue.isSelected(),"VERIFY BLUE IS SELECTED");
       Assert.assertFalse(red.isSelected(),"verify that red is not selected");

       //red.click();
        System.out.println("blue is selected"+ blue.isSelected());
        System.out.println("red.isSelected() = " + red.isSelected());

        Assert.assertTrue(red.isSelected(),"VERIFY RED IS SELECTED");
        Assert.assertFalse(blue.isSelected(),"VERIFY BLUE IS NOT SELECTED");


    }
}
