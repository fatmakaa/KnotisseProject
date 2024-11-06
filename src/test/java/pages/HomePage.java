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

    @FindBy(id = "woocommerce-product-search-field-0")
    public WebElement searchBox;

    @FindBy(xpath = "(//a[@class='nav-top-link'])[1]")
    public WebElement contactButton;

    @FindBy(xpath = "//button[@class='woocommerce-button button woocommerce-form-login__submit']")
    public WebElement loginInPopup;

    @FindBy(id = "username")
    public WebElement usernameInLoginPopup;
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

    @FindBy(xpath = "//input[@id='account_last_name']")
    public WebElement lastNameBoxInAccountDetailsMenu;

    @FindBy(xpath = "//input[@id='account_display_name']")
    public WebElement displayNameBoxInAccountDetailsMenu;

    @FindBy(xpath = "//button[@name='save_account_details']")
    public WebElement saveChangesButtonInAccountDetailsMenu;

    @FindBy(xpath = "//div[@class='message-container container success-color medium-text-center']")
    public WebElement accountDetailsChangedSuccessfullyText;

    @FindBy(xpath = "//div[@class='message-container container alert-color medium-text-center']")
    public WebElement yourCurrentPasswordIsIncorrectText;

    @FindBy(xpath = "(//input[@id='password_current'])[1]")
    public WebElement currentPasswordBoxInAccountDetailsMenu;

    @FindBy(xpath = "(//input[@id='password_1'])[1]")
    public WebElement newPasswordBoxInAccountDetailsMenu;

    @FindBy(xpath = "(//input[@id='password_2'])[1]")
    public WebElement confirmNewPasswordBoxInAccountDetailsMenu;
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
    @FindBy(xpath = "(//i[@class='icon-envelop'])[1]")
    public WebElement emailIcon;
    @FindBy(xpath = "(//a[@href='tel:+902124582625'])[1]")
    public WebElement phoneIcon;
    @FindBy(xpath = "(//a[@href='mailto:info@knotisse.com'])[1]")
    public WebElement emailIconFooter;
    @FindBy(xpath = "(//a[@href='tel:+902124582625'])[2]")
    public WebElement phoneIconFooter;
    @FindBy(xpath = "//a[@href='http://+902124582625']")
    public WebElement callUs;
    @FindBy(xpath = "(//a[@href='#'])[5]")
    public WebElement myEmailPreferences;
    @FindBy(xpath = "(//a[@href='https://knotisse.com/my-account/'])[1]")
    public WebElement loginRegister;
    @FindBy(xpath = "//input[@id='username']")
    public WebElement userNameOrEmailTextBox;
    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordTextBox;
    @FindBy(xpath = "(//button[@name='login'])[1]")
    public WebElement logInButton;
    @FindBy(id = "password")
    public WebElement passwordInLoginPopup;

    @FindBy(xpath = "(//a[@href='https://knotisse.com/my-account/'])[1]")
    public WebElement loginRegisterIcon;

    @FindBy(xpath = "(//span[@class='header-account-title'])[1]")
    public WebElement myAccountIcon;

    @FindBy(xpath = "(//a[@href='https://knotisse.com/my-account/edit-account/'])[2]")
    public WebElement accountDetailsMenu;

    @FindBy(xpath = "//input[@id='account_first_name']")
    public WebElement firstNameBoxInAccountDetailsMenu;

    @FindBy(xpath = "(//a[@href='https://knotisse.com/privacy-policies/'])[1]")
    public WebElement privacyPolicy;


}
