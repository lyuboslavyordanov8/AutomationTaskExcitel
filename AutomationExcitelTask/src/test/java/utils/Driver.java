package utils;

import io.appium.java_client.AppiumDriver;

public class Driver {

    static AppiumDriver<?> appiumDriver;

    public static AppiumDriver<?> getAppiumDriver() {
        return appiumDriver;
    }
}
