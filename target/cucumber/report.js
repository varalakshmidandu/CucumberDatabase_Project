$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/TechFiosLoginFromDB.feature");
formatter.feature({
  "line": 2,
  "name": "Techfios billing login functionality validation with driving the data from MYSQL DB",
  "description": "",
  "id": "techfios-billing-login-functionality-validation-with-driving-the-data-from-mysql-db",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@LoginFromDbfeature"
    },
    {
      "line": 1,
      "name": "@Regression"
    }
  ]
});
formatter.before({
  "duration": 3024281200,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User is on techfios login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enters username as \"demo@techfios.com\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User enters password as \"abc123\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefinitions.user_is_on_techfios_login_page()"
});
formatter.result({
  "duration": 690607900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "demo@techfios.com",
      "offset": 25
    }
  ],
  "location": "LoginStepDefinitions.user_enters_username_as_(String)"
});
formatter.result({
  "duration": 3130474300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc123",
      "offset": 25
    }
  ],
  "location": "LoginStepDefinitions.user_enters_password_as(String)"
});
formatter.result({
  "duration": 3133675500,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "User should be able to login with valid credentials from DB",
  "description": "",
  "id": "techfios-billing-login-functionality-validation-with-driving-the-data-from-mysql-db;user-should-be-able-to-login-with-valid-credentials-from-db",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@Scenario1"
    }
  ]
});
formatter.step({
  "comments": [
    {
      "line": 11,
      "value": "#Given User is on techfios login page"
    },
    {
      "line": 12,
      "value": "#When User enters \"username\" from techfios database"
    },
    {
      "line": 13,
      "value": "#When  User enters \"password\" from techfios database"
    }
  ],
  "line": 14,
  "name": "User click on signin button",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "User should land on Dashboard page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinitions.user_click_on_signin_button()"
});
formatter.result({
  "duration": 4198889100,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinitions.user_should_land_on_Dashboard_page()"
});
formatter.result({
  "duration": 160514000,
  "status": "passed"
});
formatter.after({
  "duration": 16270308000,
  "status": "passed"
});
});