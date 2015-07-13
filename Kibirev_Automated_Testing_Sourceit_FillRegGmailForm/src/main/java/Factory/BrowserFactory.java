package Factory;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {

    private BrowserFactory () {}

    public static WebDriver getDriver(String browser) {

        WebDriver defaultDriver = new FirefoxDriver();

        if ("CHROME".equalsIgnoreCase(browser)) {
            System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
            return new ChromeDriver();
        } else if ("IE".equalsIgnoreCase(browser)){

            System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"\\drivers\\IEDriverServer.exe");
            return new InternetExplorerDriver();
        } else {
            return defaultDriver;
        }

    }
}
