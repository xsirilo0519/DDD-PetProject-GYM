package co.com.sofka.Entrenamiento.Commands;

import co.com.sofka.Entrenamiento.Values.EntrenamientoID;
import co.com.sofka.Entrenamiento.Values.Sala;
import co.com.sofka.Entrenamiento.Values.SesionID;
import co.com.sofka.domain.generic.Command;

public class ActualizarSaladeUnaSesion extends Command {
    private final EntrenamientoID entrenamientoID;
    private final SesionID sesionID;
    private final Sala sala;

    public ActualizarSaladeUnaSesion(EntrenamientoID entrenamientoID, SesionID sesionID, Sala sala) {
        this.entrenamientoID = entrenamientoID;
        this.sesionID = sesionID;
        this.sala = sala;
    }

    public EntrenamientoID getEntrenamientoID() {
        return entrenamientoID;
    }

    public SesionID getSesionID() {
        return sesionID;
    }

    public Sala getSala() {
        return sala;
    }
}
