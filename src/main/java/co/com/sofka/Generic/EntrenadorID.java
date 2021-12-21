package co.com.sofka.Generic;

import co.com.sofka.Personal.Values.PersonalID;
import co.com.sofka.domain.generic.Identity;

public class EntrenadorID extends Identity {
    public EntrenadorID() {

    }

    private EntrenadorID(String id) {
        super(id);
    }

    public static EntrenadorID of(String id) {
        return new EntrenadorID(id);

    }
}
