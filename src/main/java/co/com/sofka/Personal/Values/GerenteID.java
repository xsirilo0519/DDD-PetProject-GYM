package co.com.sofka.Personal.Values;

import co.com.sofka.Entrenamiento.Values.PlanID;
import co.com.sofka.domain.generic.Identity;

public class GerenteID extends Identity {
    public GerenteID() {

    }

    private GerenteID(String id) {
        super(id);
    }

    public static GerenteID of(String id) {
        return new GerenteID(id);

    }
}
