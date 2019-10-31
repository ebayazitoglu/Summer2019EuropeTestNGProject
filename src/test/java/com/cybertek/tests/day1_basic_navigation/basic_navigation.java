package com.cybertek.tests.day1_basic_navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class basic_navigation {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();;

        WebDriver driver= new ChromeDriver();

        driver.get("http://brainboxitsolutions.co.uk/");
        System.out.println(driver.getTitle());
        driver.get("http://premieraccounting.co.uk/");

        System.out.println(driver.getTitle());

    }
}
