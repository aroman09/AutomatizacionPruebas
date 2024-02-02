package starter.stepsDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import starter.matchers.FormBuscarProducto;
import starter.matchers.FormCarrito;
import starter.searchPage.NavegarPagina;

import static net.serenitybdd.screenplay.actors.OnStage.*;


public class ComprasStepDefinition {
    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^(.*) Navegar a la pagina principal")
    public void homeCart(String actor) {
        theActorCalled(actor).attemptsTo(NavegarPagina.OpenHomePage());
    }
    @When("Buscar el producto1 {string}")
    public void buscarProducto(String producto) {
        withCurrentActor(
                FormBuscarProducto.buscarProducto(producto)
        );
    }
    @And("Agregar al carrito")
    public void agregarProducto() {
        withCurrentActor(
                FormBuscarProducto.agregarProducto()
        );
    }

    @When("Buscar el producto2 {string}")
    public void buscarProducto2(String producto) {
        withCurrentActor(
                FormBuscarProducto.buscarProducto(producto)
        );
    }

    @And("Agregar al carrito")
    public void agregarProductoo2() {
        withCurrentActor(
                FormBuscarProducto.agregarProducto()
        );
    }

    @When("Click en shopping cart")
    public void botonCarrito(){
        withCurrentActor(
                FormCarrito.botonVerCarrito()
        );
    }
    @And("Verificar productos agregados")
    public void verificarProductos() throws InterruptedException {
        Target spanTotal = Target.the("total carrito").located(By.id("cart-total"));
        Thread.sleep(2000);
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(spanTotal).text().contains("2 item")
        );

    }

    @When("Click en boton checkout")
    public void botonCheckout(){
        withCurrentActor(
                FormCarrito.botonCheckout()
        );
    }

    /*Se realiza el seleccionar check y clic en boton en un solo proceso*/
    @And("Seleccionar guest checkout / clic continuar")
    public void selectGuest(){
        withCurrentActor(
                FormCarrito.guestCheckout()
        );
    }
    @When("Completar formulario {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void completeCheckoutForm(String firstname, String lastname, String email, String telephone, String address, String city, String postcode, String county, String zone){
        withCurrentActor(
                FormCarrito.completarForm(firstname, lastname, email, telephone, address, city, postcode, county, zone)
        );
    }

    @And("Click boton continue")
    public void clickContinue() {
        withCurrentActor(
                FormCarrito.botonContinueForm(),
                FormCarrito.botonContinueDelivery()
        );
    }

    @When("Marcar Aceptar Terminos y Condiciones")
    public void acceptTermsConditions() {
        withCurrentActor(
                FormCarrito.termsAndConditions()
        );
    }
    @And("Click en boton Continue")
    public void clickContinuePayment() {
        withCurrentActor(
                FormCarrito.botonContinuePayment()
        );
    }

    @When("Validar productos en la orden generada")
    public void validarProductos() throws InterruptedException {
        Target spanTotal = Target.the("total carrito").located(By.id("cart-total"));
        Thread.sleep(2000);
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(spanTotal).text().contains("2 item")
        );
    }

    @And("Click en boton Confirmar Compra")
    public void clickOnShop()  {
        theActorInTheSpotlight().attemptsTo(
                FormCarrito.confirmOrder()
        );
    }

    @Then("Validar mensaje {string}")
    public void validarMensaje(String message) throws InterruptedException {
        Target confirmOrder = Target.the("Mensaje").located(By.xpath("//div[@id='content']/h1"));
        Thread.sleep(2000);
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(confirmOrder).text().contains(message)
        );
    }
}
