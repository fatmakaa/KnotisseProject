package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class HomePage {

    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//a[@href='#search-lightbox'])[1]")
    public WebElement searchButtonTopOfHomePage;

    @FindBy(xpath = "(//i[@class='icon-search'])[1]")
    public WebElement searchButtonAfterClickSearchButton;

    @FindBy(xpath = "//select[@class='search_categories resize-select mb-0']")
    public WebElement searchDropdown;

    @FindBy(xpath = "(//a[@class='nav-top-link'])[1]")
    public WebElement contactButton;

    @FindBy(xpath = "//button[@class='woocommerce-button button woocommerce-form-login__submit']")
    public WebElement loginInPopup;

    @FindBy(id = "username")
    public WebElement usernameInLoginPopup;

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


}
