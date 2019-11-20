package com.cybertek.tests.d8_TypesofElements_PART2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBoxes {

    @Test
            public void Checkbox() {
        WebDriver driver = WebDriverFactory.GetDriver("chrome");
        driver.get("http://practice.cybertekschool.com/checkboxes");
        WebElement checkbox1=driver.findElement(By.xpath("//input"));
        WebElement checkbox2=driver.findElement(By.xpath("//input[2]"));

        Assert.assertFalse(checkbox1.isSelected(),"VERIFY CHECK BOX 1 IS UNSELECTED");
        Assert.assertTrue(checkbox2.isSelected(),"verify that CHECKBOX 2 IS SELECTED");

        checkbox1.click();
        Assert.assertTrue(checkbox1.isSelected(),"VERIFY CHECK BOX 1 IS UNSELECTED");


    }
}
