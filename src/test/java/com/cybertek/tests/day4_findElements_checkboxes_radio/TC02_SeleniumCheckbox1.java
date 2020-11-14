package com.cybertek.tests.day4_findElements_checkboxes_radio;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC02_SeleniumCheckbox1 {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://www.seleniumeasy.com/test/basic-checkbox-demo.html");
        if(!driver.findElement(By.xpath("//div[@id=\"txtAge\"]")).isDisplayed()){
            System.out.println("Success - Check box is checked is NOT displayed. Passed");
        }else{
            System.out.println("Success - Check box is checked is displayed. Failed");
        }
        driver.findElement(By.xpath("//input[@id=\"isAgeSelected\"]")).click();
        if(driver.findElement(By.xpath("//div[@id=\"txtAge\"]")).isDisplayed()){
            System.out.println("Success - Check box is checked is displayed. Passed");
        }else{
            System.out.println("Success - Check box is checked is NOT displayed. Failed");
        }
        driver.close();

    }

}
