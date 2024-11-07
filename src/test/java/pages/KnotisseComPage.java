package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class KnotisseComPage {

    public KnotisseComPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//h1[@class='uppercase']")
    public WebElement titleInContactPage;

    @FindBy(xpath = "//div[@class='wpforms-field-row-block wpforms-first wpforms-one-half']")
    public WebElement nameBoxInContactPage;

    @FindBy(xpath = "//input[@id='wpforms-5134-field_0-last']")
    public WebElement surnameBoxInContactPage;

    @FindBy(xpath = "//input[@id='wpforms-5134-field_1']")
    public WebElement emailBoxInContactPage;

    @FindBy(xpath = "//input[@id='wpforms-5134-field_3']")
    public WebElement phoneBoxInContactPage;

    @FindBy(xpath = "//textarea[@id='wpforms-5134-field_2']")
    public WebElement messageBoxInContactPage;

    @FindBy(xpath = "(//input[@id='wpforms-5134-field_6_1'])[1]")
    public WebElement checkBoxInContactPage;

    @FindBy(id = "wpforms-submit-5134")
    public WebElement submitButtonInContactPage;

    @FindBy(xpath = "//*[text()='Our Main Office & Showroom']")
    public WebElement ourStoresPageTitle;

    @FindBy(xpath = "//*[text()='Istanbul Showroom & Studio']")
    public WebElement istanbulShowroomTitle;

    @FindBy(xpath = "//*[text()='Usak Facility']")
    public WebElement usakFacilityTitle;


}
