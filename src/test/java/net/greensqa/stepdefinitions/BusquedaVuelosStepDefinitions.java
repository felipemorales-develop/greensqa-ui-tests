package net.greensqa.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;


public class BusquedaVuelosStepDefinitions {

    @Dado("el usuario abre la página de LATAM")
    public void abrirPaginaLatam() {}

    @Cuando("selecciona origen {string}")
    public void seleccionarOrigen(String origen) {
        theActorInTheSpotlight().attemptsTo(
                net.greensqa.tasks.SeleccionarOrigen.conTexto(origen)
        );
    }

    @Cuando("selecciona destino {string}")
    public void seleccionarDestino(String destino) {
        theActorInTheSpotlight().attemptsTo(
                net.greensqa.tasks.SeleccionarDestino.conTexto(destino)
        );
    }


    @Cuando("selecciona tipo de viaje {string}")
    public void seleccionarTipo(String tipo) {}

    @Cuando("elige fechas válidas de salida y regreso")
    public void elegirFechas() {
        theActorInTheSpotlight().attemptsTo(
                net.greensqa.tasks.SeleccionarFechas.con("15/07/2025", "20/07/2025")
        );
    }

    @Cuando("presiona el botón de buscar vuelos")
    public void presionarBoton() {
        // Guardar la ventana principal
        String ventanaPrincipal = net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver().getWindowHandle();
        theActorInTheSpotlight().remember("ventana_principal", ventanaPrincipal);

        // Presionar el botón
        theActorInTheSpotlight().attemptsTo(
                net.greensqa.tasks.PresionarBotonBuscar.ahora()
        );
    }

    @Entonces("el sistema muestra los resultados disponibles")
    public void verificarResultados() {
        theActorInTheSpotlight().attemptsTo(
                net.greensqa.interactions.CambiarAVentanaNueva.ahora(),
                net.greensqa.tasks.VerificarResultados.visibles()
        );
    }

}

