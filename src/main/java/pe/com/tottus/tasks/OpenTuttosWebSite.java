package pe.com.tottus.tasks;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

/**
 * Clase encargada de abrir el navegador e ingresar a la pagina web de Tuttos
 *
 * @author Andres
 */

public class OpenTuttosWebSite implements Task {

    private PageObject pageobject;

    public OpenTuttosWebSite(PageObject pageobject){
        this.pageobject = pageobject;
    }

    @Override
    @Step
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(pageobject));
    }

    public static OpenTuttosWebSite At (PageObject pageobject) {
        return instrumented(OpenTuttosWebSite.class, pageobject);
    }
}
