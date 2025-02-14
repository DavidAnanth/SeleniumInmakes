@myntra
Feature: To validate the Myntra site for search validation
  As a user
  I want to validate the search functionality on the Myntra website
  So that I can ensure the search returns accurate products and prices 
 
@myntra
  Scenario: To validate the search scenario against watches
    Given I open the Myntra website
    Then I enter the search text as "fastrack"
    And I click the enter button
    Then I print the price of the third product
@myntra
  Scenario: To validate the search scenario against bags
    Given I open the Myntra website
    Then I enter the search text as "skybags"
    And I click the enter button
    Then I print the price of the first product
