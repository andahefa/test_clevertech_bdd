Feature: prueba

  Background: validar inicio de sesion

    Given the user navigates to the website

    Scenario: 1 - Validar con credenciales correctas
      When ingresa usuario "test" y contrasena "secreto"
      Then la aplicacion deberia mostrar el modulo principal del producto
