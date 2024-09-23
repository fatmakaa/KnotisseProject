package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.VintageRugsPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class US07_Huma_StepDefs {
    VintageRugsPage vintageRugsPage = new VintageRugsPage();
    Select dropdown;

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
        String expectedText = "results";  // Beklenen mesaj
        String actualText = vintageRugsPage.showingResults.getText();  // Sayfadaki gerçek mesaj

        // Beklenen mesajın ekranda olup olmadığını kontrol et
        assertTrue("The result message does not contain the expected text!", actualText.contains(expectedText));
    }

    @Then("Verify that the user sees sorting options like {string}, {string}, {string} and {string}")
    public void verifyThatTheUserSeesSortingOptionsLikeAnd(String optionDefault, String optionPopularity, String optionRating, String optionLatest) {
        dropdown = new Select(vintageRugsPage.dropdownSorting);

        // Menüdeki tüm seçenekleri liste olarak alalım
        List<WebElement> options = dropdown.getOptions();

        // Seçeneklerin text'lerini bir listeye aktaralım
        List<String> optionTexts = new ArrayList<>();
        for (WebElement option : options) {
            optionTexts.add(option.getText());
        }

        // Gelen argümanlarla karşılaştırma yapalım
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
        // Şu anki seçili olan öğeyi alalım
        WebElement selectedOption = dropdown.getFirstSelectedOption();

        // Seçili öğenin text'ini kontrol edelim
        String selectedText = selectedOption.getText();

        // Seçili öğenin "Sort by popularity" olduğunu doğrulayalım
        assertTrue("Products are not "+option, selectedText.contains(option));

    }

}
