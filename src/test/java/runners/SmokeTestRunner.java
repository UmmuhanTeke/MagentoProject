package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "@Smoke",
        features = {"src/test/java/featureFiles"},
        glue = {"stepDefinitions"},
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)

public class SmokeTestRunner extends AbstractTestNGCucumberTests {
}
