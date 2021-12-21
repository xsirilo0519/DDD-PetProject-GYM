package co.com.sofka.Personal.Events;

import co.com.sofka.Generic.EntrenadorID;
import co.com.sofka.Personal.Values.GerenteID;
import co.com.sofka.Personal.Values.Horario;
import co.com.sofka.Personal.Values.Nombre;
import co.com.sofka.Personal.Values.Telefono;
import co.com.sofka.domain.generic.DomainEvent;

public class GerenteAgregado extends DomainEvent {
    private final GerenteID gerenteID;
    private final Horario horario;
    private final Nombre nombre;
    private final Telefono telefono;

    public GerenteAgregado(GerenteID gerenteID, Horario horario, Nombre nombre, Telefono telefono) {
        super("sofka.personal.gerenteAgregado");
        this.gerenteID = gerenteID;
        this.horario = horario;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public GerenteID getGerenteID() {
        return gerenteID;
    }

    public Horario getHorario() {
        return horario;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Telefono getTelefono() {
        return telefono;
    }
}
