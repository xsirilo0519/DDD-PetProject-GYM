package co.com.sofka.Herramienta.Events;

import co.com.sofka.Generic.ElementoID;
import co.com.sofka.Generic.MaquinaID;
import co.com.sofka.Herramienta.Elemento;
import co.com.sofka.Herramienta.Values.Descripcion;
import co.com.sofka.domain.generic.DomainEvent;

public class DescripciondeElementoActualizada extends DomainEvent {
    private final ElementoID elementoID;
    private final Descripcion descripcion;

    public DescripciondeElementoActualizada(ElementoID elementoID, Descripcion descripcion) {
        super("sofka.herramienta.sescripciondeElementoActualizada");
        this.elementoID = elementoID;
        this.descripcion = descripcion;
    }

    public ElementoID getElementoID() {
        return elementoID;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }
}
