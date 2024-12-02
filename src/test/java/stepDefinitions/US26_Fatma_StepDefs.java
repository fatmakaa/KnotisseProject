package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.HomePage;
import pages.RandomPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US26_Fatma_StepDefs {


    HomePage homePage = new HomePage();
    RandomPage randomPage = new RandomPage();


//----------------------------------------------------------------------TC01-----------------------------------------------------------------------------------

    @Then("the user clicks on the {string} category under the Contact button")
    public void the_user_clicks_on_the_category_under_the_contact_button(String string) {

        homePage.servicesLink.click();

    }

    @Then("verifies that the user is directed to the Services page and")
    public void verifies_that_the_user_is_directed_to_the_page_and() {

        String title = Driver.getDriver().getTitle();
        Assert.assertNotEquals(title, ConfigReader.getProperty("baseUrl"));
    }

    @Then("verifies that there is a form displayed for contacting the user")
    public void verifies_that_there_is_a_form_displayed_for_contacting_the_user() {

        Assert.assertTrue(randomPage.formInServicesPage.isDisplayed());


    }

//----------------------------------------------------------------------TC02-----------------------------------------------------------------------------------

    @When("user clicks on {string} link under the Contact")
    public void user_clicks_on_link_under_the_contact(String string) {

        homePage.blogLink.click();

    }

    @Then("confirms that the navigated to the {string}")
    public void confirms_that_the_navigated_to_the(String string) {

        Assert.assertTrue(Driver.getDriver().getTitle().contains("blog"));

    }

    @Then("clicks on the first blog post")
    public void clicks_on_the_first_blog_post() {

        randomPage.firstBlog.click();
    }

    @Then("verifies that relevant results displayed")
    public void verifies_that_relevant_results_displayed() {

        Assert.assertTrue(randomPage.titleOfFirstBlog.getText().contains("Beautiful Turkish Rug and Kilim Patterns: A Tapestry of Tradition and Symbolism at 21 st Century"));
    }


}
