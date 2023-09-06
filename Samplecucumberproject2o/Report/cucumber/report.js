$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/sakithyah/eclipse-workspace/Samplecucumberproject2o/Features/AdactinLogin.feature");
formatter.feature({
  "line": 1,
  "name": "Check the Login Adactin functionality",
  "description": "",
  "id": "check-the-login-adactin-functionality",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Login Adactin",
  "description": "",
  "id": "check-the-login-adactin-functionality;login-adactin",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "User is an Adactin Page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user is an enter the \"kalai1327\" and \"32F5M5\" and click login button",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "Message displayed Login successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "AdactinLogin.user_is_an_Adactin_Page()"
});
formatter.result({
  "duration": 11014966000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "kalai1327",
      "offset": 22
    },
    {
      "val": "32F5M5",
      "offset": 38
    }
  ],
  "location": "AdactinLogin.user_is_an_enter_the_and_and_click_login_button(String,String)"
});
formatter.result({
  "duration": 425062200,
  "status": "passed"
});
formatter.match({
  "location": "AdactinLogin.message_displayed_Login_successfully()"
});
formatter.result({
  "duration": 1368559700,
  "status": "passed"
});
});