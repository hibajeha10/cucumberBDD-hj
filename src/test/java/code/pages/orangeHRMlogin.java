package code.pages;

import code.utils.BrowserUtils;
import code.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class orangeHRMlogin extends BrowserUtils {

    public orangeHRMlogin() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "txtUsername")
    public WebElement userName;
    @FindBy(id = "txtPassword")
    public WebElement passWord;
    @FindBy(id = "btnLogin")
    public WebElement LoginButton;


    public void setUserName(String username) {
        staticWait(1);
        userName.sendKeys(username);
    }

    public void setPassWord(String password) {
        staticWait(1);
        passWord.sendKeys(password);
    }

    public void setLoginButton() {
        LoginButton.click();
    }
}
