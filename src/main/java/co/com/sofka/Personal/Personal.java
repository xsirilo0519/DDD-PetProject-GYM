package co.com.sofka.Personal;

import co.com.sofka.Entrenamiento.Entrenamiento;
import co.com.sofka.Entrenamiento.Events.SesionAgregada;
import co.com.sofka.Entrenamiento.Plan;
import co.com.sofka.Entrenamiento.Sesion;
import co.com.sofka.Entrenamiento.Values.*;
import co.com.sofka.Generic.EntrenadorID;
import co.com.sofka.Generic.NutricionistaID;
import co.com.sofka.Personal.Events.*;
import co.com.sofka.Personal.Values.*;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Personal extends AggregateEvent<PersonalID> {
    protected EntrenamientoID entrenamientoID;
    protected Gerente gerente;
    protected List<Entrenador> entrenadorList;
    protected List<Nutricionista> nutricionistaList;

    public Personal(PersonalID personalID,EntrenamientoID entrenamientoID) {
        super(personalID);
        appendChange(new PersonalCreado(entrenamientoID)).apply();
    }

    private Personal(PersonalID personalID){
        super(personalID);
        subscribe(new PersonalChange(this));
    }
    //recrear eventos y obtener agregados que ya existen
    public static Personal from(PersonalID personalID, List<DomainEvent> events){
        var Personal=new Personal(personalID);
        events.forEach(Personal::applyEvent);
        return Personal;
    }
    public void agregarNutricionista(NutricionistaID nutricionistaID, Horario horario, Nombre nombre, Telefono telefono){
        Objects.requireNonNull(nutricionistaID);
        Objects.requireNonNull(horario);
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(telefono);
        appendChange(new NutricionistaAgregado(nutricionistaID,horario,nombre,telefono)).apply();
    }
    public void agregarEntrenador(EntrenadorID entrenadorID, Horario horario, Nombre nombre, Telefono telefono){
        Objects.requireNonNull(entrenadorID);
        Objects.requireNonNull(horario);
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(telefono);
        appendChange(new EntrenadorAgregado(entrenadorID,horario,nombre,telefono)).apply();
    }
    public void agregarGerente(GerenteID gerenteID, Horario horario, Nombre nombre, Telefono telefono){
        Objects.requireNonNull(gerenteID);
        Objects.requireNonNull(horario);
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(telefono);
        appendChange(new GerenteAgregado(gerenteID,horario,nombre,telefono)).apply();
    }

    public void actualizarNombredeUnEntrenador(EntrenadorID entrenadorID,Nombre nombre){
        Objects.requireNonNull(entrenadorID);
        Objects.requireNonNull(nombre);
        appendChange(new NombredeUnEntrenadorActualizado(entrenadorID,nombre)).apply();
    }
    public void actualizarNombredeUnNutricionista(NutricionistaID nutricionistaID,Nombre nombre){
        Objects.requireNonNull(nutricionistaID);
        Objects.requireNonNull(nombre);
        appendChange(new NombredeUnNutricionistaActualizado(nutricionistaID,nombre)).apply();
    }
    public void actualizarNombredeUnGerente(GerenteID gerenteID,Nombre nombre){
        Objects.requireNonNull(gerenteID);
        Objects.requireNonNull(nombre);
        appendChange(new NombredeUnGerenteActualizado(gerenteID,nombre)).apply();
    }
    public void actualizarHorariodeUnEntrenador(EntrenadorID entrenadorID,Horario horario){
        Objects.requireNonNull(entrenadorID);
        Objects.requireNonNull(horario);
        appendChange(new HorariodeUnEntrenadorActualizado(entrenadorID,horario)).apply();
    }
    public void actualizarHorariodeUnNutricionista(NutricionistaID nutricionistaID,Horario horario){
        Objects.requireNonNull(nutricionistaID);
        Objects.requireNonNull(horario);
        appendChange(new HorariodeUnNutricionistaActualizado(nutricionistaID,horario)).apply();
    }
    public void actualizarHorariodeUnGerente(GerenteID gerenteID,Horario horario){
        Objects.requireNonNull(gerenteID);
        Objects.requireNonNull(horario);
        appendChange(new HorariodeUnGerenteActualizado(gerenteID,horario)).apply();
    }
    public void actualizarTelefonodeUnEntrenador(EntrenadorID entrenadorID,Telefono telefono){
        Objects.requireNonNull(entrenadorID);
        Objects.requireNonNull(telefono);
        appendChange(new TelefonodeUnEntrenadorActualizado(entrenadorID,telefono)).apply();
    }
    public void actualizarTelefonodeUnNutricionista(NutricionistaID nutricionistaID,Telefono telefono){
        Objects.requireNonNull(nutricionistaID);
        Objects.requireNonNull(telefono);
        appendChange(new TelefonodeUnNutricionistaActualizado(nutricionistaID,telefono)).apply();
    }
    public void actualizarTelefonodeUnGerente(GerenteID gerenteID,Telefono telefono){
        Objects.requireNonNull(gerenteID);
        Objects.requireNonNull(telefono);
        appendChange(new TelefonodeUnGerenteActualizado(gerenteID,telefono)).apply();
    }

    public Optional<Nutricionista> getNutricionistaPorId(NutricionistaID nutricionistaID){
        return nutricionistaList.stream().filter(nutri->nutri.identity().equals(nutricionistaID)).findFirst();
    }

    public Optional<Entrenador> getEntrenadorPorId(EntrenadorID entrenadorID){
        return entrenadorList.stream().filter(entre->entre.identity().equals(entrenadorID)).findFirst();
    }

}
