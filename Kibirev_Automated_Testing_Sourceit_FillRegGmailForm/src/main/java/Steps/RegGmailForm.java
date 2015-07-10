package Steps;


import Tools.RegFormComponents;
import Tools.UiUtils;
import Tools.WaitingUtils;
import org.openqa.selenium.support.ui.Select;

import static Tools.UiUtils.randomCaptcha;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class RegGmailForm {

    private Select dropDown;
    RegFormComponents regFormComponents;

    public RegGmailForm() {
        this.regFormComponents = new RegFormComponents();
    }


    public void goToRegFormPage () {
        UiUtils.maxWindow();
        UiUtils.goTo("https://gmail.com");
        regFormComponents.signUpLink().click();
    }

    public void checkErrorMessage () {

        WaitingUtils.IplicityWait();
        String errmsg = regFormComponents.tosErrorMsg().getText();
        assertThat(errmsg, equalTo("Чтобы создать аккаунт Google, нужно принять наши Условия использования."));

    }

    public  void clickSubmitButton () {

        regFormComponents.submitButton().click();
        WaitingUtils.IplicityWait();

    }

    public void fillGmailRegPageUncheck () {

        regFormComponents.firstName().sendKeys("Test");
        regFormComponents.lastName().sendKeys("Testovoy");
        regFormComponents.gmailAddress().sendKeys("tttttttest1999");
        regFormComponents.passwordField().sendKeys("-=-=-=-=");
        regFormComponents.confirmPasswordField().sendKeys("-=-=-=-=");
        regFormComponents.birthDay().sendKeys("5");
        regFormComponents.dropDownArrow().click();
        WaitingUtils.IplicityWait();
        regFormComponents.selectBirthdayMonth().click();
        regFormComponents.birthYear().sendKeys("1999");
        regFormComponents.genderDropDown().click();
        WaitingUtils.IplicityWait();
        regFormComponents.genderSelect().click();
        regFormComponents.recoveryNumber().sendKeys("991234987");
        regFormComponents.recoveryMail().sendKeys("recoverymail@gmail.com");
        regFormComponents.enterCaptchaField().sendKeys(randomCaptcha());
        regFormComponents.countryCodeDropdown().click();
        WaitingUtils.IplicityWait();
        regFormComponents.countryCodeSelect().click();

    }

    public void fillGmailRegPageCheck () {

        fillGmailRegPageUncheck();
        regFormComponents.tosCheckbox().click();
        clickSubmitButton();
    }

}


