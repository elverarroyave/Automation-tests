package co.edu.udea.calidad.taks;

import co.edu.udea.calidad.interactions.SotreSearchInteraction;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class SearchFor implements Task {

    private PageObject page;

    public SearchFor(PageObject page){
        this.page = page;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
//        actor.attemptsTo(Open.browserOn(page));
        actor.attemptsTo(SotreSearchInteraction.search());
    }

    public static SearchFor with(PageObject page){
        return Tasks.instrumented(SearchFor.class, page);
    }
}