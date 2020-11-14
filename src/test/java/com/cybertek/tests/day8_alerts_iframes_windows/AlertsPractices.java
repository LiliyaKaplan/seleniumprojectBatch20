package com.cybertek.tests.day8_alerts_iframes_windows;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AlertsPractices {

    WebDriver driver;


    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/javascript_alerts");

    }

    @Test
    public void p1_information_alert_practice(){
        //Locating the warning/information alert button to click it
        WebElement warningAlertButton = driver.findElement(By.xpath("//button[.='Click for JS Alert']"));

        //click to the button
        warningAlertButton.click();

        //1- create Alert instance and switch to alert
        Alert alert = driver.switchTo().alert();
        BrowserUtils.wait(2);

        //2- use alert instance to accept the JS alert(popup)
        alert.accept();

        WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));
        Assert.assertTrue(resultText.isDisplayed(), "Result text is not displayed. Verification failed!!!");
    }

    @Test
    public void p2_confirmation_alert_practice(){
        //Locating the warning/information alert button to click it
        WebElement warningAlertButton = driver.findElement(By.xpath("//button[.='Click for JS Confirm']"));
        //click to the button
        warningAlertButton.click();
        //1- create Alert instance and switch to alert
        Alert alert = driver.switchTo().alert();
        //we can either accept(), or dismiss() the confirmation alert
        //alert.dismiss();
        alert.accept();
        WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));
        Assert.assertTrue(resultText.isDisplayed(), "Result text is not displayed. Verification failed!!!");
    }

    @Test
    public void p3_information_alert_practice(){
        WebElement warningAlertButton = driver.findElement(By.xpath("//button[.='Click for JS Prompt']"));
        warningAlertButton.click();
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("hello");
        //Click to OK button from the alert
        alert.accept();
        //Verify “You entered:  hello” text is displayed.
        WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));
        Assert.assertTrue(resultText.isDisplayed(), "Result text is not displayed. Verification failed!!!");

    }
}
