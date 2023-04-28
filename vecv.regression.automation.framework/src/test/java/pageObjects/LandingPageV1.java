package pageObjects;

import DataFactory.TrackingView;
import constants.FileConstant;
import logger.LOG;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utilities.CommonUtils;
import utilities.DriverUtils;

import java.util.List;

public class LandingPageV1 extends BasePage{

    DriverUtils utility = new DriverUtils(driver);

    @FindBy(xpath = "//input[@type='text']")
    public WebElement searchBar;

    @FindBy(css = "mat-option[tabindex='0'] span")
    public WebElement userOptionsBM;

    @FindBy(xpath = "//div[@class='dropdown']")
    WebElement OurServices;

    @FindBy(xpath = "//a[contains(text(),'Track')]")
    @CacheLookup
    public WebElement track;

    @FindBy(xpath = "//*[text()='Moving']")
    @CacheLookup
    public WebElement movingTab;

    @FindBy(xpath = "//*[text()='Idling']")
    @CacheLookup
    public WebElement idlingTab;

    @FindBy(xpath = "//*[text()='Stopped']")
    @CacheLookup
    public WebElement stoppedTab;

    @FindBy(xpath = "//*[text()='Not Reachable']")
    @CacheLookup
    public WebElement notReachableTab;

    @FindBy(xpath = "(//div[contains(@class,'headerDivActive')])")
    @CacheLookup
    public WebElement allDefault;

    @FindBy(xpath = "//I[@class='fa fa-filter']")
    @CacheLookup
    public WebElement filterBtn;

    @FindBy(xpath = "//*[contains(text(),' Vehicle ')]")
    @CacheLookup
    public WebElement VehicleBtn;

    @FindBy(xpath = "//*[contains(text(),' Location ')]")
    @CacheLookup
    public WebElement locationBtn;

    @FindBy(xpath = "//div[contains(@class,'vehicle_list')]/p[contains(text(),'by Vehicle')]")
    @CacheLookup
    public WebElement filterByVehicle;

    @FindBy(xpath = "//input[contains(@id,'mat-input')]")
    @CacheLookup
    public WebElement filterByVehicleTF;

    @FindBy(xpath = "(//div[contains(@id,'mat-autocomplete')]/mat-option/span)[1]")
    @CacheLookup
    public WebElement filterByVehicleSelectValue;

    @FindBy(xpath = "//div[contains(@class,'mat-form-field-infix ng-tns')]/input")
    @CacheLookup
    public WebElement filterByModelTF;

    @FindBy(xpath = "//span[contains(text(),'6')]")
    @CacheLookup
    public WebElement vehicleCluster;

    @FindBy(xpath = "//div[contains(text(),' List ')]")
    @CacheLookup
    public WebElement listView;

    @FindBy(xpath = "//div[contains(text(),' Map ')]")
    @CacheLookup
    public WebElement mapView;

    @FindBy(xpath = "(//button[contains(text(),'Apply ')])[1]")
    @CacheLookup
    public WebElement filterApply;

    @FindBy(xpath = "//div[@class='head-card']/h2")
    @CacheLookup
    public List<WebElement> vehicleRegNumber;
    @FindBy(xpath = "//b[contains(text(),'Last Updated')]/parent::p")
    @CacheLookup
    public List<WebElement> lastUpdatedTime;

    @FindBy(xpath = "//div[@class=\"card\"]/p/img/..")
    @CacheLookup
    public List<WebElement> lastUpdatedLocation;

    @FindBy(xpath = "//span[@class='flex-inline']/span[@class='ng-star-inserted']")
    @CacheLookup
    public List<WebElement> vehicleFuel;

    @FindBy(xpath = "(//div[@role='button']/img)[1]")
    @CacheLookup
    public WebElement vehicleOnMap;

    @FindBy(xpath = "//div[@class='page_title']/h1")
    @CacheLookup
    public WebElement vehicleDetailTitle;

    @FindBy(xpath = "(//div[@class='box-continer marginTB'])[1]")
    @CacheLookup
    public WebElement vehicleOnList;

    @FindBy(xpath = "//div[contains(text(),'Current Status')]")
    @CacheLookup
    public WebElement vCurrentStatus;

    @FindBy(xpath = "//div[contains(text(),'Playback')]")
    @CacheLookup
    public WebElement vPlaybacksandTrace;

    @FindBy(xpath = "//div[contains(text(),'Quick Links')]")
    @CacheLookup
    public WebElement vQuickLinks;

    @FindBy(xpath = "//div[contains(@class,'current-status-card')]/h2[@class ='sub-head']")
    @CacheLookup
    public WebElement vrealTimeSpeed;

    @FindBy(xpath = "//h5[text()='Odometer']/following-sibling::h3 ")
    @CacheLookup
    public WebElement vrealTimeOdometer;

    @FindBy(xpath = "(//b[contains(text(),'CURRENT LOCATION')]/following-sibling::span)[1]")
    @CacheLookup
    public WebElement vrealTimeLocation;

    @FindBy(xpath = "//div[contains(@class,'current-status-card')]/h2")
    @CacheLookup
    public WebElement oneVehicleRealTimeSpeed;

    @FindBy(xpath = "//h5[text()='Sweet Spot']/following-sibling::h3 ")
    @CacheLookup
    public WebElement vRealTimeSweetSpot;

    @FindBy(xpath = "//h5[text()='DEF Level']/following-sibling::h3 ")
    @CacheLookup
    public WebElement vRealtimeDEFlevel;

    @FindBy(xpath = "//span[contains(text(),' Share Live Location ')]")
    @CacheLookup
    public WebElement shareLiveLocation;

    @FindBy(xpath = "//input[@formcontrolname='name']")
    @CacheLookup
    public WebElement locationUserName;

