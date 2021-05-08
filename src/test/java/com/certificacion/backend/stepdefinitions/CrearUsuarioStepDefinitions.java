package com.certificacion.backend.stepdefinitions;

import com.certificacion.backend.questions.CodigoRespuesta;
import com.certificacion.backend.questions.ElCampo;
import com.certificacion.backend.questions.ElCorreo;
import com.certificacion.backend.tasks.Consumir;
import com.certificacion.backend.tasks.post.Crear;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import org.hamcrest.Matchers;

import java.util.List;
import java.util.Map;

public class CrearUsuarioStepDefinitions {

    @Cuando("realiza la peticion al servicio {string} con los datos")
    public void realizaLaPeticionAlServicioConLosDatos(String servicio, List<Map<String, String>>datos) {
        OnStage.theActorInTheSpotlight().attemptsTo(Crear.usuario(servicio,datos.get(0)));

    }

    @Entonces("valida los datos {string} {string}")
    public void validaLosDatos(String campo, String valor) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ElCampo.es(campo),Matchers.equalTo(valor)));
    }
}
