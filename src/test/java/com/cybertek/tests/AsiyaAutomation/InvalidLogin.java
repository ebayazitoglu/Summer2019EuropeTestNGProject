package com.cybertek.tests.AsiyaAutomation;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InvalidLogin {
    public static void main(String[] args) {
        //*[contains(text(),'Invalid user name or password.')]

        //Negative test scenerio
        WebDriver driver= WebDriverFactory.GetDriver("chrome");

        driver.get("https://qa1.vytrack.com/user/login");

        WebElement username = driver.findElement(By.id("prependedInput"));
        username.sendKeys("user12");

        WebElement password = driver.findElement(By.name("_password"));
        password.sendKeys("UserUser1234");

        WebElement loginButton = driver.findElement(By.id("_submit"));
        loginButton.click();

        WebElement invalidMessage = driver.findElement(By.xpath("//*[contains(text(),'Invalid user name or password.')]"));

        String expectedMessage = "Invalid user name or password.";
        String actualMessage = invalidMessage.getText();

        if (expectedMessage.equals(actualMessage)) {
            System.out.println(" invalid login message matches the expected message PASS");
            } else {
            System.out.println("FAIL");
            System.out.println("expectedMessage = " + expectedMessage);
            System.out.println("actualMessage = " + actualMessage);
        }
        driver.quit();
    }

}