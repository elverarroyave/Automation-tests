package co.edu.udea.calidad.interactions;

import co.edu.udea.calidad.model.SocioInformation;
import co.edu.udea.calidad.taks.AddInformationTask;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static co.edu.udea.calidad.userInterfaces.AddSocioInformation.*;

public class AddSocioInformationInteration implements Interaction {

    private static List<SocioInformation> socioInformationList;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.keyValues(socioInformationList.get(0).getDocument()).into(INPUT_DOCUMENT),
                Enter.keyValues(socioInformationList.get(0).getFullName()).into(INPUT_FULLNAME),
                Enter.keyValues(socioInformationList.get(0).getEmail()).into(INPUT_EMAIL),
                Enter.keyValues(socioInformationList.get(0).getPhone()).into(INPUT_PHONE),
                Click.on(BTN_REGISTER)
        );
    }

    public static AddSocioInformationInteration add(List<SocioInformation> socioInformationList){
        AddSocioInformationInteration.socioInformationList = socioInformationList;
        return Tasks.instrumented(AddSocioInformationInteration.class);
    }
}
