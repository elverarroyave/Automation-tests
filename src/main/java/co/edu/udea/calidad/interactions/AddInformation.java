package co.edu.udea.calidad.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

public class AddInformation implements Interaction {

    private static String socioInformation;

    private static Target inputField;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.keyValues(socioInformation).into(inputField));
    }

    public static AddInformation add(String textToSend, Target inputFieldTarget){
        AddInformation.socioInformation = textToSend;
        AddInformation.inputField = inputFieldTarget;
        return Tasks.instrumented(AddInformation.class);
    }
}
