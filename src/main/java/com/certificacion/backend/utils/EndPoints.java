package com.certificacion.backend.utils;

public class EndPoints {

    private static final String CONSULTAR_USUARIO = "/api/users/2";
    private static final String CREAR_USUARIO="/api/users";

    public static String obtener(String servicio) {

        switch (servicio) {
            case "consultar usuario":
            case "eliminar":
                return CONSULTAR_USUARIO;
            case "crear":
                return CREAR_USUARIO;
            default:
                return null;

        }
    }


}
