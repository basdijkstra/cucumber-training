package answers;

import cucumber.api.java.en.*;

public class RegularExpressionsSteps {

    @Given("^I have an empty basket$")
    public void i_have_an_empty_basket() {
    }

    @When("^I put (\\d+) apples in my basket$")
    public void i_put_apples_in_my_basket(int numberOfApples) {
    }

    @Then("^I have (\\d+) apples in my basket$")
    public void i_have_apples_in_my_basket(int numberOfApples) {
    }

    @Given("^I am a collector of flags$")
    public void i_am_a_collector_of_flags() {
    }

    @When("^I create a collection of flags from the Benelux countries$")
    public void i_create_a_collection_of_flags_from_the_Benelux_countries() {
    }

    @Then("^I should add a flag from (The Netherlands|Belgium|Luxembourg)$")
    public void i_should_add_a_flag_from(String countryName) {
    }

    @Given("^I have an empty fruit bowl$")
    public void i_have_an_empty_fruit_bowl() {
    }

    @When("^I throw in an? (.*)$")
    public void i_throw_in_a(String typeOfFruit) {
    }

    @Then("^I have a filled fruit bowl$")
    public void i_have_a_filled_fruit_bowl() {
    }
}
