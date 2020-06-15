#Author: saifuz.zaman@yahoo.com
#@regression
@YT-10
Feature: Language options under Employee Qualification
  Description: User Story => YT-10: As an admin user should be able to add any available languages to any employee by specifying
  														Language,Fluency & Competency.
  Acceptance Criteria: Added Languages are displayed in Language data Table

  Background: 
    Given user is logged in HRMS with valid Admin Credential
    And user is naviaged to Employee information page and click on an employee id
    And User is navigated to add Language window

  Scenario: Adding language to an Employee by Language,Fluency & Competency
    When User selects a language named "Bengali"
    And user selects fluency and Competency from DataTable for "Bengali"
      | fluency  | Competency    |
      | Writing  | Mother Tongue |
      | Speaking | Mother Tongue |
      | Reading  | Mother Tongue |
    Then User Verifies that language is added with fluency and Competency
     |Bengali| Writing  | Mother Tongue |

