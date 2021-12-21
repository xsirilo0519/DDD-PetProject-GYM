package co.com.sofka.Personal.Events;

import co.com.sofka.Generic.EntrenadorID;
import co.com.sofka.Personal.Values.GerenteID;
import co.com.sofka.Personal.Values.Horario;
import co.com.sofka.domain.generic.DomainEvent;

public class HorariodeUnGerenteActualizado extends DomainEvent {
    private final GerenteID gerenteID;
    private final Horario horario;

    public HorariodeUnGerenteActualizado( GerenteID gerenteID, Horario horario) {
        super("sofka.personal.horariodeUnGerenteActualizado");
        this.gerenteID = gerenteID;
        this.horario = horario;
    }

    public GerenteID getGerenteID() {
        return gerenteID;
    }

    public Horario getHorario() {
        return horario;
    }
}
