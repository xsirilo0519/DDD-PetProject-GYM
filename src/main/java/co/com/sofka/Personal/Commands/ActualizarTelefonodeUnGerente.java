package co.com.sofka.Personal.Commands;

import co.com.sofka.Generic.EntrenadorID;
import co.com.sofka.Personal.Values.GerenteID;
import co.com.sofka.Personal.Values.PersonalID;
import co.com.sofka.Personal.Values.Telefono;
import co.com.sofka.domain.generic.Command;

public class ActualizarTelefonodeUnGerente extends Command {
    private final PersonalID personalID;
    private final GerenteID gerenteID;
    private final Telefono telefono;

    public ActualizarTelefonodeUnGerente(PersonalID personalID, GerenteID gerenteID, Telefono telefono) {
        this.personalID = personalID;
        this.gerenteID = gerenteID;
        this.telefono = telefono;
    }

    public PersonalID getPersonalID() {
        return personalID;
    }

    public GerenteID getGerenteID() {
        return gerenteID;
    }

    public Telefono getTelefono() {
        return telefono;
    }
}
