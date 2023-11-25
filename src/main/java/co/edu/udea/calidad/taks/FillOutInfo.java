package co.edu.udea.calidad.taks;

import co.edu.udea.calidad.interactions.AddInformation;
import co.edu.udea.calidad.model.SocioInformation;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import java.util.ArrayList;
import java.util.List;

import static co.edu.udea.calidad.userInterfaces.RegistroSocioPage.*;

public class FillOutInfo implements Task {

    private final List<SocioInformation> socioInformationList;

    public FillOutInfo(List<SocioInformation> personalInformationList){
        this.socioInformationList = personalInformationList;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(AddInformation.add(socioInformationList.get(0).getDocument(), INPUT_DOCUMENT));
        actor.attemptsTo(AddInformation.add(socioInformationList.get(0).getFullName(), INPUT_FULLNAME));
        actor.attemptsTo(AddInformation.add(socioInformationList.get(0).getEmail(), INPUT_EMAIL));
        actor.attemptsTo(AddInformation.add(socioInformationList.get(0).getPhone(), INPUT_PHONE));
        actor.attemptsTo(Click.on(BTN_REGISTER).afterWaitingUntilEnabled());
    }

    public static FillOutInfo withData(DataTable socioInfo){
        List<List<String>> rows = socioInfo.asLists(String.class);
        List<SocioInformation> socioInformation = new ArrayList<>();
        rows.forEach(column ->
                socioInformation.add(new SocioInformation(column.get(0), column.get(1), column.get(2), column.get(3))));
        return Tasks.instrumented(FillOutInfo.class, socioInformation);
    }



}