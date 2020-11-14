package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P3_NavigationsAndTitleVerifications {
    public static void main(String[] args) {

        //TC #3: Back and forth navigation
        //1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //2 - GO to: https://google.com
        driver.get("https://www.google.com");

        //3-click to Gmail from top right
        driver.findElement(By.linkText("Gmail")).click();

        //4-verify title contains
        //Expected: Gmail
        String expectedTitle = "Gmail";
        String actualTitle = driver.getTitle();
        if(actualTitle.contains(expectedTitle)){
            System.out.println("Gmail title Passed");
        }else{
            System.out.println("Gmail title FAILED!!!");
        }

        //5-GO back to Google by using the .back();
        driver.navigate().back();

        //6- Verify title equals:
        //Expected: Google
        String expectedTitle2 = "Google";
        String actualTitle2 = driver.getTitle();
        if(actualTitle2.equals(expectedTitle2)){
            System.out.println("Google title verification PASSED!");
        }else{
            System.out.println("Google title verification FAILED!!!");
        }
        driver.close();





    }
}
