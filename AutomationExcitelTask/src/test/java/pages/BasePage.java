package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class BasePage {
    static AppiumDriver<?> driver;

    public BasePage() {
        driver = getDriver();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public AppiumDriver<?> getDriver() {
        driver = Driver.getAppiumDriver();
        return driver;
    }
}
