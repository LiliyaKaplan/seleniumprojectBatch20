package com.cybertek.tests.day4_findElements_checkboxes_radio;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P2_MerriamWebster_Links {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.merriam-webster.com/");
        List <WebElement> listOfLinks =  driver.findElements(By.xpath("//body//a"));

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
        System.out.println("linkWithText = " + linksWithText);
        System.out.println("Total links: "+ listOfLinks.size());


    }
}
