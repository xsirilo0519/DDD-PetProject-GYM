package co.com.sofka.Personal.Events;

import co.com.sofka.Generic.EntrenadorID;
import co.com.sofka.Generic.NutricionistaID;
import co.com.sofka.Personal.Values.Horario;
import co.com.sofka.domain.generic.DomainEvent;

public class HorariodeUnNutricionistaActualizado extends DomainEvent {
    private final NutricionistaID nutricionistaID;
    private final Horario horario;

    public HorariodeUnNutricionistaActualizado( NutricionistaID nutricionistaID, Horario horario) {
        super("sofka.personal.horariodeUnNutricionistaActualizado");
        this.nutricionistaID = nutricionistaID;
        this.horario = horario;
    }

    public NutricionistaID getNutricionistaID() {
        return nutricionistaID;
    }

    public Horario getHorario() {
        return horario;
    }
}
