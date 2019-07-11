@smoke
Feature: Smoke tests

  Scenario Outline: checks the all menu title
    Given user on the main page
    Then title of the page should be "<tabTitle>"
    Examples:
      | tabTitle                      |
      | Retail Title    |
      | ERP Solutions Title    |


    #  Scenario: wrong password

#  Scenario: wrong username
