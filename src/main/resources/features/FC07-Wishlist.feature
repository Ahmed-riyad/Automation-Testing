@smoke

  Feature: Logged user could add different products to Wishlist & Compare

    Background: Open Browser and Navigate to Page
      Given user go to login page
      Then user enter email "1@example.com" and Password "P@ssw0rd"
      When user clicks on login button

      #Scenario: SC10
    Scenario: Logged user could add different products to Wishlist
      Given user select Apparel and go to sub category Shoes
      Then user select color red from CheckBox
      Then user select size and color
      Then user add item to Wishlist
      Then user select Computers and go to sub category Software
      And user select Windows-8-Pro and added to Wishlist

      #Scenario: SC11
    Scenario: Logged user could add different products to compare list
      Given user go to Electronics category
      And user select Cell phones Subcategory
      Then user select Mobile HTC One M-8
      Then user add mobile to compare list
      Then user go to Electronics category
      And user select Cell phones Subcategory
      Then user select Mobile HTC One Mini Blue
      Then user go to Compare Page



