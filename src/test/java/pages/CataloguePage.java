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

    @FindBy(xpath = "//*[@value='date']")
    public WebElement sortByLatest;

    @FindBy(xpath = "//p[@class='woocommerce-result-count hide-for-medium']")
    public WebElement numberOfResultsAfterProductSearch;

    @FindBy(xpath = "//*[text()='Vintage Anatolian Kilim Rug (Circa 1970) | 183×320 cm 6×10’7 ft |  PR348018']")
    public WebElement firstProductAfterAnatolianKilimRugSearch;

    @FindBy(xpath = "//*[@class='product-title product_title entry-title']")
    public WebElement titleOfAfterProductSearch;
}
