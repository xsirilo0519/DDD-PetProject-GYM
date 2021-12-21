package co.com.sofka.Personal.Events;

import co.com.sofka.Generic.EntrenadorID;
import co.com.sofka.Generic.NutricionistaID;
import co.com.sofka.Personal.Values.Horario;
import co.com.sofka.Personal.Values.Nombre;
import co.com.sofka.Personal.Values.Telefono;
import co.com.sofka.domain.generic.DomainEvent;

public class EntrenadorAgregado extends DomainEvent {
    private final EntrenadorID entrenadorID;
    private final Horario horario;
    private final Nombre nombre;
    private final Telefono telefono;

    public EntrenadorAgregado(EntrenadorID entrenadorID, Horario horario, Nombre nombre, Telefono telefono) {
        super("sofka.personal.entrenadorAgregado");
        this.entrenadorID = entrenadorID;
        this.horario = horario;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public EntrenadorID getEntrenadorID() {
        return entrenadorID;
    }

    public Horario getHorario() {
        return horario;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Telefono getTelefono() {
        return telefono;
    }
}
