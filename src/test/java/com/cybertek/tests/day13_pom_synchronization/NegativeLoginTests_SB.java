package com.cybertek.tests.day13_pom_synchronization;

import com.cybertek.pages.LoginPage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NegativeLoginTests_SB {

    LoginPage loginPage;

    @Test (description = "entering incorrect username") // description is optional
    public void negative_login_test1(){
        String url = ConfigurationReader.getProperty("smartBearUrl");
        Driver.getDriver().get(url);

        loginPage = new LoginPage();

        loginPage.usernameInput.sendKeys("anything");

        String password = ConfigurationReader.getProperty("smartBear_password");
        loginPage.passwordInput.sendKeys(password);
        loginPage.loginButton.click();

        Assert.assertTrue(loginPage.errorMessage.isDisplayed(), "Error message is not displayed. Verification failed!!");

    }


    @Test (description = "using login method for negative test")
    public void negative_login_test2(){
        String url = ConfigurationReader.getProperty("smartBearUrl");
        Driver.getDriver().get(url);

        loginPage = new LoginPage();

        String username = "tyhjdskd";
        String password = ConfigurationReader.getProperty("smartBear_password");
        loginPage.login(username, password);
        Assert.assertTrue(loginPage.errorMessage.isDisplayed(), "Error message is not displayed. Verification failed!!");

    }

}
