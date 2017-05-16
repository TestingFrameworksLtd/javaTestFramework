package hooks;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import web.SharedDriver;

/**
 * Created by vikas on 26/02/2017.
 */
public class Hooks extends SharedDriver {

    private static boolean initialized = false;

    public Hooks () {}

    @Before
    public void setUp()
    {
        if(!initialized) {
            Runtime.getRuntime().addShutdownHook(new Thread(){
                @Override
               public void run(){
                    REAL_DRIVER.quit();
                }
            });
            initialized = true;
        }
    }

    @Before
    public void beforeScenario()
    {
        System.out.println("Before scenario");
    }

    @After
    public void afterScenario(Scenario scenario)
    {
        System.out.println("After scenario");
        if (scenario.isFailed())
        {
            byte[] screenshot = ((TakesScreenshot) REAL_DRIVER).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot,"image/png");
        }
    }
}
