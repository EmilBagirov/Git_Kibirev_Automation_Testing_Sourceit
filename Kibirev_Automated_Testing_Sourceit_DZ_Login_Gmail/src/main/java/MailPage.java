import org.openqa.selenium.By;

public class MailPage {

    public static void LogInCheckMailItems (String email, String pass){

        WebDriverHolder.driver.findElement(By.cssSelector(Locators.emailField)).sendKeys(email);
        WebDriverHolder.driver.findElement(By.cssSelector(Locators.nextButton)).click();
        Waiters.WaitImpl();
        WebDriverHolder.driver.findElement(By.cssSelector(Locators.passwordField)).sendKeys(pass);
        WebDriverHolder.driver.findElement(By.cssSelector(Locators.enterButton)).click();
        WebDriverHolder.driver.findElement(By.cssSelector(Locators.inbox)).isDisplayed();
        WebDriverHolder.driver.findElement(By.cssSelector(Locators.starred)).isDisplayed();
        WebDriverHolder.driver.findElement(By.cssSelector(Locators.sent)).isDisplayed();
        WebDriverHolder.driver.findElement(By.cssSelector(Locators.important)).isDisplayed();
        WebDriverHolder.driver.findElement(By.cssSelector(Locators.drafts)).isDisplayed();

    }

}
