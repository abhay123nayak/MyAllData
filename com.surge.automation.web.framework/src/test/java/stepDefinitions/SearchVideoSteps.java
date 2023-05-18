package stepDefinitions;

import hooks.GetPages;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchVideoSteps  extends GetPages {

    @Given("I am on Academy Admin Screen")
    public void i_am_on_academy_admin_screen() {
getHomePage().navigateToAcademyAdmin();
    }
    @Given("I selected video Tab")
    public void i_selected_video_tab() {
getAcademyVideoPage().selectVideoTab();
    }
    @When("I search {string}")
    public void i_search(String content) {
getAcademyVideoPage().searchContent(content);
    }
    @Then("I should able to see {string}")
    public void i_should_able_to_see(String expectedResult) {
getAcademyVideoPage().validateSearchResult(expectedResult);
    }

}
