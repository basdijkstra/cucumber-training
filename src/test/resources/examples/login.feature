@userinterface
Feature: Logging in to ParaBank
  I just want to log in...

  Scenario: Registered users can log in successfully
    Given John is a registered ParaBank user
    When they log in using their credentials
    Then they can access restricted areas of ParaBank