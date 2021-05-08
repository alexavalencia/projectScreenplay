# language: es

  Característica: Eliminar clientes

  Antecedentes:
    Dado que "Elvis" se conecta al servicio

  @Eliminar
  Escenario: Eliminar un usuario
    Cuando realiza la peticion al servicio "eliminar"
    Entonces el codigo de respuesta 204