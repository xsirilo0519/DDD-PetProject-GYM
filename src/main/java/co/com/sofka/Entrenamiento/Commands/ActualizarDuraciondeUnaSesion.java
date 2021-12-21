package co.com.sofka.Entrenamiento.Commands;

import co.com.sofka.Entrenamiento.Values.Duracion;
import co.com.sofka.Entrenamiento.Values.EntrenamientoID;
import co.com.sofka.Entrenamiento.Values.SesionID;
import co.com.sofka.domain.generic.Command;

public class ActualizarDuraciondeUnaSesion extends Command {
    private final EntrenamientoID entrenamientoID;
    private final SesionID sesionID;
    private final Duracion duracion;

    public ActualizarDuraciondeUnaSesion(EntrenamientoID entrenamientoID, SesionID sesionID, Duracion duracion) {
        this.entrenamientoID = entrenamientoID;
        this.sesionID = sesionID;
        this.duracion = duracion;
    }

    public EntrenamientoID getEntrenamientoID() {
        return entrenamientoID;
    }

    public SesionID getSesionID() {
        return sesionID;
    }

    public Duracion getDuracion() {
        return duracion;
    }
}
