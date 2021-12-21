package co.com.sofka.Entrenamiento.Events;

import co.com.sofka.Entrenamiento.Values.*;
import co.com.sofka.Generic.ElementoID;
import co.com.sofka.Generic.EntrenadorID;
import co.com.sofka.Generic.MaquinaID;
import co.com.sofka.Generic.NutricionistaID;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.ArrayList;
import java.util.List;

public class PlanAgregado extends DomainEvent {
    private final PlanID planID;
    private final EntrenadorID entrenadorID;
    private final Calentamiento calentamiento;
    private final Fecha fecha;
    private final Series series;
    private final Repeticiones repeticiones;
    private final NutricionistaID nutricionistaID;


    public PlanAgregado(PlanID planID, EntrenadorID entrenadorID, Calentamiento calentamiento, Fecha fecha, Series series, Repeticiones repeticiones, NutricionistaID nutricionistaID) {
        super("sofka.entrenamiento.planAgregado");
        this.planID=planID;
        this.entrenadorID=entrenadorID;
        this.calentamiento=calentamiento;
        this.fecha=fecha;
        this.series=series;
        this.repeticiones=repeticiones;
        this.nutricionistaID=nutricionistaID;

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
