Feature: Login


  Scenario: Post - login
    Given I set Post api endopoints for post new email and password
    When I send Post Http request detail user for login
    Then I receive validate login the status code is response 201
    And I receive valid data for user


  @Failed
  Scenario:Post - Failed login
    When I set Post Api Endopoint for post new email and password
    And I send Post Http request detail user for login
    And I receive validate login the status code is response
    Then error message "Epic sadface: Sorry, this user has been locked out."
