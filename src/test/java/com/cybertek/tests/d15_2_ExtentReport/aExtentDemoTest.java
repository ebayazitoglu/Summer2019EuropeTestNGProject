package com.cybertek.tests.d15_2_ExtentReport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class aExtentDemoTest {
// this class is used for starting and building reports

    ExtentReports report;
    //this class is ised to create HTML report file
    ExtentHtmlReporter htmlReporter;

    //this class will define a test, enables adding logs, authors and test steps
    ExtentTest extentLogger;

    @BeforeMethod
    public void setUp() {

        report = new ExtentReports();


        //create report path
        String projectPath = System.getProperty("user.dir");
        String path = projectPath + "/test-output/report.html";
        // System.out.println(projectPath);
        System.out.println(path);

        //initialize the html reporter with the report path
        htmlReporter = new ExtentHtmlReporter(path);
        //attach the html report to the report object
        report.attachReporter(htmlReporter);
        htmlReporter.config().setReportName("Vytrack smoke test");

        //set some environmental information
        report.setSystemInfo("Environment", "QA");
        report.setSystemInfo("Browser", "Chrome");
        report.setSystemInfo("Tester", "Europe Testers");

    }
    @Test
    public void test1(){
    //give name to the current test

        extentLogger=report.createTest("TC342 Login as Driver Test");

        //test steps
        //name the test steps with info
        extentLogger.info("Open Chrome");

        extentLogger.info("Go to URL");

        extentLogger.info("Enyter driver info");

        extentLogger.info("Click submit");

        extentLogger.info("Verify logged in");

        extentLogger.info("TC342 passed");


    }

@AfterMethod
    public void teardown(){
        report.flush();
}
}
