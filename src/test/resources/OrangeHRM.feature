Feature: Functional Testing on OrangeHRM

  @LoginFunctionality
  Scenario: Login to OrangeHRM
    Given The user wants to go to OrangeHRM website
    When The user wants to enter username and password
    Then The user wants to click on login button
    And The user wants to verify login browser landed on Dashboard

    @ParameterizedDashboard @TC100
    Scenario: Login to OrangeHRM with Parameterized message
    Given The user wants to go to OrangeHRM website
    When The user wants to enter username and password
    Then The user wants to click on login button
    And The user wants to verify that browser landed on "Dashboard"

      @TC_200
    Scenario: Add a new employee
      Given The user wants to go to OrangeHRM website
      When The user wants to enter username and password
      Then The user wants to click on login button
      And The user wants to verify that browser landed on "Dashboard"
      Then The user wants to click on PIM Module
      And The user wants to go to Add Employee Page
      Then The user wants to add first name as "Moe"
      Then The user wants to add lastname as "Jeha"
      Then The user wants to save personal information
      Then The user should be able to see "Personal Details"

        # in this scenario, we are using Map to provide multiple pieces of information
  @TC300
    Scenario: Add a new employee - different format - using map
      Given The user wants to go to OrangeHRM website
      When The user wants to enter username and password
      Then The user wants to click on login button
      And The user wants to verify that browser landed on "Dashboard"
      Then The user wants to click on PIM Module
      And The user wants to go to Add Employee Page
      Then The user wants to add employees first and last name
      #Keys              Values
      |FirstName   |       Eloise12|
      |LastName    |      Renastech1212|
      Then The user wants to add login details as following
         #Keys              Values
      |UserName    |        Eloise123|
      |Password    |       Renastech!123@|
      |Status      |       Disabled      |
      Then The user wants to save personal information
      Then The user should be able to see "Personal Details"

    @TC400
    Scenario: Add a new employee - Third format using List
      Given The user wants to go to OrangeHRM website
      When The user wants to enter username and password
      Then The user wants to click on login button
      And The user wants to verify that browser landed on "Dashboard"
      Then The user wants to click on PIM Module
      And The user wants to go to Add Employee Page
      Then The user wants to add employees and last name using a List Method
      #using value only
      #FirstName    LastName
      |Benjamin|  Renastech22|
      |Abdul   |  Renastech33 |
      |Anil    |Renastech44   |
      Then The user wants to add login details in List way
      #username       password        status
      |renastech234| Renastech!@002| Disabled|
      |abcRenastechh| RenasRenas!@!| Enabled |
      |abc123Renas  |Renastech123@!|Enabled  |
      Then The user wants to save personal information
      Then The user should be able to see "Personal Details"





