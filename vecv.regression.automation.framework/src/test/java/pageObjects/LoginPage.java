package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import constants.FileConstant;
import logger.LOG;

public class LoginPage extends BasePage{

    @FindBy(xpath = "//*[@class=\"mat-radio-label-content\" and contains(text(),'VECV')]")
    private WebElement vecvRadioOption;

    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    private WebElement continueButton;

    @FindBy(id="loginMessage" )
    private WebElement signInTitle;

    @FindBy(id="userNameInput" )
    private WebElement username;

    @FindBy(id="passwordInput" )
    private WebElement password;

    @FindBy(id="submitButton" )
    private WebElement signInButton;
     String organizationLoginTitle ="Sign in with your organizational account";

    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public LoginPage isLandingScreenAppear(){
        Assert.assertTrue(iselementVisible(vecvRadioOption,second10TimeOut),"VECV Button not Visible");
        LOG.Reporter("User is on Landing screen");
        return this;
    }

    public LoginPage navigateToOrganizationSignIn(){
        vecvRadioOption.click();
        Assert.assertTrue(iselementVisible(continueButton,second10TimeOut),"continueButton  not Visible");
        continueButton.click();
        Assert.assertTrue(iselementVisible(signInTitle,second10TimeOut),"signInTitle  not Visible");
        Assert.assertTrue(signInTitle.getText().contains(organizationLoginTitle));
        return this;
    }

    public LoginPage userLogin(String user ,String userPassword){
        Assert.assertTrue(iselementVisible(username,second10TimeOut));
       /* username.sendKeys(FileConstant.getEnvironmentKey("User"));
        password.sendKeys(FileConstant.getEnvironmentKey("Password"));*/
        username.sendKeys(user);
        password.sendKeys(userPassword);
        signInButton.click();
/*
        Assert.assertTrue(iselementVisible(homeScreenDisplayed,30));
*/
        return this;
    }
}
