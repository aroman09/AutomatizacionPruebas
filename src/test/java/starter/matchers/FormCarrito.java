package starter.matchers;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class FormCarrito {

    public static Performable botonVerCarrito(){
        return Task.where("{0} Click en shopping cart",
                Click.on(TagsAgregarVerCarrito.VIEW_CART)
        );
    }

    public static Performable botonCheckout() {
        return Task.where("{0} Click en boton checkout",
                Click.on(TagsFormularioCheckout.CHECKOUT)
        );
    }

    public static Performable guestCheckout() {
        return Task.where("{0} Seleccionar guest checkout",
                Click.on(TagsFormularioCheckout.GUEST),
                Click.on(TagsFormularioCheckout.CONTINUE_GUEST)
        );
    }


    public static Performable completarForm(String firstname, String lastname, String email, String telephone,
                                           String address, String city, String postcode, String country, String zone) {
        return Task.where("{0} completar campos formulario",
                        Enter.theValue(firstname).into(TagsFormularioCheckout.FIRST_NAME),
                        Enter.theValue(lastname).into(TagsFormularioCheckout.LAST_NAME),
                        Enter.theValue(email).into(TagsFormularioCheckout.EMAIL),
                        Enter.theValue(telephone).into(TagsFormularioCheckout.TELEPHONE),
                        Enter.theValue(address).into(TagsFormularioCheckout.ADDRESS),
                        Enter.theValue(city).into(TagsFormularioCheckout.CITY),
                        Enter.theValue(postcode).into(TagsFormularioCheckout.POSTCODE),
                        Click.on(TagsFormularioCheckout.COUNTRY),
                        SelectFromOptions.byVisibleText(country).from(TagsFormularioCheckout.COUNTRY),
                        Click.on(TagsFormularioCheckout.ZONE),
                        SelectFromOptions.byVisibleText(zone).from(TagsFormularioCheckout.ZONE)
                       // Click.on(TagsFormularioCheckout.CONTINUE_FORM)
                )
                .with("firstname").of(firstname)
                .with("lastname").of(lastname)
                .with("email").of(email)
                .with("telephone").of(telephone)
                .with("address").of(address)
                .with("city").of(city)
                .with("postcode").of(postcode)
                .with("country").of(country)
                .with("zone").of(zone);
    }

    public static Performable botonContinueForm(){
        return Task.where("{0} Click en boton Continue formulario",
                Click.on(TagsFormularioCheckout.CONTINUE_FORM));
    }

    public static Performable botonContinueDelivery(){
        return Task.where("{0} Click en boton Continue shippinh",
                Click.on(TagsFormularioCheckout.CONTINUE_SHIPPING));
    }

    public static Performable termsAndConditions(){
        return Task.where("{0} Marcar Aceptar Terminos y Condiciones",
                Click.on(TagsFormularioCheckout.AGREE_TERMS));
    }

    public static Performable botonContinuePayment(){
        return Task.where("{0} Click en boton Continue",
                Click.on(TagsFormularioCheckout.CONTINUE_PAYMENT));
    }

    public static Performable confirmOrder(){
        return Task.where("{0} Click en boton Confirmar Compra",
                Click.on(TagsFormularioCheckout.CONFIRM_ORDER));
    }
}
