package com.insta.QA.pages;

import com.insta.QA.base.BaseTest;
import com.insta.QA.config.ConfigFileReader;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class
FriendPage extends BaseTest {
    HomePage homePage;
    LoginPage loginPage;
    ConfigFileReader prop = new ConfigFileReader();

    public FriendPage(AndroidDriver driver) throws InterruptedException {

        System.out.println("FriendPage page cunstroctor start");
        this.driver = driver;
        homePage=new HomePage(driver);
        PageFactory.initElements(driver, this);
        homePage.setAllowContBtn();
        loginPage=new LoginPage(driver);

        System.out.println("FriendPage page cunstroctor end");
    }

    @FindBy(xpath =
            "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[1]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.view.ViewGroup[2]")
    WebElement firstIdToFollow;

    @FindBy(xpath =
            "//android.view.ViewGroup[@content-desc=\"Follow\"]")
    WebElement followBtn;

    @FindBy(xpath =
            "//android.view.ViewGroup[@content-desc=\"Message\"]")
    WebElement msgBtn;

    @FindBy(xpath = "\t\n" +
            "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[5]/android.widget.EditText[2]")
    WebElement TypeMsgBtn;

    @FindBy(xpath = "\t\n" +
            "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[5]/android.widget.EditText[2]")
    WebElement TypeMsgBtnSendKey;

    @FindBy(xpath = "\t\n" +
            "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[5]/android.view.ViewGroup[2]/android.widget.ImageView")
    WebElement sendMsgBtn;

    @FindBy(xpath = "\t\n" +
            "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[4]/android.view.ViewGroup[3]")
    WebElement activityBtn;

    @FindBy(xpath = "\t\n" +
            "(//android.view.ViewGroup[@content-desc=\"Follow\"])[1]\n")
    WebElement acceptRequestBtn;

    @FindBy(xpath =
            "//android.view.ViewGroup[@content-desc=\"Search and explore\"]")
    WebElement searchAnrExploreBtn;

    @FindBy(xpath =
            "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[4]/android.view.ViewGroup[1]")
    WebElement searchBarBtn;

    @FindBy(xpath = "\t\n" +
            "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.widget.MultiAutoCompleteTextView")
    WebElement searchBarEnterKey;

    @FindBy(xpath = "\t\n" +
            "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[4]/android.view.ViewGroup/android.view.ViewGroup[6]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.view.ViewGroup[4]")
    WebElement FollowingBtn;

    @FindBy(xpath = "\t\n" +
            "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[4]/android.view.ViewGroup/android.view.ViewGroup[4]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[5]/android.view.ViewGroup/android.view.ViewGroup[1]")
    WebElement FollowerUserOpBtn;

    @FindBy(xpath = "\t\n" +
            "//android.view.ViewGroup[@content-desc=\"Following\"]")
    WebElement ManageFollowingBtnSetting;

    @FindBy(xpath = "\t\n" +
            "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[5]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]")
    WebElement addToFavBtn;

    @FindBy(xpath = "\t\n" +
            "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[5]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]")
    WebElement muteOperatoinBtn;

    @FindBy(xpath = "\t\n" +
            "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[5]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]")
    WebElement muteStoryBtn;

    @FindBy(xpath = "\t\n" +
            "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[5]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]")
    WebElement unfollowBtn;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Profile\"]")
    WebElement profileBtn;

    public void SearchAndAddFriend() throws InterruptedException {
        searchAnrExploreBtn.click();
        System.out.println("searchAnrExploreBtn clicked in search and and friend method");
        Thread.sleep(2000);
        searchBarBtn.click();
        System.out.println("searchBarBtn clicked in search and and friend method");
        Thread.sleep(3000);
        searchBarEnterKey.sendKeys("boatxaman");
        System.out.println("searchBarEnterKey clicked in search and and friend method");
        Thread.sleep(3000);
        firstIdToFollow.click();
        System.out.println("firstIdToFollow clicked in search and and friend method");
        Thread.sleep(3000);
        followBtn.click();
        System.out.println("followBtn clicked in search and and friend method");
        Thread.sleep(3000);

    }

    public void SearchAndMessageFriend() throws InterruptedException {
        searchAnrExploreBtn.click();
        System.out.println("searchAnrExploreBtn clicked in search and and friend method");
        Thread.sleep(2000);
        searchBarBtn.click();
        System.out.println("searchBarBtn clicked in search and and friend method");
        Thread.sleep(3000);
        searchBarEnterKey.sendKeys("_sunoindia");
        System.out.println("searchBarEnterKey clicked in search and and friend method");
        Thread.sleep(3000);
        firstIdToFollow.click();
        System.out.println("firstIdToFollow clicked in search and and friend method");
        Thread.sleep(3000);
        msgBtn.click();
        System.out.println("msgBtn clicked in search and add friend method");
        Thread.sleep(3000);
        TypeMsgBtn.click();
        System.out.println("TypeMsgBtn clicked in search and and friend method");
        Thread.sleep(3000);
        TypeMsgBtnSendKey.sendKeys("Hi");
        System.out.println("TypeMsgBtnSendKey clicked in search and and friend method");
        Thread.sleep(3000);
        sendMsgBtn.click();
        System.out.println("sendMsgBtn clicked in search and and friend method");
        Thread.sleep(3000);

    }

    public  void acceptFriendRequest() throws InterruptedException {
        activityBtn.click();
        System.out.println("activityBtn clicked in acceptFriendRequest method");
        Thread.sleep(3000);
        acceptRequestBtn.click();
        System.out.println("acceptRequestBtn clicked in acceptFriendRequest method");
        Thread.sleep(3000);


    }

    public void UnfollowUser() throws InterruptedException {
        profileBtn.click();
        System.out.println("profileBtn clicked in UnfollowUser method in FrienPage class");
        Thread.sleep(3000);
        FollowingBtn.click();
        System.out.println("FollowingBtn clicked in UnfollowUser method in FrienPage class");
        Thread.sleep(3000);
        FollowerUserOpBtn.click();
        System.out.println("FollowerUserOpBtn clicked in UnfollowUser method in FrienPage class");
        Thread.sleep(3000);
        ManageFollowingBtnSetting.click();
        System.out.println("ManageFollowingBtnSetting clicked in UnfollowUser method in FrienPage class");
        Thread.sleep(3000);
        unfollowBtn.click();
        System.out.println("unfollowBtn clicked in UnfollowUser method in FrienPage class");
    }

    public void addToFavourite() throws InterruptedException {
        profileBtn.click();
        System.out.println("profileBtn clicked in addToFavourite method in FrienPage class");
        Thread.sleep(3000);
        FollowingBtn.click();
        System.out.println("FollowingBtn clicked in addToFavourite method in FrienPage class");
        Thread.sleep(3000);
        FollowerUserOpBtn.click();
        System.out.println("FollowerUserOpBtn clicked in addToFavourite method in FrienPage class");
        Thread.sleep(3000);
        ManageFollowingBtnSetting.click();
        System.out.println("ManageFollowingBtnSetting clicked in addToFavourite method in FrienPage class");
        Thread.sleep(3000);
        addToFavBtn.click();
        System.out.println("addToFavBtn clicked in addToFavourite method in FrienPage class");
    }

    public void MuteStory() throws InterruptedException {
        profileBtn.click();
        System.out.println("profileBtn clicked in MuteStory method in FrienPage class");
        Thread.sleep(3000);
        FollowingBtn.click();
        System.out.println("FollowingBtn clicked in MuteStory method in FrienPage class");
        Thread.sleep(3000);
        FollowerUserOpBtn.click();
        System.out.println("FollowerUserOpBtn clicked in MuteStory method in FrienPage class");
        Thread.sleep(3000);
        ManageFollowingBtnSetting.click();
        System.out.println("ManageFollowingBtnSetting clicked in MuteStory method in FrienPage class");
        Thread.sleep(3000);
        muteOperatoinBtn.click();
        System.out.println("muteOperatoinBtn clicked in MuteStory method in FrienPage class");
        muteStoryBtn.click();
        System.out.println("muteStoryBtn clicked in MuteStory method in FrienPage class");
    }


}
