Feature:

  Scenario Outline: Invalid username or password should return the correct error message

    Given I land on the homepage
    And I press the sign in link
    When I Type "<username>"
    And I Input "<password>"
    When i click login
    Then I should get the correct "<error>"

    Examples:
      | username                  | password         | error                        |
      |lanre_april@gmail.com      | test             | Invalid password.            |
      |lanre_     @gmail.com      | testing          | Invalid email address.       |
      |                           |                  | An email address required.   |
