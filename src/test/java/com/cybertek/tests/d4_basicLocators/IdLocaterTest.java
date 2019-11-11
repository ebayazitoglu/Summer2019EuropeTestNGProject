package com.cybertek.tests.d4_basicLocators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IdLocaterTest {
    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.GetDriver("chrome");
        //maximize the browwer to fullscreen

        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        WebElement dontclickbutton=driver.findElement(By.id("disappearing_button"));
                dontclickbutton.click();





    }



}
