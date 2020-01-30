Feature: Data table Transformation

  Scenario: transform to raw data
    Given the user open the login site
    When  lets validate the following user account and email raw data
    |user|email|
    |Allen|3323@qq.com|
    |alex|1234562@qq.com|


  Scenario: transform to user-defined
    Given the user open the login site
    When  lets validate the following user account and email user-defined
      |user|email|
      |Allen|3323@qq.com|
      |alex|1234562@qq.com|


  Scenario: transform to list-map
    Given the user open the login site
    When  lets validate the following user account and email list-map
      |user|email|
      |Allen|3323@qq.com|
      |alex|1234562@qq.com|

  Scenario: transform to list-list
    Given the user open the login site
    When  lets validate the following user account and email list-list
      |user|email|
      |Allen|3323@qq.com|
      |alex|1234562@qq.com|