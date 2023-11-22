package co.edu.udea.calidad.stepdefinitions;

import co.edu.udea.calidad.model.SocioInformation;
import co.edu.udea.calidad.taks.AddInformationTask;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.serenitybdd.screenplay.actors.OnStage;
import org.junit.runner.RunWith;

import java.util.List;

@RunWith(CucumberWithSerenity.class)
public class RegistrarSocio {

    @When("^completo el formulario de registro con los siguientes datos:$")
    public void inputSearchText(List<SocioInformation> socioInformations) {
        OnStage.theActorInTheSpotlight().attemptsTo(AddInformationTask.with(socioInformations));
    }

    @When("^adjunto los siguientes documentos$")
    public void search() {
        //Todo task
    }

    @Then("^deberia ver un mensaje de confirmacion$")
    public void checkResults() {
        //Todo task
    }

}
