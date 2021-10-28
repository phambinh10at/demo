Feature: demo

  Scenario:demo
    Given Open web page
    When Select the "Good" radio button option.
    And Click the "Next" Button
    Then Assert text "Have a nice day." exists