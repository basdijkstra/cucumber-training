Feature: Loan requests processing - scenario outline
  As a ParaBank customer
  I want to be able to apply for a loan
  So I can temporarily increase my available funds

  Scenario: Loan application is successful
    Given John applies for a 1000 dollar loan
    And he puts in a down payment of 250 dollars
    And he uses an account with a balance of 2000 dollars for the down payment
    When he submits the loan request
    Then he sees that his request is approved

  Scenario: Loan application is successful again
    Given John applies for a 5000 dollar loan
    And he puts in a down payment of 1250 dollars
    And he uses an account with a balance of 10000 dollars for the down payment
    When he submits the loan request
    Then he sees that his request is approved

  Scenario: Loan application is successful yet again
    Given John applies for a 100 dollar loan
    And he puts in a down payment of 10 dollars
    And he uses an account with a balance of 200 dollars for the down payment
    When he submits the loan request
    Then he sees that his request is approved