Feature: ScenarioOutline
  In order to avoid duplicate scenario and unreadable features
  As a Cucumber student
  I want to learn how to refactor common scenarios into a scenario outline

  Background: Create a Calculator and its initial state
    Given I have a calculator
    And the calculator shows 5 in its display

  Scenario Outline: Addition
    When I add <ValueToAdd>
    Then the calculator shows <NewTotal> in its display
    Examples:
      | ValueToAdd | NewTotal |
      | 5          | 10       |
      | 1          | 6        |
      | 14         | 19       |
      | 12340      | 12345    |