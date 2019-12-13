package com.cybertek.tests.d12_WebTables;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class aWebTableExample {
    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.GetDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/tables");
    }

    @AfterMethod
    public void tearDownMethod() throws InterruptedException {
        Thread.sleep(1000);
        driver.quit();
    }

    @Test
    public void printTable() {

        WebElement table = driver.findElement(By.id("table1"));
        System.out.println(table.getText());//gives you all the info in table , all cells

        //verify that ksmith@gmail.com is in the table
        String wholetable = table.getText();
        Assert.assertTrue(wholetable.contains("jsmith@gmail.com"), "Verify kSMITH@GMAIL.COM IS IN THE TABLE");

    }

    @Test
    public void getAllHeaders() {
        //how many columns have we got
        List<WebElement> headers = driver.findElements(By.xpath("//table[@id='table1']//th"));
        System.out.println("Number of columns " + headers.size());
        //print each column name one by one
        for (WebElement header : headers) {
            System.out.println("header.getText() = " + header.getText());

        }
    }

    @Test
    public void printTableSize() {
        // find out the number of columns and number of rows
        //number of columns- we already did this above
        List<WebElement> headers = driver.findElements(By.xpath("//table[@id='table1']//th"));
        System.out.println("Number of columns " + headers.size());

        //number of rows including header
        List<WebElement> rowswithheader = driver.findElements(By.xpath("//table[@id='table1']//tr"));
        System.out.println("rowswithheader.size() = " + rowswithheader.size());

        //number of rows not including the header- which is more common and the actual one
        List<WebElement> rowswithoutheader = driver.findElements(By.xpath("//table[@id='table1']//tbody/tr"));
        System.out.println("rowswithoutheader.size() = " + rowswithoutheader.size());
    }

    @Test
    public void getRow() {
        WebElement secondrow = driver.findElement(By.xpath("//table[@id='table1']//tbody/tr[2]"));
        System.out.println("secondrow.getText() = " + secondrow.getText());

        //get all the rows dynamically. We can do this in 2 steps
        //1.get the number of rows
        //based on the number of rows, iterate each row
        List<WebElement> allrows = driver.findElements(By.xpath("//table[@id='table1']//tbody/tr"));
        for (int i = 1; i < allrows.size(); i++) {
            String rowXpath = "//table[@id='table1']//tbody/tr[" + i + "]";
            WebElement singlerow = driver.findElement(By.xpath(rowXpath));
            System.out.println("singlerow.getText() = " + singlerow.getText());

        }
    }


    @Test
    public void geteachCell() {
        List<WebElement> eachcellinarow = driver.findElements(By.xpath("//table[@id='table1']//tbody/tr[1]/td"));
        for (WebElement cell : eachcellinarow) {
            System.out.println("cell.getText() = " + cell.getText());

        }

    }

    @Test
    public void getSingleCellByIndex() {
    WebElement singlecell=driver.findElement(By.xpath("//table[@id='table1']//tbody/tr[3]/td[2]"));
        System.out.println("singlecell.getText() = " + singlecell.getText());

    }
    @Test

    public void printAllCellByIndex(){
        //number of rows
        int rowNumber = getNumberOfRows();
        //number of columns
        int colNumber = getNumberOfColumns();
        //iterate through each row in the table
        for (int i = 1; i <=rowNumber; i++) {
            //iterate through each cell in the table
            for (int j = 1; j <= colNumber ; j++) {

                //creating dynamic xpath
                String xpath = "//table[@id='table1']/tbody/tr["+ i +"]/td["+ j +"]";
                System.out.println(xpath);

                //getting each cell value and printing it
                WebElement singleCell = driver.findElement(By.xpath(xpath));
                System.out.println(singleCell.getText());
            }
        }
    }
    private int getNumberOfColumns() {
        List<WebElement> allColumns = driver.findElements(By.xpath("//table[@id='table1']//th"));
        return allColumns.size();
    }
    private int getNumberOfRows() {
        List<WebElement> allRows = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
        return allRows.size();
    }

    @Test
    public void getSpecificCellByIndex(){
        int r = 2;
        int c = 3;
        String xpath = "//table[@id='table1']/tbody/tr["+ r +"]/td["+ c +"]";
        WebElement singleCell = driver.findElement(By.xpath(xpath));
        System.out.println(singleCell.getText());
        //HOMEWORK
        //Create a method that accepts row and col number, and returns the cell as a webelement
    }

    @Test
    public void getCellInRelationToAnotherCellInSameRow(){
        String firstname = "Tim";
        String xpath = "//table[@id='table1']//td[.='"+firstname +"']/../td[3]";
        WebElement email = driver.findElement(By.xpath(xpath));
        System.out.println(email.getText());
    }

}


