Feature: To change Address

  Background:
    Given I launch app browser
    When I enter apps URL
    And I click on LogIn button
    And I enter a valid Username
    When I enter a valid password
    Then I am successfully log in

  Scenario: user should be able to update,delete and add a new address

   # Given I launch app browser
   # When I enter apps URL
    #And I click on LogIn button
    #And I enter a valid Username
    #When I enter a valid password
    #Then I am successfully log in
    When I click on My addresses
    And I should be able to Update
   Then I should be able to submit address







