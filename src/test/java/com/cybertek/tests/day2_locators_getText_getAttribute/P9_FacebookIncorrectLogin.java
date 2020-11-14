package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P9_FacebookIncorrectLogin {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://facebook.com");
        driver.findElement(By.name("email")).sendKeys("blablabla@gmail.com");
        driver.findElement(By.name("pass")).sendKeys("blablabla");
        driver.findElement(By.name("login")).click();
        String expectedTitle = "Log into Facebook | Facebook";
        String actualTitle = driver.getTitle();
        if(actualTitle.equals(actualTitle)){
            System.out.println("Passed!!");
        }else{
            System.out.println("Failed!!");
        }

    }

}
