package com.opencart.tests.steps;

import com.opencart.tests.pages.CheckoutPage;
import io.cucumber.java.en.*;

public class CheckoutSteps {

    CheckoutPage checkoutPage;

    @Given("el usuario está en la página de inicio")
    public void abrirPaginaInicio() {
        checkoutPage.open();
    }

    @When("agrega dos productos al carrito")
    public void agregarProductos() {
        checkoutPage.agregarProductosAlCarrito();
    }

    @And("visualiza el carrito")
    public void verCarrito() {
        checkoutPage.visualizarCarrito();
    }

    @And("completa el \\\"Guest Checkout\\\"")
    public void completarCheckout() {
        checkoutPage.completarCheckoutComoInvitado();
    }

    @Then("la compra debe finalizar con el mensaje {string}")
    public void verificarMensaje(String mensaje) {
        assert checkoutPage.getDriver().getPageSource().contains(mensaje);
    }
}
