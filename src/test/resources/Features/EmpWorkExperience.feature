@YT-4
Feature: Adding Work Experience to Employee
    Description: User Story => YT-4: As an admin I should be able to add employee's Add Work Experience by specifying
  														Company,Job Title,  From yyyy-M-dd, To yyyy-M-dd & Comment.
  Acceptance Criteria: Added work experience is displayed in work experience data Table

  Background: 
    Given user is logged in HRMS with valid Admin Credential
    And user is naviaged to Employee information page and click on an employee id
    And User is navigated to add Work Experience window

  Scenario: Adding WorkExperience to an Employee by Company,Job Title,  From yyyy-M-dd, To yyyy-M-dd & Comment
    When User enters data in specified fields
      | Company           | JobTitle | From       | To         | Comment  |
      | Syntax Technology | QA       | 2020-02-03 | 2020-06-15 | Current  |
      | ABC Technology    | QA       | 2019-02-03 | 2020-01-31 | Previous |
    Then User Verifies that Work Experience is added in work Experience Table
      | ABC Technology    | QA | 2019-02-03 | 2020-01-31 | Previous |
      | Syntax Technology | QA | 2020-02-03 | 2020-06-15 | Current  |
