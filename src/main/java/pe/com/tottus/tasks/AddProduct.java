package pe.com.tottus.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.ScrollTo;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import pe.com.tottus.userinterfaces.TottusHomePage;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

/**
 * Clase que espera que este visible el prodcuto deseado y lo agrega al carrito
 *
 * @author Andres Cardona
 */

public class AddProduct implements Task {


    @Override
    @Step
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(TottusHomePage.BUTTON_ADD, isPresent()),
                Click.on(TottusHomePage.BUTTON_ADD)
               // Scroll.to(TottusHomePage.OPTION_SHOW_CART).andAlignToTop(),
                //WaitUntil.the(TottusHomePage.OPTION_SHOW_CART,isPresent()).forNoMoreThan(10).seconds()
        );
    }

    public static AddProduct toCart (){
        return instrumented(AddProduct.class);
    }
}
