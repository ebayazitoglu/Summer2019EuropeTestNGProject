package com.cybertek.tests.d14_PomTests;

import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import com.cybertek.utilities.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class bPositiveLoginTest extends TestBase {

    @Test
    public void loginAsDriver() {
        LoginPage loginPage = new LoginPage();

        String username = ConfigurationReader.get("driver_username");
        String password = ConfigurationReader.get("driver_password");
        loginPage.login(username, password);
        loginPage.loginBtn.click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://qa3.vytrack.com/");

    }

    @Test
    public void loginAsStoreManager() {
        LoginPage loginPage = new LoginPage();

        String username = ConfigurationReader.get("storemanager_username");
        String password = ConfigurationReader.get("storemanager_password");
        loginPage.login(username, password);
        loginPage.loginBtn.click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://qa3.vytrack.com/");
    }
    public void TestCase() {
        LoginPage loginPage = new LoginPage();

        String username = ConfigurationReader.get("driver_username");
        String password = ConfigurationReader.get("driver_password");
        loginPage.login(username, password);
        loginPage.loginBtn.click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://qa3.vytrack.com/");

    }

}
