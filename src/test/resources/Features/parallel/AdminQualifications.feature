#Author: saifuz.zaman@yahoo.com
@regression @parallel
Feature: Admin Qualification Menu
  Description: User Story => YT-9: As an admin user should be able to add different languages in qualifications
  Acceptance Criteria: Added Languages are displayed in Language page

  Background: 
    Given user is logged in HRMS with valid Admin Credential
    And user is naviaged to add Language window and click on add button

  Scenario: Admin is able to add different languages in Qualifications
    When user enter following qualifications,clicks on save button and message is displayed
      | LanguageName |
      | Chechen      |
      | Dautch       |
      | Belarusian   |
