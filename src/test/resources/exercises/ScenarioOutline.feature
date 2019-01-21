Feature: ScenarioOutline
  In order to avoid duplicate scenario and unreadable features
  As a Cucumber student
  I want to learn how to refactor common scenarios into a scenario outline

  Background: Create a Calculator and its initial state
    Given I have a calculator
    And the calculator shows 5 in its display

  Scenario: Addition
    When I add 5
    Then the calculator shows 10 in its display

  Scenario: Another addition
    When I add 1
    Then the calculator shows 6 in its display

  Scenario: Yet another addition
    When I add 14
    Then the calculator shows 19 in its display

  Scenario: Yet yet another addition
    When I add 12340
    Then the calculator shows 12345 in its display