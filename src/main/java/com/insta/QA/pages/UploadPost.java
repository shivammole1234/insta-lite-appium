package com.insta.QA.pages;

import com.insta.QA.base.BaseTest;
import com.insta.QA.config.ConfigFileReader;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.time.Duration;


public class UploadPost extends BaseTest {
    private static final Logger logger = LogManager.getLogger(UploadPost.class);
    HomePage homePage;
    LoginPage loginPage;
    ConfigFileReader prop = new ConfigFileReader();

    public UploadPost(AndroidDriver driver) throws InterruptedException {
        System.out.println("UploadPost page cunstroctor start");
        this.driver = driver;
        homePage=new HomePage(driver);
        PageFactory.initElements(driver, this);
        //homePage.setAllowContBtn();
        loginPage=new LoginPage(driver);

        System.out.println("UploadPost page cunstroctor end");
    }

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"New Post\"]")
    WebElement addPostPlusBtn;

    @FindBy(id = "com.instagram.lite:id/foreground")
    WebElement photoToUpload;

    @FindBy(xpath = "\t\n" +
            "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[4]/android.view.ViewGroup[3]")
    WebElement nextBtn;

    @FindBy(xpath = "\t\n" +
            "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[4]/android.view.ViewGroup[3]/android.widget.MultiAutoCompleteTextView")
    WebElement captoinBtn;

    @FindBy(xpath = "\t\n" +
            "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[1]/android.view.ViewGroup[3]/android.widget.MultiAutoCompleteTextView")
    WebElement CaptoinSendKey;

    @FindBy(xpath = "\t\n" +
            "//android.view.ViewGroup[@content-desc=\"Share\"]")
    WebElement shareBtn;

    @FindBy(xpath = "\t\n" +
            "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[5]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]")
    WebElement archivePostBtn;

    @FindBy(xpath = "\t\n" +
            "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[5]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]")
    WebElement editPostBtn;

    @FindBy(xpath = "\t\n" +
            "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[5]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[5]")
    WebElement dltPostBtn;

    @FindBy(xpath = "\t\n" +
            "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[5]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[6]")
    WebElement TurnOfCommentingBtn;

    @FindBy(xpath = "\t\n" +
            "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[4]/android.view.ViewGroup/android.view.ViewGroup[3]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]/android.view.ViewGroup")
    WebElement postMenu;

    @FindBy(xpath = "\t\n" +
            "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[4]/android.view.ViewGroup[4]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.view.ViewGroup")
    WebElement EditPostAddLocatoin;

    @FindBy(xpath = "\t\n" +
            "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.widget.MultiAutoCompleteTextView")
    WebElement findLocatoin;

    @FindBy(xpath = "\t\n" +
            "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[1]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup")
    WebElement selectLocatoin;

    @FindBy(xpath = "\t\n" +
            "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[4]/android.view.ViewGroup/android.view.ViewGroup[3]")
    WebElement saveEdit;

    @FindBy(xpath = "\t\n" +
            "//android.widget.MultiAutoCompleteTextView[@content-desc=\"best ever\"]")
    WebElement editCaptoin;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Profile\"]")
    WebElement profileBtn;

    @FindBy(xpath = "\t\n" +
            "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[4]/android.view.ViewGroup/android.view.ViewGroup[6]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]/android.view.ViewGroup")
    WebElement postToEdit;

    @FindBy(xpath = "\t\n" +
            "//android.view.ViewGroup[@content-desc=\"Continue\"]")
    WebElement continueBtn;

    @FindBy(id = "\t\n" +
            "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[1]")
    WebElement allowPhotosBtn;




    public void clickElementByBounds(String bounds) {
        // Parse the bounds string to extract coordinates
        String[] boundValues = bounds.replace("[", "").replace("]", ",").split(",");
        int startX = Integer.parseInt(boundValues[0].trim());
        int startY = Integer.parseInt(boundValues[1].trim());
        int endX = Integer.parseInt(boundValues[2].trim());
        int endY = Integer.parseInt(boundValues[3].trim());

        // Calculate the center of the bounds
        int centerX = (startX + endX) / 2;
        int centerY = (startY + endY) / 2;

        // Perform the click action
        TouchAction<?> touchAction = new TouchAction<>(driver);
        touchAction.tap(PointOption.point(centerX, centerY))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(200))) // Optional delay
                .perform();

        System.out.println("Clicked on element at bounds: " + bounds);
    }

    public void UploadPostMethod() throws InterruptedException {
        logger.info("Application started");
        logger.debug("This is a debug message");
        System.out.println("UploadPost method started");
        addPostPlusBtn.click();
        System.out.println("addPostPlusBtn clicked");
        Thread.sleep(3000);
        continueBtn.click();
        System.out.println("continueBtn clicked");
        Thread.sleep(3000);
        allowPhotosBtn.click();
        System.out.println("allowPhotosBtn clicked");
        Thread.sleep(3000);
        clickElementByBounds("[6,384][442,820]");
      //  photoToUpload.click();
        System.out.println("photo selected for uipload");
        Thread.sleep(4000);
        clickElementByBounds("[1202,134][1308,197]");
        Thread.sleep(3000);
        nextBtn.click();
        System.out.println("nextBtn clicked");
        Thread.sleep(3000);
        captoinBtn.click();
        System.out.println("captoinBtn clicked");
        Thread.sleep(3000);
        CaptoinSendKey.sendKeys("best ever car");
        System.out.println("CaptoinSendKey send keys");
        Thread.sleep(3000);
        shareBtn.click();
        System.out.println("shareBtn clicked");
        Thread.sleep(3000);
        System.out.println("UploadPost method completed");

    }


    public void ArchivePost() throws InterruptedException {
        System.out.println("ArchivePost method started");
        profileBtn.click();
        System.out.println("profileBtn clicked");
        Thread.sleep(3000);
        postToEdit.click();
        System.out.println("postToEdit clicked");
        Thread.sleep(3000);
        postMenu.click();
        System.out.println("postMenu clicked");
        Thread.sleep(3000);
        archivePostBtn.click();
        System.out.println("archivePostBtn clicked");
        Thread.sleep(3000);
        System.out.println("ArchivePost method completed");
    }

    public void EditPostLocation()  throws InterruptedException{
        System.out.println("EditPost method started");
        profileBtn.click();
        System.out.println("profileBtn clicked");
        Thread.sleep(3000);
        postToEdit.click();
        System.out.println("postToEdit clicked");
        Thread.sleep(3000);
        postMenu.click();
        System.out.println("postMenu clicked");
        Thread.sleep(3000);
        editPostBtn.click();
        System.out.println("editPostBtn clicked");
        Thread.sleep(3000);
        EditPostAddLocatoin.click();
        System.out.println("EditPostAddLocatoin clicked");
        Thread.sleep(3000);
        findLocatoin.sendKeys("india");
        System.out.println("findLocatoin send keys");
        Thread.sleep(3000);
        selectLocatoin.click();
        System.out.println("selectLocatoin clicked");
        Thread.sleep(3000);
        saveEdit.click();
        System.out.println("saveEdit clicked");
        System.out.println("EditPost method completed");
    }

    public void EditPostCaption() throws InterruptedException{
        System.out.println("EditPost method in uploadPost Class started");
        profileBtn.click();
        System.out.println("profileBtn clicked in upload post class");
        Thread.sleep(3000);
        postToEdit.click();
        System.out.println("postToEdit clicked in upload post class");
        Thread.sleep(3000);
        postMenu.click();
        System.out.println("postMenu clicked in upload post class");
        Thread.sleep(3000);
        editPostBtn.click();
        System.out.println("editPostBtn clicked in upload post class");
        Thread.sleep(3000);
        editCaptoin.clear();
        System.out.println("editCaptoin cleared in upload post class");
        Thread.sleep(3000);
        editCaptoin.sendKeys("best ever car in india");
        System.out.println("editCaptoin send keys in upload post class");
        Thread.sleep(3000);
        saveEdit.click();
        System.out.println("saveEdit clicked in upload post class");
        System.out.println("EditPost method in uploadPost Class completed");

    }

    public void TurnOfCommenting() throws InterruptedException{
        System.out.println("TurnOfCommenting method in uploadPost Class started");
        profileBtn.click();
        System.out.println("profileBtn clicked in upload post class");
        Thread.sleep(3000);
        postToEdit.click();
        System.out.println("postToEdit clicked in upload post class");
        Thread.sleep(3000);
        postMenu.click();
        System.out.println("postMenu clicked in upload post class");
        Thread.sleep(3000);
        TurnOfCommentingBtn.click();
        System.out.println("TurnOfCommentingBtn clicked in upload post class");
        System.out.println("TurnOfCommenting method in uploadPost Class completed");
    }

    public void DeletePost() throws InterruptedException{
        System.out.println("DeletePost method in uploadPost Class started");
        profileBtn.click();
        System.out.println("profileBtn clicked in upload post class");
        Thread.sleep(3000);
        postToEdit.click();
        System.out.println("postToEdit clicked in upload post class");
        Thread.sleep(3000);
        postMenu.click();
        System.out.println("postMenu clicked in upload post class");
        Thread.sleep(3000);
        dltPostBtn.click();
        System.out.println("dltPostBtn clicked in upload post class");
        System.out.println("DeletePost method in uploadPost Class completed");
    }



}
