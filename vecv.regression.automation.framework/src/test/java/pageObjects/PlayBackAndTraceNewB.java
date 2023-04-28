package pageObjects;

import logger.LOG;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utilities.CommonUtils;
import utilities.DriverUtils;

import java.util.List;

public class PlayBackAndTraceNewB extends BasePage {

    DriverUtils utility = new DriverUtils(driver);

    @FindBy(xpath = "(//button[contains(text(),'Submit')])[2]")
    @CacheLookup
    public WebElement TraceSubmitBtnDate;
    @FindBy(xpath = "//button[contains(text(),' Our Services ')]")
    @CacheLookup
    public WebElement ourServicesBtn;

    @FindBy(xpath = "//p[contains(@class,'pro text-center pt fontL ng-star-inserted')]")
    @CacheLookup
    public WebElement trace_start_end_odometer_value;

    //Filter the data basis time - Past 24 hours, Last 7 days, Last 10 days. Specific date, data range.xpath

    @FindBy(xpath = "(//div[@role='button' and 'title'])[1]")
    @CacheLookup
    public WebElement track_map_click_on_default_vehicle_btn;

    @FindBy(xpath = "(//div[contains(@class,'mat-select-arrow-wrapper')])[1]")
    @CacheLookup
    public WebElement track_click_on_dropdown_arrow_btn;

    @FindBy(xpath = "(//mat-option[contains(@id,'mat-option-')])[1]")
    @CacheLookup
    public WebElement track_past_24_hours;

    @FindBy(xpath = "(//mat-option[contains(@id,'mat-option-')])[2]")
    @CacheLookup
    public WebElement track_Last_7_Days;

    @FindBy(xpath = "(//mat-option[contains(@id,'mat-option-')])[3]")
    @CacheLookup
    public WebElement track_Last_10_Days;

    @FindBy(xpath = "(//mat-option[contains(@id,'mat-option-')])[4]")
    @CacheLookup
    public WebElement track_Specific_Date;

    @FindBy(xpath = "(//mat-option[contains(@id,'mat-option-')])[5]")
    @CacheLookup
    public WebElement track_Date_Range;




    @FindBy(xpath = "//span[contains(text(),'Fleet Tracking')]")
    @CacheLookup
    public WebElement fleetTrack;

    @FindBy(xpath = "//a[contains(text(),'Track')]")
    @CacheLookup
    public WebElement trackFleetTracking;

    @FindBy(xpath = "(//p[contains(@class,'pro text-center pt fontL')])[1]")
    @CacheLookup
    public WebElement past24startandend;

    @FindBy(xpath = "(//p[contains(@class,'pro text-center pt')])[2]")
    @CacheLookup
    public WebElement past24startandendText;

    @FindBy(xpath = "//p[contains(@class,'hrkm')]")
    @CacheLookup
    public List<WebElement> past24VehicleValue;

    @FindBy(xpath = "//p[contains(@class,'hrt')]")
    @CacheLookup
    public List<WebElement> past24VehicleText;

    @FindBy(xpath = "//div[@class='mat-checkbox-inner-container']")
    @CacheLookup
    public WebElement traceRadiotn;

    @FindBy(xpath = "//mat-label[contains(text(),'To (Kms)')]")
    @CacheLookup
    public WebElement Tokms;

    @FindBy(xpath = "(//input['_ngcontent-ara-c455'])[3]")
    @CacheLookup
    public WebElement VehicleSummaryFromkms;

    @FindBy(xpath = "(//input['_ngcontent-ara-c455'])[4]")
    @CacheLookup
    public WebElement VehicleSummaryTokms;










    //Trace module date picker xpath
    @FindBy(xpath = "  //span[contains(text(),'Past 24 Hours')]")
    @CacheLookup
    public WebElement t24;

    @FindBy(xpath = "(//mat-option[@role='option'])[5]")
    @CacheLookup
    public WebElement t24d;

    @FindBy(xpath = "//span[contains(text(),' Date Range ')]")
    @CacheLookup
    public WebElement tracedaterangeB;

    @FindBy(xpath = "    (//button[contains(text(),' Submit ')])[2]")
    @CacheLookup
    public WebElement tracedaterengeSubmit;


    @FindBy(xpath = " //button[@aria-label='Choose month and year']")
    @CacheLookup
    public WebElement TselectMonth;

    @FindBy(xpath = " (//button[@aria-label='Choose month and year'])[1]")
    @CacheLookup
    public WebElement TselectMonthRR;

    @FindBy(xpath = "(//td[@role='gridcell']//div)[24]")
    @CacheLookup
    public WebElement TclickYear;
    @FindBy(xpath = "((//td[@role='gridcell']//div)[24])[1]")
    @CacheLookup
    public WebElement TclickYearRR;
    @FindBy(xpath = "((//td[@role='gridcell']//div)[24])[1]")
    @CacheLookup
    public WebElement TclickYear1;
    @FindBy(xpath = "(((//td[@role='gridcell']//div)[24])[1])[1]")
    @CacheLookup
    public WebElement TclickYear1RR;


    @FindBy(xpath = "//td[@aria-label='January 2023']")
    @CacheLookup
    public WebElement TclickMonth;
    @FindBy(xpath = "(//td[@aria-label='January 2023'])[1]")
    @CacheLookup
    public WebElement TclickMonthRR;
    @FindBy(xpath = "(//td[@aria-label='January 2023'])[1]")
    @CacheLookup
    public WebElement TclickMonth1;
    @FindBy(xpath = "((//td[@aria-label='January 2023'])[1])[1]")
    @CacheLookup
    public WebElement TclickMonth1RR;

    @FindBy(xpath = "//td[@role='gridcell']//div")
    @CacheLookup
    public List<WebElement> alldates;
    @FindBy(xpath = "(//td[@role='gridcell']//div)[1]")
    @CacheLookup
    public List<WebElement> alldatesRR;

    @FindBy(xpath = "//td[@role='gridcell']//div")
    @CacheLookup
    public List<WebElement> alldates1;
    @FindBy(xpath = "(//td[@role='gridcell']//div)[1]")
    @CacheLookup
    public List<WebElement> alldates1RR;


    @FindBy(xpath = "//button[@aria-label='Previous month']")
    @CacheLookup
    public WebElement previoustn;

    @FindBy(xpath = "(//button[@aria-label='Previous month'])[1]")
    @CacheLookup
    public WebElement previoustnCopy;
    @FindBy(xpath = "(//div[@class='mat-calendar-body-cell-content'])[2]")
    @CacheLookup
    public WebElement fst1;

    @FindBy(xpath = "((//div[@class='mat-calendar-body-cell-content'])[2])[1]")
    @CacheLookup
    public WebElement fst1Copy;

    @FindBy(xpath = "(//div[@class='mat-calendar-body-cell-content'])[2]")
    @CacheLookup
    public WebElement fst11;

    @FindBy(xpath = "((//div[@class='mat-calendar-body-cell-content'])[2])[1]")
    @CacheLookup
    public WebElement fst11Copy;




    @FindBy(xpath = "(//div[@class='mat-calendar-body-cell-content'])[5]")
    @CacheLookup
    public WebElement fst6;

    @FindBy(xpath = "((//button[contains(text(),' Submit ')])[2])[1]")
    @CacheLookup
    public WebElement rTsubmit;

    @FindBy(xpath = "(//button[contains(text(),' Submit ')])[2]")
    @CacheLookup
    public WebElement rTsubmitCopy;



    //trace module field
    @FindBy(xpath = "//a[contains(text(),'Trace')]")
    @CacheLookup
    public WebElement trace;

    @FindBy(xpath = "//input[contains(@placeholder,'Vehicle Reg. Number')]")
    @CacheLookup
    public WebElement vehicleRegNumber;

    @FindBy(xpath = "//span[contains(@class,'mat-active') or contains(text(),'Past 24 Hours')]")
    @CacheLookup
    public WebElement defaultViewTrace;

    @FindBy(xpath = "(//*[contains(text(),'Submit')])[1]")
    @CacheLookup
    public WebElement Tsubmit;
    @FindBy(xpath = "((//*[contains(text(),'Submit')])[1])[1]")
    @CacheLookup
    public WebElement T4submit;

    @FindBy(xpath = "//span[contains(text(),'Date')]")
    @CacheLookup
    public WebElement filterByDate;
    @FindBy(xpath = "//span[contains(text(),'Odometer')]")
    @CacheLookup
    public WebElement filterByOdometer;

    @FindBy(xpath = "(//input['_ngcontent-ara-c455'])[3]")
    @CacheLookup
    public WebElement fromKms;

    String from_kms_value = "1,42,000";

    @FindBy(xpath = "//div[contains(@role,'listbox')]/mat-option")
    @CacheLookup
    public List<WebElement> rengefilter;

    @FindBy(xpath = "(//div[@class='custom cursor-pointer'])[1]//span[contains(@class,'desc ')]")
    @CacheLookup
    public WebElement startAddressdetail;

    @FindBy(xpath = "(//span[@class='date'])[1]")
    @CacheLookup
    public WebElement startdatedetail;

    @FindBy(xpath = "(//div[@class='content'])[10]")
    @CacheLookup
    public WebElement starttimedetail;

    @FindBy(xpath = "(//div[@class='content'])[25]")
    @CacheLookup
    public WebElement endAddressdetail;

    @FindBy(xpath = "(//span[@class='date'])[9]")
    @CacheLookup
    public WebElement enddatedetail;

    @FindBy(xpath = "(//span[@class='desc ng-star-inserted']//span)[2]")
    @CacheLookup
    public WebElement enddtimedetail;

    @FindBy(xpath = "(//div[@class='ng-star-inserted'])[2]")
    @CacheLookup
    public WebElement defaultmapvehicletrack;

    @FindBy(xpath = "//div[@class='ng-star-inserted']")
    @CacheLookup
    public List<WebElement> defaultmapvehicletrackAll;
    @FindBy(xpath = "//div[@class='ng-star-inserted']//h2[contains(text(),' GJ12BX6458 ')]")
    @CacheLookup
    public WebElement scroll123;
    @FindBy(xpath = "(//button[@class='request-send-button ng-star-inserted'])[1]")
    @CacheLookup
    public WebElement scroll123Submit;

    @FindBy(xpath = "//div[@class='border-bottom']")
    @CacheLookup
    public WebElement mappast24track;
    @FindBy(xpath = "//div[@class='card past']//h3")
    @CacheLookup
    public List<WebElement> maptrackValuesName;
    @FindBy(xpath = "//div[@class='card past']//h2")
    @CacheLookup
    public List<WebElement>  maptrackValues;


    @FindBy(xpath = "//p[contains(text(),'Please select a range less than 5000 Km')]")
    @CacheLookup
    public WebElement alertmessage;

    @FindBy(xpath = "//mat-option[@role='option']")
    @CacheLookup
    public List<WebElement> vehiclerengedropdown;
    @FindBy(xpath = "//div['_ngcontent-isd-c455']//p[contains(@class,'vehicleNumber ')]")
    @CacheLookup
    public WebElement compareAllVehicleNum;
    @FindBy(xpath = "(//div[@class='cdk-overlay-pane']//mat-option)[6]")
    @CacheLookup
    public WebElement getVehicleRegNumber1;


