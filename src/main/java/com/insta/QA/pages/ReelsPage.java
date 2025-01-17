package com.insta.QA.pages;

import com.insta.QA.base.BaseTest;
import com.insta.QA.config.ConfigFileReader;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;

public class ReelsPage extends BaseTest {

    private static final Logger log = LoggerFactory.getLogger(ReelsPage.class);
    HomePage homePage;
    LoginPage loginPage;
    ConfigFileReader prop = new ConfigFileReader();

    public ReelsPage(AndroidDriver driver) throws InterruptedException {
        System.out.println("reels page cunstroctor start");
        this.driver = driver;
        homePage=new HomePage(driver);
        PageFactory.initElements(driver, this);
        homePage.setAllowContBtn();
        loginPage=new LoginPage(driver);

        System.out.println("reels page cunstroctor end");
    }

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Reels\"]\n")
    WebElement reelsBtn;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[4]/android.view.ViewGroup[1]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup")
    WebElement likeReelBtn;

    @FindBy(xpath =
            "//android.view.ViewGroup[@content-desc=\"Search and explore\"]")
    WebElement searchAnrExploreBtn;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[4]/android.view.ViewGroup[1]")
    WebElement searchBarBtn;

    @FindBy(xpath = "\t\n" +
            "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.widget.MultiAutoCompleteTextView")
    WebElement searchBarEnterKey;


    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[1]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.view.ViewGroup[1]")
    WebElement seeAllResult;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[4]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.view.ViewGroup[1]")
    WebElement clickPostAfterSearchOperaiotn;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[4]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[7]/android.view.ViewGroup/android.view.ViewGroup")
    WebElement postLikeBtnAfterSearch;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]")
    WebElement postSendBtn;

    @FindBy(xpath =
            "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[4]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[9]/android.view.ViewGroup")
    WebElement commentsBtnOnPost;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[4]/android.view.ViewGroup/android.view.ViewGroup[5]/android.view.ViewGroup")
    WebElement GIFBtn;


    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[6]/android.view.ViewGroup/android.view.ViewGroup")
    WebElement gif1;

    public void ReelsLike() throws InterruptedException {
        System.out.println("reels operatoin start");
        reelsBtn.click();
        Thread.sleep(1000);
        System.out.println("reels btn clikced in reels opearion");
        likeReelBtn.click();
        Thread.sleep(1000);
        System.out.println("reels like btn clicked in reels operaation");
    }

    public void DoSearchForPost() throws InterruptedException {
        System.out.println("Search & explore post  operatoin start");
        searchAnrExploreBtn.click();
        Thread.sleep(5000);
        System.out.println("search & explore post btn cliocked  in DoSearchForPost reels page");
        searchBarBtn.click();
        System.out.println("search bar btn clicekd");
        //searchBarBtn.clear();
       // System.out.println("search bar clicked and cleard");
        Thread.sleep(5000);
        searchBarEnterKey.sendKeys("cars");
        System.out.println("entered key in search bar ");
        Thread.sleep(2000);
        searchBarEnterKey.click();
        System.out.println("searchBarBtn  btn cliocked  in DoSearchForPost reels page");
        Thread.sleep(5000);
        seeAllResult.click();
        System.out.println("see all result clicked");

    }


    public void ScrollDown() throws InterruptedException {
        // Get screen dimensions
        Dimension size = driver.manage().window().getSize();

        // Define start and end points for the swipe
        int startX = size.width / 2;
        int startY = (int) (size.height * 0.8); // Start from the bottom of the screen
        int endX = startX;
        int endY = (int) (size.height * 0.2); // End at the top of the screen

        // Perform swipe action (scroll down)
        TouchAction touchAction = new TouchAction(driver);
        touchAction.press(PointOption.point(startX, startY))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(500))) // Adjust wait time as needed
                .moveTo(PointOption.point(endX, endY))
                .release()
                .perform();

        // Pause for 30 seconds
        Thread.sleep(30000); // 30,000 milliseconds = 30 seconds
    }


    public void ReelsScrollUp() throws InterruptedException {
        System.out.println("ReelsScrollUp operatoin start");
        reelsBtn.click();
        Thread.sleep(1000);
        System.out.println("reels btn clikced in reels opearion");
        for(int i=0;i<5;i++){
            ScrollDown();
            System.out.println("scrolling reels no :- "+i);
        }
        System.out.println("scrolling reels finish");
    }


    public void DoSearchForPostAndLike() throws InterruptedException {
        System.out.println("Search & explore post  operatoin start");
        searchAnrExploreBtn.click();
        Thread.sleep(5000);
        System.out.println("search & explore post btn cliocked  in DoSearchForPost reels page");
        searchBarBtn.click();
        System.out.println("search bar btn clicekd");
        //searchBarBtn.clear();
        // System.out.println("search bar clicked and cleard");
        Thread.sleep(5000);
        searchBarEnterKey.sendKeys("cars");
        System.out.println("entered key in search bar ");
        Thread.sleep(2000);
        searchBarEnterKey.click();
        System.out.println("searchBarBtn  btn cliocked  in DoSearchForPost reels page");
        Thread.sleep(5000);
        seeAllResult.click();
        System.out.println("see all result clicked");
        Thread.sleep(10000);
        clickPostAfterSearchOperaiotn.click();
        System.out.println("post clicked after see all result");
        Thread.sleep(10000);
        postLikeBtnAfterSearch.click();
        System.out.println("post like operaation finish");

    }

    public void DoSearchForPostAndCooment() throws InterruptedException {
        System.out.println("Search & explore post  operatoin start");
        searchAnrExploreBtn.click();
        Thread.sleep(5000);
        System.out.println("search & explore post btn cliocked  in DoSearchForPost reels page");
        searchBarBtn.click();
        System.out.println("search bar btn clicekd");
        //searchBarBtn.clear();
        // System.out.println("search bar clicked and cleard");
        Thread.sleep(5000);
        searchBarEnterKey.sendKeys("cars");
        System.out.println("entered key in search bar ");
        Thread.sleep(2000);
        searchBarEnterKey.click();
        System.out.println("searchBarBtn  btn cliocked  in DoSearchForPost reels page");
        Thread.sleep(5000);
        seeAllResult.click();
        System.out.println("see all result clicked");
        Thread.sleep(10000);
        clickPostAfterSearchOperaiotn.click();
        System.out.println("post clicked after see all result");
        Thread.sleep(10000);
        commentsBtnOnPost.click();
        Thread.sleep(2000);
        GIFBtn.click();
        Thread.sleep(2000);
        System.out.println("comment posting start");
       // tapOnElement(gif1);
        int x = (913 + 1284) / 2; // Calculate the center x-coordinate
        int y = (1367 + 1738) / 2; // Calculate the center y-coordinate

       // Perform a tap at the calculated coordinates
        new TouchAction<>(driver)
                .tap(PointOption.point(x, y))
                .perform();
        System.out.println("cooment posted finish");


    }

}
