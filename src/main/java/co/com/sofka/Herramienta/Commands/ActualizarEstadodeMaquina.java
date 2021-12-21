package co.com.sofka.Herramienta.Commands;

import co.com.sofka.Generic.MaquinaID;
import co.com.sofka.Herramienta.Values.Estado;
import co.com.sofka.Herramienta.Values.HerramientaID;
import co.com.sofka.domain.generic.Command;

public class ActualizarEstadodeMaquina extends Command {
    private final HerramientaID herramientaID;
    private final MaquinaID maquinaID;
    private final Estado estado;

    public ActualizarEstadodeMaquina(HerramientaID herramientaID, MaquinaID maquinaID, Estado estado) {
        this.herramientaID = herramientaID;
        this.maquinaID = maquinaID;
        this.estado = estado;
    }

    public HerramientaID getHerramientaID() {
        return herramientaID;
    }

    public MaquinaID getMaquinaID() {
        return maquinaID;
    }

    public Estado getEstado() {
        return estado;
    }
}
