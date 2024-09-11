package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Wait;
import utilities.ConfigReader;
import utilities.Driver;


public class US01_Fatma_StepDefs {

    @When("İlgili web siteye gidilir.")
    public void i̇lgili_web_siteye_gidilir() throws InterruptedException {

        Driver.getDriver().get(ConfigReader.getProperty("baseUrl"));
    }

    @Then("Home page üzerinden {string} menüsüne tıklanır.")
    public void home_page_üzerinden_menüsüne_tıklanır(String string) {


    }
    @Then("İlgili ürünlerin listelendiği doğrulanır.")
    public void i̇lgili_ürünlerin_listelendiği_doğrulanır() {

    }
    @Then("Alternatif olarak, başka bir sayfa üzerinden \\(örn. new arrivals sayfası) {string} menüsüne tıklanır.")
    public void alternatif_olarak_başka_bir_sayfa_üzerinden_örn_new_arrivals_sayfası_menüsüne_tıklanır(String string) {

    }




}
