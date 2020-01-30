Feature: multiple scenario with out background

  Scenario: And
    Given x and y value
    And and operation
    When invoke calculate button
    Then the result is x+y

  Scenario: Sub
    Given x and y value
    And sub operation
    When invoke calculate button
    Then the result is x-y