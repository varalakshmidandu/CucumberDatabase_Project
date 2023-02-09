@LoginFromDbfeature @Regression
Feature: Techfios billing login functionality validation with driving the data from MYSQL DB

  Background: 
    Given User is on techfios login page
     When User enters username as "demo@techfios.com"
     When User enters password as "abc123"

@Scenario1
Scenario: User should be able to login with valid credentials from DB
#Given User is on techfios login page
#When User enters "username" from techfios database 
#When  User enters "password" from techfios database 
When User click on signin button
Then User should land on Dashboard page

