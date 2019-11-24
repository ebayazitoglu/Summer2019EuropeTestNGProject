package com.cybertek.tests.d9_PopUps_Tabs_Frames;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class a_PopUpsandAlerts {

    WebDriver driver;
    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverFactory.GetDriver("chrome");
    }
    @AfterMethod
    public void tearDownMethod() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
    @Test
    public void htmlPopUp(){
        driver.get("https://www.primefaces.org/showcase/ui/overlay/confirmDialog.xhtml");
        //locating and clicking destroy button
        driver.findElement(By.xpath("//*[text()='Destroy the World']")).click();
        //locating No button and clicking it
        driver.findElement(By.xpath("//*[text()='No']")).click();
    }
    @Test
    public void Alerts() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/javascript_alerts");
        //Click for JS Alert
        driver.findElement(By.xpath("//button[1]")).click();
        //Controling alert using with Alert class
        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
        //accept alert --> clicking ok in the alerts
        alert.accept();
        Thread.sleep(2000);
    }
    @Test
    public void AlertsDismiss() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/javascript_alerts");
        //Click for JS Alert
        driver.findElement(By.xpath("//button[1]")).click();
        //Controling alert using with Alert class
        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
        //dismiss alert --> clicking ok in the alerts
        alert.dismiss();
        Thread.sleep(5000);
    }
    @Test
    public void AlertsSendKeys() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/javascript_alerts");
        //Click for JS Alert
        driver.findElement(By.xpath("//button[3]")).click();
        //Controling alert using with Alert class
        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
        //send keys --> clicking ok in the alerts
        alert.sendKeys("Mark Smith");
        Thread.sleep(2000);
        alert.accept();
    }
}
