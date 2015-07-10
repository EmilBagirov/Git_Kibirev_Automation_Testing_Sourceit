import Steps.RegistrationGmailForm;
import Tools.WebDriverHolder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class TestGmailRegFrom {

    WebDriver driver;
    RegistrationGmailForm steps = PageFactory.initElements(driver, RegistrationGmailForm.class);

    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        WebDriverHolder.setDriver(driver);

    }

    @Test
    public void SubmitFormTOSCheckBoxUnchecked() {

        steps.goToRegFormPage();
        steps.fillGmailRegPageUncheck();
        steps.clickSubmitButton();
        steps.checkErrorMessage();

    }

    @Test
    public void SubmitFormTOSCheckBoxChecked(){

        steps.goToRegFormPage();
        steps.fillGmailRegPageCheck();
        steps.clickSubmitButton();

    }

    @After
    public void tearDown() throws Exception {
        driver.close();

    }
}


