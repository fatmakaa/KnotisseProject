package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import utilities.*;

import java.security.Key;

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
        if (homePage.myAccountIcon.isDisplayed()) {
            homePage.myAccountIcon.click();

        } else {
            homePage.loginRegisterIcon.click();
            homePage.usernameInLoginPopup.clear();
            homePage.usernameInLoginPopup.sendKeys(ConfigReader.getProperty("emailForRegister"));
            homePage.passwordInLoginPopup.clear();
            homePage.passwordInLoginPopup.sendKeys(ConfigReader.getProperty("passwordForRegister"));
            homePage.loginInPopup.click();
            homePage.myAccountIcon.click();
        }
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

    @Then("In the Password Change section, they enter their Current Password.")
    public void inThePasswordChangeSectionTheyEnterTheirCurrentPassword() {
        homePage.currentPasswordBoxInAccountDetailsMenu.sendKeys(ConfigReader.getProperty("passwordForRegister"));
    }

    @Then("Next, they enter a New Password in the corresponding field.")
    public void nextTheyEnterANewPasswordInTheCorrespondingField() {
        homePage.newPasswordBoxInAccountDetailsMenu.sendKeys(ConfigReader.getProperty("passwordForRegister"));
    }

    @Then("In the Confirm New Password field, they enter the same new password again.")
    public void inTheConfirmNewPasswordFieldTheyEnterTheSameNewPasswordAgain() {
        homePage.confirmNewPasswordBoxInAccountDetailsMenu.sendKeys(ConfigReader.getProperty("passwordForRegister"));
    }

    @Then("User enters the current password in the Current Password field, but enters it incorrectly.")
    public void userEntersTheCurrentPasswordInTheCurrentPasswordFieldButEntersItIncorrectly() {
        homePage.currentPasswordBoxInAccountDetailsMenu.sendKeys(ConfigReader.getProperty("invalidPasswordForRegister"));
    }

    @Then("User enters a new password in the New Password field.")
    public void userEntersANewPasswordInTheNewPasswordField() {
        homePage.newPasswordBoxInAccountDetailsMenu.sendKeys(ConfigReader.getProperty("validNewPassword"));
    }

    @Then("User confirms the new password by entering it again in the Confirm New Password field.")
    public void userConfirmsTheNewPasswordByEnteringItAgainInTheConfirmNewPasswordField() {
        homePage.confirmNewPasswordBoxInAccountDetailsMenu.sendKeys(ConfigReader.getProperty("validNewPassword"));
    }

    @And("System displays an error message saying {string}")
    public void systemDisplaysAnErrorMessageSaying(String relatedText) {
        Assert.assertEquals(homePage.yourCurrentPasswordIsIncorrectText.getText(), relatedText);
    }

    @Then("In the Confirm New Password field, user enters a different password.")
    public void inTheConfirmNewPasswordFieldUserEntersADifferentPassword() {
        homePage.confirmNewPasswordBoxInAccountDetailsMenu.sendKeys(ConfigReader.getProperty("invalidPasswordForRegister"));
    }

    @Then("Leaves the Confirm New Password field blank.")
    public void leavesTheConfirmNewPasswordFieldBlank() {
        homePage.confirmNewPasswordBoxInAccountDetailsMenu.sendKeys("");
    }

    @Then("Enters a password shorter than twelve characters in the New Password field.")
    public void entersAPasswordShorterThanTwelveCharactersInTheNewPasswordField() {
        WaitUtils.waitForClickablility(homePage.newPasswordBoxInAccountDetailsMenu,10);
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(homePage.newPasswordBoxInAccountDetailsMenu,Keys.SPACE).sendKeys(homePage.newPasswordBoxInAccountDetailsMenu,Keys.SPACE).perform();
        homePage.newPasswordBoxInAccountDetailsMenu.sendKeys(ConfigReader.getProperty("shortNewPassword"));

    }

    @Then("User confirms the new short password by entering it again in the Confirm New Password field.")
    public void userConfirmsTheNewShortPasswordByEnteringItAgainInTheConfirmNewPasswordField() {
        homePage.confirmNewPasswordBoxInAccountDetailsMenu.sendKeys(ConfigReader.getProperty("shortNewPassword"));

    }

    @Then("A message should appear under the password box saying, {string}")
    public void aMessageShouldAppearUnderThePasswordBoxSaying(String expectedText) {
        Assert.assertEquals(homePage.underThePasswordBoxTextInAccountDetailsMenu.getText(), expectedText);
    }

    @And("The Save Changes button should be disabled.")
    public void theSaveChangesButtonShouldBeDisabled() {
        Assert.assertFalse("Save changes button is enabled", homePage.saveChangesButtonInAccountDetailsMenu.isEnabled());
    }


}
