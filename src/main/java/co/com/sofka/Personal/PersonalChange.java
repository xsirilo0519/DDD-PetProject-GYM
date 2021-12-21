package co.com.sofka.Personal;

import co.com.sofka.Entrenamiento.Entrenamiento;
import co.com.sofka.Entrenamiento.Events.EntrenamientoCreado;
import co.com.sofka.Entrenamiento.Events.FechadeUnPlanActualizada;
import co.com.sofka.Entrenamiento.Events.PlanAgregado;
import co.com.sofka.Entrenamiento.Plan;
import co.com.sofka.Personal.Events.*;
import co.com.sofka.domain.generic.EventChange;

import java.util.ArrayList;

public class PersonalChange extends EventChange {
    public PersonalChange(Personal personal) {

        apply((PersonalCreado event)->{
            personal.entrenamientoID=event.getEntrenamientoID();
            personal.entrenadorList=new ArrayList<>();
            personal.nutricionistaList=new ArrayList<>();
        });

        apply((GerenteAgregado event)->{
            personal.gerente=new Gerente(event.getGerenteID()
                    ,event.getHorario(),
                    event.getNombre(),
                    event.getTelefono());
        });

        apply((EntrenadorAgregado event)->{
            personal.entrenadorList.add(new Entrenador(event.getEntrenadorID(),
                    event.getHorario(),
                    event.getNombre(),
                    event.getTelefono()));
        });

        apply((NutricionistaAgregado event)->{
            personal.nutricionistaList.add(new Nutricionista(event.getNutricionistaID(),
                    event.getHorario(),
                    event.getNombre(),
                    event.getTelefono()));
        });


        apply((NombredeUnEntrenadorActualizado event)->{
            var Entrenador=personal.getEntrenadorPorId(event.getEntrenadorID())
                    .orElseThrow(()->new IllegalArgumentException("No se encontro el entrenador"));
            Entrenador.actualizarNombre(event.getNombre());
        });
        apply((HorariodeUnEntrenadorActualizado event)->{
            var Entrenador=personal.getEntrenadorPorId(event.getEntrenadorID())
                    .orElseThrow(()->new IllegalArgumentException("No se encontro el entrenador"));
            Entrenador.actualizarHorario(event.getHorario());
        });
        apply((TelefonodeUnEntrenadorActualizado event)->{
            var Entrenador=personal.getEntrenadorPorId(event.getEntrenadorID())
                    .orElseThrow(()->new IllegalArgumentException("No se encontro el entrenador"));
            Entrenador.actualizarTelefono(event.getTelefono());
        });

        apply((NombredeUnNutricionistaActualizado event)->{
            var nutricionista=personal.getNutricionistaPorId(event.getNutricionistaID())
                    .orElseThrow(()->new IllegalArgumentException("No se encontro el nutricionista"));
            nutricionista.actualizarNombre(event.getNombre());
        });

        apply((HorariodeUnNutricionistaActualizado event)->{
            var nutricionista=personal.getNutricionistaPorId(event.getNutricionistaID())
                    .orElseThrow(()->new IllegalArgumentException("No se encontro el nutricionista"));
            nutricionista.actualizarHorario(event.getHorario());
        });

        apply((TelefonodeUnNutricionistaActualizado event)->{
            var nutricionista=personal.getNutricionistaPorId(event.getNutricionistaID())
                    .orElseThrow(()->new IllegalArgumentException("No se encontro el nutricionista"));
            nutricionista.actualizarTelefono(event.getTelefono());
        });

        apply((NombredeUnGerenteActualizado event)->{
          personal.gerente.actualizarNombre(event.getNombre());
        });
        apply((HorariodeUnGerenteActualizado event)->{
            personal.gerente.actualizarHorario(event.getHorario());
        });
        apply((TelefonodeUnGerenteActualizado event)->{
            personal.gerente.actualizarTelefono(event.getTelefono());
        });
    }
}
