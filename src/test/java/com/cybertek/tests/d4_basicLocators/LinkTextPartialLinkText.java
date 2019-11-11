package com.cybertek.tests.d4_basicLocators;

import com.cybertek.utilities.WebDriverFactory;
import com.google.gson.internal.$Gson$Preconditions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LinkTextPartialLinkText {
    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.GetDriver("chrome");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        WebElement hello=driver.findElement(By.className("h3"));
        String print=hello.getText();
        System.out.println(print);
// up till here it was under classname
        driver.get("http://practice.cybertekschool.com/dynamic_loading");
        WebElement link1= driver.findElement(By.linkText("Example 1: Element on page that is hidden and become visible after trigger"));
        link1.click();

        WebElement home=driver.findElement(By.className("nav-link"));
        home.click();

        driver.navigate().back();
        driver.navigate().back();

        WebElement link6=driver.findElement(By.partialLinkText("Example 6"));
        link6.click();
    }
}
