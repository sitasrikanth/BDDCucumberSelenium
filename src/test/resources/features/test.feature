#Author: Srikanth
#Date: 12-12-2020
#Description: To test the login feature
#Tags: We can use the selected tags to run. ex: @Smokefeatures and @SmokeTests


@SmokeFeatures
Feature: Feature to test login functionality

@SmokeTests
  Scenario: Check login successful with valid credentials
    Given user is on login page
    When user enters username and password
    And user clicks on submit button
    Then user is logged-in successfully
    And user is navigated to home page
