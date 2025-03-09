package examples;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import models.User;

import static io.restassured.RestAssured.given;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class LoginUserApiStepDefinitions {

    private RequestSpecification requestSpecification;

    private User user;
    private int customerId;

    @Before("@api")
    public void createRequestSpec() {

        this.requestSpecification = new RequestSpecBuilder()
                .setBaseUri("https://parabank.parasoft.com")
                .setBasePath("/parabank/services/bank/")
                .addHeader("Accept", "application/json")
                .build();
    }

//    @Given("John is a registered ParaBank user")
//    public void john_is_a_registered_para_bank_user() {
//
//        this.user = new User("john", "demo");
//    }
//
//    @When("they log in using their credentials")
//    public void they_log_in_using_their_credentials() {
//
//        this.customerId = given()
//                .spec(requestSpecification)
//                .pathParam("username", this.user.getUsername())
//                .pathParam("password", this.user.getPassword())
//                .when()
//                .get("/login/{username}/{password}")
//                .then()
//                .statusCode(200)
//                .extract()
//                .body().jsonPath().getInt("id");
//    }
//
//    @Then("they can access restricted areas of ParaBank")
//    public void they_can_access_restricted_areas_of_para_bank() {
//
//        assertThat(this.customerId).isEqualTo(12212);
//    }
}
