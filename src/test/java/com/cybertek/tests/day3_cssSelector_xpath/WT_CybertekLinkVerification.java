package com.cybertek.tests.day3_cssSelector_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WT_CybertekLinkVerification {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/forgot_password");
        WebElement emailInputBox = driver.findElement(By.name("email"));
        emailInputBox.sendKeys("anyemail@domain.com");
        driver.findElement(By.id("form_submit")).click();
        String expectedInUrl = "email_sent";
        String actualUrl = driver.getCurrentUrl();
        if(actualUrl.contains(expectedInUrl)){
            System.out.println("URL verification PASSED!");
        }else{
            System.out.println("URL verification FAILED!");
        }
        WebElement confirmationMessage = driver.findElement(By.name("confirmation_message"));
        String actualText = confirmationMessage.getText();
        String expectedText = "Your e-mail's been sent!";
        System.out.println("actual text = "+actualText);
        System.out.println("expected Text = "+expectedText);

        if(actualText.equals(expectedText)){
            System.out.println("Header text verification PASSED!");
        }else{
            System.out.println("Header text verification FAILED!");
        }
        if(confirmationMessage.isDisplayed()){
            System.out.println("Confirmation message is displayed. Verification PASSED!");
        }else{
            System.out.println("Confirmation message is NOT displayed. Verification FAILED!");
        }


    }
}
