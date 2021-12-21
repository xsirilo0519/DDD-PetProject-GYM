package co.com.sofka.Herramienta.Events;

import co.com.sofka.Generic.ElementoID;
import co.com.sofka.Generic.MaquinaID;
import co.com.sofka.Herramienta.Values.Descripcion;
import co.com.sofka.Herramienta.Values.Estado;
import co.com.sofka.domain.generic.DomainEvent;

public class ElementoAgregado extends DomainEvent {
    private final ElementoID elementoID;
    private final Estado estado;
    private final Descripcion descripcion;

    public ElementoAgregado(ElementoID elementoID, Estado estado, Descripcion descripcion) {
        super("sofka.herramienta.elementoAgregado");
        this.elementoID = elementoID;
        this.estado = estado;
        this.descripcion = descripcion;
    }

    public ElementoID getElementoID() {
        return elementoID;
    }

    public Estado getEstado() {
        return estado;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }
}
