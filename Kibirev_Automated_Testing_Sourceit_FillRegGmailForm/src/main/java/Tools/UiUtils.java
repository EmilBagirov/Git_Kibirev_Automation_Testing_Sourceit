package Tools;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



public class UiUtils {

    public static WebElement $ (By by){
        return WebDriverHolder.getDriver().findElement(by);
    }

    public static void maxWindow (){
        WebDriverHolder.getDriver().manage().window().maximize();
    }

    public static void goTo (String url) {
        WebDriverHolder.getDriver().get(url);
    }

}
