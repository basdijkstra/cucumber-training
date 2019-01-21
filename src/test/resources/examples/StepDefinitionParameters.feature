Feature: Parameterizing step definitions
  As a Cucumber student
  I want to learn how to use parameters in step definitions
  So I can prevent step definition explosion

  Scenario: Color mixing
    Given I have a bucket of red paint
    And I have a bucket of white paint
    When I mix them together
    Then I have a bucket of pink paint
