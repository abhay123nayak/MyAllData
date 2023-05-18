package utils;

import java.time.Duration;


import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;

import logger.LogReporter;


public class DriverUtils {
    public static final int shortTimeOut = 5;
    public static final int second10TimeOut = 10;
    public static int mediaCounter = 0;
    protected static WebDriver driver;

    public DriverUtils(WebDriver driver) {
        this.driver = driver;
    }


    public void highlightOnly(WebElement element,String color) {
        try {
            ((JavascriptExecutor) driver).executeScript(
                    "arguments[0].setAttribute('style','background:"+color+"; border: 2px solid red;')", element);
        } catch (Exception ex) {
            throw new RuntimeException("Unable to highlight" + ex.getMessage());
        }
    }
    public WebElement waitforElementVisible(WebElement element, int timeout) {
        try {
            return new WebDriverWait(driver, Duration.ofSeconds(timeout))
                    .until(ExpectedConditions.visibilityOf(element));
        } catch (Exception ex) {
            LogReporter.INFO(ex.getMessage());
            throw new RuntimeException("Unable to find element" + ex.getMessage());
        }
    }



    public void scrollByVisibilityOfElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", element);

    }

    public boolean waitForElementByXpath(String locator,int timeout){

        try {
     return  new WebDriverWait(driver, Duration.ofSeconds(timeout))
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator))).isDisplayed();
        }catch (Exception ex){
            LogReporter.INFO(ex.getMessage());
            return false;
        }
    }

    public WebElement waitforElementClickable(WebElement element, int timeout) {
        try {
            return new WebDriverWait(driver, Duration.ofSeconds(timeout))
                    .until(ExpectedConditions.elementToBeClickable(element));
        } catch (Exception ex) {
            LogReporter.INFO(ex.getMessage());
            throw new RuntimeException("Unable to click element" + ex.getMessage());
        }


    }

    public boolean iselementVisible(WebElement element, int timeout) {
        try {
            return new WebDriverWait(driver, Duration.ofSeconds(timeout))
                    .until(ExpectedConditions.visibilityOf(element)).isDisplayed();
        } catch (Exception ex) {
            LogReporter.INFO(ex.getMessage());
            return false;
        }

    }


    public boolean iselementEnable(WebElement element, int timeout) {
        try {
            return new WebDriverWait(driver, Duration.ofSeconds(timeout))
                    .until(ExpectedConditions.visibilityOf(element)).isEnabled();
        } catch (Exception ex) {
            LogReporter.INFO(ex.getMessage());
            return false;
        }

    }
    public Boolean waitForTextToBePresent(WebElement element, String text,int timeout) {
        try {
            return new WebDriverWait(driver, Duration.ofSeconds(timeout))
                    .until(ExpectedConditions.textToBePresentInElement(element,text));
        } catch (Exception ex) {
            LogReporter.INFO(ex.getMessage());
            throw new RuntimeException(" exception occured during wait" + ex.getMessage());
        }
    }
    public void clickByAction(WebElement element) {
        Actions action = new Actions(driver);
        action.moveToElement(element).click().build().perform();
    }

    public void typeByAction(WebElement element) {
        Actions action = new Actions(driver);
        action.moveToElement(element).sendKeys().build().perform();
    }

    public void sendKeys(WebElement element,String text){
        element.clear();
        element.sendKeys(text);
    }

    public void sendkeysForAutoSuggestions(WebElement element, String text ){
        char[] chars =text.toCharArray();
        for (int i=0;i<chars.length;i++) {
            String a= String.valueOf(chars[i]);
            element.sendKeys(a);
        }
    }
    public void clickByJSE(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", element);
    }

    public void waitForVisibility(WebElement e){
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.visibilityOf(e));
    }

    public void clear(WebElement element) {
        waitForVisibility(element);
        element.clear();
    }
    public WebElement iselementClickable(WebElement element, int timeout) {
        try {
            return new WebDriverWait(driver, Duration.ofSeconds(timeout))
                    .until(ExpectedConditions.elementToBeClickable(element));
        } catch (Exception ex) {
            LogReporter.INFO(ex.getMessage());
            throw new RuntimeException("element not clickable" + ex.getMessage());
        }
    }

    public boolean iselementVisible(WebElement element) {

        return iselementVisible(element, shortTimeOut);
    }

    public boolean iselemenDisappeared(WebElement element, int timeout) {
        try {
            return new WebDriverWait(driver, Duration.ofSeconds(timeout))
                    .until(ExpectedConditions.invisibilityOf(element));
        } catch (Exception ex) {
            LogReporter.INFO(ex.getMessage());
            return false;
        }

    }

    public static String getBase64SnapShot() {
        try {

            TakesScreenshot scrShot = ((TakesScreenshot) driver);
            return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);

        } catch (Exception ex) {
            LogReporter.INFO(ex.getMessage());
            throw new RuntimeException("Unable to capture screenshot");
        }
    }

public static void sleep(int sec){
    try {
        Thread.sleep(sec *1000);
    } catch (InterruptedException e) {
       e.getMessage();
    }
}

}
