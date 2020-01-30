package pe.com.tottus.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import net.serenitybdd.screenplay.targets.Target;


/**
 * Clase encargada de obtener el mapeo de los elementos que usamos en la automatizacion
 * de la validación de producto agregado al carrito de la homepage del sitio
 * @author Andres Felipe cardona
 */

@DefaultUrl("https://www.tottus.com.pe/tottus/")

public class TottusHomePage extends PageObject {


    public static final Target INPUT_SEARCH = Target.the("Input search product")
            .located(By.id("atg_store_searchInput_top"));

    public static final Target BUTTON_SEARCH = Target.the("Button search product")
            .located(By.id("atg_store_searchSubmit_top"));

    public static final Target BUTTON_ADD = Target.the("Button Add product to cart")
            .located(By.id("atg_behavior_addItemToCart_42029465"));

    public static final Target OPTION_SHOW_CART = Target.the("Option show products added to cart")
            .located(By.id("atg_store_cart_total"));

    public static final Target LABEL_NAME_CART = Target.the("Capture product name in cart")
            .located(By.className("atg_store_richCartItemDescription"));

    public static final Target CANCEL_POPUP = Target.the("Button cancel popup")
            .located(By.id("onesignal-popover-cancel-button"));


   /* public static final Target LABEL_PRODUCT_NAME = Target.the("contenedor de Nombre del producto ")
            .located(By.className("info-wrapper"));*/


}