    @FindBy(xpath = "//input[@formcontrolname='mobile']")
    @CacheLookup
    public WebElement locationUserMobile;

    @FindBy(xpath = "//input[@formcontrolname='email']")
    @CacheLookup
    public WebElement locationUserEmail;

    @FindBy(xpath="(//button[@aria-label='Open calendar'])[1]")
    WebElement openCalender;

    @FindBy(xpath = "//div[@class='mat-calendar-body-cell-content']")
    List<WebElement> startdate;

   @FindBy(xpath = "(//mat-select[@role='listbox'])[4]")
    WebElement starttime;

   @FindBy(xpath = "//span[@class='mat-option-text']")
   List<WebElement> starttimedropdown;

   @FindBy(xpath = "(//mat-select[@role='listbox'])[5]")
   WebElement startmin;

   @FindBy(xpath = "(//mat-select[@role='listbox'])[6]")
   WebElement Ampm;

    @FindBy(xpath = "(//span[@class='mat-button-wrapper'])[8]")
    @CacheLookup
    public WebElement endDateBtn;

    @FindBy(xpath = "(//mat-select[@role='listbox'])[7]")
    WebElement endtime;
    @FindBy(xpath = "//div[@class='mat-calendar-body-cell-content']")
    @CacheLookup
    List<WebElement> calendarDate;

    @FindBy(xpath = "//span[@class='mat-option-text' and contains(text(),'06')]")
    @CacheLookup
    public WebElement selectendHourDD;

    @FindBy(xpath = "//span[@class='mat-option-text' and contains(text(),'15')]")
    @CacheLookup
    public WebElement selectendMinDD;

    @FindBy(xpath = "//span[@class='mat-option-text' and contains(text(),'AM')]")
    @CacheLookup
    public WebElement selectendAMandPMDD;

    @FindBy(xpath = "(//mat-select[@role='listbox'])[9]")
    @CacheLookup
    public WebElement endHourDD;

    @FindBy(xpath = "(//div[contains(@class,'mat-form-field-infix')])[14]")
    @CacheLookup
    public WebElement endMinDD;

    @FindBy(xpath = "(//div[contains(@class,'mat-form-field-infix')])[15]")
    @CacheLookup
    public WebElement endAMandPMDD;

    @FindBy(xpath = "//span[contains(text(),'Submit')]")
    @CacheLookup
    public WebElement locationFormSubmitBtn;

    @FindBy(xpath = "//button/span[contains(text(),'Share Current Location')]")
    @CacheLookup
    public WebElement vShareCurrentLocationButton;

    @FindBy(xpath = "//span[contains(text(),'Copy')]")
    @CacheLookup
    public WebElement vCopyLinkButton;

    @FindBy(xpath = "//h5[text()='Success']")
    @CacheLookup
    public WebElement successMessageOnPopup;

    @FindBy(xpath = "//button[contains(text(),'OK')]")
    @CacheLookup
    public WebElement OKButtonOnSuccessPopup;

    @FindBy(xpath = "//span[text()=' Submit ']/parent::button")
    @CacheLookup
    public WebElement locationUserSubmitBtn;

    @FindBy(xpath = "//div[@class='live_card']/div[1]")
    @CacheLookup
    public WebElement vehicleDetailsTab;

    @FindBy(xpath = "(//div[contains(@style,'position: relative;')]/h3)[1]")
    public WebElement vehicleSelected;

    @FindBy(xpath = "//h2[contains(text(),'Vehicle Details')]")
    @CacheLookup
    public WebElement vehicleDetailsTitle;


    @FindBy(xpath = "(//div[@class='image'])[1]")
    @CacheLookup
    public WebElement fuelServicesTab;

    @FindBy(xpath = "//div[contains(@class,'delete-content')]/p")
    @CacheLookup
    public WebElement fuelServicesAlertMessage;

    @FindBy(xpath = "//div[contains(@class,'delete-content')]/button")
    @CacheLookup
    public WebElement fuelServicesAlertOk;

    @FindBy(xpath = "//h6[contains(text(),'Fuel Refill')]")
    @CacheLookup
    public WebElement fuelDrainTabVerify;

    @FindBy(xpath = "//a[@id='fuelManagement']")
    @CacheLookup
    public WebElement fuelDrainTabLeftTab;

    @FindBy(xpath = "(//div[@class='image'])[2]")
    @CacheLookup
    public WebElement fuelGraphTab;

    @FindBy(xpath = "//p[text()='Fuel Graph']")
    @CacheLookup
    public WebElement fuelGraphwindow;

    @FindBy(xpath = "(//div[@class='image'])[3]")
    @CacheLookup
    public WebElement fleetInsightTab;

    @FindBy(xpath = "(//div[@class='image'])[4]")
    @CacheLookup
    public WebElement gotoDashboardTab;

    @FindBy(xpath = "//div[@class='article']/h3")
    @CacheLookup
    public WebElement gotoDashboardwindow;

    @FindBy(xpath = "//div[@class='mat-tab-list']")
    @CacheLookup
    List<WebElement> fleetInsightsWindow;

    @FindBy(xpath = "//div[contains(@class,'ng-star-inserted')]/h2")
    @CacheLookup
    public List<WebElement> listViewHealthStatus;

    @FindBy(xpath = "//h2[contains(text(),'IN PAST 24 HOURS')]")
    @CacheLookup
    public WebElement past24HoursPerformance;

    @FindBy(xpath = "//div[@class='card past']/h3")
    @CacheLookup
    public List<WebElement> performanceCategory;

    @FindBy(xpath = "//div[@class='card past']/h2")
    @CacheLookup
    public List<WebElement> performanceValue;

    @FindBy(xpath = "//h2[contains(text(),'No Pilot Assigned')]")
    @CacheLookup
    public WebElement noPilotAssigned;

    @FindBy(xpath = "//div[contains(text(),' My Organization ')]")
    @CacheLookup
    public WebElement myOrganization;

