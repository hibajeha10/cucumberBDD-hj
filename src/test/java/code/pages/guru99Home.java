package code.pages;

import code.utils.BrowserUtils;
import code.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class guru99Home extends BrowserUtils {

    public guru99Home(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    // We created pageFactory above to call driver in this class

    @FindBy(xpath = "//select[@name='quantity']")
    private WebElement quantityDropDown;

    @FindBy(xpath = "//input[@type='submit']")
    private WebElement buyNowButton;

    public void getQuantityDropDown(String str) {
        Select select = new Select(quantityDropDown);
        select.selectByValue(str);
    }

    public void getBuyNowButton() {
        buyNowButton.click();
    }

}
