package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.HomePage;
import utilities.JSUtils;

public class US15_Fatma_StepDefs {
    HomePage homePage = new HomePage();





//----------------------------------------------------------TC01------------------------------------------------------------------------------
    @Given("email icon on the homepage is clicked")
    public void email_icon_on_the_homepage_is_clicked() {
        homePage.emailIcon.click();
    }

    @Then("verified that the user is redirected to the email page")
    public void verified_that_the_user_is_redirected_to_the_email_page() {




    }



//---------------------------------------------------------TC02-------------------------------------------------------------------------------


    @Given("phone icon on the homepage is clicked")
    public void phone_icon_on_the_homepage_is_clicked() {

        homePage.phoneIcon.click();

    }

    @Then("verified that the user is redirected to the phone page")
    public void verified_that_the_user_is_redirected_to_the_phone_page() {



    }


 //---------------------------------------------------------TC03-------------------------------------------------------------------------------


    @Given("email icon is clicked from the footer on the homepage")
    public void email_icon_is_clicked_from_the_footer_on_the_homepage() {

        homePage.emailIconFooter.click();

    }

    @Then("verified that the user is redirected to the email page in footer")
    public void verified_that_the_user_is_redirected_to_the_email_page_in_footer() {


    }

 //---------------------------------------------------------TC04-------------------------------------------------------------------------------



    @Given("phone icon is clicked from the footer on the homepage")
    public void phone_icon_is_clicked_from_the_footer_on_the_homepage() {

        homePage.phoneIconFooter.click();

    }
    @Then("verified that the user is redirected to the phone page in footer")
    public void verified_that_the_user_is_redirected_to_the_phone_page_in_footer() {

    }

 //---------------------------------------------------------TC05-------------------------------------------------------------------------------



    @Given("Call Us icon is clicked from the footer on the homepage")
    public void call_us_icon_is_clicked_from_the_footer_on_the_homepage() {

        JSUtils.JSscrollAllTheWayDown();
        homePage.callUs.click();

    }
    @Then("It is verified that the user is redirected to the Call Us page")
    public void it_is_verified_that_the_user_is_redirected_to_the_call_us_page() {

    }




}