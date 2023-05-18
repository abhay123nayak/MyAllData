package browserFactory;

import java.io.File;
import java.time.Duration;
import java.util.HashMap;

import io.github.bonigarcia.wdm.WebDriverManager;
import logger.LogReporter;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import logger.LogReporter;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

public class DriverInit {

    private static WebDriver driver;
    public static String browserType;
    public static  WebDriver getDriver(String browserType){
        if(DriverInit.browserType==null) {
            DriverInit.browserType = browserType;
        }
        if(driver == null) {
            switch (browserType) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    ChromeOptions options = new ChromeOptions();
                    HashMap<String, Object> chromePref = new HashMap<String, Object>();
                    chromePref.put("profile.default_content_settings.popups", 0);
                    chromePref.put("download.default_directory", System.getProperty("user.dir")+ File.separator+"src"+File.separator+"test"+File.separator+"resources");
                    chromePref.put("browser.set_download_behavior", "{ behavior: 'allow' , downloadPath: '"+ System.getProperty("user.dir")+ File.separator+"src"+File.separator+"test"+File.separator+"resources"+"'}");
                  String headless = System.getProperty("headlessBrowser");
                  headless=headless==(null)?"false":System.getProperty("headlessBrowser");
                    if(headless.equals("true")) {
                        options.addArguments("--headless");
                    }
                    //options.addArguments("window-size=1200x600");
                    options.addArguments("--disable-popup-blocking");
                    options.addArguments("--disable-web-security");
                    options.addArguments("--allow-running-insecure-content");
                    options.addArguments("enable-automation");
                    options.addArguments("--window-size=1920,1080");
                    options.addArguments("--no-sandbox");
                    options.addArguments("--disable-web-security");
                    options.addArguments("--disable-extensions");
                    options.addArguments("--dns-prefetch-disable");
                    options.addArguments("--disable-gpu");
                    options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
                    options.setExperimentalOption("prefs", chromePref);
                    driver = new ChromeDriver(options);
                    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

                    break;

                case "firefox":

                    break;

                case "edge" :
                    break;

                case "safari":
                    WebDriverManager.safaridriver().setup();
                    driver=new SafariDriver();
                    break;
            }
            driver.manage().window().maximize();
            LogReporter.INFO("Launching browser");
        }
        return driver;
    }

    public static void tearDown() {
        driver.quit();
        driver=null;
        LogReporter.INFO("Quit Driver");
    }
}
