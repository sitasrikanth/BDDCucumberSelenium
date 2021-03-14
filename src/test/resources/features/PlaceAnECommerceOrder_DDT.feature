#Author: S Srikanth
#Keywords Summary :
#Description: Parameterization and Data Driven


Feature: Place an E-Commerce Order


  Scenario Outline: Login to e-commerce app
    Given user is logged into e_commerce app
    When user is on Dresses page
    When user selects the <dressType>
    When user moves the cursor on <dressName>
    When user selects more details link
    When user selects <quantity> and <size> and <color>  
    When user clicks Add to cart button
    Then verify message saying item added successfully to cart
    Then user clicks proceed to checkout button

Examples:
	|dressType|dressName						|size|quantity|color|
	|Casual		|Printed Dress				|S		| 1			|Orange|
	|Evening	|Printed Dress				|M		| 2			|Beige|
	|Summer		|Printed Summer Dress |M		| 3			|Blue|
    	