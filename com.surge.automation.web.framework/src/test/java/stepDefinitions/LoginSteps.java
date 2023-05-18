package stepDefinitions;

import hooks.GeneralHooks;
import hooks.GetPages;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends GetPages {

    @Given("I am on Login Screen")
    public void i_am_on_login_screen() {
        getLoginPage().isLoginScreenAppear();
    }
    @When("I authenticate with Linkedin")
    public void i_authenticate_with_linkedin() {
            getLoginPage().authenticateByLinkedin();
    }
    @Then("I should able to see welcome screen")
    public void i_should_able_to_see_welcome_screen() {
        getHomePage().isHomeScreenAppear();
    }



}
