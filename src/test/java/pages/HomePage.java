package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {

    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(linkText = "CATALOGUE")
    public WebElement catalogue;


    @FindBy(xpath = "//a[@href='https://knotisse.com/new-arrivals/'][1]")
    public WebElement newArrivals;









}
