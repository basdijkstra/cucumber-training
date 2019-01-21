Feature: BackgroundExtraction
  In order to avoid duplicate setup steps and unreadable scenarios
  As a Cucumber student
  I want to learn how to extract common setup steps into a Background

  Background: I have a calculator that displays 5
    Given I have a calculator
    And the calculator shows 5 in its display

  Scenario: Addition
    When I add 5
    Then the calculator shows 10 in its display

  Scenario: Multiplication
    When I multiply with 3
    Then the calculator shows 15 in its display

  Scenario: Subtraction
    When I subtract 2
    Then the calculator shows 3 in its display
