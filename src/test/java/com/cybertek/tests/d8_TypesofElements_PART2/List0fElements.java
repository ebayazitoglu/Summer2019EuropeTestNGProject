package com.cybertek.tests.d8_TypesofElements_PART2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import java.util.List;

public class List0fElements {

    @Test
    public void listOfElements(){

        WebDriver driver= WebDriverFactory.GetDriver("chrome");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        List<WebElement> buttons= driver.findElements(By.tagName("button"));

        System.out.println("buttons.size() = " + buttons.size());
        Assert.assertEquals(buttons.size(),6,"VERIFY THAT BUTTON HAS 6 ELEMENT");

        for (WebElement button : buttons) {
            System.out.println("button.getText() = " + button.getText());

        }




    }


    @Test
    public void test2(){

        WebDriver driver= WebDriverFactory.GetDriver("chrome");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        List<WebElement> buttons= driver.findElements(By.tagName("buttonasd"));
    /* Even if the List webelements cannot find the elemenets it will stull not give an erro
    this is because the list array will staill have a value of 0 size even if there i nothing in iyt.
    so it will not give an error
     */
        System.out.println("buttons.size() = " + buttons.size());

        driver.quit();
    }

}
