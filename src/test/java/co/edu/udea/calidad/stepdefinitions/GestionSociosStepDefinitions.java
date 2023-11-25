package co.edu.udea.calidad.stepdefinitions;

import co.edu.udea.calidad.questions.RedirectQuestions;
import co.edu.udea.calidad.questions.RegistroQuestions;
import co.edu.udea.calidad.taks.FillOutInfo;

import co.edu.udea.calidad.taks.FillOutVehicleData;
import co.edu.udea.calidad.taks.OpenMenuOption;
import co.edu.udea.calidad.taks.OpenThe;
import co.edu.udea.calidad.userInterfaces.RegistroSocioPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import org.openqa.selenium.WebDriver;


import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static org.hamcrest.core.IsEqual.equalTo;

public class GestionSociosStepDefinitions {

    @Managed(driver = "chrome")
    public WebDriver driver;

    public RegistroSocioPage registroSocioPage = new RegistroSocioPage();


    @Before
    public void init() {
        driver.manage().window().maximize();
        setTheStage(new Cast());
        theActorCalled("customer").can(BrowseTheWeb.with(driver));
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.close();
            driver.quit();
            driver = null;
        }
    }

    @Given("^me encuentro en la pagina de registrar socio$")
    public void goToMainRegistrationPage() {
        OnStage.theActorInTheSpotlight().attemptsTo(OpenThe.browser(registroSocioPage));
    }

    @When("^completo el formulario de registro con los siguientes datos:$")
    public void inputRegistrationFields(DataTable socioInformation) {
        OnStage.theActorInTheSpotlight().attemptsTo(FillOutInfo.withData(socioInformation));
    }

    @When("^adjunto los siguientes documentos$")
    public void attachSocioDocuments(DataTable attachments) {
        //OnStage.theActorInTheSpotlight().attemptsTo(AttachDocumentsTask.withFiles(attachments));
    }

    @Then("^debo ver un mensaje de confirmacion$")
    public void checkResults() {
        OnStage.theActorInTheSpotlight().should(seeThat(RegistroQuestions.isUserRegistered(), equalTo(true)));
    }


    @When("selecciono el menu {string} de Gestion de Socios")
    public void selectTheMenuOption(String menuOption) {
        OnStage.theActorInTheSpotlight().attemptsTo(OpenMenuOption.goTo(menuOption));

    }

    @Then("debo ver la pagina {string}")
    public void checkPageRedirect(String page) {
        Serenity.setSessionVariable("urlPath").to(page);
        OnStage.theActorInTheSpotlight().should(seeThat(RedirectQuestions.doesUrlMatch(), equalTo(true)));
    }

    @And("completo el formulario de registro de vehiculo con los siguientes datos:")
    public void completeVehicleRegistration(DataTable vehicleData) {
        OnStage.theActorInTheSpotlight().attemptsTo(FillOutVehicleData.withData(vehicleData));
    }

    @Then("debo ver un mensaje de confirmacion de registro")
    public void deboVerUnMensajeDeConfirmacionDeRegistro() {
        OnStage.theActorInTheSpotlight().should(seeThat(RegistroQuestions.isUserRegistered(), equalTo(true)));

    }
}
