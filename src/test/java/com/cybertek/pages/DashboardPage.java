package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class DashboardPage extends BasePage {

    public DashboardPage(){
        PageFactory.initElements(Driver.get(),this);

    }





}
