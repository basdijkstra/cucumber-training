Feature: Process loan requests
  As a ParaBank customer
  I want to be able to apply for a loan
  So I can temporarily increase my available funds

  Scenario: Loan application is successful
    Given John applies for a 1000 dollar loan
    And he puts in a down payment of 100 dollars
    When he submits the loan request
    Then he sees that his request is approved