    @FindBy(xpath = "(//div[@role='tab'])[2]")
    @CacheLookup
    public WebElement playbackT;
    @FindBy(xpath = "//input[@id='custom-time']")
    @CacheLookup
    public WebElement radiobtnPT;

    //select dapicker start to end time xapth
    @FindBy(xpath = "//mat-option[@role='option']//span")
    @CacheLookup
    public List<WebElement> selectHOURS;
    @FindBy(xpath = "(//span[contains(text(),'Hour')])[1]")
    @CacheLookup
    public WebElement clickHOURS;
    @FindBy(xpath = "//mat-option[@role='option']//span")
    @CacheLookup
    public List<WebElement> selectHOURS1;
    @FindBy(xpath = "(//span[contains(text(),'Hour')])[1]")
    @CacheLookup
    public WebElement clickHOURS1;

    @FindBy(xpath = "//mat-option[@role='option']//span")
    @CacheLookup
    public List<WebElement> selectMINUTES;
    @FindBy(xpath = "(//span[contains(text(),'Min')])[2]")
    @CacheLookup
    public WebElement clickMINUTES;
    @FindBy(xpath = "//mat-option[@role='option']//span")
    @CacheLookup
    public List<WebElement> selectMINUTES1;
    @FindBy(xpath = "(//span[contains(text(),'Min')])[2]")
    @CacheLookup
    public WebElement clickMINUTES1;

    @FindBy(xpath = "//mat-option[@role='option']//span")
    @CacheLookup
    public List<WebElement> selectAMPM;
    @FindBy(xpath = "(//span[contains(text(),'AM/PM')])[1]")
    @CacheLookup
    public WebElement clickAMPM;

    @FindBy(xpath = "//mat-option[@role='option']//span")
    @CacheLookup
    public List<WebElement> selectAMPM1;
    @FindBy(xpath = "(//span[contains(text(),'AM/PM')])[1]")
    @CacheLookup
    public WebElement clickAMPM1;
    @FindBy(xpath = "(//button[contains(text(),'Submit')])[2]")
    @CacheLookup
    public WebElement TTsubmit;

    @FindBy(xpath = "//button[contains(@class,'submit-btn mat-button ')]")
    @CacheLookup
    public WebElement TTTsubmit;


   //start time and start odo xpath
    @FindBy(xpath = "//div[@class='text-left divw']//h5")
    @CacheLookup
    public List<WebElement> startend;

    @FindBy(xpath = "//div[@class='text-left divw']//h4")
    @CacheLookup
    public List<WebElement> startendTimeDate;

    @FindBy(xpath = "(//p[contains(@class,'pro text-center ')])[1]")
    @CacheLookup
    public WebElement startODO;

    @FindBy(xpath = "(//p[contains(@class,'pro text-center ')])[2]")
    @CacheLookup
    public WebElement startODO1;

    //playback xpath
    @FindBy(xpath = "//img[@class='imgBtm']")
    @CacheLookup
    public WebElement playbackimgbtn;
    @FindBy(xpath = "//img[@src='../../../../../assets/img/play-icon.png']")
    @CacheLookup
    public WebElement playbackimgbtnPause;

    @FindBy(xpath = "//img[@src='../../../../../assets/img/pause-icon.png']")
    @CacheLookup
    public WebElement playbackimgbtnplay;

    @FindBy(xpath = "//button[@aria-label='Zoom in']")
    @CacheLookup
    public WebElement playbackZoomInBtn;

    @FindBy(xpath = "//button[@aria-label='Zoom out']")
    @CacheLookup
    public WebElement playbackZoomOutBtn;

    //route playback xpath
    @FindBy(xpath = "//div[@class='card1 text-left']//p")
    @CacheLookup
    public WebElement routeLocation;

    @FindBy(xpath = "//div[contains(text(),' View Location ')]")
    @CacheLookup
    public WebElement routeViewLocation;

    @FindBy(xpath = "//p[@class='ng-star-inserted']")
    @CacheLookup
    public WebElement routeLocationAddress;

    @FindBy(xpath = "(//div[@fxlayout='row wrap'])[5]")
    @CacheLookup
    public WebElement routetimeUpdate;

    @FindBy(xpath = "//div[contains(@class,' paad')]//p")
    @CacheLookup
    public List<WebElement> routeFO1;

    @FindBy(xpath = "//div[@class='playback_spd']")
    @CacheLookup
    public WebElement routespeed;
    @FindBy(xpath = "//mat-option[@role='option']")
    @CacheLookup
    public List<WebElement> routespeedIncrease;

    @FindBy(xpath = "//div[@class='g_maps playback_map ng-star-inserted']")
    @CacheLookup
    public WebElement routeMap;

    @FindBy(xpath = "//img[@class='expand_icon ng-star-inserted']")
    @CacheLookup
    public WebElement routeMapCustmize;

    @FindBy(xpath = "//p[@class='uppr_txt']")
    @CacheLookup
    public List<WebElement> routeMapCustmizeUpperDetails;

    @FindBy(xpath = "//p[@class='lwr_txt']")
    @CacheLookup
    public List<WebElement> routeMapCustmizeLowerDetails;

    //trace and reports xpath
    @FindBy(xpath = "//span[contains(text(),'All Vehicles')]")
    @CacheLookup
    public WebElement reportSummarySFA;

    @FindBy(xpath = "//span[contains(text(),'Date')]")
    @CacheLookup
    public WebElement reportSummaryDate;
    @FindBy(xpath = "//span[contains(text(),'Today')]")
    @CacheLookup
    public WebElement reportSummaryToday;

    @FindBy(xpath = "//mat-option[@role='option']")
    @CacheLookup
    public List<WebElement> reportSummarySFAFilter;

    @FindBy(xpath = "(//input[@role='combobox'])[2]")
    @CacheLookup
    public WebElement reportsVehiclerenge;

    @FindBy(xpath = "//mat-option[@role='option']")
    @CacheLookup
    public List<WebElement> reportSummarydaterange;

    @FindBy(xpath = "//a[contains(text(),'Reports')]")
    @CacheLookup
    public WebElement Reports;

    @FindBy(xpath = "//a[contains(text(),' Vehicle Summary ')]")
    @CacheLookup
    public WebElement vehiclesummary;

    @FindBy(xpath = "//*[contains(text(),'Fleet Monitoring')]")
    @CacheLookup
    public WebElement fleetMonitoring;

    @FindBy(xpath = "(//*[contains(text(),' Submit ')])[3]")
    @CacheLookup
    public WebElement reportsRangeSubmit;

    //compariosn start trace vs reports values xpath

    @FindBy(xpath = "(//button[@type='button'])[3]")
    @CacheLookup
    public WebElement reportsDistanceTravel;
    @FindBy(xpath = " (//td[@role='gridcell'])[3]//span")
    @CacheLookup
    public WebElement reportsDistanceTravelValue;

    @FindBy(xpath = "(//p[contains(@class,'hrt')])[1]")
    @CacheLookup
    public WebElement traceDistanceTravel;
    @FindBy(xpath = "(//p[contains(@class,'hrkm')])[1]")
    @CacheLookup
    public WebElement traceDistanceTravelValue;

    @FindBy(xpath = " (//p[@class='hrt'])[2]")
    @CacheLookup
    public WebElement traceIgnitionTime;
    @FindBy(xpath = "(//p[@class='hrkm'])[2]")
    @CacheLookup
    public WebElement traceIgnitionTimeValue;

    @FindBy(xpath = " (//p[@class='hrt'])[5]")
    @CacheLookup
    public WebElement traceAverageSpeed;
    @FindBy(xpath = "(//p[@class='hrkm'])[3]")
    @CacheLookup
    public WebElement traceAverageSpeedValue;


    @FindBy(xpath = "//div[@class='mat-tab-links']//a[3]")
    @CacheLookup
    public WebElement reportsCustomPara;


    @FindBy(xpath = " (//td[@role='gridcell'])[6]//span")
    @CacheLookup
    public WebElement reportsOdometerValue;


    @FindBy(xpath = "(//button[@type='button'])[6]")
    @CacheLookup
    public WebElement reportsEngineHours;
    @FindBy(xpath = " (//td[@role='gridcell'])[6]//span")
    @CacheLookup
    public WebElement reportsEngineHoursValue;

    @FindBy(xpath = " (//p[@class='hrt'])[3]")
    @CacheLookup
    public WebElement traceTfuelConsumed;
    @FindBy(xpath = "(//div[@fxlayout='row'])[7]//p")
    @CacheLookup
    public WebElement traceTfuelConsumedValue;

    @FindBy(xpath = "(//button[@type='button'])[4]")
    @CacheLookup
    public WebElement reportsTfuelConsumed;
    @FindBy(xpath = "(//td[@role='gridcell'])[4]/span")
    @CacheLookup
    public WebElement reportsTfuelConsumedValue;



    @FindBy(xpath = " (//p[@class='hrt'])[4]")
    @CacheLookup
    public WebElement traceFuelEfficiency;
    @FindBy(xpath = "((//div[@fxlayout='row'])[7]//p)[3]")
    @CacheLookup
    public WebElement traceFuelEfficiencyValue;

    @FindBy(xpath = "(//button[@type='button'])[5]")
    @CacheLookup
    public WebElement reportsFuelEfficiency;
    @FindBy(xpath = "(//td[@role='gridcell'])[5]//span")
    @CacheLookup
    public WebElement reportsFuelEfficiencyValue;

    //autosuggestion vehicle renge xpaths
    @FindBy(xpath = "//span[@class='mat-option-text']")
    @CacheLookup
    public WebElement suggestionFieldOfVehicleRegNo;
    @FindBy(xpath = "(//span[@class='mat-option-text'])[1]")
    @CacheLookup
    public WebElement suggestionFieldOfVehicleRegNo2;

    //HotspotZone xpath
    @FindBy(xpath = "//a[contains(text(),'Hotspot Zone')]")
    @CacheLookup
    public WebElement hotspotZone;

    @FindBy(xpath = " //span[contains(text(),'Last 7 Days')]")
    @CacheLookup
    public WebElement hotspotLast7Days;

    @FindBy(xpath = "//span[contains(text(),' Yesterday ')]")
    @CacheLookup
    public WebElement HostspotZoneYesterdaybtn;

    @FindBy(xpath = "//span[contains(text(),' Submit ')]")
    @CacheLookup
    public WebElement HostspotZoneSubmitbtn;




    @FindBy(xpath = "(//mat-form-field[@appearance='outline'])[5]")
    @CacheLookup
    public WebElement threshold;

    @FindBy(xpath = "//span[contains(@class,'mat-option-text')]")
    @CacheLookup
    public List<WebElement> roleoptionHotspot;

    @FindBy(xpath = "//span[contains(@class,'mat-option-text')]")
    @CacheLookup
    public List<WebElement> roleoptionHotspot1;//same xpath but name change


    @FindBy(xpath = "(//span[@class='desc ng-star-inserted'])[4]")
    @CacheLookup
    public WebElement stoppageLocationTrace;

    @FindBy(xpath = "(//span[@class='date'])[2]")
    @CacheLookup
    public WebElement stoppagestartendtimeTrace;

    @FindBy(xpath = "(//span[@class='desc ng-star-inserted'])[5]//span")
    @CacheLookup
    public static WebElement stoppageDurationTrace;

    @FindBy(xpath = "//th[@role='columnheader'][4]")
    @CacheLookup
    public WebElement stoppageDurationHotspotZoneText;

