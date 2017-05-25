import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by vikas on 01/03/2017.
 */

@RunWith(Cucumber.class)
@CucumberOptions
        (plugin = {"pretty", "html:target/cucumber-report","json:target/cucumber.json","usage:target/cucumber-usage.json"},
         features = "src/test/features",
         strict = true,
         monochrome = true,
         tags= {"@test"}
        )

public class WebRunnerSuiteTest {
}
