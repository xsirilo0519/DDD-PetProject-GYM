package co.com.sofka.Entrenamiento.Events;

import co.com.sofka.Entrenamiento.Values.Duracion;
import co.com.sofka.Entrenamiento.Values.SesionID;
import co.com.sofka.Generic.ElementoID;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;

public class ElementoIDdeUnaSesionActualizado extends DomainEvent {
    private final SesionID sesionID;
    private final List<ElementoID> elementoIDList;
    public ElementoIDdeUnaSesionActualizado(SesionID sesionID, List<ElementoID> elementoIDList) {
        super("sofka.entrenamiento.elementoIDdeUnaSesionActualizado");
        this.sesionID=sesionID;
        this.elementoIDList=elementoIDList;
    }

    public SesionID getSesionID() {
        return sesionID;
    }

    public List<ElementoID> getElementoIDList() {
        return elementoIDList;
    }
}
