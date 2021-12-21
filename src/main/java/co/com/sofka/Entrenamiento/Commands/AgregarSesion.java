package co.com.sofka.Entrenamiento.Commands;

import co.com.sofka.Entrenamiento.Values.*;
import co.com.sofka.Generic.EntrenadorID;
import co.com.sofka.domain.generic.Command;

public class AgregarSesion extends Command {
    private final EntrenamientoID entrenamientoID;
    private final SesionID sesionID;
    private final EntrenadorID entrenadorID;
    private final Sala sala;
    private final Fecha fecha;
    private final Duracion duracion;

    public AgregarSesion(EntrenamientoID entrenamientoID, SesionID sesionID, EntrenadorID entrenadorID, Sala sala, Fecha fecha, Duracion duracion) {
        this.entrenamientoID = entrenamientoID;
        this.sesionID = sesionID;
        this.entrenadorID = entrenadorID;
        this.sala = sala;
        this.fecha = fecha;
        this.duracion = duracion;
    }

    public EntrenamientoID getEntrenamientoID() {
        return entrenamientoID;
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
