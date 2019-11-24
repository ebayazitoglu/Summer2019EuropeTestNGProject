package com.cybertek.tests.d9_PopUps_Tabs_Frames;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;

public class b_MultipleWindows {
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
    public void switchWindows (){

        driver.get("http://practice.cybertekschool.com/windows");
        System.out.println("driver.getTitle() = " + driver.getTitle());
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
        //clicking click here link
        driver.findElement(By.linkText("Click Here")).click();
        System.out.println("driver.getTitle() after clicking = " + driver.getTitle());
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
       // driver.switchTo().window("")



        String currentwindowhandle= driver.getWindowHandle();
        System.out.println("currentwindowhandle = " + currentwindowhandle);

        Set<String> windowHandles= driver.getWindowHandles();
        System.out.println("windowHandles = " + windowHandles);
        System.out.println("windowHandles.size() = " + windowHandles.size());

        for(String handle:windowHandles){
            if(!currentwindowhandle.equals(handle)){
                driver.switchTo().window(handle);
            }
        }


    }

    @Test
    //More than two windows

    public void moreThan2Windows(){
        driver.get("http://practice.cybertekschool.com/windows");
        String targetWindowTitle = "New Window";
        driver.findElement(By.linkText("Click Here")).click();
        //check how many windows we have
        System.out.println(driver.getWindowHandles().size());
        Set<String> windowHandles= driver.getWindowHandles();
        //we will keep switching windows until our title equals to targetWindowTitle.
        for (String handle : windowHandles) {
            //switch them one by one
            driver.switchTo().window(handle);
            //checking if the window title equals to my target window title
            if(driver.getTitle().equals(targetWindowTitle)){
                //if they are equal stop looping.I want to keep that window driver.
                break;
            }
        }
        System.out.println("After loop title is : "+driver.getTitle());
    }

    //u can also do this with url instead of title which will work as well
}
