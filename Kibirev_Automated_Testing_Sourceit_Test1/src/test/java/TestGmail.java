import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestGmail {

    WebDriver driver;

    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
    }

    @Test
    public void ShouldBeErrorMessage(){
        driver.get("https://www.gmail.com/intl/ru/mail/help/about.html");
        driver.findElement(By.cssSelector("#gmail-sign-in")).click();
        driver.findElement(By.cssSelector("#Email")).sendKeys("frewvggegwgrgwe");
        driver.findElement(By.cssSelector("#next")).click();
        String err = driver.findElement(By.cssSelector("#errormsg_0_Email")).getText();
        assertThat(err, equalTo("Не удалось распознать адрес электронной почты."));

    }
}
