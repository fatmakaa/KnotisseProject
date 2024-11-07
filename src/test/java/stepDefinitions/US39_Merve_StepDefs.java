package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HomePage;
import pages.VintageRugsPage;
import utilities.ActionsUtils;
import utilities.ConfigReader;
import utilities.ReusableMethods;

public class US39_Merve_StepDefs {

    HomePage homePage = new HomePage();
    VintageRugsPage vintageRugsPage = new VintageRugsPage();

    @And("Clicks on vintage rugs")
    public void clicks_on_vintage_rugs() {
        homePage.vintageRugsMenu.click();
    }

    @Then("Clicks on the first product")
    public void clicks_on_the_first_product() {
        vintageRugsPage.firstProductInPage.click();
    }

    @Then("Clicks Add to wishlist")
    public void clicks_add_to_wishlist() {
        Assert.assertTrue("Add to wish list button doesn't display", vintageRugsPage.addToWishListButton.isDisplayed());
    }

    @Then("Click on “browse wishlist” that appears after clicking.")
    public void click_on_browse_wishlist_that_appears_after_clicking() {
    }

    @Then("It should be able to delete the added product by clicking on the cross icon.")
    public void it_should_be_able_to_delete_the_added_product_by_clicking_on_the_cross_icon() {
    }


    @Then("He she sees the product he she added in the wishlist.")
    public void heSheSeesTheProductHeSheAddedInTheWishlist() {
    }

    @Then("Adds the first two products to the wishlist via the heart icon next to the product.")
    public void addsTheFirstTwoProductsToTheWishlistViaTheHeartIconNextToTheProduct() {
        ReusableMethods.click(vintageRugsPage.firstProductInPage);
        ActionsUtils.actionsHoverOverOnElement(vintageRugsPage.iconHeart);
        vintageRugsPage.addToWishListButtonInHEartIcon.click();
        homePage.vintageRugsMenu.click();
        ReusableMethods.click(vintageRugsPage.secondProductInPage);
        ActionsUtils.actionsHoverOverOnElement(vintageRugsPage.iconHeart);
        vintageRugsPage.addToWishListButtonInHEartIcon.click();
    }

    @Then("Clicks on the heart icon")
    public void clicksOnTheHeartIcon() {

        vintageRugsPage.iconHeartInTheTopOfPage.click();
    }

    @Then("In the window that opens, it should be able to see the products it has added before.")
    public void inTheWindowThatOpensItShouldBeAbleToSeeTheProductsItHasAddedBefore() {
        Assert.assertTrue(vintageRugsPage.firstProductNameInWishList.getText().contains(ConfigReader.getProperty("secondProductInVintageRugsTitle")));
        Assert.assertTrue(vintageRugsPage.secondProductNameInWishList.getText().contains(ConfigReader.getProperty("firstProductInVintageRugsTitle")));

    }

    @And("Verifies that it can delete the products it has added by clicking on the cross icon")
    public void verifiesThatItCanDeleteTheProductsItHasAddedByClickingOnTheCrossIcon() {
        vintageRugsPage.deleteIconINWishList.click();
        Assert.assertEquals(vintageRugsPage.deleteMessage.getText(), ConfigReader.getProperty("deletedMessage"));
        vintageRugsPage.deleteIconINWishList.click();
        Assert.assertEquals(vintageRugsPage.deleteMessage.getText(), ConfigReader.getProperty("deletedMessage"));
    }

    @Then("Go to My account and click on wishlist.")
    public void goToMyAccountAndClickOnWishlist() {
        homePage.myAccountIcon.click();
        homePage.wishlistMenuInMyAccount.click();
    }
}
