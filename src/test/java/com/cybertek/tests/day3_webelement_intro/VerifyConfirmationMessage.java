package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyConfirmationMessage {
    /**
     * Verify confirmation message
     * open browser
     * go to http://practice.cybertekschool.com/forgot_password Links to an external site.
     * enter any email
     * verify that email is displayed in the input box
     * click on Retrieve password
     * verify that confirmation message says 'Your e-mail's been sent!'
     */
    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.GetDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");

        WebElement emailInput=driver.findElement(By.name("email"));
        String expectedEmail ="test@gmail.com";

        //send the  email

        emailInput.sendKeys(expectedEmail);

        //make sure the email is typed in, verify the email
        //getting text from WebElements
        // getText()-->get text from web element
        //getAttribute()--> get value of attributes
        //text does not always get the value from the input boxes. these are gererally seen as "value"
        //and you should use this for input boxes

        String actualEmail=emailInput.getText();

        if(expectedEmail.equals(actualEmail)){
            System.out.println("pass");
        }else{
            System.out.println("false");
            System.out.println("expectedEmail = " + expectedEmail);
            System.out.println("actualEmail =" +actualEmail);
        }
            actualEmail=emailInput.getAttribute("value");
        if(expectedEmail.equals(actualEmail)){
            System.out.println("pass");
        }else{
            System.out.println("false");
            System.out.println("expectedEmail = " + expectedEmail);
            System.out.println("actualEmail =" +actualEmail);
        }
        //click the retrieve password button
        WebElement retrievePasswordButton= driver.findElement(By.id("form_submit"));
        retrievePasswordButton.click();
        //verify that the confirmation message says the expected message
        String expectedMessage ="Your e-mail's been sent!";
        WebElement givenMessage = driver.findElement(By.name("confirmation_message"));
        System.out.println(givenMessage);
        String actualMessage = givenMessage.getAttribute("value");
        System.out.println(actualMessage);
         //this time the getAttribute is not working , we should use getText
        actualMessage=givenMessage.getText();
        System.out.println(actualMessage);
        if(expectedMessage.equals(actualMessage)){
            System.out.println("Pass");
        }else {
            System.out.println("fail");
        }
        driver.quit();


    }
}
