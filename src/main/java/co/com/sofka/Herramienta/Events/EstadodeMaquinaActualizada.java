package co.com.sofka.Herramienta.Events;

import co.com.sofka.Generic.MaquinaID;
import co.com.sofka.Herramienta.Values.Estado;
import co.com.sofka.domain.generic.DomainEvent;

public class EstadodeMaquinaActualizada extends DomainEvent {
    private final MaquinaID maquinaID;
    private final Estado estado;

    public EstadodeMaquinaActualizada(MaquinaID maquinaID, Estado estado) {
        super("sofka.herramienta.estadodeMaquinaActualizada");
        this.maquinaID = maquinaID;
        this.estado = estado;
    }

    public MaquinaID getMaquinaID() {
        return maquinaID;
    }

    public Estado getEstado() {
        return estado;
    }
}
