package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.HomePage;
import utilities.ReusableMethods;

public class US19_Fatma_StepDefs {

    HomePage homePage = new HomePage();
//----------------------------------------------------------TC01------------------------------------------------------------------------------

    @Then("Verify that the My E-mail Preferences category is visible under My Account")
    public void verify_that_the_my_e_mail_preferences_category_is_visible_under_my_account() {

        ReusableMethods.flashElement(homePage.myEmailPreferences);
        Assert.assertTrue(homePage.myEmailPreferences.isDisplayed());

    }

    //----------------------------------------------------------TC02------------------------------------------------------------------------------
    @When("user logs in")
    public void user_logs_in() {
        homePage.loginRegister.click();
        ReusableMethods.flashElement(homePage.loginRegister);
        homePage.userNameOrEmailTextBox.sendKeys("fatmakrms044@gmail.com");
        homePage.passwordTextBox.sendKeys("KNOTISEFATMA");
        homePage.logInButton.click();

    }

    @When("clicks on the My E-mail Preferences link under My Account")
    public void clicks_on_the_my_e_mail_preferences_link_under_my_account() {

        homePage.myEmailPreferences.click();

    }

    @Then("verifies that the user is able to view their current e-mail preferences \\(subscriptions, newsletters, promotions, etc.)")
    public void verifies_that_the_user_is_able_to_view_their_current_e_mail_preferences_subscriptions_newsletters_promotions_etc() {

        Assert.assertFalse(homePage.myEmailPreferences.isDisplayed());

    }


//----------------------------------------------------------TC03------------------------------------------------------------------------------

    @Then("verifies that the user is able to check the relevant boxes to change their preferences \\(unsubscribe or subscribe)")
    public void verifies_that_the_user_is_able_to_check_the_relevant_boxes_to_change_their_preferences_unsubscribe_or_subscribe() {


        Assert.assertFalse(homePage.myEmailPreferences.isDisplayed());

    }


//----------------------------------------------------------TC04------------------------------------------------------------------------------

    @When("changes the subscription preferences")
    public void changes_the_subscription_preferences() {

    }

    @When("updates the preferences")
    public void updates_the_preferences() {

    }

    @Then("verifies that the user receives a confirmation message indicating that the changes were successfully saved")
    public void verifies_that_the_user_receives_a_confirmation_message_indicating_that_the_changes_were_successfully_saved() {

    }


}
