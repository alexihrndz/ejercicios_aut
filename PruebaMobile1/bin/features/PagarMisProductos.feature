Feature: Realizar pago de mis productos
  Quiero ingresar a la app Davivienda Colimbia y realizar un pago de mis productos

  Scenario: Pagar mi TDC  
    Given el cliente selecciona del menu la opcion Pagar mis Productos
    When ingresa a la pantalla de preparacion, selecciona el producto origen, producto destino 
    And ingresa en el campo monto, se realiza el pago con exito
    Then verifico que el pago sea exitoso

