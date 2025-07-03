package net.greensqa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

import static net.greensqa.userinterface.FormularioBusquedaPage.CAMPO_ORIGEN;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarOrigen implements Task {

    private final String origen;

    public SeleccionarOrigen(String origen) {
        this.origen = origen;
    }

    public static SeleccionarOrigen conTexto(String origen) {
        return instrumented(SeleccionarOrigen.class, origen);
    }

    @Step("{0} selecciona origen '#origen'")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(origen).into(CAMPO_ORIGEN)
        );
    }
}
