package com.certificacion.backend.tasks.post;

import com.certificacion.backend.utils.EndPoints;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Post;
import org.json.simple.JSONObject;

import java.util.Map;

public class Crear implements Task {

    private final String servicio;
    private final Map<String, String> datos;

    public Crear(String servicio, Map<String, String> datos) {
        this.servicio = servicio;
        this.datos = datos;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(Post.to(EndPoints.obtener(servicio))
                    .with(requestSpecification ->
                            requestSpecification.header("Content-Type","application/json")
                                    .body(new JSONObject(datos)) ));
    }

    public static Crear usuario(String servicio,Map<String, String> datos){
        return Tasks.instrumented(Crear.class,servicio,datos);
    }
}
