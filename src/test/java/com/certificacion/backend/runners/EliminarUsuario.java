package com.certificacion.backend.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features ="src/test/resources/features/eliminar_cliente.feature",
    glue="com.certificacion.backend.stepdefinitions",
        snippets = SnippetType.CAMELCASE, tags="")
public class EliminarUsuario {

}
