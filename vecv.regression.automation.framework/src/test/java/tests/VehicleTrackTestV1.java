package tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageObjects.LandingPageV1;
import pageObjects.LoginPage;

import static DataFactory.TrackingView.List;
import static DataFactory.TrackingView.Map;
import static reporter.ExtentTestManager.startTest;

public class VehicleTrackTestV1 extends SuiteSetup {


    LoginPage page;
    LandingPageV1 landing;

    @Test(priority = 1)
    @Parameters({"customer", "user", "password"})
    public void testToVerifyAllTabs(String customer, String user, String password) {
        startTest("Validate All Tabs",
                "Track landing page should have 4 tabs i.e. Moving, Idling, Stopped & Not Reachable.");
        page = new LoginPage(getDriver());
        page.isLandingScreenAppear().navigateToOrganizationSignIn().userLogin(user, password);
        landing = new LandingPageV1(getDriver());
        landing.selectUserForFleet(customer).selectFleetTracking().verifyAllTabs();
    }


   @Test(priority = 2)
    @Parameters({"customer", "user", "password"})
    public void testToVerifyAllAtDefault(String customer, String user, String password) {
        startTest("Validate All at Default",
                "All should be the default selection when user first navigates to Track. ");
        page = new LoginPage(getDriver());
        page.isLandingScreenAppear().navigateToOrganizationSignIn().userLogin(user, password);
        landing = new LandingPageV1(getDriver());
        landing.selectUserForFleet(customer).selectFleetTracking().verifyAllAtDefault();
    }

