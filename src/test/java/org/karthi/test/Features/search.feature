Feature: 
  In order to go learn about the personal offers
  As a personalcustomer
  I want to be able to search personal in searchbox

  Scenario: searching personal from Homepage
    Given i am in homepage of Vonage website
    When i enter "personal" in searchbox
    Then the page should display personal related contents
