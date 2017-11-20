$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Workspace/CucumberSampleProjct/Test.feature");
formatter.feature({
  "name": "Cucumber Testing",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Cucumber",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Cucumber given annotation",
  "keyword": "Given "
});
formatter.match({
  "location": "Basics.GivenCommand()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Cucumber when annotation",
  "keyword": "When "
});
formatter.match({
  "location": "Basics.WhenCommand()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Cucumber then annotation",
  "keyword": "Then "
});
formatter.match({
  "location": "Basics.ThenCommand()"
});
formatter.result({
  "status": "passed"
});
});