Feature: Register


  Scenario: As a user I have to be able to register in alta.shop
    Given I am on the Register page
    When I input valid username
    And I input valid email
    And I input valid password
    And click register button
    Then I go to login page