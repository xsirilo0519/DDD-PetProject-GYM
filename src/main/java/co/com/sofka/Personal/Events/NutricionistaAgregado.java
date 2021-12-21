package co.com.sofka.Personal.Events;

import co.com.sofka.Generic.NutricionistaID;
import co.com.sofka.Personal.Values.Horario;
import co.com.sofka.Personal.Values.Nombre;
import co.com.sofka.Personal.Values.Telefono;
import co.com.sofka.domain.generic.DomainEvent;

public class NutricionistaAgregado extends DomainEvent {
    private final NutricionistaID nutricionistaID;
    private final Horario horario;
    private final Nombre nombre;
    private final Telefono telefono;

    public NutricionistaAgregado(NutricionistaID nutricionistaID, Horario horario, Nombre nombre, Telefono telefono) {
        super("sofka.personal.nutricionistaAgregado");
        this.nutricionistaID = nutricionistaID;
        this.horario = horario;
        this.nombre = nombre;
        this.telefono = telefono;
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
