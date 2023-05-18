package pageObjects;


import ConfigurationFactory.ProjectConfigurations;
import logger.LogReporter;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends BasePage {




    @FindBy(css = "input[id='username']")
    public WebElement userName;

    @FindBy(css = "input[id='password']")
    public WebElement password;

    @FindBy(css = "button[value='authorize']")
    public WebElement authorizeAccess;

    @FindBy(xpath = "//*[@role='presentation']/span[contains(text(),'LinkedIn')]")
    public WebElement continueWithLinkedin;

    @FindBy(css = "button[type='submit']")
    public WebElement signInButton;

    public LoginPage(WebDriver driver){

        super(driver);
    }

    public LoginPage isLoginScreenAppear(){

       Assert.assertTrue("continueWithLinkedin button is not available",actions.iselementVisible(continueWithLinkedin,5));
       LogReporter.captureScreenShot();
       return this;
    }

    public void authenticateByLinkedin(){

        continueWithLinkedin.click();
        Assert.assertTrue(actions.iselementVisible(userName,10));
        userName.sendKeys(ProjectConfigurations.username());
        password.sendKeys(ProjectConfigurations.password());
        LogReporter.INFO("Password Entered");
        actions.iselementVisible(signInButton,10);
        LogReporter.captureScreenShot();
        signInButton.click();
        LogReporter.INFO("Sign In Button Clicked");

            if(actions.iselementVisible(authorizeAccess, 1)) {
                authorizeAccess.click();
                LogReporter.captureScreenShot();
                LogReporter.INFO("authorize access clicked");
            }


    }

}
