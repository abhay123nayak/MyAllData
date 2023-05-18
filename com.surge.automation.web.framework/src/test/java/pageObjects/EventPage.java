package pageObjects;


import logger.LogReporter;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.CommonUtils;
import utils.DriverUtils;

import java.util.UUID;

public class EventPage extends BasePage {

    @FindBy(css = "[class=\"slick-list\"]")
    public WebElement eventList;

    @FindBy(xpath = "//*[contains(text(),'Create Event') and @role='presentation']")
    public WebElement createEventButton;

    @FindBy(css = "[placeholder=\"Enter Session Title\"]")
    public WebElement eventTitle;

    @FindBy(css = "[role=\"textbox\"]")
    public WebElement descriptionBox;

    @FindBy(css = "[class*='datepicker']>input[type='text']")
    public WebElement startDateInput;

    @FindBy(css="[class*='react-date'][role='button'][aria-disabled='false'][tabindex=\"-1\"]")
    public WebElement availableDatesInCalendar;

    @FindBy(xpath="//*[@role='presentation']/*[contains(text(),'Add Participants')]")
    public WebElement addParticipant;

    @FindBy(css="[id=\"user-select-all\"]")
    public WebElement selectAllCheckbox;

    @FindBy(xpath="//*[@type='button' and text()='Save']")
    public WebElement saveButton;


    @FindBy(css = "[placeholder=\"Search or Add Category\"]")
    public WebElement addCategory;

    @FindBy(xpath = "//*[@role='presentation']/*[contains(text(),'Sunday Studios')]")
    public WebElement selectCategoryFromDropdown;

    @FindBy(xpath="//*[@role='presentation']/*[contains(text(),'Publish')]")
    public WebElement publishButton;

    @FindBy(xpath="(//*[@role='presentation']/*[contains(text(),'Publish')])[2]")
    public WebElement confirmationPublish;

    @FindBy(css="[placeholder=\"Search Event\"]")
    public WebElement searchEvent;

  public  String title;

    public EventPage(WebDriver driver){
        super(driver);
    }

    public void isEventScreenAppear(){
        Assert.assertTrue(actions.iselementVisible(eventList, 20));
        LogReporter.captureScreenShot();
        LogReporter.INFO("Event screen Appeared");
    }

    public void clickOnCreateEvent(){
        Assert.assertTrue(actions.iselementVisible(createEventButton));
        createEventButton.click();
        LogReporter.INFO("Clicked on CreateEvent Button");
        Assert.assertTrue(actions.iselementVisible(eventTitle,5));
        LogReporter.INFO("Validated event Title");
    }

    public  void clickOnPublish(){
        Assert.assertTrue(actions.iselementVisible(publishButton));
        publishButton.click();
        LogReporter.INFO("Publish button clicked");
        Assert.assertTrue(actions.iselementVisible(confirmationPublish));
        CommonUtils.sleep(2);
        confirmationPublish.click();
        LogReporter.INFO("Confirmation Publish clicked");
    }

    public  void searchAndValidateEvent(){
        Assert.assertTrue(actions.iselementVisible(searchEvent,15));
     //   searchEvent.sendKeys(title);
        actions.waitForElementByXpath("//*[contains(text(),'"+this.title+"')]",15);

    }
    public void fillEventDetails(String title,String description){
        this.title=title+" "+UUID.randomUUID();
        actions.sendKeys(eventTitle,this.title);
        LogReporter.INFO("Sending event title "+this.title);
        descriptionBox.sendKeys(description);
        LogReporter.INFO("Sending description box");
        startDateInput.click();
        LogReporter.INFO("Opening calendar");
        Assert.assertTrue(actions.iselementVisible(availableDatesInCalendar));
        LogReporter.INFO("validating calendar");
        availableDatesInCalendar.click();
        LogReporter.INFO("select available date");
        addParticipant.click();
        LogReporter.INFO("Add Participant window clicked");
        Assert.assertTrue(actions.iselementVisible(selectAllCheckbox,10));
        LogReporter.INFO("Wait for All Participant selection window ");
        selectAllCheckbox.click();
        LogReporter.INFO("select all checkbox");
        saveButton.click();
        LogReporter.INFO("saveButton clicked");
        Assert.assertTrue(actions.iselementVisible(addCategory));
        actions.sendKeys(addCategory,"Sunday Studio");
        LogReporter.INFO("enter category suggestion");
        selectCategoryFromDropdown.click();
        LogReporter.INFO("click on select category from dropdown");
    }


}
