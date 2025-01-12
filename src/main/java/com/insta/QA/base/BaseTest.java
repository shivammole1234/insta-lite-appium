package com.polmonos.QA.base;


import com.polmonos.QA.config.ConfigReader;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
public class BaseTest {
    protected AppiumDriver driver;

    public void setUp() throws MalformedURLException, InterruptedException {
        // Read configuration values
        ConfigReader config = new ConfigReader();
        String platformName = config.getProperty("platformName");
        String platformVersion = config.getProperty("platformVersion");
        String udid = config.getProperty("udid");
        String appPackage = config.getProperty("appPackage");
        String appActivity = config.getProperty("appActivity");
        String serverURL = config.getProperty("url");

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("noReset", true);
       // capabilities.setCapability("udid", udid);
        capabilities.setCapability("appPackage", appPackage);
        capabilities.setCapability("appActivity", appActivity);
        capabilities.setCapability("platformVersion", platformVersion);
        capabilities.setCapability("platformName",platformName);

        // Initialize Appium Driver
        driver = new AndroidDriver(new URL(serverURL), capabilities);

        Thread.sleep(8000);
        Thread.sleep(7000);
        //driver.findElement(By.id("com.google.android.gms:id/cancel")).click();
        System.out.println("---------------app opened ---------------");

    }

//    public void tearDown() throws InterruptedException {
//        if (driver != null) {
//            driver.quit();
//        }
//    }
}
