package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PillowsPage {

    public PillowsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div[@class='message-container container medium-text-center']")
    public WebElement noProductsWereFoundMatchingYourSelectionText;

}