    @Test(priority = 3)
    @Parameters({"customer", "user", "password"})
    public void testToVerifyAnyTab(String customer, String user, String password) {

        startTest("Validate all Tabs",
                "Click on moving tab should update the landing page and show moving vehicles on Map/List.");
        page = new LoginPage(getDriver());
        page.isLandingScreenAppear().navigateToOrganizationSignIn().userLogin(user, password);
        landing = new LandingPageV1(getDriver());
        landing.selectUserForFleet(customer).selectFleetTracking().verifyAllTabsIsSelected();

    }
    /*
    @Test(priority = 4)
    @Parameters({"customer", "user", "password"})
    public void testToVerifyFilterSearch(String customer, String user, String password) {
        startTest("Validate Filter Search",
                "Search button should let user to filter the view based on vehicles or location. ");
        page = new LoginPage(getDriver());
        page.isLandingScreenAppear().navigateToOrganizationSignIn().userLogin(user, password);
        landing = new LandingPageV1(getDriver());
        landing.selectUserForFleet(customer).selectFleetTracking().verifySearchWithVehicle();

    }

    @Test(priority = 5)
    @Parameters({"customer", "user", "password"})
    public void testToVerifyVehicleCluster(String customer, String user, String password) {
        startTest("Validate vehicle Cluster",
                "Click on vehicle cluster on map will zoom the map view and scatter the vehicles and location. ");
        page = new LoginPage(getDriver());
        page.isLandingScreenAppear().navigateToOrganizationSignIn().userLogin(user, password);
        landing = new LandingPageV1(getDriver());
        landing.selectUserForFleet(customer).selectFleetTracking().verifyVehicleCluster();

    }

    @Test(priority = 6)
    @Parameters({"customer", "user", "password"})
    public void testToVerifyListView(String customer, String user, String password) {
        startTest("Verify List view", "Click on List button on map page will switch the view to list view. ");
        page = new LoginPage(getDriver());
        page.isLandingScreenAppear().navigateToOrganizationSignIn().userLogin(user, password);
        landing = new LandingPageV1(getDriver());
        landing.selectUserForFleet(customer).selectFleetTracking().
                switchTrackingView(List);

    }

    @Test(priority = 6)
    @Parameters({"customer", "user", "password"})
    public void testToVerifyFilterWithVehicle(String customer, String user, String password) {
        startTest("Filter with vehicle Test", "Filter button should let user filter the view based on vehicles ");
        page = new LoginPage(getDriver());
        page.isLandingScreenAppear().navigateToOrganizationSignIn().userLogin(user, password);
        landing = new LandingPageV1(getDriver());
        landing.selectUserForFleet(customer).selectFleetTracking().verifyFilterWithVehicle();

    }
*//*
    @Test(priority = 7)
    @Parameters({"customer", "user", "password"})
    public void testToVerifyListViewVehicle(String customer, String user, String password) {
        startTest("Verify List view with vehicle",
                "List view should have a list of vehicle depending on the category selected. ");
        page = new LoginPage(getDriver());
        page.isLandingScreenAppear().navigateToOrganizationSignIn().userLogin(user, password);
        landing = new LandingPageV1(getDriver());
        landing.selectUserForFleet(customer).selectFleetTracking().
                switchTrackingView(List).
                verifyListViewWithVehicle();
    }

    @Test(priority = 8)
    @Parameters({"customer", "user", "password"})
    public void testToVerifyVehicleHealthStatus(String customer, String user, String password) {
        startTest("Verify vehicle health status",
                "Vehicle health should be visible for all vehicles in the list view. ");
        page = new LoginPage(getDriver());
        page.isLandingScreenAppear().navigateToOrganizationSignIn().userLogin(user, password);
        landing = new LandingPageV1(getDriver());
        landing.selectUserForFleet(customer).selectFleetTracking().
                switchTrackingView(List)
                .verifyListViewHealthStatus();

    }

    @Test(priority = 9)
    @Parameters({"customer", "user", "password"})
    public void testToVerifyVehicleTimeAndLocation(String customer, String user, String password) {
        startTest("Verify vehicle time and location",
                "Last updated time and location should be visible for all vehicles. ");
        page = new LoginPage(getDriver());
        page.isLandingScreenAppear().navigateToOrganizationSignIn().userLogin(user, password);
        landing = new LandingPageV1(getDriver());
        landing.selectUserForFleet(customer).selectFleetTracking().
                switchTrackingView(List).
                verifyVehicleLocationAndTime();

    }

    @Test(priority = 10, description = "S.N0:13,14")
    @Parameters({"customer", "user", "password"})
    public void testToVerifyVehicleFuelLevels(String customer, String user, String password) {
        startTest("Verify vehicle fuel level and odometer readings", "Fuel level (Lts) and odometer readings should be visible for all vehicles.");
        page = new LoginPage(getDriver());
        page.isLandingScreenAppear().navigateToOrganizationSignIn().userLogin(user, password);
        landing = new LandingPageV1(getDriver());
        landing.selectUserForFleet(customer).selectFleetTracking().
                switchTrackingView(List).
                verifyVehicleFuelLevel();

    }

    @Test(priority = 10, description = "S.N0:15")
    @Parameters({"customer", "user", "password"})
    public void testToVerifyMapView(String customer, String user, String password) {
        startTest("Switch to list view to Map view",
                "Click on Map button on list page will switch the view to map view. ");
        page = new LoginPage(getDriver());
        page.isLandingScreenAppear().navigateToOrganizationSignIn().userLogin(user, password);
        landing = new LandingPageV1(getDriver());
        landing.selectUserForFleet(customer).selectFleetTracking().
                switchTrackingView(List).
                switchTrackingView(Map);
    }

    @Test(priority = 11, description = "S.N0:16")
    @Parameters({"customer", "user", "password"})
    public void testToVerifyFilterNotChangeOnListView(String customer, String user, String password) {
        startTest("Verify Vehicle filter not change on list view",
                "If vehicles/ category are filtered on map view should be applicable on List view as well and vice versa. ");
        page = new LoginPage(getDriver());
        page.isLandingScreenAppear().navigateToOrganizationSignIn().userLogin(user, password);
        landing = new LandingPageV1(getDriver());
        landing.selectUserForFleet(customer).selectFleetTracking().
                switchTrackingView(Map).
                verifyVehicleCategoryInList();
    }

    @Test(priority = 12, description = "S.N0:17")
    @Parameters({"customer", "user", "password"})
    public void testToVerifyVehicleDetailsOnMap(String customer, String user, String password) {
        startTest("Verify vehicle details on Map",
                "Click on individual vehicle on map view will open detailed vehicle map. ");
        page = new LoginPage(getDriver());
        page.isLandingScreenAppear().navigateToOrganizationSignIn().userLogin(user, password);
        landing = new LandingPageV1(getDriver());
        landing.selectUserForFleet(customer).selectFleetTracking().
                switchTrackingView(Map).
                verifyVehicleOnMap();

    }

    @Test(priority = 13, description = "S.N0:18")
    @Parameters({"customer", "user", "password"})
    public void testToVerifyVehicleDetailsOnList(String customer, String user, String password) {
        startTest("Verify vehicle details on List",
                "Click on individual vehicle on list view will open detailed vehicle map. ");
        page = new LoginPage(getDriver());
        page.isLandingScreenAppear().navigateToOrganizationSignIn().userLogin(user, password);
        landing = new LandingPageV1(getDriver());
        landing.selectUserForFleet(customer).selectFleetTracking().
                switchTrackingView(List)
                .verifyVehicleOnList();

    }

    @Test(priority = 11, description = "S.N0:19")
    @Parameters({"customer", "user", "password"})
    public void testToVerifyDetailedView(String customer, String user, String password) {
        startTest("Verify vehicle details view",
                "Detailed view should have 3 categories - Current Status, Playback & Trace, and Quick Links. ");
        page = new LoginPage(getDriver());
        page.isLandingScreenAppear().navigateToOrganizationSignIn().userLogin(user, password);
        landing = new LandingPageV1(getDriver());
        landing.selectUserForFleet(customer).selectFleetTracking().switchTrackingView(List).
                verifyVehicleOnList().
                verifyVehicleDetailedView();

    }

    @Test(priority = 12, description = "S.N0:20")
    @Parameters({"customer", "user", "password"})
    public void testToVerifyRealTime(String customer, String user, String password) {
        startTest("Verify vehicle Real time location",
                "On current status, real time vehicle movement track should be visible on map.");
        page = new LoginPage(getDriver());
        page.isLandingScreenAppear().navigateToOrganizationSignIn().userLogin(user, password);
        landing = new LandingPageV1(getDriver());
        landing.selectUserForFleet(customer).selectFleetTracking().
                switchTrackingView(List).
                verifyVehicleOnList().
                verifyVehicleRealTimeDetails();

    }

    @Test(priority = 13, description = "S.N0:21,22,23,24,25")
    @Parameters({"customer", "user", "password"})
    public void testToVerifyVehicleRealTimeDetails(String customer, String user, String password) {
        startTest("Verify vehicle real time details", "Verify real time vehicles details");
        page = new LoginPage(getDriver());
        page.isLandingScreenAppear().navigateToOrganizationSignIn().userLogin(user, password);
        landing = new LandingPageV1(getDriver());
        landing.selectUserForFleet(customer).selectFleetTracking().switchTrackingView(List).
                verifyVehicleOnList().
                verifyVehicleRealTimeSpeed().
                verifyVehicleRealTimeOdometer();
    }

    @Test(priority = 14, description = "S.N0:26")
    @Parameters({"customer", "user", "password"})
    public void testToVerifyPast24HoursPerformance(String customer, String user, String password) {
        startTest("Verify past 24 hour performance",
                "User must be able to view past 24 hours performance from the time they are viewing the tab. ");
        page = new LoginPage(getDriver());
        page.isLandingScreenAppear().navigateToOrganizationSignIn().userLogin(user, password);
        landing = new LandingPageV1(getDriver());
        landing.selectUserForFleet(customer).selectFleetTracking().
                switchTrackingView(List).
                verifyVehicleOnList().
                verifyVehiclePast24HourPerformance();

    }

    @Test(priority = 15, description = "S.N0:27 , Count:24")
    @Parameters({"customer", "user", "password"})
    public void testToVerifySharingLiveLocation(String customer, String user, String password) {
        startTest("Verify user can share live location of vehicle",
                "User must be able to share Live location for specific vehicle ");
        page = new LoginPage(getDriver());
        page.isLandingScreenAppear().navigateToOrganizationSignIn().userLogin(user, password);
        landing = new LandingPageV1(getDriver());
        landing.selectUserForFleet(customer).selectFleetTracking().
                switchTrackingView(List).
                verifyVehicleOnList().verifyShareLiveLocation();

    }
*/
    @Test(priority = 16, description = "S.N0:28 , Count:25")
    @Parameters({"customer", "user", "password"})
    public void testToVerifySharingCurrentLocation(String customer, String user, String password) {
        startTest("Verify user can share current location of vehicle",
                "User must be able to share current location for specific vehicle");
        page = new LoginPage(getDriver());
        page.isLandingScreenAppear().navigateToOrganizationSignIn().userLogin(user, password);
        landing = new LandingPageV1(getDriver());
        landing.selectUserForFleet(customer).selectFleetTracking().
                switchTrackingView(List).
                verifyVehicleOnList().verifyShareCurrentLocation();

    }

