package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.HomePage;
import pages.KnotisseProductionPage;
import utilities.*;

public class US41_Merve_StepDefs {

    HomePage homePage = new HomePage();
    KnotisseProductionPage knotisseProductionPage = new KnotisseProductionPage();

    @Then("The user hovers over the title Knotisse Production.")
    public void theUserHoversOverTheTitleKnotisseProduction() {
        ActionsUtils.actionsHoverOverOnElement(homePage.knotisseProductionMenu);
    }

    @Then("The user clicks on {string} and confirms that they have been redirected to the relevant page.")
    public void theUserClicksOnAndConfirmsThatTheyHaveBeenRedirectedToTheRelevantPage(String relatedMenuName) {
        ActionsUtils.actionsHoverOverOnElement(homePage.knotisseProductionMenu);
        WaitUtils.waitForClickablility(knotisseProductionPage.getCategoryElement(relatedMenuName), 10);
        ReusableMethods.click(knotisseProductionPage.getCategoryElement(relatedMenuName));
        Assert.assertTrue("The main title doesn't display", knotisseProductionPage.mainTitleInPage.isDisplayed());
    }

    @Then("The user clicks on Knotisse Production menu")
    public void theUserClicksOnKnotisseProductionMenu() {
        homePage.knotisseProductionMenu.click();
    }


    @Then("The user clicks on the Quick view of the first product.")
    public void theUserClicksOnTheQuickViewOfTheFirstProduct() {
        ReusableMethods.click(knotisseProductionPage.oldYarnCarpetsMenu);
        ReusableMethods.click(knotisseProductionPage.quickViewButton);
    }

    @And("The user sees the detailed information of the product and the item number.")
    public void theUserSeesTheDetailedInformationOfTheProductAndTheItemNumber() {
        ReusableMethods.visibleWait(knotisseProductionPage.titleInProductDetails, 5);
        Assert.assertTrue("Title in the product details pop-up doesn't display", knotisseProductionPage.titleInProductDetails.isDisplayed());
    }

    @Then("Clicks on the heart icon on the first product")
    public void clicksOnTheHeartIconOnTheFirstProduct() {
        ReusableMethods.click(knotisseProductionPage.heartIconInTheFirstProduct);
    }

    @Then("The user sees the message “Product Added”.")
    public void theUserSeesTheMessageProductAdded() {
        Assert.assertTrue("Product added! pop-up doesn't display", knotisseProductionPage.productAddedPopUp.isDisplayed());
    }

    @Then("The user clicks on the “Wishlist” \\(Heart) button on the page.")
    public void theUserClicksOnTheWishlistHeartButtonOnThePage() {
        knotisseProductionPage.iconHeartInTheTopOfPage.click();
    }

    @And("The user confirms that the selected product has been added to the Whishlist.")
    public void theUserConfirmsThatTheSelectedProductHasBeenAddedToTheWhishlist() {
        Assert.assertTrue("Product title in the wishlist doesn't display", knotisseProductionPage.productTitleInWishListPage.isDisplayed());
    }

    @Then("The user clicks on the first product on the knotisse production page.")
    public void theUserClicksOnTheFirstProductOnTheKnotisseProductionPage() {
        ReusableMethods.click(knotisseProductionPage.oldYarnCarpetsMenu);
        ReusableMethods.wait(4);
        ReusableMethods.click(knotisseProductionPage.firstProductInThePage);
    }

    @Then("User clicks on “ADD to QUOTE LIST”.")
    public void userClicksOnADDToQUOTELIST() {
        ReusableMethods.click(knotisseProductionPage.addToQuoteListButton);
    }

    @Then("User clicks Wiew Quote list.")
    public void userClicksWiewQuoteList() {
        ReusableMethods.click(knotisseProductionPage.viewQuoteListButton);
    }

