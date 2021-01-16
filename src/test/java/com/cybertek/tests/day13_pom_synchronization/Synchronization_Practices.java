package com.cybertek.tests.day13_pom_synchronization;

import com.cybertek.pages.Loading7Page;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Synchronization_Practices {

     @Test
    public void p40_Dynamic_title_test(){
         String url = "http://practice.cybertekschool.com/dynamic_loading/7";
         Driver.getDriver().get(url);

         Loading7Page loading7Page = new Loading7Page();

         WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

         wait.until(ExpectedConditions.titleIs("Dynamic title"));

         Assert.assertTrue(loading7Page.doneMessage.isDisplayed());

     }

}
