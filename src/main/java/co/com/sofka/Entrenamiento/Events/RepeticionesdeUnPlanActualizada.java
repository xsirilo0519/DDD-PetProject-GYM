package co.com.sofka.Entrenamiento.Events;

import co.com.sofka.Entrenamiento.Values.Calentamiento;
import co.com.sofka.Entrenamiento.Values.PlanID;
import co.com.sofka.Entrenamiento.Values.Repeticiones;
import co.com.sofka.domain.generic.DomainEvent;

public class RepeticionesdeUnPlanActualizada extends DomainEvent {
    private final PlanID planID;
    private final Repeticiones repeticiones;
    public RepeticionesdeUnPlanActualizada(PlanID planID, Repeticiones repeticiones) {
        super("sofka.entrenamiento.repeticionesdeUnPlanActualizada");
        this.planID=planID;
        this.repeticiones=repeticiones;
    }

    public PlanID getPlanID() {
        return planID;
    }

    public Repeticiones getRepeticiones() {
        return repeticiones;
    }
}
