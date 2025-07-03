package net.greensqa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

import static net.greensqa.userinterface.FormularioBusquedaPage.CAMPO_DESTINO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarDestino implements Task {

    private final String destino;

    public SeleccionarDestino(String destino) {
        this.destino = destino;
    }

    public static SeleccionarDestino conTexto(String destino) {
        return instrumented(SeleccionarDestino.class, destino);
    }

    @Step("{0} selecciona destino '#destino'")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(destino).into(CAMPO_DESTINO)
        );
    }
}
