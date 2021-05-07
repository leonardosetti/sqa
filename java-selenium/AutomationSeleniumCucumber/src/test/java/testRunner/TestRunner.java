package testRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/features"},
        glue = {"steps"},
        plugin = {"pretty", "html:TestReport"},
        dryRun = true,
        stepNotifications = true,
        monochrome = true
        //tags = {"@mandatory"}
)

public class TestRunner {
}
