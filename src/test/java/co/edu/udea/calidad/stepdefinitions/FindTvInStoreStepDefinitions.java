package co.edu.udea.calidad.stepdefinitions;

import co.edu.udea.calidad.taks.SearchFor;
import co.edu.udea.calidad.userInterfaces.CustomerSearch;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.serenitybdd.screenplay.actors.OnStage;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
public class FindTvInStoreStepDefinitions {

    public CustomerSearch customerSearch = new CustomerSearch();

    @When("^I enter \"([^\"]*)\" in the search bar$")
    public void inputSearchText(String textSearch) {
        Serenity.setSessionVariable("product").to(textSearch);
        OnStage.theActorInTheSpotlight().attemptsTo(SearchFor.with(customerSearch));
    }

    @When("^I press the search magnifying glass$")
    public void search() {
        //Todo task
    }

    @Then("^I can see the search results of \"([^\"]*)\"$")
    public void checkResults(String textoBusqueda) {
        //Todo task
    }

}
