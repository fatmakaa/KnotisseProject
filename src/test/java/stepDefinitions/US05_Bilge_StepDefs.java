package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import pages.SeatingPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US05_Bilge_StepDefs {
    HomePage homePage = new HomePage();
    SeatingPage seatingPage = new SeatingPage();



    //-------------------------------------------TC01---------------------------------------------------------------

    @Given("the user is on the homepage")
    public void the_user_is_on_the_homepage() {
        Driver.getDriver().get(ConfigReader.getProperty("baseUrl"));


    }
    @When("the user navigates to the seating category section")
    public void the_user_navigates_to_the_seating_category_section() {
        seatingPage.titleOfSeating.click();

    }
    @Then("the {string} category name should be visible")
    public void the_category_name_should_be_visible(String string) {
       String titleSeating = seatingPage.titleOfSeating.getText();
        Assert.assertEquals("SEATING",titleSeating);

    }

    //-------------------------------------------TC02--------------------------------------------------------------
    @When("the user clicks on the {string} category")
    public void the_user_clicks_on_the_category(String string) {

    }
    @Then("a list of seating products should be displayed")
    public void a_list_of_seating_products_should_be_displayed() {

    }
    //-------------------------------------------TC03--------------------------------------------------------------

    @Then("the {string} category should be at the same hierarchical level as other categories")
    public void the_category_should_be_at_the_same_hierarchical_level_as_other_categories(String string) {

    }
    //-------------------------------------------TC04--------------------------------------------------------------

    @When("the user hovers over the favorite icon on a product image")
    public void the_user_hovers_over_the_favorite_icon_on_a_product_image() {

    }
    @Then("the {string} text should be displayed")
    public void the_text_should_be_displayed(String string) {

    }
    //-------------------------------------------TC05--------------------------------------------------------------


    @When("the user clicks the favorite icon on a product image")
    public void the_user_clicks_the_favorite_icon_on_a_product_image() {

    }
    @Then("the product should be added to the wishlist")
    public void the_product_should_be_added_to_the_wishlist() {

    }
    //-------------------------------------------TC06--------------------------------------------------------------

    @Then("the {string} section should be visible")
    public void the_section_should_be_visible(String string) {

    }
    //-------------------------------------------TC07--------------------------------------------------------------
    @Then("the number of products should be visible in the results section")
    public void the_number_of_products_should_be_visible_in_the_results_section() {

    }
    //-------------------------------------------TC08--------------------------------------------------------------
    @Then("high-resolution images of seating products should be visible on the page")
    public void high_resolution_images_of_seating_products_should_be_visible_on_the_page() {

    }
    //-------------------------------------------TC09--------------------------------------------------------------
    @Then("short descriptions of seating products should be visible on the page")
    public void short_descriptions_of_seating_products_should_be_visible_on_the_page() {

    }
    //-------------------------------------------TC10--------------------------------------------------------------
    @When("Verifies that the products should be filtered based on default sorting options")
    public void verifies_that_the_products_should_be_filtered_based_on_default_sorting_options() {

    }
    @When("the user selects Sort by popularity")
    public void the_user_selects_sort_by_popularity() {

    }
    @When("Verifies that the products should be filtered according to popularity")
    public void verifies_that_the_products_should_be_filtered_according_to_popularity() {

    }
    @When("the user selects Sort by average rating")
    public void the_user_selects_sort_by_average_rating() {

    }
    @When("Verifies that the products should be filtered according to average rating")
    public void verifies_that_the_products_should_be_filtered_according_to_average_rating() {

    }
    @When("the user selects Sort by latest")
    public void the_user_selects_sort_by_latest() {

    }
    @When("Verifies that the products should be filtered according to the latest")
    public void verifies_that_the_products_should_be_filtered_according_to_the_latest() {


    }

}
