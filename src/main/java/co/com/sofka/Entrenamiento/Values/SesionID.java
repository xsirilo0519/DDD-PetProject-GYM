package co.com.sofka.Entrenamiento.Values;

import co.com.sofka.domain.generic.Identity;

public class SesionID extends Identity {
    public SesionID() {

    }

    private SesionID(String id) {
        super(id);
    }

    public static SesionID of(String id) {
        return new SesionID(id);

    }
}
