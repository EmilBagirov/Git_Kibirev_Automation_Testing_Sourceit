import Steps.RegistrationGmailForm;
import org.junit.Before;
import org.junit.Test;

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


