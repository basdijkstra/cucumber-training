package examples;

import cucumber.api.java.en.*;

public class StepDefinitionParametersSteps {

    @Given("^I have a bucket of (.*) paint$")
    public void i_have_a_bucket_of_paint(String colour) throws Throwable {
    }

    @When("^I mix them together$")
    public void i_mix_them_together() throws Throwable {
    }

    @Then("^I have a bucket of pink paint$")
    public void i_have_a_bucket_of_pink_paint() throws Throwable {
    }
}
