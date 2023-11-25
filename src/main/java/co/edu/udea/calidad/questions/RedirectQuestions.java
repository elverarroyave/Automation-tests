package co.edu.udea.calidad.questions;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Browser;
import net.serenitybdd.screenplay.questions.Text;
import org.openqa.selenium.WebDriver;

import static co.edu.udea.calidad.userInterfaces.RegistroSocioPage.CONFIRMATION_POPUP;

public class RedirectQuestions implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        WebDriver driver = actor.usingAbilityTo(BrowseTheWeb.class).getDriver();
        String urlPath = Serenity.sessionVariableCalled("urlPath");
        return driver.getCurrentUrl().contains(urlPath);
    }

    public static RedirectQuestions doesUrlMatch(){
        return new RedirectQuestions();
    }
}
