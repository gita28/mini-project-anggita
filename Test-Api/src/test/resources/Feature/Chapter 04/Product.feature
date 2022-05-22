Feature: Product

  Scenario: Get - Product
    Given I set api endopoints for get product
    When I send Http request get product
    Then I receive verify product HTTP response 200
    And I receive valid data get product

  Scenario: POST - Product
    Given I set Post api endopoints for Post Product
    When I send Http request Post Product
    Then I receive validate product the status code is response 200
    And I receive valid data Product transaction

    Scenario: Get id - Product
      Given  I set api endopoints for get id product
      When I send Http request get id product
      Then I receive verify product id HTTP response 200
      And I receive valid data get id product