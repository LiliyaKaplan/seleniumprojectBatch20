package com.cybertek.tests.day14_excel_io;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DataProviderPractice {

    @FindBy(id = "prependedInput")
    private WebElement usernameElement;
    @FindBy(id = "prependedInput2")
    private WebElement passwordElement;
    public DataProviderPractice(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @Test(dataProvider = "usersTestData")
    public void ddtLoginTest1(String userName, String password){
        //login
        usernameElement.sendKeys("storemanager85");
        passwordElement.sendKeys("UserUser123", Keys.ENTER);
        System.out.println(Driver.getDriver().getTitle());
    }

    @DataProvider
    public Object[][] usersTestData() {
        return new Object[][]{
                {"storemanager85", "UserUser123"},
                {"salesmanager110", "UserUser123"},
                {"user153", "UserUser123"},
                {"storemanager85", "UserUser123"}
        };
    }
    //if I have to do something like Scenario Outline in cucumber
    // "same steps, but different test data"
    // what's the solution? - Data provider - method that supplies test with a test data


    @BeforeMethod
    public void setup(){
        Driver.getDriver().get("https://qa1.vytrack.com/user/login");
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    @AfterMethod
    public void tearDown(){
        Driver.closeDriver();
    }

}
