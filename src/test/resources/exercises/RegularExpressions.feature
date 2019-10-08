Feature: Regular expressions
  In order to create even smarter step definitions
  As a Cucumber student
  I want to learn how to do intelligent matching using regular expressions

  Scenario: Apples in the basket
    Given I have an empty basket
    When I put 3 apples in my basket
    And I put 4 apples in my basket
    Then I have 7 apples in my basket

  Scenario: Fruit bowl
    Given I have an empty fruit bowl
    When I throw in an apple
    And I throw in a banana
    And I throw in a pear
    Then I have a filled fruit bowl

  Scenario: Flag collecting
    Given I am a collector of flags
    When I create a collection of flags from the Benelux countries
    Then I should add a flag from The Netherlands
    And I should add a flag from Belgium
    And I should add a flag from Luxembourg