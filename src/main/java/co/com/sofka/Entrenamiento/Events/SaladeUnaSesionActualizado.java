package co.com.sofka.Entrenamiento.Events;

import co.com.sofka.Entrenamiento.Values.Sala;
import co.com.sofka.Entrenamiento.Values.SesionID;
import co.com.sofka.Generic.EntrenadorID;
import co.com.sofka.domain.generic.DomainEvent;

public class SaladeUnaSesionActualizado extends DomainEvent {
    private final SesionID sesionID;
    private final Sala sala;
    public SaladeUnaSesionActualizado(SesionID sesionID, Sala sala) {
        super("sofka.entrenamiento.saladeUnaSesionActualizado");
        this.sesionID=sesionID;
        this.sala=sala;
    }

    public SesionID getSesionID() {
        return sesionID;
    }

    public Sala getSala() {
        return sala;
    }
}
