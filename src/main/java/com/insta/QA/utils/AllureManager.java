package com.insta.QA.utils;


import io.qameta.allure.Step;

public class AllureManager {
    @Step("Performing step: {stepDescription}")
    public static void logStep(String stepDescription) {
        // Automatically logs steps in Allure
    }
}
