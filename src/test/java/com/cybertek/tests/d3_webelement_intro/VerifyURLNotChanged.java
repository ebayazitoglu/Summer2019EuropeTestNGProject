package com.cybertek.tests.d3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyURLNotChanged {
    public static void main(String[] args) {
        /**
         * open chrom
         * go to http://practice.cybertekschool.com/forgot_passwordLinks to an external site.
         * click on Retrieve password
         * verify that url did not change
         */

        WebDriver driver=WebDriverFactory.GetDriver("chrome");

        driver.get("http://practice.cybertekschool.com/forgot_password");

        //retrieve password

        WebElement retrievePasswordButton =driver.findElement(By.id("form_submit"));

        String expectedUrl= driver.getCurrentUrl();
        retrievePasswordButton.click();

        String actualUrl = driver.getCurrentUrl();

        if (expectedUrl.equals(actualUrl)){
            System.out.println("Pass");
        }else {
            System.out.println("False");
        }driver.quit();

    }




}
