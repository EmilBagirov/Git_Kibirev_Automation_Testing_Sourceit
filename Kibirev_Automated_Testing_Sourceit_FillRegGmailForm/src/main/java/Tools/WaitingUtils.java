package Tools;

import java.util.concurrent.TimeUnit;

import static Tools.WebDriverHolder.getDriver;


public class WaitingUtils {


    public static void IplicityWait (){

        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);



    }


}
