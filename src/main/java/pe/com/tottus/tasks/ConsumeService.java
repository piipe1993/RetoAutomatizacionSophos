package pe.com.tottus.tasks;

import com.mashape.unirest.http.Unirest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.serenitybdd.screenplay.rest.interactions.Get;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;

public class ConsumeService  implements Task {

private String api, token;
public ConsumeService (String api, String token){
    this.api =api;
    this.token=token
}

    @Override
    public <T extends Actor> void performAs(T actor) {
     actor.whoCan(CallAnApi.at(api));
        actor.attemptsTo(Get.resource("/users?access-token="+token));

        actor.should(
                seeThatResponse( "User details should be correct",
                        response -> {
                            response.(200);
                        })

            );

    }


    public static ConsumeService api (String api, String token){
        return instrumented(ConsumeService.class,api,token);
    }
}
