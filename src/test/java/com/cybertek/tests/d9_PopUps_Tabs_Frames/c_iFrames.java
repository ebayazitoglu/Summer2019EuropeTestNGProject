package com.cybertek.tests.d9_PopUps_Tabs_Frames;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.swing.text.html.HTML;

public class c_iFrames {
    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.GetDriver("chrome");
    }

    @AfterMethod
    public void tearDownMethod() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void test1() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/iframe");
        //HOW TO SWITCH FRAMES
        //1.Switch by using name or id attribute of iframe
        driver.switchTo().frame("mce_0_ifr");
        //clear the text inside the box
        driver.findElement(By.id("tinymce")).clear();
        //locate and send some text
        driver.findElement(By.id("tinymce")).sendKeys("We Use Name Or ID");
        //go back to first frame,useful when we have switched multiple frames
        driver.switchTo().defaultContent();
        Thread.sleep(2000);
        //2.USING INDEX
        driver.switchTo().frame(0);
        driver.findElement(By.id("tinymce")).clear();
        //locate and send some text
        driver.findElement(By.id("tinymce")).sendKeys("We Used index Here");
        //go back to first frame, only to parent
        driver.switchTo().parentFrame();
        //3.USING WEBELEMENT
        //locating iframe with any valid locator
        WebElement frameElement = driver.findElement(By.tagName("iframe"));
        Thread.sleep(2000);
        //passing frame as a webelement
        driver.switchTo().frame(frameElement);
        driver.findElement(By.id("tinymce")).clear();
        //locate and send some text
        driver.findElement(By.id("tinymce")).sendKeys("We Located with WebElement");
    }

    @Test

    public void frames (){
        driver.get("http://practice.cybertekschool.com/nested_frames");

     /*   HTML
        > FRAME TOP
                >frame left
                >frame middle
                >frame right
        > frame bottom

        you cant switch two levels at a time you have to go one by one
       */

     driver.switchTo().frame("frame-top");
     // to go to middle frame , switching to top frame first
        driver.switchTo().frame("frame-middle");
        // You CANNOT switch from from middle frame to frame right ,
        // to do this you need to go back to parent
        driver.switchTo().parentFrame();
        // and then  go to frame right
        //switching to frame right using index
        driver.switchTo().frame(2);
        System.out.println("driver.findElement(By.tagName(\"body\")).getText() = " + driver.findElement(By.tagName("body")).getText());

        // go back to HTML main
        driver.switchTo().defaultContent();
        //now switchto bottom frame
        //index number can be used too
        driver.switchTo().frame(1);
        System.out.println("driver.findElement(By.tagName(\"body\")).getText() = " + driver.findElement(By.tagName("body")).getText());

        //now go to left
        driver.switchTo().defaultContent();
        driver.switchTo().frame(0);
        driver.switchTo().frame("frame-left");
        System.out.println("driver.findElement(By.tagName(\"body\")).getText() = " + driver.findElement(By.tagName("body")).getText());

    }
}