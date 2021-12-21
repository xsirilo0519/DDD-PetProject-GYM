package co.com.sofka.Personal.Events;

import co.com.sofka.Generic.NutricionistaID;
import co.com.sofka.Personal.Values.GerenteID;
import co.com.sofka.Personal.Values.Nombre;
import co.com.sofka.domain.generic.DomainEvent;

public class NombredeUnGerenteActualizado extends DomainEvent {
    private final GerenteID gerenteID;
    private final Nombre nombre;

    public NombredeUnGerenteActualizado( GerenteID gerenteID, Nombre nombre) {
        super("sofka.personal.nombredeUnGerenteActualizado");
        this.gerenteID = gerenteID;
        this.nombre = nombre;
    }

    public GerenteID getGerenteID() {
        return gerenteID;
    }

    public Nombre getNombre() {
        return nombre;
    }
}