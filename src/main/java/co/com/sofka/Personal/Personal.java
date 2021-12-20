package co.com.sofka.Personal;

import co.com.sofka.Personal.Values.PersonalID;
import co.com.sofka.domain.generic.AggregateEvent;

public class Personal extends AggregateEvent<PersonalID> {
    public Personal(PersonalID personalID) {
        super(personalID);
    }
}
