Feature: Demo Banking Site- Negative Scenarios

  Scenario: Verify that user is unable to login to Application with invalid credentials
    Given User is in the login page
    And User enters the invalid login details
    Then User should able to see the error message


  Scenario: Verify the user is able to see the prompt message before deleting the account
    Given User is in the login page
    When User enters  username as "mngr571498" and password as "zyrUgUq "
    And User clicks on login button
    And User click on the edit option
    And User clicks on the submit button
    Then User should able to see the prompt message

  Scenario: Verify the user is able to see the message to enter the numerical values
    Given User is in the login page
    When User enters  username as "mngr571498" and password as "zyrUgUq "
    And User clicks on login button
    And User click on the edit option
    And User enters character values in the account number text box
    Then User should able to see the error message to update correct values

  Scenario: Verify the user is able to see the message to enter the pin with 6 digits
    Given User is in the login page
    When User enters  username as "mngr571498" and password as "zyrUgUq "
    And User clicks on login button
    And User clicks on the new customer option
    And User enters the pin with three numerical characters
    Then User should able to see the message to have six digits


  Scenario: Verify the user is able to see the message to enter the numerical values in  the Telephone Number text box
    Given User is in the login page
    When User enters  username as "mngr571498" and password as "zyrUgUq "
    And User clicks on login button
    And User clicks on the new customer option
    And User enters the character values in the Telephone Number text box
    Then User should able to see the message to update the telephone number