package learn.letskodeit.com.browserfactory;

import learn.letskodeit.com.propertyreader.PropertyReader;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class ManageBrowser {

    public static WebDriver driver;
    static String baseUrl = PropertyReader.getInstance().getProperty("baseUrl");
    static int implicitlyWait = Integer.parseInt(PropertyReader.getInstance().getProperty("implicitlyWait"));

    //constructor
    public ManageBrowser() {
        //for page factory
        PageFactory.initElements(driver, this);
        //for log4j
//        PropertyConfigurator.configure(System.getProperty("user.dir" + "/src/test/resources/propertiesfile/log4j2.properties"));
    }

    public void selectBrowser(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().clearDriverCache();
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().clearDriverCache();
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        if (browser.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().clearDriverCache();
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitlyWait));
        driver.get(baseUrl);
    }

    public void closeBrowser(){
        if (driver != null) {
            driver.quit();
        }
    }
}
