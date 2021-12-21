package co.com.sofka.Generic;

import co.com.sofka.Personal.Values.PersonalID;
import co.com.sofka.domain.generic.Identity;

public class MaquinaID extends Identity {
    public MaquinaID() {

    }

    private MaquinaID(String id) {
        super(id);
    }

    public static MaquinaID of(String id) {
        return new MaquinaID(id);

    }
}
