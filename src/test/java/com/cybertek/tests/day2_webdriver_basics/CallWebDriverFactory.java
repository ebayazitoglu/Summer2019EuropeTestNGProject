package com.cybertek.tests.day2_webdriver_basics;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class CallWebDriverFactory {

    public static WebDriverFactory getDriver("chrome") {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://google.com");

        return driver = null;

    }




    }

}
