package com.insta.QA;



import com.insta.QA.base.BaseTest;
import com.insta.QA.config.ConfigFileReader;
import com.insta.QA.pages.HomePage;
import com.insta.QA.pages.LoginPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;


public class LoginPageTest extends BaseTest {
    private static final Logger log = LoggerFactory.getLogger(LoginPageTest.class);
    ConfigFileReader prop = new ConfigFileReader();
    LoginPage loginPage;
    HomePage homePage;

    @BeforeMethod
    public void settingUp() throws MalformedURLException, InterruptedException {
        setUp();
        loginPage = new LoginPage(driver);
        homePage=new HomePage(driver);
        //loginPage.loginUserNamePass(prop.getProperty("user"),prop.getProperty("pass"));
        Thread.sleep(1000);
    }

    @Test
    public void loginMethodTest() throws InterruptedException {
        System.out.println("login method test of LoginPageTest start");
        loginPage.loginMethod();
        System.out.println("login method test of LoginPageTest start");
    }

    @Test
    public void loginMethodWithUserPassTest() throws InterruptedException {
        loginPage.loginUserNamePass(prop.getProperty("user"),prop.getProperty("pass"));
    }

    @Test
    public void logOutTest() throws InterruptedException {
        loginPage.loginUserNamePass(prop.getProperty("user"),prop.getProperty("pass"));
        Thread.sleep(2000);
        loginPage.logOut();
    }

    @Test
    public void changeThemeTest() throws InterruptedException {
      //  loginPage.loginUserNamePass(prop.getProperty("user"),prop.getProperty("pass"));
        Thread.sleep(1000);
        loginPage.changeTheme();
    }

    @Test
    public void notificationSettingTest() throws InterruptedException {
        //loginPage.loginUserNamePass(prop.getProperty("user"),prop.getProperty("pass"));
        Thread.sleep(1000);
        loginPage.notificationSetting();
    }
}