Feature: Login
  As a user
  I want to login
  So that i can acces my buy product

  Background:

    Given I am on the login page

  @Normal
  Scenario: As a user I have to be able to login in Alta.shop
    When I input valid email
    And I input valid password
    And click login button
    Then I go to product page

  @Failed
  Scenario: Failed login
    When I input unvalid email
    And I input valid password
    And click login button
    Then error message "record not found"



