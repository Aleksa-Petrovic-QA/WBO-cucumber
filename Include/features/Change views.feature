Feature: Change grid view

  Background: 
    Given User is on WBO home page

  Scenario: Test changing grid views
    Given User navigates to the private board
    When User changes the pen color
    And Clicks on the grid icon
    Then The line view is displayed
    When Changes grid view to dots view
    Then The dots view is displayed
    When Changes grid view to default
    Then Default view is displayed
