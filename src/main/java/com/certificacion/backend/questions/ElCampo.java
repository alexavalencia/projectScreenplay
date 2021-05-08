package com.certificacion.backend.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.rest.questions.LastResponse;

import java.util.concurrent.SynchronousQueue;

public class ElCampo implements Question<String> {

    private final String campo;

    public ElCampo(String campo) {
        this.campo = campo;
    }

    @Override
    public String answeredBy(Actor actor) {
        return LastResponse.received().answeredBy(actor).getBody().jsonPath().getJsonObject(campo);
    }

    public static ElCampo es(String campo){
        return new ElCampo(campo);
    }
}
