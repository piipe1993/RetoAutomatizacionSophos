package pe.com.tottus.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import pe.com.tottus.userinterfaces.TottusHomePage;

/**
 * Clase recibe el nombre del producto en el carrito para ser validado en el stepDefinition contra el valor del Feature
 * @author Andres Cardona
 */

public class ValidateProductSearchedOnCart implements Question <String> {


    @Override
    public String answeredBy(Actor actor) {
        String productText = (Text.of(TottusHomePage.LABEL_NAME_CART).viewedBy(actor).asString());
        System.out.println(productText);
        return productText;
    }

    public static ValidateProductSearchedOnCart isvisible(){
        return new ValidateProductSearchedOnCart();
    }
}
