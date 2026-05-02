Feature: Compra de electronicos en OpenCart


  @Demo
  Scenario: Registro, login y compra de electronicos
    Given que el usuario abre la pagina
    When se registra con un usuario nuevo
    And inicia sesion con el usuario creado
    And navega a la seccion tablets
    And agrega un producto al carrito 5 veces
    Then el producto se agrega correctamente al carrito