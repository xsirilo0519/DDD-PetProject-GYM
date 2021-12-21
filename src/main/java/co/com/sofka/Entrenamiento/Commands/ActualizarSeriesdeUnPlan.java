package co.com.sofka.Entrenamiento.Commands;

import co.com.sofka.Entrenamiento.Values.EntrenamientoID;
import co.com.sofka.Entrenamiento.Values.PlanID;
import co.com.sofka.Entrenamiento.Values.Series;
import co.com.sofka.domain.generic.Command;

public class ActualizarSeriesdeUnPlan extends Command {
    private final EntrenamientoID entrenamientoID;
    private final PlanID planID;
    private final Series series;

    public ActualizarSeriesdeUnPlan(EntrenamientoID entrenamientoID, PlanID planID, Series series) {
        this.entrenamientoID = entrenamientoID;
        this.planID = planID;
        this.series = series;
    }

    public EntrenamientoID getEntrenamientoID() {
        return entrenamientoID;
    }

    public PlanID getPlanID() {
        return planID;
    }

    public Series getSeries() {
        return series;
    }
}
