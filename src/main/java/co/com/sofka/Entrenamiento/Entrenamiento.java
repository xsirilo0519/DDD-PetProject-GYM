package co.com.sofka.Entrenamiento;

import co.com.sofka.Entrenamiento.Events.*;
import co.com.sofka.Entrenamiento.Values.*;
import co.com.sofka.Generic.ElementoID;
import co.com.sofka.Generic.EntrenadorID;
import co.com.sofka.Generic.MaquinaID;
import co.com.sofka.Generic.NutricionistaID;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Entrenamiento extends AggregateEvent<EntrenamientoID> {

    protected UsuarioID usuarioID;
    protected List<Sesion> sesiones;
    protected List<Plan> planes;

    public Entrenamiento(EntrenamientoID entrenamientoID,UsuarioID usuarioID) {
        super(entrenamientoID);
        appendChange(new EntrenamientoCreado(usuarioID)).apply();
    }

    private Entrenamiento(EntrenamientoID entrenamientoID){
        super(entrenamientoID);
        subscribe(new EntrenamientoChange(this));
    }

    //recrear eventos y obtener agregados que ya existen
    public static Entrenamiento from(EntrenamientoID entrenamientoID, List<DomainEvent> events){
        Entrenamiento entrenamiento=new Entrenamiento(entrenamientoID);
        events.forEach(entrenamiento::applyEvent);
        return entrenamiento;
    }

    public void agregarPlan(PlanID planID, EntrenadorID entrenadorID, Calentamiento calentamiento, Fecha fecha, Series series, Repeticiones repeticiones, NutricionistaID nutricionistaID){
        Objects.requireNonNull(planID);
        Objects.requireNonNull(entrenadorID);
        Objects.requireNonNull(calentamiento);
        Objects.requireNonNull(fecha);
        Objects.requireNonNull(series);
        Objects.requireNonNull(repeticiones);
        Objects.requireNonNull(nutricionistaID);
        appendChange(new PlanAgregado(planID,entrenadorID,calentamiento,fecha,series,repeticiones,nutricionistaID)).apply();
    }

    public void agregarSesion(SesionID sesionID,EntrenadorID entrenadorID,Sala sala,Fecha fecha,Duracion duracion){
        Objects.requireNonNull(sesionID);
        Objects.requireNonNull(entrenadorID);
        Objects.requireNonNull(sala);
        Objects.requireNonNull(fecha);
        Objects.requireNonNull(duracion);
        appendChange(new SesionAgregada(sesionID,entrenadorID,sala,fecha,duracion)).apply();
    }

    public Optional<Plan> getPlanPorId(PlanID planID){
        return planes.stream().filter(plan->plan.identity().equals(planID)).findFirst();
    }

    public Optional<Sesion> getSesionPorId(SesionID sesionID){
        return sesiones.stream().filter(sesion->sesion.identity().equals(sesionID)).findFirst();
    }

    public void actualizarEntrenadorIDdeUnPlan(PlanID planID, EntrenadorID entrenadorID){
        Objects.requireNonNull(planID);
        Objects.requireNonNull(entrenadorID);
        appendChange(new EntrenadorIDdeUnPlanActualizado(planID,entrenadorID)).apply();
    }
    public void actualizarCalentamientodeUnPlan(PlanID planID,Calentamiento calentamiento){
        Objects.requireNonNull(planID);
        Objects.requireNonNull(calentamiento);
        appendChange(new CalentamientodeUnPlanActualizado(planID,calentamiento)).apply();
    }
    public void actualizarFechadeUnPlan(PlanID planID,Fecha fecha){
        Objects.requireNonNull(planID);
        Objects.requireNonNull(fecha);
        appendChange(new FechadeUnPlanActualizada(planID,fecha)).apply();
    }
    public void actualizarSeriesdeUnPlan(PlanID planID,Series series){
        Objects.requireNonNull(planID);
        Objects.requireNonNull(series);
        appendChange(new SeriesdeUnPlanActualizada(planID,series)).apply();
    }
    public void agregarElementoIDdeUnPlan(PlanID planID,List<ElementoID> elementoIDList){
        Objects.requireNonNull(planID);
        Objects.requireNonNull(elementoIDList);
        appendChange(new ElementoIDdeUnPlanAgregado(planID,elementoIDList)).apply();
    }
    public void agregarMaquinaIDdeUnPlan(PlanID planID,List<MaquinaID> maquinaIDList){
        Objects.requireNonNull(planID);
        Objects.requireNonNull(maquinaIDList);
        appendChange(new MaquinaIDdeUnPlanAgregado(planID,maquinaIDList)).apply();
    }
    public void actualizarRepeticionesdeUnPlan(PlanID planID,Repeticiones repeticiones){
        Objects.requireNonNull(planID);
        Objects.requireNonNull(repeticiones);
        appendChange(new RepeticionesdeUnPlanActualizada(planID,repeticiones)).apply();
    }
    public void actualizarNutricionistaIDdeUnPlan(PlanID planID,NutricionistaID nutricionistaID){
        Objects.requireNonNull(planID);
        Objects.requireNonNull(nutricionistaID);
        appendChange(new NutricionistaIDdeUnPlanActualizado(planID,nutricionistaID)).apply();
    }

    public void actualizarEntrenadorIDdeUnaSesion(SesionID sesionID,EntrenadorID entrenadorID){
        Objects.requireNonNull(sesionID);
        Objects.requireNonNull(entrenadorID);
        appendChange(new EntrenadorIDdeUnaSesionActualizado(sesionID,entrenadorID)).apply();
    }
    public void actualizarSaladeUnaSesion(SesionID sesionID,Sala sala){
        Objects.requireNonNull(sesionID);
        Objects.requireNonNull(sala);
        appendChange(new SaladeUnaSesionActualizado(sesionID,sala)).apply();
    }
    public void actualizarFechadeUnaSesion(SesionID sesionID,Fecha fecha){
        Objects.requireNonNull(sesionID);
        Objects.requireNonNull(fecha);
        appendChange(new FechadeUnaSesionActualizado(sesionID,fecha)).apply();
    }
    public void actualizarDuraciondeUnaSesion(SesionID sesionID,Duracion duracion){
        Objects.requireNonNull(sesionID);
        Objects.requireNonNull(duracion);
        appendChange(new DuraciondeUnaSesionActualizado(sesionID,duracion)).apply();
    }
    public void agregarElementoIDdeUnaSesion(SesionID sesionID,List<ElementoID> elementoIDList){
        Objects.requireNonNull(sesionID);
        Objects.requireNonNull(elementoIDList);
        appendChange(new ElementoIDdeUnaSesionActualizado(sesionID,elementoIDList)).apply();
    }

    public UsuarioID usuarioID() {
        return usuarioID;
    }

    public List<Sesion> sesiones() {
        return sesiones;
    }

    public List<Plan> planes() {
        return planes;
    }
}
