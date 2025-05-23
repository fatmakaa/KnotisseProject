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

    @FindBy (id = "yith-wcwl-popup-message")
    public  WebElement productAddedPopUp;

    @FindBy (xpath ="//a[@class='quick-view quick-view-added'][1]")
    public  WebElement quickView;

    @FindBy(xpath = "//select[contains(@class, 'orderby')]")
    public List<WebElement> randomSortingDropdown;

    @FindBy(xpath = "//div[contains(@class, 'box-text box-text-products')]")
    public List<WebElement> randomProductTitleList;

    @FindBy (xpath ="(//span[@class='x1lliihq x193iq5w x6ikm8r x10wlt62 xlyipyv xuxw1ft'])[1]")
    public  WebElement knotisseInstagramAssert;

    @FindBy (xpath ="//div[@data-test-id='profile-name']")
    public  WebElement knotissePinterestAssert;

    @FindBy (xpath ="//span[@class='yt-core-attributed-string yt-core-attributed-string--white-space-pre-wrap'][1]")
    public  WebElement knotisseYoutubeAssert;

    @FindBy (xpath ="//div[@id='wrapper']")
    public  WebElement assertPrivacyPolicy;

    @FindBy (xpath ="//div[@id='contact-form-2311']")
    public  WebElement formInServicesPage;

    @FindBy (xpath ="(//a[@href='https://knotisse.com/turkish-rug-and-kilim-patterns-tradition-symbolism/'])[4]")
    public  WebElement firstBlog;

    @FindBy (xpath ="//h1[@class='entry-title']")
    public  WebElement titleOfFirstBlog;




}
