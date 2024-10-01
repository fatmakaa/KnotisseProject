package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.CataloguePage;
import pages.HomePage;
import pages.PillowsPage;
import pages.RandomPage;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.WaitUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class US03_Merve_StepDefs {

    HomePage homePage = new HomePage();
    CataloguePage cataloguePage = new CataloguePage();
    RandomPage randomPage = new RandomPage();
    PillowsPage pillowsPage = new PillowsPage();
    Random rnd = new Random();
    WaitUtils waitUtils = new WaitUtils();
    Select dropdown;

    @Then("The user clicks on the search icon.")
    public void the_user_clicks_on_the_search_icon() {
        ReusableMethods.click(homePage.searchButtonTopOfHomePage);
    }

    @Then("The user types {string} into the search box.")
    public void the_user_types_into_the_search_box(String string) {
        ReusableMethods.visibleWait(homePage.searchButtonTopOfHomePage, 2);
        homePage.searchButtonTopOfHomePage.sendKeys(string);
    }

    @Then("The user clicks the search button.")
    public void the_user_clicks_the_search_button() {
        ReusableMethods.click(homePage.searchButtonAfterClickSearchButton);
    }

    @Then("The user sees the total number of results displayed in the window that opens.")
    public void the_user_sees_the_total_number_of_results_displayed_in_the_window_that_opens() {
        Assert.assertTrue("The user doesn't see the total number of results displayed in the window that opens.",
                cataloguePage.numberOfResultsAfterProductSearch.isDisplayed());
    }

    @Then("The user clicks on the first product.")
    public void the_user_clicks_on_the_first_product() {
        ReusableMethods.click(randomPage.firstProductAfterAnatolianKilimRugSearch);
    }

    @Then("The user views the details of the selected product.")
    public void the_user_views_the_details_of_the_selected_product() {
        ReusableMethods.visibleWait(randomPage.titleOfAfterProductSearch, 5);
        Assert.assertTrue("The user doesn't view the details of the selected product",
                randomPage.titleOfAfterProductSearch.isDisplayed());
    }

    @Then("The user returns to the search box and searches for another specific product.")
    public void the_user_returns_to_the_search_box_and_searches_for_another_specific_product() {
        ReusableMethods.click(homePage.searchButtonTopOfHomePage);
        List<String> randomTitleList = Arrays.asList("ANTIQUE RUGS", "KNOTISSE PRODUCTION", "SEATING", "THROW PILLOWS", "UPHOLSTERY", "VINTAGE");
        for (int i = 0; i < 5; ) {
            int randomIndex = rnd.nextInt(randomTitleList.size());
            homePage.searchButtonTopOfHomePage.sendKeys(randomTitleList.get(randomIndex));
            break;
        }
        ReusableMethods.click(homePage.searchButtonAfterClickSearchButton);
    }

    //   @Then("The user clicks on one of the available options and views the details of the product that opens.")
    //  public void the_user_clicks_on_one_of_the_available_options_and_views_the_details_of_the_product_that_opens() {
    //    int randomNumber = 1 + rnd.nextInt(7);
    //        Map<String, String> productCategories = new HashMap<String, String>() {{
    //            put("All", "Authentic"); put("ANTIQUE RUGS", "Antique"); put("KNOTISSE PRODUCTION", "Handmade"); put("SEATING", "Handmade"); put("THROW PILLOWS", "Throw Pillow"); put("UPHOLSTERY", "Upholstery"); put("VINTAGE", "Vintage");
    //        }};
//            ReusableMethods.click(homePage.searchButtonTopOfHomePage);
//
//                String[] keys = productCategories.keySet().toArray(new String[0]);
//                String randomKey = keys[new Random().nextInt(keys.length)];
//                homePage.searchBox.sendKeys(randomKey);
//                homePage.searchButtonAfterClickSearchButton.click();
//                System.out.println("cataloguePage.searchResultsForText.getText() = " + cataloguePage.searchResultsForText.getText());

    //      for (Map.Entry<String, String> entry : productCategories.entrySet()) {
    //              if (cataloguePage.searchResultsForText.getText().contains(entry.getKey())) {
    //                  WebElement randomProduct = Driver.getDriver().findElement(By.xpath("(//a[contains(.,'" + entry.getValue() + "')])[" + randomNumber + "]"));
    //                  JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
    //                  js.executeScript("arguments[0].click();", randomProduct);
    //                  System.out.println("randomProduct = " + randomProduct);
    //              }
    //          }
    //      ReusableMethods.wait(5);
    //      ReusableMethods.visibleWait(randomPage.titleOfAfterProductSearch, 5);
    //      Assert.assertTrue("The user doesn't view the details of the selected product",
    //              randomPage.titleOfAfterProductSearch.isDisplayed());
    //   }


    @Then("On the results page, the user sees the total number of search results.")
    public void on_the_results_page_the_user_sees_the_total_number_of_search_results() {

        if (!Driver.getDriver().findElements(By.xpath("//div[@class='message-container container medium-text-center']")).isEmpty()) {

            if (pillowsPage.noProductsWereFoundMatchingYourSelectionText.isDisplayed()) {
                Assert.assertFalse("clickable to related product",
                        pillowsPage.noProductsWereFoundMatchingYourSelectionText.isDisplayed());
            }
        } else {
            Assert.assertTrue("On the results page, the user doesn't see the total number of search results.",
                    cataloguePage.numberOfResultsAfterProductSearch.isDisplayed());
        }
    }


    @Then("The user accesses the details of the selected product.")
    public void the_user_accesses_the_details_of_the_selected_product() {
        ReusableMethods.visibleWait(randomPage.titleOfAfterProductSearch, 5);
        Assert.assertTrue("The user doesn't access the details of the selected product.",
                randomPage.titleOfAfterProductSearch.isDisplayed());
    }


    @Then("The user sorts the products based on their preference by selecting an option from the Relevance dropdown chooses {string}.")
    public void the_user_sorts_the_products_based_on_their_preference_by_selecting_an_option_from_the_relevance_dropdown_chooses(String string) {
        cataloguePage.catalogueMenu.click();
        WebElement sortByElement = Driver.getDriver().findElement(By.xpath("//*[text()='" + string + "']"));
        ReusableMethods.click(sortByElement);
    }


    @Then("While on the {string}, the user clicks on the search button.")
    public void whileOnTheTheUserClicksOnTheSearchButton(String option) {
        dropdown = new Select(homePage.searchDropdown);
        ReusableMethods.wait(6);
        dropdown.selectByVisibleText(option);
        waitUtils.waitForClickablility(homePage.searchButtonAfterClickSearchButton, 10);
        ReusableMethods.click(homePage.searchButtonAfterClickSearchButton);
        ReusableMethods.scrollHome();

    }


    @Then("The user clicks on any product with the {string}")
    public void theUserClicksOnAnyProductWithThe(String title) {
        int randomNumber = 1 + rnd.nextInt(8);
        WebElement randomProduct = Driver.getDriver().findElement(By.xpath("(//a[contains(.,'" + title + "')])[" + randomNumber + "]"));
        ReusableMethods.wait(6);
        try {
            waitUtils.waitForClickablility(randomProduct, 10);
            ReusableMethods.click(randomProduct);
        } catch (StaleElementReferenceException e) {

        }
        ReusableMethods.wait(5);
    }


    @And("The user sorts the products based on their preference by selecting an option from the Relevance dropdown chooses {string}, {string}, {string}, {string}.")
    public void theUserSortsTheProductsBasedOnTheirPreferenceBySelectingAnOptionFromTheRelevanceDropdownChooses(String defaultSorting, String sortByPopularity, String sortByAverageRating, String sortByLatest) {
        String[] sortingOptions = {defaultSorting, sortByPopularity, sortByAverageRating, sortByLatest};
        int randomIndex = rnd.nextInt(sortingOptions.length);
        String randomSelectedOption = sortingOptions[randomIndex];
        for (WebElement randomSortingOption : randomPage.randomSortingDropdown) {
            if (randomSortingOption.getText().equalsIgnoreCase(randomSelectedOption)) {
                ReusableMethods.click(randomSortingOption);
                break;
            }
        }
        ReusableMethods.wait(5);
    }
}
