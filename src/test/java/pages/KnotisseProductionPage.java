package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class KnotisseProductionPage {

    public KnotisseProductionPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public WebElement getCategoryElement(String categoryName) {
        return Driver.getDriver().findElement(By.xpath("//a[text()='" + categoryName + "']"));
    }

    @FindBy(xpath = "//*[@class='entry-title mb-0']")
    public WebElement mainTitleInPage;

    @FindBy(xpath = "(//*[text()='Old Yarn Carpets'])[1]")
    public WebElement oldYarnCarpetsMenu;

    @FindBy(xpath = "(//*[@class='quick-view quick-view-added'])[1]")
    public WebElement quickViewButton;

    @FindBy(xpath = "(//*[@class='plain'])[1]")
    public WebElement titleInProductDetails;

    @FindBy(xpath = "(//*[@class='product-small box '])[1]")
    public WebElement firstProductInThePage;

    @FindBy(xpath = "(//*[@class='icon-heart'])[1]")
    public WebElement heartIconInTheFirstProduct;

    @FindBy(xpath = "//*[text()='Product added!']")
    public WebElement productAddedPopUp;

    @FindBy(xpath = "(//*[@class='wishlist-icon icon-heart'])[1]")
    public WebElement iconHeartInTheTopOfPage;

    @FindBy(xpath = "(//*[@class='product-name'])[2]")
    public WebElement productTitleInWishListPage;

    @FindBy(xpath = "(//*[@class='button wp-element-button my-2 text-white btn-sm btn-primary position-relative opacity-100 rounded-2 add_to_quote  '])[1]")
    public WebElement addToQuoteListButton;

    @FindBy(xpath = "(//*[@class='button wp-element-button text-white  btn-sm btn-primary my-2 rounded-2 position-relative opacity-100 elex-raq-view-quote-list-open-btn'])[1]")
    public WebElement viewQuoteListButton;

    @FindBy(xpath = "//*[text()='Brown handmade area rug striped upcycled wool | 260x360 cm - 8.5x12 ft | HL064414']")
    public WebElement firstProductTitleInTheQuoteList;

    @FindBy(xpath = "(//span[@class='widget-title shop-sidebar'])[3]")
    public WebElement productCategoryTitleInThePage;

    @FindBy(xpath = "(//h2[@class='widgettitle'])[1]")
    public WebElement newArrivalsTitleInThePage;

    @FindBy(xpath = "(//h2[@class='widgettitle'])[2]")
    public WebElement followUsOnInstagramTitleInThePage;

    @FindBy(xpath = "(//*[text()='PRODUCT SEARCH'])[2]")
    public WebElement productSearchTitleInThePage;

    @FindBy(xpath = "(//a[@class='button icon is-outline circle'])[2]")
    public WebElement rightArrowButton;

    @FindBy(xpath = "(//a[@class='button icon is-outline circle'])[1]")
    public WebElement leftArrowButton;

    @FindBy(xpath = "(//*[@class='product-title product_title entry-title'])[1]")
    public WebElement productTitle;

    @FindBy(xpath = "//*[text()='Home']")
    public WebElement homeButton;

    @FindBy(xpath = "(//*[text()='Pom Pom'])[1]")
    public WebElement pompomMenu;

    @FindBy(xpath = "//div[@class='out-of-stock-label']")
    public WebElement textOnTheOutOfStockProduct;

    @FindBy(xpath = "(//*[@class='box-image'])[11]")
    public WebElement outOfStockProduct;

    @FindBy(xpath = "//*[@class='badge-container is-larger absolute left top z-1']")
    public WebElement soldText;

}
