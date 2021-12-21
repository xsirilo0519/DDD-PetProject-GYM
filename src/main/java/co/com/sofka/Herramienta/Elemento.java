package co.com.sofka.Herramienta;

import co.com.sofka.Generic.ElementoID;
import co.com.sofka.Generic.MaquinaID;
import co.com.sofka.Herramienta.Values.Descripcion;
import co.com.sofka.Herramienta.Values.Estado;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Elemento extends Entity<ElementoID> {
    private Estado estado;
    private Descripcion descripcion;

    public Elemento(ElementoID elementoID, Estado estado, Descripcion descripcion) {
        super(elementoID);
        this.estado = estado;
        this.descripcion = descripcion;
    }

    public void actualizarEstado(Estado estado){
        this.estado= Objects.requireNonNull(estado);
    }
    public void actualizarDescripcion(Descripcion descripcion){
        this.descripcion= Objects.requireNonNull(descripcion);
    }

    public Estado estado() {
        return estado;
    }

    public Descripcion descripcion() {
        return descripcion;
    }
}
