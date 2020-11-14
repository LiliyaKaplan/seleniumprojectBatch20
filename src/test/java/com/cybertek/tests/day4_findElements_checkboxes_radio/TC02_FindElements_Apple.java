package com.cybertek.tests.day4_findElements_checkboxes_radio;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TC02_FindElements_Apple {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.apple.com");
        driver.findElement(By.cssSelector("a[class=\"ac-gn-link ac-gn-link-iphone\"]")).click();
        List<WebElement>listOfLinks = driver.findElements(By.xpath("//body//a"));
        int linksWithoutText = 0;
        int linksWithText = 0;
        for(WebElement eachLink: listOfLinks){
            if(eachLink.getText().isEmpty()){
                linksWithoutText++;
            }else{
                linksWithText++;
            }
        }
        System.out.println("linksWithoutText = " + linksWithoutText);
        System.out.println("linksWithText = " + linksWithText);
        System.out.println("Total links: "+ listOfLinks.size());
        driver.close();




    }

}
