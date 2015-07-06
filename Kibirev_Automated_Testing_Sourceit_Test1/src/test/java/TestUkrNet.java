import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;


public class TestUkrNet {

    WebDriver driver;


    @Before
    public void setUp(){
        driver = new FirefoxDriver();
    }

    @Test
    public void shouldBeErrorMessage(){
        driver.get("https://www.ukr.net/");
        driver.findElement(By.name("Login")).sendKeys("adasd");
        driver.findElement(By.name("Password")).sendKeys("dvsdvfd");
        driver.findElement(By.xpath(".//*[@id='not-logged']/form//button")).click();
        String err = driver.findElement(By.cssSelector(".error-text")).getText();
        assertThat(err,equalTo("Не вірний логін або пароль. Спробуйте знову."));


    }

    @Test
    public void shouldBeFailErrorMessage(){
        driver.get("https://www.ukr.net/");
        driver.findElement(By.cssSelector(".login>input")).sendKeys("adasd");
        driver.findElement(By.cssSelector(".password>input")).sendKeys("dvsdvfd");
        driver.findElement(By.cssSelector(".submit>button")).click();
        String err = driver.findElement(By.cssSelector(".error-text")).getText();
        assertThat(err,equalTo("Не вірний логін або пароль."));

    }

    @After
    public void tearDown() throws Exception {
        driver.close();

    }


}
