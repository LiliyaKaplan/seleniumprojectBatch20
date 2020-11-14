package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P4_GoogleSearch {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.findElement(By.name("q")).sendKeys("apple"+ Keys.ENTER);
        String expectedTitleStarts = "apple - Google Search";
        String actualTitleStarts = driver.getTitle();
        if(actualTitleStarts.startsWith(expectedTitleStarts)){
            System.out.println("Passed!");
        }else{
            System.out.println("Failed!");
        }
        driver.close();

    }
}
