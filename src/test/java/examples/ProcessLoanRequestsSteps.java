package examples;

import cucumber.api.java.en.*;

public class ProcessLoanRequestsSteps {

    @Given("John applies for a {int} dollar loan")
    public void john_applies_for_a_dollar_loan(int loanAmount) {
    }

    @Given("he puts in a down payment of {int} dollars")
    public void he_puts_in_a_down_payment_of_dollars(int downPaymentAmount) {
    }

    @When("he submits the loan request")
    public void he_submits_the_loan_request() {
    }

    @Then("he sees that his request is approved")
    public void he_sees_that_his_request_is_approved() {
    }
}
