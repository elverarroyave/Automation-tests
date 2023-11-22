package co.edu.udea.calidad.taks;

import co.edu.udea.calidad.interactions.AddSocioInformationInteration;
import co.edu.udea.calidad.model.SocioInformation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import java.util.List;

public class AddInformationTask implements Task {

    private final List<SocioInformation> socioInformationList;

    public AddInformationTask(List<SocioInformation> personalInformationList){
        this.socioInformationList = personalInformationList;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(AddSocioInformationInteration.add(socioInformationList));
    }

    public static AddInformationTask with(List<SocioInformation> socioInformations){
        return Tasks.instrumented(AddInformationTask.class, socioInformations);
    }
}