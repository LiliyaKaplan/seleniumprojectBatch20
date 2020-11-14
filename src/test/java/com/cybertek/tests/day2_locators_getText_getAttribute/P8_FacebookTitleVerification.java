package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P8_FacebookTitleVerification {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://facebook.com");
        String expectedTitle = "Facebook - Log in or Sign Up";
        String actualTitle = driver.getTitle();
        if(actualTitle.equals(actualTitle)){
            System.out.println("Passed!!");
        }else{
            System.out.println("Failed!!");
        }


    }
}
