package Listeners;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class EventListeners implements WebDriverEventListener {

    private static final Logger LOGGER = LogManager.getLogger(EventListeners.class);


    public void beforeNavigateTo(String s, WebDriver webDriver) {

    }

    public void afterNavigateTo(String s, WebDriver webDriver) {

    }

    public void beforeNavigateBack(WebDriver webDriver) {

    }

    public void afterNavigateBack(WebDriver webDriver) {

    }

    public void beforeNavigateForward(WebDriver webDriver) {

    }

    public void afterNavigateForward(WebDriver webDriver) {

    }

    public void beforeFindBy(By by, WebElement webElement, WebDriver webDriver) {
        LOGGER.debug("Should be element by {}", by);

    }

    public void afterFindBy(By by, WebElement webElement, WebDriver webDriver) {
        LOGGER.debug("Element {} found ", by);

    }

    public void beforeClickOn(WebElement webElement, WebDriver webDriver) {

        LOGGER.debug("Button should be pushed");

    }

    public void afterClickOn(WebElement webElement, WebDriver webDriver) {
        LOGGER.debug("Button pushed");

    }

    public void beforeChangeValueOf(WebElement webElement, WebDriver webDriver) {

    }

    public void afterChangeValueOf(WebElement webElement, WebDriver webDriver) {

    }

    public void beforeScript(String s, WebDriver webDriver) {

        LOGGER.info("Script successfully start");

    }

    public void afterScript(String s, WebDriver webDriver) {

        LOGGER.info("Script successfully ended");

    }

    public void onException(Throwable throwable, WebDriver webDriver) {

    }
}
