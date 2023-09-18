Feature: Change Language on Best Buy Website

@SmokeTest
  Scenario Outline: User can change the language on the Best Buy site
    Given the user is on the Best Buy homepage
    When the user clicks on the '<language>' link
    Then the site content should be displayed in the '<language>' language

    Examples: 
      | language |
      | Français |
      | English  |
