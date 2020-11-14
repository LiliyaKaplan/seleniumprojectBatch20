package com.cybertek.tests.day8_alerts_iframes_windows;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class DropdownPractices {

    WebDriver driver;


    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");

    }

    @Test
    public void p7_month_dropdown_default_value_test(){

        Select monthDropdown = new Select(driver.findElement(By.xpath("//select[@id='month']")));
        String expectedValue = LocalDateTime.now().getMonth().name();
        String actualValue = monthDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals(actualValue.toLowerCase(), expectedValue.toLowerCase());

        //task 8:
        List<WebElement> actualmonthOptions = monthDropdown.getOptions();

        List<String> expectedMonthOptions = Arrays.asList("January","February","March","April","May","June",
                "July","August","September","October","November","December");


      /*  List<String> actualMonthsTexts = new ArrayList<>();
        for (WebElement each : actualmonthOptions) {
            actualMonthsTexts.add(each.getText());
        }
        Assert.assertEquals(actualMonthsTexts, expectedMonthOptions);
        */



        Assert.assertEquals(BrowserUtils.getElementsText(actualmonthOptions), expectedMonthOptions);



    }



















}
