package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.HomePage;
import pages.RandomPage;
import utilities.Driver;
import utilities.JSUtils;
import utilities.ReusableMethods;
import utilities.WaitUtils;

import java.util.Set;


public class US14_Fatma_StepDefs {
    HomePage homePage = new HomePage();
    RandomPage randomPage = new RandomPage();


    //------------------------------------------------------------TC01------------------------------------------------------------------------------------


    @Then("clicks on the Instagram icon from the home page")
    public void clicks_on_the_instagram_icon_from_the_home_page() {

        homePage.firstInstagramIcon.click();
        // ReusableMethods.switchToWindow("KNOTISSE “fine weavings” (@knotisse) • Instagram photos and videos");
        ReusableMethods.switchToWindow(1);

    }


    @Then("verifies that the user is redirected to the Instagram page")
    public void verifies_that_the_user_is_redirected_to_the_instagram_page() throws InterruptedException {
        Driver.getDriver().navigate().refresh();
        ReusableMethods.flashElement(randomPage.knotisseInstagramAssert);
        Assert.assertTrue(randomPage.knotisseInstagramAssert.getText().contains("knotisse"));


    }


    //------------------------------------------------------------TC02------------------------------------------------------------------------------------


    @Then("clicks on the Pinterest icon from the home page")
    public void clicks_on_the_pinterest_icon_from_the_home_page() {

        homePage.firstPinterestIcon.click();
        ReusableMethods.switchToWindow(1);

    }


    @Then("verifies that the user is redirected to the Pinterest page")
    public void verifies_that_the_user_is_redirected_to_the_pinterest_page() {

        Driver.getDriver().navigate().refresh();
        WaitUtils.waitForVisibility(randomPage.knotissePinterestAssert, 10);
        Assert.assertTrue(randomPage.knotissePinterestAssert.getText().contains("KNOTISSE"));

    }


    //------------------------------------------------------------TC03------------------------------------------------------------------------------------


    @Then("clicks on the YouTube icon from the home page")
    public void clicks_on_the_you_tube_icon_from_the_home_page() {

        homePage.firstYoutubeIcon.click();
        ReusableMethods.switchToWindow(1);


    }


    @Then("verifies that the user is redirected to the YouTube page")
    public void verifies_that_the_user_is_redirected_to_the_you_tube_page() {

        Assert.assertTrue(randomPage.knotisseYoutubeAssert.getText().contains("KNOTISSE"));


    }


    //------------------------------------------------------------TC04------------------------------------------------------------------------------------


    @Then("clicks on the Facebook icon via Home page > footer")
    public void clicks_on_the_facebook_icon_via_home_page_footer() {
        JSUtils.JSscrollAllTheWayDown();
        JSUtils.JSscrollIntoView(homePage.facebookIconFooter);
        homePage.facebookIconFooter.click();


    }

    @Then("verifies that the user is redirected to the Facebook page")
    public void verifies_that_the_user_is_redirected_to_the_facebook_page() {


    }


    //------------------------------------------------------------TC05------------------------------------------------------------------------------------


    @Then("clicks on the Instagram icon via Home page > footer")
    public void clicks_on_the_instagram_icon_via_home_page_footer() {

        JSUtils.JSscrollAllTheWayDown();
        JSUtils.JSscrollIntoView(homePage.instagramIconFooter);
        homePage.instagramIconFooter.click();

        ReusableMethods.switchToWindow(1);

    }


    @Then("verifies that the user is redirected to the Instagram page in footer")
    public void verifies_that_the_user_is_redirected_to_the_instagram_page_in_footer() {

        Assert.assertTrue(randomPage.knotisseInstagramAssert.getText().contains("knotisse"));


    }


    //------------------------------------------------------------TC06------------------------------------------------------------------------------------


    @Then("clicks on the Pinterest icon via Home page > footer")
    public void clicks_on_the_pinterest_icon_via_home_page_footer() {

        JSUtils.JSscrollAllTheWayDown();
        JSUtils.JSscrollIntoView(homePage.pinterestIconFooter);
        homePage.pinterestIconFooter.click();
        ReusableMethods.switchToWindow(1);


    }


    @Then("verifies that the user is redirected to the Pinterest page in footer")
    public void verifies_that_the_user_is_redirected_to_the_pinterest_page_in_footer() {

        Assert.assertTrue(randomPage.knotissePinterestAssert.getText().contains("KNOTISSE"));


    }


    //------------------------------------------------------------TC07------------------------------------------------------------------------------------


    @Then("clicks on the YouTube icon via Home page > footer")
    public void clicks_on_the_you_tube_icon_via_home_page_footer() {

        JSUtils.JSscrollAllTheWayDown();
        JSUtils.JSscrollIntoView(homePage.youtubeIconFooter);
        homePage.youtubeIconFooter.click();
        ReusableMethods.switchToWindow(1);


    }


    @Then("verifies that the user is redirected to the YouTube page in footer")
    public void verifies_that_the_user_is_redirected_to_the_you_tube_page_in_footer() {

        Assert.assertTrue(randomPage.knotisseYoutubeAssert.getText().contains("KNOTISSE"));


    }


}