package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CataloguePage {

    public CataloguePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "menu-item-2210")
    public WebElement catalogueMenu;

    @FindBy(xpath = "//p[@class='woocommerce-result-count hide-for-medium']")
    public WebElement numberOfResultsAfterProductSearch;

    @FindBy(xpath = "//div[@class='box-text-inner'][1]")
    public WebElement firstCatalogueDetail;

    @FindBy(xpath = "//select[@class='orderby']")
    public WebElement orderDropdown;

    @FindBy(xpath = "//nav[@class='woocommerce-breadcrumb breadcrumbs uppercase']")
    public WebElement searchResultsForText;


}
