package exercises;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitionParametersSteps {

    @Given("^I have a bucket of red paint$")
    public void i_have_a_bucket_of_red_paint() throws Throwable {
    }

    @Given("^I have a bucket of white paint$")
    public void i_have_a_bucket_of_white_paint() throws Throwable {
    }

    @When("^I mix them together$")
    public void i_mix_them_together() throws Throwable {
    }

    @Then("^the result is a bucket of pink paint$")
    public void the_result_is_a_bucket_of_pink_paint() throws Throwable {
    }
}
