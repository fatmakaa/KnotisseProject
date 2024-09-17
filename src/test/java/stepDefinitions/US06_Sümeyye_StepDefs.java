package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.Upholstery;
import utilities.ConfigReader;
import utilities.Driver;


public class US06_Sümeyye_StepDefs {
Upholstery upholstery=new Upholstery();
    @When("İlgili web siteye gidilir")
    public void i̇lgili_web_siteye_gidilir() throws InterruptedException {

        Driver.getDriver().get(ConfigReader.getProperty("baseUrl"));
    }


    @Then("UPHOLSTERY kategori adinin gorundugunu dogrulanir.")
    public void upholsteryKategoriAdininGorundugunuDogrulanir() {

     upholstery.upholsteryMenu.getText();
        Assert.assertEquals("UPHOLSTERY",upholstery.upholsteryMenu.getText());

    }
}
