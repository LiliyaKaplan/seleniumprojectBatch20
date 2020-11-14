package com.cybertek.tests.vyTruck;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://qa2.vytrack.com/user/login");
        driver.findElement(By.name("_username")).sendKeys("user181");
        driver.findElement(By.name("_password")).sendKeys("UserUser123");
        driver.findElement(By.name("_submit")).click();
        driver.findElement(By.partialLinkText("Fleet")).click();
        driver.findElement(By.partialLinkText("Vehicles")).click();






    }

}
