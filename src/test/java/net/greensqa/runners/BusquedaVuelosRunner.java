package net.greensqa.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/vuelos/busqueda_vuelo.feature",
        glue = {"net.greensqa.stepdefinitions", "net.greensqa.hooks"},
        plugin = {"pretty"}
)
public class BusquedaVuelosRunner {}
