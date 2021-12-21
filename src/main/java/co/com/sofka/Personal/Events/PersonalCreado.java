package co.com.sofka.Personal.Events;

import co.com.sofka.Entrenamiento.Values.EntrenamientoID;
import co.com.sofka.domain.generic.DomainEvent;

public class PersonalCreado extends DomainEvent {
    private final EntrenamientoID entrenamientoID;

    public PersonalCreado(EntrenamientoID entrenamientoID) {
        super("sofka.personal.personalCreado");
        this.entrenamientoID = entrenamientoID;
    }

    public EntrenamientoID getEntrenamientoID() {
        return entrenamientoID;
    }
}
