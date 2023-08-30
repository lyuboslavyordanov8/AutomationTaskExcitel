package steps;

import io.cucumber.java.en.When;
import pages.LoginPage;
import pages.UserAccountPage;
import pages.WelcomePage;

public class UserLoginSteps {

    WelcomePage welcomePage = new WelcomePage();
    UserAccountPage userAccountPage = new UserAccountPage();
    LoginPage loginPage = new LoginPage();

    @When("the user navigates to Excitel app welcome page")
    public void navigateToWelcomePage() {
        welcomePage.clickSkipButton();
    }

    @When("the user enters his login credentials")
    public void theUserLoginWithValidCredentials() {
        loginPage
                .enterUsername()
                .enterPassword()
                .clickLoginButton();
    }

    @When("the user is successfully logged in")
    public void playerIsSuccessfullyLoggedIn() {
        userAccountPage.verifyUserAccountImage();
    }

}
