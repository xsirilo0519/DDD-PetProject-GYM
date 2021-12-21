package co.com.sofka.Entrenamiento.Commands;

import co.com.sofka.Entrenamiento.Values.EntrenamientoID;
import co.com.sofka.Entrenamiento.Values.PlanID;
import co.com.sofka.Generic.ElementoID;
import co.com.sofka.domain.generic.Command;

import java.util.List;

public class AgregarElementoIDdeUnPlan extends Command {
    private final EntrenamientoID entrenamientoID;
    private final PlanID planID;
    private final List<ElementoID> elementoIDList;

    public AgregarElementoIDdeUnPlan(EntrenamientoID entrenamientoID, PlanID planID, List<ElementoID> elementoIDList) {
        this.entrenamientoID = entrenamientoID;
        this.planID = planID;
        this.elementoIDList = elementoIDList;
    }

    public EntrenamientoID getEntrenamientoID() {
        return entrenamientoID;
    }

    public PlanID getPlanID() {
        return planID;
    }

    public List<ElementoID> getElementoIDList() {
        return elementoIDList;
    }
}
