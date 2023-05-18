@SearchBar @smoke
Feature: Search Bar , Find Content through Search Bar

# Failing Manually -  Singapore will not come as part of search Result

  @SearchBar-01 @smoke
  Scenario Outline: As a User, I should able to search content through search bar
    Given I am on Academy Admin Screen
    And  I selected video Tab
    When  I search "<SearchKeyword>"
    Then  I should able to see "<ExpectedResult>"

    Examples:s
    |SearchKeyword|ExpectedResult   |
    |   Bali      |   Singapore     |
