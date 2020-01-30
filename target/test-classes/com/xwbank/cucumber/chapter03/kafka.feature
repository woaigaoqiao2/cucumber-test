@kafka
Feature: testing the kafka
  Scenario:send the data to kafka
    Given use the below doc strings
    """
        record value
    """
    When  invoke add kafka producer send method
    And  sleep 1 minute
    Then wen can consume the data at topic xxx
    Then wen can consume the data at topic xxx111
