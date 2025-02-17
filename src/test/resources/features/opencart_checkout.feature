Feature: Flujo de compra en OpenCart

  Scenario: Completar una compra como invitado
    Given el usuario está en la página de inicio
    When agrega dos productos al carrito
    And visualiza el carrito
    And completa el "Guest Checkout"
    Then la compra debe finalizar con el mensaje "Your order has been placed!"
