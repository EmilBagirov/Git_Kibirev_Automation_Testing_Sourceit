import Factory.BrowserFactory;
import Listeners.EventListeners;
import Tools.WebDriverHolder;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import util.PropertyUtils;

import java.net.MalformedURLException;

public abstract class BaseTest {

    private static WebDriver driver;
    static EventFiringWebDriver eventDriver;

    @BeforeClass
    public static void setUp() throws MalformedURLException {

        driver = BrowserFactory.getDriver(PropertyUtils.getProperty("browser"));
        eventDriver = new EventFiringWebDriver(driver);
        eventDriver.register(new EventListeners());
        WebDriverHolder.setDriver(eventDriver);

    }

    @AfterClass
    public static void tearDown() {

        eventDriver.close();

    }
}
