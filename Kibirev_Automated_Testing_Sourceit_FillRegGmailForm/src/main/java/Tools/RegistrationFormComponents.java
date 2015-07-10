package Tools;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static Tools.UiUtils.$;

public class RegistrationFormComponents {

    public WebElement firstName() {
        return $(By.id("FirstName"));
    }

    public WebElement lastName() {
        return $(By.id("LastName"));
    }

    public WebElement gmailAddress() {

        return $(By.id("GmailAddress"));
    }

    public WebElement passwordField() {

        return $(By.id("Passwd"));
    }

    public WebElement confirmPasswordField() {

        return $(By.id("PasswdAgain"));
    }

    public WebElement birthDay() {

        return $(By.id("BirthDay"));
    }

    public WebElement birthYear() {

        return $(By.id("BirthYear"));
    }

    public WebElement genderDropDown() {

        return $(By.cssSelector("div > div [id = \":d\"]"));
    }

    public WebElement genderSelect() {
        return  $(By.cssSelector("div [id=\":f\"]"));
    }

    public WebElement recoveryNumber() {

        return $(By.id("RecoveryPhoneNumber"));
    }

    public WebElement recoveryMail() {

        return $(By.id("RecoveryEmailAddress"));
    }

    public WebElement enterCaptchaField() {

        return $(By.id("recaptcha_response_field"));
    }

    public WebElement countryCodeDropdown () {

        return $(By.cssSelector("div > div [id=\":h\"]"));
    }

    public WebElement countryCodeSelect () {

        return $(By.cssSelector("div [id=\":6p\"]"));
    }

    public WebElement tosCheckbox() {

        return $(By.id("TermsOfService"));
    }

    public WebElement tosErrorMsg() {

        return $(By.id("errormsg_0_TermsOfService"));
    }

    public WebElement signUpLink() {

        return $(By.cssSelector("#link-signup>a"));
    }

    public WebElement submitButton() {
        return $(By.id("submitbutton"));
    }

    public WebElement birthdayDropDown() {
        return $(By.cssSelector("div > div[id=\":0\"]"));
    }
    public  WebElement selectBirthdayMonth () {
        return $(By.cssSelector("div [id=\":4\"]"));
    }
}
