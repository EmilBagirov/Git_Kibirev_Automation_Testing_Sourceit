import org.openqa.selenium.By;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class LoginPage {



    public static void PasswordError (String email, String pass){

        String errmsg;

        WebDriverHolder.driver.findElement(By.cssSelector(Locators.emailField)).sendKeys(email);
        Waiters.WaitImpl();
        WebDriverHolder.driver.findElement(By.cssSelector(Locators.nextButton)).click();
        WebDriverHolder.driver.findElement(By.cssSelector(Locators.passwordField)).sendKeys(pass);
        WebDriverHolder.driver.findElement(By.cssSelector(Locators.enterButton)).click();
        Waiters.WaitImpl();
        errmsg = WebDriverHolder.driver.findElement(By.cssSelector(Locators.errorMessage)).getText();
        assertThat (errmsg, equalTo("Указан неправильный адрес или пароль")); 

    }



}
