package co.com.sofka.Personal.Values;

import co.com.sofka.domain.generic.Identity;

public class PersonalID extends Identity {
    public PersonalID() {

    }

    private PersonalID(String id) {
        super(id);
    }

    public static PersonalID of(String id) {
        return new PersonalID(id);

    }
}
