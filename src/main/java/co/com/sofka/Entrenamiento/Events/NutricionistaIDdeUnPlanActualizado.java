package co.com.sofka.Entrenamiento.Events;

import co.com.sofka.Entrenamiento.Values.Calentamiento;
import co.com.sofka.Entrenamiento.Values.PlanID;
import co.com.sofka.Generic.NutricionistaID;
import co.com.sofka.domain.generic.DomainEvent;

public class NutricionistaIDdeUnPlanActualizado extends DomainEvent {
    private final PlanID planID;
    private final NutricionistaID nutricionistaID;
    public NutricionistaIDdeUnPlanActualizado(PlanID planID, NutricionistaID nutricionistaID) {
        super("sofka.entrenamiento.nutricionistaIDdeUnPlanActualizado");
        this.planID=planID;
        this.nutricionistaID=nutricionistaID;
    }

    public PlanID getPlanID() {
        return planID;
    }

    public NutricionistaID getNutricionistaID() {
        return nutricionistaID;
    }
}
