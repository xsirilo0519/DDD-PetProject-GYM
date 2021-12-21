package co.com.sofka.Herramienta.Events;

import co.com.sofka.Generic.MaquinaID;
import co.com.sofka.Herramienta.Maquina;
import co.com.sofka.Herramienta.Values.Descripcion;
import co.com.sofka.Herramienta.Values.Estado;
import co.com.sofka.domain.generic.DomainEvent;

public class MaquinaAgregada extends DomainEvent {
    private final MaquinaID maquinaID;
    private final Estado estado;
    private final Descripcion descripcion;

    public MaquinaAgregada(MaquinaID maquinaID, Estado estado, Descripcion descripcion) {
        super("sofka.herramienta.maquinaAgregada");
        this.maquinaID = maquinaID;
        this.estado = estado;
        this.descripcion = descripcion;
    }

    public MaquinaID getMaquinaID() {
        return maquinaID;
    }

    public Estado getEstado() {
        return estado;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }
}
