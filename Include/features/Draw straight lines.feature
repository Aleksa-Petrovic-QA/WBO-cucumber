Feature: Draw straight lines with lower opacity

  Background: 
    Given User is on WBO home page

  Scenario: Test drawing straight lines with lower opacity
    Given User navigates to the private board
    And User changes the pen color
    And User changes pen opacity
    When Draws two straight lines
    Then Verify two straight lines are displayed
