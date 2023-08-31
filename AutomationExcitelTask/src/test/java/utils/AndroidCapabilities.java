package utils;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.Scenario;
import org.openqa.selenium.MutableCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AndroidCapabilities
{
    public static AndroidDriver<?> initiateDriver( Scenario scenario )
        throws
        MalformedURLException
    {
        MutableCapabilities cap = new MutableCapabilities( );

        cap.setCapability( "app",
                           "/Users/LYordanov/Downloads/app-release_ 20230830.4.apk" );

        cap.setCapability( "appWaitDuration",
                           60000 );
        cap.setCapability( "appWaitForLaunch",
                           true ); //set the app to install and use as the one in the filepath specified above
        cap.setCapability( "platformName",
                           "Android" );
        cap.setCapability( "acceptInsecureCerts",
                           "true" );
        cap.setCapability( "autoGrantPermissions",
                           "true" );
        cap.setCapability( "automationName",
                           "UiAutomator2" );
        cap.setCapability( "allowTouchIdEnroll",
                           "false" );
        cap.setCapability( "noReset",
                           "false" );
        cap.setCapability( "fullReset",
                           "false" );
        cap.setCapability( "platformVersion",
                           "13" );// Provide valid platform version based on the device
        cap.setCapability( "androidInstallTimeout",
                           90000 );
        cap.setCapability( "deviceReadyTimeout",
                           60 );
        cap.setCapability( "enforceAppInstall",
                           true );
        cap.setCapability( "appiumVersion",
                           "1.21.0" );
        AndroidDriver<?> driver;

        {
            System.out.println( "****** executing in local device *****" );
            cap.setCapability( "RF8MC088F4P",
                               "your local device details" );
            driver = new AndroidDriver( new URL( "http://0.0.0.0:4723/wd/hub" ),
                                        cap );
        }
        return driver;
    }
}
