package co.com.sofka.Personal.Events;

import co.com.sofka.Generic.EntrenadorID;
import co.com.sofka.Personal.Values.Horario;
import co.com.sofka.Personal.Values.Telefono;
import co.com.sofka.domain.generic.DomainEvent;

public class TelefonodeUnEntrenadorActualizado extends DomainEvent {
    private final EntrenadorID entrenadorID;
    private final Telefono telefono;

    public TelefonodeUnEntrenadorActualizado( EntrenadorID entrenadorID, Telefono telefono) {
        super("sofka.personal.telefonodeUnEntrenadorActualizado");
        this.entrenadorID = entrenadorID;
        this.telefono = telefono;
    }

    public EntrenadorID getEntrenadorID() {
        return entrenadorID;
    }

    public Telefono getTelefono() {
        return telefono;
    }
}
