package co.com.sofka.Herramienta.Commands;

import co.com.sofka.Generic.MaquinaID;
import co.com.sofka.Herramienta.Values.Descripcion;
import co.com.sofka.Herramienta.Values.Estado;
import co.com.sofka.Herramienta.Values.HerramientaID;
import co.com.sofka.domain.generic.Command;

public class AgregarMaquina extends Command {
    private final HerramientaID herramientaID;
    private final MaquinaID maquinaID;
    private final Estado estado;
    private final Descripcion descripcion;

    public AgregarMaquina(HerramientaID herramientaID, MaquinaID maquinaID, Estado estado, Descripcion descripcion) {
        this.herramientaID = herramientaID;
        this.maquinaID = maquinaID;
        this.estado = estado;
        this.descripcion = descripcion;
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

    public Descripcion getDescripcion() {
        return descripcion;
    }
}

