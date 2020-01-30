Feature: Complex Data type
  Scenario: multiple then keyword
    Given the user account information
    Then we can found user "Alex" with password "123456",phone "1223" exists
    Then we can found user "Allen" with password "3323",phone "23" exists
    Then we can found user "Steve" with password "4342",phone "4342" exists


  Scenario: Use complex data type
    Given the user account information
    Then  we veriy following user exists
    |name|password|phone|
    |Allen|3323  |23 |
    |alex|123456  |1223 |
    |Steve|4342  |4342 |