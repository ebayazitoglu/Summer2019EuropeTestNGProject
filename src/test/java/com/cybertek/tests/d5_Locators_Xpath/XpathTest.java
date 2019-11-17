package com.cybertek.tests.d5_Locators_Xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class XpathTest {

    public static void main(String[] args) {


        WebDriver driver = WebDriverFactory.GetDriver("chrome");
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/multiple_buttons");


        WebElement homeLink = driver.findElement(By.xpath("/html/body/nav/ul/li/a"));
        // homeLink.click();

        WebElement button1 = driver.findElement(By.xpath("//button[@onclick='button5()']"));
        button1.click();


        driver.get("http://practice.cybertekschool.com/sign_up");
        WebElement signup = driver.findElement(By.xpath("//*[.='Sign Up']"));


        driver.get("http://www.amazon.com");
        WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
        search.sendKeys("bayazitoglu");
        WebElement serachbutton = driver.findElement(By.xpath("//*[@value='Go']"));
        serachbutton.click();

        WebElement finddetails = driver.findElement(By.xpath("//*[@class='a-section a-spacing-small a-spacing-top-small']"));
        System.out.println(finddetails.getText());






    }



}
