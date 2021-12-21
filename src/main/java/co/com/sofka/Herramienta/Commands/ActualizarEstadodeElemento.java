package co.com.sofka.Herramienta.Commands;

import co.com.sofka.Generic.ElementoID;
import co.com.sofka.Generic.MaquinaID;
import co.com.sofka.Herramienta.Values.Estado;
import co.com.sofka.Herramienta.Values.HerramientaID;
import co.com.sofka.domain.generic.Command;

public class ActualizarEstadodeElemento extends Command {
    private final HerramientaID herramientaID;
    private final ElementoID elementoID;
    private final Estado estado;

    public ActualizarEstadodeElemento(HerramientaID herramientaID, ElementoID elementoID, Estado estado) {
        this.herramientaID = herramientaID;
        this.elementoID = elementoID;
        this.estado = estado;
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
}
