package utils.appium;


import io.appium.java_client.AppiumDriver;
import io.cucumber.java.Scenario;
import utils.AndroidCapabilities;

import java.net.MalformedURLException;

public class Driver
{
    static AppiumDriver<?> appiumDriver;

    /**
     * This method relies on the CucumberHooks to initialize the correct driver based on Platform parameters
     */
    public static AppiumDriver<?> getAppiumDriver( )
    {
        return appiumDriver;
    }

    public static void initializeAndroidDriver( Scenario scenario )
        throws
        MalformedURLException
    {
        if ( appiumDriver == null )
        {
            appiumDriver = AndroidCapabilities.initiateDriver( scenario );
        }
    }



    public static void stopAppiumDriver( )
    {
        if ( appiumDriver != null )
        {
            try
            {
                appiumDriver.quit( );
            }
            catch ( Exception ignored )
            {

            }
            appiumDriver = null;

        }
    }
}
