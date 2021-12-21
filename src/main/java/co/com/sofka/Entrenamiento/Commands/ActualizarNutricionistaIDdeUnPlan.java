package co.com.sofka.Entrenamiento.Commands;

import co.com.sofka.Entrenamiento.Values.EntrenamientoID;
import co.com.sofka.Entrenamiento.Values.PlanID;
import co.com.sofka.Generic.NutricionistaID;
import co.com.sofka.domain.generic.Command;

public class ActualizarNutricionistaIDdeUnPlan extends Command {
    private final EntrenamientoID entrenamientoID;
    private final PlanID planID;
    private final NutricionistaID nutricionistaID;

    public ActualizarNutricionistaIDdeUnPlan(EntrenamientoID entrenamientoID, PlanID planID, NutricionistaID nutricionistaID) {
        this.entrenamientoID = entrenamientoID;
        this.planID = planID;
        this.nutricionistaID = nutricionistaID;
    }

    public EntrenamientoID getEntrenamientoID() {
        return entrenamientoID;
    }

    public PlanID getPlanID() {
        return planID;
    }

    public NutricionistaID getNutricionistaID() {
        return nutricionistaID;
    }
}
