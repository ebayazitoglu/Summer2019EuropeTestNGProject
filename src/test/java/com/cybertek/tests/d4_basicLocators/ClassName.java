package com.cybertek.tests.d4_basicLocators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClassName {

    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.GetDriver("chrome");
        driver.get("http://practice.cybertekschool.com/sign_up");

        WebElement homelink= driver.findElement(By.className("nav-link"));
                homelink.click();

    }
}
