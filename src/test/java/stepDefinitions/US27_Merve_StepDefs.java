package stepDefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HomePage;
import pages.KnotisseComPage;

public class US27_Merve_StepDefs {

    HomePage homePage = new HomePage();
    KnotisseComPage knotisseComPage = new KnotisseComPage();

    @Then("Verify that the {string} page is available in the information area at the bottom of the page.")
    public void verifyThatThePageIsAvailableInTheInformationAreaAtTheBottomOfThePage(String contactText) {
        Assert.assertEquals(homePage.contactTextInBottomOfThePage.getText(), contactText);
    }

    @Then("Verify that the {string} link is clickable by scrolling down the Contact page.")
    public void verifyThatTheLinkIsClickableByScrollingDownTheContactPage(String ourStoresText) {
        Assert.assertEquals(homePage.ourStoresTextInBottomOfThePage.getText(), ourStoresText);
    }

    @Then("Verify that by clicking on the Our Stores link at the bottom of the page, the user is redirected to a page with the addresses, contact information and opening hours of the company's physical stores.")
    public void verifyThatByClickingOnTheOurStoresLinkAtTheBottomOfThePageTheUserIsRedirectedToAPageWithTheAddressesContactInformationAndOpeningHoursOfTheCompanySPhysicalStores() {
        homePage.ourStoresTextInBottomOfThePage.click();
        Assert.assertTrue(knotisseComPage.ourStoresPageTitle.isDisplayed());
    }

    @Then("Verify that the stores page has features such as the ability to show the location on the map for each store.")
    public void verifyThatTheStoresPageHasFeaturesSuchAsTheAbilityToShowTheLocationOnTheMapForEachStore() {
        homePage.ourStoresTextInBottomOfThePage.click();
        Assert.assertTrue(knotisseComPage.istanbulShowroomTitle.isDisplayed());
        Assert.assertTrue(knotisseComPage.usakFacilityTitle.isDisplayed());
    }
}
