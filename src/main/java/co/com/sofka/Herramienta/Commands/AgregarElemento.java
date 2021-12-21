package co.com.sofka.Herramienta.Commands;

import co.com.sofka.Generic.ElementoID;
import co.com.sofka.Generic.MaquinaID;
import co.com.sofka.Herramienta.Elemento;
import co.com.sofka.Herramienta.Values.Descripcion;
import co.com.sofka.Herramienta.Values.Estado;
import co.com.sofka.Herramienta.Values.HerramientaID;
import co.com.sofka.domain.generic.Command;

public class AgregarElemento extends Command {
    private final HerramientaID herramientaID;
    private final ElementoID elementoID;
    private final Estado estado;
    private final Descripcion descripcion;

    public AgregarElemento(HerramientaID herramientaID, ElementoID elementoID, Estado estado, Descripcion descripcion) {
        this.herramientaID = herramientaID;
        this.elementoID = elementoID;
        this.estado = estado;
        this.descripcion = descripcion;
    }

    public HerramientaID getHerramientaID() {
        return herramientaID;
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
