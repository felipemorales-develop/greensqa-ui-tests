package net.greensqa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import static net.greensqa.userinterface.FormularioBusquedaPage.BOTON_BUSCAR_VUELOS;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class PresionarBotonBuscar implements Task {

    public static PresionarBotonBuscar ahora() {
        return instrumented(PresionarBotonBuscar.class);
    }

    @Step("{0} presiona el botón de buscar vuelos")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_BUSCAR_VUELOS)
        );
    }
}
