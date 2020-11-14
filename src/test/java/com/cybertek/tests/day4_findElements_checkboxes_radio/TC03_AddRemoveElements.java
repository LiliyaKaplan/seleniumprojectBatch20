package com.cybertek.tests.day4_findElements_checkboxes_radio;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TC03_AddRemoveElements {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/add_remove_elements/");
        for(int i = 1; i<=50; i++ ){
            driver.findElement(By.xpath("//button[@onclick=\"addElement()\"]")).click();
        }
        List<WebElement> delete = driver.findElements(By.xpath("//button[@class=\"added-manually\"]"));
        int deleteCount = 0;
        for(WebElement eachDelete:delete){
            String deleteBox = eachDelete.getText();
            if(deleteBox.equals("Delete")){
                deleteCount++;
            }
        }
        if(deleteCount==50){
            System.out.println("There are 50 Delete buttons. Verification PASSED!");
        }else{
            System.out.println("50 delete buttons Verification FAILED!");
        }
        for(int i = 1; i<=50; i++ ){
            driver.findElement(By.xpath("//button[@onclick=\"deleteElement()\"]")).click();
        }
        String deleteBox = driver.findElement(By.xpath("//body//button")).getText();
        if(!deleteBox.equals("Delete")){
            System.out.println("Delete button is NOT displayed. Passed!");
        }else{
            System.out.println("Delete button is displayed. Failed");
        }
        driver.close();




    }

}
