Feature: Register
  As an admin
  I want to get detail user
  So that i can update the user data

  Scenario: Post - register
    Given I set api endopoints for Post new username email and password
    When I send Post Http request detail user
    Then I receive validate register the status code is response 400
    And I receive valid data for new user



