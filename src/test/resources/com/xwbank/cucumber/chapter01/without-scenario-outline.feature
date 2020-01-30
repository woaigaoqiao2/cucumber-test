Feature: without scenario outline

  Background: open the login page
    Given open the login page

  Scenario:username is wrong
    When  use "chenjiapei" with password "123456"
    Then the user login failed

  Scenario: password is wrong
    When use "alex" with password "434232"
    Then the user login failed

  Scenario:
    When use "alex" with password "123456"
    Then the user login success