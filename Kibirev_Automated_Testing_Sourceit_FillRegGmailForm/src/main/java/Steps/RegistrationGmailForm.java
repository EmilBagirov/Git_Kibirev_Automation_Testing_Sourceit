package Steps;


import Tools.RegistrationFormComponents;
import Tools.UiUtils;
import Tools.WaitingUtils;

import static Tools.UiUtils.randomCaptcha;
import static org.hamcrest.CoreMatchers.equalTo;
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

        String errmsg = regFormComponents.tosErrorMsg().getText();
        assertThat(errmsg, equalTo("Чтобы создать аккаунт Google, нужно принять наши Условия использования."));

    }

    public  void clickSubmitButton () {

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
        WaitingUtils.implicityWait();
        regFormComponents.selectBirthdayMonth().click();
        regFormComponents.birthYear().sendKeys("1999");
        regFormComponents.genderDropDown().click();
        WaitingUtils.implicityWait();
        regFormComponents.genderSelect().click();
        regFormComponents.recoveryNumber().sendKeys("991234987");
        regFormComponents.recoveryMail().sendKeys("recoverymail@gmail.com");
        regFormComponents.enterCaptchaField().sendKeys(randomCaptcha());
        regFormComponents.countryCodeDropdown().click();
        WaitingUtils.implicityWait();
        regFormComponents.countryCodeSelect().click();

    }

    public void fillGmailRegPageCheck () {

        fillGmailRegPageUncheck();
        WaitingUtils.implicityWait();
        regFormComponents.tosCheckbox().click();
        clickSubmitButton();
    }

}


