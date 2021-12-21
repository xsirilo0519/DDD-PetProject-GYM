package co.com.sofka.Entrenamiento.Events;

import co.com.sofka.Entrenamiento.Values.PlanID;
import co.com.sofka.Generic.EntrenadorID;
import co.com.sofka.domain.generic.DomainEvent;

public class EntrenadorIDdeUnPlanActualizado extends DomainEvent {
    private final PlanID planID;
    private final EntrenadorID entrenadorID;
    public EntrenadorIDdeUnPlanActualizado(PlanID planID, EntrenadorID entrenadorID) {
        super("sofka.entrenamiento.entrenadorIDdeUnPlanActualizado");
        this.planID=planID;
        this.entrenadorID=entrenadorID;
    }

    public PlanID getPlanID() {
        return planID;
    }

    public EntrenadorID getEntrenadorID() {
        return entrenadorID;
    }
}
