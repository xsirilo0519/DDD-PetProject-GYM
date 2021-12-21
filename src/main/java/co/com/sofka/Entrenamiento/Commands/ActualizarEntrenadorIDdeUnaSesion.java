package co.com.sofka.Entrenamiento.Commands;

import co.com.sofka.Entrenamiento.Values.EntrenamientoID;
import co.com.sofka.Entrenamiento.Values.SesionID;
import co.com.sofka.Generic.EntrenadorID;
import co.com.sofka.domain.generic.Command;

public class ActualizarEntrenadorIDdeUnaSesion extends Command {
    private final EntrenamientoID entrenamientoID;
    private final SesionID sesionID;
    private final EntrenadorID entrenadorID;

    public ActualizarEntrenadorIDdeUnaSesion(EntrenamientoID entrenamientoID, SesionID sesionID, EntrenadorID entrenadorID) {
        this.entrenamientoID = entrenamientoID;
        this.sesionID = sesionID;
        this.entrenadorID = entrenadorID;
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
}
