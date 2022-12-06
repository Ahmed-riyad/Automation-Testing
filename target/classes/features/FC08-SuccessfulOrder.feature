@smoke

  Feature: Logged user could Create Successful Order

    Background: Open Browser and Navigate to Page


    #Scenario SC12
    Scenario: Logged user can update items and order
      Given user go to login page
      Then user enter email "1@example.com" and Password "P@ssw0rd"
      When user clicks on login button
      Then user go to Electronics category
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
      Then user check Agree Box and press CheckOut
      Then user fill shipping form
      When User Check Out Order Successfully



