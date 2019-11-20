package com.cybertek.tests.d8_TypesofElements_PART2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AttributeTest {
    @Test
    public void attribute(){
        WebDriver driver= WebDriverFactory.GetDriver("chrome");
        driver.get("http://practice.cybertekschool.com/radio_buttons");

        WebElement button1=driver.findElement(By.id("blue"));

        System.out.println(button1.getAttribute("name"));

        System.out.println(button1.getAttribute("id"));

        System.out.println(button1.getAttribute("type"));

        System.out.println(button1.getAttribute("href"));

        System.out.println(button1.getAttribute("checked"));

        System.out.println(button1.getAttribute("value"));

        System.out.println(button1.getAttribute("outerHTML"));
        System.out.println(button1.getAttribute("innerHTML"));



    }
}
