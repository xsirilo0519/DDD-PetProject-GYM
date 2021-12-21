package co.com.sofka.Entrenamiento.Events;

import co.com.sofka.Entrenamiento.Values.Fecha;
import co.com.sofka.Entrenamiento.Values.PlanID;
import co.com.sofka.Generic.EntrenadorID;
import co.com.sofka.domain.generic.DomainEvent;

public class FechadeUnPlanActualizada extends DomainEvent {
    private final PlanID planID;
    private final Fecha fecha;
    public FechadeUnPlanActualizada(PlanID planID, Fecha fecha) {
        super("sofka.entrenamiento.fechadeUnPlanActualizada");
        this.planID=planID;
        this.fecha=fecha;
    }

    public PlanID getPlanID() {
        return planID;
    }

    public Fecha getFecha() {
        return fecha;
    }
}
