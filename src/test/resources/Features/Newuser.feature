Feature: Create User

  Scenario: Create New user

    Given I get on the homescreen
    When I get o the Login screen
    And I enter email address for new account
    And I click the create accunt button
    When I enter all required details
    And I click the register button
   Then My account should be successfully created