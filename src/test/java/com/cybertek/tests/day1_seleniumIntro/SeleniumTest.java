package com.cybertek.tests.day1_seleniumIntro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

    public static void main(String[] args) throws InterruptedException {

        //1- set up the web driver
        WebDriverManager.chromedriver().setup();

        //2 create the instance of the chrome driver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //3 test if driver is working
        driver.get("https://www.google.com");
        System.out.println("The title of the page is: "+ driver.getTitle());

        String actualURL = driver.getCurrentUrl();
        System.out.println(actualURL);

        Thread.sleep(3000);

        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(3000);
        driver.navigate().refresh();
        Thread.sleep(3000);
        driver.navigate().to("https://www.facebook.com");
        Thread.sleep(3000);
        driver.close();





    }
}
