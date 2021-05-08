package com.certificacion.backend.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features ="src/test/resources/features/crear_usuario.feature",
    glue="com.certificacion.backend.stepdefinitions",
        snippets = SnippetType.CAMELCASE, tags="")
public class CrearUsuario {

}
