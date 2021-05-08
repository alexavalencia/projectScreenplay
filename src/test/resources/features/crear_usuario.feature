# language: es

Característica: Crear usuarios


  @Crear
  Esquema del escenario: Crear usuario
    Dado que "<nombre>" se conecta al servicio
    Cuando realiza la peticion al servicio "<servicio>" con los datos
      | name   | job   |
      | <name> | <job> |
    Entonces valida los datos "name" "<name>"
    Y valida los datos "job" "<job>"
    Y el codigo de respuesta 201

    Ejemplos:
      | nombre | servicio | name  | job           |
      | alexa  | crear    | luisa | contador      |
      | alexa  | crear    | pedro | administrador |