    @FindBy(xpath = "//th[@role='columnheader'][5]")
    @CacheLookup
    public WebElement stoppageLocationHotspotZoneText;


    @FindBy(xpath = "//th[@role='columnheader'][2]")
    @CacheLookup
    public WebElement stoppageStartDateAndTimeHotspotZoneText;





    @FindBy(xpath = "//td[starts-with(@class,'mat-cell cdk-cell cdk-column-Duration mat-column-Duration')]")
    @CacheLookup
    public WebElement stoppageDurationHotspotZoneTextValue;

    @FindBy(xpath = "//td[starts-with(@class,'mat-cell cdk-cell cdk-column-Location mat-column-Location')]//span")
    @CacheLookup
    public WebElement stoppageLocationHotspotZoneTextValue;

    @FindBy(xpath = "//td[starts-with(@class,'mat-cell cdk-cell cdk-column-Start-Date---Time mat-column-Start-Date---Time ')]")
    @CacheLookup
    public WebElement stoppageStartDateAndTimeHotspotZoneTextValue;


    @FindBy(xpath = "//div[@class='marginR scroll_view']")
    @CacheLookup
    public WebElement scroll;//same xpath but name change




    //14 to 17 test case xpath
    @FindBy(xpath = "//div[@class='card']//h4")
    @CacheLookup
    public List<WebElement> trackvehicleMovingDataName;

    @FindBy(xpath = "//div[@class='card']//h3")
    @CacheLookup
    public List<WebElement> trackvehicleMovingDataValue;





    public PlayBackAndTraceNewB(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }



    public PlayBackAndTraceNewB selecttrack(){
        CommonUtils.sleep(2);
        utility.iselementVisible(ourServicesBtn);
        Assert.assertTrue(utility.iselementVisible(ourServicesBtn, second10TimeOut), "Our service btn is not displayed ");
        ourServicesBtn.click();
        CommonUtils.sleep(4);
        Assert.assertTrue(utility.iselementVisible(fleetTrack), "fleetTrack field is not Visible");
        LOG.Reporter("Fleet Track track field is visible:" + fleetTrack.getText());
        CommonUtils.sleep(2);
        Assert.assertTrue(iselementVisible(trackFleetTracking, second10TimeOut), "Track not Visible");
        trackFleetTracking.click();
        LOG.Reporter("Clicking on Track");
        return this;
    }

    public PlayBackAndTraceNewB VerifyTrace() {
        CommonUtils.sleep(2);
        utility.iselementVisible(ourServicesBtn);
        Assert.assertTrue(utility.iselementVisible(ourServicesBtn, second10TimeOut), "Our service btn is not displayed : ");
        ourServicesBtn.click();
        LOG.Reporter("click of ourServicesBtn");

        CommonUtils.sleep(1);
        utility.iselementVisible(fleetTrack);
        Assert.assertTrue(utility.iselementVisible(fleetTrack, second10TimeOut), "Fleet tracking field is not displayed : ");
        LOG.Reporter("Fleet tracking field is displayed :" + fleetTrack.getText());

        utility.iselementVisible(trace);
        Assert.assertTrue(iselementVisible(trace, second10TimeOut), "trace btn is not displayed");
        LOG.Reporter("trace btn is displayed: " + trace.getText());
        CommonUtils.sleep(1);
        Assert.assertTrue(trace.isEnabled());

        trace.click();
        LOG.Reporter("click on trace");
        CommonUtils.sleep(1);
        return this;
    }
    public PlayBackAndTraceNewB Verify_Default_View_On_Trace_24_hours() {

        VerifyVehicleRengeDroupDown();

        utility.iselementVisible(defaultViewTrace);
        Assert.assertTrue(utility.iselementVisible(defaultViewTrace, second10TimeOut), "Default view is not displayed");
        LOG.Reporter("Default view is displayed on duration field : " + defaultViewTrace.getText());

        CommonUtils.sleep(2);
        Tsubmit.click();
        LOG.Reporter("click on submit button");

        CommonUtils.sleep(15);
        Assert.assertTrue(utility.iselementVisible(compareAllVehicleNum, second10TimeOut), "vehicle number is not displayed");
        LOG.Reporter("vehicle number is displayed : " + compareAllVehicleNum.getText());

        CommonUtils.sleep(2);
        Assert.assertTrue(utility.iselementVisible(past24startandendText,second10TimeOut),"past 24hours data text value is not displayed");
        LOG.Reporter("24 hours data  filter by: " + past24startandendText.getText());

        CommonUtils.sleep(1);
        Assert.assertTrue(utility.iselementVisible(past24startandend,second10TimeOut),"past 24hours data is not displayed");
        String var2= past24startandend.getText();
        var2 =var2.replace("      ", " --->");
        LOG.Reporter("24 hours data filter by : " +var2);

        utility.iselementVisible(trace_start_end_odometer_value);
        String var3 =trace_start_end_odometer_value.getText();
        var3 =var3.replace("      ", " --->");
        LOG.Reporter("start-end ododmeter value : " + var3);

        return this;
    }
    public PlayBackAndTraceNewB Verify_PastRoute_Data_On_Trace() {
        CommonUtils.sleep(1);
        VerifyTrace();
        Verify_Default_View_On_Trace_24_hours();
        VerifyPastRouteDataOnTraceVehicleDetails();
        return this;
    }
    public PlayBackAndTraceNewB VerifyPastRouteDataOnTraceVehicleDetails() {
        CommonUtils.sleep(1);
        for (int i =0 ; i<past24VehicleText.size(); i++) {
            LOG.Reporter("Vehicle usages Past route data is --> :" + past24VehicleText.get(i).getText());
            for (int j = 0; j <= past24VehicleValue.size(); j++) {
                if (j == i) {
                    LOG.Reporter("Vehicle usages Past route data is --> :" + past24VehicleValue.get(j).getText());
                }
            }
        }

        return this;
    }

    public PlayBackAndTraceNewB VerifyDefaultViewOnTrace() {
        CommonUtils.sleep(1);
        VerifyVehicleRengeDroupDown();
        utility.iselementVisible(defaultViewTrace);
        Assert.assertTrue(utility.iselementVisible(defaultViewTrace, second10TimeOut), "Default view is not displayed");
        LOG.Reporter("Default view is displayed on duration field : " + defaultViewTrace.getText());
        CommonUtils.sleep(1);
        t24.click();
        CommonUtils.sleep(1);
        tracedaterangeB.click();
        CommonUtils.sleep(2);
        DatePickerTrace();
        /*CommonUtils.sleep(1);
        tracedaterengeSubmit.click();*/
        CommonUtils.sleep(2);
        Tsubmit.click();
        LOG.Reporter("click on submit button");
        CommonUtils.sleep(5);
        Assert.assertTrue(utility.iselementVisible(compareAllVehicleNum, second10TimeOut), "vehicle number is not displayed");
        LOG.Reporter("vehicle number is displayed :" + compareAllVehicleNum.getText());
        CommonUtils.sleep(1);
        return this;
    }
    public PlayBackAndTraceNewB VerifyDDDD() {
        CommonUtils.sleep(3);
        VerifyTrace();
        CommonUtils.sleep(1);
        VerifyVehicleRengeDroupDown();
        CommonUtils.sleep(2);
        DatePickerTraceRR();
        Tsubmit.click();
        LOG.Reporter("Click on submit button");
        CommonUtils.sleep(2);

        return this;
    }
    public PlayBackAndTraceNewB selectAnyVehicle(){
        CommonUtils.sleep(2);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", scroll123);
        CommonUtils.sleep(2);
        LOG.Reporter(" Select vehicle Number :--->" + scroll123.getText());
        scroll123.click();
        LOG.Reporter("click on the vehicle");

        return this;

    }
    public PlayBackAndTraceNewB Verify_filter_the_data_time_and_Odometer() {
        VerifyTrace();
        VerifyVehicleRengeDroupDown();

        utility.iselementVisible(filterByDate);
        Assert.assertTrue(utility.iselementVisible(filterByDate, second10TimeOut), "Time field is not displayed");
        LOG.Reporter("filter the data by : " + filterByDate.getText());
        filterByDate.click();

        CommonUtils.sleep(1);
        utility.iselementVisible(filterByOdometer);
        Assert.assertTrue(utility.iselementVisible(filterByOdometer, shortTimeOut), "Odometer field is not displayed");
        LOG.Reporter("filter the data by : " + filterByOdometer.getText());
        filterByOdometer.click();
        LOG.Reporter("click on Odometer btn");

        LOG.Reporter("User is able to filter the data by either time or Odometer.");
        return this;
    }

        public PlayBackAndTraceNewB Verify_start_end_Odometer_Max_Different_5000kms() {

        VerifyTrace();
        CommonUtils.sleep(1);
        VerifyVehicleRengeDroupDown();

        CommonUtils.sleep(1);
        utility.iselementVisible(filterByDate);
        Assert.assertTrue(utility.iselementVisible(filterByDate, second10TimeOut), "Vehicle reg.no field is not displayed");
        filterByDate.click();

        CommonUtils.sleep(2);
        utility.iselementVisible(filterByOdometer);
        filterByOdometer.click();

        CommonUtils.sleep(4);
        utility.iselementVisible(fromKms);
        fromKms.click();
        LOG.Reporter("click on  from(kms) field");

        fromKms.sendKeys(from_kms_value);
        CommonUtils.sleep(3);
        Tsubmit.click();
        LOG.Reporter("Click on submit button");
        CommonUtils.sleep(2);
        utility.iselementVisible(alertmessage);
        Assert.assertTrue(utility.iselementVisible(alertmessage));
        LOG.Reporter("Alert message is :" + alertmessage.getText());

        CommonUtils.sleep(1);
        String verify_alert_message_Actual =alertmessage.getText();
        String verify_alert_message_Expected ="Please select a range less than 5000 Km";

        Assert.assertEquals(verify_alert_message_Actual,verify_alert_message_Expected);
        LOG.Reporter("Maximum difference of Start and end odometer is 5,000 KMs.");

        return this;
    }

