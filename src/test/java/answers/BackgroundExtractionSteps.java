package answers;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BackgroundExtractionSteps {

    @Given("^I have a calculator$")
    public void i_have_a_calculator() {
    }

    @Given("^the calculator shows (\\d+) in its display")
    public void the_calculator_shows_in_its_display(int displayedNumber) {
    }

    @When("^I add (\\d+)$")
    public void i_add(int numberToAdd) {
    }

    @When("^I multiply with (\\d+)$")
    public void i_multiply_with(int numberToMultiplyWith) {
    }

    @When("^I subtract (\\d+)$")
    public void i_subtract(int numberToSubtract) {
    }
}
