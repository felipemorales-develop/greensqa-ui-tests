# 🌐 GSQA - Automatización de pruebas de búsqueda de vuelos en LATAM

Este proyecto implementa la automatización de pruebas de interfaz de usuario para la funcionalidad de búsqueda de vuelos en la página de LATAM, utilizando **Serenity BDD**, **Cucumber**, **Screenplay Pattern** y **Java 17**.

---

## ✅ Requisitos

- Java 17
- Maven 3.6+
- IntelliJ IDEA (recomendado)
- Chrome instalado
- Repositorio clonado localmente

---

## 🚀 Estructura del proyecto

latam-ui-tests/
│
├── src/
│ ├── main/
│ └── test/
│ ├── java/
│ │ └── net.greensqa/
│ │ ├── runners/
│ │ ├── stepdefinitions/
│ │ ├── tasks/
│ │ ├── userinterface/
│ │ └── hooks/
│ └── resources/
│ └── features/
│ └── vuelos/
│ └── busqueda_vuelo.feature
├── pom.xml

---

## 🧪 Escenario automatizado

```gherkin
Feature: Búsqueda de vuelos en Latam

  Scenario: Usuario busca vuelo ida y vuelta nacional
    Given el usuario abre la página de LATAM
    When selecciona origen "Bogotá"
    And selecciona destino "Medellín"
    And selecciona tipo de viaje "ida y vuelta"
    And elige fechas válidas de salida y regreso
    And presiona el botón de buscar vuelos
    Then el sistema muestra los resultados disponibles

Ejecución
Clona el repositorio:
git clone https://github.com/tu_usuario/greensqa-ui-tests.git
cd greensqa-ui-tests

Ejecuta las pruebas:
mvn clean verify

Abre el reporte en:
target/site/serenity/index.html

Tecnologías utilizadas
Java 17
Maven
Serenity BDD
Cucumber 6
Screenplay Pattern
JUnit 4

Notas
Asegúrate de tener conexión a internet para acceder al sitio de LATAM.
Los datos como fechas, origen y destino pueden ajustarse según la disponibilidad del sitio.


🤝 Autor
Felipe Morales
