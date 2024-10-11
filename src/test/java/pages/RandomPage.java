package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class RandomPage {

    public RandomPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[text()='Vintage Anatolian Kilim Rug (Circa 1970) | 183×320 cm 6×10’7 ft |  PR348018']")
    public WebElement firstProductAfterAnatolianKilimRugSearch;

    @FindBy(xpath = "//*[@class='product-title product_title entry-title']")
    public WebElement titleOfAfterProductSearch;

    @FindBy(xpath = "(//*[@class='plain'])[1]")
    public WebElement titleOfAfterProductSearchInPopUp;

    @FindBy(xpath = "//select[contains(@class, 'orderby')]")
    public List<WebElement> randomSortingDropdown;

    @FindBy(xpath = "//div[contains(@class, 'box-text box-text-products')]")
    public List<WebElement> randomProductTitleList;

}
