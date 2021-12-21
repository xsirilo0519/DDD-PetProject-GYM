package co.com.sofka.Herramienta.Commands;

import co.com.sofka.Generic.ElementoID;
import co.com.sofka.Generic.MaquinaID;
import co.com.sofka.Herramienta.Values.Descripcion;
import co.com.sofka.Herramienta.Values.HerramientaID;
import co.com.sofka.domain.generic.Command;

public class ActualizarDescripciondeElemento extends Command {
    private final HerramientaID herramientaID;
    private final ElementoID elementoID;
    private final Descripcion descripcion;

    public ActualizarDescripciondeElemento(HerramientaID herramientaID, ElementoID elementoID, Descripcion descripcion) {
        this.herramientaID = herramientaID;
        this.elementoID = elementoID;
        this.descripcion = descripcion;
    }

    public HerramientaID getHerramientaID() {
        return herramientaID;
    }

    public ElementoID getElementoID() {
        return elementoID;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }
}
