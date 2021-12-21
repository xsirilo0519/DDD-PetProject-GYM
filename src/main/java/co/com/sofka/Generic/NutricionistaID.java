package co.com.sofka.Generic;

import co.com.sofka.Personal.Values.PersonalID;
import co.com.sofka.domain.generic.Identity;

public class NutricionistaID extends Identity {
    public NutricionistaID() {

    }

    private NutricionistaID(String id) {
        super(id);
    }

    public static NutricionistaID of(String id) {
        return new NutricionistaID(id);

    }
}
