Feature: with scenario outline

  Background: open the login page
    Given open the login page testing scenarios outline

  Scenario Outline:username or password is wrong
    When  use "<UserName>" with password "<Password>" testing scenarios outline
    Then the user or password is invalid
    Examples:
      | UserName | Password |
      |chenjiapei|123456|
      |alex|654321|

  Scenario:
    When use "alex" with password "123456" testing scenarios outline
    Then the username and password is right