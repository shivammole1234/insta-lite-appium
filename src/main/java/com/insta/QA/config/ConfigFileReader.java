package com.insta.QA.config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {
    public Properties properties;

    public ConfigFileReader(){
        properties=new Properties();

        try(FileInputStream fileInputStream=new FileInputStream("C:\\Users\\shiv\\java_workspace\\Appium\\Palmonas_Test\\src\\resources\\config.properties"))
        {
            properties.load(fileInputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
    public  String getProperty(String key){
        return properties.getProperty(key);
    }
}
