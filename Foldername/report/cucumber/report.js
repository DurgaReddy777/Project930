$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/Login.feature");
formatter.feature({
  "name": "To validate the Login Facebook functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To verify Login Facebook with with valid credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User is in Facebook Login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPage.user_is_in_Facebook_Login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to enter the valid username and valid password",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPage.user_has_to_enter_the_valid_username_and_valid_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click the Login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPage.click_the_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to navigate to the HomePage",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPage.user_has_to_navigate_to_the_HomePage()"
});
formatter.result({
  "status": "passed"
});
});