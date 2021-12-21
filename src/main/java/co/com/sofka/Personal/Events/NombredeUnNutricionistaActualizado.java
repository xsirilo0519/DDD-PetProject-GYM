package co.com.sofka.Personal.Events;

import co.com.sofka.Generic.EntrenadorID;
import co.com.sofka.Generic.NutricionistaID;
import co.com.sofka.Personal.Nutricionista;
import co.com.sofka.Personal.Values.Nombre;
import co.com.sofka.domain.generic.DomainEvent;

public class NombredeUnNutricionistaActualizado extends DomainEvent {
    private final NutricionistaID nutricionistaID;
    private final Nombre nombre;

    public NombredeUnNutricionistaActualizado( NutricionistaID nutricionistaID, Nombre nombre) {
        super("sofka.personal.nombredeUnNutricionistaActualizado");
        this.nutricionistaID = nutricionistaID;
        this.nombre = nombre;
    }

    public NutricionistaID getNutricionistaID() {
        return nutricionistaID;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
