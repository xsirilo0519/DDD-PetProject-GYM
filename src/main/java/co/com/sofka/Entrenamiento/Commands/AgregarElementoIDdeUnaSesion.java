package co.com.sofka.Entrenamiento.Commands;

import co.com.sofka.Entrenamiento.Values.EntrenamientoID;
import co.com.sofka.Entrenamiento.Values.SesionID;
import co.com.sofka.Generic.ElementoID;
import co.com.sofka.domain.generic.Command;

import java.util.List;

public class AgregarElementoIDdeUnaSesion extends Command {
    private final EntrenamientoID entrenamientoID;
    private final SesionID sesionID;
    private final List<ElementoID> elementoIDList;

    public AgregarElementoIDdeUnaSesion(EntrenamientoID entrenamientoID, SesionID sesionID, List<ElementoID> elementoIDList) {
        this.entrenamientoID = entrenamientoID;
        this.sesionID = sesionID;
        this.elementoIDList = elementoIDList;
    }

    public EntrenamientoID getEntrenamientoID() {
        return entrenamientoID;
    }

    public SesionID getSesionID() {
        return sesionID;
    }

    public List<ElementoID> getElementoIDList() {
        return elementoIDList;
    }
}