    @Test(priority = 17, description = "S.N0:32")
    @Parameters({"customer", "user", "password"})
    public void testToVerifyNoPilotAssigned(String customer, String user, String password) {
        startTest("Verify No Pilot Assigned",
                "If no pilot is assigned then text No Pilot Assigned should be visible. ");
        page = new LoginPage(getDriver());
        page.isLandingScreenAppear().navigateToOrganizationSignIn().userLogin(user, password);
        landing = new LandingPageV1(getDriver());
        landing.selectUserForFleet(customer).selectFleetTracking().
                switchTrackingView(List).
                verifyVehicleOnList().verifyNoPilotAssigned();

    }

    @Test(priority = 18, description = "S.N0:33", enabled = false)
    @Parameters({"customer", "user", "password"})
    public void testToVerifyVehicleDetailsTab(String customer, String user, String password) {
        startTest("Validate Vehicle Details Tab",
                "Click on vehicle details CTA,user will navigate user to vehicle one view on My Organization -> detailed view ");
        page = new LoginPage(getDriver());
        page.isLandingScreenAppear().navigateToOrganizationSignIn().userLogin(user, password);
        landing = new LandingPageV1(getDriver());
        landing.selectUserForFleet(customer).selectFleetTracking().
                switchTrackingView(List).
                verifyVehicleOnList().verifyVehicleDetailsTab();

    }

