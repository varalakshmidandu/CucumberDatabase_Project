@Loginfeature @Regression
Feature: Techfios billing login functionality validation

  @Scenario1 @Smoke
  Scenario Outline: User should be able to login with valid credentials
    Given User is on techfios login page
    When User enters username as "<username>"
    When User enters password as "<password>"
    When User click on signin button
    Then User should land on Dashboard page

    Examples: 
      | username           | password |
      | demo@techfios.com  | abc123   |
      | demo2@techfios.com | abc123   |
      | demo@techfios.com  | abc1234  |
      | demo2@techfios.com | abc1234  |
      |                    |          |
#@Scenario5 @Smoke
#Scenario: User should not be able to login with invalid credentials
#Given User is on techfios login page
#When User enters username as ""
#When User enters password as ""
#When User click on signin button
#Then User should land on Dashboard page
