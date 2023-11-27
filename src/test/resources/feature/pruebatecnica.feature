#Autor: Daniel Montes

Feature:  Prueba tecnica
  Como usuario de la pagina SANANGEL
  quiero quiero agregar 2 productos nuevos al carro de compras
  del primer producto dos, y del segundo producto cinco

  @Filtrar
  Scenario: Agregar 2 productos al carro de compras
    Given El usuario ingresa a la pagina SANANGEL
    When Realiza la seleccion de los productos
      | strcant1 | strcant2 |
      | 2        |5         |
    Then Se realiza la question de validacion