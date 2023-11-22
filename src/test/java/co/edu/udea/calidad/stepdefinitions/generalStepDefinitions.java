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

    @Given("^the customer enter to main page$")
    public void theStudentEnterToMainPage(){
//        theActorCalled("customer").can(BrowseTheWeb.with(OwnWebDriver.nuevo().chrome("https://www.amazon.com/")));
//        theActorCalled("customer").can(BrowseTheWeb.with(OwnWebDriver.nuevo().chrome("https://www.alkosto.com/")));
//        theActorCalled("customer").can(BrowseTheWeb.with(OwnWebDriver.nuevo().chrome("https://www.exito.com/")));
        theActorCalled("customer").can(BrowseTheWeb.with(OwnWebDriver.nuevo().chrome("https://www.linio.com.co/")));
    }
}
