package co.com.sofka.Entrenamiento.Events;

import co.com.sofka.Entrenamiento.Values.Duracion;
import co.com.sofka.Entrenamiento.Values.Fecha;
import co.com.sofka.Entrenamiento.Values.Sala;
import co.com.sofka.Entrenamiento.Values.SesionID;
import co.com.sofka.Generic.ElementoID;
import co.com.sofka.Generic.EntrenadorID;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;

public class SesionAgregada extends DomainEvent {
    private final SesionID sesionID;
    private final EntrenadorID entrenadorID;
    private final Sala sala;
    private final Fecha fecha;
    private final Duracion duracion;

    public SesionAgregada(SesionID sesionID, EntrenadorID entrenadorID, Sala sala, Fecha fecha, Duracion duracion) {
        super("sofka.entrenamiento.sesionAgregada");
        this.sesionID=sesionID;
        this.entrenadorID=entrenadorID;
        this.sala=sala;
        this.fecha=fecha;
        this.duracion=duracion;
    }

    public SesionID getSesionID() {
        return sesionID;
    }

    public EntrenadorID getEntrenadorID() {
        return entrenadorID;
    }

    public Sala getSala() {
        return sala;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public Duracion getDuracion() {
        return duracion;
    }
}
