Feature: Draw ellipse and circle

  Background: 
    Given User is on WBO home page

  Scenario: Test drawing ellipse
    Given User navigates to the private board
    And User changes the pen color
    When Draws a ellipse
    Then Verify ellipse is displayed

  Scenario: Test drawing circle
    Given User navigates to the private board
    And User changes the pen color
    When Draws a circle
    Then Verify circle is displayed
