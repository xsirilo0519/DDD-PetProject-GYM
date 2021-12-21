package co.com.sofka.Personal.Commands;

import co.com.sofka.Generic.EntrenadorID;
import co.com.sofka.Generic.NutricionistaID;
import co.com.sofka.Personal.Values.Horario;
import co.com.sofka.Personal.Values.PersonalID;
import co.com.sofka.domain.generic.Command;

public class ActualizarHorariodeUnNutricionista extends Command {
    private final PersonalID personalID;
    private final NutricionistaID nutricionistaID;
    private final Horario horario;

    public ActualizarHorariodeUnNutricionista(PersonalID personalID, NutricionistaID nutricionistaID, Horario horario) {
        this.personalID = personalID;
        this.nutricionistaID = nutricionistaID;
        this.horario = horario;
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
}
