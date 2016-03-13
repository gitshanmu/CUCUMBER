Feature: 
  In order to stop invalid user login
  As a Customer
  I want to be notified with a message

  Scenario: 
    User logs in with invalid credentials

    Given i am in homepage of Vonage website
    When Hover over the Sign/In link and Enter invalid credentials
    Then System should be directed to login page
    And Error message should be displayed
