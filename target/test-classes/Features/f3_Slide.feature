Feature: Testing Slide Component on a Website

  Background:
    Given the user is on the Best Buy homepage
    And the slide component is present on the page


  Scenario: User can navigate through the slides
    When the user clicks on the next slide button
    Then the next slide is displayed

    When the user clicks on the previous slide button
    Then the previous slide is displayed
    

