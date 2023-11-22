package co.edu.udea.calidad.userInterfaces;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class CustomerSearch extends PageObject {
    public static final Target INPUT_TEXT_FIELD = Target.the("INPUT TEXT").locatedBy("//input[contains(@class, 'form-control search-bar-input')]"); //linio
//    public static final Target INPUT_TEXT_FIELD = Target.the("INPUT TEXT").locatedBy("//input[@id='downshift-8-input']"); // exito
//    public static final Target INPUT_TEXT_FIELD = Target.the("INPUT TEXT").locatedBy("//input[@id='js-site-search-input']"); //alkosto
}
