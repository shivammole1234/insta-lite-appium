package com.insta.QA;

import com.insta.QA.base.BaseTest;
import com.insta.QA.config.ConfigFileReader;
import com.insta.QA.pages.HomePage;
import com.insta.QA.pages.LoginPage;
import com.insta.QA.pages.UploadPost;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class PostTest extends BaseTest {

    LoginPage loginPage;
    HomePage homePage;
    ConfigFileReader prop=new ConfigFileReader();
    UploadPost uploadPost;


    @BeforeTest
    public void settingUp() throws MalformedURLException, InterruptedException {
        System.out.println("setting up method of post test");
        setUp();
        loginPage = new LoginPage(driver);
        homePage=new HomePage(driver);
        uploadPost  = new UploadPost(driver);
        System.out.println("login start in post test test setting up");
      homePage.setAllowContBtn();
        loginPage.loginUserNamePass(prop.getProperty("user"),prop.getProperty("pass"));

        System.out.println("login completed in post test setting up");

        Thread.sleep(5000);
    }

    @Test
    public void UploadPostMethodTest() throws InterruptedException {
        uploadPost.UploadPostMethod();
        System.out.println("UploadPost method completed");
    }

    @Test
    public void ArchivePostTest() throws InterruptedException {
        uploadPost.ArchivePost();
        System.out.println("ArchivePostTest method completed");
    }

    @Test
    public void EditPostLocationTest() throws InterruptedException {
        uploadPost.EditPostLocation();
        System.out.println("EditPostLocationTest method completed");
    }

    @Test
    public void EditPostCaptionTest() throws InterruptedException {
        uploadPost.EditPostCaption();
        System.out.println("EditPostCaptionTest method completed");
    }

    @Test
    public void TurnOfCommentingTest() throws InterruptedException {
        uploadPost.TurnOfCommenting();
        System.out.println("TurnOfCommentingTest method completed");
    }

    @Test
    public void DeletePostTest() throws InterruptedException {
        uploadPost.DeletePost();
        System.out.println("DeletePostTest method completed");
    }

}
