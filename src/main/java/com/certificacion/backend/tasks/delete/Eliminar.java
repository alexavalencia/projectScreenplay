package com.certificacion.backend.tasks.delete;

import com.certificacion.backend.utils.EndPoints;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Delete;

public class Eliminar implements Task {
    private String servicio;

    public Eliminar(String servicio) {
        this.servicio = servicio;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Delete.from(EndPoints.obtener(servicio)));
        SerenityRest.lastResponse().body().prettyPrint();
    }

    public static Eliminar usuario(String servicio){
        return Tasks.instrumented(Eliminar.class,servicio);
    }
}
