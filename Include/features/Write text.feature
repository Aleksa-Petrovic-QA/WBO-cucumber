Feature: Write text

  Background: 
    Given User is on WBO home page

  Scenario Outline: Test text writting
    Given User navigates to the private board
    And User changes the pen color
    When Writes some <text> text
    Then Verify the text is displayed

    Examples: 
      | text    |
      | testing |
