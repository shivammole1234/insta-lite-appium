package com.insta.QA;

import com.insta.QA.base.BaseTest;
import com.insta.QA.config.ConfigFileReader;
import com.insta.QA.pages.HomePage;
import com.insta.QA.pages.LoginPage;
import com.insta.QA.pages.ReelsPage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class ReelsPageTest extends BaseTest {

    LoginPage loginPage;
    HomePage homePage;
    ConfigFileReader prop=new ConfigFileReader();
    ReelsPage reelsPage;

    @BeforeTest
    public void settingUp() throws MalformedURLException, InterruptedException {
        setUp();
        loginPage = new LoginPage(driver);
        homePage=new HomePage(driver);
        reelsPage=new ReelsPage(driver);
        System.out.println("login start in reelpage test setting up");
        loginPage.loginUserNamePass(prop.getProperty("user"),prop.getProperty("pass"));
        System.out.println("login completed in reelpage test setting up");

        Thread.sleep(5000);
    }

    @Test
    public void ReelsOperaotinTest() throws InterruptedException {
        Thread.sleep(1000);
        reelsPage.ReelsLike();
    }

    @Test
    public void DosearchOperationTest() throws InterruptedException {
        Thread.sleep(1000);
        reelsPage.DoSearchForPost();
    }

    @Test
    public void ReelsScrollUpTest() throws InterruptedException {
        Thread.sleep(2000);
        reelsPage.ReelsScrollUp();
    }

    @Test
    public void DoSearchForPostAndLikeTest() throws InterruptedException {
        Thread.sleep(2000);
        reelsPage.DoSearchForPostAndLike();
    }

    @Test
    public void DoSearchForPostAndComentTest() throws InterruptedException {
        Thread.sleep(2000);
        reelsPage.DoSearchForPostAndCooment();
    }
}
