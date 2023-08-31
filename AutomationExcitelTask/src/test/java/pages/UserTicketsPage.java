package pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class UserTicketsPage extends BasePage {


    @AndroidFindBy(accessibility = "ticketHistoryButton")
    private MobileElement ticketHistoryButton;

    @AndroidFindBy(accessibility = "showDetailsButton")
    private MobileElement showDetailsButton;

    @AndroidFindBy(accessibility = "ticketsList")
    private List<MobileElement> ticketsList;

    @AndroidFindBy(accessibility = "ticketNumberElement")
    private MobileElement ticketNumberInfo;

    @AndroidFindBy(accessibility = "assignedToElement")
    private MobileElement assignedToInfo;

    @AndroidFindBy(accessibility = "ticketCategoryElement")
    private MobileElement ticketCategoryInfo;

    @AndroidFindBy(accessibility = "statusElement")
    private MobileElement statusCategoryInfo;

    @AndroidFindBy(accessibility = "currentExpiryDateElement")
    private MobileElement currentExpiryDateInfo;

    @AndroidFindBy(accessibility = "currentPlanElement")
    private MobileElement currentPlanInfo;

    /**
     * IMPORTANT: This step assumes that we'll execute on different device dimensions, so we need a scroll gesture
     * to make sure our scenario won't fail because appium cant find the element for different dimensions.
     */
    public void setSwipeMaxAndroidElementTicketButton() {
        MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" + ".scrollIntoView(new UiSelector().text(\"Ticket History\"))"));
    }

    /**
     * IMPORTANT: This method assumes that the screen contains many tickets,
     * and it uses a for loop to filter and process each ticket element. After
     * picking the correct ticket, the method retrieves the ticket information and
     * checks if any field is empty. If any field is empty, the test scenario fails.
     */
    public UserTicketsPage userSelectsPaymentTicket(String searchText) {
        ticketHistoryButton.click();

        ArrayList<MobileElement> filteredElements = new ArrayList<MobileElement>();

        for (MobileElement ticketType : ticketsList) {
            if (ticketType
                    .getText()
                    .contains(searchText)) {
                filteredElements.add(ticketType);
                ticketType.click();
                break;
            }
        }
        return this;
    }

    public UserTicketsPage verifyAndDisplayTicketInfo() {

        showDetailsButton.click();

        String ticketNumber = ticketNumberInfo.getText();
        String assignedTo = assignedToInfo.getText();
        String ticketCategory = ticketCategoryInfo.getText();
        String status = statusCategoryInfo.getText();
        String currentExpiryDate = currentExpiryDateInfo.getText();
        String currentPlan = currentPlanInfo.getText();

        System.out.println("Ticket number: " + ticketNumber);
        System.out.println("Assigned to: " + assignedTo);
        System.out.println("Ticket Category: " + ticketCategory);
        System.out.println("Status: " + status);
        System.out.println("Current expiry date: " + currentExpiryDate);
        System.out.println("Current plan: " + currentPlan);

        assertNotEmpty(ticketNumber, "Ticket number is empty");
        assertNotEmpty(assignedTo, "Assigned to is empty");
        assertNotEmpty(ticketCategory, "Ticket category is empty");
        assertNotEmpty(status, "Status is empty");
        assertNotEmpty(currentExpiryDate, "Current expiry date is empty");
        assertNotEmpty(currentPlan, "Current plan is empty");

        return this;
    }

    private void assertNotEmpty(String value, String errorMessage) {
        Assert.assertFalse( errorMessage,
                            value.isEmpty( ) );
    }
}
