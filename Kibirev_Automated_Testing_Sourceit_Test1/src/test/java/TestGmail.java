import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestGmail {

    WebDriver driver;
    Locators loc;



    @Before
    public void setUp() {
        driver = new FirefoxDriver();
    }

    @Test
    public void CheckErrorMessage() {

        driver.get(loc.getGmailLink());
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector(loc.getPasswordField())).sendKeys("dscdscca");
        String errmsg = driver.findElement(By.cssSelector(loc.getErrorMessage())).getText();
        assertThat(errmsg, equalTo("Указан неправильный адрес или пароль"));


    }

    @Test
    public void CheckMailItems(){

        driver.get(loc.getGmailLink());
        driver.findElement(By.cssSelector(loc.getPasswordField())).sendKeys("CsQ#Nfs@");
        driver.findElement(By.cssSelector(loc.getSigtInButton())).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector(loc.getInbox()));
        driver.findElement(By.cssSelector(loc.getStarred()));
        driver.findElement(By.cssSelector(loc.getSent()));
        driver.findElement(By.cssSelector(loc.getImportant()));
        driver.findElement(By.cssSelector(loc.getDrafts()));
        String err = driver.findElement(By.cssSelector("#errormsg_0_Email")).getText();
        assertThat(err, equalTo("Не удалось распознать адрес электронной почты."));

    }
}
