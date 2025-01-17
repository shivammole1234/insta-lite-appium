package com.insta.QA;

import com.insta.QA.base.BaseTest;
import com.insta.QA.config.ConfigFileReader;
import com.insta.QA.pages.HomePage;
import com.insta.QA.pages.LoginPage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;


public class HomePageTest extends BaseTest {
    ConfigFileReader prop = new ConfigFileReader();
    HomePage homePage;

    @BeforeTest
    public void settingUp() throws InterruptedException, MalformedURLException {
        setUp();
        homePage = new HomePage(driver);
        System.out.println("setting up method of HomepageTest");
        Thread.sleep(1000);
    }

    @Test
    public void setAllowContBtnSet() throws InterruptedException {
        homePage.setAllowContBtn();
    }

}