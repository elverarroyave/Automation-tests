package co.edu.udea.calidad.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features="src/test/resources/features/gestion_de_socios.feature",
        glue= "co.edu.udea.calidad.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "@TEST-003"
)
public class ValidateGestionSocios {

}
