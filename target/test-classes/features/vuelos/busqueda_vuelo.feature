Feature: Búsqueda de vuelos en Latam

  Scenario: Usuario busca vuelo ida y vuelta nacional
    Given el usuario abre la página de LATAM
    When selecciona origen "Bogotá"
    And selecciona destino "Medellín"
    And selecciona tipo de viaje "ida y vuelta"
    And elige fechas válidas de salida y regreso
    And presiona el botón de buscar vuelos
    Then el sistema muestra los resultados disponibles
