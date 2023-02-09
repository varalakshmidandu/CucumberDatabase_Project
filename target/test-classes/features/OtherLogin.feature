@OtherLoginFeature @Regression
Feature: Techfios Other login functionality validation

  Background: 
    Given User is on techfios login page
     When User enters username as "demo@techfios.com"
     When User enters password as "abc123"

  @OtherScenario1
  Scenario: User should be able to login with valid credentials(Other)
    Given User is on techfios login page
    When User enters username as "demo@techfios.com"
    When User click on signin button
    Then User should land on Dashboard page

  @OtherScenario2
  Scenario: User should not be able to login with invalid credentials(Other)
    Given User is on techfios login page
    When User enters username as "demo2@techfios.com"
    When User click on signin button
    Then User should land on Dashboard page

  @OtherScenario3 @Smoke
  Scenario: User should not be able to login with invalid credentials(Other)
    Given User is on techfios login page
    When User enters username as "demo@techfios.com"
    When User click on signin button
    Then User should land on Dashboard page
