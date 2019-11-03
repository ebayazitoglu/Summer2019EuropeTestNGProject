package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyUrlChanges {

    public static void main(String[] args) {

        /**
         *Verify URL changed
         * open browser
         * go to http://practice.cybertekschool.com/forgot_passwordLinks to an external site.
         * enter any email
         * click on Retrieve password
         * verify that url changed to http://practice.cybertekschool.com/email_sent
         */
        // open chrome
            WebDriver driver= WebDriverFactory.GetDriver("chrome");
           // go to the link
        driver.get("http://practice.cybertekschool.com/forgot_password");
        String url=driver.getCurrentUrl();
        //enter and email
        WebElement emailInput = driver.findElement(By.name("email"));
        //sendKeys()--> send keyboard actions to WebElement

        emailInput.sendKeys("ebayazit@gmail.com");

        WebElement retrievePasswordButton =driver.findElement(By.id("form_submit"));
        retrievePasswordButton.click();

        String newUrl= driver.getCurrentUrl();
        if(newUrl.equals("http://practice.cybertekschool.com/email_sent")){
            System.out.println("Pass");
        }else{
            System.out.println("false");
        } driver.quit();









    }
}
