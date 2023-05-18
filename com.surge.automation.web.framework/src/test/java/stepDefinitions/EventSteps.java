package stepDefinitions;

import hooks.GetPages;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.DriverUtils;

public class EventSteps extends GetPages {

    @When("I click on create event")
    public void i_click_on_create_event() {
;      getEventPage().clickOnCreateEvent();
    }
    @When("I fill mandatory details {string} ,{string}")
    public void i_fill_mandatory_details(String eventTitle, String eventDescription) {
        getEventPage().fillEventDetails(eventTitle,eventDescription);
    }

    @When("I click on publish button")
    public void i_click_on_publish_button() {
    getEventPage().clickOnPublish();
    }
    @Then("I should able to see event listing on the screen")
    public void i_should_able_to_see_event_listing_on_the_screen() {
        getHomePage().navigateToEvents();
        getEventPage().isEventScreenAppear();
        getEventPage().searchAndValidateEvent();
    }
}
