package com.cybertek.tests.d14_PomTests;

import com.cybertek.pages.CalendarEventsPage;
import com.cybertek.pages.DashboardPage;
import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import com.cybertek.utilities.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class cPageSubtitleTest extends TestBase {



   @Test
    public void verifySubtitle(){

       LoginPage loginPage=new LoginPage();
       String username=ConfigurationReader.get("driver_username");
       String password=ConfigurationReader.get("driver_password");
       loginPage.login(username, password);
       loginPage.loginBtn.click();

       DashboardPage dashboardPage=new DashboardPage();
       String pagesubtitle=dashboardPage.getPageSubTitle();
       Assert.assertEquals(pagesubtitle,"Quick Launchpad","VERIFY THE PAGE SUBTITLE IS QUICK LAUNCHPAD");

       dashboardPage.navigateToModule("Activities", "Calendar Events");
       CalendarEventsPage calendarEventsPage=new CalendarEventsPage();
       Assert.assertEquals(calendarEventsPage.getPageSubTitle(),"Calendar Events", "VERIFY SUBTITLE");

       calendarEventsPage.createCalendarEvent.click();

   }


}
