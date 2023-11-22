package co.edu.udea.calidad.runners;




import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features="src/test/resources/features/find_tv_in-amazon.feature",
        glue= "co.edu.udea.calidad.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class FindHomePage {

}
