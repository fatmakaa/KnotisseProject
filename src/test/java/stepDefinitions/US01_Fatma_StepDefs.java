package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import pages.CataloguePage;
import pages.HomePage;
import utilities.*;


public class US01_Fatma_StepDefs {
    HomePage homePage = new HomePage();

    CataloguePage catalogue = new CataloguePage();


    //-------------------------------------------TC01---------------------------------------------------------------

    @When("user navigates to the relevant website.")
    public void user_navigates_to_the_relative_website() {
        Driver.getDriver().get(ConfigReader.getProperty("baseUrl"));
    }

    @Then("Clicks on Catalogue.")
    public void clicks_on_catalogue() {
        homePage.catalogue.click();
    }

    @Then("Verifies that related products show up.")
    public void verifies_that_related_products_show_up() {
        ReusableMethods.flashElement(homePage.catalogue);
    }

    @Then("Navigates to the New Arrivals link.")
    public void navigates_to_the_new_arrivals_link() {
        homePage.newArrivals.click();
        ReusableMethods.flashElement(homePage.newArrivals);
    }

    @Then("Clicks on Catalogue again.")
    public void clicks_on_catalogue_again() {
        homePage.catalogue.click();
    }


    // -------------------------------------------TC02---------------------------------------------------------------


    @Then("Verifies that product details are clearly displayed.")
    public void verifies_that_product_details_are_clearly_displayed() {

        Assert.assertTrue(catalogue.firstCatalogueDetail.isDisplayed());
        JSUtils.JSscrollIntoView(catalogue.firstCatalogueDetail);
        ReusableMethods.flashElement(catalogue.firstCatalogueDetail);

    }


    // -------------------------------------------TC03---------------------------------------------------------------


    @Then("Clicks on the Default sorting menu on the catalog page.")
    public void clicks_on_the_default_sorting_menu_on_the_catalog_page() {
        catalogue.orderDropdown.click();
    }

    @Then("Selects the Sort by average rating option.")
    public void selects_the_sort_by_average_rating_option() {
        Select select = new Select(catalogue.orderDropdown);
        select.selectByVisibleText("Sort by average rating");
    }

    @Then("Verifies that the sorting is done based on average rating.")
    public void verifies_that_the_sorting_is_done_based_on_average_rating() {

        Select select = new Select(catalogue.orderDropdown);
        String selectedOption = select.getFirstSelectedOption().getText();
        Assert.assertEquals("Sort by average rating", selectedOption);

    }


    // -------------------------------------------TC04---------------------------------------------------------------

    @Then("Selects the Sort by latest option.")
    public void selects_the_sort_by_latest_option() {
        Select select = new Select(catalogue.orderDropdown);
        select.selectByVisibleText("Sort by latest");
    }


    @Then("Verifies that the sorting is done based on the newest products.")
    public void verifies_that_the_sorting_is_done_based_on_the_newest_products() {

        Select select = new Select(catalogue.orderDropdown);
        String selectedOption = select.getFirstSelectedOption().getText();
        Assert.assertEquals("Sort by latest", selectedOption);

    }


    // -------------------------------------------TC05---------------------------------------------------------------

    @Then("Selects the Sort by popularity sorting option.")
    public void selects_the_sort_by_popularity_sorting_option() {

        Select select = new Select(catalogue.orderDropdown);
        select.selectByVisibleText("Sort by popularity");

    }

    @Then("Verifies  that the sorting is done based on the most popular products.")
    public void verifies_that_the_sorting_is_done_based_on_the_most_popular_products() {

        Select select = new Select(catalogue.orderDropdown);
        String selectedOption = select.getFirstSelectedOption().getText();
        Assert.assertEquals("Sort by popularity", selectedOption);

    }

}
