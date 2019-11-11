package com.cybertek.tests.d4_basicLocators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TagName {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.GetDriver("chrome");
        driver.get("http://practice.cybertekschool.com/sign_up");
        WebElement name=driver.findElement(By.tagName("input"));
        name.sendKeys("Name with tag");

        WebElement email=driver.findElement(By.tagName("input"));
        email.sendKeys("ebayazitoglu@gmail.com");
        //this one will not go tpo the email input as tagname only goes to the first one with same tag name

        WebElement email1=driver.findElement(By.name("email"));
        email1.sendKeys("secret@gmail.com");

        WebElement submit=driver.findElement(By.name("wooden_spoon"));
                submit.click();

                WebElement message=driver.findElement(By.tagName("h3"));
                String message1= message.getText();

                if(message1.equals("Thank you for signing up. Click the button below to return to the home page.")){

                    System.out.println("pass");
                }else{
                    System.out.println("fail");

                }

    }




}
