#Author: S Srikanth
#Keywords Summary :
#Description: Parameterization and Data Driven


Feature: Place an E-Commerce Order


  Scenario: Login to e-commerce app
    Given user is logged into e_commerce app
    When user is on Dresses page
    When user selects the dressType
    When user moves the cursor on dress
    When user selects more details link
    When user selects size and quantity and color  
    When user clicks Add to cart button
    Then verify message saying item added successfully to cart
    Then user clicks proceed to checkout button


    