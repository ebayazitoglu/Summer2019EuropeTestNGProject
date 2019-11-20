package com.cybertek.tests.d8_TypesofElements_PART2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class DropDownList {
 @Test
    public void dropdowndemo() throws InterruptedException {

        WebDriver driver = WebDriverFactory.GetDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");

        WebElement dropdownElement = driver.findElement(By.id("state"));

        //create a Select object by passing the element as a constructor so as to reach the dropdown
     //methods

     Select stateList= new Select(dropdownElement);
     System.out.println(stateList.getAllSelectedOptions());
     //getOptions returns all the available options from the dropdown
     List<WebElement> options= stateList.getOptions();
     for (WebElement option : options) {
         System.out.println(option.getText());
     }
         //verify thatthe first option is Select State
         String actualOption =stateList.getFirstSelectedOption().getText();
         System.out.println("actualOption = " + actualOption);
     Assert.assertEquals(actualOption,"Select a State","VERIFY THE FIRTSMESSAGE IS SELECT STATE");

// how to select options from the dropdown

     //1- Use Visible Text
     Thread.sleep(5000);
     actualOption="Texas";
     stateList.selectByVisibleText("Texas");
     Assert.assertEquals(actualOption,"Texas","VERIFY TEXAS IS SELECTED ");

     //Using INDEX Number
     //taking from 0
     Thread.sleep(2000);
        stateList.selectByIndex(51);

//3 Using VALUE Attributes

    stateList.selectByValue("VA");
     driver.quit();
    }


}