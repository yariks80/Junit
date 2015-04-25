import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by my on 22.04.2015.
 */
public class WebDriverFactory {
    private static WebDriver driver;

    private WebDriverFactory() {
    }

    public static WebDriver getWebDRiverInstance() {
        if (driver == null) {
            driver = new FirefoxDriver();
        }
        return driver;
    }
}
