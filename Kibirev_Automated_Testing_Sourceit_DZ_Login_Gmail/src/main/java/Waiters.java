import java.util.concurrent.TimeUnit;

public class Waiters {


    public static void WaitImpl (){

        WebDriverHolder.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }


}
