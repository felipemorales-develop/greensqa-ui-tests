package net.greensqa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

import static net.greensqa.userinterface.FormularioBusquedaPage.CAMPO_FECHA_IDA;
import static net.greensqa.userinterface.FormularioBusquedaPage.CAMPO_FECHA_VUELTA;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarFechas implements Task {

    private final String fechaIda;
    private final String fechaVuelta;

    public SeleccionarFechas(String fechaIda, String fechaVuelta) {
        this.fechaIda = fechaIda;
        this.fechaVuelta = fechaVuelta;
    }

    public static SeleccionarFechas con(String fechaIda, String fechaVuelta) {
        return instrumented(SeleccionarFechas.class, fechaIda, fechaVuelta);
    }


    @Step("{0} selecciona la fecha de ida '#fechaIda' y de vuelta '#fechaVuelta'")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CAMPO_FECHA_IDA),
                Enter.theValue(fechaIda).into(CAMPO_FECHA_IDA),
                Click.on(CAMPO_FECHA_VUELTA),
                Enter.theValue(fechaVuelta).into(CAMPO_FECHA_VUELTA)
        );
    }
}
