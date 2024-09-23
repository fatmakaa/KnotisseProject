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



}
