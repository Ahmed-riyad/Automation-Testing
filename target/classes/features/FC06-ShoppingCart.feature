@smoke

Feature: Shopping Cart (Add Product/s, Update Quantity, Remove Product)

  Background: Open Browser and Navigate to Page
      Given user go to login page
      Then user enter email "1@example.com" and Password "P@ssw0rd"
      When user clicks on login button

    #Scenario SC9-2
    Scenario: Logged user add products to Cart and update / remove items
      Given user go to Electronics category
      And user select Cell phones Subcategory
      Then user select Mobile HTC One M-8
      Then user add mobiles to Quantity
      Then user add mobile to Shopping cart
      Then user select Apparel and go to sub category Shoes
      Then user select color red from CheckBox
      Then filter option view results
      And user add item to Shopping cart
      And user go to Shopping Cart page
      Then user update Shopping cart Quantity
      And user remove one of items from cart
