package com.cybertek.tests.day4_findElements_checkboxes_radio;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC03_SeleniumCheckbox2 {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://www.seleniumeasy.com/test/basic-checkbox-demo.html");
        if(driver.findElement(By.xpath("//input[@value=\"Check All\"]")).getAttribute("value").equals("Check All")){
            System.out.println("Check All Verified.");
        }else{
            System.out.println("Check All Failed.");
        }
        driver.findElement(By.xpath("//input[@value=\"Check All\"]")).click();

       WebElement checkbox1 = driver.findElement(By.xpath("//label[text()='Option 1']"));

        /*
        5.Verify	all	check	boxes	are	checked
        6.Verify	button	text	changed	to	“Unche
         */



    }

}
