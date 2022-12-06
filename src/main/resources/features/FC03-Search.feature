@smoke

  Feature: Searching for products

    Background: Open Browser and Navigate to Page
      Given user go to login page
      Then user enter email "1@example.com" and Password "P@ssw0rd"
      When user clicks on login button

      #Scenario SC4
     Scenario Outline: Logged User could search for any product
        Given user search for items in search box For "<products>"
       Examples:
       |products|
       |Lenovo|
       |Fahrenheit|
       |Shoes    |






