package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AntiqueRugsPage {
    public AntiqueRugsPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//p[@class='woocommerce-result-count hide-for-medium']")
    public WebElement resultOfList;

    @FindBy(xpath = "//img[@class='attachment-woocommerce_thumbnail size-woocommerce_thumbnail'][1]")
    public WebElement firstProduct;


    @FindBy(xpath = "//i[@class='icon-heart'][1]")
    public WebElement heartIconOfFirstP;

    @FindBy(xpath = "//a[@href='?add_to_wishlist=5557&_wpnonce=b2eb7244bf']")
    public WebElement heartClick;


    @FindBy(xpath = "//div[@class='product-quick-view-container']")
    public WebElement quickViewPanel;

    @FindBy(xpath = "//a[@title='Black']")
    public WebElement blackInFilter;

    @FindBy(xpath = "//select[@class='orderby']")
    public WebElement orderDropdown;

    @FindBy(xpath = "//i[@class='icon-equalizer']")
    public WebElement filter;

    @FindBy(xpath = "//button[@class='mfp-close']")
    public WebElement quickViewPanelClose;

    @FindBy(xpath = "//h1[@class='product-title product_title entry-title']")
    public WebElement titleOfFirstP;

    @FindBy(xpath = "//button[@class='button wp-element-button my-2 text-white btn-sm btn-primary position-relative opacity-100 rounded-2 add_to_quote  ']")
    public WebElement addToQlist;

    @FindBy(xpath = "//a[@href='https://knotisse.com/add-to-quote-product-list/']")
    public WebElement viewQlist;

    @FindBy(xpath = "//p[@class='name product-title woocommerce-loop-product__title'][1]")
    public WebElement firstBlackProductTitle;


}
