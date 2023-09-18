Feature: Searching for products on Best Buy

  Scenario Outline: User can search for a product
    Given the user is on the Best Buy homepage
    When the user searches for '<product>'
    Then the search results of '<product>' are displayed

    Examples: 
      | product |
      | laptop  |
      | phone   |

