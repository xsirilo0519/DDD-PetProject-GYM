package co.com.sofka.Personal.Events;

import co.com.sofka.Generic.EntrenadorID;
import co.com.sofka.Generic.NutricionistaID;
import co.com.sofka.Personal.Nutricionista;
import co.com.sofka.Personal.Values.Telefono;
import co.com.sofka.domain.generic.DomainEvent;

public class TelefonodeUnNutricionistaActualizado extends DomainEvent {
    private final NutricionistaID nutricionistaID;
    private final Telefono telefono;

    public TelefonodeUnNutricionistaActualizado(NutricionistaID nutricionistaID, Telefono telefono) {
        super("sofka.personal.telefonodeUnNutricionistaActualizado");
        this.nutricionistaID = nutricionistaID;
        this.telefono = telefono;
    }

    public NutricionistaID getNutricionistaID() {
        return nutricionistaID;
    }

    public Telefono getTelefono() {
        return telefono;
    }
}
