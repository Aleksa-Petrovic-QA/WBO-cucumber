Feature: Erase drawing

  Background: 
    Given User is on WBO home page

  Scenario: Test erasing drawing
    Given User navigates to the private board
    And User changes the pen color
    And Draws a straight line
    And Verify line is displayed
    When Erases drawing
    Then Verify drawing is erased
