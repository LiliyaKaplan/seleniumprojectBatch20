package com.cybertek.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class SmartBearUtilities {

    public static void loginToSmartBear(WebDriver driver) {

        WebElement userNameInput = driver.findElement(By.id("ctl00_MainContent_username"));
        userNameInput.sendKeys("Tester");

        WebElement passwordInput = driver.findElement(By.id("ctl00_MainContent_password"));
        passwordInput.sendKeys("test");

        WebElement loginButton = driver.findElement(By.id("ctl00_MainContent_login_button"));
        loginButton.click();

    }

    public static void verifyOrder(WebDriver driver, String name) {

        List<WebElement> namesList = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr/td[2]"));

        //If there is only one table on the page, you don't have to locate the table. --> //tr/td[2]
        //List<WebElement> namesList = driver.findElements(By.xpath("//tr/td[2]"));

        //type iter, press tab for "for each" loop short cut.

        for (WebElement each : namesList) {

            if (each.getText().equals(name)) {
                Assert.assertTrue(true);
                return;
            }
        }
        // Assert fail method will fail the test when it is called, no matter what.
        Assert.fail("Name: " + name + " does not exist in the list! Verification FAILED!!!");

    }

    public static void printNamesAndCities(WebDriver driver){

        //locating all the names from all the rows and storing in a list of web element
        List<WebElement> namesList = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr/td[2]"));
        //we need to locate all cities from the rows
        List<WebElement> citiesList = driver.findElements(By.xpath("//table[@id=‘ctl00_MainContent_orderGrid’]//tr/td[7]"));

        for (int i = 0; i < namesList.size(); i++) {
            System.out.println("Name"+(i+1)+": "+namesList.get(i).getText()+", City"+(i+1)+": "+citiesList.get(i).getText());
        }

    }
}
