package co.com.sofka.Herramienta.Commands;

import co.com.sofka.Generic.ElementoID;
import co.com.sofka.Generic.MaquinaID;
import co.com.sofka.Herramienta.Values.Descripcion;
import co.com.sofka.Herramienta.Values.Estado;
import co.com.sofka.Herramienta.Values.HerramientaID;
import co.com.sofka.domain.generic.Command;

public class ActualizarDescripciondeMaquina extends Command {
    private final HerramientaID herramientaID;
    private final MaquinaID maquinaID;
    private final Descripcion descripcion;

    public ActualizarDescripciondeMaquina(HerramientaID herramientaID, MaquinaID maquinaID, Descripcion descripcion) {
        this.herramientaID = herramientaID;
        this.maquinaID = maquinaID;
        this.descripcion = descripcion;
    }

    public HerramientaID getHerramientaID() {
        return herramientaID;
    }

    public MaquinaID getMaquinaID() {
        return maquinaID;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }
}
