$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/EmpWorkExperience.feature");
formatter.feature({
  "name": "Adding Work Experience to Employee",
  "description": "    Description: User Story \u003d\u003e YT-4: As an admin I should be able to add employee\u0027s Add Work Experience by specifying\n  \t\t\t\t\t\t\t\t\t\t\t\t\t\tCompany,Job Title,  From yyyy-M-dd, To yyyy-M-dd \u0026 Comment.\n  Acceptance Criteria: Added work experience is displayed in work experience data Table",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@YT-4"
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
  "name": "User is navigated to add Work Experience window",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.stepdefinitions.EmpWorkExperienceSteps.user_is_navigated_to_add_Work_Experience_window()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Adding WorkExperience to an Employee by Company,Job Title,  From yyyy-M-dd, To yyyy-M-dd \u0026 Comment",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@YT-4"
    }
  ]
});
formatter.step({
  "name": "User enters data in specified fields",
  "rows": [
    {},
    {},
    {}
  ],
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.stepdefinitions.EmpWorkExperienceSteps.user_enters_data_in_specified_fields(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Verifies that Work Experience is added in work Experience Table",
  "rows": [
    {},
    {}
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.stepdefinitions.EmpWorkExperienceSteps.verify_work_Experience_Table(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", "Adding WorkExperience to an Employee by Company,Job Title,  From yyyy-M-dd, To yyyy-M-dd \u0026 Comment");
formatter.after({
  "status": "passed"
});
});