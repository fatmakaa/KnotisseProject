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


}
