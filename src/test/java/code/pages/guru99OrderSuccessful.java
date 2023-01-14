package code.pages;

import code.utils.BrowserUtils;
import code.utils.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class guru99OrderSuccessful extends BrowserUtils {

    public guru99OrderSuccessful() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//h2[.='Payment successfull!']")
    private WebElement verificationTxt;

    public void setVerificationTxt(String expectedMsg) {
        Assert.assertEquals(verificationTxt.getText(),expectedMsg);
    }
}