    @FindBy(xpath = "//div[contains(text(),'Team')]")
    @CacheLookup
    public WebElement myTeam;

    @FindBy(xpath = "(//div[contains(text(),'Pilot')])[2]")
    @CacheLookup
    public WebElement pilotTab;

    @FindBy(xpath = "//p[contains(text(),' View Assignment ')]")
    @CacheLookup
    public WebElement viewAssignment;

    @FindBy(xpath = "(//div[contains(@class,'headerDivActive')]/p[@class='count'])")
    public WebElement allTabCount;

    @FindBy(xpath = "(//div[contains(@class,'headerDiv')]/p[@class='count'])[2]")
    public WebElement movingTabCount;

    @FindBy(xpath = "(//div[contains(@class,'headerDiv')]/p[@class='count'])[3]")
    public WebElement idlingTabCount;

    @FindBy(xpath = "(//div[contains(@class,'headerDiv')]/p[@class='count'])[4]")
    public WebElement stoppedTabCount;

    @FindBy(xpath = "(//div[contains(@class,'headerDiv')]/p[@class='count'])[5]")
    public WebElement notReachableTabCount;


    @FindBy(xpath = "//li[@class='ng-star-inserted']/h4")
    @CacheLookup
    public WebElement vehicleAssignment;

    @FindBy(xpath = "//span[contains(@class,'close1')]")
    WebElement close;
    public LandingPageV1(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public LandingPageV1 selectUserForFleet(String customer) {
        CommonUtils.sleep(3);
//        Assert.assertTrue(utility.iselementVisible(close), "close is not visible");
//        close.click();
        Assert.assertTrue(iselementVisible(searchBar, 30), "Search bar not Visible");
        utility.clear(searchBar);
        CommonUtils.sleep(1);
        LOG.Reporter("Clear the search bar for user");
       // int x = recall(searchBar, FileConstant.getEnvironmentKey("InstantTransport"));
        int x = recall(searchBar, customer);

        return this;
    }

    public int recall(WebElement element, String text) {
        Boolean flag = false;
        sendkeysForAutoSuggestions(element, text);
        try {
            CommonUtils.sleep(1);
            flag = utility.iselementVisible(userOptionsBM);

        } catch (Exception e) {

        }
        if (flag) {
            utility.highlightOnly(userOptionsBM, "yellow");
            String customerName = userOptionsBM.getText();
            userOptionsBM.click();
            LOG.Reporter("User is selected : " + customerName);
            return 1;
        } else {
            try {
                utility.clear(element);
                CommonUtils.sleep(1);
                LOG.Reporter("Clear the search bar for user");
            } catch (Exception e) {

            }
        }
        return recall(element, text);
    }

    public LandingPageV1 selectFleetTracking() {
        CommonUtils.sleep(4);
        Assert.assertTrue(utility.iselementVisible(OurServices), "fleetTrack not Visible");
        OurServices.click();
        LOG.Reporter("Clicking on  Fleet Track");
        CommonUtils.sleep(2);
        Assert.assertTrue(iselementVisible(track, second10TimeOut), "Track not Visible");
        track.click();
        LOG.Reporter("Clicking on Track");
        return this;
    }

    public LandingPageV1 verifyAllTabs() {
        CommonUtils.sleep(1);
        utility.iselementVisible(movingTab);
        Assert.assertTrue(iselementVisible(movingTab, second10TimeOut), "Moving tab not Visible");
        LOG.Reporter("Moving tab is displayed and count is : " + movingTabCount.getText());
        CommonUtils.sleep(1);
        utility.iselementVisible(idlingTab);
        Assert.assertTrue(iselementVisible(idlingTab, second10TimeOut), "Idling tab not Visible");
        LOG.Reporter("Idling tab is displayed and count is : " + idlingTabCount.getText());
        CommonUtils.sleep(1);
        utility.iselementVisible(stoppedTab);
        Assert.assertTrue(iselementVisible(stoppedTab, second10TimeOut), "StoppedTab tab not Visible");
        LOG.Reporter("Stopped tab is displayed and count is : " + stoppedTabCount.getText());
        CommonUtils.sleep(1);
        utility.iselementVisible(notReachableTab);
        Assert.assertTrue(iselementVisible(notReachableTab, second10TimeOut), "Not Reachable tab not Visible");
        LOG.Reporter("Not Reachable tab is displayed and count is : " + notReachableTabCount.getText());
        return this;
    }

    public LandingPageV1 verifyAllAtDefault() {
        CommonUtils.sleep(2);
        Assert.assertTrue(iselementVisible(allDefault, second10TimeOut), "All is not at Default");
        LOG.Reporter("All at default tab is displayed and count: " + allTabCount.getText());
        CommonUtils.sleep(2);
        Assert.assertTrue(utility.iselementEnable(movingTab, 2));
        LOG.Reporter("Moving tab is not selected " + movingTabCount.getText());
        CommonUtils.sleep(2);
        Assert.assertTrue(utility.iselementEnable(idlingTab, 2));
        LOG.Reporter("Idling tab is not selected " + idlingTabCount.getText());
        CommonUtils.sleep(2);
        Assert.assertTrue(utility.iselementEnable(stoppedTab, 2));
        LOG.Reporter("Stopped tab is not selected " + stoppedTabCount.getText());
        CommonUtils.sleep(2);
        Assert.assertTrue(utility.iselementEnable(notReachableTab, 2));
        LOG.Reporter("Not Reachable tab is not selected " + notReachableTabCount.getText());
        return this;
    }

    public LandingPageV1 verifyVehicleCluster() {
        CommonUtils.sleep(1);
        vehicleCluster.click();
        Assert.assertFalse(iselementVisible(vehicleCluster, second10TimeOut), "Vehicle cluster is not visible");
        LOG.Reporter("Click on Vehicle cluster");

        return this;
    }


    public LandingPageV1 verifyListViewWithVehicle() {

        Assert.assertTrue(iselementVisible(allDefault, second10TimeOut), "All tab at default");
        allDefault.click();
        LOG.Reporter("All tab is at default and count is:" + allTabCount.getText());

        Assert.assertTrue(iselementVisible(movingTab, second10TimeOut), "Moving tab not Visible ");
        movingTab.click();
        LOG.Reporter("Moving tab is selected and count is:" + movingTabCount.getText());

        Assert.assertTrue(iselementVisible(idlingTab, second10TimeOut), "Idling tab not Visible ");
        idlingTab.click();
        LOG.Reporter("Idling tab is selected and count is:" + idlingTabCount.getText());

        Assert.assertTrue(iselementVisible(stoppedTab, second10TimeOut), "Stopped tab not Visible ");
        stoppedTab.click();
        LOG.Reporter("Stopped tab is selected and count is:" + stoppedTabCount.getText());

        Assert.assertTrue(iselementVisible(notReachableTab, second10TimeOut), "Not reachable tab tab not Visible ");
        notReachableTab.click();
        LOG.Reporter("Not reachable tab is selected and count is:" + notReachableTabCount.getText());

        return this;
    }

    public LandingPageV1 verifyAllTabsIsSelected() {
        CommonUtils.sleep(1);
        Assert.assertTrue(iselementVisible(allDefault, second10TimeOut), "All tab at default");
        allDefault.click();
        LOG.Reporter("All tab is at default and count is:" + allTabCount.getText());

        Assert.assertTrue(iselementVisible(movingTab, second10TimeOut), "Moving tab not Visible ");
        movingTab.click();
        LOG.Reporter("Moving tab is selected and count is:" + movingTabCount.getText());

        Assert.assertTrue(iselementVisible(idlingTab, second10TimeOut), "Idling tab not Visible ");
        idlingTab.click();
        LOG.Reporter("Idling tab is selected and count is:" + idlingTabCount.getText());

        Assert.assertTrue(iselementVisible(stoppedTab, second10TimeOut), "Stopped tab not Visible ");
        stoppedTab.click();
        LOG.Reporter("Stopped tab is selected and count is:" + stoppedTabCount.getText());

        Assert.assertTrue(iselementVisible(notReachableTab, second10TimeOut), "Not reachable tab tab not Visible ");
        notReachableTab.click();
        LOG.Reporter("Not reachable tab is selected and count is:" + notReachableTabCount.getText());
        return this;
    }

    public LandingPageV1 switchTrackingView(TrackingView view) {
        switch (view) {

            case List:
                Assert.assertTrue(utility.iselementVisible(listView), "View is already selected List View - Unable to change again");
                listView.click();
                LOG.Reporter("Switched to List menu");
                break;
            case Map:
                Assert.assertTrue(utility.iselementVisible(mapView), "View is already selected Map View - Unable to change again");
                mapView.click();
                LOG.Reporter("Switched to Map view");
                break;
        }
        return this;
    }

    public LandingPageV1 verifySearchWithVehicle() {
        CommonUtils.sleep(1);
        filterBtn.click();
        Assert.assertTrue(iselementVisible(filterBtn, second10TimeOut), "Filter is not at Selected");
        LOG.Reporter("Click on Filter Button");

        utility.iselementVisible(VehicleBtn);
        Assert.assertTrue(iselementVisible(VehicleBtn, second10TimeOut), "Vehicle button not Visible ");
        LOG.Reporter(" Vehicle button is Displayed");
        VehicleBtn.click();
        LOG.Reporter("Vehicle button is clicked");
        utility.iselementVisible(locationBtn);
        Assert.assertTrue(iselementVisible(locationBtn, second10TimeOut), "Location button not Visible ");
        LOG.Reporter("Location button is Displayed");
        return this;
    }

    public LandingPageV1 verifyFilterWithVehicle() {
        CommonUtils.sleep(1);
        filterBtn.click();
        Assert.assertTrue(iselementVisible(filterBtn, second10TimeOut), "Filter is not at Selected");
        LOG.Reporter("Click on Filter Button");
        CommonUtils.sleep(1);
        utility.iselementClickable(VehicleBtn, 4);
        Assert.assertTrue(iselementVisible(VehicleBtn, second10TimeOut), "Vehicle button not Visible ");
        LOG.Reporter("Vehicle button is Displayed");
        CommonUtils.sleep(1);
        utility.iselementClickable(filterByVehicle, 4);
        Assert.assertTrue(iselementVisible(filterByVehicle, second10TimeOut), "Filter By vehicle not Visible ");
        filterByVehicle.click();
        LOG.Reporter("Clicked on Filter by vehicle");

        utility.iselementClickable(filterByVehicleTF, 4);
        Assert.assertTrue(iselementVisible(filterByVehicleTF, second10TimeOut), "Filter By vehicle text filed not Visible ");
        filterByVehicleTF.click();
        LOG.Reporter("Clicked on Filter by vehicle text filed");

        CommonUtils.sleep(1);
        utility.iselementClickable(filterByVehicleSelectValue, 4);
        String vehicle = filterByVehicleSelectValue.getText();
        filterByVehicleSelectValue.click();
        LOG.Reporter("selected vehicle :" + vehicle);
        CommonUtils.sleep(1);
        Assert.assertTrue(iselementVisible(filterApply, second10TimeOut), "Apply button not Visible ");
        filterApply.click();
        LOG.Reporter("Click on Apply button");
        CommonUtils.sleep(2);
        return this;
    }

    public LandingPageV1 verifyVehicleLocationAndTime() {
        CommonUtils.sleep(2);
        validateLastUpdatedAndLocation(vehicleRegNumber, lastUpdatedTime, lastUpdatedLocation);
        return this;
    }

    public void validateLastUpdatedAndLocation(List<WebElement> ele1, List<WebElement> ele2, List<WebElement> ele3) {
        int vehicle = 0;
        for (WebElement vehicleRegNum : ele1) {
            vehicle++;
            String vehicleRegNumber = vehicleRegNum.getText();
            LOG.Reporter("The value of vehicles registration number " + vehicleRegNumber);
            int location = 0;
            int time = 0;
            for (WebElement vehicleTime : ele2) {
                time++;
                if (vehicle == time) {
                    String displayLastUpdated = vehicleTime.getText();
                    Assert.assertTrue(displayLastUpdated.toLowerCase().contains("last updated"), "Unable to validate last updated is Display ");
                    displayLastUpdated = displayLastUpdated.toLowerCase()
                            .replace("last updated", "");
                    LOG.Reporter("The value of vehicles last Updated time " + displayLastUpdated);
                    break;
                }
            }
            for (WebElement vehicleLoc : ele3) {
                location++;
                if (vehicle == location) {
                    String displayLastUpdatedloc = vehicleLoc.getText();
                    LOG.Reporter("The value of vehicles last Updated location " + displayLastUpdatedloc);
                    break;
                }

            }
        }

    }

    public void fuelLevelForAllVehicle(List<WebElement> elements) {
        for (WebElement element : elements) {
            String fuelLevelAllVehicle = element.getText();
            LOG.Reporter("The value of vehicles fuel and odometer  " + fuelLevelAllVehicle);
            fuelLevelAllVehicle = fuelLevelAllVehicle.toLowerCase().replace("l", "").
                    replace("kms", "").trim();
            LOG.Reporter("The value of vehicles fuel and odometer  " + fuelLevelAllVehicle);
        }

    }

    public LandingPageV1 verifyVehicleFuelLevel() {
        CommonUtils.sleep(2);
        fuelLevelForAllVehicle(vehicleFuel);
        LOG.Reporter("Vehicle fuel is displayed");

        return this;
    }

    public LandingPageV1 verifyVehicleOnMap() {
        CommonUtils.sleep(3);
        Assert.assertTrue(utility.iselementVisible(vehicleOnMap), "Vehicle not present");
        utility.iselementClickable(vehicleOnMap, 1);
        utility.clickByAction(vehicleOnMap);
        LOG.Reporter("Vehicle is selected from map view");
        Assert.assertTrue(utility.iselementVisible(vehicleDetailTitle), "Title not present");
        CommonUtils.sleep(3);
        String vehicleRegNum = vehicleDetailTitle.getText();
        LOG.Reporter("Vehicle details is displayed and registration number is: " + vehicleRegNum);
        return this;
    }

    public LandingPageV1 verifyVehicleOnList() {
        Assert.assertTrue(utility.iselementVisible(vehicleOnList), "Vehicle details not display");
        CommonUtils.sleep(1);
        vehicleOnList.click();
        CommonUtils.sleep(2);
        Assert.assertTrue(utility.iselementVisible(vehicleDetailTitle), "Vehicle registration number not display");
        String vehicleRegNum = vehicleDetailTitle.getText();
        LOG.Reporter("Vehicle details is displayed on List and vehicle number: " + vehicleRegNum);
        return this;
    }

    public LandingPageV1 verifyVehicleDetailedView() {
        CommonUtils.sleep(1);
        utility.iselementVisible(vCurrentStatus);
        Assert.assertTrue(iselementVisible(vCurrentStatus, second10TimeOut), "Vehicle current status is not visible");
        vCurrentStatus.click();
        LOG.Reporter("Vehicle Current Status is displayed on List");

        utility.iselementVisible(vPlaybacksandTrace);
        Assert.assertTrue(iselementVisible(vPlaybacksandTrace, second10TimeOut),
                "Vehicle Playback & Trace status is not visible");
        vPlaybacksandTrace.click();
        LOG.Reporter("Vehicle Playback & Trace is displayed on List");

        utility.iselementVisible(vQuickLinks);
        Assert.assertTrue(iselementVisible(vQuickLinks, second10TimeOut), "Vehicle QuickLinks status is not visible");
        vQuickLinks.click();
        LOG.Reporter("Vehicle Quick Links is displayed on List");
        CommonUtils.sleep(2);
        return this;
    }


    public LandingPageV1 verifyVehicleRealTimeSpeed() {
        CommonUtils.sleep(1);

        Assert.assertTrue(utility.iselementVisible(vrealTimeSpeed),
                "Vehicle real time speed on card is not visible");
        String vehicleSpeedText = vrealTimeSpeed.getText();
        LOG.Reporter("Vehicle real time speed is: " + vehicleSpeedText);
        vehicleSpeedText = vehicleSpeedText.toLowerCase().replace("moving", "")
                .replace("km/hr", "").trim();
        Assert.assertTrue(Integer.parseInt(vehicleSpeedText) > 0, "vehicle is not moving");
        LOG.Reporter("Vehicle real time speed is greater than 0 speed is:  " + vehicleSpeedText);

        return this;
    }

    public LandingPageV1 verifyVehicleRealTimeOdometer() {
        CommonUtils.sleep(1);
        Assert.assertTrue(utility.iselementVisible(vrealTimeOdometer),
                "Vehicle real time Odometer on card is not visible");
        String vehicleOdometerText = vrealTimeOdometer.getText();
        LOG.Reporter("Vehicle real time odometer on card is displayed " + vehicleOdometerText);
        vehicleOdometerText = vehicleOdometerText.toLowerCase().replace(",", "").
                replace("km", "").trim();
        Assert.assertTrue(Integer.parseInt(vehicleOdometerText) > 0, "");
        LOG.Reporter("Vehicle real time odometer integer value is greater than 0 : " + vehicleOdometerText);
        return this;
    }

    public LandingPageV1 verifyVehicleRealTimeSweetSpot() {
        CommonUtils.sleep(1);
        utility.iselementVisible(vRealTimeSweetSpot);
        String vehicleSweetSpotText = vRealTimeSweetSpot.getText();
        Assert.assertTrue(iselementVisible(vRealTimeSweetSpot, second10TimeOut),
                "Vehicle real time Sweet Spot on card is not visible");
        LOG.Reporter("Vehicle real time SweetSpot on card is displayed " + vehicleSweetSpotText);
        return this;
    }

    public LandingPageV1 verifyVehicleRealTimeDEFLevel() {
        CommonUtils.sleep(1);
        utility.iselementVisible(vRealtimeDEFlevel);
        String vehicleDEFText = vRealtimeDEFlevel.getText();
        Assert.assertTrue(iselementVisible(vRealtimeDEFlevel, second10TimeOut),
                "Vehicle real time DEF level on card is not visible");
        LOG.Reporter("Vehicle real time DEF level on card is displayed " + vehicleDEFText);
        return this;
    }

    public LandingPageV1 verifyVehicleRealTimeDetails() {
        CommonUtils.sleep(1);
        String vehicleSpeed = oneVehicleRealTimeSpeed.getText();
        LOG.Reporter("Real time speed and status of vehicle is: " + vehicleSpeed);
        vehicleSpeed = vehicleSpeed.toLowerCase().replace("km/hr", "").
                replace("moving", "").trim();
        Assert.assertTrue(Integer.parseInt(vehicleSpeed) > 0, "Vehicle is not moving");
        LOG.Reporter("Real time speed not equal to 0 speed is: " + vehicleSpeed);

        Assert.assertTrue(utility.iselementVisible(vrealTimeLocation), "Vehicle real location not display");/*
        String vehicleLocationText = vrealTimeLocation.getText();
        Assert.assertTrue(iselementVisible(vrealTimeLocation, second10TimeOut),
                "vehicle real time location on card is not visible");
        LOG.Reporter("Vehicle real time location on card is displayed: " + vehicleLocationText);*/
        LOG.Reporter("Vehicle real time location on card is displayed :-"  +vrealTimeLocation.getText());

        return this;
    }

    public LandingPageV1 verifyShareLiveLocation() {
        CommonUtils.sleep(1);
        shareLiveLocation.click();
        Assert.assertTrue(iselementVisible(shareLiveLocation, second10TimeOut),
                "Share live location button is not visible");
        LOG.Reporter("Click on Share Live location Button ");
        utility.iselementVisible(vehicleOnList);
        CommonUtils.sleep(1);
        locationUserName.sendKeys("QaUsers");
        LOG.Reporter("Entering user name for location share :Ashish");

        CommonUtils.sleep(1);
        locationUserMobile.sendKeys("9999999999");
        LOG.Reporter("Entering user mobile number for location share :9999999999");

        CommonUtils.sleep(1);
        locationUserEmail.sendKeys("example@gmail.com");
        LOG.Reporter("Entering user email for location share :example@gmail.com");


        CommonUtils.sleep(1);
        openCalender.click();
        LOG.Reporter("Clicking on open calender");

        CommonUtils.sleep(1);
        for(int i=0; i<startdate.size(); i++){
            if(i==17){
                startdate.get(i).click();
                LOG.Reporter("Clicking on start Date");
            }
        }

        CommonUtils.sleep(1);
        starttime.click();
        LOG.Reporter("Clicking on Starttime");

        CommonUtils.sleep(1);
        for(int i=0; i<=starttimedropdown.size(); i++){
            if(i==3){
                starttimedropdown.get(i).click();
                LOG.Reporter("Clicking on start ");
            }
        }
        CommonUtils.sleep(1);
        startmin.click();
        LOG.Reporter("Clicking on startmin");

        CommonUtils.sleep(1);
        for(int i=0; i<=starttimedropdown.size(); i++){
            if(i==2){
                starttimedropdown.get(i).click();
                LOG.Reporter("Clicking on min value ");
            }
        }

        CommonUtils.sleep(1);
        Ampm.click();
        LOG.Reporter("Clicking on Am/pm dropdown");

        CommonUtils.sleep(1);
        for(int i=0; i<=starttimedropdown.size(); i++){
            if(i==1){
                starttimedropdown.get(i).click();
                LOG.Reporter("Clicking on Am/pm ");
            }
        }


        CommonUtils.sleep(1);
        endDateBtn.click();
        LOG.Reporter("Click on end date calender button");

        CommonUtils.sleep(1);
        for(int i=0; i<calendarDate.size(); i++){
            if(i==17){
                calendarDate.get(i).click();
                LOG.Reporter("Clicking on end Date");
            }
        }


        CommonUtils.sleep(1);
        endtime.click();
        LOG.Reporter("Clicking on end time button");

        CommonUtils.sleep(1);
        selectendHourDD.click();
        LOG.Reporter("Clicking on hournnnnns for Live location");

        CommonUtils.sleep(1);
        endMinDD.click();
        LOG.Reporter("Click on Minutes for live location");

        CommonUtils.sleep(1);
        selectendMinDD.click();
        LOG.Reporter("Minutes selected for live location");

        CommonUtils.sleep(1);
        endAMandPMDD.click();
        LOG.Reporter("Click On AM/PM for live location");

        CommonUtils.sleep(1);
        selectendAMandPMDD.click();
        LOG.Reporter("Select AM/PM for live location");

        CommonUtils.sleep(1);
        locationFormSubmitBtn.click();
        LOG.Reporter("Click on Submit button");
        CommonUtils.sleep(2);

        return this;
    }

    public LandingPageV1 verifyShareCurrentLocation() {
        CommonUtils.sleep(1);
        Assert.assertTrue(iselementVisible(vShareCurrentLocationButton, second10TimeOut),
                "Share current location button is not visible");
        vShareCurrentLocationButton.click();
        LOG.Reporter("Click on Share current location Button ");
        CommonUtils.sleep(2);
        Assert.assertTrue(iselementVisible(vCopyLinkButton, second10TimeOut), "Copy link button not display");
        vCopyLinkButton.click();
        LOG.Reporter("Click on Copy link button ");
        Assert.assertTrue(utility.iselementVisible(successMessageOnPopup), "Success message is not visible");
        LOG.Reporter("Success message is displayed");

        CommonUtils.sleep(1);
        Assert.assertTrue(iselementVisible(OKButtonOnSuccessPopup, second10TimeOut), "Ok button is not visible");
        OKButtonOnSuccessPopup.click();
        LOG.Reporter("Click on ok Button ");
        return this;
    }

    public LandingPageV1 verifyListViewHealthStatus() {
        allVehicleHealthStatus(listViewHealthStatus);
        return this;
    }

    public void allVehicleHealthStatus(List<WebElement> elements) {
        for (WebElement element : elements) {
            String allVehicleHealth = element.getText();
            Assert.assertTrue(element.isDisplayed(), "Health status is not display");
            LOG.Reporter("Vehicle is in :" + allVehicleHealth);

        }
    }


    public LandingPageV1 verifyVehicleDetailsTab() {
        CommonUtils.sleep(1);
        vQuickLinks.click();
        Assert.assertTrue(iselementVisible(vQuickLinks, second10TimeOut), "Quick link tab is not visible");
        LOG.Reporter("Click on Quick link tab");
        CommonUtils.sleep(1);
        Assert.assertTrue(iselementVisible(vehicleDetailsTab, second10TimeOut), "Vehicle details tab is not visible");
        vehicleDetailsTab.click();
        LOG.Reporter("Click on vehicle details tab");
        
        CommonUtils.sleep(2);
        Assert.assertTrue(utility.iselementVisible(vehicleDetailsTitle), "Vehicle details title not display");
        LOG.Reporter("Vehicle details title is display :- "    +vehicleDetailsTitle.getText());

        return this;
    }

    public LandingPageV1 verifyVehicleFuelServicesTab() {
        CommonUtils.sleep(1);
        Assert.assertTrue(iselementVisible(vQuickLinks, second10TimeOut), "Quick link tab is not visible");
        vQuickLinks.click();
        LOG.Reporter("Click on Quick link tab");

        CommonUtils.sleep(1);
        Assert.assertTrue(iselementVisible(fuelServicesTab, second10TimeOut), "Fuel services tab is not visible");
        fuelServicesTab.click();
        LOG.Reporter("Click Fuel services  tab");
        if (utility.iselementVisible(fuelServicesAlertOk)) {
            String alertMessage = fuelServicesAlertMessage.getText();
            LOG.Reporter("Alert message is: " + alertMessage);
            fuelServicesAlertOk.click();
            LOG.Reporter("Click on alert OK button ");
        } else {
            utility.Alert(driver);
        }
        CommonUtils.sleep(1);
        utility.iselementVisible(fuelDrainTabVerify);
        Assert.assertTrue(iselementVisible(fuelDrainTabVerify, second10TimeOut),
                "Fuel Refill & Drain Analysis is not visible");
        LOG.Reporter("Fuel Refill & Drain Analysis is display");

       /* CommonUtils.sleep(1);
        utility.iselementVisible(fuelDrainTabLeftTab);
        Assert.assertTrue(iselementVisible(fuelDrainTabLeftTab, second10TimeOut),
                "Fuel Refill & Drain left side is not visible");
        LOG.Reporter("Fuel Refill & Drain left side is display");*/
        return this;
    }

    public LandingPageV1 verifyVehicleFuelGraphTab() {
        CommonUtils.sleep(1);
        vQuickLinks.click();
        Assert.assertTrue(iselementVisible(vQuickLinks, second10TimeOut), "Quick link tab is not visible");
        LOG.Reporter("Click on Quick link tab");

        CommonUtils.sleep(1);
        Assert.assertTrue(iselementVisible(fuelGraphTab, second10TimeOut), "Fuel Graph tab is not visible");
        fuelGraphTab.click();
        LOG.Reporter("Click Fuel graph tab");

        CommonUtils.sleep(1);
        utility.iselementVisible(fuelGraphwindow);
        Assert.assertTrue(iselementVisible(fuelGraphwindow, second10TimeOut), "Fuel graph window is not visible");
        LOG.Reporter("Fuel graph window is display: " + fuelGraphwindow.getText());
        return this;
    }

    public LandingPageV1 verifyVehicleFleetMonitorTab() {
        CommonUtils.sleep(1);
        Assert.assertTrue(iselementVisible(vQuickLinks, second10TimeOut), "Quick link tab is not visible");
        vQuickLinks.click();
        LOG.Reporter("Click on Quick link tab");

        CommonUtils.sleep(1);
        Assert.assertTrue(iselementVisible(fleetInsightTab, second10TimeOut), "fleet Insight tab is not visible");
        fleetInsightTab.click();
        LOG.Reporter("Click fleet Insight tab");

        CommonUtils.sleep(1);
          for (int i=0; i<fleetInsightsWindow.size(); i++) {
            String Fleetinsight = fleetInsightsWindow.get(i).getText();

            LOG.Reporter("Fleet Insights Window category is display: " + Fleetinsight);
        }
          CommonUtils.sleep(2);
        return this;
    }

    public LandingPageV1 verifyVehicleGoToDashboard() {
        CommonUtils.sleep(1);
        Assert.assertTrue(iselementVisible(vQuickLinks, second10TimeOut), "Quick link tab is not visible");
        vQuickLinks.click();
        LOG.Reporter("Click on Quick link tab");
        CommonUtils.sleep(1);
        Assert.assertTrue(utility.iselementVisible(gotoDashboardTab), "Go to Dashboard tab is not visible");
        gotoDashboardTab.click();
        LOG.Reporter("Click on go to Dashboard tab");
        CommonUtils.sleep(2);
        Assert.assertTrue(utility.iselementVisible(gotoDashboardwindow),
                "Go to Dashboard Window is not visible");
        LOG.Reporter("Go to Dashboard Window is display");
        CommonUtils.sleep(1);
        String userDashboard = "B M ROADLINES PRIVATE LIMITED : MyEicher Dashboard";
        String actualTxt = gotoDashboardwindow.getText();
        Assert.assertEquals(userDashboard, actualTxt);
        LOG.Reporter("Selected Customer and VECV user name is:" + actualTxt);


        return this;
    }


    public LandingPageV1 verifyVehicleCategoryInList() {
        Assert.assertTrue(utility.iselementVisible(movingTab), "Moving tab changes in Map view");
        movingTab.click();
        LOG.Reporter("Moving tab is selected in map view and count of moving vehicle is: " + movingTabCount.getText());
        switchTrackingView(TrackingView.List);
        Assert.assertTrue(utility.iselementVisible(movingTab), "Moving tab changes in list view");
        LOG.Reporter("Moving tab is selected in list view and count of moving vehicle is: " + movingTabCount.getText());
        switchTrackingView(TrackingView.Map);

        Assert.assertTrue(utility.iselementVisible(idlingTab), "Idling tab changes in Map view");
        idlingTab.click();
        LOG.Reporter("Idling tab is selected in map view and count of idle vehicle is: " + idlingTabCount.getText());
        switchTrackingView(TrackingView.List);
        Assert.assertTrue(utility.iselementVisible(idlingTab), "idling tab changes in list view");
        LOG.Reporter("Idling tab is selected in list view and count of idle vehicle is: " + idlingTabCount.getText());
        switchTrackingView(TrackingView.Map);

        Assert.assertTrue(utility.iselementVisible(stoppedTab), "Stopped tab changes in Map view");
        stoppedTab.click();
        LOG.Reporter("Stopped tab is selected in map view and count of stop vehicle is: " + stoppedTabCount.getText());
        switchTrackingView(TrackingView.List);
        Assert.assertTrue(utility.iselementVisible(stoppedTab), "Stopped tab changes in list view");
        LOG.Reporter("Stopped tab is selected in list view and count of stop vehicle is: " + stoppedTabCount.getText());
        switchTrackingView(TrackingView.Map);

        Assert.assertTrue(utility.iselementVisible(notReachableTab), "Not Reachable tab changes in Map view");
        notReachableTab.click();
        LOG.Reporter("Not reachable tab is selected in map view and count of not reachable vehicle is: " + notReachableTabCount.getText());
        switchTrackingView(TrackingView.List);
        Assert.assertTrue(utility.iselementVisible(notReachableTab), "Not reachable tab changes in list view");
        LOG.Reporter("Not reachable tab is selected in list view and count of not reachable vehicle is: " + notReachableTabCount.getText());
        switchTrackingView(TrackingView.Map);

        return this;
    }


    public LandingPageV1 verifyVehiclePast24HourPerformance() {
        CommonUtils.sleep(1);
        utility.iselementVisible(past24HoursPerformance);
        Assert.assertTrue(utility.iselementVisible(past24HoursPerformance), "Past 24 hour performance not visible");
        LOG.Reporter("Past 24 hours performance is display");
        validate24HourPerformance(performanceCategory, performanceValue);

        return this;
    }

    public void validate24HourPerformance(List<WebElement> ele1, List<WebElement> ele2) {
        int values = 0;
        for (WebElement element : ele1) {
            values++;
            String category = element.getText();
            LOG.Reporter("Vehicle performance Category :" + category);
            int value = 0;
            for (WebElement element1 : ele2) {
                value++;
                if (values == value) {
                    String vehicleValue = element1.getText();
                    LOG.Reporter("Vehicle performance value :" + vehicleValue);
                }
            }
        }
    }

    public LandingPageV1 verifyNoPilotAssigned() {
        CommonUtils.sleep(1);
        utility.iselementVisible(noPilotAssigned);
        Assert.assertTrue(iselementVisible(noPilotAssigned, second10TimeOut), "No Pilot Assigned is not visible");
        LOG.Reporter("No pilot is assigned to the vehicle :" + noPilotAssigned.getText());
        return this;
    }

    public LandingPageV1 verifyPilotAssignedToVehicle() {
        CommonUtils.sleep(1);
        Assert.assertTrue(iselementVisible(myOrganization, second10TimeOut), "My organization is not visible");
        myOrganization.click();
        LOG.Reporter("Click on My organization");
        CommonUtils.sleep(1);
        Assert.assertTrue(iselementVisible(myTeam, second10TimeOut), "My Team is not visible");
        myTeam.click();
        LOG.Reporter("Click on My Team ");

        CommonUtils.sleep(3);
        Assert.assertTrue(iselementVisible(pilotTab, second10TimeOut), "Pilot Tab is not visible");
        pilotTab.click();
        LOG.Reporter("Click on Pilot tab ");

        CommonUtils.sleep(1);
        Assert.assertTrue(iselementVisible(viewAssignment, second10TimeOut), "View assignment is not visible");
        viewAssignment.click();
        LOG.Reporter("Click on View assignment");

        CommonUtils.sleep(1);
        String vRegistration = vehicleAssignment.getText();
        utility.iselementVisible(vehicleAssignment);
        Assert.assertTrue(iselementVisible(vehicleAssignment, second10TimeOut), "View assignment is not visible");
        LOG.Reporter("Pilot assigned with :" + vRegistration);
        return this;
    }
}



