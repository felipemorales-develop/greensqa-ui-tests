package net.greensqa.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormularioBusquedaPage {

    public static final Target CAMPO_ORIGEN = Target.the("campo de origen")
            .located(By.id("fsb-origin--text-field"));

    public static final Target CAMPO_DESTINO = Target.the("campo de destino")
            .located(By.id("fsb-destination--text-field"));

    public static final Target CAMPO_FECHA_IDA = Target.the("campo de fecha de ida")
            .located(By.id("fsb-departure--text-field"));

    public static final Target CAMPO_FECHA_VUELTA = Target.the("campo de fecha de vuelta")
            .located(By.id("fsb-return--text-field"));

    public static final Target BOTON_BUSCAR_VUELOS = Target.the("botón de buscar vuelos")
            .located(By.id("fsb-search-flights"));

    public static final Target TITULO_RESULTADOS = Target.the("título de resultados de vuelos")
            .located(By.id("titleSelectFlightDesktop"));


}

