#Author:Elver Arroyave
    #language:en

Feature: Como socio quiero poder registrarme en el sistema, para poder prestar servicios con mi vehiculo


  @TEST-001
  Scenario Outline: Validar registro exitoso de un nuevo socio conductor
    Given me encuentro en la pagina de registrar socio
    When completo el formulario de registro con los siguientes datos:
      | <document> | <fullName> | <email> | <phone> |
    And adjunto los siguientes documentos
      | <pasadoJudicial> | <licenciaConducir> | <foto> |
    Then debo ver un mensaje de confirmacion
    Examples:
      | document   | fullName       | email                        | phone      | pasadoJudicial                                  | licenciaConducir                         | foto                                   |
      | 1032514845 | ELVER ARROYAVE | elver.arroyave10@udea.edu.co | 3123128223 | src/test/resources/testFiles/pasadoJudicial.jpg | src/test/resources/testFiles/license.jpg | src/test/resources/testFiles/photo.jpg |


  @TEST-002
  Scenario Outline: Validar menu de Gestion de Socios
    Given me encuentro en la pagina de registrar socio
    When selecciono el menu "<opcion>" de Gestion de Socios
    Then debo ver la pagina "<pagina>"
    Examples:
      | opcion               | pagina           |
      | Listado de Socios    | tablaSocios      |
      | Nombre de Socio      | nombreSocio      |
      | Registro de Vehiculo | registroVehiculo |

  @TEST-003
  Scenario: Validar registro de vehiculo en gestion de socios
    Given me encuentro en la pagina de registrar socio
    When selecciono el menu "Registro de Vehiculo" de Gestion de Socios
    And completo el formulario de registro de vehiculo con los siguientes datos:
      | marca  | modelo | capacidad | equipaje | mascotasFriendly |
      | JIV021 | 2021   | 4         | 5        | Si               |
    Then debo ver un mensaje de confirmacion de registro