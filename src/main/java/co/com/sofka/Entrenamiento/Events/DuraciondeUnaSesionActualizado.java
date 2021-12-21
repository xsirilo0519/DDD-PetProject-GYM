package co.com.sofka.Entrenamiento.Events;

import co.com.sofka.Entrenamiento.Values.Duracion;
import co.com.sofka.Entrenamiento.Values.Fecha;
import co.com.sofka.Entrenamiento.Values.SesionID;
import co.com.sofka.domain.generic.DomainEvent;

public class DuraciondeUnaSesionActualizado extends DomainEvent {
    private final SesionID sesionID;
    private final Duracion duracion;
    public DuraciondeUnaSesionActualizado(SesionID sesionID, Duracion duracion) {
        super("sofka.entrenamiento.duraciondeUnaSesionActualizado");
        this.sesionID=sesionID;
        this.duracion=duracion;
    }

    public SesionID getSesionID() {
        return sesionID;
    }

    public Duracion getDuracion() {
        return duracion;
    }
}
