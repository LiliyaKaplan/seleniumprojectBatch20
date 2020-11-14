package com.cybertek.tests.day5_testNG_intro_dropdowns;


import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG_Introduction {

    @BeforeClass
    public void setUpClass(){
        System.out.println("Before Class is running...");
    }

    @AfterClass
    public void tearDownClass(){
        System.out.println("After class is running...");
    }

    @BeforeMethod
    public void setUpMethod(){
        System.out.println("Before Method is running...");
    }

    @AfterMethod
    public void tearDownMethod(){
        System.out.println("After method is running...");
    }


    @Test
    public void test1(){
        System.out.println("Test1 is running...");
    }

    @Test
    public void test2(){
        System.out.println("Test 2 is running...");
    }

    @Test
    public void test3(){
        String str1 = "TestNG";
        String str2 = "TestNG";
        String str3 = "asdfasdf";
        Assert.assertTrue(str1.equals(str2));
        //Assert.assertTrue(str1.equals(str3), "str1 is not equal to str3");

        Assert.assertEquals(str1, str2, "Failure message just in case str1 is not equals to str2");

    }

}
