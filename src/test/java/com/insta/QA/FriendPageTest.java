package com.insta.QA;

import com.insta.QA.base.BaseTest;
import com.insta.QA.config.ConfigFileReader;
import com.insta.QA.pages.FriendPage;
import com.insta.QA.pages.HomePage;
import com.insta.QA.pages.LoginPage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class FriendPageTest extends BaseTest {

    LoginPage loginPage;
    HomePage homePage;
    ConfigFileReader prop=new ConfigFileReader();
    FriendPage friendPage;

    @BeforeTest
    public void settingUp() throws MalformedURLException, InterruptedException {
        setUp();
        loginPage = new LoginPage(driver);
        homePage=new HomePage(driver);
         friendPage  = new FriendPage(driver);
        System.out.println("login start in reel page test setting up");
        loginPage.loginUserNamePass(prop.getProperty("user"),prop.getProperty("pass"));
        System.out.println("login completed in reelpage test setting up");

        Thread.sleep(5000);
    }

    @Test
    public void SearchAndAddFriend() throws InterruptedException {
        friendPage.SearchAndAddFriend();
        System.out.println("SearchAndAddFriend method completed");
    }

    @Test
    public void SearchAndMessageFriend() throws InterruptedException {
        friendPage.SearchAndMessageFriend();
        System.out.println("SearchAndMessageFriend method completed");
    }

    @Test
    public void acceptFriendRequestTest() throws InterruptedException {
        friendPage.acceptFriendRequest();
        System.out.println("acceptFriendRequestTest method completed");
    }

    @Test
    public void UnfollowUser() throws InterruptedException {
        friendPage.UnfollowUser();
        System.out.println("UnfollowUser method completed");
    }

    @Test
    public void addToFavourite() throws InterruptedException {
        friendPage.addToFavourite();
        System.out.println("addToFavourite method completed");
    }

    @Test
    public void MuteStoryTest() throws InterruptedException {
        friendPage.MuteStory();
        System.out.println("MuteStoryTest method completed");
    }



}
