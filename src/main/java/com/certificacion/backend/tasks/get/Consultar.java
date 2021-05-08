package com.certificacion.backend.tasks.get;

import com.certificacion.backend.utils.EndPoints;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Get;

public class Consultar implements Task {
    private String servicio;

    public Consultar(String servicio) {
        this.servicio = servicio;
    }

    public static Consultar usuario(String servicio) {
        return Tasks.instrumented(Consultar.class, servicio);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Get.resource(EndPoints.obtener(servicio)));
        SerenityRest.lastResponse().body().prettyPrint();
    }
}
