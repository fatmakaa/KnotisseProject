package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.ConfigReader;
import utilities.Driver;


public class US06_Sümeyye_StepDefs {

    @When("İlgili web siteye gidilir")
    public void i̇lgili_web_siteye_gidilir() throws InterruptedException {

        Driver.getDriver().get(ConfigReader.getProperty("baseUrl"));
    }





}
