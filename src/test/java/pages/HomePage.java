package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


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

    @FindBy(id = "woocommerce-product-search-field-0")
    public WebElement searchBox;

    @FindBy(linkText = "CATALOGUE")
    public WebElement catalogue;

    @FindBy(xpath = "//a[@href='https://knotisse.com/new-arrivals/'][1]")
    public WebElement newArrivals;

    @FindBy(xpath = "//a[@href='https://knotisse.com/antique-rugs-turkish-persian/'][1]")
    public WebElement antiqueRugs;

    @FindBy(xpath = "//a[@href='https://knotisse.com/']")
    public WebElement homePageLink;

    @FindBy(xpath = "//h2[@class='uppercase']")
    public WebElement homePageAssert;

    @FindBy(xpath = "//i[@class='icon-instagram'][1]")
    public WebElement firstInstagramIcon;

    @FindBy(xpath = "//a[@href='https://www.pinterest.com/knotisse'][1]")
    public WebElement firstPinterestIcon;
    @FindBy(xpath = "//a[@href='https://www.youtube.com/@KNOTISSE_FineWeavings'][1]")
    public WebElement firstYoutubeIcon;

    @FindBy(xpath = "//i[@class='icon-facebook'][1]")
    public WebElement facebookIconFooter;

    @FindBy(xpath = "(//i[@class='icon-instagram'])[2]")
    public WebElement instagramIconFooter;

    @FindBy(xpath = "(//a[@href='https://www.youtube.com/@KNOTISSE_FineWeavings'])[2]")
    public WebElement youtubeIconFooter;

    @FindBy(xpath = "//a[@href='https://www.pinterest.com/knotisse/'][1]")
    public WebElement pinterestIconFooter;




}
