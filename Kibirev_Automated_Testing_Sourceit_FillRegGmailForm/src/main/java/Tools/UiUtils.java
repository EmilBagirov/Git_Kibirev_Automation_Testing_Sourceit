package Tools;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Tools.WebDriverHolder.getDriver;


public class UiUtils {

    public static WebElement $ (By by){
        return getDriver().findElement(by);
    }

    public static void maxWindow (){
        getDriver().manage().window().maximize();
    }

    public static void goTo (String url) {
        getDriver().get(url);
    }

    public static String randomCaptcha () {
        int randNum = 1000+(int)(Math.random()*1000);
        //int i = (int) Math.round(randNum);
        String rand = Integer.toString(randNum);
        return rand;
    }

}
