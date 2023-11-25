package co.edu.udea.calidad.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.edu.udea.calidad.userInterfaces.RegistroSocioPage.CONFIRMATION_POPUP;

public class RegistroQuestions implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        String results = actor.asksFor(Text.of(CONFIRMATION_POPUP));
        return results.contains("Socio registrado");
    }

    public static RegistroQuestions isUserRegistered(){
        return new RegistroQuestions();
    }
}
