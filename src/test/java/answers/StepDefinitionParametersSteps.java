package answers;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitionParametersSteps {

    @Given("^I have a bucket of (.*) paint$")
    public void i_have_a_bucket_of_paint(String colour) throws Throwable {
    }

    @When("^I mix them together$")
    public void i_mix_them_together() throws Throwable {
    }

    @Then("^the result is a bucket of pink paint$")
    public void the_result_is_a_bucket_of_pink_paint() throws Throwable {
    }
}
