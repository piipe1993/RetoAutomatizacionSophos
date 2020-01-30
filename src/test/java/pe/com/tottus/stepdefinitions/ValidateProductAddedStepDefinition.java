package pe.com.tottus.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import pe.com.tottus.questions.ValidateProductSearchedOnCart;
import pe.com.tottus.tasks.AddProduct;
import pe.com.tottus.tasks.GotoCart;
import pe.com.tottus.tasks.OpenTuttosWebSite;
import pe.com.tottus.tasks.Search;
import pe.com.tottus.userinterfaces.TottusHomePage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.equalTo;

/**
 * Clase que contiene los snippets con sus funciones referenciados desde el feature
 *
 * @author Andres Felipe cardona
 */

public class ValidateProductAddedStepDefinition {

    @Managed(driver = "chrome")
    private WebDriver webDriver;

    private Actor Andres = Actor.named("Andres");
    private TottusHomePage tottusHomePage;

    @Before
    public void setup() {
        Andres.can(BrowseTheWeb.with(webDriver));
    }

    @Given("^That user enters in website$")
    public void that_user_enters_in_website() {
        Andres.attemptsTo(OpenTuttosWebSite.At(tottusHomePage));
    }

    @When("^He searches the product(.*)$")
    public void he_searches_the_product(String product)  {
  Andres.attemptsTo(Search.theProduct(product));
    }

    @And("^Adds the product to the shopping cart$")
    public void adds_the_product_to_the_shopping_cart() {
        Andres.attemptsTo(AddProduct.toCart());
    }

    @And("^Click on the option show cart$")
    public void click_on_the_option_show_cart() {
        Andres.attemptsTo(GotoCart.showCart());
    }

    @Then("^the user validates that the product (.*) is added and displayed correctly in the shopping cart$")
    public void the_user_validates_that_the_product_is_added_and_displayed_correctly_in_the_shopping_cart(String product) {
        Andres.should(seeThat(ValidateProductSearchedOnCart.isvisible(), equalTo(product)));
    }

}
