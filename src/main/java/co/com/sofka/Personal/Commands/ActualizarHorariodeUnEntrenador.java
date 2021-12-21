package co.com.sofka.Personal.Commands;

import co.com.sofka.Generic.EntrenadorID;
import co.com.sofka.Personal.Values.Horario;
import co.com.sofka.Personal.Values.Nombre;
import co.com.sofka.Personal.Values.PersonalID;
import co.com.sofka.domain.generic.Command;

public class ActualizarHorariodeUnEntrenador extends Command {
    private final PersonalID personalID;
    private final EntrenadorID entrenadorID;
    private final Horario horario;

    public ActualizarHorariodeUnEntrenador(PersonalID personalID, EntrenadorID entrenadorID, Horario horario) {
        this.personalID = personalID;
        this.entrenadorID = entrenadorID;
        this.horario = horario;
    }

    public PersonalID getPersonalID() {
        return personalID;
    }

    public EntrenadorID getEntrenadorID() {
        return entrenadorID;
    }

    public Horario getHorario() {
        return horario;
    }
}
