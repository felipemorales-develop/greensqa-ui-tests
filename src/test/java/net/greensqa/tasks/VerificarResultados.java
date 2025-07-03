package net.greensqa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.greensqa.userinterface.FormularioBusquedaPage.TITULO_RESULTADOS;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class VerificarResultados implements Task {

    public static VerificarResultados visibles() {
        return instrumented(VerificarResultados.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(TITULO_RESULTADOS, isVisible()).forNoMoreThan(20).seconds()
        );
    }
}