    @And("Confirms that the selected product has been added to the Quote List.")
    public void confirmsThatTheSelectedProductHasBeenAddedToTheQuoteList() {
        Driver.getDriver().switchTo().defaultContent();
        ReusableMethods.flashElement(knotisseProductionPage.firstProductTitleInTheQuoteList);
        Assert.assertTrue("First product in the quote list doesn't display", knotisseProductionPage.firstProductTitleInTheQuoteList.isDisplayed());
    }

    @Then("The user verifies that the page has the Product Category option.")
    public void theUserVerifiesThatThePageHasTheProductCategoryOption() {
        ReusableMethods.scroll(knotisseProductionPage.newArrivalsTitleInThePage);
        Assert.assertTrue("The product category heading at the bottom of the page is not visible.", knotisseProductionPage.productCategoryTitleInThePage.isDisplayed());
    }

    @Then("The user verifies that the page has the New Arrivals option.")
    public void theUserVerifiesThatThePageHasTheNewArrivalsOption() {
        Assert.assertTrue("The new arrivals heading at the bottom of the page is not visible.", knotisseProductionPage.newArrivalsTitleInThePage.isDisplayed());
    }

    @Then("The user verifies that the page has the Follow us Instagram option.")
    public void theUserVerifiesThatThePageHasTheFollowUsInstagramOption() {
        Assert.assertTrue("The follow us on instagram heading at the bottom of the page is not visible.", knotisseProductionPage.followUsOnInstagramTitleInThePage.isDisplayed());
    }

    @And("The user verifies that the page has the Product Search option.")
    public void theUserVerifiesThatThePageHasTheProductSearchOption() {
        Assert.assertTrue("Product search heading at the bottom of the page is not visible.", knotisseProductionPage.productSearchTitleInThePage.isDisplayed());
    }

    @Then("The user clicks the right arrow button")
    public void theUserClicksTheRightArrowButton() {
        ReusableMethods.click(knotisseProductionPage.rightArrowButton);
    }

    @Then("Confirms that the next product has been navigated to.")
    public void confirmsThatTheNextProductHasBeenNavigatedTo() {
        Assert.assertTrue("The next product title doesn't display", knotisseProductionPage.productTitle.isDisplayed());
    }

    @Then("User clicks the left arrow button")
    public void userClicksTheLeftArrowButton() {
        ReusableMethods.click(knotisseProductionPage.leftArrowButton);
    }

    @And("Confirms that it goes to the previous product.")
    public void confirmsThatItGoesToThePreviousProduct() {
        Assert.assertTrue("The previous product title doesn't display", knotisseProductionPage.productTitle.isDisplayed());
    }

    @Then("User clicks on the “HOME” button")
    public void userClicksOnTheHOMEButton() {
        ReusableMethods.click(knotisseProductionPage.homeButton);
    }

    @And("Confirms that it redirects to the home page.")
    public void confirmsThatItRedirectsToTheHomePage() {
        Assert.assertEquals("Home button didn't redirect to homepage", Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("baseUrl"));
    }

    @And("The user verifies that an out of stock product is marked “OUT OF STOCK”.")
    public void theUserVerifiesThatAnOutOfStockProductIsMarkedOUTOFSTOCK() {
        ReusableMethods.click(knotisseProductionPage.pompomMenu);
        ReusableMethods.scroll(knotisseProductionPage.outOfStockProduct);
        Assert.assertTrue("The out of stock text doesn't display.", knotisseProductionPage.textOnTheOutOfStockProduct.isDisplayed());
    }

    @Then("The user clicks on an out of stock product with the word “OUT OF STOCK”.")
    public void theUserClicksOnAnOutOfStockProductWithTheWordOUTOFSTOCK() {
        ReusableMethods.click(knotisseProductionPage.pompomMenu);
        ReusableMethods.scroll(knotisseProductionPage.outOfStockProduct);
        ReusableMethods.click(knotisseProductionPage.outOfStockProduct);
    }

    @And("Verifies that the product is marked “SOLD”.")
    public void verifiesThatTheProductIsMarkedSOLD() {
        Assert.assertTrue("The sold text doesn't display.", knotisseProductionPage.soldText.isDisplayed());
    }


}
