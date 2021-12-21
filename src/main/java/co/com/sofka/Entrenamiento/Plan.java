package co.com.sofka.Entrenamiento;

import co.com.sofka.Entrenamiento.Values.*;
import co.com.sofka.Generic.ElementoID;
import co.com.sofka.Generic.EntrenadorID;
import co.com.sofka.Generic.MaquinaID;
import co.com.sofka.Generic.NutricionistaID;
import co.com.sofka.domain.generic.Entity;

import java.util.List;
import java.util.Objects;

public class Plan extends Entity<PlanID> {

    private EntrenadorID entrenadorID;
    private Calentamiento calentamiento;
    private Fecha fecha;
    private Series series;
    private Repeticiones repeticiones;
    private NutricionistaID nutricionistaID;
    private List<ElementoID> elementoIDList;
    private List<MaquinaID> maquinaIDList;

    public Plan(PlanID planID, EntrenadorID entrenadorID, Calentamiento calentamiento, Fecha fecha, Series series, Repeticiones repeticiones, NutricionistaID nutricionistaID) {
        super(planID);
        this.entrenadorID=entrenadorID;
        this.calentamiento=calentamiento;
        this.fecha=fecha;
        this.series=series;
        this.repeticiones=repeticiones;
        this.nutricionistaID=nutricionistaID;
    }

    public void actualizarEntrenadorID(EntrenadorID entrenadorID){
        this.entrenadorID=Objects.requireNonNull(entrenadorID);
    }
    public void actualizarCalentamiento(Calentamiento calentamiento){
        this.calentamiento=Objects.requireNonNull(calentamiento);
    }
    public void actualizarFecha(Fecha fecha){
        this.fecha=Objects.requireNonNull(fecha);
    }
    public void actualizarSeries(Series series){
        this.series=Objects.requireNonNull(series);
    }
    public void agregarElementoID(List<ElementoID> elementoIDList){
        this.elementoIDList=Objects.requireNonNull(elementoIDList);
    }
    public void agregarMaquinaID(List<MaquinaID> maquinaIDList){
        this.maquinaIDList=Objects.requireNonNull(maquinaIDList);
    }
    public void actualizarRepeticiones(Repeticiones repeticiones){
        this.repeticiones=Objects.requireNonNull(repeticiones);
    }
    public void actualizarNutricionistaID(NutricionistaID nutricionistaID){
        this.nutricionistaID=Objects.requireNonNull(nutricionistaID);
    }

    public EntrenadorID entrenadorID() {
        return entrenadorID;
    }

    public Calentamiento calentamiento() {
        return calentamiento;
    }

    public Fecha fecha() {
        return fecha;
    }

    public Series series() {
        return series;
    }

    public Repeticiones repeticiones() {
        return repeticiones;
    }

    public NutricionistaID nutricionistaID() {
        return nutricionistaID;
    }

    public List<ElementoID> elementoIDList() {
        return elementoIDList;
    }

    public List<MaquinaID> maquinaIDList() {
        return maquinaIDList;
    }
}
