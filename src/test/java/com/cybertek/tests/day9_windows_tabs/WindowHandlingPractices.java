package com.cybertek.tests.day9_windows_tabs;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class WindowHandlingPractices {
    WebDriver driver;


    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }

    @Test
    public void p5_handling_windows(){
        driver.get("http://practice.cybertekschool.com/windows");
        String actualTitle = driver.getTitle();
        Assert.assertTrue(actualTitle.equals("Practice"));
        WebElement clickHereLink = driver.findElement(By.linkText("Click Here"));
        clickHereLink.click();

        String titleAfterClick = driver.getTitle();
        System.out.println("titleAfterClick = " + titleAfterClick);

        String mainHandle = driver.getWindowHandle();
        System.out.println("mainHandle = " + mainHandle);

        //Set allows only unique values
        Set<String> windowHandles = driver.getWindowHandles();

        for (String each : windowHandles) {
            driver.switchTo().window(each);
            System.out.println("Current title = "+driver.getTitle());
            System.out.println("Current WINDOW HANDLE = "+driver.getWindowHandle());
        }

        Assert.assertTrue(driver.getTitle().equals("New Window"));

        BrowserUtils.wait(2);
        driver.close(); // driver close() will close the current focused window/tab

        //If I want to switch back to the main page, to continue with some other actions:
        driver.switchTo().window(mainHandle);

    }

    @Test
    public void p6_handling_more_than_two_windows(){
       driver.get("https://www.amazon.com");
       // We are downcasting our driver type to JavaScriptExecutor
        ((JavascriptExecutor) driver).executeScript("window.open('http://google.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://etsy.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://facebook.com','_blank');");

        Set<String> windowHandles = driver.getWindowHandles();
        for (String each : windowHandles) {
            driver.switchTo().window(each);
            //System.out.println("Current page title: "+ driver.getTitle());
            if(driver.getCurrentUrl().contains("Etsy")){
                Assert.assertTrue(driver.getTitle().contains("Etsy"));
                break;
            }
        }

    }
}
