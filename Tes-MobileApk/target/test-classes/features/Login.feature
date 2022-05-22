Feature: Login
  As a user
  I want to login
  So that i can acces my buy product

  Background:

    Given I am on the login page

  @Normal
  Scenario: As a user I have to be able to login in Alta.shop
    When I input valid email Login
    And I input valid password Login
    And click login button Login
    Then I go to product page




