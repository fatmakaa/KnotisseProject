package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.WaitUtils;

public class US33_Merve_StepDefs {

    HomePage homePage = new HomePage();

    @Then("The user writes his her previously registered e-mail address in the mail address box in the register section.")
    public void theUserWritesHisHerPreviouslyRegisteredEMailAddressInTheMailAddressBoxInTheRegisterSection() {
        homePage.registerBoxInLoginRegisterPopUp.sendKeys(ConfigReader.getProperty("invaliEmailForRegister"));
    }

    @Then("Clicks the Register button.")
    public void clicks_the_register_button() {
        homePage.registerButtonInLoginRegisterPopUp.click();
    }

    @And("The user will receive the message {string} message.")
    public void theUserWillReceiveTheMessageMessage(String expectedMessage) {
        WaitUtils.waitForVisibility(homePage.errorMessageInLoginRegisterPopUp, 5);
        Assert.assertEquals(homePage.errorMessageInLoginRegisterPopUp.getText(), expectedMessage);
    }
}
