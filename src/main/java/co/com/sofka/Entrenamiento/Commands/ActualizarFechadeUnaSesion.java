package co.com.sofka.Entrenamiento.Commands;

import co.com.sofka.Entrenamiento.Values.EntrenamientoID;
import co.com.sofka.Entrenamiento.Values.Fecha;
import co.com.sofka.Entrenamiento.Values.SesionID;
import co.com.sofka.domain.generic.Command;

public class ActualizarFechadeUnaSesion extends Command {
    private final EntrenamientoID entrenamientoID;
    private final SesionID sesionID;
    private final Fecha fecha;

    public ActualizarFechadeUnaSesion(EntrenamientoID entrenamientoID, SesionID sesionID, Fecha fecha) {
        this.entrenamientoID = entrenamientoID;
        this.sesionID = sesionID;
        this.fecha = fecha;
    }

    public EntrenamientoID getEntrenamientoID() {
        return entrenamientoID;
    }

    public SesionID getSesionID() {
        return sesionID;
    }

    public Fecha getFecha() {
        return fecha;
    }
}
