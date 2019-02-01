$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/NewJavaSeleniumWS/DemoCucumberJunit/src/main/java/com/demo/Features/UseMapDataTableLogin.feature");
formatter.feature({
  "line": 1,
  "name": "Flipkart login",
  "description": "",
  "id": "flipkart-login",
  "keyword": "Feature"
});
formatter.before({
  "duration": 974080,
  "status": "passed"
});
formatter.before({
  "duration": 99413,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "This is second scenario",
  "description": "",
  "id": "flipkart-login;this-is-second-scenario",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 19,
      "name": "@DemoTest"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "Print second scenario",
  "keyword": "Given "
});
formatter.match({
  "location": "DemoFLoginStepDefinition.print_second_scenario()"
});
formatter.result({
  "duration": 462045670,
  "status": "passed"
});
formatter.after({
  "duration": 266240,
  "status": "passed"
});
formatter.after({
  "duration": 90453,
  "status": "passed"
});
});