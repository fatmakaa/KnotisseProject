package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Upholstery {

    public Upholstery() {PageFactory.initElements(Driver.getDriver(),this);}

@FindBy(xpath ="//li[@id='menu-item-2698']") public WebElement upholsteryMenu;



}
