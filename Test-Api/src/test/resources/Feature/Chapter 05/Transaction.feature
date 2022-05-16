Feature: Transaction

  Scenario: Get - Transaction
    Given I set api endopoints for get transaction
    When I send Http request get transaction
    Then I receive verify transaction HTTP response 200
    And I receive valid data get transaction

  Scenario: POST - Transaction
    Given I set Post api endopoints for Post transaction
    When I send Http request Post transaction
    Then I receive validate transaction the status code is response 201
    And I receive valid data Pos transaction