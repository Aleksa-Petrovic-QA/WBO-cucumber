Feature: Draw rectangle and square

  Background: 
    Given User is on WBO home page

  Scenario: Test drawing rectangle
    Given User navigates to the private board
    And User changes the pen color
    When Draws a rectangle
    Then Verify rectangle is displayed

  Scenario: Test drawing square
    Given User navigates to the private board
    And User changes the pen color
    When Draws a square
    Then Verify square is displayed
