package co.com.sofka.Personal.Commands;

import co.com.sofka.Generic.NutricionistaID;
import co.com.sofka.Personal.Values.GerenteID;
import co.com.sofka.Personal.Values.Nombre;
import co.com.sofka.Personal.Values.PersonalID;
import co.com.sofka.domain.generic.Command;

public class ActualizarNombredeUnGerente extends Command {

    private final PersonalID personalID;
    private final GerenteID gerenteID;
    private final Nombre nombre;

    public ActualizarNombredeUnGerente(PersonalID personalID, GerenteID gerenteID, Nombre nombre) {
        this.personalID = personalID;
        this.gerenteID = gerenteID;
        this.nombre = nombre;
    }

    public PersonalID getPersonalID() {
        return personalID;
    }

    public GerenteID getGerenteID() {
        return gerenteID;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
