package co.edu.udea.calidad.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class AttachFile implements Interaction {

    private static String attachment;

    private static String inputField;

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = actor.usingAbilityTo(BrowseTheWeb.class).getDriver();
        String jsScript = String.format("var input = document.getElementsByName('%s')[0];input.value='%s';", inputField, attachment);
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript(jsScript);
    }

    public static AttachFile attach(String textToSend, String inputFieldTarget){
        AttachFile.attachment = textToSend;
        AttachFile.inputField = inputFieldTarget;
        return Tasks.instrumented(AttachFile.class);
    }
}
