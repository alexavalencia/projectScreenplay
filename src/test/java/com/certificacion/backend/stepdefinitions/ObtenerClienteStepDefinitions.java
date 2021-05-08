package com.certificacion.backend.stepdefinitions;

import com.certificacion.backend.questions.CodigoRespuesta;
import com.certificacion.backend.questions.ElCorreo;
import com.certificacion.backend.tasks.Consumir;
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

public class ObtenerClienteStepDefinitions {

    String baseUrl = "https://reqres.in";

    @Before
    public void configurarElEscenario( ) {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("que {string} se conecta al servicio")
    public void queSeConectaAlServicio(String actor) {
        OnStage.theActorCalled(actor).whoCan(CallAnApi.at(baseUrl));
    }

    @Cuando("realiza la peticion al servicio {string}")
    public void realizaLaPeticionAlServicioConsultarUsuario(String servicio) {
        OnStage.theActorInTheSpotlight().attemptsTo(Consumir.el(servicio));
    }

    @Entonces("observara el {string} {string}")
    public void observaraEl(String campo, String email) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ElCorreo.es(email), Matchers.equalTo(email)));

    }

    @Entonces("el codigo de respuesta {int}")
    public void elCodigoDeRespuesta(Integer codigoRespuesta) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(CodigoRespuesta.es(), Matchers.equalTo(codigoRespuesta)));

    }

    @After
    public void cerrarElEscenario( ) {
        OnStage.drawTheCurtain();
    }
}
