package co.com.sofka.Entrenamiento.Commands;

import co.com.sofka.Entrenamiento.Values.EntrenamientoID;
import co.com.sofka.Entrenamiento.Values.PlanID;
import co.com.sofka.Generic.EntrenadorID;
import co.com.sofka.domain.generic.Command;

public class ActualizarEntrenadorIDdeUnPlan extends Command {
    private final EntrenamientoID entrenamientoID;
    private final PlanID planID;
    private final EntrenadorID entrenadorID;

    public ActualizarEntrenadorIDdeUnPlan(EntrenamientoID entrenamientoID, PlanID planID, EntrenadorID entrenadorID) {
        this.entrenamientoID = entrenamientoID;
        this.planID = planID;
        this.entrenadorID = entrenadorID;
    }

    public EntrenamientoID getEntrenamientoID() {
        return entrenamientoID;
    }

    public PlanID getPlanID() {
        return planID;
    }

    public EntrenadorID getEntrenadorID() {
        return entrenadorID;
    }
}
