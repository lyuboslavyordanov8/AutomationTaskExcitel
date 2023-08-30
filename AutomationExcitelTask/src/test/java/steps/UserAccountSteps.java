package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.UserAccountPage;

public class UserAccountSteps {

    UserAccountPage userAccountPage = new UserAccountPage();

    @When("the user updates his GST number")
    public void theUserOpenTheAccountInfoScreen() {
        userAccountPage
                .clickUserAccountImage()
                .clickAccountInfoSection()
                .getUserGst()
                .clickEditPencilButton()
                .enterNewGstNumber()
                .clickSaveChangesButton();
    }

    @When("the user Gst number is successfully updated")
    public void theUserGstNumberIsSuccessfullyUpdated() {
        userAccountPage.verifySuccessfulGstChange();
    }
}
