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

    @FindBy(linkText = "CATALOGUE")
    public WebElement catalogue;

    @FindBy(xpath = "//a[@href='https://knotisse.com/new-arrivals/'][1]")
    public WebElement newArrivals;





}
