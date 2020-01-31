package pe.com.tottus.tasks;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import pe.com.tottus.models.DataRequest;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.hamcrest.Matchers.equalTo;

public class ConsumeService implements Task {
    public static int statusCode;
    String endpoint, token;
    Response response;

    public ConsumeService(String endpoint, String token) {
        this.endpoint = endpoint;
        this.token = token;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        response = RestAssured.get(endpoint + token);
        statusCode = response.getStatusCode();
        System.out.println(statusCode);
        //response.then().body("_meta.message",equalTo(4));

      /*  DataRequest message = response.as(DataRequest.class);
        message.getMessage();
        System.out.println(message.getMessage());
        */
    }

    public static ConsumeService get(String endpoint, String token) {
        return instrumented(ConsumeService.class, endpoint, token);
    }
}
