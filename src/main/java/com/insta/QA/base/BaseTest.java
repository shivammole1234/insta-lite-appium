package com.insta.QA.base;

import com.insta.QA.config.ConfigFileReader;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {
    public AndroidDriver driver;

    public void setUp() throws MalformedURLException, InterruptedException {
        // Read configuration values
        System.out.println("setUp method of base class start");
        ConfigFileReader config = new ConfigFileReader();
        String platformName = config.getProperty("platformName");
        String platformVersion = config.getProperty("platformVersion");
        //String udid = config.getProperty("udid");
        String appPackage = config.getProperty("appPackage");
        String appActivity = config.getProperty("appActivity");
        String serverURL = config.getProperty("url");
        String deviceName=config.getProperty("deviceName");

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("lowReset", true);
        capabilities.setCapability("newCommandTimeout", 900); // Timeout in secondd

        // capabilities.setCapability("udid", udid);
        capabilities.setCapability("appPackage", appPackage);
        capabilities.setCapability("appActivity", appActivity);
        capabilities.setCapability("platformVersion", platformVersion);
        capabilities.setCapability("platformName",platformName);
        capabilities.setCapability("deviceName",deviceName);

        // Initialize Appium Driver
        driver = new AndroidDriver(new URL(serverURL), capabilities);
        System.out.println("Session ID: " + driver.getSessionId());

        Thread.sleep(8000);

       // driver.findElement(By.id("com.google.android.gms:id/cancel")).click();
        System.out.println("setUp method of base class end");

    }



//    public void tearDown() throws InterruptedException {
//        if (driver != null) {
//            driver.quit();
//        }
//    }
}