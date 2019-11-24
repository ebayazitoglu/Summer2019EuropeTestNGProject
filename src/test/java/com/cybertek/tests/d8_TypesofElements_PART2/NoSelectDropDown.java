package com.cybertek.tests.d8_TypesofElements_PART2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class NoSelectDropDown {

    @Test
    public void test1() throws InterruptedException {
        WebDriver driver= WebDriverFactory.GetDriver("Chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");

        WebElement dropdown=driver.findElement(By.id("dropdownMenuLink"));

        // Select links=new Select(dropdown);
        //this will not work and will give an erro message  UnexpectedTagNameException as is not selectable
        // instead Will need to use click (); method

        dropdown.click();


        List<WebElement> listofLinks=driver.findElements(By.className("dropdown-item"));
       // System.out.println("listofLinks = " + listofLinks);

        System.out.println("listofLinks.size() = " + listofLinks.size());

        System.out.println("listofLinks.get(0).getText() = " + listofLinks.get(0).getText());
        System.out.println("-----------------------");
        for (WebElement link:listofLinks){
            System.out.println(link.getText());
        }
        // locate the element and click it

        //driver.findElement(By.linkText("Yahoo")).click();


        // index of the link and click

        listofLinks.get(3).click();


        driver.quit();
    }
}
