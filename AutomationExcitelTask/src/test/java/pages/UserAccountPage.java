package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.junit.Assert;

import java.util.NoSuchElementException;


public class UserAccountPage extends BasePage {

    @AndroidFindBy(accessibility = "userAccountImage")
    private MobileElement userAccountImage;

    @AndroidFindBy(accessibility = "accountInfoSection")
    private MobileElement accountInfoSection;

    @AndroidFindBy(accessibility = "editPencilButton")
    private MobileElement editPencilButton;

    @AndroidFindBy(accessibility = "userGstNumber")
    private MobileElement userGstNumberElement;

    @AndroidFindBy(accessibility = "userGstNumberField")
    private MobileElement userGstNumberField;

    @AndroidFindBy(accessibility = "saveChangesButton")
    private MobileElement saveChangesButton;

    @AndroidFindBy(accessibility = "successfulPopUp")
    private MobileElement successfulGstUpdatePopUp;


    /**
     * IMPORTANT: The accessibility identifier used here is INVENTED and does not represent the actual
     * identifier of the user account image. It is used solely for demonstration purposes to simulate
     * the verification of the user account image in the right down corner after logging in.
     * In a real scenario, replace the invented accessibility identifier with the actual one obtained
     * from the app's source code.
     */

    public UserAccountPage verifyUserAccountImage() {
        Assert.assertTrue( userAccountImage.isDisplayed( ) );
        return this;
    }

    public UserAccountPage clickUserAccountImage() {
        userAccountImage.click();
        return this;
    }

    public UserAccountPage clickAccountInfoSection() {
        accountInfoSection.click();
        return this;
    }

    public UserAccountPage clickEditPencilButton() {
        editPencilButton.click();
        return this;
    }

    public UserAccountPage getUserGst() {
        String gstNumberText = userGstNumberElement.getText();
        double gstNumber = parseGstNumber(gstNumberText);
        System.out.println("The user current GST number is: " + gstNumber);
        return this;
    }

    private static double parseGstNumber(String gstNumberText) {
        String numericGstText = gstNumberText.replaceAll("[^0-9.]", "");
        return Double.parseDouble(numericGstText);
    }

    public UserAccountPage enterNewGstNumber() {
        userGstNumberField.sendKeys("22AAAAA0000A1Z5");
        return this;
    }

    public UserAccountPage clickSaveChangesButton() {
        saveChangesButton.click();
        return this;
    }

    public boolean verifySuccessfulGstChange() {
        try {
            return successfulGstUpdatePopUp.isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}
