package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HomePage;
import utilities.ConfigReader;

public class US38_Merve_StepDefs {

    HomePage homePage = new HomePage();

    @Given("The user clicks on the Login button.")
    public void the_user_clicks_on_the_login_button() {
        homePage.loginRegisterIcon.click();
    }

    @Then("The user enters the email they registered with in the email field of the Login section.")
    public void the_user_enters_the_email_they_registered_with_in_the_email_field_of_the_login_section() {
        homePage.usernameInLoginPopup.sendKeys(ConfigReader.getProperty("emailForRegister"));
    }

    @Then("The user enters the password they previously set.")
    public void the_user_enters_the_password_they_previously_set() {
        homePage.passwordInLoginPopup.sendKeys(ConfigReader.getProperty("passwordForRegister"));
        homePage.loginInPopup.click();
    }

    @Then("The user clicks on My Account")
    public void theUserClicksOnMyAccount() {
        homePage.myAccountIcon.click();
    }

    @Then("The user clicks on Account Details")
    public void theUserClicksOnAccountDetails() {
        homePage.accountDetailsMenu.click();
    }

    @Then("The user fills in the required fields First name, Last name, Email address")
    public void the_user_fills_in_the_required_fields_first_name_last_name_email_address() {
        homePage.firstNameBoxInAccountDetailsMenu.clear();
        homePage.firstNameBoxInAccountDetailsMenu.sendKeys(ConfigReader.getProperty("validFirstNameForAccountDetailsMenu"));
        homePage.lastNameBoxInAccountDetailsMenu.clear();
        homePage.lastNameBoxInAccountDetailsMenu.sendKeys(ConfigReader.getProperty("validLastNameForAccountDetailsMenu"));
        homePage.displayNameBoxInAccountDetailsMenu.clear();
        homePage.displayNameBoxInAccountDetailsMenu.sendKeys(ConfigReader.getProperty("displayNameForAccountDetailsMenu"));
    }


    @Then("The user clicks on Save changes")
    public void theUserClicksOnSaveChanges() {
        homePage.saveChangesButtonInAccountDetailsMenu.click();
    }

    @Then("The user should see the message {string}")
    public void the_user_should_see_the_message(String relatedText) {
        Assert.assertEquals(homePage.accountDetailsChangedSuccessfullyText.getText(), relatedText);
    }

    @Then("In the First Name and Last Name fields, the user enters digits")
    public void inTheFirstNameAndLastNameFieldsTheUserEntersDigits() {
        homePage.firstNameBoxInAccountDetailsMenu.clear();
        homePage.firstNameBoxInAccountDetailsMenu.sendKeys(ConfigReader.getProperty("invalidFirstNameForAccountDetailsMenu"));
        homePage.lastNameBoxInAccountDetailsMenu.clear();
        homePage.lastNameBoxInAccountDetailsMenu.sendKeys(ConfigReader.getProperty("invalidLastNameForAccountDetailsMenu"));
        homePage.currentPasswordBoxInAccountDetailsMenu.sendKeys(ConfigReader.getProperty("passwordForRegister"));
        homePage.newPasswordBoxInAccountDetailsMenu.sendKeys(ConfigReader.getProperty("passwordForRegister"));
        homePage.confirmNewPasswordBoxInAccountDetailsMenu.sendKeys(ConfigReader.getProperty("passwordForRegister"));
    }

    @And("The system should not accept the information change, as digits are not allowed in the First Name and Last Name fields")
    public void theSystemShouldNotAcceptTheInformationChangeAsDigitsAreNotAllowedInTheFirstNameAndLastNameFields() {
        Assert.assertFalse("'Account details changed successfully.' text displayed", homePage.accountDetailsChangedSuccessfullyText.isDisplayed());
    }
}
