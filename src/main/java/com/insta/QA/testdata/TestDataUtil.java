package com.insta.QA.testdata;




import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.insta.QA.utils.LogManager;

import java.io.FileReader;
import java.io.IOException;

public class TestDataUtil {
    private static final String TEST_DATA_FILE = "C:\\User\\shiv\\java_workplace\\selenium\\Palmonas_Test[Insta_Lite]\\src\\resources\\testdata.json";

    public static JsonObject getTestData(String key) {
        try (FileReader reader = new FileReader(TEST_DATA_FILE)) {
            LogManager.info("Reading test data for key: " + key);
            JsonObject jsonData = JsonParser.parseReader(reader).getAsJsonObject();
            return jsonData.getAsJsonObject(key);
        } catch (IOException e) {
            LogManager.error("Failed to read test data file: " + TEST_DATA_FILE);
            throw new RuntimeException(e);
        }
    }
}