package co.edu.udea.calidad.taks;

import co.edu.udea.calidad.interactions.AddInformation;
import co.edu.udea.calidad.model.SocioInformation;
import co.edu.udea.calidad.model.VehicleData;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import java.util.ArrayList;
import java.util.List;

import static co.edu.udea.calidad.userInterfaces.RegistroSocioPage.*;

public class FillOutVehicleData implements Task {

    private final List<VehicleData> vehicleDataList;

    public FillOutVehicleData(List<VehicleData> vehicleDataList){
        this.vehicleDataList = vehicleDataList;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(AddInformation.add(vehicleDataList.get(0).getMarca(), INPUT_MARCA));
        actor.attemptsTo(AddInformation.add(vehicleDataList.get(0).getModelo(), INPUT_MODEL));
        actor.attemptsTo(AddInformation.add(vehicleDataList.get(0).getCapacidad(), INPUT_CAPACIDAD));
        actor.attemptsTo(AddInformation.add(vehicleDataList.get(0).getEquipaje(), INPUT_EQUIPAJE));
        actor.attemptsTo(AddInformation.add(vehicleDataList.get(0).getMascotas(), INPUT_MASCOTAS));
        actor.attemptsTo(Click.on(BTN_REGISTER).afterWaitingUntilEnabled());
    }

    public static FillOutVehicleData withData(DataTable vehicleInfo){
        List<List<String>> rows = vehicleInfo.asLists(String.class);
        List<VehicleData> vehicle = new ArrayList<>();
        rows.stream().skip(1).forEach(column ->
                vehicle.add(new VehicleData(column.get(0), column.get(1), column.get(2), column.get(3), column.get(3))));
        return Tasks.instrumented(FillOutVehicleData.class, vehicle);
    }

}
