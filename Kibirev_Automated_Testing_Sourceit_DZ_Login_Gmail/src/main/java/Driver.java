
import org.openqa.selenium.WebDriver;

public class Driver {

    public static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    public static void setDriver(WebDriver driver) {
        Driver.driver = driver;
    }



}

