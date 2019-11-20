package com.cybertek.tests.AsiyaAutomation;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VyTrackLogin {

    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.GetDriver("chrome");
        driver.get("https://qa1.vytrack.com/entity/Extend_Entity_VehicleCosts");
        WebElement email=driver.findElement(By.id("prependedInput"));
        email.sendKeys("salesmanager101");

        WebElement password=driver.findElement(By.id("prependedInput2"));
        password.sendKeys("UserUser123");

        WebElement submit=driver.findElement(By.id("_submit"));
        submit.click();

        String actualurl="https://qa1.vytrack.com/entity/Extend_Entity_VehicleCosts";
        if(driver.getCurrentUrl().equals(actualurl)){
            System.out.println("pass");
        } else {
            System.out.println("FAIL");
            System.out.println(driver.getCurrentUrl());
            System.out.println("actualurl = " + actualurl);
        }
      //  driver.quit();






    }
}
