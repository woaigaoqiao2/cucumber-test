Feature: test multiple with And But

  Scenario: simple scenario with and but
    multiple pre-conditions
    multiple user action
    multiple expected output

    Given alex user open the url or git
    And   alex user open the url o jenkins
    When  alex click build job link
    Then  alex the job will started
    When  alex click the job or link
    And   alex choice the job console
    And   alex goto the console page
    Then  alex the job building log will be print
    And   alex the last job can see  successfully state
    But   alex the job will not running at current