package co.edu.udea.calidad.taks;

import co.edu.udea.calidad.interactions.AttachFile;
import co.edu.udea.calidad.model.DocumentsSocio;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import java.util.ArrayList;
import java.util.List;

import static co.edu.udea.calidad.userInterfaces.RegistroSocioPage.*;

public class AttachDocuments implements Task {

    private final List<DocumentsSocio> documentsSocios;

    public AttachDocuments(List<DocumentsSocio> documentsSocios){
        this.documentsSocios = documentsSocios;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(AttachFile.attach(documentsSocios.get(0).getPasadoJudicial(), ATTACH_PASADO));
        actor.attemptsTo(AttachFile.attach(documentsSocios.get(0).getLicenciaConducir(), ATTACH_LICENCIA));
        actor.attemptsTo(AttachFile.attach(documentsSocios.get(0).getFoto(), ATTACH_PHOTO));
        actor.attemptsTo(Click.on(BTN_REGISTER).afterWaitingUntilEnabled());
    }

    public static AttachDocuments withFiles(DataTable socioDocuments){
        List<List<String>> rows = socioDocuments.asLists(String.class);
        List<DocumentsSocio> documents = new ArrayList<>();
        rows.forEach(column ->
                documents.add(new DocumentsSocio(column.get(0), column.get(1), column.get(2))));
        return Tasks.instrumented(AttachDocuments.class, documents);
    }



}