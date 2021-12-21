package co.com.sofka.Personal.Commands;

import co.com.sofka.Entrenamiento.Values.EntrenamientoID;
import co.com.sofka.Personal.Values.PersonalID;
import co.com.sofka.domain.generic.Command;

public class CrearPersonal extends Command {
    private final PersonalID personalID;
    private final EntrenamientoID entrenamientoID;

    public CrearPersonal(PersonalID personalID, EntrenamientoID entrenamientoID) {
        this.personalID = personalID;
        this.entrenamientoID = entrenamientoID;
    }

    public PersonalID getPersonalID() {
        return personalID;
    }

    public EntrenamientoID getEntrenamientoID() {
        return entrenamientoID;
    }
}
