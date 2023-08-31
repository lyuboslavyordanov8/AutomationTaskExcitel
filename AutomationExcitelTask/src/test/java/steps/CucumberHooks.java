package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.appium.Driver;

import java.net.MalformedURLException;


public class CucumberHooks

{
    public static final String PLATFORM = System.getProperty( "platformName" );


    @Before
    public void beforeSetup( Scenario scenario )
        throws
        MalformedURLException
    {
        switch ( PLATFORM )
        {
            case "Android":
                Driver.initializeAndroidDriver( scenario );
                break;
            default:
                throw new UnsupportedOperationException( String.format( "Invalid platform value - [%s]",
                                                                        PLATFORM ) );
        }
    }

    @After
    public void teardownAppiumDriver( )
    {
        Driver.stopAppiumDriver( ); //stop the Driver after the scenario or feature has run
    }
}
