package Tools;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;

import java.util.concurrent.TimeUnit;

import static Tools.WebDriverHolder.getDriver;


public class WaitingUtils {


    public static void IplicityWait (){

        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    public static FluentWait waitForElement (WebElement webElement) {
        return new FluentWait(getDriver()).withTimeout(15, TimeUnit.SECONDS).pollingEvery(1, TimeUnit.SECONDS);
    }


}
