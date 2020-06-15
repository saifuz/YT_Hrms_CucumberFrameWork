$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/EmpQualification.feature");
formatter.feature({
  "name": "Language options under Employee Qualification",
  "description": "  Description: User Story \u003d\u003e YT-10: As an admin user should be able to add any available languages to any employee by specifying\n  \t\t\t\t\t\t\t\t\t\t\t\t\t\tLanguage,Fluency \u0026 Competency.\n  Acceptance Criteria: Added Languages are displayed in Language data Table",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@YT-10"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is logged in HRMS with valid Admin Credential",
  "keyword": "Given "
});
formatter.match({
  "location": "com.hrms.stepdefinitions.AdminQualifications.user_is_logged_in_HRMS_with_valid_Admin_Credential()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is naviaged to Employee information page and click on an employee id",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.stepdefinitions.EmpQualificationSteps.user_is_naviaged_to_Employee_information_page_and_click_on_an_employee_Name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is navigated to add Language window",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.stepdefinitions.EmpQualificationSteps.user_is_navigated_to_add_Language_window()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Adding language to an Employee by Language,Fluency \u0026 Competency",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@YT-10"
    }
  ]
});
formatter.step({
  "name": "User selects a language named \"Bengali\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.stepdefinitions.EmpQualificationSteps.user_selects_a_language_named(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects fluency and Competency from DataTable for \"Bengali\"",
  "rows": [
    {},
    {},
    {},
    {}
  ],
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.stepdefinitions.EmpQualificationSteps.selectingCompetency(java.lang.String,io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Verifies that language is added with fluency and Competency",
  "rows": [
    {}
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.stepdefinitions.EmpQualificationSteps.user_Verifies_that_is_added_with_fluency_and_Competency(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", "Adding language to an Employee by Language,Fluency \u0026 Competency");
formatter.after({
  "status": "passed"
});
});