package co.com.sofka.Herramienta.Events;

import co.com.sofka.Generic.ElementoID;
import co.com.sofka.Generic.MaquinaID;
import co.com.sofka.Herramienta.Values.Estado;
import co.com.sofka.domain.generic.DomainEvent;

public class EstadodeElementoActualizado extends DomainEvent {
    private final ElementoID elementoID;
    private final Estado estado;

    public EstadodeElementoActualizado(ElementoID elementoID, Estado estado) {
        super("sofka.herramienta.estadodeElementoActualizado");
        this.elementoID = elementoID;
        this.estado = estado;
    }

    public ElementoID getElementoID() {
        return elementoID;
    }

    public Estado getEstado() {
        return estado;
    }
}
