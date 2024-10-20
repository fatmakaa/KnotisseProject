package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import pages.KnotisseComPage;
import utilities.Driver;


public class US09_Merve_StepDefs {


    HomePage homePage = new HomePage();
    KnotisseComPage knotisseComPage = new KnotisseComPage();
    Faker faker = new Faker();

    @Given("The visibility and clickability of the Contact button are verified.")
    public void theVisibilityAndClickabilityOfTheContactButtonAreVerified() {

        Assert.assertTrue(homePage.contactButton.isDisplayed());
        Assert.assertTrue(homePage.contactButton.isEnabled());

    }


    @Then("It is verified that when the Contact button is clicked, a page containing a contact form opens.")
    public void itIsVerifiedThatWhenTheContactButtonIsClickedAPageContainingAContactFormOpens() {

        homePage.contactButton.click();
        Assert.assertTrue(knotisseComPage.titleInContactPage.isDisplayed());
    }

    @Then("The visibility of the name, email, phone number, and message fields in the contact form, as well as the ability to enter information into them, is verified.")
    public void the_visibility_of_the_name_email_phone_number_and_message_fields_in_the_contact_form_as_well_as_the_ability_to_enter_information_into_them_is_verified() {

        Assert.assertTrue(knotisseComPage.nameBoxInContactPage.isDisplayed());
        Assert.assertTrue(knotisseComPage.surnameBoxInContactPage.isDisplayed());
        Assert.assertTrue(knotisseComPage.emailBoxInContactPage.isDisplayed());
        Assert.assertTrue(knotisseComPage.phoneBoxInContactPage.isDisplayed());
        Assert.assertTrue(knotisseComPage.messageBoxInContactPage.isDisplayed());
        Assert.assertTrue(knotisseComPage.checkBoxInContactPage.isDisplayed());
        Assert.assertTrue(knotisseComPage.submitButtonInContactPage.isDisplayed());
        Assert.assertTrue(knotisseComPage.nameBoxInContactPage.isEnabled());
        Assert.assertTrue(knotisseComPage.surnameBoxInContactPage.isEnabled());
        Assert.assertTrue(knotisseComPage.emailBoxInContactPage.isEnabled());
        Assert.assertTrue(knotisseComPage.phoneBoxInContactPage.isEnabled());
        Assert.assertTrue(knotisseComPage.messageBoxInContactPage.isEnabled());
        Assert.assertTrue(knotisseComPage.checkBoxInContactPage.isEnabled());
        Assert.assertTrue(knotisseComPage.submitButtonInContactPage.isEnabled());

    }

    @Then("It is verified that a message can be sent by entering the name, email, phone number, and message details into the contact form.")
    public void it_is_verified_that_a_message_can_be_sent_by_entering_the_name_email_phone_number_and_message_details_into_the_contact_form() {

        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(knotisseComPage.nameBoxInContactPage, faker.name().firstName())
                .sendKeys(knotisseComPage.surnameBoxInContactPage, faker.name().lastName())
                .sendKeys(knotisseComPage.emailBoxInContactPage, faker.internet().emailAddress())
                .sendKeys(knotisseComPage.phoneBoxInContactPage, faker.phoneNumber().phoneNumber())
                .sendKeys(knotisseComPage.messageBoxInContactPage, faker.lorem().paragraph()).perform();
        Assert.assertTrue(knotisseComPage.checkBoxInContactPage.isEnabled());
        Assert.assertTrue(knotisseComPage.submitButtonInContactPage.isEnabled());
    }


}
