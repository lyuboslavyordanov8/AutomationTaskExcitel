package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class WelcomePage
    extends BasePage
{

    @AndroidFindBy ( xpath = "/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view"
        + ".ViewGroup[2]/android.widget.TextView" )
    private MobileElement skipIntroButton;

    /**
     * IMPORTANT: This is the welcome page where we have a series of introductory steps.
     * For faster execution during testing, we jumping through the steps by clicking the "Skip" button.
     * <p>
     * NOTE: The accessibility identifier used for the skip button is INVENTED and is used solely for
     * demonstration purposes. In a real scenario, replace the invented identifier with the actual one obtained
     * from the app's source code or documentation.
     */

    public WelcomePage clickSkipButton( )
    {
        skipIntroButton.click( );
        return this;
    }
}

