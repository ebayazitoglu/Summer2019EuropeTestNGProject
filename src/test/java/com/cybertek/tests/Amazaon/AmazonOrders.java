package com.cybertek.tests.Amazaon;

import com.cybertek.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonOrders {
    public static void main(String[] args) throws InterruptedException {

        WebDriver amazon= WebDriverFactory.GetDriver("firefox");
        amazon.get("https://www.amazon.co.uk/ap/signin?_encoding=UTF8&ignoreAuthState=1&openid.assoc_handle=gbflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.co.uk%2F%3Fref_%3Dnav_signin&switch_account=");

        WebElement enterEmail =amazon.findElement(By.id("ap_email"));
        enterEmail.sendKeys("ebayazitoglu@gmail.com");
        WebElement clickButtons= amazon.findElement(By.id("continue"));
        clickButtons.click();
        WebElement enterPassword =amazon.findElement(By.id("ap_password"));
        enterPassword.sendKeys("Ebubekir78");
        WebElement clicksigninButton=amazon.findElement(By.id("signInSubmit"));
        clicksigninButton.click();
        WebElement orders=amazon.findElement(By.id("nav-orders"));
        orders.click();

        Thread.sleep(10000);
        amazon.quit();


    }
}
