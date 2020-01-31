package pe.com.tottus.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import pe.com.tottus.tasks.ConsumeService;
import pe.com.tottus.userinterfaces.TottusHomePage;

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
