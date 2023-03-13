Feature: Zoom in and out

  Background: 
    Given User is on WBO home page

  Scenario: Test zooming in
    Given User navigates to the private board
    And User changes the pen color
    And Draws a straight line
    And Clicks zoom in icon 
    When Zoom in page
    Then Verify page is zoomed in

  Scenario: Test zooming out
    Given User navigates to the private board
    And User changes the pen color
    And Draws a straight line
    And Clicks zoom in icon 
    When Zoom out page
    Then Verify page is zoomed out
