package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.ReusableMethods;

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