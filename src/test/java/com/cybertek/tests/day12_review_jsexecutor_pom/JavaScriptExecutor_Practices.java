package com.cybertek.tests.day12_review_jsexecutor_pom;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JavaScriptExecutor_Practices {

    @Test
    public void scroll_using_jsexecutor_1(){
        Driver.getDriver().get("http://practice.cybertekschool.com/infinite_scroll");
        JavascriptExecutor js = (JavascriptExecutor)Driver.getDriver();

        for (int i = 0; i < 10; i++) {
            BrowserUtils.wait(1);
            js.executeScript("window.scrollBy(0, 500)");
        }
    }

    @Test
    public void scroll_using_jsexecutor_2(){
        Driver.getDriver().get("http://practice.cybertekschool.com/large");
        WebElement link = Driver.getDriver().findElement(By.linkText("Cybertek School"));
        WebElement homeLink = Driver.getDriver().findElement(By.linkText("Home"));
        JavascriptExecutor js = (JavascriptExecutor)Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true)", link);
        js.executeScript("arguments[0].scrollIntoView(true)", homeLink);

    }

}

