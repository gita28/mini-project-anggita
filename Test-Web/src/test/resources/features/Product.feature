Feature: Produk


  Scenario: produk
    Given I am on the Product page
    When I click Select button buy product
    And  click button shopping cart
    Then I go to transaksi page
    And click button rating
    Then I go to rating page