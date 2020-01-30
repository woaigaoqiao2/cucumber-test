Feature: Data table Compare

  Scenario: Data table Compare
    Given open the db connection pool
    When  insert the batch of data
      |user|password|
      |Allen|123456|
      |Jack|123456|
      |Yuki|123456|
    Then validation the data is inserted
      |user|password|
      |Allen|123456|
      |Jack|123456|
      |Yuki|123456|
    When Delete the user Allen
    Then validation the data after deleted
      |user|password|
      |Jack|123456|
      |Yuki|123456|

