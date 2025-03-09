package examples;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class IsItFridayYetStepDefinitions {

    @Given("today is Sunday")
    public void today_is_sunday() {
    }

    @When("I ask whether it's Friday yet")
    public void i_ask_whether_it_s_friday_yet() {
    }

    @Then("I should be told {word}")
    public void i_should_be_told_cucumber_expression(String string) {
    }

//    @Then("^I should be told (.+)$")
//    public void i_should_be_told_regular_expression(String string) {
//    }
}