    @Test(priority = 19, description = "S.N0:34")
    @Parameters({"customer", "user", "password"})
    public void testToVerifyFuelServicesTab(String customer, String user, String password) {
        startTest("Validate Fuel Services Tab",
                "Click on Fuel Services CTA, user will navigate user to vehicle one view on Fuel Management -> Fuel Refill and Drain with vehicle selected.");
        page = new LoginPage(getDriver());
        page.isLandingScreenAppear().navigateToOrganizationSignIn().userLogin(user, password);
        landing = new LandingPageV1(getDriver());
        landing.selectUserForFleet(customer).selectFleetTracking().
                switchTrackingView(List).
                verifyVehicleOnList().verifyVehicleFuelServicesTab();

    }

    @Test(priority = 20, description = "S.N0:35")
    @Parameters({"customer", "user", "password"})
    public void testToVerifyFuelGraphTab(String customer, String user, String password) {
        startTest("Validate Fuel graph Tab",
                "Click on Fuel Services CTA, user will navigate user to vehicle one view on Fuel Management -> Fuel Graph with vehicle selected.");
        page = new LoginPage(getDriver());
        page.isLandingScreenAppear().navigateToOrganizationSignIn().userLogin(user, password);
        landing = new LandingPageV1(getDriver());
        landing.selectUserForFleet(customer).selectFleetTracking().
                switchTrackingView(List).
                verifyVehicleOnList().verifyVehicleFuelGraphTab();

    }

    @Test(priority = 21, description = "S.N0:36 ")
    @Parameters({"customer", "user", "password"})
    public void testToVerifyFleetMonitorTab(String customer, String user, String password) {
        startTest("Validate Fleet Monitor Tab",
                "Click on Fuel Services CTA, user will navigate user to vehicle one view on Fleet Monitor -> Fleet Insights with vehicle selected. ");
        page = new LoginPage(getDriver());
        page.isLandingScreenAppear().navigateToOrganizationSignIn().userLogin(user, password);
        landing = new LandingPageV1(getDriver());
        landing.selectUserForFleet(customer).selectFleetTracking().
                switchTrackingView(List).
                verifyVehicleOnList().verifyVehicleFleetMonitorTab();

    }

    @Test(priority = 22, description = "S.N0:37 ")
    @Parameters({"customer", "user", "password"})
    public void testToVerifyGoToDashboardTab(String customer, String user, String password) {
        startTest("Validate Go to Dashboard Tab",
                "Click on Fuel Services CTA, user will navigate user to vehicle one view on Fleet Monitor -> My Dashboard with vehicle selected. ");
        page = new LoginPage(getDriver());
        page.isLandingScreenAppear().navigateToOrganizationSignIn().userLogin(user, password);
        landing = new LandingPageV1(getDriver());
        landing.selectUserForFleet(customer).selectFleetTracking().
                switchTrackingView(List).
                verifyVehicleOnList().verifyVehicleGoToDashboard();

    }
}


