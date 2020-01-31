package pe.com.tottus.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import pe.com.tottus.tasks.ConsumeService;

/**
 * Clase recibe el StatusCode del response del servicio para ser validado en el stepDefinition contra el valor del Feature
 * @author Andres Cardona
 */

public class ValidateDataService implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        int codigo = ConsumeService.statusCode;
        return String.valueOf(codigo);
    }
    public static ValidateDataService request(){
        return new ValidateDataService();
    }
}
