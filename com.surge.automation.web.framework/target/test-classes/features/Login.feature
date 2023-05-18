@Login
Feature: Login Feature, In order to use Application i want to Login by Linkedin and  Gmail account

  @Login-01 @LoginWithLinkedin @smoke
  Scenario: As a User, I should able to Login By Linkedin
    Given I am on Login Screen
    When  I authenticate with Linkedin
    Then  I should able to see welcome screen


