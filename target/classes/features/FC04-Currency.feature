@smoke

Feature: Change Products Currencies
 Background: Open Browser and Navigate to Page
  Given user go to login page
  Then user enter email "1@1example.com" and Password "P@ssw0rd"
  When user clicks on login button

  #Scenario SC5
  Scenario: Logged User could switch between currencies US-Euro
   Given user clicks on currencies list and select euro
   Then user can see € sign in products

  #Scenario SC6
  Scenario: Logged user could select different Categories
   Given user select different category tabs
   Then user select Computers and go to sub category Software
   When user clicks on currencies list and select euro
   Then user can see € sign in products
   And user select Windows-8-Pro



