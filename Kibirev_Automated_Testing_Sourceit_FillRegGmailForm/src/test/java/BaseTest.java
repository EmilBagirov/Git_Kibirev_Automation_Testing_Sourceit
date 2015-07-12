import Factory.BrowserFactory;
import Tools.WebDriverHolder;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import util.PropertyUtils;

public abstract class BaseTest {

    private static WebDriver driver;

    @BeforeClass
    public static void setUp() {


        driver = BrowserFactory.getDriver(PropertyUtils.getProperty("browser"));
        WebDriverHolder.setDriver(driver);

    }

    @AfterClass
    public static void tearDown() {
        driver.close();

    }
}
