package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class VintageRugsPage {

    public VintageRugsPage (){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    // Tüm kategoriler için tek bir dinamik locator kullanacağız.
    public WebElement getCategoryElement(String categoryName) {
        // Kategori adını kullanarak dinamik XPath oluşturuyoruz.
        return Driver.getDriver().findElement(By.xpath("//a[text()='" + categoryName + "']"));
    }

    public void clickCategory(String categoryName) {
        WebElement element = getCategoryElement(categoryName);
        ReusableMethods.click(element);

    }
    public void hoverOverCategory(String categoryName) {
        Actions actions = new Actions(Driver.getDriver());
        WebElement categoryElement = getCategoryElement(categoryName);
        actions.moveToElement(categoryElement).perform();  // fareyi kategorinin üzerine getirir
    }

    @FindBy(xpath = "//*[@id=\"wrapper\"]/div[2]/div/div[2]/p")
    public WebElement showingResults;
    @FindBy(xpath = "//select[@name='orderby']")
    public WebElement dropdownSorting;
    @FindBy(xpath = "//div[@class='shop-container']")
    public List<WebElement> randomProductList;
    @FindBy(xpath = "//div[contains(@class, 'product-info') and contains(@class, 'summary') and contains(@class, 'col-fit') and contains(@class, 'entry-summary') and contains(@class, 'product-summary')]")
    public WebElement productInfo;
    @FindBy(xpath = "//div[contains(@class, 'woocommerce-product-gallery__wrapper') and contains(@class, 'product-gallery-slider') and contains(@class, 'slider') and contains(@class, 'slider-nav-small') and contains(@class, 'mb-half') and contains(@class, 'has-image-zoom') and contains(@class, 'is-draggable') and contains(@class, 'flickity-enabled')]")
    public WebElement productImage;
    @FindBy(xpath = "//div[@class='easyzoom-flyout']")
    public WebElement getProductImageZoom;

    @FindBy(xpath = "//button[contains(text(), 'ADD to QUOTE LIST')]")
    public WebElement addToQuoteListButton;

    @FindBy(id = "tab-title-description")
    public WebElement description;
    @FindBy(id = "tab-title-additional_information")
    public WebElement additionalInformation;
    @FindBy(xpath = "//h3[contains(text(),'Related products')]")
    public WebElement relatedProducts;
    @FindBy(id = "woocommerce-product-search-field-2")
    public WebElement searchInputTopOgPage;
    @FindBy(id = "woocommerce-product-search-field-3")
    public WebElement searchInputBottomOgPage;
    @FindBy(id = "elex-raq-add-sucess-toast")
    public WebElement productAddedSuccessText;



    @FindBy(xpath = "(//*[@class='woocommerce-LoopProduct-link woocommerce-loop-product__link'])[1]")
    public WebElement firstProductInPage;

    @FindBy(xpath = "(//*[@class='woocommerce-LoopProduct-link woocommerce-loop-product__link'])[2]")
    public WebElement secondProductInPage;

    @FindBy(xpath = "(//*[@class='icon-heart'])[1]")
    public WebElement iconHeart;

    @FindBy(xpath = "(//*[@class='wishlist-icon icon-heart has-products'])[1]")
    public WebElement iconHeartInTheTopOfPage;

    @FindBy(xpath = "(//*[text()='Add to wishlist'])[2]")
    public WebElement addToWishListButton;

    @FindBy(xpath = "(//*[@class='add_to_wishlist single_add_to_wishlist alt button theme-button-style '])[1]")
    public WebElement addToWishListButtonInHEartIcon;

    @FindBy(xpath = "(//*[@class='product-name'])[2]")
    public WebElement firstProductNameInWishList;

    @FindBy(xpath = "(//*[@class='product-name'])[3]")
    public WebElement secondProductNameInWishList;

    @FindBy(xpath = "(//*[@class='remove remove_from_wishlist'])[1]")
    public WebElement deleteIconINWishList;

    @FindBy(xpath = "(//*[@class='message-container container success-color medium-text-center'])[1]")
    public WebElement deleteMessage;







}