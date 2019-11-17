package com.cybertek.tests.Amazaon;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class facebookCss {

    public static void main(String[] args) {


        WebDriver facebook= WebDriverFactory.GetDriver("chrome");
        facebook.get("http://facebook.com");
        WebElement emailorphone=facebook.findElement(By.cssSelector("#email"));
        emailorphone.sendKeys("Ebayazitoglu@gmail.com");
    }
}
