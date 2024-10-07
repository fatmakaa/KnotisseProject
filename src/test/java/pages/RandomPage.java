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

    @FindBy (id = "yith-wcwl-popup-message")
    public  WebElement productAddedPopUp;

    @FindBy (xpath ="//a[@class='quick-view quick-view-added'][1]")
    public  WebElement quickView;

    @FindBy(xpath = "//select[contains(@class, 'orderby')]")
    public List<WebElement> randomSortingDropdown;

    @FindBy (xpath ="(//span[@class='x1lliihq x193iq5w x6ikm8r x10wlt62 xlyipyv xuxw1ft'])[1]")
    public  WebElement knotisseInstagramAssert;

    @FindBy (xpath ="//div[@data-test-id='profile-name']")
    public  WebElement knotissePinterestAssert;

    @FindBy (xpath ="//span[@class='yt-core-attributed-string yt-core-attributed-string--white-space-pre-wrap'][1]")
    public  WebElement knotisseYoutubeAssert;



}
