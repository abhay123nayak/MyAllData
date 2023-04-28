package tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageObjects.LandingPage;
import pageObjects.LandingPageV1;
import pageObjects.LoginPage;
import pageObjects.PlayBackAndTraceNewB;

import static DataFactory.TrackingView.List;
import static DataFactory.TrackingView.Map;
import static reporter.ExtentTestManager.startTest;

public class PlayBackAndTraceTest extends SuiteSetup {
    PlayBackAndTraceNewB playTrace;
    LandingPageV1 landing;
    LoginPage page;


/*    @Test(priority = 2)
    @Parameters({"customer", "user", "password"})
    public void testToVerifyTrace(String customer, String user, String password) {
        startTest(" Validate Trace can be accessed through Fleet Tracking",
                "Trace can be accessed through Fleet Tracking -> Trace.");
        page = new LoginPage(getDriver());
        page.isLandingScreenAppear().navigateToOrganizationSignIn().userLogin(user,password);
        landing = new LandingPageV1(getDriver());
        landing.selectUserForFleet(customer);
        playTrace = new PlayBackAndTraceNewB(getDriver());
        playTrace.VerifyTrace();
    }*/

    @Test(priority = 3)
    @Parameters({"customer", "user", "password"})
    public void test_To_Verify_Default_View_On_Trace_24_hours(String customer, String user, String password) {
        startTest("Validate the default view on trace past 24 hours", "Default view " +
                "to show 24 hours data be auto populated.");
        page = new LoginPage(getDriver());
        page.isLandingScreenAppear().navigateToOrganizationSignIn().userLogin(user,password);
        landing = new LandingPageV1(getDriver());
        landing.selectUserForFleet(customer);
        playTrace = new PlayBackAndTraceNewB(getDriver());
        playTrace.VerifyTrace().Verify_Default_View_On_Trace_24_hours();
    }

/*    @Test(priority = 4)
    public void test_To_Verify_filter_the_data_time_and_Odometer() {
        startTest("Validate filter data time/odometer", "User can filter the data" +
                " basis either time or odometer. ");
        page = new LoginPage(getDriver());
        page.isLandingScreenAppear().navigateToOrganizationSignIn().userLogin();
        landingPage = new LandingPage(getDriver());
        landingPage.selectUserForFleet();
        playTrace = new PlayBackAndTraceNewB(getDriver());
        playTrace.Verify_filter_the_data_time_and_Odometer();
    }

    @Test(priority = 5)
    public void test_To_Verify_start_end_Odometer_Max_Different_5000kms() {
        startTest("Validate The Max Time Difference max 5000 ", "Start and end odometer can have" +
                " a maximum difference of 5000 KMs. ");
        page = new LoginPage(getDriver());
        page.isLandingScreenAppear().navigateToOrganizationSignIn().userLogin();
        landingPage = new LandingPage(getDriver());
        landingPage.selectUserForFleet();
        playTrace = new PlayBackAndTraceNewB(getDriver());
        playTrace.Verify_start_end_Odometer_Max_Different_5000kms();
    }

    @Test(priority = 6)
    public void test_To_Verify_PastRoute_Data_On_Trace() {
        startTest("Validate the Past route data  ", "Past route data will be plotted basis user filter selected.");
        page = new LoginPage(getDriver());
        page.isLandingScreenAppear().navigateToOrganizationSignIn().userLogin();
        landingPage = new LandingPage(getDriver());
        landingPage.selectUserForFleet();
        playTrace = new PlayBackAndTraceNewB(getDriver());
        playTrace.Verify_PastRoute_Data_On_Trace();
    }

    @Test(priority = 13)
    public void testToVerifyLocationAndTimeOnTrace() {
        startTest("Validate the Start To details track",
                "Start to end detailed track should be plotted with location and" +
                        " time description specified. ");
        page = new LoginPage(getDriver());
        page.isLandingScreenAppear().navigateToOrganizationSignIn().userLogin();
        landingPage = new LandingPage(getDriver());
        landingPage.selectUserForFleet();
        playTrace = new PlayBackAndTraceNewB(getDriver());
        playTrace.VerifyTrace().VerifyDefaultViewOnTrace().VerifyLocationAndTimeOnTrace();
    }

    @Test(priority = 12)
    public void testToVerifyDefaultMapVehicleTrack() {
        startTest("Verify past 24 hour performance",
                "Default vehicle track should be created on the map for past 24 hours.   ");
        page = new LoginPage(getDriver());
        page.isLandingScreenAppear().navigateToOrganizationSignIn().userLogin();
        LandingPage landing = new LandingPage(getDriver());
        landing.selectUserForFleet();
        playTrace = new PlayBackAndTraceNewB(getDriver());
        playTrace.selecttrack();
        landing.switchTrackingView(List);
        landing.verifyVehiclePast24HourPerformance();
    }

    @Test(priority = 20)
    public void testToVerifyStartAndEndTimeWithDurationTrack() {
        startTest("Validate Star and End Time ", "If user filters the view basis " +
                "selected duration, it should match the Start time and End time as selected by user. ");
        page = new LoginPage(getDriver());
        page.isLandingScreenAppear().navigateToOrganizationSignIn().userLogin();
        LandingPage landing = new LandingPage(getDriver());
        landing.selectUserForFleet();
        playTrace = new PlayBackAndTraceNewB(getDriver());
        playTrace.selecttrack();
        landing.switchTrackingView(List);
        playTrace.verifyStartAndEndTimeTrack();


    }

    @Test(priority = 21)
    public void testToVerifyStartAndEndOdometerTrace() {
        startTest("Validate The Start and End Odometer value ", "If user" +
                " filters the view basis selected odometer," +
                " it should match the Start Odometer and End Odometer as selected by user.");
        page = new LoginPage(getDriver());
        page.isLandingScreenAppear().navigateToOrganizationSignIn().userLogin();
        landingPage = new LandingPage(getDriver());
        landingPage.selectUserForFleet();
        playTrace = new PlayBackAndTraceNewB(getDriver());
        playTrace.VerifyTrace().VerifyStartAndEndOdometerTrace();
    }

    @Test(priority = 22)
    public void testToVerifyPlaybackAccessed() {
        startTest("Playback can be accessed once user clicks on individual vehicle ",
                "Playback can be accessed once user clicks on individual vehicle in fleet tracking,  ");
        page = new LoginPage(getDriver());
        page.isLandingScreenAppear().navigateToOrganizationSignIn().userLogin();
        LandingPage landing = new LandingPage(getDriver());
        landing.selectUserForFleet();
        playTrace = new PlayBackAndTraceNewB(getDriver());
        playTrace.selecttrack();
        landing.switchTrackingView(List);
        playTrace.verifyDefaultMapVehicleTrack().verifyPlayBackButtonTrack().VerifyPlaybackAccessed();

    }

    @Test(priority = 27)
    public void test_To_Verify_Zooms_the_Map_View(){
        startTest("After Zoom In and Zoom Out  ", "If user zooms the map view, " +
                "playback shouldn't stop. ");
        page = new LoginPage(getDriver());
        page.isLandingScreenAppear().navigateToOrganizationSignIn().userLogin();
        LandingPage landing = new LandingPage(getDriver());
        landing.selectUserForFleet();
        playTrace = new PlayBackAndTraceNewB(getDriver());
        playTrace.selecttrack();
        landing.switchTrackingView(List);
        playTrace.verify_Zooms_the_Map_View();

    }

    @Test(priority = 23, description = "S.No---23,24,25,26 --combined")
    public void testToVerifyRoutePlayBackAccessed() {
        startTest("User can view the route playback depending on the filter ", "User can view" +
                " the route playback depending on the filter selected. ");
        page = new LoginPage(getDriver());
        page.isLandingScreenAppear().navigateToOrganizationSignIn().userLogin();
        LandingPage landing = new LandingPage(getDriver());
        landing.selectUserForFleet();
        playTrace = new PlayBackAndTraceNewB(getDriver());
        playTrace.selecttrack();
        landing.switchTrackingView(List);
        playTrace.verifyDefaultMapVehicleTrack().verifyPlayBackButtonTrack().VerifyZoomTheMapViewPlayback();

    }

    @Test(priority = 7)
    public void testToVerifyDTTAndDTR() {
        startTest("compare trace distance travel = reports odometer value ", "Value " +
                "of Distance travelled" +
                " on Trace module = Value of Odometer on Vehicle " +
                "Summary in Reports for the same duration and vehicles selected. ");
        page = new LoginPage(getDriver());
        page.isLandingScreenAppear().navigateToOrganizationSignIn().userLogin();
        landingPage = new LandingPage(getDriver());
        landingPage.selectUserForFleet();
        playTrace = new PlayBackAndTraceNewB(getDriver());
        playTrace.VerifyDTTandDTR();
        //bug distance travel value is not same
    }

    @Test(priority = 8)
    public void testToIgnitionTraceEngineHoursReports() {
        startTest("Value of Ignition Time on Trace module = Value of Total Engine Hours" +
                " on Vehicle Summary ", "Value of Ignition Time on " +
                "Trace module = Value of Total Engine Hours on Vehicle Summary in Reports" +
                " for the same duration and vehicles selected.  ");
        page = new LoginPage(getDriver());
        page.isLandingScreenAppear().navigateToOrganizationSignIn().userLogin();
        landingPage = new LandingPage(getDriver());
        landingPage.selectUserForFleet();
        playTrace = new PlayBackAndTraceNewB(getDriver());
        playTrace.VerifyIgnitionTraceEngineHoursReports();
    }

    @Test(priority = 9)
    public void testToVerifyTotalFuelConsumedTraceTotalFuelConsumedReports() {
        startTest(" Total Fuel Consumed on Trace module = Value of Total Fuel Consumed on " +
                        "Vehicle Summary in Reports"
                , "Value of Total Fuel Consumed on Trace module = Value of Total Fuel Consumed " +
                        "on Vehicle Summary " +
                        "in Reports for the same duration and vehicles selected. ");
        page = new LoginPage(getDriver());
        page.isLandingScreenAppear().navigateToOrganizationSignIn().userLogin();
        landingPage = new LandingPage(getDriver());
        landingPage.selectUserForFleet();
        playTrace = new PlayBackAndTraceNewB(getDriver());
        playTrace.verifyTotalFuelConsumedTraceTotalFuelConsumedReports();
    }

    @Test(priority = 10)
    public void testToVerifyFuelEfficiencyTraceFuelEfficiencyReports() {
        startTest(" Fuel Efficiency on Trace module = Value of Fuel Efficiency" +
                        " on Vehicle Summary in Reports"
                , "Value of Fuel Efficiency on Trace module = Value of Fuel Efficiency" +
                        " on Vehicle Summary in Reports " +
                        "for the same duration and vehicles selected. //remain one logic ");
        page = new LoginPage(getDriver());
        page.isLandingScreenAppear().navigateToOrganizationSignIn().userLogin();
        landingPage = new LandingPage(getDriver());
        landingPage.selectUserForFleet();
        playTrace = new PlayBackAndTraceNewB(getDriver());
        playTrace.verifyFuelEfficiencyTraceFuelEfficiencyReports();
    }

    @Test(priority = 11)
    public void testToVerifyAverageSpeedTraceOdometerCustomParaReports() {
        startTest("Value of Average Speed on Trace module = Value of Odometer on Custom parameter Report",
                "Value of Average Speed on Trace module = Value of Odometer on Custom parameter " +
                        "Report for the same duration and selected. ");
        page = new LoginPage(getDriver());
        page.isLandingScreenAppear().navigateToOrganizationSignIn().userLogin();
        landingPage = new LandingPage(getDriver());
        landingPage.selectUserForFleet();
        playTrace = new PlayBackAndTraceNewB(getDriver());
        playTrace.verifyAverageSpeedTraceOdometerCustomParaReports();
    }

    /*@Test(priority = 18,description = "18,19")
    public void TestToVerifyStoppageHotspotZoneChooseVehicle() {
        startTest("Stoppage location specified in Trace = Location specified" +
                        " in Stoppage category in Hotspot module",
                "Stoppage location specified in Trace = Location specified in Stoppage category " +
                        "in Hotspot module - Fleet Monitoring depending on vehicle and duration selected.");
        page = new LoginPage(getDriver());
        page.isLandingScreenAppear().navigateToOrganizationSignIn().userLogin();
        landingPage = new LandingPage(getDriver());
        landingPage.selectUserForFleet();
        playTrace = new PlayBackAndTraceNewB(getDriver());
        playTrace.VerifyStoppageLocationHotspotModule();
    }
    @Test(priority = 14, description = "14,15,16,17")
    public void testToVerifyVehicleTravelDataOnMD() {
        startTest("Validate the vehicle value on moving Duration",
                   "(1)Distance Travelled of the vehicle to be visible during the moving duration " +
                        "(2)Moving Duration of the vehicle to be visible during the moving duration. " +
                        "(3)Average Speed of the vehicle to be visible during the moving duration. " +
                        "(4)Fuel Efficiency of the vehicle to be visible during the moving duration. ");
        page = new LoginPage(getDriver());
        page.isLandingScreenAppear().navigateToOrganizationSignIn().userLogin();
        LandingPage landing = new LandingPage(getDriver());
        landing.selectUserForFleet();
        playTrace = new PlayBackAndTraceNewB(getDriver());
        playTrace.selecttrack();
        landing.switchTrackingView(List);
        playTrace.verifyVehicleTravelDataOnMD();
    }

    @Test(priority = 18, description = "36,37,38")
    public void testToVerifyStoppageLocationHotspotAndTraceModule() {
        startTest("Validate stoppage duration, location and time",
                     "(1)Stoppage location specified in Trace = Location specified in Stoppage category in Hotspot module" +
                          "(2)Stoppage duration specified in Trace = duration specified in Stoppage category in Hotspot module." +
                          "(3)Stoppage time specified in Trace = time specified in Stoppage category in Hotspot module ");
        page = new LoginPage(getDriver());
        page.isLandingScreenAppear().navigateToOrganizationSignIn().userLogin();
        landingPage = new LandingPage(getDriver());
        landingPage.selectUserForFleet();
        playTrace = new PlayBackAndTraceNewB(getDriver());
        playTrace.VerifyStoppageLocationHotspotAndTraceModule();
    }

    @Test(priority = 400)
    public void test_To_Verify_Filter_the_data_basis_time_Track() {
        startTest("Verify past 24 hour performance",
                "Default vehicle track should be created on the map for past 24 hours.   ");
        page = new LoginPage(getDriver());
        page.isLandingScreenAppear().navigateToOrganizationSignIn().userLogin();
        LandingPage landing = new LandingPage(getDriver());
        landing.selectUserForFleet();
        playTrace = new PlayBackAndTraceNewB(getDriver());
        playTrace.selecttrack();
        landing.switchTrackingView(Map);
        playTrace.verify_Filter_The_Data_Basic_Time();

    }
    @Test(priority = 500)
    public void test_To_Verify_Choose_Specific_Date_Within_The_Range() {
        startTest("validate that User should be able to choose specific date within the range.",
                "Playback day filter should be present if Last 7 days, Last 10 days. data range. \n" +
                        "User should be able to choose specific date within the range. ");
        page = new LoginPage(getDriver());
        page.isLandingScreenAppear().navigateToOrganizationSignIn().userLogin();
        LandingPage landing = new LandingPage(getDriver());
        landing.selectUserForFleet();
        playTrace = new PlayBackAndTraceNewB(getDriver());
        playTrace.selecttrack();
        landing.switchTrackingView(Map);
        playTrace.verify_Choose_Specific_Date_Within_The_Range();

    }*/


}