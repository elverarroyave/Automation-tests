#Author:Elver Arroyave
    #language:en

Feature: Validar registro exitoso de un nuevo socio conductor


  Scenario Outline: Validar registro exitoso de un nuevo socio conductor
    Given me encuentroen la pagina de registrar socio
    When completo el formulario de registro con los siguientes datos:
      | document   | fullName   | email   | phone    |
      | <document> | <fullName> | <email> | <phone>  |
    And adjunto los siguientes documentos
    Then deberia ver un mensaje de confirmacion
    Examples:
      | document   | fullName   | email   | phone    |
      | 1038134914 | ELVER ARROYAVE | elver.arroyave@udea.edu.co | 3123128223  |