package pe.com.tottus.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import pe.com.tottus.userinterfaces.TottusHomePage;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

/**
 * Clase para abrir el minicart
 *
 * @author Andres Cardona
 */

public class GotoCart implements Task {

    @Override
    @Step
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(TottusHomePage.OPTION_SHOW_CART, isPresent()),
                Click.on(TottusHomePage.OPTION_SHOW_CART),
                WaitUntil.the(TottusHomePage.LABEL_NAME_CART, isPresent())
                );
    }

    public static GotoCart showCart (){
        return instrumented(GotoCart.class);
    }
}
