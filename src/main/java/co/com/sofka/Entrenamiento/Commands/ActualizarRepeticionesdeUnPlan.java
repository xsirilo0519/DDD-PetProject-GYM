package co.com.sofka.Entrenamiento.Commands;

import co.com.sofka.Entrenamiento.Values.EntrenamientoID;
import co.com.sofka.Entrenamiento.Values.PlanID;
import co.com.sofka.Entrenamiento.Values.Repeticiones;
import co.com.sofka.domain.generic.Command;

public class ActualizarRepeticionesdeUnPlan extends Command {
    private final EntrenamientoID entrenamientoID;
    private final PlanID planID;
    private final Repeticiones repeticiones;

    public ActualizarRepeticionesdeUnPlan(EntrenamientoID entrenamientoID, PlanID planID, Repeticiones repeticiones) {
        this.entrenamientoID = entrenamientoID;
        this.planID = planID;
        this.repeticiones = repeticiones;
    }

    public EntrenamientoID getEntrenamientoID() {
        return entrenamientoID;
    }

    public PlanID getPlanID() {
        return planID;
    }

    public Repeticiones getRepeticiones() {
        return repeticiones;
    }
}
