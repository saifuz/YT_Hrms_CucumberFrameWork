#Author: saifuz.zaman@yahoo.com
@smoke
Feature: Login
  
  Description: this feature is for Testing Log Functionalities

  Scenario Outline: Invalid Login
    When user enter invalid "<UserName>" and "<Password>" combinations and clicks login button
    Then User will see "<ErrorMessage>".

    Examples: 
      | UserName | Password    | ErrorMessage             |
      | Admin    | Admin123    | Invalid credentials      |
      | Saif123  |             | Password cannot be empty |
      |          | Hum@nhrm123 | Username cannot be empty |
