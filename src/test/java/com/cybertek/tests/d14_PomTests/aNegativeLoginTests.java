package com.cybertek.tests.d14_PomTests;

import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class aNegativeLoginTests extends TestBase {

    @Test
    public void wrongPasswordTest(){


        LoginPage loginpage=  new LoginPage();
        loginpage.usernameInput.sendKeys("user1");
        loginpage.passwordInput.sendKeys("UserUser");
        loginpage.loginBtn.click();

        Assert.assertEquals(driver.getCurrentUrl(), "https://qa3.vytrack.com/user/login");
    }

    @Test
    public void wrongUsername(){


        LoginPage loginpage=  new LoginPage();
        loginpage.usernameInput.sendKeys("user");
        loginpage.passwordInput.sendKeys("UserUser123");
        loginpage.loginBtn.click();

        Assert.assertEquals(driver.getCurrentUrl(), "https://qa3.vytrack.com/user/login");
    }




}
