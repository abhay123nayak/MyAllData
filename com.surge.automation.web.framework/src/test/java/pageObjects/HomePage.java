package pageObjects;


import logger.LogReporter;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//*[@role=\"presentation\"]/div[contains(text(),'Academy')]")
    public WebElement welcomeTitle;

    @FindBy(css = "[alt='surgeLogo']")
    public WebElement surgeLogo;

    @FindBy(xpath = "//*[@role='presentation']/*[contains(text(),'Events')]")
    public WebElement events;
    public HomePage(WebDriver driver){
        super(driver);
    }

    public HomePage isHomeScreenAppear(){
        Assert.assertTrue(actions.iselementVisible(welcomeTitle));
        Assert.assertEquals(welcomeTitle.getText(),"Academy Admin");
        LogReporter.captureScreenShot();
        LogReporter.INFO("Home screen Appeared");
        return this;
    }

    public HomePage navigateToAcademyHomeScreen(){
        actions.iselementVisible(surgeLogo);
        surgeLogo.click();
        LogReporter.INFO("Clicked on surge Logo");
        return this;
    }

    public void navigateToAcademyAdmin(){
        Assert.assertTrue(actions.iselementVisible(welcomeTitle));
        welcomeTitle.click();
    }

    public void navigateToEvents(){
        Assert.assertTrue(actions.iselementVisible(events));
        events.click();
        LogReporter.INFO("Clicked on Events");
    }

}
