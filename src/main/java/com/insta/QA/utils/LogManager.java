package com.insta.QA.utils;


import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.Logger;

public class LogManager {

    private static final Logger logger = Logger.getLogger(LogManager.class);

    static{
        PropertyConfigurator.configure("src/resources/log4j.properties");
    }

    public static void info(String message) {
        logger.info(message);
    }

    public static void error(String message) {
        logger.error(message);
    }

    public static void warn(String message) {
        logger.warn(message);
    }
}

