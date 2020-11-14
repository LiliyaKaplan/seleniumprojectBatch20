package com.cybertek.tests.day4_findElements_checkboxes_radio;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P3_Checkbox_Practice {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/checkboxes");
        WebElement checkbox1 = driver.findElement(By.xpath("//form[@id='checkboxes']/input[1]"));
        WebElement checkbox2 = driver.findElement(By.xpath("//form[@id='checkboxes']/input[2]"));

        if(!checkbox1.isSelected()){
            System.out.println("Checkbox 1 is not selected. Verification passed!");
        }else{
            System.out.println("Checkbox 1 is selected. Verification failed!");
        }

        if(checkbox2.isSelected()){
            System.out.println("Checkbox 2 is selected. Verification passed!");
        }else{
            System.out.println("Checkbox 2 is not selected. Verification failed!");
        }
        checkbox1.click();
        checkbox2.click();

        if(checkbox1.isSelected()){
            System.out.println("Checkbox 1 is selected. Verification passed!");
        }else{
            System.out.println("Checkbox 1 is not selected. Verification failed!");
        }

        if(!checkbox2.isSelected()){
            System.out.println("Checkbox 2 is not selected. Verification passed!");
        }else{
            System.out.println("Checkbox 2 is selected. Verification failed!");
        }

    }
}
