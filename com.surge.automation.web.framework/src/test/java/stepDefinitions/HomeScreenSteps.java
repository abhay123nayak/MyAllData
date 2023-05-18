package stepDefinitions;

import hooks.GetPages;
import io.cucumber.java.en.Given;

public class HomeScreenSteps extends GetPages {


    @Given("I am on Event screen")
    public void i_am_on_event_screen() {
        getHomePage()
                .isHomeScreenAppear()
                .navigateToAcademyHomeScreen()
                .navigateToEvents();
        getEventPage().isEventScreenAppear();

    }


}
