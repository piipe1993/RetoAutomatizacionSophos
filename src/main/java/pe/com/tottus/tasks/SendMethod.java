package pe.com.tottus.tasks;


import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Get;
import pe.com.tottus.models.DataRequest;

import javax.xml.crypto.Data;

import static net.serenitybdd.rest.SerenityRest.lastResponse;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SendMethod implements Task {
String token;
public SendMethod (String token){
    this.token=token;
}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Get.resource("/users?access-token="+token));


    }


    public static SendMethod toService (String token) {
        return instrumented(SendMethod.class,token);
    }

}
