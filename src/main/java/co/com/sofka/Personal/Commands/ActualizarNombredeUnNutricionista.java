package co.com.sofka.Personal.Commands;

import co.com.sofka.Generic.EntrenadorID;
import co.com.sofka.Generic.NutricionistaID;
import co.com.sofka.Personal.Values.Nombre;
import co.com.sofka.Personal.Values.PersonalID;
import co.com.sofka.domain.generic.Command;

public class ActualizarNombredeUnNutricionista extends Command {
    private final PersonalID personalID;
    private final NutricionistaID nutricionistaID;
    private final Nombre nombre;

    public ActualizarNombredeUnNutricionista(PersonalID personalID, NutricionistaID nutricionistaID, Nombre nombre) {
        this.personalID = personalID;
        this.nutricionistaID = nutricionistaID;
        this.nombre = nombre;
    }

    public PersonalID getPersonalID() {
        return personalID;
    }

    public NutricionistaID getNutricionistaID() {
        return nutricionistaID;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
