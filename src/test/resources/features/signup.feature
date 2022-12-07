Feature: Jugador ingresa al backoffice
  Scenario: Jugador quiere ingresar al Backoffice de mobilots
    Given Raquel quiere ingresar al backoffice
    When  ella envia la informacion requerida para ingresar
    Then  ella debe poder ver la pantalla principal