package co.com.sofka.Personal.Commands;

import co.com.sofka.Generic.NutricionistaID;
import co.com.sofka.Personal.Values.Horario;
import co.com.sofka.Personal.Values.Nombre;
import co.com.sofka.Personal.Values.PersonalID;
import co.com.sofka.Personal.Values.Telefono;
import co.com.sofka.domain.generic.Command;

public class AgregarNutricionista extends Command {
    private final PersonalID personalID;
    private final NutricionistaID nutricionistaID;
    private final Horario horario;
    private final Nombre nombre;
    private final Telefono telefono;

    public AgregarNutricionista(PersonalID personalID, NutricionistaID nutricionistaID, Horario horario, Nombre nombre, Telefono telefono) {
        this.personalID = personalID;
        this.nutricionistaID = nutricionistaID;
        this.horario = horario;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public PersonalID getPersonalID() {
        return personalID;
    }

    public NutricionistaID getNutricionistaID() {
        return nutricionistaID;
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
