package com.insta.QA.pages;
import com.insta.QA.base.BaseTest;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends BaseTest {

    public HomePage(AndroidDriver driver) throws InterruptedException {
        System.out.println("HomePage construtor is started");
        this.driver = driver;
        PageFactory.initElements(driver, this);
        System.out.println("homePage constrotor ended");
    }

    @FindBy(xpath =
           "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[1]")
    WebElement allowBtn;


    public void clickWithHelpOfBounds(String bounds) {
        // Extract coordinates from bounds string
        String[] parts = bounds.replace("[", "").replace("]", ",").split(",");
        int x1 = Integer.parseInt(parts[0].trim());
        int y1 = Integer.parseInt(parts[1].trim());
        int x2 = Integer.parseInt(parts[2].trim());
        int y2 = Integer.parseInt(parts[3].trim());

        // Calculate center of bounds
        int centerX = (x1 + x2) / 2;
        int centerY = (y1 + y2) / 2;

        // Perform tap action
        TouchAction action = new TouchAction(driver);
        action.tap(TapOptions.tapOptions().withPosition(PointOption.point(centerX, centerY))).perform();
    }

    public void setAllowContBtn() throws InterruptedException {
        Thread.sleep(5000);
        System.out.println("setAllowContBtn clicking in home page");
        clickWithHelpOfBounds("[82,1484][1214,1652]");
        Thread.sleep(1000);
        System.out.println("setAllowContBtn clicked  in home page ");
    }




}