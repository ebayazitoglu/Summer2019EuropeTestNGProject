package com.cybertek.tests.d4_basicLocators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import javax.swing.text.PasswordView;

public class nameLocator {


    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.GetDriver("chrome");
        driver.get("http://practice.cybertekschool.com/sign_up");
        WebElement name=driver.findElement(By.name("full_name"));
        name.sendKeys("Ebubekir BAYAZITOGLI");
        WebElement email=driver.findElement(By.name("email"));
        email.sendKeys("ebayazitoglu@gmail.com");
        WebElement submit=driver.findElement(By.name("wooden_spoon"));
        submit.click();
        WebElement signupmessage=driver.findElement(By.name("signup_message"));
        String message=signupmessage.getText();
        System.out.println("signupmessage = " + signupmessage);
        String actualMessage= "Thank you for signing up. Click the button below to return to the home page.";


            if(message.equals(actualMessage)){
                System.out.println("PASS");
                }else {
            System.out.println("fail");
        }

        System.out.println("neoluyir");
    }
}