   /* public  PlayBackAndTrace traceClickVRangeNumberX(){
        CommonUtils.sleep(2);
        vehicleRegNumber.click();
        LOG.Reporter("click on vehicle reg");
        LOG.Reporter("send partial vehicle value: " + vehiclerengedropdown.size());
        *//*vehicleRegNumber.sendKeys("GJ12BX");
        CommonUtils.sleep(1);
        vehicleRegNumber.sendKeys(keys.ENTER);*//*

        return this;
    }*/
    public PlayBackAndTraceNewB VerifyVehicleRengeDroupDown() {

      /*  for (int i = 0; i <= vehiclerengedropdown.size() - 1; i++) {
            if (vehiclerengedropdown.get(i).getText().contains(" GJ12BY3303 ")){
                vehiclerengedropdown.get(i).sendKeys(Keys.DOWN);
                String veh = vehiclerengedropdown.get(i).getText();
                LOG.Reporter("Selected value is --> : " +veh);

                vehiclerengedropdown.get(i).click();

             break;
            }
        }*/
        CommonUtils.sleep(1);
        utility.iselementVisible(vehicleRegNumber);
        Assert.assertTrue(iselementVisible(vehicleRegNumber,second10TimeOut),"vehicle reg. no. field is not displayed");
        LOG.Reporter("vehicle reg. no. field is displayed");
        vehicleRegNumber.sendKeys("GJ12BX6458");
        CommonUtils.sleep(1);
        suggestionFieldOfVehicleRegNo.click();
        CommonUtils.sleep(1);

        return this;
    }
    public PlayBackAndTraceNewB VerifyLocationAndTimeOnTrace(){
        CommonUtils.sleep(3);
        Assert.assertTrue(utility.iselementVisible(startAddressdetail,second10TimeOut),"Start time Address is not displayed");
        LOG.Reporter("Start time Address  ---> " + startAddressdetail.getText());
        Assert.assertTrue(iselementVisible(startdatedetail));
        String var= startdatedetail.getText();
        var =var.replace("\n", " ,");
        LOG.Reporter("Start vehicle date  ---> " + var);
        Assert.assertTrue(utility.iselementVisible(starttimedetail,second10TimeOut),"Start vehicle time is not displayed");
        String var1= starttimedetail.getText();
        var1 =var1.replace("\n", " ,");
        LOG.Reporter("Start vehicle time ---> " +var1);


        Assert.assertTrue(utility.iselementVisible(endAddressdetail,second10TimeOut),"End time Address is not displayed");
        String var2= starttimedetail.getText();
        var2 =var2.replace("\n", " ,");
        LOG.Reporter("end time Address ---> " +var2);
        /*LOG.Reporter("end time Address ---> " + endAddressdetail.getText());*/
        Assert.assertTrue(iselementVisible(enddatedetail));
        String var3= starttimedetail.getText();
        var3 =var3.replace("\n", " ,");
        LOG.Reporter("End vehicle date ---> " +var3);
        /*LOG.Reporter("End vehicle date ---> " + enddatedetail.getText());*/
        Assert.assertTrue(iselementVisible(enddtimedetail));
        String var4= starttimedetail.getText();
        var4 =var4.replace("\n", " ,");
        LOG.Reporter("End Vehicle Time ---> " +var4);
        /*LOG.Reporter("End Vehicle Time ---> " + enddtimedetail.getText());*/
        return this;
    }

