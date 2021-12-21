package co.com.sofka.Herramienta.Values;

import co.com.sofka.Personal.Values.PersonalID;
import co.com.sofka.domain.generic.Identity;

public class HerramientaID extends Identity {
    public HerramientaID() {

    }

    private HerramientaID(String id) {
        super(id);
    }

    public static HerramientaID of(String id) {
        return new HerramientaID(id);

    }

}
