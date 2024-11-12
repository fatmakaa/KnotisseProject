package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;

public class US44_Fatma_StepDefs {

    HomePage homePage = new HomePage();

    @When("user navigates to the Cataloge page")
    public void user_navigates_to_the_cataloge_page() {

        homePage.catalogue.click();

    }

    @When("clicks on Logo")
    public void clicks_on_logo() {

        homePage.logo.click();

    }

    @Then("navigates to the Homepage")
    public void navigates_to_the_homepage() {
        String title = Driver.getDriver().getTitle();
        Assert.assertEquals(title, ConfigReader.getProperty("baseUrl"));

    }


}
