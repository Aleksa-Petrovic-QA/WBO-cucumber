Feature: Draw lines with pen

  Background: 
    Given User is on WBO home page

  Scenario: Test drawing lines with pen
    Given User navigates to the private board
    And User changes the pen color
    When Draws two lines
    Then Verify two lines are displayed
    And User increaces pen size
    When Whites out one line
    Then Verify one line remained
