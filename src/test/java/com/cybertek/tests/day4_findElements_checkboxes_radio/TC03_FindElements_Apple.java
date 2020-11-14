package com.cybertek.tests.day4_findElements_checkboxes_radio;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TC03_FindElements_Apple {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.apple.com");
        int totalWithText = 0;
        int totalWithoutText = 0;
        int total = 0;

        //click Mac:
        driver.findElement(By.cssSelector("a[class=\"ac-gn-link ac-gn-link-mac\"]")).click();
        List<WebElement>macList = driver.findElements(By.xpath("//body//a"));
        for(WebElement eachMac:macList){
            if(eachMac.getText().isEmpty()){
                totalWithoutText++;
            }else{
                totalWithText++;
            }
        }
        System.out.println("Mac: "+ macList.size());
        driver.navigate().back();

        //click iPad:
        driver.findElement(By.cssSelector("a[class=\"ac-gn-link ac-gn-link-ipad\"]")).click();
        List<WebElement>iPadList = driver.findElements(By.xpath("//body//a"));
        for(WebElement eachIpad:iPadList){
            if(eachIpad.getText().isEmpty()){
                totalWithoutText++;
            }else{
                totalWithText++;
            }
        }
        System.out.println("Ipad: "+iPadList.size());
        driver.navigate().back();

        //click iPhone:
        driver.findElement(By.cssSelector("a[class=\"ac-gn-link ac-gn-link-iphone\"]")).click();
        List<WebElement>iPhoneList = driver.findElements(By.xpath("//body//a"));
        for(WebElement eachIphone:iPhoneList){
            if(eachIphone.getText().isEmpty()){
                totalWithoutText++;
            }else{
                totalWithText++;
            }
        }
        System.out.println("iPhone: "+iPhoneList.size());
        driver.navigate().back();

        //click Watch:
        driver.findElement(By.cssSelector("a[class=\"ac-gn-link ac-gn-link-watch\"]")).click();
        List<WebElement>watchList = driver.findElements(By.xpath("//body//a"));
        for(WebElement eachWatch:watchList){
            if(eachWatch.getText().isEmpty()){
                totalWithoutText++;
            }else{
                totalWithText++;
            }
        }
        System.out.println("Watch: "+watchList.size());
        driver.navigate().back();

        //click TV:
        driver.findElement(By.cssSelector("a[class=\"ac-gn-link ac-gn-link-tv\"]")).click();
        List<WebElement>tvList = driver.findElements(By.xpath("//body//a"));
        for(WebElement eachTV:tvList){
            if(eachTV.getText().isEmpty()){
                totalWithoutText++;
            }else{
                totalWithText++;
            }
        }
        System.out.println("TV: "+tvList.size());
        driver.navigate().back();

        //click Music:
        driver.findElement(By.cssSelector("a[class=\"ac-gn-link ac-gn-link-music\"]")).click();
        List<WebElement>musicList = driver.findElements(By.xpath("//body//a"));
        for(WebElement eachMusic:musicList){
            if(eachMusic.getText().isEmpty()){
                totalWithoutText++;
            }else{
                totalWithText++;
            }
        }
        System.out.println("Music: "+musicList.size());
        driver.navigate().back();

        //click Support:
        driver.findElement(By.cssSelector("a[class=\"ac-gn-link ac-gn-link-support\"]")).click();
        List<WebElement>supportList = driver.findElements(By.xpath("//body//a"));
        for(WebElement eachSupport:supportList){
            if(eachSupport.getText().isEmpty()){
                totalWithoutText++;
            }else{
                totalWithText++;
            }
        }
        System.out.println("Support: "+supportList.size());
        driver.navigate().back();
        total = macList.size()+iPadList.size()+iPhoneList.size()+watchList.size()+tvList.size()+
        musicList.size()+supportList.size();
        System.out.println("total = " + total);
        System.out.println("totalWithoutText = " + totalWithoutText);
        System.out.println("totalWithText = " + totalWithText);

        driver.close();


    }

}
