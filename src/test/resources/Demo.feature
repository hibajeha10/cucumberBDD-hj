Feature: Payment Gateway function test

  @BuyingProduct_TC1 @Regression
  Scenario: Verify that user can buy Elephant Toy
    Given The user wants to go to Payment Gateway Website
    When The user wants to buy an elephant toy
    Then The user wants to provide requested payment information
    And The user wants to click on pay now button
    Then The user wants to verify order is successful


    # 1) is go to website
    # 2) is choose quantity and click buy
    # 3) provide all req info
    # 4) verify that order is successful
  # We hard coded so if any changes need to be made we do it here

  @BuyingProduct_TC2 @Regression
  Scenario: Verify that user can buy multiple products
    Given The user wants to go to Payment Gateway Website
    When The user wants to buy elephant toy as "5"
    Then The user wants to enter Credit Card as "1234567891234567"
    And The user wants to enter Expiration Month as "11"
    And The user wants to enter Expiration Year as "2026"
    And The user wants to enter CVV Code as "123"
    And The user wants to click on pay now button
    Then The user wants to verify message as "Payment successfull!"

    @TC21
  Scenario: Verify that user can buy multiple products - using map format
    Given The user wants to go to Payment Gateway Website
    When The user wants to buy elephant toy as "5"
    Then The user wants to enter Credit Card information
    |CreditCard| 1234567891234567|
    |ExpirationMonth| 11         |
    |ExpirationYear | 2026       |
    |CvvCode        |123         |
    And The user wants to click on pay now button
    Then The user wants to verify message as "Payment successfull!"







