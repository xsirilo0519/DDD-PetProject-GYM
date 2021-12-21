package co.com.sofka.Entrenamiento.Events;

import co.com.sofka.Entrenamiento.Values.Calentamiento;
import co.com.sofka.Entrenamiento.Values.PlanID;
import co.com.sofka.Generic.EntrenadorID;
import co.com.sofka.domain.generic.DomainEvent;

public class CalentamientodeUnPlanActualizado extends DomainEvent {
    private final PlanID planID;
    private final Calentamiento calentamiento;
    public CalentamientodeUnPlanActualizado(PlanID planID, Calentamiento calentamiento) {
        super("sofka.entrenamiento.calentamientodeUnPlanActualizado");
        this.planID=planID;
        this.calentamiento=calentamiento;
    }

    public PlanID getPlanID() {
        return planID;
    }

    public Calentamiento getCalentamiento() {
        return calentamiento;
    }
}
