package co.uk.safebear;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        // This is my report
        plugin = {"json:target/cucumber-report/cucumber.json"},
        // Tags determine which tests are run
        tags = {"not @to-do","@high-impact"}
        )
public class RunCucumberTest {
}
