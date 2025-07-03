package net.greensqa.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import java.util.Set;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CambiarAVentanaNueva implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        String ventanaPrincipal = theActorInTheSpotlight().recall("ventana_principal");

        Set<String> ventanas = net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver().getWindowHandles();

        for (String ventana : ventanas) {
            if (!ventana.equals(ventanaPrincipal)) {
                net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver().switchTo().window(ventana);
                break;
            }
        }
    }

    public static CambiarAVentanaNueva ahora() {
        return instrumented(CambiarAVentanaNueva.class);
    }
}
