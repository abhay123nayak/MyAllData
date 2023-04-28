package tests;

import static DataFactory.TrackingView.List;
import static DataFactory.TrackingView.Map;
import static reporter.ExtentTestManager.startTest;

import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;

import java.util.List;
import java.util.Map;

public class VehicleTrackTest extends SuiteSetup {

    LoginPage page;
    LandingPage landing;

   /* @Test(priority = 1)
    public void testToVerifyAllTabs() {
        startTest("Validate All Tabs",
                "Track landing page should have 4 tabs i.e. Moving, Idling, Stopped & Not Reachable.");
        page = new LoginPage(getDriver());
        page.isLandingScreenAppear().navigateToOrganizationSignIn().userLogin();
        landing = new LandingPage(getDriver());
        landing.selectUserForFleet().selectFleetTracking().verifyAllTabs();
    }


    @Test(priority = 2)
    public void testToVerifyAllAtDefault() {
        startTest("Validate All at Default",
                "All should be the default selection when user first navigates to Track. ");
        page = new LoginPage(getDriver());
        page.isLandingScreenAppear().navigateToOrganizationSignIn().userLogin();
        landing = new LandingPage(getDriver());
        landing.selectUserForFleet().selectFleetTracking().verifyAllAtDefault();
    }

    @Test(priority = 3)
    public void testToVerifyAnyTab() {
        startTest("Validate all Tabs",
                "Click on moving tab should update the landing page and show moving vehicles on Map/List.");
        page = new LoginPage(getDriver());
        page.isLandingScreenAppear().navigateToOrganizationSignIn().userLogin();
        landing = new LandingPage(getDriver());
        landing.selectUserForFleet().selectFleetTracking().verifyAllTabsIsSelected();

    }

    @Test(priority = 4)
    public void testToVerifyFilterSearch() {
        startTest("Validate Filter Search",
                "Search button should let user to filter the view based on vehicles or location. ");
        page = new LoginPage(getDriver());
        page.isLandingScreenAppear().navigateToOrganizationSignIn().userLogin();
        landing = new LandingPage(getDriver());
        landing.selectUserForFleet().selectFleetTracking().verifySearchWithVehicle();

    }

    @Test(priority = 4)
    public void testToVerifyVehicleCluster() {
        startTest("Validate vehicle Cluster",
                "Click on vehicle cluster on map will zoom the map view and scatter the vehicles and location. ");
        page = new LoginPage(getDriver());
        page.isLandingScreenAppear().navigateToOrganizationSignIn().userLogin();
        landing = new LandingPage(getDriver());
        landing.selectUserForFleet().selectFleetTracking().verifyVehicleCluster();

    }

    @Test(priority = 5)
    public void testToVerifyListView() {
        startTest("Verify List view", "Click on List button on map page will switch the view to list view. ");
        page = new LoginPage(getDriver());
        page.isLandingScreenAppear().navigateToOrganizationSignIn().userLogin();
        landing = new LandingPage(getDriver());
        landing.selectUserForFleet().selectFleetTracking().
                switchTrackingView(List);

    }

    @Test(priority = 6)
    public void testToVerifyFilterWithVehicle() {
        startTest("Filter with vehicle Test", "Filter button should let user filter the view based on vehicles ");
        page = new LoginPage(getDriver());
        page.isLandingScreenAppear().navigateToOrganizationSignIn().userLogin();
        landing = new LandingPage(getDriver());
        landing.selectUserForFleet().selectFleetTracking().verifyFilterWithVehicle();

    }

    @Test(priority = 7)
    public void testToVerifyListViewVehicle() {
        startTest("Verify List view with vehicle",
                "List view should have a list of vehicle depending on the category selected. ");
        page = new LoginPage(getDriver());
        page.isLandingScreenAppear().navigateToOrganizationSignIn().userLogin();
        landing = new LandingPage(getDriver());
        landing.selectUserForFleet().selectFleetTracking().
                switchTrackingView(List).
                verifyListViewWithVehicle();
    }

    @Test(priority = 8)
    public void testToVerifyVehicleHealthStatus() {
        startTest("Verify vehicle health status",
                "Vehicle health should be visible for all vehicles in the list view. ");
        page = new LoginPage(getDriver());
        page.isLandingScreenAppear().navigateToOrganizationSignIn().userLogin();
        landing = new LandingPage(getDriver());
        landing.selectUserForFleet().selectFleetTracking().
                switchTrackingView(List)
                .verifyListViewHealthStatus();

    }

    @Test(priority = 9)
    public void testToVerifyVehicleTimeAndLocation() {
        startTest("Verify vehicle time and location",
                "Last updated time and location should be visible for all vehicles. ");
        page = new LoginPage(getDriver());
        page.isLandingScreenAppear().navigateToOrganizationSignIn().userLogin();
        landing = new LandingPage(getDriver());
        landing.selectUserForFleet().selectFleetTracking().
                switchTrackingView(List).
                verifyVehicleLocationAndTime();

    }

    @Test(priority = 10, description = "S.N0:13,14")
    public void testToVerifyVehicleFuelLevels() {
        startTest("Verify vehicle fuel level and odometer readings", "Fuel level (Lts) and odometer readings should be visible for all vehicles.");
        page = new LoginPage(getDriver());
        page.isLandingScreenAppear().navigateToOrganizationSignIn().userLogin();
        landing = new LandingPage(getDriver());
        landing.selectUserForFleet().selectFleetTracking().
                switchTrackingView(List).
                verifyVehicleFuelLevel();

    }

    @Test(priority = 10, description = "S.N0:15")
    public void testToVerifyMapView() {
        startTest("Switch to list view to Map view",
                "Click on Map button on list page will switch the view to map view. ");
        page = new LoginPage(getDriver());
        page.isLandingScreenAppear().navigateToOrganizationSignIn().userLogin();
        landing = new LandingPage(getDriver());
        landing.selectUserForFleet().selectFleetTracking().
                switchTrackingView(List).
                switchTrackingView(Map);
    }

    @Test(priority = 11, description = "S.N0:16")
    public void testToVerifyFilterNotChangeOnListView() {
        startTest("Verify Vehicle filter not change on list view",
                "If vehicles/ category are filtered on map view should be applicable on List view as well and vice versa. ");
        page = new LoginPage(getDriver());
        page.isLandingScreenAppear().navigateToOrganizationSignIn().userLogin();
        landing = new LandingPage(getDriver());
        landing.selectUserForFleet().selectFleetTracking().
                switchTrackingView(Map).
                verifyVehicleCategoryInList();
    }

    @Test(priority = 12, description = "S.N0:17")
    public void testToVerifyVehicleDetailsOnMap() {
        startTest("Verify vehicle details on Map",
                "Click on individual vehicle on map view will open detailed vehicle map. ");
        page = new LoginPage(getDriver());
        page.isLandingScreenAppear().navigateToOrganizationSignIn().userLogin();
        landing = new LandingPage(getDriver());
        landing.selectUserForFleet().selectFleetTracking().
                switchTrackingView(Map).
                verifyVehicleOnMap();

    }

    @Test(priority = 13, description = "S.N0:18")
    public void testToVerifyVehicleDetailsOnList() {
        startTest("Verify vehicle details on List",
                "Click on individual vehicle on list view will open detailed vehicle map. ");
        page = new LoginPage(getDriver());
        page.isLandingScreenAppear().navigateToOrganizationSignIn().userLogin();
        landing = new LandingPage(getDriver());
        landing.selectUserForFleet().selectFleetTracking().
                switchTrackingView(List)
                .verifyVehicleOnList();

    }

    @Test(priority = 11, description = "S.N0:19")
    public void testToVerifyDetailedView() {
        startTest("Verify vehicle details view",
                "Detailed view should have 3 categories - Current Status, Playback & Trace, and Quick Links. ");
        page = new LoginPage(getDriver());
        page.isLandingScreenAppear().navigateToOrganizationSignIn().userLogin();
        landing = new LandingPage(getDriver());
        landing.selectUserForFleet().selectFleetTracking().switchTrackingView(List).
                verifyVehicleOnList().
                verifyVehicleDetailedView();

    }

    @Test(priority = 12, description = "S.N0:20")
    public void testToVerifyRealTime() {
        startTest("Verify vehicle Real time location",
                "On current status, real time vehicle movement track should be visible on map.");
        page = new LoginPage(getDriver());
        page.isLandingScreenAppear().navigateToOrganizationSignIn().userLogin();
        landing = new LandingPage(getDriver());
        landing.selectUserForFleet().selectFleetTracking().
                switchTrackingView(List).
                verifyVehicleOnList().
                verifyVehicleRealTimeDetails();

    }

    @Test(priority = 13, description = "S.N0:21,22,23,24,25")
    public void testToVerifyVehicleRealTimeDetails() {
        startTest("Verify vehicle real time details", "Verify real time vehicles details");
        page = new LoginPage(getDriver());
        page.isLandingScreenAppear().navigateToOrganizationSignIn().userLogin();
        landing = new LandingPage(getDriver());
        landing.selectUserForFleet().selectFleetTracking().switchTrackingView(List).
                verifyVehicleOnList().
                verifyVehicleRealTimeSpeed().
                verifyVehicleRealTimeOdometer().verifyVehicleRealTimeSweetSpot().
                verifyVehicleRealTimeDEFLevel();

    }

    @Test(priority = 14, description = "S.N0:26")
    public void testToVerifyPast24HoursPerformance() {
        startTest("Verify past 24 hour performance",
                "User must be able to view past 24 hours performance from the time they are viewing the tab. ");
        page = new LoginPage(getDriver());
        page.isLandingScreenAppear().navigateToOrganizationSignIn().userLogin();
        landing = new LandingPage(getDriver());
        landing.selectUserForFleet().selectFleetTracking().
                switchTrackingView(List).
                verifyVehicleOnList().
                verifyVehiclePast24HourPerformance();

    }

    @Test(priority = 15, description = "S.N0:27 , Count:24")
    public void testToVerifySharingLiveLocation() {
        startTest("Verify user can share live location of vehicle",
                "User must be able to share Live location for specific vehicle ");
        page = new LoginPage(getDriver());
        page.isLandingScreenAppear().navigateToOrganizationSignIn().userLogin();
        landing = new LandingPage(getDriver());
        landing.selectUserForFleet().selectFleetTracking().
                switchTrackingView(List).
                verifyVehicleOnList().verifyShareLiveLocation();

    }

    @Test(priority = 16, description = "S.N0:28 , Count:25")
    public void testToVerifySharingCurrentLocation() {
        startTest("Verify user can share current location of vehicle",
                "User must be able to share current location for specific vehicle");
        page = new LoginPage(getDriver());
        page.isLandingScreenAppear().navigateToOrganizationSignIn().userLogin();
        landing = new LandingPage(getDriver());
        landing.selectUserForFleet().selectFleetTracking().
                switchTrackingView(List).
                verifyVehicleOnList().verifyShareCurrentLocation();

    }

    @Test(priority = 17, description = "S.N0:32")
    public void testToVerifyNoPilotAssigned() {
        startTest("Verify No Pilot Assigned",
                "If no pilot is assigned then text No Pilot Assigned should be visible. ");
        page = new LoginPage(getDriver());
        page.isLandingScreenAppear().navigateToOrganizationSignIn().userLogin();
        landing = new LandingPage(getDriver());
        landing.selectUserForFleet().selectFleetTracking().
                switchTrackingView(List).
                verifyVehicleOnList().verifyNoPilotAssigned();

    }

    @Test(priority = 18, description = "S.N0:33")
    public void testToVerifyVehicleDetailsTab() {
        startTest("Validate Vehicle Details Tab",
                "Click on vehicle details CTA,user will navigate user to vehicle one view on My Organization -> detailed view ");
        page = new LoginPage(getDriver());
        page.isLandingScreenAppear().navigateToOrganizationSignIn().userLogin();
        landing = new LandingPage(getDriver());
        landing.selectUserForFleet().selectFleetTracking().
                switchTrackingView(List).
                verifyVehicleOnList().verifyVehicleDetailsTab();

    }

    @Test(priority = 19, description = "S.N0:34")
    public void testToVerifyFuelServicesTab() {
        startTest("Validate Fuel Services Tab",
                "Click on Fuel Services CTA, user will navigate user to vehicle one view on Fuel Management -> Fuel Refill and Drain with vehicle selected.");
        page = new LoginPage(getDriver());
        page.isLandingScreenAppear().navigateToOrganizationSignIn().userLogin();
        landing = new LandingPage(getDriver());
        landing.selectUserForFleet().selectFleetTracking().
                switchTrackingView(List).
                verifyVehicleOnList().verifyVehicleFuelServicesTab();

    }

    @Test(priority = 20, description = "S.N0:35")
    public void testToVerifyFuelGraphTab() {
        startTest("Validate Fuel graph Tab",
                "Click on Fuel Services CTA, user will navigate user to vehicle one view on Fuel Management -> Fuel Graph with vehicle selected.");
        page = new LoginPage(getDriver());
        page.isLandingScreenAppear().navigateToOrganizationSignIn().userLogin();
        landing = new LandingPage(getDriver());
        landing.selectUserForFleet().selectFleetTracking().
                switchTrackingView(List).
                verifyVehicleOnList().verifyVehicleFuelGraphTab();

    }

    @Test(priority = 21, description = "S.N0:36 ")
    public void testToVerifyFleetMonitorTab() {
        startTest("Validate Fleet Monitor Tab",
                "Click on Fuel Services CTA, user will navigate user to vehicle one view on Fleet Monitor -> Fleet Insights with vehicle selected. ");
        page = new LoginPage(getDriver());
        page.isLandingScreenAppear().navigateToOrganizationSignIn().userLogin();
        landing = new LandingPage(getDriver());
        landing.selectUserForFleet().selectFleetTracking().
                switchTrackingView(List).
                verifyVehicleOnList().verifyVehicleFleetMonitorTab();

    }

    @Test(priority = 22, description = "S.N0:37 ")
    public void testToVerifyGoToDashboardTab() {
        startTest("Validate Go to Dashboard Tab",
                "Click on Fuel Services CTA, user will navigate user to vehicle one view on Fleet Monitor -> My Dashboard with vehicle selected. ");
        page = new LoginPage(getDriver());
        page.isLandingScreenAppear().navigateToOrganizationSignIn().userLogin();
        landing = new LandingPage(getDriver());
        landing.selectUserForFleet().selectFleetTracking().
                switchTrackingView(List).
                verifyVehicleOnList().verifyVehicleGoToDashboard();

    }*/


}
