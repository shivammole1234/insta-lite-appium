package com.insta.QA.pages;
import com.insta.QA.base.BaseTest;
import com.insta.QA.config.ConfigFileReader;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;


public class LoginPage extends BaseTest {

    private static final Logger log = LoggerFactory.getLogger(LoginPage.class);
    ConfigFileReader prop = new ConfigFileReader();
    HomePage homePage;


    public LoginPage(AndroidDriver driver) throws InterruptedException {
        System.out.println("in login page constructp start");
        this.driver = driver;
        homePage=new HomePage(driver);
        PageFactory.initElements(driver, this);
        System.out.println("in login page const end");

    }

    @FindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup[3]")
    WebElement loginBtn;

    @FindBy(xpath =
            "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[3]/android.widget.MultiAutoCompleteTextView[1]")
    WebElement userName;

    @FindBy(xpath =
            "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[3]/android.widget.MultiAutoCompleteTextView[2]")
    WebElement pass;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[3]/android.view.ViewGroup[4]/android.view.ViewGroup")
    WebElement loginBtn_loginUI;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Profile\"]")
    WebElement profileBtn;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[4]/android.view.ViewGroup[5]")
    WebElement menuOnProfileBtn;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[5]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]")
    WebElement settingOnProfile;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[4]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[21]/android.view.ViewGroup")
    WebElement logOutBtn;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[4]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[17]/android.view.ViewGroup")
    WebElement changeThemeBtn;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[4]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[10]/android.view.ViewGroup")
    WebElement notificaotinBtn;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[4]/android.view.ViewGroup[5]")
    WebElement pouseAllNotiBtn;

    @FindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[4]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup")
    WebElement somethingWentWrongBtn;

    public void loginMethod() throws InterruptedException {
        System.out.println("in login method of LoginPage class");
        Thread.sleep(2000);
        System.out.println("allow btn method started in Login page");
        Thread.sleep(3000);
        homePage.setAllowContBtn();
        loginBtn.click();
    }

    public void loginUserNamePass(String username,String password) throws InterruptedException {
        System.out.println("in loginUserNamePass method of LoginPage class");
        Thread.sleep(2000);
        loginMethod();
        userName.clear();
        userName.sendKeys(username);
        System.out.println("username entered in loginUserNamePass method of LoginPage class");
        Thread.sleep(2000);
        pass.clear();
        pass.sendKeys(password);
        System.out.println("password entered in loginUserNamePass method of LoginPage class");
        Thread.sleep(2000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(loginBtn_loginUI));
        Thread.sleep(1000);
        loginBtn_loginUI.click();
        Thread.sleep(1000);
        System.out.println("login btn clicked after submiting information");
        Thread.sleep(5000);
        somethingWentWrongBtn.click();
        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(20));
        // WebElement NotNow = wait2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[4]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]")));
        //NotNow.click();

        Thread.sleep(1000);
        System.out.println("save pass info not now clicked");
    }

    public void logOut() throws InterruptedException {
        System.out.println("in logout method for logout in loougout method");
        profileBtn.click();
        System.out.println("profile btn clidke for logout in loougout method");
        menuOnProfileBtn.click();
        System.out.println("menu opn profile clicked for logout in loougout method  ");
        Thread.sleep(10000);
        settingOnProfile.click();
        System.out.println("setting on profile clicked for logout");
        Thread.sleep(1000);
        logOutBtn.click();
    }

    public void changeTheme() throws InterruptedException {
        System.out.println("in chsnge theme method of LoginPage class");
        Thread.sleep(1000);
        profileBtn.click();
        System.out.println("profile btn clidke for logout in changeTheme method");
        Thread.sleep(1000);
        menuOnProfileBtn.click();
        Thread.sleep(1000);
        System.out.println("menu opn profile clicked for logout in changeTheme method  ");
        Thread.sleep(10000);
        settingOnProfile.click();
        System.out.println("setting on profile clicked for logout");
        Thread.sleep(1000);
        changeThemeBtn.click();

        // Locate elements for dark and light themes
        WebElement darkThemeElement = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[4]/android.view.ViewGroup[4]"));
        WebElement lightThemeElement = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[4]/android.view.ViewGroup[3]"));

         // Check if dark theme is active
        if (darkThemeElement.isDisplayed() && darkThemeElement.isEnabled()) {
            System.out.println("Dark theme is currently active. Switching to light theme.");
            lightThemeElement.click(); // Switch to light theme
        } else if (lightThemeElement.isDisplayed() && lightThemeElement.isEnabled()) {
            System.out.println("Light theme is currently active. Switching to dark theme.");
            darkThemeElement.click(); // Switch to dark theme
        } else {
            System.out.println("Unable to determine the current theme state.");
        }


    }

    public void notificationSetting() throws InterruptedException {

        Thread.sleep(1000);
        System.out.println("in notificationSetting theme method of LoginPage class");
        profileBtn.click();
        System.out.println("profile btn clidke for notificationSetting method in notificationSetting method");
        Thread.sleep(1000);
        menuOnProfileBtn.click();
        Thread.sleep(1000);
        System.out.println("menu opn profile clicked for notificationSetting method in notificationSetting method  ");
        Thread.sleep(10000);
        settingOnProfile.click();
        System.out.println("setting on profile clicked for notificationSetting");
        Thread.sleep(1000);
        notificaotinBtn.click();
        System.out.println("notificaotinBtn clicked for notificationSetting in notificationSetting method  ");
        Thread.sleep(1000);
        pouseAllNotiBtn.click();
        System.out.println("notificatoin setting changed");
    }
}