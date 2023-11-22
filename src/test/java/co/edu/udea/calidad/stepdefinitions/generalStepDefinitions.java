package co.edu.udea.calidad.stepdefinitions;

import co.edu.udea.calidad.utils.OwnWebDriver;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class generalStepDefinitions {
    @Before
    public void init(){setTheStage(new Cast());}

    @Given("^me encuentroen la pagina de registrar socio$")
    public void theStudentEnterToMainPage(){
        theActorCalled("customer").can(BrowseTheWeb.with(OwnWebDriver.nuevo().chrome("http://localhost:3000/registroSocio")));
    }
}
