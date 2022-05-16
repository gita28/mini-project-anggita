Feature: Categories

  Scenario: Get - Categories
    Given I set api endopoints for get categories
    When I send Http request get categories
    Then I receive verify categories HTTP response 200
    And I receive valid data get categories

    Scenario: POST - Categories
      Given I set api endopoints for Post categories
      When I send Http request Post categories
      Then I receive validate categories the status code is response 200
      And I receive valid data Post categories