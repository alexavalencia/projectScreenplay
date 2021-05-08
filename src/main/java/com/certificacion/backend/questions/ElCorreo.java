package com.certificacion.backend.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.rest.questions.LastResponse;


public class ElCorreo implements Question<String> {

    String campo;

    public ElCorreo(String campo) {
        this.campo = campo;
    }

    public static ElCorreo es(String campo) {
        return new ElCorreo(campo);
    }

    @Override
    public String answeredBy(Actor actor) {

        return LastResponse.received().answeredBy(actor).jsonPath().getString("data."+campo);


    }
}
