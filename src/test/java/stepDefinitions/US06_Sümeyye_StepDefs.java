package stepDefinitions;

import com.sun.jna.StringArray;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.Upholstery;
import utilities.ConfigReader;
import utilities.Driver;


public class US06_Sümeyye_StepDefs {
Upholstery upholstery=new Upholstery();
    @When("İlgili web siteye gidilir")
    public void i̇lgili_web_siteye_gidilir() {

        Driver.getDriver().get(ConfigReader.getProperty("baseUrl"));
    }


    @Then("UPHOLSTERY kategori adinin gorundugunu dogrulanir")
    public void upholsteryKategoriAdininGorundugunuDogrulanir() {

    String text = upholstery.upholsteryMenu.getText();
        Assert.assertEquals("UPHOLSTERY",text);

    }

    @And("UPHOLSTERY kategorisi tiklanir")
    public void upholsteryKategorisiTiklanir() {
        upholstery.upholsteryMenu.click();
    }

    @Then("Acilan sayfada doseme  urunlerinin listelendigi test edilir")
    public void acilanSayfadaDosemeUrunlerininListelendigiTestEdilir() {
      String actualResult=upholstery.allOfProductList.getText();
        String expectedResult="Showing all 11 results";
        Assert.assertEquals(expectedResult,actualResult);
    }


    @And("Urun resimlerinin uzerindeki favori isaretine gelinir")
    public void urunResimlerininUzerindekiFavoriIsaretineGelinir() {
    }

    @Then("Favori isaretine gelindiginde ADD TO WISHLIST yazisinin goruldugu test edilir")
    public void favoriIsaretineGelindigindeADDTOWISHLISTYazisininGorulduguTestEdilir() {
    }
}