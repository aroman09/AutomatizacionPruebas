Feature: Buscar un producto

  Scenario: Buscar por un tipo
    Given que se ingrese en la pagina "opencart"
    When se busque por "telefono"
    Then muestra todos los productos "telefonos"