@sanity @transfer
Feature: to transfer amount in the bank

  Scenario: 
    Given the site is up
    When the credentials are validated
    Then user is taken to dashboard
    And clicks on money transfer
    And enter the account number
    And amount to be transferred
    Then click on transfer button
