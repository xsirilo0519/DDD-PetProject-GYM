package co.com.sofka.Generic;

import co.com.sofka.Personal.Values.PersonalID;
import co.com.sofka.domain.generic.Identity;

public class ElementoID extends Identity {
    public ElementoID() {

    }

    private ElementoID(String id) {
        super(id);
    }

    public static ElementoID of(String id) {
        return new ElementoID(id);

    }
}
