package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.HomePage;
import pages.RandomPage;
import utilities.JSUtils;

public class US20_Fatma_StepDefs {

    HomePage homePage = new HomePage();
    RandomPage randomPage = new RandomPage();


//----------------------------------------------------------------------TC01-----------------------------------------------------------------------------------
    @When("user goes to the bottom of the page")
    public void user_goes_to_the_bottom_of_the_page() {

        JSUtils.JSscrollAllTheWayDown();

    }

    @When("clicks the {string} link in my Customer Service section")
    public void clicks_the_link_in_my_customer_service_section(String string) {

        homePage.privacyPolicy.click();


    }
    @Then("the user should be able to see and click the {string} link in the Customer Service section")
    public void the_user_should_be_able_to_see_and_click_the_link_in_the_customer_service_section(String string) {

        Assert.assertTrue(randomPage.assertPrivacyPolicy.getText().contains(string));


    }


//----------------------------------------------------------------------TC02-----------------------------------------------------------------------------------

    @Then("on the {string} page, the user verifies that the privacy policy text is present")
    public void on_the_page_the_user_verifies_that_the_privacy_policy_text_is_present(String string) {

        Assert.assertTrue(randomPage.assertPrivacyPolicy.getText().contains(string));

    }


//----------------------------------------------------------------------TC03-----------------------------------------------------------------------------------

    @Then("verifies that the {string} page clearly and transparently explains how personal data is collected and used")
    public void verifies_that_the_page_clearly_and_transparently_explains_how_personal_data_is_collected_and_used(String string) {

        Assert.assertTrue(randomPage.assertPrivacyPolicy.getText().contains(string));

    }





}
