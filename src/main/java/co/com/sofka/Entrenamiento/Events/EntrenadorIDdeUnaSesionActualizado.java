package co.com.sofka.Entrenamiento.Events;

import co.com.sofka.Entrenamiento.Values.SesionID;
import co.com.sofka.Generic.EntrenadorID;
import co.com.sofka.domain.generic.DomainEvent;

public class EntrenadorIDdeUnaSesionActualizado extends DomainEvent {
    private final SesionID sesionID;
    private final EntrenadorID entrenadorID;
    public EntrenadorIDdeUnaSesionActualizado(SesionID sesionID, EntrenadorID entrenadorID) {
        super("sofka.entrenamiento.entrenadorIDdeUnaSesionActualizado");
        this.sesionID=sesionID;
        this.entrenadorID=entrenadorID;
    }

    public SesionID getSesionID() {
        return sesionID;
    }

    public EntrenadorID getEntrenadorID() {
        return entrenadorID;
    }
}
