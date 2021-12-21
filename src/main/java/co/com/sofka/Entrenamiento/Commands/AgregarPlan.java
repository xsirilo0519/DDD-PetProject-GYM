package co.com.sofka.Entrenamiento.Commands;

import co.com.sofka.Entrenamiento.Entrenamiento;
import co.com.sofka.Entrenamiento.Values.*;
import co.com.sofka.Generic.EntrenadorID;
import co.com.sofka.Generic.NutricionistaID;
import co.com.sofka.domain.generic.Command;

public class AgregarPlan extends Command {
    private final EntrenamientoID entrenamientoID;
    private final PlanID planID;
    private final EntrenadorID entrenadorID;
    private final Calentamiento calentamiento;
    private final Fecha fecha;
    private final Series series;
    private final Repeticiones repeticiones;
    private final NutricionistaID nutricionistaID;

    public AgregarPlan(EntrenamientoID entrenamientoID, PlanID planID, EntrenadorID entrenadorID, Calentamiento calentamiento, Fecha fecha, Series series, Repeticiones repeticiones, NutricionistaID nutricionistaID) {
        this.entrenamientoID = entrenamientoID;
        this.planID = planID;
        this.entrenadorID = entrenadorID;
        this.calentamiento = calentamiento;
        this.fecha = fecha;
        this.series = series;
        this.repeticiones = repeticiones;
        this.nutricionistaID = nutricionistaID;
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

    public Calentamiento getCalentamiento() {
        return calentamiento;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public Series getSeries() {
        return series;
    }

    public Repeticiones getRepeticiones() {
        return repeticiones;
    }

    public NutricionistaID getNutricionistaID() {
        return nutricionistaID;
    }
}
