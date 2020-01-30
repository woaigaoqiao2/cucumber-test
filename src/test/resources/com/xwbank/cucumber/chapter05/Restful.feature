@restful
Feature:test the restful api
  Background: give the url and port
    Given use the url "http://t.weather.sojson.com"

  Scenario: routes get testing
    When get "/api/weather/city/101030100"
    Then the result of status is 200
    And  the result of message is "success感谢又拍云(upyun.com)提供CDN赞助"