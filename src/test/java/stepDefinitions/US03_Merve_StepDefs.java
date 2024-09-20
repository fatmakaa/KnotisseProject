package stepDefinitions;

import io.cucumber.java.en.*;
import utilities.ConfigReader;
import utilities.Driver;

public class US03_Merve_StepDefs {

    @Given("The user navigates to the related website.")
    public void the_user_navigates_to_the_related_website() {
        Driver.getDriver().get(ConfigReader.getProperty("baseUrl"));

    }
    @Then("The user clicks on the search icon.")
    public void the_user_clicks_on_the_search_icon() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("The user types {string} into the search box.")
    public void the_user_types_into_the_search_box(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("The user clicks the search button.")
    public void the_user_clicks_the_search_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("The user sees the total number of results displayed in the window that opens.")
    public void the_user_sees_the_total_number_of_results_displayed_in_the_window_that_opens() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("The user clicks on the first product.")
    public void the_user_clicks_on_the_first_product() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("The user views the details of the selected product \\(confirming it is {string}).")
    public void the_user_views_the_details_of_the_selected_product_confirming_it_is(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("The user returns to the search box and searches for another specific product.")
    public void the_user_returns_to_the_search_box_and_searches_for_another_specific_product() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("The user clicks on one of the available options and views the details of the product that opens.")
    public void the_user_clicks_on_one_of_the_available_options_and_views_the_details_of_the_product_that_opens() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
