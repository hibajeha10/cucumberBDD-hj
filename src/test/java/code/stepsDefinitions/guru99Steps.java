package code.stepsDefinitions;

import code.pages.guru99Home;
import code.pages.guru99OrderSuccessful;
import code.pages.guru99Payment;
import code.utils.ConfigurationsReader;
import code.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Map;

import static code.utils.BrowserUtils.setWaitTime;

public class guru99Steps {
    guru99Home guru99Home = new guru99Home();
    guru99Payment guru99Payment = new guru99Payment();
    guru99OrderSuccessful guru99OrderSuccessful = new guru99OrderSuccessful();


    @Given("The user wants to go to Payment Gateway Website")
    public void the_user_wants_to_go_to_payment_gateway_website() {
        Driver.getDriver().get(ConfigurationsReader.getProperties("demoURL"));
        setWaitTime();

    }
    @When("The user wants to buy an elephant toy")
    public void the_user_wants_to_buy_an_elephant_toy() {
        guru99Home.getQuantityDropDown("1");
        guru99Home.getBuyNowButton();

    }
    @Then("The user wants to provide requested payment information")
    public void the_user_wants_to_provide_requested_payment_information() {
        guru99Payment.setCardNumber("1234567891234567");
        guru99Payment.setMonth("10");
        guru99Payment.setYear("2021");
        guru99Payment.setCvvCode("282");

    }
    @Then("The user wants to click on pay now button")
    public void the_user_wants_to_click_on_pay_now_button() {
        guru99Payment.setPayButton();

    }
    @Then("The user wants to verify order is successful")
    public void the_user_wants_to_verify_order_is_successful() {
        guru99OrderSuccessful.setVerificationTxt("Payment successfull!");

    }

    @When("The user wants to buy elephant toy as {string}")
    public void the_user_wants_to_buy_elephant_toy_as(String string) {
     guru99Home.getQuantityDropDown(string);
     guru99Home.getBuyNowButton();
    }
    @Then("The user wants to enter Credit Card as {string}")
    public void the_user_wants_to_enter_credit_card_as(String string) {
       guru99Payment.setCardNumber(string);
    }
    @Then("The user wants to enter Expiration Month as {string}")
    public void the_user_wants_to_enter_expiration_month_as(String string) {
      guru99Payment.setMonth(string);
    }
    @Then("The user wants to enter Expiration Year as {string}")
    public void the_user_wants_to_enter_expiration_year_as(String string) {
       guru99Payment.setYear(string);
    }
    @Then("The user wants to enter CVV Code as {string}")
    public void the_user_wants_to_enter_cvv_code_as(String string) {
      guru99Payment.setCvvCode(string);
    }
    @Then("The user wants to verify message as {string}")
    public void the_user_wants_to_verify_message_as(String string) {
        guru99OrderSuccessful.setVerificationTxt(string);
    }
    @Then("The user wants to enter Credit Card information")
    public void the_user_wants_to_enter_credit_card_information(Map<String,String> dataTable) {
        guru99Payment.setCardNumber(dataTable.get("CreditCard"));
        guru99Payment.setMonth(dataTable.get("ExpirationMonth"));
        guru99Payment.setYear(dataTable.get("ExpirationYear"));
        guru99Payment.setCvvCode(dataTable.get("CvvCode"));

    }


}
