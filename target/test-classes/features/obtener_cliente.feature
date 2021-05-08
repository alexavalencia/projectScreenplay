# language: es
  #Autor: elvis.mieles@wolox.co

Característica: Consultar clientes

  Antecedentes:
    Dado que "Elvis" se conecta al servicio

  @Consultar
  Escenario: consulta un registro de un usuario
    Cuando realiza la peticion al servicio "consultar usuario"
    Entonces observara el "email" "janet.weaver@reqres.in"
    Y el codigo de respuesta 200

