package com.cybertek.tests.day10_testbase_properties_driverUtil;

import com.cybertek.utilities.SmartBearUtilities;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SmartBearPractices_9_10_11 {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        SmartBearUtilities.loginToSmartBear(driver);
    }

    @Test
    public void p9_delete_order_task(){
        WebElement markSmithCheckBox = driver.findElement(By.xpath("//td[.='Mark Smith']/preceding-sibling::td[1]"));
        markSmithCheckBox.click();
        WebElement deleteButton = driver.findElement(By.id("ctl00_MainContent_btnDelete"));
        deleteButton.click();

        WebElement names = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']"));
        Assert.assertFalse(names.getText().equals("Mark Smith"), "MarkSmith is still in the list. Verification failed");


    }













}

