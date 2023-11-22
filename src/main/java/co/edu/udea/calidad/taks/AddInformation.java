package co.edu.udea.calidad.taks;

import co.edu.udea.calidad.interactions.SotreSearchInteraction;
import co.edu.udea.calidad.model.SocioInformation;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static co.edu.udea.calidad.userInterfaces.AddSocioInformation.*;

public class AddInformation implements Task {

    List<SocioInformation> socioInformationList;

    public AddInformation (List<SocioInformation> personalInformationList){
        this.socioInformationList = personalInformationList;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Enter.keyValues(this.socioInformationList.get(0).getDocument()).into(INPUT_DOCUMENT),
            Enter.keyValues(this.socioInformationList.get(0).getFullName()).into(INPUT_FULLNAME),
            Enter.keyValues(this.socioInformationList.get(0).getEmail()).into(INPUT_EMAIL),
            Enter.keyValues(this.socioInformationList.get(0).getPhone()).into(INPUT_PHONE),
            Click.on(BTN_REGISTER)
        );
    }

    public static AddInformation with(List<SocioInformation> socioInformations){
        return Tasks.instrumented(AddInformation.class, socioInformations);
    }
}