package co.edu.udea.calidad.taks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitOnSupplier;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.HashMap;
import java.util.Map;

import static co.edu.udea.calidad.userInterfaces.RegistroSocioPage.*;

public class OpenMenuOption implements Task {

    String menuOption;


    public OpenMenuOption(String menuOption){
        this.menuOption = menuOption;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(MENU_SLIDER).afterWaitingUntilPresent());
        actor.attemptsTo(Click.on(GESTION_BUTTON).afterWaitingUntilPresent());
        actor.attemptsTo(Click.on(getMenuOptions().get(menuOption)).afterWaitingUntilPresent());
        actor.attemptsTo(WaitUntil.the(getMenuOptions().get(menuOption), WebElementStateMatchers.isNotSelected()).forNoMoreThan(5).seconds());
    }

    public static OpenMenuOption goTo(String menuOption){
        return Tasks.instrumented(OpenMenuOption.class, menuOption);
    }

    private Map<String, Target> getMenuOptions(){
        Map<String, Target> menuOptions = new HashMap<>();
        menuOptions.put("Registro de Socio", REGISTRO_MENU);
        menuOptions.put("Listado de Socios", LIST_MENU);
        menuOptions.put("Nombre de Socio", NAME_MENU);
        menuOptions.put("Registro de Vehiculo", VEHICLE_MENU);
        return menuOptions;
    }
}
