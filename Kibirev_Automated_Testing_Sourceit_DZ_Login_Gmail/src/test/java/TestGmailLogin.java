import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestGmailLogin {

    WebDriver driver;


    String email = "nextissuetest1@gmail.com";
    String pass = "nextistest1";
    String incpass = "dsadsadadsa";

    @Before
    public void setUp() {
        driver = new FirefoxDriver();
        WebDriverHolder.setDriver(driver);
        driver.get(Locators.gmailLink);

    }

    @Test
    public void LogInErr() {
        LoginPage.PasswordError(email, incpass);
    }

    @Test
    public void CheckMailItems() {
        MailPage.LogInCheckMailItems(email, pass);
    }

    @After
    public void tearDown() {
        driver.close();

    }


}
