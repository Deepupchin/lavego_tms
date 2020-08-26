$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/initialiseAPI.feature");
formatter.feature({
  "name": "Lavego_TMS Intialize API",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Validate Initialize API (Happy flow)",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Intialize"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "i am authorized user",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinations.InitializeApi_testSteps.i_am_authorized_user()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i add device info to server",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinations.InitializeApi_testSteps.i_add_device_info_to_server()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Information added",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinations.InitializeApi_testSteps.information_added()"
});
formatter.result({
  "status": "passed"
});
});