package pe.com.tottus.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

/**
 * Clase encargada de correr el test del feature especifico
 *
 * @author Andres Felipe Cardona
 */

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/ValidateServiceResponse.feature",
        glue = "pe.com.tottus.stepdefinitions",
        tags = " @Case1_ServiceResponse",
        snippets = SnippetType.CAMELCASE
)

public class ValidateServiceResponseRunner {
}
