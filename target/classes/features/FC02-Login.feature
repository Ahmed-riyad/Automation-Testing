
@smoke

Feature: Customer Registration and Customer Login

  Background: Open Browser and Navigate to Page


  # Scenario SC2
  Scenario: User could log in with valid email and password
    Given user go to login page
    Then user enter email "1@example.com" and Password "P@ssw0rd"
    When user clicks on login button
    Then Screen Navigate to home page


  # Scenario SC3
  Scenario: User could reset his/her password successfully
    Given user go to login page
    Then user clicks on Forget password Link
    Then user enter email "1@example.com"
    When user clicks on Recover button
    Then Success massage appears in green on screen


