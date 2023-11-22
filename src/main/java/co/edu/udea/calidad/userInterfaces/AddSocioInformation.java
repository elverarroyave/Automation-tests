package co.edu.udea.calidad.userInterfaces;


import net.serenitybdd.screenplay.targets.Target;

public class AddSocioInformation {

    public static Target INPUT_DOCUMENT = Target.the("INPUT socio document" )
            .locatedBy("//*[@name='documentoIdentidad']");
    public static Target INPUT_FULLNAME = Target.the("INPUT socio document" )
            .locatedBy("//*[@name='nombre']");
    public static Target INPUT_EMAIL = Target.the("INPUT socio document" )
            .locatedBy("//*[@name='correoElectronico']");
    public static Target INPUT_PHONE = Target.the("INPUT socio document" )
            .locatedBy("//*[@name='telefono']");

    public static Target BTN_REGISTER = Target.the("BTN to register socio")
            .locatedBy("//*[@id='registrar-socio']");

}
