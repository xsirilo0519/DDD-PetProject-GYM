package co.com.sofka.Entrenamiento.Events;

import co.com.sofka.Entrenamiento.Values.Fecha;
import co.com.sofka.Entrenamiento.Values.Sala;
import co.com.sofka.Entrenamiento.Values.SesionID;
import co.com.sofka.domain.generic.DomainEvent;

public class FechadeUnaSesionActualizado extends DomainEvent {
    private final SesionID sesionID;
    private final Fecha fecha;
    public FechadeUnaSesionActualizado(SesionID sesionID, Fecha fecha) {
        super("sofka.entrenamiento.fechadeUnaSesionActualizado");
        this.sesionID=sesionID;
        this.fecha=fecha;
    }

    public SesionID getSesionID() {
        return sesionID;
    }

    public Fecha getFecha() {
        return fecha;
    }
}
