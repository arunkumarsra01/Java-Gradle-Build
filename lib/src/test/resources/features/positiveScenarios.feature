Feature: Demo Banking Site- Positive Scenarios

  Background: Login in to the application
    Given User is in login page
    When User enters the username as "mngr571498" and password as "zyrUgUq "
    And User clicks on the login button


  Scenario: Verify the user is able to banking application
    Then User should able to verify the manager Id


  Scenario: Verify that the user is able to see the available option in the banking application
    Then  User should able to see the list of banking services provided


  Scenario: Verify the user is able to logout from the application
    And User clicks on the logout button
    Then User should able to see the alert window
#
  Scenario: Verify the user is able to edit the address details
    And User click on the Edit customer option
    And User enters the account details and updates the city details
    And user clicks on submit button


  Scenario: Validate the user is able to see the saved Scenario
    And User click on the Edit customer option
    And User enters the account details
    Then User should able to see the entered details matched with saved scenario