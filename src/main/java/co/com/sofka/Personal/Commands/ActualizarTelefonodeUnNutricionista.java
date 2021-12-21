package co.com.sofka.Personal.Commands;

import co.com.sofka.Generic.EntrenadorID;
import co.com.sofka.Generic.NutricionistaID;
import co.com.sofka.Personal.Values.PersonalID;
import co.com.sofka.Personal.Values.Telefono;
import co.com.sofka.domain.generic.Command;

public class ActualizarTelefonodeUnNutricionista extends Command {
    private final PersonalID personalID;
    private final NutricionistaID nutricionistaID;
    private final Telefono telefono;

    public ActualizarTelefonodeUnNutricionista(PersonalID personalID, NutricionistaID nutricionistaID, Telefono telefono) {
        this.personalID = personalID;
        this.nutricionistaID = nutricionistaID;
        this.telefono = telefono;
    }

    public PersonalID getPersonalID() {
        return personalID;
    }

    public NutricionistaID getNutricionistaID() {
        return nutricionistaID;
    }

    public Telefono getTelefono() {
        return telefono;
    }
}
