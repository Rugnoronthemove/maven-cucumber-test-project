package learn.letskodeit.com.pages;

import learn.letskodeit.com.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {

    @FindBy(xpath = "//a[@href='/sign_in']") WebElement _link_login;
    public void clickOnLoginLink(){
        clickOnElement(_link_login);
    }

    @FindBy(xpath = "//a[@href='/pages/practise']") WebElement _link_practise;
    public void clickOnPractiseLink(){
        clickOnElement(_link_practise);
    }

}
