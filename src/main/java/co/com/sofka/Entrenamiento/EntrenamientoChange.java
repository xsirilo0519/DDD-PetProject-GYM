package co.com.sofka.Entrenamiento;

import co.com.sofka.Entrenamiento.Events.*;
import co.com.sofka.Entrenamiento.Values.*;
import co.com.sofka.Generic.ElementoID;
import co.com.sofka.Generic.EntrenadorID;
import co.com.sofka.Generic.NutricionistaID;
import co.com.sofka.domain.generic.EventChange;
import jdk.jfr.Event;

import java.util.ArrayList;

public class EntrenamientoChange extends EventChange {
    public EntrenamientoChange(Entrenamiento entrenamiento) {

        apply((EntrenamientoCreado event)->{
            entrenamiento.usuarioID=event.getUsuarioID();
            entrenamiento.sesiones=new ArrayList<>();
            entrenamiento.planes=new ArrayList<>();
        });

        apply((SesionAgregada event)->{
            entrenamiento.sesiones.add(new Sesion(event.getSesionID(),
                    event.getEntrenadorID(),
                    event.getSala(),
                    event.getFecha(),
                    event.getDuracion()));
        });

        apply((PlanAgregado event)->{
            entrenamiento.planes.add(new Plan(event.getPlanID(),
                    event.getEntrenadorID(),
                    event.getCalentamiento(),
                    event.getFecha(),
                    event.getSeries(),
                    event.getRepeticiones(),
                    event.getNutricionistaID()));
        });

//duda
        apply((ElementoIDdeUnPlanAgregado event)->{
            Plan plan=entrenamiento.getPlanPorId(event.getPlanID())
                    .orElseThrow(()->new IllegalArgumentException("No se encontro el plan"));
            plan.agregarElementoID(event.getElementoIDList());
        });

//duda
        apply((MaquinaIDdeUnPlanAgregado event)->{
            Plan plan=entrenamiento.getPlanPorId(event.getPlanID())
                    .orElseThrow(()->new IllegalArgumentException("No se encontro el plan"));
            plan.agregarMaquinaID(event.getMaquinaIDList());
        });


        apply((SeriesdeUnPlanActualizada event)->{
            Plan plan=entrenamiento.getPlanPorId(event.getPlanID())
                    .orElseThrow(()->new IllegalArgumentException("No se encontro el plan"));
            plan.actualizarSeries(event.getSeries());

        });

        apply((RepeticionesdeUnPlanActualizada event)->{
            Plan plan=entrenamiento.getPlanPorId(event.getPlanID())
                    .orElseThrow(()->new IllegalArgumentException("No se encontro el plan"));
            plan.actualizarRepeticiones(event.getRepeticiones());
        });

        apply((RepeticionesdeUnPlanActualizada event)->{
            Plan plan=entrenamiento.getPlanPorId(event.getPlanID())
                    .orElseThrow(()->new IllegalArgumentException("No se encontro el plan"));
            plan.actualizarRepeticiones(event.getRepeticiones());
        });

        apply((NutricionistaIDdeUnPlanActualizado event)->{
            Plan plan=entrenamiento.getPlanPorId(event.getPlanID())
                    .orElseThrow(()->new IllegalArgumentException("No se encontro el plan"));
            plan.actualizarNutricionistaID(event.getNutricionistaID());
        });

        apply((FechadeUnPlanActualizada event)->{
            Plan plan=entrenamiento.getPlanPorId(event.getPlanID())
                    .orElseThrow(()->new IllegalArgumentException("No se encontro el plan"));
            plan.actualizarFecha(event.getFecha());
        });

        apply((EntrenadorIDdeUnPlanActualizado event)->{
            Plan plan=entrenamiento.getPlanPorId(event.getPlanID())
                    .orElseThrow(()->new IllegalArgumentException("No se encontro el plan"));
            plan.actualizarEntrenadorID(event.getEntrenadorID());
        });






    }
}
