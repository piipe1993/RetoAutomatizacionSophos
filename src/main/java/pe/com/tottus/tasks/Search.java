package pe.com.tottus.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import pe.com.tottus.userinterfaces.TottusHomePage;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

/**
 * Clase que digita el producto deseado y lo busca.
 *
 * @author Andres Cardona
 */
public class Search implements Task {
    private String product;

    public Search(String product) {
        this.product = product;
    }


    @Override
    @Step
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(TottusHomePage.CANCEL_POPUP, isPresent()),
                Click.on(TottusHomePage.CANCEL_POPUP),
                WaitUntil.the(TottusHomePage.INPUT_SEARCH, isPresent()),
                Enter.theValue(product).into(TottusHomePage.INPUT_SEARCH),
                Click.on(TottusHomePage.BUTTON_SEARCH)
        );
    }

    public static Search theProduct (String product){
        return instrumented(Search.class, product);
    }
}

