$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/EmpQualification.feature");
formatter.feature({
  "name": "Language options under Employee Qualification",
  "description": "  Description: User Story \u003d\u003e YT-10: As an admin user should be able to add any available languages to any employee by specifying\n  \t\t\t\t\t\t\t\t\t\t\t\t\t\tLanguage,Fluency \u0026 Competency.\n  Acceptance Criteria: Added Languages are displayed in Language data Table",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@addlanguage1"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Adding language to an Employee by Language,Fluency \u0026 Competency",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is logged in HRMS with valid Admin Credential",
  "keyword": "Given "
});
formatter.step({
  "name": "user is naviaged to Employee information page and click on an \"\u003cemployee_id\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User is navigated to add Language window",
  "keyword": "And "
});
formatter.step({
  "name": "User selects a language named \"\u003cLanguage\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user selects \"\u003cFluency\u003e\" and \"\u003cCompetency\u003e\" from DataTable for \"\u003cLanguage\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User Verifies that \"\u003cLanguage\u003e\" is added with \"\u003cFluency\u003e\" and \"\u003cCompetency\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Language",
        "Fluency",
        "Competency",
        "employee_id"
      ]
    },
    {
      "cells": [
        "English",
        "Writing",
        "Good",
        "9669A"
      ]
    },
    {
      "cells": [
        "Hindi",
        "Writing",
        "Good",
        "9525A"
      ]
    },
    {
      "cells": [
        "Japanese",
        "Speaking",
        "Good",
        "9362A"
      ]
    },
    {
      "cells": [
        "Spanish",
        "Reading",
        "Good",
        "9413A"
      ]
    },
    {
      "cells": [
        "Turkish",
        "Speaking",
        "Good",
        "9418A"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Adding language to an Employee by Language,Fluency \u0026 Competency",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@addlanguage1"
    }
  ]
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
  "name": "user is naviaged to Employee information page and click on an \"9669A\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.stepdefinitions.AddEmpLanguage.user_is_naviaged_to_Employee_information_page_and_click_on_an(java.lang.String)"
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
formatter.step({
  "name": "User selects a language named \"English\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.stepdefinitions.EmpQualificationSteps.user_selects_a_language_named(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects \"Writing\" and \"Good\" from DataTable for \"English\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.stepdefinitions.AddEmpLanguage.user_selects_and_from_DataTable_for(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Verifies that \"English\" is added with \"Writing\" and \"Good\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.stepdefinitions.AddEmpLanguage.user_Verifies_that_is_added_with_and(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", "Adding language to an Employee by Language,Fluency \u0026 Competency");
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Adding language to an Employee by Language,Fluency \u0026 Competency",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@addlanguage1"
    }
  ]
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
  "name": "user is naviaged to Employee information page and click on an \"9525A\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.stepdefinitions.AddEmpLanguage.user_is_naviaged_to_Employee_information_page_and_click_on_an(java.lang.String)"
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
formatter.step({
  "name": "User selects a language named \"Hindi\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.stepdefinitions.EmpQualificationSteps.user_selects_a_language_named(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects \"Writing\" and \"Good\" from DataTable for \"Hindi\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.stepdefinitions.AddEmpLanguage.user_selects_and_from_DataTable_for(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Verifies that \"Hindi\" is added with \"Writing\" and \"Good\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.stepdefinitions.AddEmpLanguage.user_Verifies_that_is_added_with_and(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png", "Adding language to an Employee by Language,Fluency \u0026 Competency");
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Adding language to an Employee by Language,Fluency \u0026 Competency",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@addlanguage1"
    }
  ]
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
  "name": "user is naviaged to Employee information page and click on an \"9362A\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.stepdefinitions.AddEmpLanguage.user_is_naviaged_to_Employee_information_page_and_click_on_an(java.lang.String)"
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
formatter.step({
  "name": "User selects a language named \"Japanese\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.stepdefinitions.EmpQualificationSteps.user_selects_a_language_named(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects \"Speaking\" and \"Good\" from DataTable for \"Japanese\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.stepdefinitions.AddEmpLanguage.user_selects_and_from_DataTable_for(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Verifies that \"Japanese\" is added with \"Speaking\" and \"Good\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.stepdefinitions.AddEmpLanguage.user_Verifies_that_is_added_with_and(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded2.png", "Adding language to an Employee by Language,Fluency \u0026 Competency");
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Adding language to an Employee by Language,Fluency \u0026 Competency",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@addlanguage1"
    }
  ]
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
  "name": "user is naviaged to Employee information page and click on an \"9413A\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.stepdefinitions.AddEmpLanguage.user_is_naviaged_to_Employee_information_page_and_click_on_an(java.lang.String)"
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
formatter.step({
  "name": "User selects a language named \"Spanish\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.stepdefinitions.EmpQualificationSteps.user_selects_a_language_named(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects \"Reading\" and \"Good\" from DataTable for \"Spanish\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.stepdefinitions.AddEmpLanguage.user_selects_and_from_DataTable_for(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Verifies that \"Spanish\" is added with \"Reading\" and \"Good\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.stepdefinitions.AddEmpLanguage.user_Verifies_that_is_added_with_and(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded3.png", "Adding language to an Employee by Language,Fluency \u0026 Competency");
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Adding language to an Employee by Language,Fluency \u0026 Competency",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@addlanguage1"
    }
  ]
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
  "name": "user is naviaged to Employee information page and click on an \"9418A\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.stepdefinitions.AddEmpLanguage.user_is_naviaged_to_Employee_information_page_and_click_on_an(java.lang.String)"
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
formatter.step({
  "name": "User selects a language named \"Turkish\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.stepdefinitions.EmpQualificationSteps.user_selects_a_language_named(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects \"Speaking\" and \"Good\" from DataTable for \"Turkish\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.stepdefinitions.AddEmpLanguage.user_selects_and_from_DataTable_for(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Verifies that \"Turkish\" is added with \"Speaking\" and \"Good\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.stepdefinitions.AddEmpLanguage.user_Verifies_that_is_added_with_and(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded4.png", "Adding language to an Employee by Language,Fluency \u0026 Competency");
formatter.after({
  "status": "passed"
});
});