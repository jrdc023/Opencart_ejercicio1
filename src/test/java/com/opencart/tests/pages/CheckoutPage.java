package com.opencart.tests.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

public class CheckoutPage extends PageObject {

    public void agregarProductosAlCarrito() {
        List<WebElement> productos = getDriver().findElements(By.cssSelector(".product-layout .button-group button"));
        productos.get(0).click();
        productos.get(1).click();
    }

    public void visualizarCarrito() {
        find(By.id("cart")).click();
        find(By.linkText("View Cart")).click();
    }

    public void completarCheckoutComoInvitado() {
        find(By.linkText("Checkout")).click();
        find(By.cssSelector("[value='guest']")).click();
        find(By.id("button-account")).click();
    }
}
