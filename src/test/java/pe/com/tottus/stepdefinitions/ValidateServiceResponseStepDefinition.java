package pe.com.tottus.stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.thucydides.core.util.EnvironmentVariables;
import org.junit.Before;

import java.util.Optional;

public class ValidateServiceResponseStepDefinition {

    private Response response;
    private Actor Andres = Actor.named("Andres");


    @When("^configure the request to the service with endpoint (.*) and token (.*)$")
    public void configure_the_request_to_the_service_with_endpoint_and_token(String endpoint, String token) throws Throwable {

        response =  RestAssured.get(endpoint+token);
    }

    @Then("^validate that the code (.*) and message (.*) are correct$")
    public void validate_that_the_code_and_message_are_correct(String code, String message) throws Throwable {

    }


}
