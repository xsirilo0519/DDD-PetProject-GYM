package co.com.sofka.Herramienta.Events;

import co.com.sofka.Generic.MaquinaID;
import co.com.sofka.Herramienta.Values.Descripcion;
import co.com.sofka.Herramienta.Values.Estado;
import co.com.sofka.domain.generic.DomainEvent;

public class DescripciondeMaquinaActualizada extends DomainEvent {
    private final MaquinaID maquinaID;
    private final Descripcion descripcion;

    public DescripciondeMaquinaActualizada(MaquinaID maquinaID, Descripcion descripcion) {
        super("sofka.herramienta.descripciondeMaquinaActualizada");
        this.maquinaID = maquinaID;
        this.descripcion = descripcion;
    }

    public MaquinaID getMaquinaID() {
        return maquinaID;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }
}
