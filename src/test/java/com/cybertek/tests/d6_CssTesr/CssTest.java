package com.cybertek.tests.d6_CssTesr;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CssTest {

    public static void main(String[] args) {


            WebDriver driver = WebDriverFactory.GetDriver("CHROME");

            driver.get("http://practice.cybertekschool.com/multiple_buttons");
            WebElement dontClickButton = driver.findElement(By.cssSelector("#disappearing_button"));
            String message = dontClickButton.getText();
            System.out.println("message = " + message);

            WebElement button1=driver.findElement(By.cssSelector(".btn btn primary"));
            String meesage1= button1.getText();
        System.out.println("button1 = " + button1);
    }



}
