Feature:arguments

  Scenario: arguments test
    Given the name is "alex" and age is 34
    When  format the input
    Then  the format string is "alex-34"