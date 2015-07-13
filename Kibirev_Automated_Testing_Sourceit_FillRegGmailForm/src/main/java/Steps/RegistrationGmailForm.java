package Steps;


import Tools.RegistrationFormComponents;
import Tools.UiUtils;
import Tools.WaitingUtils;

import static Tools.UiUtils.randomCaptcha;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class RegistrationGmailForm {

    RegistrationFormComponents regFormComponents;

    public RegistrationGmailForm() {
        this.regFormComponents = new RegistrationFormComponents();
    }


    public void goToRegFormPage () {
        UiUtils.maxWindow();
        UiUtils.goTo("https://gmail.com");
        regFormComponents.signUpLink().click();
    }

    public void checkErrorMessage () {

        WaitingUtils.implicityWait();
        String errmsg = regFormComponents.tosErrorMsg().getText();
        assertThat(errmsg, anyOf(startsWith("Чтобы создать аккаунт Google, нужно принять наши Условия использования."),
                containsString("In order to use our services, you must agree to Google's Terms of Service.")));

    }

    public  void clickSubmitButton () {

        WaitingUtils.implicityWait();
        regFormComponents.submitButton().click();

    }

    public void fillGmailRegPageUncheck () {

        WaitingUtils.implicityWait();
        regFormComponents.firstName().sendKeys("Test");
        regFormComponents.lastName().sendKeys("Testovoy");
        regFormComponents.gmailAddress().sendKeys("tttttttest1999");
        regFormComponents.passwordField().sendKeys("-=-=-=-=");
        regFormComponents.confirmPasswordField().sendKeys("-=-=-=-=");
        regFormComponents.birthDay().sendKeys("5");
        regFormComponents.birthdayDropDown().click();
        regFormComponents.selectBirthdayMonth().click();
        regFormComponents.birthYear().sendKeys("1999");
        regFormComponents.genderDropDown().click();
        regFormComponents.genderSelect().click();
        regFormComponents.recoveryNumber().sendKeys("991234987");
        regFormComponents.recoveryMail().sendKeys("recoverymail@gmail.com");
        regFormComponents.enterCaptchaField().sendKeys(randomCaptcha());
        regFormComponents.countryCodeDropdown().click();
        regFormComponents.countryCodeSelect().click();

    }

    public void fillGmailRegPageCheck () {

        WaitingUtils.implicityWait();
        fillGmailRegPageUncheck();
        regFormComponents.tosCheckbox().click();
        clickSubmitButton();
    }

}


