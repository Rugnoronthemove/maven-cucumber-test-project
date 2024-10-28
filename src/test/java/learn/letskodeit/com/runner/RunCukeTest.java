package learn.letskodeit.com.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        monochrome = true,
        glue = "com/nopcommerce/demo/steps",
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        tags = "@login,@practise"
)
public class RunCukeTest extends AbstractTestNGCucumberTests {

}
