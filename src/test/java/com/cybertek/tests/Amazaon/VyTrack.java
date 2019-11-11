package com.cybertek.tests.Amazaon;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VyTrack {

    public static void main(String[] args) {

        WebDriver vyTrack= WebDriverFactory.GetDriver("firefox");
        vyTrack.get("http://qa1.vytrack.com/user/login");

        WebElement enterUser =vyTrack.findElement(By.id("prependedInput"));

            enterUser.sendKeys("user1");

        WebElement enterPassword =vyTrack.findElement(By.id("prependedInput2"));
            enterPassword.sendKeys("UserUser123");

        WebElement clickButtons= vyTrack.findElement(By.id("_submit"));
        clickButtons.click();
     //  WebElement vehicles=vyTrack.g("https://qa1.vytrack.com/entity/Extend_Entity_Carreservation");

    }
}
