Feature: Common2

  Scenario: The common steps

    Given I launch application browser
    When I enter application URL
    And I clickLogIn button
    And I enter correct Username
    When I enter correct password
    Then I Log in successfully