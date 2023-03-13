Feature: Drawing manipulation

  Background: 
    Given User is on WBO home page

  Scenario: Test moving drawing by selector
    Given User navigates to the private board
    And User changes the pen color
    And Draw a line
    When Moves drawing with selector
    Then Verify drawing moved by selector

  Scenario: Test selecting drawing
    Given User navigates to the private board
    And User changes the pen color
    And Draw a line
    And Moves drawing with selector
    When Select the drawing
    Then Verify drawing selected

  Scenario: Test expanding the drawing
    Given User navigates to the private board
    And User changes the pen color
    And Draw a line
    And Moves drawing with selector
    And Select the drawing
    When Expand the drawing
    Then Verify drawing expanded

  Scenario: Test moving drawing by hand
    Given User navigates to the private board
    And User changes the pen color
    And Draw a line
    When Moves drawing by hand
    Then Verify drawing moved by hand