    public PlayBackAndTraceNewB trace24click(){
        CommonUtils.sleep(3);
        utility.iselementVisible(t24,second10TimeOut);
        t24.click();
        LOG.Reporter("click on past 24 hours  ");
        CommonUtils.sleep(2);
        utility.iselementVisible(t24d,second10TimeOut);
        t24d.click();
        LOG.Reporter("click on date range btn");
        return this;
    }
    //DAte picker
    public PlayBackAndTraceNewB DatePickerTrace() {
        /*CommonUtils.sleep(2);
        Assert.assertTrue(utility.iselementVisible(TselectMonth,second10TimeOut),"Month is not displayed");
        *//*LOG.Reporter("Select month is ---> : "  + TselectMonth.getText() );*//*
        TselectMonth.click();
        LOG.Reporter("click on the month");
        CommonUtils.sleep(2);
        Assert.assertTrue(iselementVisible(TclickYear));
        TclickYear.click();
        LOG.Reporter("select on the year" + TclickYear.getText());
        CommonUtils.sleep(2);
        CommonUtils.sleep(3);
        Assert.assertTrue(iselementVisible(TclickMonth));
        TclickMonth.click();
        LOG.Reporter("click on the month");

        *//*  while (!driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[5]")).getText().contains("SEPTEMBER")) {
         *//**//* String monthyear = driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[5]")).getText();*//**//**//**//*
         *//**//**//**//*String arr[] = monthyear.split(" ");
            String mon = arr[0];
            String yr = arr[1];*//**//**//**//*
         *//**//**//**//*if (mon.equalsIgnoreCase(month) && yr.equalsIgnoreCase(year))
                break;
            else*//**//*
            CommonUtils.sleep(1);
            driver.findElement(By.xpath("//button[@aria-label='Previous month']")).click();
            CommonUtils.sleep(2);
        }*//*
        int count = alldates.size();
        for (int i = 0; i < count; i++) {
            if (i == 1) {
                CommonUtils.sleep(2);
                alldates.get(i).click();
                LOG.Reporter("user successful select the date range");
                break;
            }
        }
        CommonUtils.sleep(1);
            TselectMonth.click();
            CommonUtils.sleep(1);
            TclickYear1.click();
            CommonUtils.sleep(1);
            TclickMonth1.click();
        int count1 = alldates1.size();
            for (int j = 0; j < count1; j++) {
                if (j == 5) {
                    CommonUtils.sleep(2);
                    alldates1.get(j).click();
                    break;
                }
            }*/
        CommonUtils.sleep(2);
        Assert.assertTrue(utility.iselementVisible(previoustn,second10TimeOut),"Previous btn is not displayed");
        LOG.Reporter("previous btn is displayed");
        previoustn.click();
        LOG.Reporter("click on previous btn");
        CommonUtils.sleep(2);
        utility.iselementVisible(fst1,second10TimeOut);
        fst1.click();
        CommonUtils.sleep(2);
        utility.iselementVisible(fst6,second10TimeOut);
        fst6.click();
        CommonUtils.sleep(2);
        TraceSubmitBtnDate.click();
        LOG.Reporter("click on submit btn ");
        CommonUtils.sleep(1);
        return this;
        }
    public PlayBackAndTraceNewB DatePickerTraceRR() {
        CommonUtils.sleep(2);
        Assert.assertTrue(utility.iselementVisible(previoustn,second10TimeOut),"Previous btn is not displayed");
        LOG.Reporter("previous btn is displayed");
        previoustn.click();
        LOG.Reporter("click on previous btn");
        CommonUtils.sleep(2);
        utility.iselementVisible(fst1,second10TimeOut);
        fst1.click();
        CommonUtils.sleep(2);
        utility.iselementVisible(fst6,second10TimeOut);
        fst6.click();
        CommonUtils.sleep(2);
        rTsubmit.click();
        LOG.Reporter("click on submit btn ");
        CommonUtils.sleep(2);

        /*Assert.assertTrue(utility.iselementVisible(TselectMonthRR,second10TimeOut),"MonTh is not displayed");
        LOG.Reporter("Select month is ---> : "  + TselectMonthRR.getText() );
        TselectMonthRR.click();
        LOG.Reporter("click on the month");
        CommonUtils.sleep(2);
        Assert.assertTrue(iselementVisible(TclickYearRR));
        TclickYearRR.click();
        LOG.Reporter("click on the year");
        CommonUtils.sleep(2);
        Assert.assertTrue(iselementVisible(TclickMonthRR));
        TclickMonthRR.click();
        LOG.Reporter("click on the month");
        CommonUtils.sleep(2);

        *//*  while (!driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[5]")).getText().contains("SEPTEMBER")) {
         *//**//* String monthyear = driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[5]")).getText();*//**//**//**//*
         *//**//**//**//*String arr[] = monthyear.split(" ");
            String mon = arr[0];
            String yr = arr[1];*//**//**//**//*
         *//**//**//**//*if (mon.equalsIgnoreCase(month) && yr.equalsIgnoreCase(year))
                break;
            else*//**//*
            CommonUtils.sleep(1);
            driver.findElement(By.xpath("//button[@aria-label='Previous month']")).click();
            CommonUtils.sleep(2);
        }*//*
        int count2 = alldates.size();
        LOG.Reporter("date siz  " + count2);
        for (int k = 1; k < count2; k++) {
            String st = alldates.get(k).getText();
            LOG.Reporter("Date text is---> " + st);
            if (k == 1) {
                CommonUtils.sleep(2);
                alldates.get(k).click();
                LOG.Reporter("click on the first date");
                break;
            }
        }
        CommonUtils.sleep(1);
        TselectMonthRR.click();
        CommonUtils.sleep(1);
        TclickYear1RR.click();
        CommonUtils.sleep(1);
        TclickMonth1RR.click();
        int count11 = alldates1.size();
        LOG.Reporter("date size  " + count11);
        for (int l = 1; l < count11; l++) {
            String st11 = alldates1.get(l).getText();
            LOG.Reporter("Date text is st1---> " + st11);
            if (l == 5) {
                CommonUtils.sleep(2);
                alldates1.get(l).click();
                LOG.Reporter("click on the secound date");
                break;
            }
        }*/
        return this;
    }
        public PlayBackAndTraceNewB verifyDefaultMapVehicleTrack () {
            CommonUtils.sleep(2);
            Assert.assertTrue(utility.iselementVisible(defaultmapvehicletrack,second10TimeOut), "Vehicle is not visible on map");
            LOG.Reporter("vehicle is displayed on map ");
            CommonUtils.sleep(2);
            defaultmapvehicletrack.click();
            LOG.Reporter("select vehicle ");
            validate24HourPerformance1(maptrackValuesName, maptrackValues);
            return this;
        }
        public void validate24HourPerformance1 (List < WebElement > ele1, List < WebElement > ele2){
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
    public PlayBackAndTraceNewB verifyPlayBackButtonTrack(){
        CommonUtils.sleep(2);
        Assert.assertTrue(utility.iselementVisible(playbackT,second10TimeOut),"PlackBack btn is not Displayed");
        LOG.Reporter("PlackBack btn is Displayed : " + playbackT.getText());
        playbackT.click();
        LOG.Reporter("click on PlayBack btn");
        CommonUtils.sleep(1);

        return this;
    }
    public PlayBackAndTraceNewB VerifySelectHours(){
        CommonUtils.sleep(2);
        Assert.assertTrue(iselementVisible(radiobtnPT));
        LOG.Reporter("radio btn is displayed :");
        radiobtnPT.click();
        LOG.Reporter("click on the radio btn");
        CommonUtils.sleep(1);
        Assert.assertTrue(iselementVisible(clickHOURS));
        clickHOURS.click();
        CommonUtils.sleep(1);
        int count = selectHOURS.size();
        for(int i = 0; i<count; i++){
            if(i==2){
                selectHOURS.get(i).click();
                CommonUtils.sleep(1);
                break;
            }
        }
        CommonUtils.sleep(1);
        Assert.assertTrue(iselementVisible(clickMINUTES));
        CommonUtils.sleep(1);
        clickMINUTES.click();
        CommonUtils.sleep(1);
        int count1 = selectMINUTES.size();
        for(int i = 0; i<count1; i++){
            if(i==2){
                selectMINUTES.get(i).click();
                CommonUtils.sleep(1);
                break;
            }
        }
        CommonUtils.sleep(2);
        Assert.assertTrue(iselementVisible(clickAMPM));
        clickAMPM.click();
        CommonUtils.sleep(1);
        int count2 = selectAMPM.size();
        for (int i = 0; i < count2; i++) {
            if (i == 1) {
                selectAMPM.get(i).click();
                break;
            }
        }
        CommonUtils.sleep(1);
        Assert.assertTrue(iselementVisible(clickHOURS1));
        clickHOURS1.click();
        CommonUtils.sleep(1);
        int count3 = selectHOURS1.size();
        for (int i = 0; i < count3; i++) {
            if (i == 6) {
                selectHOURS1.get(i).click();
                break;
            }
        }
        CommonUtils.sleep(1);
        Assert.assertTrue(iselementVisible(clickMINUTES1));
        CommonUtils.sleep(1);
        clickMINUTES1.click();
        CommonUtils.sleep(1);
        int count4 = selectMINUTES1.size();
        for(int i = 0; i<count4; i++){
            if(i==4){
                selectMINUTES1.get(i).click();
                break;
            }
        }
        CommonUtils.sleep(1);
        Assert.assertTrue(iselementVisible(clickAMPM1));
        clickAMPM1.click();
        CommonUtils.sleep(1);
        int count5 = selectAMPM1.size();
        for (int i = 0; i < count5; i++) {
            if (i == 1) {
                selectAMPM1.get(i).click();
                CommonUtils.sleep(2);
                TTsubmit.click();
                CommonUtils.sleep(2);

                break;
            }

        }

        return this;
    }
   /* public PlayBackAndTrace VerifySelectMinutes(){
        CommonUtils.sleep(2);
        Assert.assertTrue(iselementVisible(clickMINUTES));
        LOG.Reporter("Minutes filed is displayed");
        CommonUtils.sleep(1);
        clickMINUTES.click();
        LOG.Reporter("click on the minutes field");
        CommonUtils.sleep(1);
        int count = selectMINUTES.size();
        for(int i = 0; i<count; i++){
            if(i==2){
                selectMINUTES.get(i).click();
                LOG.Reporter("select minutes");
                CommonUtils.sleep(1);
                break;
            }
        }
        return this;
    }
    public PlayBackAndTrace VerifySelectAMPM() {
        CommonUtils.sleep(2);
        Assert.assertTrue(iselementVisible(clickAMPM));
        LOG.Reporter("AM/PM filed is displayed");
        clickAMPM.click();
        LOG.Reporter("select am/pm");
        CommonUtils.sleep(2);
        int count = selectAMPM.size();
        for (int i = 0; i < count; i++) {
            if (i == 1) {
                selectAMPM.get(i).click();
                LOG.Reporter("select am/pm");
                CommonUtils.sleep(1);
                break;
            }
        }
        return this;
    }
    public PlayBackAndTrace VerifyselectHours1() {
        CommonUtils.sleep(1);
        Assert.assertTrue(iselementVisible(clickHOURS1));
        LOG.Reporter("hours field is displayed");
        clickHOURS1.click();
        LOG.Reporter("click on the hours field");
        CommonUtils.sleep(2);
        int count = selectHOURS1.size();
        for (int i = 0; i < count; i++) {
            if (i == 6) {
                selectHOURS1.get(i).click();
                LOG.Reporter("click on hours date");
                CommonUtils.sleep(1);
                break;
            }
        }
        return this;
    }
    public PlayBackAndTrace VerifySelectMinutes1(){
        CommonUtils.sleep(2);
        Assert.assertTrue(iselementVisible(clickMINUTES1));
        LOG.Reporter("Minutes filed is displayed");
        CommonUtils.sleep(2);
        clickMINUTES1.click();
        LOG.Reporter("click on the minutes field");
        CommonUtils.sleep(2);
        int count = selectMINUTES1.size();
        for(int i = 0; i<count; i++){
            if(i==4){
                selectMINUTES1.get(i).click();
                LOG.Reporter("select minutes");
                CommonUtils.sleep(1);
                break;
            }
        }
        return this;
    }
    public PlayBackAndTrace VerifySelectAMPM1() {
        CommonUtils.sleep(2);
        Assert.assertTrue(iselementVisible(clickAMPM1));
        LOG.Reporter("AM/PM filed is displayed");
        clickAMPM1.click();
        LOG.Reporter("select am/pm");
        CommonUtils.sleep(2);
        int count = selectAMPM1.size();
        for (int i = 0; i < count; i++) {
            if (i == 1) {
                selectAMPM1.get(i).click();
                LOG.Reporter("click on the am/pm btn ");
                CommonUtils.sleep(1);
                TTsubmit.click();
                CommonUtils.sleep(3);
                break;
            }
        }
        return this;
    }*/
    public PlayBackAndTraceNewB verifyStartAndEndTimeTrack(){
        verifyDefaultMapVehicleTrack();
        verifyPlayBackButtonTrack();
        trace24click().DatePickerTrace();
        CommonUtils.sleep(2);
        Assert.assertTrue(iselementVisible(TTTsubmit));
        LOG.Reporter("Submit btn is displayed");
        CommonUtils.sleep(4);
        TTTsubmit.click();
        LOG.Reporter("click on submit btn");
        CommonUtils.sleep(4);
        for (int i =0 ; i<startend.size(); i++) {
            LOG.Reporter("start/end time and odometer is-->  :" + startend.get(i).getText());
            for (int j = 0; j <= startendTimeDate.size(); j++) {
                if (j == i) {
                    LOG.Reporter("start/end time and odometer is--> :" + startendTimeDate.get(j).getText());
                }
            }
        }
        return this;
    }
    public PlayBackAndTraceNewB VerifyStartAndEndOdometerTrace(){
        CommonUtils.sleep(1);
        VerifyVehicleRengeDroupDown();
        CommonUtils.sleep(1);
        utility.iselementVisible(filterByDate);
        Assert.assertTrue(utility.iselementVisible(filterByDate, second10TimeOut), "date btn is not displayed");
        filterByDate.click();
        LOG.Reporter("click on date btn");
        CommonUtils.sleep(1);
        filterByOdometer.click();
        CommonUtils.sleep(3);
        LOG.Reporter("click on odometer btn");
        CommonUtils.sleep(2);
        fromKms.click();
        fromKms.sendKeys("1,44,000");
        CommonUtils.sleep(2);
        Tsubmit.click();
        CommonUtils.sleep(70);
        Assert.assertTrue(utility.iselementVisible(startODO1,second10TimeOut),"Odometer Start and End text value is not displayed");
        LOG.Reporter("Odometer Start and End text  ---> : " + startODO1.getText());
        CommonUtils.sleep(2);
        Assert.assertTrue(iselementVisible(startODO1));
        LOG.Reporter("Odometer Start&End text value ---> : " + startODO.getText());
        LOG.Reporter("Start Odometer And End Odometer  both values  are same as selected by user ");
        return this;

    }
    public PlayBackAndTraceNewB VerifyPlaybackAccessed(){
        CommonUtils.sleep(5);
        TTTsubmit.click();
        LOG.Reporter("click on the submit button");
        CommonUtils.sleep(5);
        Assert.assertTrue(utility.iselementVisible(playbackimgbtn,second10TimeOut),"PlayBackImgBtn is not enabled");
        LOG.Reporter("PlayBackImgBtn is  enabled :" +playbackimgbtn.isEnabled());
        playbackimgbtn.click();
        CommonUtils.sleep(1);
        return this;

    }
    public PlayBackAndTraceNewB verify_Zooms_the_Map_View(){
        CommonUtils.sleep(1);
        verifyDefaultMapVehicleTrack();
        CommonUtils.sleep(1);
        verifyPlayBackButtonTrack();
        CommonUtils.sleep(1);
        VerifyPlaybackAccessed();
        int i;
        for (i=0; i<2; i++){
            playbackZoomInBtn.click();
        }
        CommonUtils.sleep(2);
        int j;
        for (j=0; j<2; j++){
            playbackZoomOutBtn.click();
        }
        CommonUtils.sleep(3);
        Assert.assertTrue(utility.iselementVisible(playbackimgbtnplay,second10TimeOut)," After Zoom in and Zoom out playback button is not play");
        LOG.Reporter("After Zoom In and Zoom Out playback button is play as expected :" );
        CommonUtils.sleep(1);

        Assert.assertFalse(utility.iselementVisible(playbackimgbtnPause,second10TimeOut)," After Zoom in and Zoom out playback button is  play");
        LOG.Reporter("After Zoom In and Zoom Out playback button is not stop " );
        CommonUtils.sleep(3);
        return this;


    }
    public PlayBackAndTraceNewB VerifyRoutePlayBack(){
        CommonUtils.sleep(5);
        TTTsubmit.click();
        LOG.Reporter("click on submit btn");
        CommonUtils.sleep(10);
        playbackimgbtn.click();
        LOG.Reporter("click on route btn");
        routespeed.click();
        LOG.Reporter("click on route speed btn ");
        CommonUtils.sleep(1);
        //increase the route speed
        increaseroutespeed();
        CommonUtils.sleep(5);
        /*Assert.assertTrue(utility.iselementVisible(routetimeUpdate,second10TimeOut),"route time is not displayed");
        LOG.Reporter("current route time is---> :" + routetimeUpdate.getText());*/
        Assert.assertTrue(utility.iselementVisible(routeLocation,second10TimeOut),"route location is not displayed");
        LOG.Reporter("current location is---> :" + routeLocation.getText());
        CommonUtils.sleep(1);
        Assert.assertTrue(utility.iselementVisible(routeViewLocation,second10TimeOut),"View location btn is not displayed");
        LOG.Reporter("View location btn is  displayed --> : " + routeViewLocation.getText());
        routeViewLocation.click();
        LOG.Reporter("click on view location button");
        CommonUtils.sleep(2);
        Assert.assertTrue(utility.iselementVisible(routeLocationAddress,second10TimeOut),"route location is not displayed");
        LOG.Reporter("current location Address is---> :" + routeLocationAddress.getText());
        CommonUtils.sleep(1);
        RouteDetails(); //loop
        CommonUtils.sleep(2);
        /*((JavascriptExecutor) driver).executeScript("document.style.zoom='300%'", routeMap);
        CommonUtils.sleep(4);*/

        return this;
    }
    public PlayBackAndTraceNewB increaseroutespeed(){
        CommonUtils.sleep(1);
        int count = routespeedIncrease.size();
        for(int i=0; i<count; i++)
            if(i==3){
                routespeedIncrease.get(i).click();
                LOG.Reporter("increase the speed : " + routespeedIncrease.get(i).getText());
            }
        return this;
    }
       public PlayBackAndTraceNewB RouteDetails(){
        CommonUtils.sleep(1);
        int count = routeFO1.size();
        LOG.Reporter("elements size  : " + count);
           for(int i=0; i<count; i++) {
               LOG.Reporter("current vehicle usages--> : " + routeFO1.get(i).getText());
               CommonUtils.sleep(1);
           }
           return this;
       }
       public PlayBackAndTraceNewB VerifyZoomTheMapViewPlayback(){
        CommonUtils.sleep(2);
        trace24click();
        CommonUtils.sleep(2);
        DatePickerTrace();
        CommonUtils.sleep(2);
        VerifySelectHours();
        /*CommonUtils.sleep(1);
        VerifySelectMinutes();
        CommonUtils.sleep(1);
        VerifySelectAMPM();
        CommonUtils.sleep(1);
        VerifyselectHours1();
        CommonUtils.sleep(1);
        VerifySelectMinutes1();
        CommonUtils.sleep(1);
        VerifySelectAMPM1();*/
        CommonUtils.sleep(2);
        VerifyRoutePlayBack();
        CommonUtils.sleep(2);
        Assert.assertTrue(utility.iselementVisible(routeMapCustmize,second10TimeOut),"Customize button is not displayed");
        LOG.Reporter("Customize button is displayed on map ");
        routeMapCustmize.click();
        LOG.Reporter("click on customized button");
        CommonUtils.sleep(2);
        Assert.assertTrue(utility.iselementVisible(playbackimgbtnPause,second10TimeOut),"playback button is not pause");
        LOG.Reporter("playback button is pause " );
        CommonUtils.sleep(2);
        playbackimgbtnPause.click();
        CommonUtils.sleep(3);
        Assert.assertFalse(utility.iselementVisible(playbackimgbtnplay,second10TimeOut),"playback button is  pause");
        LOG.Reporter("playback button is not pause ");
        CommonUtils.sleep(2);
        customizemapVehicleDetails();
        LOG.Reporter("and second way to verify given btn is play/pause If below " +
                "values are --- time stamp and odometer is null then given route playback is pause" +
                   "otherwise play");
           return  this;
       }
       public PlayBackAndTraceNewB customizemapVehicleDetails(){
        CommonUtils.sleep(3);
           for (int i =0 ; i<routeMapCustmizeUpperDetails.size(); i++){
               LOG.Reporter("details is ---> :" + routeMapCustmizeUpperDetails.get(i).getText());
               for(int j=0; j<=routeMapCustmizeLowerDetails.size(); j++){
                   if(j==i){
                       LOG.Reporter("Details is --> :" +routeMapCustmizeLowerDetails.get(j).getText());
                   }
               }
           }
           return this;
       }

       public PlayBackAndTraceNewB VerifyFleetMonitoringReportsData(){
        CommonUtils.sleep(2);
        Assert.assertTrue(iselementVisible(reportSummaryToday));
        LOG.Reporter("click on the dropdown");
        reportSummaryToday.click();
        DatePickerTrace(); //select date range
           return this;

       }

    public PlayBackAndTraceNewB VerifyFleetMR() {
        CommonUtils.sleep(2);
        Assert.assertTrue(utility.iselementVisible(ourServicesBtn, 30), "fleet Monitoring btn is not Displayed");
        LOG.Reporter("Fleet monitoring btn is Displayed :" );
        ourServicesBtn.click();
        LOG.Reporter("click on our services btn");
        Assert.assertTrue(utility.iselementVisible(fleetMonitoring, 30), "fleet Monitoring btn is not Displayed");
        LOG.Reporter("Fleet monitoring btn is Displayed :" + fleetMonitoring.getText());
        CommonUtils.sleep(3);
        Assert.assertTrue(utility.iselementVisible(Reports, 30), "Reports button is not Displayed");
        Reports.click();
        LOG.Reporter("click on the Reports btn ");
        return this;
    }

    public PlayBackAndTraceNewB selectVehicleSummary(){
        CommonUtils.sleep(1);
        VerifyFleetMR();
        CommonUtils.sleep(1);
        Assert.assertTrue(iselementVisible(vehiclesummary));
        vehiclesummary.click();
        LOG.Reporter("Click On Vehicle Summary btn");
        return this;
    }
    public PlayBackAndTraceNewB selectCustomParameter(){
        CommonUtils.sleep(1);
        VerifyFleetMR();
        CommonUtils.sleep(1);
        Assert.assertTrue(iselementVisible(reportsCustomPara));
        reportsCustomPara.click();
        LOG.Reporter("click on the custom parameter option");
        return this;
    }
       public PlayBackAndTraceNewB ReportsChooseVehicle(){
        CommonUtils.sleep(1);
        Assert.assertTrue(iselementVisible(reportSummarySFA));
        reportSummarySFA.click();
        LOG.Reporter("click on the all vehicle btn");
        CommonUtils.sleep(2);
        RoleOptionLoopUse();
        /*CommonUtils.sleep(2);
        reportsVehiclerenge.click();*/
        CommonUtils.sleep(1);
        reportsVehiclerenge.sendKeys("GJ12BX6458");
        CommonUtils.sleep(2);
        suggestionFieldOfVehicleRegNo2.click();
        CommonUtils.sleep(2);
        filterByDate.click();
        LOG.Reporter("click on date field");
        filterByOdometer.click();
        LOG.Reporter("click on odometer tn");
        CommonUtils.sleep(3);
        VehicleSummaryFromkms.click();
        LOG.Reporter("click on from kms field");
        VehicleSummaryFromkms.sendKeys("153417");
        CommonUtils.sleep(3);
        VehicleSummaryTokms.click();
        VehicleSummaryTokms.sendKeys("154301");

        /*reportSummaryToday.click();
        LOG.Reporter("click on duration dropdown");
        reportssummaryDaterange();
        DatePickerTraceRR();
        CommonUtils.sleep(2);*/
        T4submit.click();
        LOG.Reporter("click on submit btn");
        CommonUtils.sleep(4);
        return this;
       }
       public PlayBackAndTraceNewB VerifyDTTandDTR() {
        CommonUtils.sleep(2);
        VerifyTrace();
        CommonUtils.sleep(2);
        VerifyDefaultViewOnTrace();
        CommonUtils.sleep(5);
        Assert.assertTrue(iselementVisible(traceDistanceTravel));
        LOG.Reporter("trace Distance Travel --> : " + traceDistanceTravel.getText());
        CommonUtils.sleep(2);
        Assert.assertTrue(iselementVisible(traceDistanceTravelValue));
        LOG.Reporter("trace Distance Travel Value --> :" + traceDistanceTravelValue.getText());

        String TraceValue = traceDistanceTravelValue.getText();
        /*String TvalueU = TraceValue.replace(" Km","");*/

        String[] result = TraceValue.split("\\ Km");
        String Dt=result[0];
        LOG.Reporter("result = " + Dt);
        selectVehicleSummary();
        CommonUtils.sleep(2);
        ReportsChooseVehicle();
        CommonUtils.sleep(5);
        Assert.assertTrue(iselementVisible(reportsDistanceTravel));
        LOG.Reporter("reports Distance Travel --> : " + reportsDistanceTravel.getText());
        CommonUtils.sleep(2);
        Assert.assertTrue(iselementVisible(reportsDistanceTravelValue));
        LOG.Reporter("reports Distance Travel Value --> :" + reportsDistanceTravelValue.getText());
        String Rvalue = reportsDistanceTravelValue.getText();
        Assert.assertEquals(Dt,Rvalue);
        LOG.Reporter("Value of Distance travelled on Trace module" +  ": = :"  + "Value of" +
                " Odometer on Vehicle Summary in Reports");
          /* CommonUtils.sleep(2);
           selectAnyVehicle();
           CommonUtils.sleep(1);
           VerifyFilterStartEndWithDurationT();
           CommonUtils.sleep(1);
           trace24click();
           CommonUtils.sleep(1);
           DatePickerTrace();
           CommonUtils.sleep(1);
           submitbtnInnerAndOuterDaterenge();
           CommonUtils.sleep(3);
           Assert.assertTrue(iselementVisible(traceDistanceTravel));
           LOG.Reporter("trace Distance Travel --> : " + traceDistanceTravel.getText());
           CommonUtils.sleep(3);
           Assert.assertTrue(iselementVisible(traceDistanceTravelValue));
           LOG.Reporter("trace Distance Travel Value --> :" + traceDistanceTravelValue.getText());
           String TraceValue = traceDistanceTravelValue.getText();
           String TvalueU = TraceValue.replace(" Km", "");
           CommonUtils.sleep(2);
           selectVehicleSummary();
           CommonUtils.sleep(2);
           ReportsChooseVehicle();
           CommonUtils.sleep(2);

           Assert.assertTrue(iselementVisible(reportsDistanceTravel));
           LOG.Reporter("reports Distance Travel --> : " + reportsDistanceTravel.getText());
           Assert.assertTrue(iselementVisible(reportsDistanceTravelValue));
           LOG.Reporter("reports Distance Travel Value --> :" + reportsDistanceTravelValue.getText());
           String Rvalue = reportsDistanceTravelValue.getText();
           if (TvalueU == Rvalue){
               Assert.assertEquals(TvalueU, Rvalue);
               LOG.Reporter("Value of Distance travelled on Trace module"
                       + "=" + "Value of" +
                   " Odometer on Vehicle Summary in Reports");
           }
           else
           {
               LOG.Reporter("Value of Distance travelled on Trace module " + " "
                       + " " + "is not equal to " +"Value of" +
                       " Odometer on Vehicle Summary in Reports");

               }*/
        return this;

       }
       public PlayBackAndTraceNewB submitbtnInnerAndOuterDaterenge(){
        CommonUtils.sleep(1);
           scroll123Submit.click();
           CommonUtils.sleep(2);
           TTTsubmit.click();
           return this;
       }
    public PlayBackAndTraceNewB VerifyIgnitionTraceEngineHoursReports () {
        CommonUtils.sleep(2);
        VerifyTrace();
        CommonUtils.sleep(2);
        VerifyDefaultViewOnTrace();
        CommonUtils.sleep(2);
        Assert.assertTrue(iselementVisible(traceIgnitionTime));
        LOG.Reporter("trace Ignition Time --> : " + traceIgnitionTime.getText());
        Assert.assertTrue(iselementVisible(traceIgnitionTimeValue));
        LOG.Reporter("trace Ignition Time Value --> :" + traceIgnitionTimeValue.getText());

        String TvalueIg = traceIgnitionTimeValue.getText();
        /*String TvalueIgU = TvalueIg.replace("Hrs : 18 Min", "");*/
        String abh = TvalueIg;
        String[] result = abh.split("\\ Hrs");
        String ig=result[0];
        LOG.Reporter("result = " + ig);
        CommonUtils.sleep(1);
        selectVehicleSummary();
        CommonUtils.sleep(2);
        ReportsChooseVehicle();
        CommonUtils.sleep(5);
        Assert.assertTrue(iselementVisible(reportsEngineHours));
        LOG.Reporter("reports Engine Hours --> : " +reportsEngineHours.getText());
        Assert.assertTrue(iselementVisible(reportsEngineHoursValue));
        CommonUtils.sleep(2);
        LOG.Reporter("reports Engine Hours Value --> :" + reportsEngineHoursValue.getText());

        String ReportsvalueEh =reportsEngineHoursValue.getText();
        /*String RvalueEh1 = ReportsvalueEh.replace(".3", "");*/
        String abh1 = ReportsvalueEh;
        String[] result1 = abh1.split("\\.");
        String re=result1[0];
        LOG.Reporter("result = " + re);
        Assert.assertEquals(ig,re);
        LOG.Reporter("Value of Ignition Time on Trace module : = : Value of Total Engine Hours");
        return this;
    }
    public PlayBackAndTraceNewB verifyTotalFuelConsumedTraceTotalFuelConsumedReports(){
        CommonUtils.sleep(2);
        VerifyTrace();
        CommonUtils.sleep(2);
        VerifyDefaultViewOnTrace();
        CommonUtils.sleep(2);
        Assert.assertTrue(iselementVisible(traceTfuelConsumed));
        LOG.Reporter("trace Trace fuel Consumed --> : " + traceTfuelConsumed.getText());
        Assert.assertTrue(iselementVisible(traceTfuelConsumedValue));
        LOG.Reporter("trace Trace fuel Consumed Value --> :" + traceTfuelConsumedValue.getText());

        String TraceTFC = traceTfuelConsumedValue.getText();
        /*String TraceTFCu = TraceTFC.replace(".9 L", "");*/
        /*String abh1 = TraceTFC;
        String[] result1 = abh1.split("\\.");
        String tf=result1[0];
        LOG.Reporter("result = " + tf);*/
        String s=TraceTFC.substring(0,TraceTFC.length()-2);
        float result = Float.parseFloat(s);
        int data =Math.round(result);
        String tf= ""+data;
        LOG.Reporter("result = " +tf);

        CommonUtils.sleep(1);
        selectVehicleSummary();
        CommonUtils.sleep(2);
        ReportsChooseVehicle();
        CommonUtils.sleep(5);
        Assert.assertTrue(iselementVisible(reportsTfuelConsumed));
        LOG.Reporter("reports Trace fuel Consumed --> : " + reportsTfuelConsumed.getText());
        CommonUtils.sleep(2);
        Assert.assertTrue(iselementVisible(reportsTfuelConsumedValue));
        LOG.Reporter("reports Trace fuel Consumed Value --> :" + reportsTfuelConsumedValue.getText());

        String ReportsTFC = reportsTfuelConsumedValue.getText();
        /*String RvalueTFCu = ReportsTFC.replace(".1", "");*/
        /*String abh = ReportsTFC;
        String[] result1 = abh.split("\\.");
        String rf=result1[0];
        LOG.Reporter("result = " + rf);*/
        String s1=ReportsTFC;
        float result1 = Float.parseFloat(s1);
        int data1 =Math.round(result1);
        String rf= ""+data1;
        LOG.Reporter("result = " + rf);

        Assert.assertEquals(tf,rf);
        LOG.Reporter(" Total Fuel Consumed on Trace module = Value of Total " + "Fuel Consumed on Vehicle Summary in Reports");

        /*f(TraceTFCu == RvalueTFCu) {
            Assert.assertEquals(TraceTFCu, RvalueTFCu);
            LOG.Reporter(" Total Fuel Consumed on Trace module = Value of Total " + "Fuel Consumed on Vehicle Summary in Reports");
        }
        else
        {
            LOG.Reporter("Total Fuel Consumed on Trace module  is not equal to Value of" +
                    " Total Fuel Consumed on Vehicle Summary in Reports");
        }*/
        return this;
    }
    public PlayBackAndTraceNewB verifyFuelEfficiencyTraceFuelEfficiencyReports(){
        CommonUtils.sleep(2);
        VerifyTrace();
        CommonUtils.sleep(2);
        VerifyDefaultViewOnTrace();
        CommonUtils.sleep(5);
        Assert.assertTrue(iselementVisible(traceFuelEfficiency));
        LOG.Reporter("trace Fuel Efficiency --> : " + traceFuelEfficiency.getText());
        CommonUtils.sleep(2);
        Assert.assertTrue(iselementVisible(traceFuelEfficiencyValue));
        LOG.Reporter("traceFuelEfficiency Value --> :" + traceFuelEfficiencyValue.getText());

        String TraceFEfficiency = traceFuelEfficiencyValue.getText();
        /*String TraceFEfficiencyu = TraceFEfficiency.replace(".2 Km/L", "");*/
        /*String abh = TraceFEfficiency;
        String[] result = abh.split("\\.");
        String fe=result[0];
        LOG.Reporter("result = " + fe);*/
        String s=TraceFEfficiency.substring(0,TraceFEfficiency.length()-5);
        float result = Float.parseFloat(s);
        int data =Math.round(result);
        String fe= ""+data;
        LOG.Reporter("result = " +fe);

        CommonUtils.sleep(1);
        selectVehicleSummary();
        CommonUtils.sleep(2);
        ReportsChooseVehicle();
        CommonUtils.sleep(5);
        Assert.assertTrue(iselementVisible(reportsFuelEfficiency));
        LOG.Reporter("reports Fuel Efficiency --> : " + reportsFuelEfficiency.getText());
        CommonUtils.sleep(3);
        Assert.assertTrue(iselementVisible(reportsFuelEfficiencyValue));
        LOG.Reporter("reports Fuel Efficiency Value --> :" + reportsFuelEfficiencyValue.getText());

        String ReportsFEfficiency = reportsFuelEfficiencyValue.getText();
        /*String RvalueFEfficiencyu = ReportsFEfficiency.replace(".91", "");*/
        /*String abh1 = ReportsFEfficiency;
        String[] result1 = abh1.split("\\.");
        String rfe=result1[0];
        LOG.Reporter("result = " + rfe);*/
        String s1=ReportsFEfficiency;
        float result1 = Float.parseFloat(s1);
        int data1 =Math.round(result1);
        String rfe= ""+data1;
        LOG.Reporter("result = " + rfe);
        Assert.assertEquals(fe, rfe);
        LOG.Reporter(" Fuel Efficiency on Trace module = Value of Fuel Efficiency " +
                "on Vehicle Summary in Reports");
        return this;
    }

    public PlayBackAndTraceNewB verifyAverageSpeedTraceOdometerCustomParaReports(){
        CommonUtils.sleep(1);
        VerifyTrace();
        CommonUtils.sleep(1);
        VerifyDefaultViewOnTrace();
        CommonUtils.sleep(2);
        Assert.assertTrue(iselementVisible(traceAverageSpeed));
        LOG.Reporter("trace Fuel Efficiency --> : " + traceAverageSpeed.getText());
        Assert.assertTrue(iselementVisible(traceAverageSpeedValue));
        LOG.Reporter("traceFuelEfficiency Value --> :" + traceAverageSpeedValue.getText());

        String TraceFEfficiency = traceAverageSpeedValue.getText();
        String TraceFEfficiencyu = TraceFEfficiency.replace(".27 Km/Hr", "");


        CommonUtils.sleep(1);
        selectCustomParameter();
        CommonUtils.sleep(1);
        ReportsChooseVehicle();
        CommonUtils.sleep(2);

        //odometer value is not displaying

        /*Assert.assertTrue(iselementVisible(reportsFuelEfficiency));
        LOG.Reporter("reports Fuel Efficiency --> : " + reportsFuelEfficiency.getText());
        Assert.assertTrue(iselementVisible(reportsFuelEfficiencyValue));
        LOG.Reporter("reports Fuel Efficiency Value --> :" + reportsFuelEfficiencyValue.getText());

        String ReportsFEfficiency = reportsFuelEfficiencyValue.getText();
        String RvalueFEfficiencyu = ReportsFEfficiency.replace(".45", "");

        Assert.assertEquals(TraceFEfficiencyu, RvalueFEfficiencyu);
        LOG.Reporter(" Fuel Efficiency on Trace module = Value of Fuel Efficiency " +
                "on Vehicle Summary in Reports");*/
        return this;
    }
    public PlayBackAndTraceNewB reportssummaryDaterange(){
        CommonUtils.sleep(2);
        int count = reportSummarydaterange.size();
        for(int i = 0; i<count; i++){
            if(i==5){
                LOG.Reporter("click on the vehicle model--> :" + reportSummarydaterange.get(i).getText());
                reportSummarydaterange.get(i).click();
            }
        }
        return this;
    }
       public PlayBackAndTraceNewB RoleOptionLoopUse(){
        CommonUtils.sleep(1);
        int count = reportSummarySFAFilter.size();
        for(int i = 0; i<count; i++){
            if(i==4){
                LOG.Reporter("click on the vehicle model--> :" + reportSummarySFAFilter.get(i).getText());
                reportSummarySFAFilter.get(i).click();
            }
        }
        return this;

       }
    public PlayBackAndTraceNewB VerifyFleetHotspotZone() {
        CommonUtils.sleep(3);
        ourServicesBtn.click();
        LOG.Reporter("click on our services btn");
        CommonUtils.sleep(3);
        Assert.assertTrue(utility.iselementVisible(hotspotZone, 30), "hotspot" +
                " button is not Displayed");
        hotspotZone.click();
        LOG.Reporter("hotspot btn is Displayed");
        return this;
    }
    public PlayBackAndTraceNewB HotspotZoneChooseVehicle(){
        CommonUtils.sleep(1);
        VerifyFleetHotspotZone();
        CommonUtils.sleep(1);
        Assert.assertTrue(iselementVisible(reportSummarySFA));
        reportSummarySFA.click();
        LOG.Reporter("click on vehicle btn");
        CommonUtils.sleep(2);
        RoleOptionLoopUse();
        CommonUtils.sleep(1);
        reportsVehiclerenge.sendKeys("GJ12BX6458");
        CommonUtils.sleep(2);
        suggestionFieldOfVehicleRegNo2.click();
        LOG.Reporter("click on dropdown option");
        CommonUtils.sleep(2);
        hotspotLast7Days.click();
        LOG.Reporter("click on duration dropdown");
        CommonUtils.sleep(2);
        HotspotZoneDateRange();
        stoppageSelectDatePicker();
        /*CommonUtils.sleep(2);
        DatePickerTraceRR();*/
        CommonUtils.sleep(2);
        threshold.click();
        LOG.Reporter("click on threshold btn ");
        RoleOptionHotspotZone();
        CommonUtils.sleep(2);
        T4submit.click();
        LOG.Reporter("click on submit btn");
        return this;
    }
    /*public PlayBackAndTraceNewB VerifyStoppageLocationHotspotModule(){
        CommonUtils.sleep(2);
        VerifyTrace();
        CommonUtils.sleep(2);
        VerifyDefaultViewOnTrace();
        CommonUtils.sleep(2);
        Assert.assertTrue(iselementVisible(stoppageLocationTrace));
        LOG.Reporter("stoppage Location Trace  --> : " + stoppageLocationTrace.getText());
        Assert.assertTrue(iselementVisible(stoppageDurationTrace));
        LOG.Reporter("trace stoppage Duration --> :" + stoppageDurationTrace.getText());

        String TraceDuration = stoppageDurationTrace.getText();
        String TraceLocation = stoppageLocationTrace.getText();

        CommonUtils.sleep(2);
        HotspotZoneChooseVehicle();
        CommonUtils.sleep(2);

        //reason vehicle data is not showing hotspot module as compare to other

        Assert.assertTrue(iselementVisible(stoppageDurationHotspotZone));
        LOG.Reporter("stoppage Duration HotspotZone --> : " + stoppageDurationHotspotZone.getText());
        Assert.assertTrue(iselementVisible(stoppageLocationHotspotZone));
        LOG.Reporter("stoppage Location HotspotZone --> :" + stoppageLocationHotspotZone.getText());

        String HotspotZoneDuration = stoppageDurationHotspotZone.getText();
        String HotspotZoneLocation = stoppageLocationHotspotZone.getText();

        Assert.assertEquals(HotspotZoneLocation, TraceLocation);
        LOG.Reporter(" Stoppage Location specified in Trace = Stoppage Location specified in" +
                " Stoppage category in Hotspot module");

        Assert.assertEquals(HotspotZoneDuration, TraceDuration);
        LOG.Reporter(" Stoppage Duration specified in Trace = Stoppage Duration specified in" +
                " Stoppage category in Hotspot module");

        return this;
    }*/


    public PlayBackAndTraceNewB RoleOptionHotspotZone(){
        CommonUtils.sleep(1);
        for(int j = 0; j<roleoptionHotspot1.size(); j++){
            if(j==0){
                LOG.Reporter("select threshold--> :" + roleoptionHotspot1.get(j).getText());
                roleoptionHotspot1.get(j).click();
            }
        }
        return this;
    }
    public PlayBackAndTraceNewB HotspotZoneDateRange(){
        CommonUtils.sleep(1);
        int count = roleoptionHotspot.size();
        for(int i = 0; i<count; i++){
            if(i==4){
                LOG.Reporter("select threshold--> :" + roleoptionHotspot.get(i).getText());
                roleoptionHotspot.get(i).click();
            }
        }
        return this;
    }
    public PlayBackAndTraceNewB TrackDurationTimeVisible(){
        CommonUtils.sleep(1);
        for (int i =0 ; i<trackvehicleMovingDataName.size(); i++){
            LOG.Reporter("Details is ---> :" + trackvehicleMovingDataName.get(i).getText());
            for(int j=0; j<=trackvehicleMovingDataValue.size(); j++){
                if(j==i){
                    LOG.Reporter("Details is --> :" +trackvehicleMovingDataValue.get(j).getText());
                }
            }
        }
        return this;
    }
    public PlayBackAndTraceNewB verifyVehicleTravelDataOnMD(){
        CommonUtils.sleep(1);
        selectAnyVehicle();
        CommonUtils.sleep(1);
        verifyPlayBackButtonTrack();
        CommonUtils.sleep(1);
        trace24click();
        CommonUtils.sleep(1);
        DatePickerTrace();
        CommonUtils.sleep(2);
        submitbtnInnerAndOuterDaterenge();
        CommonUtils.sleep(2);
        TrackDurationTimeVisible();
        LOG.Reporter("vehicle travel value on moving duration is displayed");
        return this;
    }

    public PlayBackAndTraceNewB VerifyStoppageLocationHotspotAndTraceModule(){
        CommonUtils.sleep(2);
        HotspotZoneChooseVehicle();
        //Duration text
        CommonUtils.sleep(3);
        utility.iselementVisible(stoppageDurationHotspotZoneText);
        LOG.Reporter("stoppage duration is :" + stoppageDurationHotspotZoneText.getText());
        //duration text value
        utility.iselementVisible(stoppageDurationHotspotZoneTextValue);
        LOG.Reporter("stoppage duration Value is :" + stoppageDurationHotspotZoneTextValue.getText());


        CommonUtils.sleep(1);
        utility.iselementVisible(stoppageLocationHotspotZoneText);
        LOG.Reporter("stoppage location is :" + stoppageLocationHotspotZoneText.getText());

        //location text value
        utility.iselementVisible(stoppageLocationHotspotZoneTextValue);
        LOG.Reporter("stoppage location Value is :" + stoppageLocationHotspotZoneTextValue.getText());


        CommonUtils.sleep(1);
        utility.iselementVisible(stoppageStartDateAndTimeHotspotZoneText);
        LOG.Reporter("stoppage start-end time is :" + stoppageStartDateAndTimeHotspotZoneText.getText());

        //start date and time  text value
        CommonUtils.sleep(1);
        utility.iselementVisible(stoppageStartDateAndTimeHotspotZoneTextValue);
        LOG.Reporter("stoppage start-end time is :" + stoppageStartDateAndTimeHotspotZoneTextValue.getText());

        String StoppageStartdatetime = stoppageStartDateAndTimeHotspotZoneTextValue.getText();
        int z2 = StoppageStartdatetime.indexOf(" ");
        String sub =StoppageStartdatetime.substring(0,3);
        String sub1 =StoppageStartdatetime.substring(0,z2);
        String compare_start_end_time_Hotspotzone = StoppageStartdatetime.replace("\n", "").replace("At", "").replace(sub1, sub);

        String location_hotspot_zone= stoppageLocationHotspotZoneTextValue.getText();
        int commaIndex = location_hotspot_zone.indexOf(",");
        String compare_location =location_hotspot_zone.substring(0, commaIndex);
        LOG.Reporter("vehicle current location is : " +compare_location);

        String StoppageDuration = stoppageDurationHotspotZoneTextValue.getText();
        int duration = Integer.parseInt(StoppageDuration);

        VerifyTrace();
        traceSelectDatePicker();

        CommonUtils.sleep(4);
        utility.iselementVisible(stoppageDurationTrace);
        LOG.Reporter("stoppage duration is :" + stoppageDurationTrace.getText());

        CommonUtils.sleep(4);
        utility.iselementVisible(stoppageLocationTrace);
        LOG.Reporter("stoppage Location is :" + stoppageLocationTrace.getText());

        String stoppage_Location_Trace = stoppageLocationTrace.getText();

        CommonUtils.sleep(4);
        utility.iselementVisible(stoppagestartendtimeTrace);
        String stoppage_start_end_time_Trace = stoppagestartendtimeTrace.getText();
        stoppage_start_end_time_Trace = stoppage_start_end_time_Trace.replace("\n", "").replace("At", "");
        LOG.Reporter("stoppage start-end time is :" + stoppagestartendtimeTrace.getText());

        String string =stoppageDurationTrace.getText();
        int minutes = 0;
        int hours = 0;
        int value=0;
        String[] newString = string.split(" ");
        for (int i = 0; i < newString.length; i++) {
            if (newString[i].equals("Minutes")) {
                if (i > 0) {
                    minutes = Integer.parseInt(newString[i-1]);
                }
            } else if (newString[i].equals("Hours")) {
                if (i > 0) {
                    hours = Integer.parseInt(newString[i-1]);
                }
            }
        }

        if (minutes != 0 && hours != 0) {
            value= checkValue(minutes + (hours * 60),duration);
        } else if (minutes != 0) {
            value=checkValue(minutes,duration);
        } else if (hours != 0) {
            value=checkValue(hours * 60,duration);
        } else {
            System.out.println("Invalid time format");
        }
        Assert.assertEquals(duration,value);
        LOG.Reporter("Stoppage duration specified in Trace =" +
                " Stoppage Duration specified in Stoppage category in Hotspot module");

        Assert.assertEquals(compare_location,stoppage_Location_Trace);

        LOG.Reporter("Stoppage location specified in Trace =" +
                " Stoppage location specified in Stoppage category in Hotspot module");


        Assert.assertEquals(compare_start_end_time_Hotspotzone,stoppage_start_end_time_Trace);

        LOG.Reporter("Stoppage  time specified in Trace =" +
                " Stoppage time specified in Stoppage category in Hotspot module");

        return this;
    }
    public static int checkValue(int x,int y) {
        if(x==y) {

            return x ;
        }
        int i=0;
        int j=1;
        while(i<2) {
            if(x-j== y) {
                System.out.print("right");
                return y;
            }
            if(x+j== y) {
                System.out.print("right");
                return y;
            }
            i++;
            j++;
        }
        System.out.print("fail");
        return x;
    }

    public PlayBackAndTraceNewB stoppageSelectDatePicker() {
        CommonUtils.sleep(2);
        Assert.assertTrue(utility.iselementVisible(previoustn, second10TimeOut), "Previous btn is not displayed");
        LOG.Reporter("previous btn is displayed");
        /*previoustn.click();*/
        LOG.Reporter("click on previous btn");
        CommonUtils.sleep(2);
        utility.iselementVisible(fst1, second10TimeOut);
        fst1.click();
        CommonUtils.sleep(4);
        /*CommonUtils.sleep(2);
        utility.iselementVisible(fst1, second10TimeOut);*/
        fst11.click();
        CommonUtils.sleep(2);
        rTsubmit.click();
        LOG.Reporter("click on submit btn ");
        CommonUtils.sleep(2);
        return this;
    }
    public PlayBackAndTraceNewB traceSelectDatePicker() {
        CommonUtils.sleep(2);
        VerifyVehicleRengeDroupDown();
        t24.click();
        CommonUtils.sleep(2);
        tracedaterangeB.click();
        CommonUtils.sleep(4);
        /*Assert.assertTrue(utility.iselementVisible(previoustnCopy, second10TimeOut), "Previous btn is not displayed");
        LOG.Reporter("previous btn is displayed");
        previoustnCopy.click();*/
        LOG.Reporter("click on previous btn");
        CommonUtils.sleep(2);
        utility.iselementVisible(fst1, second10TimeOut);
        fst1Copy.click();
        CommonUtils.sleep(4);
        /*CommonUtils.sleep(2);
        utility.iselementVisible(fst1, second10TimeOut);*/
        fst11Copy.click();
        CommonUtils.sleep(2);
        rTsubmitCopy.click();
        LOG.Reporter("click on submit btn ");
        CommonUtils.sleep(2);
        Tsubmit.click();
        return this;
    }

    public PlayBackAndTraceNewB verify_Filter_The_Data_Basic_Time() {
        CommonUtils.sleep(2);
        utility.iselementVisible(track_map_click_on_default_vehicle_btn);
        track_map_click_on_default_vehicle_btn.click();
        LOG.Reporter("click on individual vehicle on map");

        verifyPlayBackButtonTrack();

        utility.iselementVisible(track_click_on_dropdown_arrow_btn);
        track_click_on_dropdown_arrow_btn.click();
        LOG.Reporter("click on track_click_on_dropdown_arrow_btn btn ");

        CommonUtils.sleep(1);
        utility.iselementVisible(track_past_24_hours);
        Assert.assertTrue(iselementVisible(track_past_24_hours,second10TimeOut),"Past 24 Hours field is not visible");
        LOG.Reporter("track_past_24_hours field is visible " +track_past_24_hours.getText());

        CommonUtils.sleep(1);
        utility.iselementVisible(track_Last_7_Days);
        Assert.assertTrue(iselementVisible(track_Last_7_Days,second10TimeOut),"Last_7_Days field is not visible");
        LOG.Reporter("Last_7_Days field is visible " +track_Last_7_Days.getText());

        CommonUtils.sleep(1);
        utility.iselementVisible(track_Last_10_Days);
        Assert.assertTrue(iselementVisible(track_Last_10_Days,second10TimeOut),"Last_10_Days field is not visible");
        LOG.Reporter("Last_10_Days field is visible " +track_Last_10_Days.getText());

        CommonUtils.sleep(1);
        utility.iselementVisible(track_Specific_Date);
        Assert.assertTrue(iselementVisible(track_Specific_Date,second10TimeOut),"track_Specific_Date field  is not visible");
        LOG.Reporter("track_Specific_Date field is visible " +track_Specific_Date.getText());

        CommonUtils.sleep(1);
        utility.iselementVisible(track_Date_Range);
        Assert.assertTrue(iselementVisible(track_Date_Range,second10TimeOut),"track_Date_Range field  is not visible");
        LOG.Reporter("track_Date_Range field is visible " +track_Date_Range.getText());
        return this;
    }
    public PlayBackAndTraceNewB verify_Choose_Specific_Date_Within_The_Range() {
        CommonUtils.sleep(1);
        utility.iselementVisible(track_map_click_on_default_vehicle_btn);
        track_map_click_on_default_vehicle_btn.click();
        LOG.Reporter("click on individual vehicle on map");

        verifyPlayBackButtonTrack();

        utility.iselementVisible(track_click_on_dropdown_arrow_btn);
        track_click_on_dropdown_arrow_btn.click();
        LOG.Reporter("click on track_click_on_dropdown_arrow_btn btn ");

        CommonUtils.sleep(1);
        utility.iselementVisible(track_Specific_Date);
        Assert.assertTrue(iselementVisible(track_Specific_Date,second10TimeOut),"track_Specific_Date field  is not visible");
        LOG.Reporter("track_Specific_Date field is visible " +track_Specific_Date.getText());

        track_Specific_Date.click();
        LOG.Reporter("click on track_Specific_Date btn");

        CommonUtils.sleep(2);
        fst1.click();
        LOG.Reporter("select specific date");

        CommonUtils.sleep(1);
        rTsubmit.click();
        LOG.Reporter("click on date range submit btn");
        TTTsubmit.click();
        CommonUtils.sleep(4);
        LOG.Reporter("User is able to choose specific date within the range.");
        return this;
    }


}


