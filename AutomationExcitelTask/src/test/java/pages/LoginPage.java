package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;


public class LoginPage extends BasePage {

    /**
     * IMPORTANT: Due to limitations , direct access to Appium Inspector is not available.
     * The declared accessibility identifiers in this class are INVENTED and are used to represent the elements
     * found in the login form of the app. These identifiers are used for demonstration purposes to simulate the
     * interactions that would occur if Appium Inspector was accessible.

     * In a real-world scenario, we would replace these invented identifiers with the actual ones obtained from the Appium Inspector or the source code of the app.
     */

    @AndroidFindBy(accessibility = "usernameField")
    private MobileElement usernameField;

    @AndroidFindBy(accessibility = "passwordField")
    private MobileElement passwordField;

    @AndroidFindBy(accessibility = "loginButton")
    private MobileElement loginButton;


    public LoginPage enterUsername() {
        usernameField.sendKeys("1100088806");
        return this;
    }

    public LoginPage enterPassword() {
        passwordField.sendKeys("71c992");
        return this;
    }

    public LoginPage clickLoginButton() {
        loginButton.click();
        return this;
    }


}
