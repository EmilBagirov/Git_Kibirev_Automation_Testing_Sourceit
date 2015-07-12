import Steps.RegistrationGmailForm;
import Tools.WebDriverHolder;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestGmailRegFrom extends BaseTest{

    private RegistrationGmailForm steps = new RegistrationGmailForm();

    @Before
    public void setUpMethod() {

        steps.goToRegFormPage();

    }

    @Test
    public void SubmitFormTOSCheckBoxUnchecked() {

        steps.fillGmailRegPageUncheck();
        steps.clickSubmitButton();
        steps.checkErrorMessage();

    }

    @Test
    public void SubmitFormTOSCheckBoxChecked(){

        steps.fillGmailRegPageCheck();
        steps.clickSubmitButton();

    }

}


