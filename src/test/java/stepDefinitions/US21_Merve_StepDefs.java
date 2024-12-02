package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.ReusableMethods;

public class US21_Merve_StepDefs {

    HomePage homePage = new HomePage();

    @Given("The user scrolls to the bottom of the page")
    public void theUserScrollsToTheBottomOfThePage() {
        ReusableMethods.scrollEnd();
    }

    @Then("The user clicks the Shipping & Returns link in the Customer Service section")
    public void theUserClicksTheShippingReturnsLinkInTheCustomerServiceSection() {
        homePage.shippingAndReturnsMenu.click();
    }

    @And("It is verified that the user is on the Shipping & Returns page within the Service section")
    public void itIsVerifiedThatTheUserIsOnTheShippingReturnsPageWithinTheServiceSection() {
        Assert.assertEquals(homePage.shippingAndReturnsPageTitle.getText(), ConfigReader.getProperty("shippingAndReturnPageTitle"));
    }

    @Then("The user verifies that the Shipping & Returns page contains text explaining the shipping and return policies")
    public void theUserVerifiesThatTheShippingReturnsPageContainsTextExplainingTheShippingAndReturnPolicies() {
        Assert.assertTrue(homePage.returnAndCancellationPolicyInShippingAndReturnsPage.isDisplayed());
    }

    @Then("Verifies that the shipping and return policies on the Shipping & Returns page clearly explain how orders are shipped and how the return processes work")
    public void verifiesThatTheShippingAndReturnPoliciesOnTheShippingReturnsPageClearlyExplainHowOrdersAreShippedAndHowTheReturnProcessesWork() {
        Assert.assertTrue(homePage.orderingProcedureInShippingAndReturnsPage.isDisplayed());
        Assert.assertTrue(homePage.returnAndCancellationPolicyInShippingAndReturnsPage.isDisplayed());
    }

}
