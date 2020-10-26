package android;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = {"src/test/java/android/feature"},
        glue = "android",
        tags = {"@KHCN_booking_flower-01,@KHCN_booking_flower-03"},
        plugin = {
                "html:target/result",
                "pretty",
                "json:target/test-classes/reports/result.json"
        },
        monochrome = true
)

public class Runner extends AbstractTestNGCucumberTests {
}
