package com.certificacion.backend.questions;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class CodigoRespuesta implements Question<Integer> {

    public static CodigoRespuesta es( ) {
        return new CodigoRespuesta();
    }

    @Override
    public Integer answeredBy(Actor actor) {
        return SerenityRest.lastResponse().getStatusCode();
    }
}
