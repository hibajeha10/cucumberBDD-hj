package code.pages;

import code.utils.BrowserUtils;
import code.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class guru99Payment extends BrowserUtils {

    public guru99Payment() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "card_nmuber")
    private WebElement cardNumber;

    @FindBy(id = "month")
    private WebElement month;

    @FindBy(id = "year")
    private WebElement year;

    @FindBy(id = "cvv_code")
    private WebElement cvvCode;

    @FindBy(name = "submit")
    private WebElement payButton;

    public void setCardNumber(String cardNum) {
        staticWait(1);
        cardNumber.sendKeys(cardNum);
    }

    public void setMonth(String Month) {
        staticWait(1);
        selectFromDropdown(month,Month);
    }

    public void setYear(String Year) {
        staticWait(1);
        selectFromDropdown(year,Year);
    }

    public void setCvvCode(String cvv) {
        cvvCode.sendKeys(cvv);
    }

    public void setPayButton() {
        payButton.click();

    }
}