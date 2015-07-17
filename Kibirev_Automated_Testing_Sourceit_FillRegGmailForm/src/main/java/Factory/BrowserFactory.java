package Factory;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import util.PropertyUtils;

import java.net.MalformedURLException;
import java.net.URL;

public class BrowserFactory {

    private BrowserFactory () {}

    public static WebDriver getDriver(String browser) throws MalformedURLException {

        if ("CHROME".equalsIgnoreCase(browser)) {
            System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
            return new ChromeDriver();
        } else if ("IE".equalsIgnoreCase(browser)){
            System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"\\drivers\\IEDriverServer.exe");
            return new InternetExplorerDriver();
        } else if ("REMOTE".equalsIgnoreCase(browser)){
            DesiredCapabilities cap = new DesiredCapabilities();
            cap.setBrowserName("firefox");
            return new RemoteWebDriver(new URL(PropertyUtils.getProperty("wd.hub")),cap);
        } else {
            return new FirefoxDriver();
        }

    }
}
