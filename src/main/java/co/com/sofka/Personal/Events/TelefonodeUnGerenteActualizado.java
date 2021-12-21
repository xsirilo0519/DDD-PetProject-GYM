package co.com.sofka.Personal.Events;

import co.com.sofka.Generic.NutricionistaID;
import co.com.sofka.Personal.Values.GerenteID;
import co.com.sofka.Personal.Values.Telefono;
import co.com.sofka.domain.generic.DomainEvent;

public class TelefonodeUnGerenteActualizado extends DomainEvent {
    private final GerenteID gerenteID;
    private final Telefono telefono;

    public TelefonodeUnGerenteActualizado(GerenteID gerenteID, Telefono telefono) {
        super("sofka.personal.TtlefonodeUnGerenteActualizado");
        this.gerenteID = gerenteID;
        this.telefono = telefono;
    }

    public GerenteID getGerenteID() {
        return gerenteID;
    }

    public Telefono getTelefono() {
        return telefono;
    }
}
