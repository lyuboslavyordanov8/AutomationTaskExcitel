package steps;

import io.cucumber.java.en.When;
import pages.UserTicketsPage;

public class UserTicketsSteps {

    UserTicketsPage userTicketsPage = new UserTicketsPage();

    @When("the user open a {string} ticket")
    public void theUserOpenTicket(String searchText) {

        userTicketsPage.setSwipeMaxAndroidElementTicketButton();
        userTicketsPage.userSelectsPaymentTicket(searchText);

    }

    @When("the details for the ticket are displayed")
    public void theDetailsForTheTicketAreDisplayed() {
        userTicketsPage.verifyAndDisplayTicketInfo();
    }
}
