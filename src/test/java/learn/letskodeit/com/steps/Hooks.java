package learn.letskodeit.com.steps;

import learn.letskodeit.com.propertyreader.PropertyReader;
import learn.letskodeit.com.utility.Utility;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends Utility {

    //Annotation from cucumber.api.java //if selected from junit will get null pointer exception
    @Before
    public void setUp() {
        selectBrowser(PropertyReader.getInstance().getProperty("browser"));
    }

    //Annotation from cucumber.api.java //if selected from junit will get null pointer exception
    //if Scenario is failing to take screenshot adding parameter as Scenario from cucumber
    @After
    public void tearDown (Scenario scenario) {
        if (scenario.isFailed()) {
            final byte[] screenshot = getScreenShot();
            scenario.attach(screenshot, "image/png", scenario.getName());
        }
        closeBrowser();
    }
}
