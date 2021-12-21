package co.com.sofka.Entrenamiento.Commands;

import co.com.sofka.Entrenamiento.Values.EntrenamientoID;
import co.com.sofka.Entrenamiento.Values.Fecha;
import co.com.sofka.Entrenamiento.Values.PlanID;
import co.com.sofka.domain.generic.Command;

public class ActualizarFechadeUnPlan extends Command {
    private final EntrenamientoID entrenamientoID;
    private final PlanID planID;
    private final Fecha fecha;

    public ActualizarFechadeUnPlan(EntrenamientoID entrenamientoID, PlanID planID, Fecha fecha) {
        this.entrenamientoID = entrenamientoID;
        this.planID = planID;
        this.fecha = fecha;
    }

    public EntrenamientoID getEntrenamientoID() {
        return entrenamientoID;
    }

    public PlanID getPlanID() {
        return planID;
    }

    public Fecha getFecha() {
        return fecha;
    }
}
