package co.com.sofka.Entrenamiento.Events;

import co.com.sofka.Entrenamiento.Values.Calentamiento;
import co.com.sofka.Entrenamiento.Values.PlanID;
import co.com.sofka.Generic.ElementoID;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;

public class ElementoIDdeUnPlanAgregado extends DomainEvent {
    private final PlanID planID;
    private final List<ElementoID> elementoIDList;
    public ElementoIDdeUnPlanAgregado(PlanID planID, List<ElementoID> elementoIDList) {
        super("sofka.entrenamiento.elementoIDdeUnPlanAgregado");
        this.planID=planID;
        this.elementoIDList=elementoIDList;
    }

    public PlanID getPlanID() {
        return planID;
    }

    public List<ElementoID> getElementoIDList() {
        return elementoIDList;
    }
}
