package co.com.sofka.Personal.Events;

import co.com.sofka.Generic.EntrenadorID;
import co.com.sofka.Personal.Values.Nombre;
import co.com.sofka.domain.generic.DomainEvent;

public class NombredeUnEntrenadorActualizado extends DomainEvent {
    private final EntrenadorID entrenadorID;
    private final Nombre nombre;

    public NombredeUnEntrenadorActualizado( EntrenadorID entrenadorID, Nombre nombre) {
        super("sofka.personal.nombredeUnEntrenadorActualizado");
        this.entrenadorID = entrenadorID;
        this.nombre = nombre;
    }

    public EntrenadorID getEntrenadorID() {
        return entrenadorID;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
