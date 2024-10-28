package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",
        glue = "stepdef",
        plugin = {"pretty",
                  "html:target/cucumber-reports.html",
                  "json:test-reports/target/cucumber.json",
                  "summary",
                  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        tags= "@TC16")
public class runner {
}