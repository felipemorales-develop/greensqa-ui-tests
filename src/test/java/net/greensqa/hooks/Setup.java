package net.greensqa.hooks;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class Setup {

    @Before
    public void configurarEscenario() {
        OnStage.setTheStage(new OnlineCast());
    }


}
