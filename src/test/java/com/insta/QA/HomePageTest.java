package com.polmonos.QA;

import com.polmonos.QA.base.BaseTest;
import com.polmonos.QA.config.ConfigReader;
import com.polmonos.QA.pages.HomePage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class HomePageTest extends BaseTest {
    ConfigReader configReader=new ConfigReader();
    HomePage homePage;

    @BeforeTest
    public void settingUp() throws MalformedURLException, InterruptedException {
        setUp();
        homePage=new HomePage(driver);
        Thread.sleep(2000);
    }

    @Test
    public void clickAcntBtnTest(){
        System.out.println("Test ant btn cliek start");
        homePage.clickOnAcnt();
        System.out.println("test ant btn cliekd completed");
    }

    @Test
    public void clickOnCollBtnTest(){
        System.out.println("collection btn click start");
        homePage.clickOnCollBtn();
        System.out.println("collection btn clicked ");
    }

    @Test
    public void clickOnEmilyBtnTest()
    {
        System.out.println("emily btn test start");
        homePage.clickOnEmilyInParisBtn();
        System.out.println("emily btn test completed");
    }

    @Test
    public void clickSearchTest(){
        System.out.println("search cklick start");
        homePage.clickSearch();
        System.out.println("search click completed");
    }

    @Test
    public void scrollDownTest(){
        System.out.println("scroll down start");
        homePage.clickOnCollBtn();
        homePage.scrollOnPage();
        System.out.println("scroll down complete");
    }


}





















