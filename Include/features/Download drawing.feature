Feature: Download drawing

  Background: 
    Given User is on WBO home page

  Scenario Outline: Test downloading drawing
    Given User navigates to the specific <boardName> board
    When User clicks on Download icon
    Then Verify that the download is successfull

    Examples: 
      | boardName |
      | test test |
