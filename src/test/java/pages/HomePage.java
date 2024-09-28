package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class HomePage {

    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "(//a[@href='#search-lightbox'])[1]")
    public WebElement searchButtonTopOfHomePage;

    @FindBy(xpath = "(//i[@class='icon-search'])[1]")
    public WebElement searchButtonAfterClickSearchButton;

    @FindBy(xpath = "//select[@class='search_categories resize-select mb-0']")
    public WebElement searchDropdown;
    @FindBy(xpath = "//h2[text()='NEW ARRIVALS']")
    public WebElement newArrivals;
    @FindBy(xpath = "(//span[text()='PRODUCT CATEGORY'])[2]")
    public WebElement productCategory;
    @FindBy(xpath = "(//span[text()='PRODUCT SEARCH'])[2]")
    public WebElement productSearch;
    @FindBy(xpath = "//h2[text()='FOLLOW US ON INSTAGRAM']")
    public WebElement followInstagram;

}
