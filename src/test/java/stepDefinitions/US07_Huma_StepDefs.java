package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.HomePage;
import pages.VintageRugsPage;
import utilities.ActionsUtils;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.junit.Assert.*;

public class US07_Huma_StepDefs {
    VintageRugsPage vintageRugsPage = new VintageRugsPage();
    HomePage homePage = new HomePage();
    Select  dropdown;


    @Given("Go to the website")
    public void goToTheWebsite() {
        Driver.getDriver().get(ConfigReader.getProperty("baseUrl"));
    }

    @When("Hover over the {string} category on the homepage")
    public void clickOnTheCategoryOnTheHomepage(String category) {
        vintageRugsPage.hoverOverCategory(category);
    }

    @And("Click on the {string} button")
    public void clickOnTheButton(String category) {
        vintageRugsPage.clickCategory(category);
    }

    @Then("Verify that the user should see the number of products listed")
    public void verifyThatTheUserShouldSeeTheNumberOfProductsListedUnderTheCategory() {
        assertTrue("The result message is not displayed!", vintageRugsPage.showingResults.isDisplayed());
        String expectedText = "results";
        String actualText = vintageRugsPage.showingResults.getText();

        assertTrue("The result message does not contain the expected text!", actualText.contains(expectedText));
    }
    @Then("Verify that the user sees sorting options like {string}, {string}, {string} and {string}")
    public void verifyThatTheUserSeesSortingOptionsLikeAnd(String optionDefault, String optionPopularity, String optionRating, String optionLatest) {

        dropdown = new Select(vintageRugsPage.dropdownSorting);
        List<WebElement> options = dropdown.getOptions();

        List<String> optionTexts = new ArrayList<>();
        for (WebElement option : options) {
            optionTexts.add(option.getText());
        }

        assertTrue("Default sorting option is not present.", optionTexts.contains(optionDefault));
        assertTrue("Sort by popularity option is not present.", optionTexts.contains(optionPopularity));
        assertTrue("Sort by average rating option is not present.", optionTexts.contains(optionRating));
        assertTrue("Sort by latest option is not present.", optionTexts.contains(optionLatest));
    }

    @When("Select {string}")
    public void select(String option) {
        dropdown = new Select(vintageRugsPage.dropdownSorting);
        dropdown.selectByVisibleText(option);
    }

    @Then("Verify that the products are {string}")
    public void verifyThatTheProductsAreSortedByPopularity(String option) {
        dropdown = new Select(vintageRugsPage.dropdownSorting);
        WebElement selectedOption = dropdown.getFirstSelectedOption();
        String selectedText = selectedOption.getText();

        assertTrue("Products are not "+option, selectedText.contains(option));

    }
    //.............................
    Random random = new Random();
    @And("Clicks on any product")
    public void clicksOnAnyProduct() {

        int randomProductIndex = new Random().nextInt(vintageRugsPage.randomProductList.size());
        WebElement randomProduct = vintageRugsPage.randomProductList.get(randomProductIndex);

        randomProduct.click();
    }

    @Then("Verify that when the user hovers over the product image, it zooms in")
    public void seesThatWhenTheUserHoversOverTheProductImageItZoomsIn() {

        ActionsUtils.actionsHoverOverOnElement(vintageRugsPage.productImage);

       assertTrue("Image enlargement verification failed", vintageRugsPage.getProductImageZoom.isDisplayed());
    }

    @And("Verifies that the product detail page displays high-resolution images, detailed description, dimensions, material information, and other relevant details")
    public void verifiesThatTheProductDetailPageDisplaysHighResolutionImagesDetailedDescriptionDimensionsMaterialInformationAndOtherRelevantDetails() {
        assertTrue("Product information could not be displayed.", vintageRugsPage.productInfo.isDisplayed());
    }
    //....................................
    //....................................

    @Then("Verify that the product detail page display sections {string}, {string}, {string}, and {string}")
    public void verifyThatTheProductDetailPageDisplaySectionsAnd(String newArrivals, String productCategory, String productSearch, String followInstagram) {

        assertTrue(newArrivals+" could not be displayed.", homePage.newArrivals.isDisplayed());
        assertTrue(productCategory+" could not be displayed.", homePage.productCategory.isDisplayed());
        assertTrue(productSearch+" could not be displayed.", homePage.productSearch.isDisplayed());
        assertTrue(followInstagram+" could not be displayed.", homePage.followInstagram.isDisplayed());
    }

    @And("Verify that the ADD TO QUOTE LIST button should be visible and clickable")
    public void verifyThatTheButtonShouldBeVisibleAndClickable() {
        assertTrue("Button could not be displayed.", vintageRugsPage.addToQuoteListButton.isDisplayed());
        assertTrue("Button could not be clickable.", vintageRugsPage.addToQuoteListButton.isEnabled());
    }

    @When("Click the ADD TO QUOTE LIST button")
    public void clickTheButton() {
        vintageRugsPage.addToQuoteListButton.click();
        ReusableMethods.visibleWait(vintageRugsPage.productAddedSuccessText,5);
    }

    @Then("Verify that the product should be added to the quote list and the quote list should be updated")
    public void verifyThatTheProductShouldBeAddedToTheQuoteListAndTheQuoteListShouldBeUpdated() {

        assertTrue("Product could not be added to the quote list and the quote list could not be updated.", vintageRugsPage.productAddedSuccessText.isDisplayed());
    }
    //........................

    @Then("Verify that {string}, {string}, {string} and {string} sections are visible")
    public void verifyThatAndSectionsAreVisible(String description, String additionalInformation, String relatedProducts, String search) {
        assertTrue(description+" section is not visible.",vintageRugsPage.description.isDisplayed());
        assertTrue(additionalInformation+" section is not visible.",vintageRugsPage.additionalInformation.isDisplayed());
        assertTrue(relatedProducts+" section is not visible.",vintageRugsPage.relatedProducts.isDisplayed());
        assertTrue(search+" section is not visible.",vintageRugsPage.searchInputBottomOgPage.isDisplayed());
        assertTrue(search+" section is not visible.",vintageRugsPage.searchInputTopOgPage.isDisplayed());
    }

   }
