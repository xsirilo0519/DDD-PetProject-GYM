package co.com.sofka.Entrenamiento.Events;

import co.com.sofka.Entrenamiento.Values.Calentamiento;
import co.com.sofka.Entrenamiento.Values.PlanID;
import co.com.sofka.Entrenamiento.Values.Series;
import co.com.sofka.domain.generic.DomainEvent;

public class SeriesdeUnPlanActualizada extends DomainEvent {
    private final PlanID planID;
    private final Series series;
    public SeriesdeUnPlanActualizada(PlanID planID, Series series) {
        super("sofka.entrenamiento.seriesdeUnPlanActualizada");
        this.planID=planID;
        this.series=series;
    }

    public PlanID getPlanID() {
        return planID;
    }

    public Series getSeries() {
        return series;
    }
}
