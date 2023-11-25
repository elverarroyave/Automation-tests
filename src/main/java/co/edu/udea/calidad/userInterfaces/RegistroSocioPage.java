package co.edu.udea.calidad.userInterfaces;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import java.util.HashMap;
import java.util.Map;

public class RegistroSocioPage extends PageObject{

    public static Target INPUT_DOCUMENT = Target.the("INPUT socio document" )
            .located(By.name("documentoIdentidad"));
    public static Target INPUT_FULLNAME = Target.the("INPUT socio name" )
            .located(By.name("nombre"));
    public static Target INPUT_EMAIL = Target.the("INPUT socio email" )
            .located(By.name("correoElectronico"));
    public static Target INPUT_PHONE = Target.the("INPUT socio phone" )
            .located(By.name("telefono"));
    public static Target BTN_REGISTER = Target.the("BTN to register socio")
            .located(By.cssSelector("button[type='submit']"));

    public static String ATTACH_PASADO = "pasadoJudicial";
    //public static Target ATTACH_PASADO = Target.the("ATTACH pasado judicial" ).located(By.name("pasadoJudicial"));

    public static String ATTACH_LICENCIA = "licenciaConducir";
    //public static Target ATTACH_LICENCIA = Target.the("ATTACH licencia" ).located(By.name("licenciaConducir"));

    public static String ATTACH_PHOTO = "foto";
    //public static Target ATTACH_PHOTO = Target.the("ATTACH foto").located(By.name("foto"));
    public static Target CONFIRMATION_POPUP = Target.the("POP UP Confirmation ")
            .located(By.id("swal2-title"));


    public static Target MENU_SLIDER = Target.the("Menu").located(By.cssSelector("div.p-2"));

    public static Target GESTION_BUTTON = Target.the("Gestion Menu Option").located(By.cssSelector("button.p-1"));

    public static Target REGISTRO_MENU = Target.the("Registro Socio").located(By.cssSelector("a[href='/registroSocio']"));

    public static Target LIST_MENU = Target.the("List Menu Socio").located(By.cssSelector("a[href='/tablaSocios']"));

    public static Target NAME_MENU = Target.the("Name Socio").located(By.cssSelector("a[href='/nombreSocio']"));

    public static Target VEHICLE_MENU = Target.the("Vehicle Socio").located(By.cssSelector("a[href='/registroVehiculo']"));


    public static Target INPUT_MARCA = Target.the("MARCA vehiculo" )
            .located(By.name("marca"));

    public static Target INPUT_MODEL = Target.the("MODELO vehiculo" )
            .located(By.name("modelo"));

    public static Target INPUT_CAPACIDAD = Target.the("CAPACIDAD vehiculo" )
            .located(By.name("capacidad"));

    public static Target INPUT_EQUIPAJE = Target.the("EQUIPAJE vehiculo" )
            .located(By.name("equipaje"));

    public static Target INPUT_MASCOTAS = Target.the("MASCOTAS vehiculo" )
            .located(By.name("mascotas"));




}
