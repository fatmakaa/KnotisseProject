package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SeatingPage {
    public SeatingPage(){
        PageFactory.initElements(Driver.getDriver(),this);}



    @FindBy(id ="menu-item-2694")
    public WebElement titleOfSeating;

}
