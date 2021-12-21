package co.com.sofka.Personal.Commands;

import co.com.sofka.Generic.NutricionistaID;
import co.com.sofka.Personal.Values.GerenteID;
import co.com.sofka.Personal.Values.Horario;
import co.com.sofka.Personal.Values.PersonalID;
import co.com.sofka.domain.generic.Command;

public class ActualizarHorariodeUnGerente extends Command {
    private final PersonalID personalID;
    private final GerenteID gerenteID;
    private final Horario horario;

    public ActualizarHorariodeUnGerente(PersonalID personalID, GerenteID gerenteID, Horario horario) {
        this.personalID = personalID;
        this.gerenteID = gerenteID;
        this.horario = horario;
    }

    public PersonalID getPersonalID() {
        return personalID;
    }

    public GerenteID getNutricionistaID() {
        return gerenteID;
    }

    public Horario getHorario() {
        return horario;
    }

}
