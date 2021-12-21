package co.com.sofka.Entrenamiento.Commands;

import co.com.sofka.Entrenamiento.Values.Calentamiento;
import co.com.sofka.Entrenamiento.Values.EntrenamientoID;
import co.com.sofka.Entrenamiento.Values.PlanID;
import co.com.sofka.domain.generic.Command;

public class ActualizarCalentamientodeUnPlan extends Command {
    private final EntrenamientoID entrenamientoID;
    private final PlanID planID;
    private final Calentamiento calentamiento;

    public ActualizarCalentamientodeUnPlan(EntrenamientoID entrenamientoID, PlanID planID, Calentamiento calentamiento) {
        this.entrenamientoID = entrenamientoID;
        this.planID = planID;
        this.calentamiento = calentamiento;
    }

    public EntrenamientoID getEntrenamientoID() {
        return entrenamientoID;
    }

    public PlanID getPlanID() {
        return planID;
    }

    public Calentamiento getCalentamiento() {
        return calentamiento;
    }
}
