@smoke

  Feature: Shopping Cart (Add Product/s, Update Quantity)

    Background: Open Browser and Navigate to Page
      Given user go to login page
      Then user enter email "1@example.com" and Password "P@ssw0rd"
      When user clicks on login button

    #Scenario SC9
    Scenario: Logged user could add products to Shopping cart By filter
    Given user select Apparel and go to sub category Shoes
      Then user select color red from CheckBox
      Then filter option view results
      And user add item to Shopping cart

    #Scenario SC9-1
    Scenario: Logged user could add different products to Shopping cart
      Given user select Apparel and go to sub category Shoes
      Then user select color red from CheckBox
      Then filter option view results
      And user add item to Shopping cart
      Then user go to Electronics category
      And user select Cell phones Subcategory
      Then user select Mobile HTC One M-8
      Then user add mobiles to Quantity
      Then user add mobile to Shopping cart




