package starter.matchers;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class FormBuscarProducto {
    public static Performable buscarProducto(String producto) {
        return Task.where("{0} attempts to search for #product",
                Clear.field(TagsBuscarProducto.SEARCH_ELEMENT),
                Enter.theValue(producto).into(TagsBuscarProducto.SEARCH_ELEMENT),
                Click.on(TagsBuscarProducto.SEARCH_BUTTON)
        ).with("product").of(producto);
    }

    public static Performable agregarProducto(){
        return Task.where("{0} add product",
                Click.on(TagsAgregarVerCarrito.ADD_CART)
        );
    }

}
