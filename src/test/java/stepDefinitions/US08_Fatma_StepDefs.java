package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import pages.AntiqueRugsPage;
import pages.HomePage;
import pages.RandomPage;
import utilities.ActionsUtils;
import utilities.JSUtils;
import utilities.ReusableMethods;
import utilities.WaitUtils;

import static utilities.Driver.getDriver;

public class US08_Fatma_StepDefs {
    HomePage homePage = new HomePage();
    AntiqueRugsPage antiqueRugsPage = new AntiqueRugsPage();

    RandomPage randomPage = new RandomPage();


    //------------------------------------------------TC01-------------------------------------------------------------


    @Then("user clicks on the ANTIQUE RUGS tab")
    public void user_clicks_on_the_antique_rugs_tab() {
        homePage.antiqueRugs.click();
    }

    @Then("user should see a list of various rug models")
    public void user_should_see_a_list_of_various_rug_models() {
        Assert.assertTrue(antiqueRugsPage.resultOfList.getText().contains("results"));

    }

    @Then("user should be able to filter the rug models by Default sorting, Sort by popularity, Sort by average rating, Sort by latest")
    public void user_should_be_able_to_filter_the_rug_models_by() {

        Select select = new Select(antiqueRugsPage.orderDropdown);
        select.selectByVisibleText("Sort by average rating");
        String selectedOption = select.getFirstSelectedOption().getText();
        Assert.assertEquals("Sort by average rating", selectedOption);

        Select select2 = new Select(antiqueRugsPage.orderDropdown);
        select.selectByVisibleText("Sort by popularity");
        String selectedOption2 = select.getFirstSelectedOption().getText();
        Assert.assertEquals("Sort by popularity", selectedOption2);

        Select select3 = new Select(antiqueRugsPage.orderDropdown);
        select.selectByVisibleText("Sort by latest");
        String selectedOption3 = select.getFirstSelectedOption().getText();
        Assert.assertEquals("Sort by latest", selectedOption3);

        Select select1 = new Select(antiqueRugsPage.orderDropdown);
        select.selectByVisibleText("Default sorting");
        String selectedOption1 = select.getFirstSelectedOption().getText();
        Assert.assertEquals("Default sorting", selectedOption1);


    }

    @Then("when the user hovers over the product image, should be able to click ADD TO WISHLIST")
    public void when_the_user_hovers_over_the_product_image_should_be_able_to_click_add_to_wishlist() throws InterruptedException {


        ActionsUtils.actionsHoverOverOnElement(antiqueRugsPage.firstProduct);
        ActionsUtils.actionsHoverOverOnElement(antiqueRugsPage.heartIconOfFirstP);
        Thread.sleep(2000);
        antiqueRugsPage.heartClick.click();
        Thread.sleep(2000);

    }

    @Then("when the user clicks on ADD TO WISHLIST, the product should be added to the wishlist")
    public void when_the_user_clicks_on_add_to_wishlist_the_product_should_be_added_to_the_wishlist() throws InterruptedException {

        WaitUtils.waitForVisibility(randomPage.productAddedPopUp, 3);
        ReusableMethods.flashElement(randomPage.productAddedPopUp);
        Assert.assertTrue(randomPage.productAddedPopUp.isDisplayed());
    }

    @Then("when the user hovers over the product image, should be able to click on Quick View")
    public void when_the_user_hovers_over_the_product_image_should_be_able_to_click_on_quick_view() throws InterruptedException {

        ActionsUtils.actionsHoverOverOnElement(antiqueRugsPage.firstProduct);
        randomPage.quickView.click();
        ReusableMethods.flashElement(antiqueRugsPage.quickViewPanel);
        Assert.assertTrue(antiqueRugsPage.quickViewPanel.isDisplayed());
        antiqueRugsPage.quickViewPanelClose.click();

    }

    @Then("the user clicks the Filter option")
    public void the_user_clicks_the_filter_option() {

        JSUtils.JSscrollIntoView(antiqueRugsPage.filter);
        antiqueRugsPage.filter.click();
    }

    @Then("the user clicks on Black for filtering the colour")
    public void the_user_clicks_on_black_for_filtering_the_colour() {

        antiqueRugsPage.blackInFilter.click();


    }

    @Then("the products matching the filter criteria should be listed")
    public void the_products_matching_the_filter_criteria_should_be_listed() {

        JSUtils.JSscrollIntoView(antiqueRugsPage.firstBlackProductTitle);
        Assert.assertTrue(antiqueRugsPage.firstBlackProductTitle.getText().contains("Black"));

    }


    //------------------------------------------------TC02-------------------------------------------------------------

    @Then("the user clicks on first product")
    public void the_user_clicks_on_first_product() throws InterruptedException {

        ActionsUtils.actionsDoubleClick(antiqueRugsPage.firstProduct);

    }

    @Then("the user should see the details of the product")
    public void the_user_should_see_high_resolution_images_detailed_descriptions_dimensions_material_information_and_other_relevant_details_of_the_product_on_the_product_detail_page() {

        Assert.assertTrue(antiqueRugsPage.titleOfFirstP.getText().contains("Antique Central Anatolia"));
    }

    @Then("the ADD to QUOTE LIST button should be visible and clickable")
    public void the_add_to_quote_list_button_should_be_visible_and_clickable() {

        ReusableMethods.flashElement(antiqueRugsPage.addToQlist);
    }

    @When("the user clicks the ADD to QUOTE LIST button")
    public void the_user_clicks_the_add_to_quote_list_button() {

        antiqueRugsPage.addToQlist.click();
    }

    @Then("the product should be added to the cart")
    public void the_product_should_be_added_to_the_cart() {

        Assert.assertTrue(antiqueRugsPage.viewQlist.getText().contains("View Quote List"));

    }


    //------------------------------------------------TC03-------------------------------------------------------------


    @When("the user clicks on the Home link")
    public void the_user_clicks_on_the_link() {

        homePage.homePageLink.click();
    }

    @Then("the homepage should be displayed")
    public void the_homepage_should_be_displayed() {

        Assert.assertTrue(homePage.homePageAssert.isDisplayed());
    }


}