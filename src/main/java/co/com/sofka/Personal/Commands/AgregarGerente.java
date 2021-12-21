package co.com.sofka.Personal.Commands;

import co.com.sofka.Generic.EntrenadorID;
import co.com.sofka.Personal.Values.*;
import co.com.sofka.domain.generic.Command;

public class AgregarGerente extends Command {
    private final PersonalID personalID;
    private final GerenteID gerenteID;
    private final Horario horario;
    private final Nombre nombre;
    private final Telefono telefono;

    public AgregarGerente(PersonalID personalID, GerenteID gerenteID, Horario horario, Nombre nombre, Telefono telefono) {
        this.personalID = personalID;
        this.gerenteID = gerenteID;
        this.horario = horario;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public PersonalID getPersonalID() {
        return personalID;
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
