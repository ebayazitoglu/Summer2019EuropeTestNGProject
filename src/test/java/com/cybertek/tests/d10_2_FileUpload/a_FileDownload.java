package com.cybertek.tests.d10_2_FileUpload;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class a_FileDownload {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.GetDriver("chrome");

    }

    @AfterMethod
    public void tearDownMethod() throws InterruptedException {

        driver.quit();
    }

    @Test
    public void test1(){

        driver.get("http://practice.cybertekschool.com/upload");
        driver.findElement(By.name("file")).sendKeys("C:\\Users\\User\\Desktop\\file.txt");
        driver.findElement(By.id("file-submit")).click();
        String  verifymessage=driver.findElement(By.xpath("//h3")).getText();
        String message="File Uploaded!";
        System.out.println("verifymessage.equals(message) = " + verifymessage.equals(message));
        System.out.println("--------alternatively and better way---IT WILL ONLY PRINT IF THERES A PROBLEM");

        String actualMessage=driver.findElement(By.id("uploaded-files")).getText();
        Assert.assertEquals(actualMessage,"file.txt","verify the file name");

    }
}
