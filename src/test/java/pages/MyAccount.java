package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MyAccount {

    public MyAccount(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

}
