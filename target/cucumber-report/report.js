$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "",
  "description": "In order to assign a test\r\nAs a parent\r\nI should be able to login successfully",
  "id": "",
  "keyword": "Feature"
});
formatter.before({
  "duration": 19831426690,
  "status": "passed"
});
formatter.before({
  "duration": 1082094,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Login successfully",
  "description": "",
  "id": ";login-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I am on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I enter a keyword \"selenium\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.iAmOnLoginPage()"
});
formatter.result({
  "duration": 14313299940,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "selenium",
      "offset": 19
    }
  ],
  "location": "LoginSteps.iEnterAKeyword(String)"
});
formatter.result({
  "duration": 401890206,
  "status": "passed"
});
formatter.after({
  "duration": 271751,
  "status": "passed"
});
});