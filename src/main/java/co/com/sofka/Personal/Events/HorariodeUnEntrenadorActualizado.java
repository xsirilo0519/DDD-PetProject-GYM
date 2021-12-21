package co.com.sofka.Personal.Events;

import co.com.sofka.Generic.EntrenadorID;
import co.com.sofka.Personal.Values.Horario;
import co.com.sofka.Personal.Values.Nombre;
import co.com.sofka.domain.generic.DomainEvent;

public class HorariodeUnEntrenadorActualizado extends DomainEvent {
    private final EntrenadorID entrenadorID;
    private final Horario horario;

    public HorariodeUnEntrenadorActualizado( EntrenadorID entrenadorID, Horario horario) {
        super("sofka.personal.horariodeUnEntrenadorActualizado");
        this.entrenadorID = entrenadorID;
        this.horario = horario;
    }

    public EntrenadorID getEntrenadorID() {
        return entrenadorID;
    }

    public Horario getHorario() {
        return horario;
    }
}
