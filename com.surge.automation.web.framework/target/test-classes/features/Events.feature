@Events
Feature: Events Feature, create, join and list events

  @Event-01
  Scenario Outline:  As a User, I should able to create event
    Given I am on Event screen
    When I click on create event
    And I fill mandatory details "<Event Prefix>" ,"<Event Description>"
    And I click on publish button
    Then I should able to see event listing on the screen

    Examples:
    |Event Prefix|Event Description|
    | Group Event       |  Event is created by Automation Script|