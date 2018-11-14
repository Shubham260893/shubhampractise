$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/workspace/myproject/src/test/java/com/qa/feature/freecrm.feature");
formatter.feature({
  "line": 1,
  "name": "Freecrm Login functionality",
  "description": "",
  "id": "freecrm-login-functionality",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "To test Login",
  "description": "",
  "id": "freecrm-login-functionality;to-test-login",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Chrome"
    },
    {
      "line": 3,
      "name": "@Firefox"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user is on Login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user navigate to login page",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user click on Contacts",
  "keyword": "When "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "freecrm-login-functionality;to-test-login;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 11,
      "id": "freecrm-login-functionality;to-test-login;;1"
    },
    {
      "cells": [
        "naveenk",
        "test@123"
      ],
      "line": 12,
      "id": "freecrm-login-functionality;to-test-login;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": "To test Login",
  "description": "",
  "id": "freecrm-login-functionality;to-test-login;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Chrome"
    },
    {
      "line": 3,
      "name": "@Firefox"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user is on Login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters \"naveenk\" and \"test@123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user navigate to login page",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user click on Contacts",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.user_is_on_Login_page()"
});
formatter.result({
  "duration": 50688303400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "naveenk",
      "offset": 13
    },
    {
      "val": "test@123\"",
      "offset": 27
    }
  ],
  "location": "StepDefinitions.user_enters_username_and_password(String,String)"
});
formatter.result({
  "duration": 3720302497,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_navigate_to_login_page()"
});
formatter.result({
  "duration": 2707349660,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_click_on_Contacts()"
});
formatter.result({
  "duration": 23507134417,
  "status": "passed"
});
});