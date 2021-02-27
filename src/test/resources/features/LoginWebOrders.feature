#Author: S Srikanth
#Date: 22/02/2021
#Description: Login to web orders page

Feature: Web Orders Login

@SmokeTests
Scenario: Validate the Login
Given user is on web order login page
When user enter username and password
And user clicks on login button
Then welcome text is displayed on user account
And web orders home page is displayed. 
