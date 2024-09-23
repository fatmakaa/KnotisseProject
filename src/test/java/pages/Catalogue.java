package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Catalogue {



    public Catalogue(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div[@class='box-text-inner'][1]")
    public WebElement firstCatalogueDetail;


    @FindBy(xpath = "//select[@class='orderby']")
    public WebElement orderDropdown;






}
